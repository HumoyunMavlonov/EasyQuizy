package uz.gita.quizappeasyquizy.mvp.main.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import java.util.ArrayList;

import uz.gita.quizappeasyquizy.R;
import uz.gita.quizappeasyquizy.data.Questions;
import uz.gita.quizappeasyquizy.mvp.answeer.AnswerActivity15;

public class TestActivity15 extends AppCompatActivity implements TestContract.View{
     AppCompatTextView question;

     ArrayList<LinearLayoutCompat> variants = new ArrayList<>();
     AppCompatButton nextbutton;
     AppCompatButton skipbutton;
    TextView current ;
    TextView total ;
    int totalQues = 15;
    int count15=1;
    TextView off2;
     TestContract.Presenter presenter;
     View selectedView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        init();
        onClick();
        presenter=new TestPresenter(this);
        presenter.showQuestionsForView15();
    }

    private void init(){
        question=findViewById(R.id.tv_ques);
        nextbutton=findViewById(R.id.btn_next);
variants.add(findViewById(R.id.variant1));
variants.add(findViewById(R.id.variant2));
variants.add(findViewById(R.id.variant3));
variants.add(findViewById(R.id.variant4));
        current = findViewById(R.id.progress);
        total = findViewById(R.id.progresstotal);
        off2 = findViewById(R.id.of2);
        current.setText(String.valueOf(count15));
        off2.setText("/");
        total.setText(String.valueOf(totalQues));
}

    private void onClick(){
        nextbutton.setOnClickListener(v -> {
            count15++;
            current.setText(String.valueOf(count15));
            setVisiblity(((LinearLayoutCompat) selectedView).getChildAt(2) , View.INVISIBLE);
            setDrawable(selectedView , R.drawable.bg_variant);
            nextbutton.setEnabled(false);

            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) selectedView;
            presenter.checkUserAnswer(((AppCompatTextView)linearLayoutCompat.getChildAt(0)).getText().toString());
            selectedView=null;

            presenter.showQuestionsForView15();
        });
        variants.forEach(v -> { v.setOnClickListener(view -> {
            if (selectedView == null) {
                nextbutton.setEnabled(true);
                setVisiblity(((LinearLayoutCompat)view).getChildAt(2) , View.VISIBLE);
                setDrawable(view , R.drawable.bg_selected_btn);
                selectedView = view ;
            }else {
                setVisiblity(((LinearLayoutCompat)selectedView).getChildAt(2) , View.INVISIBLE);
                setDrawable(selectedView , R.drawable.bg_variant) ;
                setVisiblity(((LinearLayoutCompat)view).getChildAt(2) , View.VISIBLE);
                setDrawable(view , R.drawable.bg_selected_btn) ;
                selectedView = view ;
            }
        });
        });

    }

    @Override
    public void showView(Questions questions) {
       question.setText(questions.getQuestion());
        ((AppCompatTextView)variants.get(0).getChildAt(0)).setText(questions.getVariant1());
        ((AppCompatTextView)variants.get(1).getChildAt(0)).setText(questions.getVariant2());
        ((AppCompatTextView)variants.get(2).getChildAt(0)).setText(questions.getVariant3());
        ((AppCompatTextView)variants.get(3).getChildAt(0)).setText(questions.getVariant4());

    }

    @Override
    public void changeActivity(int correctAnswer, int wrongAnswer) {
        Intent intent = new Intent(this , AnswerActivity15.class) ;
        Bundle bundle = new Bundle() ;
        bundle.putInt("correctAnswer15" , correctAnswer);
        intent.putExtra("correctAnswer15" , bundle) ;
        startActivity(intent);
        finish();
    }

    private void setVisiblity(View view, int visible){
        view.setVisibility(visible);
}
private  void setDrawable(View view, int drawable){
        view.setBackgroundResource(drawable);
}
}


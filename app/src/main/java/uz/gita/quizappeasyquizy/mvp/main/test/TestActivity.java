package uz.gita.quizappeasyquizy.mvp.main.test;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import java.util.ArrayList;

import uz.gita.quizappeasyquizy.R;
import uz.gita.quizappeasyquizy.data.Questions;
import uz.gita.quizappeasyquizy.mvp.answeer.AnswerActivity;

public class TestActivity extends AppCompatActivity implements TestContract.View {
    private AppCompatTextView question;
    private ArrayList<LinearLayoutCompat> variants = new ArrayList<>();
    private AppCompatButton nextButton;
    private TestContract.Presenter presenter;
    private View selectedView;
    TextView current ;
    TextView total ;
    int count5=1;
    TextView off2;
    private ProgressBar progressBar;
    private int totalQuestions=5;
    private int currentQuestion = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        init();
        onClick();
        presenter = new TestPresenter(this);
        presenter.showQuestionsForView();
    }

    private void init() {
        question = findViewById(R.id.tv_ques);
        nextButton = findViewById(R.id.btn_next);
        variants.add(findViewById(R.id.variant1));
        variants.add(findViewById(R.id.variant2));
        variants.add(findViewById(R.id.variant3));
        variants.add(findViewById(R.id.variant4));

        current = findViewById(R.id.progress);
        total = findViewById(R.id.progresstotal);
        off2 = findViewById(R.id.of2);
        current.setText(String.valueOf(count5));
        off2.setText("/");
        total.setText(String.valueOf(totalQuestions));

    }

    private void onClick() {
        nextButton.setOnClickListener(v -> {
            count5++;
            current.setText(String.valueOf(count5));
            setVisibility(((LinearLayoutCompat) selectedView).getChildAt(2), View.INVISIBLE);
            setDrawable(selectedView, R.drawable.bg_variant);
            nextButton.setEnabled(false);
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) selectedView;
            presenter.checkUserAnswer(((AppCompatTextView) linearLayoutCompat.getChildAt(0)).getText().toString());
            selectedView = null;

            presenter.showQuestionsForView();
        });


        variants.forEach(v -> {
            v.setOnClickListener(view -> {
                if (selectedView == null) {
                    nextButton.setEnabled(true);
                    setVisibility(((LinearLayoutCompat) view).getChildAt(2), View.VISIBLE);
                    setDrawable(view, R.drawable.bg_selected_btn);
                    selectedView = view;
                } else {
                    setVisibility(((LinearLayoutCompat) selectedView).getChildAt(2), View.INVISIBLE);
                    setDrawable(selectedView, R.drawable.bg_variant);
                    setVisibility(((LinearLayoutCompat) view).getChildAt(2), View.VISIBLE);
                    setDrawable(view, R.drawable.bg_selected_btn);
                    selectedView = view;
                }
            });
        });
    }

    @Override
    public void showView(Questions questions) {
        question.setText(questions.getQuestion());
        ((AppCompatTextView) variants.get(0).getChildAt(0)).setText(questions.getVariant1());
        ((AppCompatTextView) variants.get(1).getChildAt(0)).setText(questions.getVariant2());
        ((AppCompatTextView) variants.get(2).getChildAt(0)).setText(questions.getVariant3());
        ((AppCompatTextView) variants.get(3).getChildAt(0)).setText(questions.getVariant4());
        currentQuestion++;
    }

    @Override
    public void changeActivity(int correctAnswer, int wrongAnswer) {
        Intent intent = new Intent(this, AnswerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("correctAnswer", correctAnswer);
        intent.putExtra("correctAnswer", bundle);
        startActivity(intent);
        Log.d("TTT", "changeActivity: start");
        finish();
    }

    private void setVisibility(View view, int visibility) {
        view.setVisibility(visibility);
    }

    private void setDrawable(View view, int drawable) {
        view.setBackgroundResource(drawable);
    }


}

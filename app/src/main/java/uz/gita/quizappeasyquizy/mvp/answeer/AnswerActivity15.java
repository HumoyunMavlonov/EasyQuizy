package uz.gita.quizappeasyquizy.mvp.answeer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.quizappeasyquizy.R;
import uz.gita.quizappeasyquizy.mvp.main.test.MainActivity2;
import uz.gita.quizappeasyquizy.mvp.main.test.TestActivity15;

public class AnswerActivity15 extends AppCompatActivity {
    int correctAnswer ;
    TextView answer ;
    AppCompatButton btnRestart ;
    AppCompatButton btnMenu;
    TextView answertotal15 ;
    TextView off15;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antivity_answer);

        Bundle bundle = getIntent().getBundleExtra("correctAnswer15") ;
        assert bundle != null;
        correctAnswer = bundle.getInt("correctAnswer15") ;
        answer = findViewById(R.id.tv_answer) ;
        answertotal15 = findViewById(R.id.tv_answertotal);
        off15=findViewById(R.id.offf);

        answer.setText(String.valueOf(correctAnswer));
        answertotal15.setText(String.valueOf("15"));
        off15.setText(String.valueOf("/"));
        answer.setText(String.valueOf(correctAnswer));
        btnRestart = findViewById(R.id.btn_restart);
        btnMenu=findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        btnRestart.setOnClickListener(v -> {
           Intent intent =new Intent(this , TestActivity15.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });


    }
}

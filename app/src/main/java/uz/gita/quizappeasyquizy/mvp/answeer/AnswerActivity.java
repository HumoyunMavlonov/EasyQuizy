package uz.gita.quizappeasyquizy.mvp.answeer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.quizappeasyquizy.R;
import uz.gita.quizappeasyquizy.mvp.main.test.MainActivity2;
import uz.gita.quizappeasyquizy.mvp.main.test.TestActivity;

public class AnswerActivity extends AppCompatActivity {
    int correctAnswer ;
    TextView answer ;
    AppCompatButton btnRestart ;
    AppCompatButton btnMenu;
    TextView answertotal5 ;
    TextView off5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antivity_answer);


        Bundle bundle = getIntent().getBundleExtra("correctAnswer") ;
        correctAnswer = bundle.getInt("correctAnswer") ;
        answer = findViewById(R.id.tv_answer) ;
        answertotal5 = findViewById(R.id.tv_answertotal);
        off5=findViewById(R.id.offf);

        answer.setText(String.valueOf(correctAnswer));
        answertotal5.setText(String.valueOf("5"));
        off5.setText(String.valueOf("/"));
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
            startActivity(new Intent(this , TestActivity.class));
            finish();
        });
    }
}

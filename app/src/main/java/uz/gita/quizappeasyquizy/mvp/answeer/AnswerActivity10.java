package uz.gita.quizappeasyquizy.mvp.answeer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.quizappeasyquizy.R;
import uz.gita.quizappeasyquizy.mvp.main.test.MainActivity2;
import uz.gita.quizappeasyquizy.mvp.main.test.TestActivity10;

public class AnswerActivity10 extends AppCompatActivity {
    int correctAnswer10 ;
    TextView answer ;
    TextView answertotal ;
    TextView off;
    AppCompatButton btnRestart ;
    AppCompatButton btnMenu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antivity_answer);

        Bundle bundle = getIntent().getBundleExtra("correctAnswer10") ;
        correctAnswer10 = bundle.getInt("correctAnswer10") ;
        answer = findViewById(R.id.tv_answer) ;
        off=findViewById(R.id.offf);
        answertotal = findViewById(R.id.tv_answertotal) ;
        answer.setText(String.valueOf(correctAnswer10));
        answertotal.setText(String.valueOf("10"));
        off.setText(String.valueOf("/"));

        btnRestart = findViewById(R.id.btn_restart);
        btnMenu=findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
        btnRestart.setOnClickListener(v -> {
            Intent intent = new Intent(this , TestActivity10.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}

package uz.gita.quizappeasyquizy.mvp.main.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.quizappeasyquizy.R;

public class LevelActivity  extends AppCompatActivity {

    AppCompatButton easyButton;
    AppCompatButton mediumButton;
    AppCompatButton hardButton;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        easyButton = findViewById(R.id.easy);
        mediumButton=findViewById(R.id.medium);
        hardButton=findViewById(R.id.hard);



        easyButton.setOnClickListener(v -> {
            startActivity(new Intent(this, TestActivity.class));
            finish();
        });
        mediumButton.setOnClickListener(v -> {
            startActivity(new Intent(this, TestActivity10.class));
            finish();
        });
        hardButton.setOnClickListener(v -> {
            startActivity(new Intent(this, TestActivity15.class));
            finish();
        });

    }
}

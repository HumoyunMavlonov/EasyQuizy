package uz.gita.quizappeasyquizy.mvp.main.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.quizappeasyquizy.R;

public class MainActivity2 extends AppCompatActivity {

    AppCompatButton playButton;
    AppCompatButton about;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        playButton = findViewById(R.id.playbtn);

        about = findViewById(R.id.aboutbtn);

        playButton.setOnClickListener(v -> {
            startActivity(new Intent(this, LevelActivity.class));
        });
        about.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity2.this, AboutActivity.class));

        });
    }
}

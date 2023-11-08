package uz.gita.quizappeasyquizy.mvp.main.test;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quizappeasyquizy.R;

public class AboutActivity extends AppCompatActivity {

    private ImageView backbtnn;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_quiz);

        backbtnn=findViewById(R.id.backbtn);

        backbtnn.setOnClickListener(v->{
            finish();
        });
    }
}

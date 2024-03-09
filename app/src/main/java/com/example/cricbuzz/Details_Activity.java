package com.example.cricbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity
{
    ImageView imageView;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt1=findViewById(R.id.p_txt1);
        txt2=findViewById(R.id.p_txt2);
        imageView=findViewById(R.id.profile_image);

            int i = getIntent().getIntExtra("pos", 0);
            int image[] = getIntent().getIntArrayExtra("image");
            String title[] = getIntent().getStringArrayExtra("title");
            String subTitle[] = getIntent().getStringArrayExtra("subTitle");

            imageView.setImageResource(image[i]);
            txt1.setText("" + title[i]);
            txt2.setText("" + subTitle[i]);

    }
}
package com.example.cricbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class listview_activity extends AppCompatActivity {

    ListView listView;

    String title[] = {"Hardik Pandya ", "SuryakumarYadav", "Ishan Kishan", "Shubman Gill", "Deepak Hooda", "Sanju Samson",
            "Yuzi Chahal", "Arshdeep Singh", "Harshal Patel", "Shreyas Iyer", "Virat Kohli", "Jasprit Bumrah",
            "Rohit Sharma", "Axar Patel", "Mohammed Shami", "Washington Sundar", "Sachin Tendulkar", "MS Dhoni"};

    String[] subtitle = {"All-rounder", "Batter", "Wicket Keeper", "All-rounder", "Batter", "Wicket Keeper",
            "Bowler", "All-rounder", "Bowler", "Batter", "Middle Order Batter", "Bowler",
            "Batter", "All-rounder", "Bowler", "All-rounder", "Batter", "Wicket Keeper"};


    int imagearr[] = {R.drawable.img_2, R.drawable.img_3, R.drawable.img_4, R.drawable.img_5, R.drawable.img_6, R.drawable.img_7,
            R.drawable.img_8, R.drawable.img_9, R.drawable.img_10, R.drawable.img_11, R.drawable.img_12, R.drawable.img_13,
            R.drawable.img_14, R.drawable.img_15, R.drawable.img_16, R.drawable.img_17, R.drawable.img_18, R.drawable.img_19};

    String title1[] = {"David Warner", "Aaron Finch", "Glenn Maxwell", "Marcus Stoinis", "Steven Smith", "Usman Khawaja",
            "Adam Zampa", "Alex Carey", "Matthew Wade", "Mitchell Marsh", "Nathan Lyon", "Mitchell Starc"};

    String[] subtitle1 = {"Bowler", "Bowler", "Batter", "All Rounder", "Batsman", "Batsman",
            "Bowler", "Wicket Keeper", "Wicket Keeper", "All Rounder", "Bowler", "Bowler"};

    int imagearr1[] = {R.drawable.img_20, R.drawable.img_21, R.drawable.img_22, R.drawable.img_23, R.drawable.img_24, R.drawable.img_25,
            R.drawable.img_26, R.drawable.img_27, R.drawable.img_28, R.drawable.img_29, R.drawable.img_30, R.drawable.img_31};

    customadptr adapter;
    String team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listview);
        team = getIntent().getStringExtra("team");

        if (team.equals("ID")) {
            adapter = new customadptr(listview_activity.this, title, subtitle, imagearr);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(listview_activity.this, Details_Activity.class);
                    intent.putExtra("pos", i);
                    intent.putExtra("title", title);
                    intent.putExtra("subTitle", subtitle);
                    intent.putExtra("image", imagearr);
                    startActivity(intent);
                }
            });
        } else if (team.equals("AU")) {
            adapter = new customadptr(listview_activity.this, title1, subtitle1, imagearr1);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(listview_activity.this, Details_Activity.class);
                    intent.putExtra("pos", i);
                    intent.putExtra("title", title1);
                    intent.putExtra("subTitle", subtitle1);
                    intent.putExtra("image", imagearr1);
                    startActivity(intent);
                }
            });
        }
    }
}
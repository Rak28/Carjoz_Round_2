package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button food_btn, retail_btn, sports_btn, tra_btn, ent_btn,next_btn;
    private Boolean flag = Boolean.FALSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        food_btn = findViewById(R.id.food);
        next_btn = findViewById(R.id.next_btn);
////
//        food_btn.setBackground(getResources().getDrawable(R.drawable.inactive_btn));
//        food_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (flag == Boolean.FALSE) {
//                    food_btn.setBackground(getResources().getDrawable(R.drawable.clicked_btn));
//                    flag = Boolean.TRUE;
//                } else {
//                    food_btn.setBackground(getResources().getDrawable(R.drawable.inactive_btn));
//                    flag = Boolean.FALSE;
//                }
//            }
//        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BottomNavigation.class);
                startActivity(intent);

            }
        });

    }

    public void change(View view) {

        Log.i("Clicked", view.getId()+""+view.getTag()+" ");
        String tag = view.getTag().toString();
        if (tag.equals("0")) {
            view.setBackground(getResources().getDrawable(R.drawable.clicked_btn));
            view.setTag("1");
        } else if (tag.equals("1")) {
            view.setBackground(getResources().getDrawable(R.drawable.inactive_btn));
            view.setTag("0");
        }
    }
}
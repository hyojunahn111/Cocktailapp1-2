package com.example.cocktailapp1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CocktailExplanation extends AppCompatActivity {
    private Intent intent;
    private int number;
    private String title;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_explanation);

        intent = getIntent();
        number = intent.getIntExtra("number", -1);
        title = intent.getStringExtra("title");

        imageView = findViewById(R.id.aa);
        textView = findViewById(R.id.aa);

        switch (number)
        {
            case 0:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("eee \n");
                textView.append("eee\n");
                textView.append("eee \n");
                break;

            case 1:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("eee\n");
                textView.append("eee\n");
                textView.append("eee \n");
                break;

            case 2:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("qqq\n");
                textView.append("qqq\n");
                textView.append("qqq\n");
                break;

            case 3:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("123 \n");
                textView.append("123\n");
                textView.append("123 \n");
                break;

            case 4:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("222 \n");
                textView.append("222\n");
                textView.append("222 \n");
                break;

            case 5:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("333 \n");
                textView.append("333\n");
                textView.append("333 \n");
                break;

            case 6:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("444\n");
                textView.append("444\n");
                textView.append("444 \n");
                break;

            case 7:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("555 \n");
                textView.append("555\n");
                textView.append("555 \n");
                break;

            case 8:
                imageView.setImageResource(R.drawable.common_full_open_on_phone);
                textView.setText(title);
                textView.append("\n");
                textView.append("666 \n");
                textView.append("666\n");
                textView.append("666 \n");
                break;
        }
    }
}
package com.example.cocktailapp1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CocktailList extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mRecyclerAdapter;
    private ArrayList<CocktailData> mCocktailData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mRecyclerAdapter = new RecyclerViewAdapter();

        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        mCocktailData = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                mCocktailData.add(new CocktailData(R.drawable.common_full_open_on_phone, i + "번째 칵테일", i + "번째 팁"));
            else
                mCocktailData.add(new CocktailData(R.drawable.common_full_open_on_phone, i + "번째 칵테일", i + "번째 팁"));

        }
        mRecyclerAdapter.setCocktailList(mCocktailData);
    }
}
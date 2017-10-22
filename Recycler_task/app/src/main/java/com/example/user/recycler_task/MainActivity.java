package com.example.user.recycler_task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mContactRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        mContactRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        InfoAdapter infoAdapter = new InfoAdapter(this, getInfo());


        mContactRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));


        mContactRecyclerView.setAdapter(infoAdapter);


    }

    public ArrayList<String> getInfo() {
        ArrayList<String> infos = new ArrayList<>();


        infos.add("Nishad");
        infos.add("nishads52@gmail.com");
        infos.add("9400287995");
        infos.add("9405");
        return infos;
}
}

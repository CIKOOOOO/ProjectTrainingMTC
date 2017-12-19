package com.example.abedc.projektraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    ItemAdapter adapter;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.btnAdd_MainAcitivity);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AddActivity.class));
            }
        });
        rv = (RecyclerView) findViewById(R.id.rv);
        setUp();
    }

    private void setUp(){
        List<String> name = new ArrayList<>();
        List<String> desc = new ArrayList<>();
        List<String> link = new ArrayList<>();
        List<String> creator = new ArrayList<>();

        DetailApps detailApps = new DetailApps();
        for (int i = 0; i < detailApps.counter; i++) {
            name.add(detailApps.name[i]);
            desc.add(detailApps.desc[i]);
            link.add(detailApps.link[i]);
            creator.add(detailApps.creator[i]);
        }

        adapter = new ItemAdapter(name, desc,link,creator, MainActivity.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

}

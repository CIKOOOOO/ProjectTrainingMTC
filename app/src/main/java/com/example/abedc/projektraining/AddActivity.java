package com.example.abedc.projektraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText title;
    EditText link;
    EditText desc;
    EditText creator;
    Button publish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        init();
        publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                DetailApps detailApps = new DetailApps();
//                detailApps.name[detailApps.counter] = title.getText().toString();
//                detailApps.desc [detailApps.counter]= desc.getText().toString();
//                detailApps.creator[detailApps.counter] = creator.getText().toString();
//                detailApps.link[detailApps.counter] = link.getText().toString();
//                detailApps.counter++;

                MainActivity.appList.add(new AppModel("name", "desc", "link", "creator"));

                startActivity(new Intent(AddActivity.this,MainActivity.class));
            }
        });

    }

    public void init(){
        title = (EditText) findViewById(R.id.etInputTittle_AddActivity);
        link = (EditText) findViewById(R.id.etInputLink_AddActivity);
        desc = (EditText) findViewById(R.id.etInputDescription_AddActivity);
        creator = (EditText) findViewById(R.id.etInputCreator_AddActivity);
        publish = (Button) findViewById(R.id.btnPublis_AddActivity);
    }
}

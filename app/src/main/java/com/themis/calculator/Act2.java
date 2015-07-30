package com.themis.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class Act2 extends Activity implements  AdapterView.OnItemSelectedListener {

    Spinner sp;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        sp = (Spinner) findViewById(R.id.spin);
        tv = (TextView) findViewById(R.id.tv);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.operators, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
        sp.setSelection(4);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Intent act3int = new Intent(this, Act3.class);
        Bundle bu = getIntent().getExtras();
        int index = adapterView.getSelectedItemPosition();
        switch (index) {
            case 0:
                bu.putInt("op", 1);
                break;
            case 1:
                bu.putInt("op", 2);
                break;
            case 2:
                bu.putInt("op", 3);
                break;
            case 3:
                bu.putInt("op", 4);
                break;
            case 4:
                tv.setText("");
                break;
        }
        if(index!=4) {
            act3int.putExtras(bu);
            startActivityForResult(act3int, 1);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                tv.setText(String.valueOf(data.getIntExtra("result",0)));
            }
        }
    }
}


package com.themis.calculator;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Act1 extends Activity implements View.OnClickListener {

    EditText fnum;
    EditText snum;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        fnum = (EditText) findViewById(R.id.fnum);
        snum = (EditText) findViewById(R.id.snum);
        calc = (Button) findViewById(R.id.calc);
        calc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == calc){
            Intent act2int = new Intent(this,Act2.class);
            Bundle bu = new Bundle();
            bu.putInt("first",Integer.parseInt(fnum.getText().toString()));
            bu.putInt("second",Integer.parseInt(snum.getText().toString()));
            act2int.putExtras(bu);
            startActivity(act2int);
        }
    }
}

package com.themis.calculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Act3 extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Intent ret = new Intent();
        Bundle bu = getIntent().getExtras();
        int first = bu.getInt("first");
        int second = bu.getInt("second");
        int oper = bu.getInt("op");
         if(oper==1){
                ret.putExtra("result",(first+second));
                setResult(RESULT_OK, ret);
                finish();
         }
         else if(oper==2){
             ret.putExtra("result",(first*second));
             setResult(RESULT_OK,ret);
             finish();
         }
        else if(oper==3){
             ret.putExtra("result",(first-second));
             setResult(RESULT_OK,ret);
             finish();
         }
        else if(oper==4){
             if(second!=0){
                 ret.putExtra("result", (first / second));
             }else {
                 ret.putExtra("result", 0);
             }
             setResult(RESULT_OK,ret);
             finish();
         }



    }
}

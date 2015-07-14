package com.example.yang.mycalculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private String express;
    private double answer;
    private TextView expArea;
    private TextView ansArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        express = "";
        answer = 0.0;
        expArea = (TextView)findViewById(R.id.expArea);
        ansArea = (TextView)findViewById(R.id.ansArea);

    }

    public void btnPressed(View view)
    {
        express += view.getTag().toString();

        expArea.setText(express);
    }
    public void backSpace(View view)
    {
        if (!express.equals(""))
            express = express.substring(0, express.length() - 2);
        expArea.setText(express);
    }
    public void computAction(View view)
    {

    }


}

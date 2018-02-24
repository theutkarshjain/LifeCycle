package com.example.uj.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String Tag,msg;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag="Utkarsh" , msg="Its oNcREATE....!!!!");
        System.out.println("Its oNcREATE.....!!!");
    }
    protected void onStart()
    {
        super.onStart();
        Log.i(Tag="Utkarsh" , msg="Its oNsTART....!!!!");
        System.out.println("Its oNsTART.....!!!");
    }
    protected void onResume()
    {
        super.onResume();
        Log.i(Tag="Utkarsh" , msg="Its oNrESUME....!!!!");
        System.out.println("Its oNrESUME.....!!!");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.i(Tag="Utkarsh" , msg="Its oNrESTART....!!!!");
        System.out.println("Its oNrESTART.....!!!");
    }
    protected void onPause()
    {
        super.onPause();
        Log.i(Tag="Utkarsh" , msg="Its oNpAUSE....!!!!");
        System.out.println("Its oNpAUSE.....!!!");
    }
    protected void onStop()
    {
        super.onStop();
        Log.i(Tag="Utkarsh" , msg="Its oNsTOP....!!!!");
        System.out.println("Its oNsTOP.....!!!");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(Tag="Utkarsh" , msg="Its oNdESTROY....!!!!");
        System.out.println("Its oNdESTROY.....!!!");
    }

}

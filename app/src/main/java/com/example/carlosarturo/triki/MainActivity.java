package com.example.carlosarturo.triki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final static String BTN_1="1.1";
    private final static String BTN_2="1.2";
    private final static String BTN_3="1.3";
    private final static String BTN_4="1.4";
    private final static String BTN_5="1.5";
    private final static String BTN_6="1.6";
    private final static String BTN_7="1.7";
    private final static String BTN_8="1.8";
    private final static String BTN_9="1.9";

    private String tablero [][]= new String[2][2];
    private String jugador1[][]= new String[2][2];
    private String jugador2 [][]= new String [2][2];







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btn_1=
        //btn_1.setOnClickListener(this);
        //Button btn_2=
        //btn_2.setOnClickListener(this);
        //Button btn_3=
        //btn_3.setOnClickListener(this);
        //Button btn_4=
        //btn_4.setOnClickListener(this);
        //Button btn_5=
        //btn_5.setOnClickListener(this);
        //Button btn_6=
        //btn_6.setOnClickListener(this);
        //Button btn_7=
        //btn_7.setOnClickListener(this);
        //Button btn_8=
        //btn_8.setOnClickListener(this);
        //Button btn_9=
        //btn_9.setOnClickListener(this);
        tablero[0][0]= BTN_1;
        tablero[0][1]= BTN_2;
        tablero[0][2]= BTN_3;
        tablero[1][0]= BTN_4;
        tablero[1][1]= BTN_5;
        tablero[1][2]= BTN_6;
        tablero[2][0]= BTN_7;
        tablero[2][1]= BTN_8;
        tablero[2][2]= BTN_9;

    }

    private void insertarJugador1 (String pos){

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(pos.equals(tablero[i][j])){
                    jugador1[i][j]=pos;

                }


            }
        }



    }

    private void insertarJugador2 (String pos){

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(pos.equals(tablero[i][j])){
                    jugador2[i][j]=pos;

                }


            }
        }



    }


    private boolean ganador(String jug [][]){
        boolean gana=false;

        if(jug[0][0]!=null&&jug[0][1]!=null&&jug[0][2]!=null){
            gana=true;
        }

        else if(jug[1][0]!=null&&jug[1][1]!=null&&jug[1][2]!=null){
            gana=true;
        }

        else if(jug[2][0]!=null&&jug[2][1]!=null&&jug[2][2]!=null){
            gana=true;
        }

        else if(jug[0][0]!=null&&jug[1][1]!=null&&jug[2][2]!=null){
            gana=true;
        }

        else  if(jug[0][0]!=null&&jug[1][0]!=null&&jug[2][0]!=null){
            gana=true;
        }
        else if(jug[0][2]!=null&&jug[1][2]!=null&&jug[2][2]!=null){
            gana=true;
        }
        return gana;

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {

        int numero= v.getId();


    }



}

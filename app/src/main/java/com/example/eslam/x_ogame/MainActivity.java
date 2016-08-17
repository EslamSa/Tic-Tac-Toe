package com.example.eslam.x_ogame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    String b1Value = "a", b2Value = "s", b3Value = "d", b4Value = "c", b5Value = "n", b6Value = "h",
            b7Value = "i", b8Value = "p", b9Value = "q",
            msg = null;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void onClickBut1(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s1);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b1Value = button.getText().toString();
        if(Wins()==true)
            reset();    }

    public void onClickBut2(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s2);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b2Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut3(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s3);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b3Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut4(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s4);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b4Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut5(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s5);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b5Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut6(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s6);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b6Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut7(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s7);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b7Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut8(View view) {
        counter++;
        Button button = (Button) findViewById(R.id.s8);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b8Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }

    public void onClickBut9(View view) {

        counter++;
        Button button = (Button) findViewById(R.id.s9);
        button.setEnabled(false);
        if (counter % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        b9Value = button.getText().toString();
        if(Wins()==true)
            reset();
    }


    public boolean Wins() {
        if (b1Value.equals(b2Value) && b1Value.equals(b3Value)) {
            msg = b1Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;
        } else if (b1Value.equals(b4Value) && b1Value.equals(b7Value)) {
            msg = b1Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b1Value.equals(b5Value) && b1Value.equals(b9Value)) {
            msg = b1Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b3Value.equals(b5Value) && b3Value.equals(b7Value)) {
            msg = b3Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b4Value.equals(b5Value) && b4Value.equals(b6Value)) {
            msg = b4Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b7Value.equals(b8Value) && b7Value.equals(b9Value)) {
            msg = b7Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b2Value.equals(b5Value) && b2Value.equals(b8Value)) {
            msg = b2Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;

        } else if (b3Value.equals(b6Value) && b3Value.equals(b9Value)) {
            msg = b3Value + " wins";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            return true;
        }

        else return false;
    }

    public void reset(){
        Button button1 = (Button) findViewById(R.id.s1);
        button1.setText(" ");
        Button button2 = (Button) findViewById(R.id.s2);
        button2.setText(" ");
        Button button3 = (Button) findViewById(R.id.s3);
        button3.setText(" ");
        Button button4 = (Button) findViewById(R.id.s4);
        button4.setText(" ");
        Button button5 = (Button) findViewById(R.id.s5);
        button5.setText(" ");
        Button button6 = (Button) findViewById(R.id.s6);
        button6.setText(" ");
        Button button7 = (Button) findViewById(R.id.s7);
        button7.setText(" ");
        Button button8 = (Button) findViewById(R.id.s8);
        button8.setText(" ");
        Button button9 = (Button) findViewById(R.id.s9);
        button9.setText(" ");
    }

}


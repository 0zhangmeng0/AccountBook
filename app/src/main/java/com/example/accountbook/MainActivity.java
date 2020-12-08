package com.example.accountbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void to_aboutus(View view) {
        Intent to_aboutus = new Intent(MainActivity.this,AboutUsActivity.class);
        this.startActivity(to_aboutus);
    }

    public void to_help_feedback(View view) {
        Intent to_helpfeedback = new Intent(MainActivity.this,HelpFeedbackActivity.class);
        this.startActivity(to_helpfeedback);
    }

    public void to_inoutcame(View view) {
        Intent to_inoutcame = new Intent(MainActivity.this,InOutcomeActivity.class);
        this.startActivity(to_inoutcame);
    }

    public void to_accout(View view) {
        Intent to_accout = new Intent(MainActivity.this,AccoutActivity.class);
        this.startActivity(to_accout);
    }
}

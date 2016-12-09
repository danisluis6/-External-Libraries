package com.example.enclaveit.tutorials.aboutintent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.enclaveit.tutorials.R;

public class Level3Activity extends Activity {

    private Intent intent;
    private final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configures();
        setContentView(R.layout.activity_level3);
        getExtrasMessage();
    }

    protected void configures(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected void getExtrasMessage(){
        Bundle bundle = this.getIntent().getExtras();
        Toast.makeText(context.getApplicationContext(),String.valueOf(bundle.getString("message")),Toast.LENGTH_LONG).show();
    }
}

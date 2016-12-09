package com.example.enclaveit.tutorials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.enclaveit.tutorials.aboutintent.Level3Activity;

public class Main1Activity extends Activity {

    private Button btn;
    private EditText edt;

    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configurates();
        setContentView(R.layout.activity_main1);

        /**
         * Create a funtion to definition infromation
         */
        initcomponets();

        /**
         * We want to add event listener inside onCreate, but we use button
         */
        addListenerOnButton();
    }

    protected void configurates(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected void initcomponets(){
        btn = (Button)findViewById(R.id.chat);
        edt = (EditText)findViewById(R.id.message);
    }

    protected void addListenerOnButton(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),Level3Activity.class);
                inputMessage(intent);
                startActivity(intent);
            }
        });
    }

    protected void inputMessage(Intent intent){
        Bundle extras = intent.getExtras();
        extras.putString("message",String.valueOf(edt.getText()));
        Log.d("message",String.valueOf(edt.getText()));
    }
}

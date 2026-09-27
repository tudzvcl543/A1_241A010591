package com.example.a1_241a010591;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "A1_241A010591";

    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        Button error=findViewById(R.id.btnError);
        Button exit=findViewById(R.id.btnExit);
        Button clear=findViewById(R.id.btnClear);

        error.setOnClickListener(v -> {
            throw new RuntimeException("Test error A1");
        });

        exit.setOnClickListener(v -> finish());

        clear.setOnClickListener(v -> Log.d(TAG,"Clear log requested"));
    }

    protected void onStart(){super.onStart(); Log.d(TAG,"onStart");}
    protected void onResume(){super.onResume(); Log.d(TAG,"onResume");}
    protected void onPause(){super.onPause(); Log.d(TAG,"onPause");}
    protected void onStop(){super.onStop(); Log.d(TAG,"onStop");}
    protected void onRestart(){super.onRestart(); Log.d(TAG,"onRestart");}
    protected void onDestroy(){super.onDestroy(); Log.d(TAG,"onDestroy");}

    protected void onSaveInstanceState(Bundle out){
        super.onSaveInstanceState(out);
        Log.d(TAG,"onSaveInstanceState");
    }
}

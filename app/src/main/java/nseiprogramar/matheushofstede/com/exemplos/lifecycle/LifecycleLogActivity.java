package nseiprogramar.matheushofstede.com.exemplos.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import nseiprogramar.matheushofstede.com.exemplos.R;

public class LifecycleLogActivity extends AppCompatActivity {

    TextView log;
    String logtext = "";
    String TAG = "LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // colocar um aviso que o método foi chamado, assim que ele foi iniciado
        logtext =logtext + "onCreate \n";
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_log);

        // declarar o textview e atualizar ele, assim que ele é carregado
        log = (TextView)findViewById(R.id.log);
        log.setText(logtext);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LifecycleLogActivity.this, NextActivity.class);
                startActivity(i);
                Snackbar.make(view, "Activity abriu", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        // adicionar o aviso e atualizar o TextView
        logtext =logtext + "onStart \n";
        Log.i(TAG, "onStart");
        log.setText(logtext);
    }
    @Override
    protected void onResume(){
        super.onResume();
        // adicionar o aviso e atualizar o TextView
        logtext =logtext + "onResume \n";
        Log.i(TAG, "onCreate");
        log.setText(logtext);
    }
    @Override
    protected void onPause(){
        super.onPause();
        // adicionar o aviso e atualizar o TextView
        logtext =logtext + "onPause \n";
        Log.i(TAG, "onPause");
        log.setText(logtext);
    }
    @Override
    protected void onStop(){
        super.onStop();
        // adicionar o aviso e atualizar o TextView
        logtext =logtext + "onStop \n";
        Log.i(TAG, "onStop");
        log.setText(logtext);
    }
    @Override
    protected void onDestroy(){
        // adicionar o aviso e atualizar o TextView
        logtext =logtext + "onDestroy \n";
        Log.i(TAG, "onDestroy");
        log.setText(logtext);
        super.onDestroy();
    }

}

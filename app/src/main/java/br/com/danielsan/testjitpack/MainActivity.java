package br.com.danielsan.testjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.danielsan.moduleone.Addition;
import br.com.danielsan.moduletwo.Subtraction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int a = 1, b = 2;
        Log.d("======", "onCreate: " + Addition.add(a, b));
        Log.d("======", "onCreate: " + Subtraction.sub(a, b));
    }

}

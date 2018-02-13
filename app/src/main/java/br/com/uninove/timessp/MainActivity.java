package br.com.uninove.timessp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirSantos(View view){
      Intent it = new Intent(this,SantosActivity.class);
        startActivity(it);
    }















    public void abrirPalmeiras(View view){
        Intent it = new Intent(this.getApplicationContext(),PalmeirasActivity.class);
        startActivity(it);
    }










    public void abrirActivityCorinthians(View view){
        Intent it = new Intent(this.getApplicationContext(),CorinthiansActivity.class);
        startActivity(it);
    }


}

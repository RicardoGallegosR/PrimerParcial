package com.example.traslaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Rotación extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.main);
        
        TextView tvl= (TextView) findViewByld(R.id.textol);
        tvl.setText("Animaciones: rotación");
        
        TextView tv= (TextView) findViewByld(R.id.texto);
        tv.setText("TEXTO GIRANDO");
        
        Animation td =
        AnimationUtils.loadAnimation(this,R.anim.rotación)
        
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        tv.startAnimation(td);
    }
}
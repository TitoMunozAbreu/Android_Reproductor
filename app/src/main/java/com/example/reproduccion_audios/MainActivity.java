package com.example.reproduccion_audios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSonidoPlayer;
    SoundPool soundPool;
    int sonidoReproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion grafica
        this.btnSonidoPlayer = findViewById(R.id.btnSp);
        //inicializar clases
        this.soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonidoReproduccion = soundPool.load(this, R.raw.s_corto,1);

    }

    public void AudioSoundPool(View view){
        soundPool.play(sonidoReproduccion,1,1,1,0,0);
    }

    public void AudioMediaPlayer(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.s_largo);
        mp.start();
    }
}
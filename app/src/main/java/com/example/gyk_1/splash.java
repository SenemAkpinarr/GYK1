package com.example.gyk_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
//splash activity, uygulama açılınca ilk gelecek olan activity 2 3 saniye görülüp ana ekrana yönlendirme yapıcak
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                //activity i yönlendirme, this activityden main activity e yönelndiriyor.
                startActivity(intent);
                finish(); // 2 3 saniyeden sonra bu activity i bir daha kullanmayacağımızdan yok ediyoruz.

            }
        };
        handler.postDelayed(runnable, 1500);


    }
    }


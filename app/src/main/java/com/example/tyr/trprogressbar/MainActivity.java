package com.example.tyr.trprogressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TRProgressBar trProgressBar ;
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            int pro = trProgressBar.getProgress();
            trProgressBar.setProgress(++pro);
            if (pro>=100){
                trProgressBar.setProgress(0);
            }
            handler.sendEmptyMessageDelayed(0,1000);
            return false;
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trProgressBar = (TRProgressBar)findViewById(R.id.pr);
        handler.sendEmptyMessage(0);

    }
}

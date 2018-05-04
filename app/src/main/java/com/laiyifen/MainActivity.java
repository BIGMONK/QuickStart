package com.laiyifen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.laiyifen.base.BaseActivity;
import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text= (TextView) findViewById(R.id.name);
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        text.setText(channel);
        startActivity(new Intent(this,TestActivity.class));
        swipeBackLayout.setEnableGesture(false);
    }
}

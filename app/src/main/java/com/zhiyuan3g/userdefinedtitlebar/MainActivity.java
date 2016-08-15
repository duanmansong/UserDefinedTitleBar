package com.zhiyuan3g.userdefinedtitlebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.zhiyuan3g.userdefinedtitlebar.base.BaseActivity;
import com.zhiyuan3g.userdefinedtitlebar.base.BaseApplication;

public class MainActivity extends BaseActivity {
    private TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseApplication.getSelf().setMainActivity(this);
//        setContentView(R.layout.activity_main);
        setView(R.layout.activity_main,LAYOUT_TYPE_HEADER);
        setTitleText("主界面");
        tvShow = (TextView) findViewById(R.id.tvShow);
        tvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}

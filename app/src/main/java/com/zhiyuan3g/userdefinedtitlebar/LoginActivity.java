package com.zhiyuan3g.userdefinedtitlebar;

import android.os.Bundle;
import android.widget.Toast;

import com.zhiyuan3g.userdefinedtitlebar.base.BaseActivity;

/**
 * Created by Administrator on 2016/8/12.
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_login, LAYOUT_TYPE_HEADER);
        setTitleText("登录");
        Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
    }
}

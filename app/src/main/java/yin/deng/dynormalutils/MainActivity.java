package yin.deng.dynormalutils;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;

import yin.deng.normalutils.utils.DeviceIDUtil;
import yin.deng.normalutils.utils.ImageLoadUtil;
import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.SnackbarUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.iv_img);
        ImageLoadUtil.initOptions(this,R.mipmap.ic_default_star_img);
        ImageLoadUtil.loadImageThumb(tv,"http://a6vdapi.hzyyd.top/storage/img/2020-01-14/15-15-08-5e1d6a7ca4072.png");
    }

}

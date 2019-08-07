package yin.deng.dynormalutils;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import yin.deng.normalutils.utils.DeviceIDUtil;
import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.MyFileUtils;
import yin.deng.normalutils.utils.SnackbarUtils;
import yin.deng.normalutils.view.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.i("设备id："+DeviceIDUtil.getDeviceId());
        tv = (TextView) findViewById(R.id.tv);
        SnackbarUtils.ShortSnackbar(tv,"测试一下消息",SnackbarUtils.Warning).show();
    }

}

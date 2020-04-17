package yin.deng.dynormalutils;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;

import yin.deng.normalutils.utils.DataHolder;
import yin.deng.normalutils.utils.DeviceIDUtil;
import yin.deng.normalutils.utils.ImageLoadUtil;
import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.NoDoubleClickListener;
import yin.deng.normalutils.utils.SharedPreferenceUtil;
import yin.deng.normalutils.utils.SnackbarUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.iv_img);
        final SharedPreferenceUtil sharedPreferenceUtil=new SharedPreferenceUtil(this, "data1");
        sharedPreferenceUtil.saveString("tag", "s234424");
        DataHolder.getInstance().clearCache(this);
        ImageLoadUtil.initOptions(this,R.mipmap.ic_default_star_img);
        ImageLoadUtil.loadImageThumb(tv,"http://a6vdapi.hzyyd.top/storage/img/2020-01-14/15-15-08-5e1d6a7ca4072.png");
        TestInfo testInfo=new TestInfo();
        testInfo.setAge("22");
        testInfo.setName("测试");
        testInfo.setNowTime(1255621);
        testInfo.setSelf(true);
        testInfo.getLikes().add("篮球");
        testInfo.getLikes().add("羽毛球");
        testInfo.getMyLikes().add(new Likes());
        testInfo.getMyLikes().get(0).setLike(true);
        testInfo.getMyLikes().get(0).setName("哈哈哈哈");
        testInfo.getMyLikes().get(0).setType("特种部队");
        testInfo.getMyLikes().add(new Likes());
        testInfo.getMyLikes().get(1).setType("战斗民族");
//        DataHolder.getInstance().saveData(this,testInfo);
        tv.setOnClickListener(new NoDoubleClickListener(){
            @Override
            protected void onNoDoubleClick(View v) {
                TestInfo info=DataHolder.getInstance().getData(MainActivity.this, TestInfo.class);
                LogUtils.i("数据为："+info);
                String data=sharedPreferenceUtil.getStr("tag");
                LogUtils.i("此时获取到的数据为："+data);
            }
        });
    }

}

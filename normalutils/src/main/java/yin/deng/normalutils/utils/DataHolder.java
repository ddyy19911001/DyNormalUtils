package yin.deng.normalutils.utils;

import android.content.Context;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;

/**
 * 缓存数据的工具
 * 在app运行状态可以将数据存到内存中
 * app杀死后数据清空
 */
public class DataHolder {
    private static DataHolder dataHolder;
    private static Gson gson;
    private SharedPreferenceUtil sp;

    private DataHolder(){}
    public static DataHolder getInstance(){
        if(dataHolder==null){
            dataHolder=new DataHolder();
            gson=new Gson();
        }
        return dataHolder;
    }

    public static void clearCache(Context context){
        getInstance().getSp(context).clearAll();
    }

    public SharedPreferenceUtil getSp(Context context){
        if(sp==null) {
            sp = new SharedPreferenceUtil(context, context.getPackageName() + "_cacheData");
        }
        return sp;
    }

    public <T>void saveData(Context context, T obj){
        String data= gson.toJson(obj);
        LogUtils.i("写入的数据为："+data);
        getSp(context).saveString(obj.getClass().getSimpleName(), data);
    }

    public <T>T getData(Context context,Class clazz){
        String data = getSp(context).getStr(clazz.getSimpleName());
        LogUtils.i("得到的数据为："+data);
        T info= (T) gson.fromJson(data, clazz);
        return info;
    }
}

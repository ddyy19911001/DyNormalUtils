package yin.deng.normalutils.utils;

import java.util.HashMap;

/**
 * 缓存数据的工具
 * 在app运行状态可以将数据存到内存中
 * app杀死后数据清空
 */
public class DataHolder {
    private static DataHolder dataHolder;
    private HashMap<String,Object> datas=new HashMap<>();
    private DataHolder(){}
    public static DataHolder getInstance(){
        if(dataHolder==null){
            dataHolder=new DataHolder();
        }
        return dataHolder;
    }

    public void saveData(String tag,Object obj){
        datas.put(tag, obj);
    }

    public Object getData(String tag){
        return datas.get(tag);
    }
}

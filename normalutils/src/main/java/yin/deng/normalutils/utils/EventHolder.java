package yin.deng.normalutils.utils;

import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;

import java.util.HashMap;


public  class EventHolder extends Handler {
    private static EventHolder eventHolder;
    private HashMap<String,OnEventGetListener> onEventGetListeners=new HashMap<>();
    private EventHolder(){}
    public static EventHolder getInstance(){
        if(eventHolder==null){
            eventHolder=new EventHolder();
        }
        return eventHolder;
    }

    /**
     * 可直接掉用post发出消息，在接收处执行回调
     * @param tag
     * @param obj
     */
    public void post(int tag,Object obj){
        Message msg=Message.obtain();
        msg.obj=obj;
        msg.what=tag;
        sendMessage(msg);
    }

    /**
     * 设置监听的id便于后续remove这个监听
     * @param id
     * @param listener
     */
    public void setOnEventListener(String id,OnEventGetListener listener){
        this.onEventGetListeners.put(id,listener);
    }

    /**
     * remove掉这个监听
     * @param id
     */
    public void removeEventListener(String id){
        OnEventGetListener onEventGetListener=onEventGetListeners.get(id);
        if(onEventGetListener!=null){
            onEventGetListeners.remove(id);
        }
    }


    /**
     * remove掉所有的监听
     * @param
     */
    public void removeAllEventListener(){
        if(onEventGetListeners!=null&&onEventGetListeners.size()>0) {
            for (String key : onEventGetListeners.keySet()) {
                onEventGetListeners.remove(key);
            }
        }
    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        HashMap<String,OnEventGetListener> listenerHashMap=onEventGetListeners;
        if(listenerHashMap!=null&&listenerHashMap.size()>0){
            for(OnEventGetListener onEventGetListener:listenerHashMap.values()){
                onEventGetListener.onEventGetInBackGround(msg);
            }
        }
    }

    public interface OnEventGetListener{
        void onEventGetInBackGround(Message msg);
    }
}

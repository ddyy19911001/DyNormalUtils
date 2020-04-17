package yin.deng.dynormalutils;

import java.util.ArrayList;
import java.util.List;

public class TestInfo {
    private String name;
    private String age;
    private List<String> likes=new ArrayList<>();
    private List<Likes> myLikes=new ArrayList<>();
    private long nowTime;
    private boolean isSelf;

    @Override
    public String toString() {
        return "TestInfo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", likes=" + likes +
                ", myLikes=" + myLikes +
                ", nowTime=" + nowTime +
                ", isSelf=" + isSelf +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public List<Likes> getMyLikes() {
        return myLikes;
    }

    public void setMyLikes(List<Likes> myLikes) {
        this.myLikes = myLikes;
    }

    public long getNowTime() {
        return nowTime;
    }

    public void setNowTime(long nowTime) {
        this.nowTime = nowTime;
    }

    public boolean isSelf() {
        return isSelf;
    }

    public void setSelf(boolean self) {
        isSelf = self;
    }
}

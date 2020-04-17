package yin.deng.dynormalutils;

public class Likes {
    private String type;
    private String name;
    private boolean isLike;

    @Override
    public String toString() {
        return "Likes{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", isLike=" + isLike +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}

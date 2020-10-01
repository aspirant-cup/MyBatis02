package com.lyw.po;

/**
 * @outhor LiYouWei
 * @create 2020/10/1-8:50
 */
public class Json {
    private int id;
    private String name;
    private String sex;

    @Override
    public String toString() {
        return "Json{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Json() {
    }

    public Json(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Json(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}

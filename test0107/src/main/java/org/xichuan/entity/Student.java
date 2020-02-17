package org.xichuan.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 学生实体类
 * Created by ASUS on 2018/5/4
 */

@Component("Student")
public class Student {
    private String name;
    private  int age;
    private List<Float> likeNums;
    private Map<String,String> maps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Float> getLikeNums() {
        return likeNums;
    }

    public void setLikeNums(List<Float> likeNums) {
        this.likeNums = likeNums;
    }

    public Student() {
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likeNums=" + likeNums +
                ", maps=" + maps +
                '}';
    }
}

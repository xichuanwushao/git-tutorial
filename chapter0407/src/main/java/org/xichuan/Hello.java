package org.xichuan;

/**
 * Created by sang on 2018/7/13.
 */
public class Hello {
    public int age;
    public String address;
    public String sayHello(String name) {
        return "hello " + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

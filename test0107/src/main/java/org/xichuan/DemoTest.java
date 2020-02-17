package org.xichuan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.xichuan.entity.Grade;
import org.xichuan.entity.Student;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {
    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void getStudengXml(){
        Student student= (Student) applicationContext.getBean("student", Student.class);
        System.out.println(student);
        for(float num:student.getLikeNums()){
            System.out.println(num+"");
        }
        for (Map.Entry<String, String> entry : student.getMaps().entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

    @Test
    public void getGradeXml(){
        Grade grade= (Grade) applicationContext.getBean("banji", Grade.class);

        System.out.println(grade);
    }
}

package org.andios.antity;

import org.springframework.stereotype.Component;

/**
 * Created by ZheWenYang on 2019/1/26
 */

@Component("student")
public class Student {
    private int stuNum;
    private String stuName;
    private int stuAge;

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}

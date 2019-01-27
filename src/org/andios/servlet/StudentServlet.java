package org.andios.servlet;

import org.andios.antity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZheWenYang on 2019/1/26
 */
@WebServlet(name = "StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}

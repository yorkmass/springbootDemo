package com.yorkmass.demo.controller;

import com.yorkmass.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController  {
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","gyf");
        model.addAttribute("age",30);
        List<Student> stuList=new ArrayList<Student>();
        stuList.add(new Student("zhangsan","男",1000));
        stuList.add(new Student("wangwu","男",1001));
        stuList.add(new Student("lisi","男",1002));
        model.addAttribute("stuList",stuList);
        return "stu/list"; //找模板页面

    }
}

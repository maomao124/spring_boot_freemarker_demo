package mao.spring_boot_freemarker_demo;

import mao.spring_boot_freemarker_demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project name(项目名称)：spring_boot_freemarker_demo
 * Package(包名): mao.spring_boot_freemarker_demo
 * Class(类名): TestController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/1/29
 * Time(创建时间)： 19:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class TestController
{
    @RequestMapping("/test1")
    public String freemarker(Map<String, Object> map)
    {
        map.put("name", "张三");
        //返回模板文件名称
        return "test1";
    }

    @RequestMapping("/test2")
    public String freemarker2(Map<String, Object> map)
    {
        Student student1 = new Student();
        student1.setId(10001L);
        student1.setName("张三");
        student1.setSex("男");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(10002L);
        student2.setName("李四");
        student2.setSex("男");
        student2.setAge(19);

        Student student3 = new Student();
        student3.setId(10004L);
        student3.setName("王五");
        student3.setSex("女");
        student3.setAge(17);

        List<Student> list = new ArrayList<>(3);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        map.put("stus", list);

        //返回模板文件名称
        return "test2";
    }

    @RequestMapping("/test3")
    public String freemarker3(Map<String, Object> map)
    {
        Student student1 = new Student();
        student1.setId(10001L);
        student1.setName("张三");
        student1.setSex("男");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(10002L);
        student2.setName("李四");
        student2.setSex("男");
        student2.setAge(19);

        Student student3 = new Student();
        student3.setId(10004L);
        student3.setName("王五");
        student3.setSex("女");
        student3.setAge(17);

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("student1", student1);
        studentMap.put("student2", student2);
        studentMap.put("student3", student3);

        map.put("studentMap", studentMap);

        //返回模板文件名称
        return "test3";
    }

    @RequestMapping("/test4")
    public String freemarker4(Map<String, Object> map)
    {
        Student student1 = new Student();
        student1.setId(10001L);
        student1.setName("张三");
        student1.setSex("男");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(10002L);
        student2.setName("李四");
        student2.setSex("男");
        student2.setAge(19);

        Student student3 = new Student();
        student3.setId(10004L);
        student3.setName("王五");
        student3.setSex("女");
        student3.setAge(17);

        List<Student> list = new ArrayList<>(3);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        map.put("stus", list);

        //返回模板文件名称
        return "test4";
    }
}

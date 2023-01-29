package mao.spring_boot_freemarker_demo.entity;

/**
 * Project name(项目名称)：spring_boot_freemarker_demo
 * Package(包名): mao.spring_boot_freemarker_demo.entity
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/1/29
 * Time(创建时间)： 19:47
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    /**
     * id
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;


    /**
     * 学生
     */
    public Student()
    {

    }

    /**
     * 学生
     *
     * @param id   id
     * @param name 名字
     * @param sex  性别
     * @param age  年龄
     */
    public Student(Long id, String name, String sex, int age)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 得到id
     *
     * @return {@link Long}
     */
    public Long getId()
    {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * 得到名字
     *
     * @return {@link String}
     */
    public String getName()
    {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 得到性别
     *
     * @return {@link String}
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /**
     * 得到年龄
     *
     * @return int
     */
    public int getAge()
    {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        return stringbuilder.toString();
    }
}

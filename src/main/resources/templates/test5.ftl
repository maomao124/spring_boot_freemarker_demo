<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<#if stus??>

    <table>
        <tr>
            <td>序号</td>
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
        </tr>
        <#list stus as stu>
            <tr>
                <td <#if stu_index==2>style="color: hotpink" </#if>>${stu_index + 1}</td>
                <td>${stu.id}</td>
                <td<#if stu.name=='张三'> style="color: skyblue" </#if>>${stu.name}</td>
                <td>${stu.sex}</td>
                <td>${(stu.age)!}</td>
            </tr>
        </#list>
    </table>

</#if>

<#if !stus??>
    变量 stus 为null
</#if>

</body>
</html>

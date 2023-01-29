<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <td>序号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
    <#list studentMap?keys as k>
        <tr>
            <td>${k_index + 1}</td>
            <td>${studentMap[k].id}</td>
            <td>${studentMap[k].name}</td>
            <td>${studentMap[k].sex}</td>
            <td>${studentMap[k].age}</td>
        </tr>
    </#list>
</table>


${studentMap['student1'].name}
<br>
${studentMap.student2.name}

</body>
</html>

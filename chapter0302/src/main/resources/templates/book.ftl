<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html
        PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:th="http://www.thymeleaf.org" xml:lang="en" lang="en">
<head>
    <title>Title</title>
    <meta charset="utf-8"/>
    <title>图书列表</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>图书编号</td>
            <td>图书名称</td>
            <td>图书作者</td>
        </tr>
        <#if books ?? && (books?size>0)>
            <list books as book >
                <tr>
                    <td>${book.id}</td>
                    <td>${book.name}</td>
                    <td>${book.auther}</td>
                </tr>
            </list>
        </#if>
    </table>
</body>
</html>
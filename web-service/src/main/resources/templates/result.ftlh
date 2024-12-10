<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Результаты</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #4CAF50;
        }
        .fibonacci-numbers {
            font-size: 1.2em;
            margin: 10px 0;
        }
        .error {
            color: red;
        }
        a {
            display: inline-block;
            margin-top: 10px;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>

</head>
<body>
<div class="container">
    <h1>Первые ${n} чисел Фибоначчи:</h1>
    <div class="fibonacci-numbers">
        <#list fibonacciNumbers as number>
            ${number}<#if number_has_next>, </#if>
        </#list>
    </div>
    <#if error??>
        <p class="error">Error: ${error}</p>
    </#if>
    <a href="/">Назад</a>
</div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: igorfrolov
  Date: 04.11.16
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Gpu page</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>
<br/>
<br/>
<h1>GPU List</h1>
<c:if test="${!empty listGPU}">
    <table class="tg">
        <tr>
            <th width="80">id</th>
            <th width="120">Интерфейс</th>
            <th width="120">Видеочипсет</th>
            <th width="120">Частота графического процессора</th>
            <th width="120">Техпроцесс</th>
            <th width="120">Объем видеопамяти</th>
            <th width="120">Тип видеопамяти</th>
            <th width="120">Частота видеопамяти</th>
            <th width="120">Разрядность шины видеопамяти</th>
            <th width="120">Максимальное разрешение</th>
            <th width="120">Версия DirectX</th>
            <th width="120">Разъемы DVI</th>
            <th width="120">Разъемы HDMI</th>
            <th width="120">Версия разъемов HDMI</th>
        </tr>
        <c:forEach items="${listGPU}" var="gpu">
        <tr>
            <td>${gpu.id}</td>
            <td>${gpu.cardInterface}</td>
            <td>${gpu.chipset}</td>
            <td>${gpu.gpuFrequency}</td>
            <td>${gpu.technicalProcess}</td>
            <td>${gpu.memoryAmount}</td>
            <td>${gpu.memoryType}</td>
            <td>${gpu.memoryFrequency}</td>
            <td>${gpu.interfaceWidth}</td>
            <td>${gpu.maximumResolution}</td>
            <td>${gpu.directxVersion}</td>
            <td>${gpu.dviConnectors}</td>
            <td>${gpu.hdmiConnectors}</td>
            <td>${gpu.hdmiVersion}</td>
        </tr>
        </c:forEach>
        <tr>
            <th width="120">Разъемы Display Port</th>
            <th width="120">Версия разъемов Display Port</th>
            <th width="120">Разъемы питания</th>
            <th width="120">Рекомендуемая мощность БП</th>
            <th width="120">Максимальное энергопотребление</th>
            <th width="120">Длина видеокарты</th>
            <th width="120">Система охлаждения</th>
            <th width="120">Ширина видеокарты</th>
            <th width="120">Использование тепловых трубок</th>
            <th width="120">OverClock edition</th>
            <th width="120">Тип поставки</th>
            <th width="120">Гарантия</th>
            <th width="120">Сайт производителя</th>
            <th width="120">Страна производитель</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listGPU}" var="gpu">
            <tr>
                <td>${gpu.dpConnectors}</td>
                <td>${gpu.dpVersion}</td>
                <td>${gpu.powerSupply}</td>
                <td>${gpu.recPower}</td>
                <td>${gpu.powerConsum}</td>
                <td>${gpu.cardLength}</td>
                <td>${gpu.coolSys}</td>
                <td>${gpu.cardWidth}</td>
                <td>${gpu.heatPipes}</td>
                <td>${gpu.overClocked}</td>
                <td>${gpu.deliveryType}</td>
                <td>${gpu.warranty}</td>
                <td>${gpu.webSite}</td>
                <td>${gpu.originCountry}</td>
                <td><a href="<c:url value='/edit/${gpu.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${gpu.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Add a GPU</h1>
<c:url var="addAction" value="/gpus/add"/>
<form:form action="${addAction}" commandName="GPU">
    <table>
        <tr>
            <td>
                <form:label path="id">
                    <spring:message text="ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="cardInterface">
                    <spring:message text="Интерфейс"/>
                </form:label>
            </td>
            <td>
                <form:input path="cardInterface"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="chipset">
                    <spring:message text="Видеочипсет"/>
                </form:label>
            </td>
            <td>
                <form:input path="chipset"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="gpuFrequency">
                    <spring:message text="Частота графического процессора"/>
                </form:label>
            </td>
            <td>
                <form:input path="gpuFrequency"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="technicalProcess">
                    <spring:message text="Техпроцесс"/>
                </form:label>
            </td>
            <td>
                <form:input path="technicalProcess"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="memoryAmount">
                    <spring:message text="Объем видеопамяти"/>
                </form:label>
            </td>
            <td>
                <form:input path="memoryAmount"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="memoryType">
                    <spring:message text="Тип видеопамяти"/>
                </form:label>
            </td>
            <td>
                <form:input path="memoryType"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="memoryFrequency">
                    <spring:message text="Частота видеопамяти"/>
                </form:label>
            </td>
            <td>
                <form:input path="memoryFrequency"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="interfaceWidth">
                    <spring:message text="Разрядность шины видеопамяти"/>
                </form:label>
            </td>
            <td>
                <form:input path="interfaceWidth"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="maximumResolution">
                    <spring:message text="Максимальное разрешение"/>
                </form:label>
            </td>
            <td>
                <form:input path="maximumResolution"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="directxVersion">
                    <spring:message text="Версия DirectX"/>
                </form:label>
            </td>
            <td>
                <form:input path="directxVersion"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dviConnectors">
                    <spring:message text="Разъемы DVI"/>
                </form:label>
            </td>
            <td>
                <form:input path="dviConnectors"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="hdmiConnectors">
                    <spring:message text="Разъемы HDMI"/>
                </form:label>
            </td>
            <td>
                <form:input path="hdmiConnectors"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="hdmiVersion">
                    <spring:message text="Версия разъема"/>
                </form:label>
            </td>
            <td>
                <form:input path="hdmiVersion"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dpConnectors">
                    <spring:message text="Разъемы Display Port"/>
                </form:label>
            </td>
            <td>
                <form:input path="dpConnectors"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dpVersion">
                    <spring:message text="Версия разъема Display Port"/>
                </form:label>
            </td>
            <td>
                <form:input path="dpVersion"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="powerSupply">
                    <spring:message text="Разъемы дополнительного питания"/>
                </form:label>
            </td>
            <td>
                <form:input path="powerSupply"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="recPower">
                    <spring:message text="Рекомендуемая мощность БП"/>
                </form:label>
            </td>
            <td>
                <form:input path="recPower"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="powerConsum">
                    <spring:message text="Максимальное энергопотребление"/>
                </form:label>
            </td>
            <td>
                <form:input path="powerConsum"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="cardLength">
                    <spring:message text="Длина видеокарты"/>
                </form:label>
            </td>
            <td>
                <form:input path="cardLength"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="coolSys">
                    <spring:message text="Система охлаждения"/>
                </form:label>
            </td>
            <td>
                <form:input path="coolSys"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="cardWidth">
                    <spring:message text="Ширина видеокарты"/>
                </form:label>
            </td>
            <td>
                <form:input path="cardWidth"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="heatPipes">
                    <spring:message text="Использование тепловых трубок"/>
                </form:label>
            </td>
            <td>
                <form:input path="heatPipes"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="overClocked">
                    <spring:message text="OverClocked Edition"/>
                </form:label>
            </td>
            <td>
                <form:input path="overClocked"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="deliveryType">
                    <spring:message text="Тип поставки"/>
                </form:label>
            </td>
            <td>
                <form:input path="deliveryType"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="warranty">
                    <spring:message text="Гарантия"/>
                </form:label>
            </td>
            <td>
                <form:input path="warranty"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="webSite">
                    <spring:message text="Сайт производителя"/>
                </form:label>
            </td>
            <td>
                <form:input path="webSite"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="originCountry">
                    <spring:message text="Страна производитель"/>
                </form:label>
            </td>
            <td>
                <form:input path="originCountry"/>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <c:if test="${!empty GPU.cardInterface}">
                    <input type="submit"
                           value="<spring:message text="Edit GPU"/>"/>
                </c:if>
                <c:if test="${empty GPU.cardInterface}">
                    <input type="submit"
                           value="<spring:message text="Add GPU"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

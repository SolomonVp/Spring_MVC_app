<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear, Employee! Please enter your details...</h2>




<form:form action="showDetails" modelAttribute="employee">

    Name       <form:input path="name"/>
    <form:errors path="name"/>                       <br><br>
    Surname    <form:input path="surname"/>
    <form:errors path="surname"/>                    <br><br>
    Salary     <form:input path="salary"/>           <br><br>

    Department
    <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>                                       <br><br>

    Which Car do you want?
<%--    BMW    <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi   <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB     <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

                                                         <br><br>

    Foreign Language(s):
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    FR <form:checkbox path="languages" value="Franch"/>--%>
<%--    UK <form:checkbox path="languages" value="Ukrain"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>

                                                          <br><br>

    <input type="submit" value="Ok">

</form:form>

</body>

</html>
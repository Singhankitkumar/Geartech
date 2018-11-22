<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="b" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Gear Technical Forum</h1>
	<h2>Answer the query</h2>
	<a href="index.jsp">Home</a>
	<b:form action="update" method="post" modelAttribute="yy">
		<c:if test="${querySearch.queryid != null}">
				
Query Id<b:input path="queryid" value="${querySearch.queryid}"
				readonly="true" />
			<br>
Select Technology<b:input path="technology"
				value="${querySearch.technology }" readonly="true" />
			<br>
Question<b:input path="query" value="${querySearch.query}"
				readonly="true" />
			<br>
Question Raised By<b:input path="queryraisedby"
				value="${querySearch.queryraisedby}" />
			<br>
Solution<b:input path="solutions" />
			<br>

			<td><label for="solutionsgivenby">Please Select</label></td>
			<td><div>
					<b:select path="solutionsgivenby">
						<b:option value="">Please Select</b:option>
						<b:options items="${sol}" />
					</b:select>
				</div></td>
			<input type="submit" value="Update Query">
		</c:if>

	</b:form>
</body>
</html>
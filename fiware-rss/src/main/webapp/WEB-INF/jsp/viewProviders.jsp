<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
<%@include file="/jspf/appResources.jsp"%>
<title>FIWARE RSS - Settlement</title>
</head>
<body>

    <%@  include file="/jspf/header.jsp"%>
    <%@  include file="/jspf/footer.jspf"%>

    <a class="btn btn-default back" href="${contextPath}/settlement/settlement.html">Back</a>
    <div style="margin-left:40px;">
        <table border="1">
        <tr>
          <th>Provider ID</th>
          <th>Provider Name</th>
        </tr>
		<c:forEach var="provider" items="${providersList}">			
	      <tr>
          	<td>${provider.txAppProviderId}</td>
          	<td>${provider.txName}</td>
          </tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>
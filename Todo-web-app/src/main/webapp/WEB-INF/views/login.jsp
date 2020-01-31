<%@include file="../common/head.jspf" %>
<%@include file="../common/navigation.jspf" %>

	<div class="container">
		<form action="/login.do" method="post">

			Name: <input type="text" name="name" /> Password: <input
				type="password" name="password" /><input type="submit"
				value="Submit" />

		</form>

		<p style="font: red">${errorMessage}</p>

	</div>

<%@include file="../common/footer.jspf" %>
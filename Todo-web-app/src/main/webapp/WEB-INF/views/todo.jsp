<%@include file="../common/head.jspf" %>
<%@include file="../common/navigation.jspf" %>

	<div class="container">

		<h1>Welcome ${name}</h1>
		<table class="table table-striped">
			<caption>Your Todos Are</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Category</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category }</td>
						<td>
							<form>
								<button formaction="/delete-todo.do" formmethod="post" type="submit" name="todo" value="${todo.name}">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="/add-todo.do" method="post">

			<input type="text" name="todo" />
			<input type="text" name="category" /> 
			<input type="submit" value="Add" />
				
		</form>

	</div>
	
<%@include file="../common/footer.jspf" %>
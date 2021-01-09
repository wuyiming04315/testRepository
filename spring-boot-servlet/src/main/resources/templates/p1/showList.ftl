<html>
	<head>
		<title>展示用户数据 - 目录结构</title>
		<meta charset="utf-8"></meta>
		<script src="1.js" />
	</head>
	
	<body>
		
		<table border="1" align="center" width="50%">
			
			<tr>
				<th>TEXT - 目录结构</th>
			</tr>
			
			<#list list as text >
				<tr>
					<td>${text}</td>
				</tr>
			</#list>	
		</table>
	</body>
</html>
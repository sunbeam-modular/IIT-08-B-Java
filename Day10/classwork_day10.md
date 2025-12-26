###prevent duplicate vote copy - 

### logout.jsp 
<% session.invalidate(); %>

###result.jsp => href => logout.jsp

=========================================================
####FindCandidate for edit 
###Implement editcand.jsp

###Implement findCandidateBean.java

================================================

####Update Candidate 
###Implement Savecand.jsp

###implement SaveCandidateBean.java

###result.jsp
	<p>
		${param.msg}
	</p>

###editcand.jsp
	 <input type="hidden" name="op" value="edit"/>


	

========================================================


####Add candidate 
###Savecand.jsp
<c:when test="${scb.op == 'add'}">
			${scb.addCandidate()}
			<jsp:forward page="result.jsp">
				<jsp:param name="msg" value="Candidate Added: ${scb.count}"/>
			</jsp:forward>
</c:when>

###result.jsp
<a href="newcand.jsp">Add Candidate</a> | <a href="logout.jsp">Sign Out</a>

###Implement newcand.jsp


###Implement SaveCandidateBean (add code for addCandidate) 

==================================================================================

#### context-param
 <context-param>
  	<param-name>appTitle</param-name>
  	<param-value>Online Voting System</param-value>
  </context-param>
  <context-param>
  	<param-name>theme</param-name>
  	<param-value>pink</param-value>
  </context-param>
</web-app>


<body bgcolor="${initParam.theme}">
	<h1>${initParam.appTitle}</h1>




		
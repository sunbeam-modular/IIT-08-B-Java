
====================================
Voting_jsp 
###
  ## create the page index.jsp 
  ## Implement LoginBean 
	private String email;
	private String passwd;
	private User user;
        implement authenticate() 
  ## implement login.jsp ( call authenticate() ) (c:choose) ( c:when , c:when , otherwise)  
    	if failed -- href -> index.jsp   -- empty -- lb.user
	if role is admin --> redirect to result.jsp ( c: redirect url) (<%-- <jsp:forward page="result.jsp"/> --%>) 
	if login success --> redirect to candlist.jsp 
       
      

### 
 ## create the page index.jsp (email ,password) (action -> login.jsp)
    give link for newuser on index page (newuser.jsp)

 ## create the newuser.jsp ( fname, lname, email, passwd, birth)(register)
	
 ## Implement RegistrationBean
    private String fname, lname, email, passwd, birth;
    private String role;
    private boolean status, regStatus;
    implement registerUser() method (UserDao) (update regstatus)  


 ## create register.jsp 
	  # use RegistrationBean
	  # set status and role ( value) 
	  # call registerUser
	  # use (In c:choose use c:when and c:otherwise only) (success or fail)(href)
          if registeration success (call regStatus) - > link for index.jsp (login here) 
          if failed -> link newuser.jsp (register again) 
	               link index.jsp( go to login) 
 ## TEST IT



### 
  ##Implement CandidateListBean
	private List<Candidate> candidateList;
	implement fetchCandidates() (candidateDao)

  ##Implement candlist.jsp (display all the candlist) ( call the method fetchCandidates)   
    ( call the method fetchCandidates)   
  ## use form tag , action -> Vote.jsp
     use c:for each ( var , items) , use inputtype = submit


### copy result.jsp (name , lastName not displayed) 

### 	 
	## login.jsp -- add scope (session) (bean creation) (scope="session")
	## create bean of loginBean add scope (session) 
           call jsp:getProperty -- candlist ( use bean) 

###
  ##Implement VoteBean
    private int candidateId;
    private User user;
    private boolean status;	
    implement registerVote() // update user status in db , (UserDao(update user) , CandidateDao(increment cand vote) ) 

  ##Implement vote.jsp 	
	#setProp (candidateId , param = candidate) and (user , value(sessionscope))
	# call register.vote()
        # use c:choose(use when and otherwise inside)     
        #use simple(choose)  -- c:choose(inside--> and use c:when test ( call status if true-- congrats , registered ) 
	(otherwise --- if not give msg ( votenotregs) )-- choose completed 
	#give href (logout.jsp) 

  ## Implement session in vote.jsp 
       <jsp:setProperty name="vb" property="user" value="${sessionScope.lb.user}"/>

##result.jsp 
<h3>Voting Result</h3>
Hello, ${sessionScope.lb.user.firstName} ${lb.user.lastName}
<hr/>



   
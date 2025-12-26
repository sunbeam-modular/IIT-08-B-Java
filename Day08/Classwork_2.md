#create home.html -- web.xml -- welcomefile -- home.html 


##Create project - voting_servlets 

#- Create index.html 
- Create loginServlet -- use UserDao
 // if -- login failed
resp.setContentType("text/html");
PrintWriter out = resp.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>Login</title>");
out.println("</head>");
out.println("<body>");
out.println("<h2>Login Failed</h2>");
out.println("<a href='index.html'>Login Again</a>");
out.println("</body>");
out.println("</html>");

==================================================

#Create CandidateListServlet
        - use CandidateDao  ( findAll) -- Create the list 
        
	-resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Candidate List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Candidates</h2>");
		out.println("<form method='post' action='vote'>");
		for (Candidate cand : list) {
			// <input type='radio' name='candidate' value='candId'/> Candidate Name (Party) <br/>
			out.printf("<input type='radio' name='candidate' value='%d'/> %s (%s) <br/>\n",
					cand.getId(), cand.getName(), cand.getParty());
		}
		out.println("<br/><input type='submit' value='Vote'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");


=======================================================
##ResultServlet
# login Servlet -- if role admin go to resultServlet  
# Create the resultServlet
# - use CandidateDao -- call method findall 
out.println("<html>");
out.println("<head>");
out.println("<title>Candidate List</title>");
out.println("<title>Result</title>");
out.println("</head>");
out.println("<body>");
out.println("<h2>Candidates</h2>");
out.println("<h2>Result</h2>");
out.println("<table border='1'>");
out.println("<thead>");
out.println("<tr>");
out.println("<th>Id</th>");
out.println("<th>Name</th>");
out.println("<th>Party</th>");
out.println("<th>Votes</th>");
out.println("<th>Action</th>");
out.println("</tr>");
out.println("</thead>");
for (Candidate cand : list) {
			out.println("<tr>");
			out.printf("<td>%d</td>\n", cand.getId());
			out.printf("<td>%s</td>\n", cand.getName());
			out.printf("<td>%s</td>\n", cand.getParty());
			out.printf("<td>%d</td>\n", cand.getVotes());
			out.println("<td></td>");
			out.println("</tr>");
		}
out.println("</table>");
out.println("<br/>");
out.println("<a href='announce.html'>Announcement</a>");
out.println("<a href='logout'>Sign Out</a>");
out.println("</body>");
out.println("</html>");

====================================================================

=======================================================
##  cookie 
## loginServlet -- create the cookie and send back to the client( login succesf) 
## candidateList -- cookie 
#  ResultServlet -- access the cookie (Candidates , result)

==========================================================

## logout Servlet -- Destroying the cookie 
out.println("<html>");
out.println("<head>");
out.println("<title>Logout</title>");
out.println("</head>");
out.println("<body>");
out.println("<h2>Thank You!</h2>");
//access the cookie -- // get username from cookie and display it
//Destroy the cookie 
//convert persistent cookie to temp cookie
//delete the cookie from browser
//add in the response

out.println("<a href='index.html'>Login Again</a>");
out.println("</body>");
out.println("</html>");

============================================
Creating the session 
## loginServlet -- Create session using getSession (after cookie) 
## create the VoteServlet
    # // get current user from session
    # if user-status is true (already voted) 
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Vote</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h2>Already Voted.</h2>");
      out.println("<a href='logout'>Sign Out</a>");
      out.println("</body>");
      out.println("</html>");
      return; 
    # // change user status(setstatus) ,  update in database (UserDao , update) 
    # // get candidate id from prev page (getParameter) 
         //increment the candidate votes ( use CandidateDao , incrVote()) 
         // show message to user
	 resp.setContentType("text/html");
	 PrintWriter out = resp.getWriter();
	 out.println("<html>");
         out.println("<head>");
         out.println("<title>Vote</title>");
         out.println("</head>");  
         out.println("<body>");
	 out.println("<h2>Congratulations!</h2>");
	 out.println("Your vote registered successfully.<br/><br/>\n");
	 out.println("<a href='logout'>Sign Out</a>");
	 out.println("</body>");
	 out.println("</html>");

## logoutServlet -- Destroy the session -- using invalidate
=======================================

===================================================
## DeleteCandidateServlet
   
   #ResultServlet ( inside the candidate ) 
   out.println("<td>");
   out.printf("<a href='delcand?candid=%d'><img src='images/delete.png' alt='Delete' height='25px'></a>\n", cand.getId());	
   out.println("</td>");

## DeleteCandidateServlet
    #getParameter - candid 	    
	#use CandDao -- delete by ID 
        #go to resultServlet 

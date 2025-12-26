##demo01.jsp -- 
	# Delcaration and field -- int count %!
	# jspInit() , jspDestroy() 
	# calling Date (%=)
	# scriplete one or more java stmt ( jspservice) 
	# calling scriptlet (count % 2 ) 

##demo02.jsp (Request-parameter demo) 
    #create the form with roll , name , marks ( action - details.jsp) 
    #create the details.jsp( roll , name , marks) (request object)

##demo03.jsp 
   #create the page showerror.jsp ( page isError) (exc.getM %=) 
   #<%@ page errorPage="showerror.jsp" %>
   #Random number ( if exception will fwd to error.jsp)(<%)(If num < 3, then it will throw exception) 
   #print Generated number(%=)	  

##demo05next.jsp (h2,p)
##demo5.jsp 
#jsp:forward tag
RequestDispatcher rd = application.getRequestDispatcher("/demo05next.jsp");
rd.forward(request, response);	
RequestDispatcher rd = application.getRequestDispatcher("/demo05next.jsp");
rd.forward(request, response);


##demo06.jsp 
#table , tr, td 
  #jsp:include -- header.jsp
  #include file -- footer.html

##demo07.jsp
#.jsp file to submit  
#calcres.jsp
#Calculator Using java.beans 
private int num1;
private int num2;
private String op;
private double result;
<%@page import="com.sunbeam.CalcBean"%>
 	
package state;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/show-Abbreviation-2")
public class ShowAbbreviation2  extends HttpServlet{
	private StateAbbraviationservice abbMapper= new StateAbbreviationMapper(); 

@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
	String stateName= request.getParameter("state-name");
	if(stateName==null){
		stateName="";
	}
	stateName=stateName.trim();
	String stateabbreviation=abbMapper.findAbbreation(stateName);
	Satepair stateinfo= new Satepair(stateName, stateabbreviation);
	HttpSession session=request.getSession();
	
	session.setAttribute("stateinfo2", stateinfo);
	String address;
	if(stateName.isEmpty()){
		address="/WEB-INF/missing-state.jsp";
	}else if(stateName !=null){
		address="/WEB-INF/show-Abbreviation-2.jsp";
	}else{
		address="/WEB-INF/unknown-State-2.jsp";
	}
	RequestDispatcher dispatcher=request.getRequestDispatcher(address);
	dispatcher.forward(request, response);
	
}

}

package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

public class VoteBean {
	private int candidateId;
    private User user;
    private boolean status;
    
    public VoteBean() {
		// TODO Auto-generated constructor stub
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void registerVote( ) {
		user.setStatus(true);
		//to update user-status 
		try(UserDao userDao = new UserDaoImpl()){
			userDao.update(user); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//to increment votes 
		try(CandidateDao candDao = new CandidateDaoImpl()){
			int count = candDao.incrVote(candidateId); 
			this.status = count == 1;  
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}	

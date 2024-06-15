package com.connect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.connect.entities.Users;

@Repository
public interface usersDao extends JpaRepository<Users, Integer> {
	
	Users findById(int id);
	 
	Users findByEmail(String email);
	@Modifying
	@Query("UPDATE Users u SET u.userName=?1,u.mobileNo=?2,u.password=?3  WHERE u.id=?4")
	public void updateUser(String userName, long mobileNo,String password,int id);

	@Modifying
	@Query("UPDATE Users u SET u.password=?1  WHERE u.id=?2")
	public void updateUserPassword(String password,int id);

	@Query("select count(*) from Users u")
	Integer userCount();
	
}

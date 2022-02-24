package com.abc.corporateprofile.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.corporateprofile.dto.GST_Details;
import com.abc.corporateprofile.dto.User_Details;

public interface CorporategstDetailRepository extends JpaRepository<GST_Details, Integer> {
	@Query("SELECT l FROM User_Details l WHERE userid=:userid OR fname=:fname OR user_type=:user_type OR email_id=:email_id OR phone_number=:phone_number OR status=:status")
	public List<User_Details> searchUsers(@Param("userid")Integer userid, @Param("fname")String fname, @Param("user_type")String user_type,@Param("status")String status, 
			@Param("email_id")String email_id, @Param("phone_number")String phone_number);

	

	

}

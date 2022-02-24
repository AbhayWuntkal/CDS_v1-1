package com.abc.corporateprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.corporateprofile.dto.Address_master;
import com.abc.corporateprofile.dto.Bank_Details;
import com.abc.corporateprofile.dto.Companybranch;
import com.abc.corporateprofile.dto.GST_Details;
import com.abc.corporateprofile.dto.Insurance;
import com.abc.corporateprofile.dto.Organizational_Details;
import com.abc.corporateprofile.dto.Passport;
import com.abc.corporateprofile.dto.State_master;
import com.abc.corporateprofile.dto.User_Details;
import com.abc.corporateprofile.dto.User_Type;
import com.abc.corporateprofile.dto.Visa;
import com.abc.corporateprofile.dto.lnk_user_role;

public interface CorporateprofileRepository extends JpaRepository<User_Details, Integer> {

	@Query("SELECT l FROM GST_Details l WHERE id=:userid")
    public List<GST_Details> getGSTDetails(@Param("userid") Integer userid);
    

	@Query("SELECT l FROM GST_Details l WHERE gst_holder_name=:user_name")
	public List<GST_Details> gstDetailsByName(@Param("user_name") String user_name);

	@Query("SELECT l FROM Bank_Details l WHERE bank_name =:bank_name")
	public List<Bank_Details> getBankDetails(String bank_name);

	@Query("SELECT l FROM Bank_Details l WHERE userid =:userid")
	public List<Bank_Details> getBankDetailsById(Integer userid);
	
	@Query("SELECT l FROM Organizational_Details l WHERE id =:id")
	public List<Organizational_Details> getOrgDetails(Integer id);


	@Modifying
	@Query("UPDATE User_Details u SET u.last_login_date=:last_login_date WHERE u.email_id=:email_id")
	public void logout(@Param("email_id")String email_id,@Param("last_login_date")String last_login_date);

	@Modifying
	@Query("UPDATE User_Details u SET u.password=:new_password , u.last_modified_date=:last_modified_date ,u.modified_by=:modified_by WHERE u.password=:password and u.email_id=:email_id ")
	public void changepassword(@Param("password")String password,@Param("email_id")String email_id,@Param("last_modified_date")String last_modified_date,@Param("modified_by")String modified_by,@Param("new_password")String new_password);


	@Query("SELECT l FROM Address_master l WHERE userid=:userid")
	public List<Address_master> listAddress(@Param("userid") Integer  userid);
	
	@Query("SELECT l FROM Companybranch l WHERE id=:id")
	public List<Companybranch> listCompanybranch(@Param("id") Integer id);

	@Query("SELECT l FROM Companybranch l WHERE parent=:parent")
	public List<Companybranch> listCompanybranchbyparent(@Param("parent") Integer parent);


	@Query("SELECT l FROM lnk_user_role l WHERE userid=:userid")
	public List<lnk_user_role> getuserRolebyid(@Param("userid") Integer userid);

	@Modifying
	@Query("UPDATE lnk_user_role u SET u.roleid=:roleid, u.last_modified_date=:last_modified_date, u.modified_by=:modified_by WHERE u.userid=:userid")
	public void UpdateuserRolebyid(@Param("userid")Integer userid,@Param("roleid") Integer roleid,@Param("last_modified_date") String last_modified_date,@Param("modified_by") String modified_by);
	@Query("SELECT l FROM Passport l WHERE userid=:userid")
	public List<Passport> getpassportbyid(@Param("userid")Integer userid);

	@Modifying
	@Query("UPDATE Passport u SET u.expiry_date=:expiry_date,u.modified_date=:modified_date, u.modified_by=:modified_by WHERE u.userid=:userid")
	public void Updatepassportbybyid(@Param("userid")Integer userid, @Param("expiry_date")String expiry_date,@Param("modified_date") String modified_date,@Param("modified_by") String modified_by);

	@Query("SELECT l FROM State_master l WHERE country_id=:country_id")
	public List<State_master> getstatebyid(@Param("country_id")String country_id);

	@Query("SELECT l FROM User_Type l WHERE id=:id")
	public List<User_Type> getusertypebyid(@Param("id")Integer id);

	@Modifying
	@Query("UPDATE User_Details u SET u.phone_number=:phone_number,u.is_meal=:is_meal,u.is_baggage=:is_baggage,"
			+ "u.is_hold_booking=:is_hold_booking,u.is_approver=:is_approver,u.is_travel_arranger=:is_travel_arranger,"
			+ "u.is_trip_claim_approver=:is_trip_claim_approver WHERE u.email_id=:email_id")
	public void updateUserInfo(@Param("email_id")String email_id,@Param("phone_number") String phone_number,@Param("is_meal") Boolean is_meal,@Param("is_baggage") boolean is_baggage,
			@Param("is_hold_booking")boolean is_hold_booking,@Param("is_approver") boolean is_approver,@Param("is_travel_arranger") boolean is_travel_arranger,@Param("is_trip_claim_approver") boolean is_trip_claim_approver);


	@Modifying
	@Query("UPDATE User_Details u SET u.title=:title,u.fname=:fname,last_name=:last_name,gender=:gender,residency=:residency,nationality=:nationality,"
			+ "dob=:dob,u.is_flight_arranger_group=:is_flight_arranger_group,u.is_flight_approver_group=:is_flight_approver_group,u.profile_type=:profile_type,"
			+ "u.htl_travel_arranger_group=:htl_travel_arranger_group,u.htl_approver_group=:htl_approver_group,u.claim_approver_group=:claim_approver_group WHERE u.email_id=:email_id")
	public void updatePersonalInfo(@Param("email_id")String email_id,@Param("title") String title,@Param("fname") String fname,@Param("last_name") String last_name,@Param("gender") String gender,
			@Param("residency")String residency,@Param("nationality") String nationality,@Param("dob") String dob,@Param("is_flight_arranger_group") boolean is_flight_arranger_group,
			@Param("is_flight_approver_group") boolean is_flight_approver_group,@Param("profile_type") String profile_type,@Param("htl_travel_arranger_group") Integer htl_travel_arranger_group,
			@Param("htl_approver_group")Integer htl_approver_group,@Param("claim_approver_group") Integer claim_approver_group);

	@Modifying
	@Query("UPDATE Organizational_Details u SET u.employee_code=:employee_code,u.designation=:designation,u.band=:band,u.location=:location,"
			+ "u.department=:department,u.cost_center=:cost_center,u.project_code=:project_code,u.domestic_eligibility=:domestic_eligibility,"
			+ "international_eligibility=:international_eligibility,u.date_of_joining=:date_of_joining,u.date_of_termination=:date_of_termination WHERE u.id=:id")
	public void updateOrgInfo(@Param("id")Integer id,@Param("employee_code") String employee_code, @Param("designation")String designation, @Param("band")String band,@Param("location") String location,
			@Param("department")String department,@Param("cost_center") String cost_center,@Param("project_code") String project_code, @Param("domestic_eligibility")String domestic_eligibility,
			@Param("international_eligibility")String international_eligibility,@Param("date_of_joining") String date_of_joining,@Param("date_of_termination") String date_of_termination);


	@Query("SELECT l FROM Visa l WHERE userid=:userid")
	public List<Visa> getuservisabyUid(@Param("userid") Integer userid);


	@Modifying
	@Query("UPDATE Visa u SET u.expiry_date=:expiry_date,u.modified_date=:modified_date, u.modified_by=:modified_by WHERE u.userid=:userid")
	public void UpdatevisabybyUid(@Param("userid")Integer userid, @Param("expiry_date")String expiry_date,@Param("modified_date") String modified_date,@Param("modified_by") String modified_by);


	@Query("SELECT l FROM Insurance l WHERE userid=:userid")
	public List<Insurance> getuserinsurancebyUid(@Param("userid")Integer userid);

	@Modifying
	@Query("UPDATE Insurance u SET u.insurer=:insurer,u.region=:region, u.policy_no=:policy_no, u.start_date=:start_date, u.end_date=:end_date, u.nominee=:nominee WHERE u.userid=:userid")
	public void UpdateinsurancebybyUid(@Param("userid")Integer userid,@Param("insurer") String insurer,@Param("region") String region,@Param("policy_no") Integer policy_no,
			@Param("start_date")String start_date,@Param("end_date") String end_date,@Param("nominee") String nominee);

		
//	@Query("SELECT l FROM User_Details")
//	public List<User_Details> GetAllUsers(Integer id);

	
	
}
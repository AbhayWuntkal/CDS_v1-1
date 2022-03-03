package com.abc.corporateprofile.service;

import java.util.List;

import com.abc.corporateprofile.dto.Address_master;
import com.abc.corporateprofile.dto.Addresstype_mst;
import com.abc.corporateprofile.dto.Bank_Details;
import com.abc.corporateprofile.dto.Bank_mst;
import com.abc.corporateprofile.dto.Company;
import com.abc.corporateprofile.dto.Companybranch;
import com.abc.corporateprofile.dto.Department_Master_by_Corporate;
import com.abc.corporateprofile.dto.Documenttype_mst;
import com.abc.corporateprofile.dto.GST_Details;
import com.abc.corporateprofile.dto.Gender_mst;
import com.abc.corporateprofile.dto.Gst_State_mst;
import com.abc.corporateprofile.dto.Insurance;
import com.abc.corporateprofile.dto.Organizational_Details;
import com.abc.corporateprofile.dto.Passport;
import com.abc.corporateprofile.dto.Phonetype_mst;
import com.abc.corporateprofile.dto.Profiletype_mst;
import com.abc.corporateprofile.dto.Roles;
import com.abc.corporateprofile.dto.State_master;
import com.abc.corporateprofile.dto.Title_mst;
import com.abc.corporateprofile.dto.User_Details;
import com.abc.corporateprofile.dto.User_Type;
import com.abc.corporateprofile.dto.Userstaus_mst;
import com.abc.corporateprofile.dto.Visa;
import com.abc.corporateprofile.dto.lnk_user_role;

public interface ICorporateprofileService {

	public void AddUser(User_Details user_Details);

	public void AddGSTDetails(GST_Details gst_Details);

	public void AddBankDetails(Bank_Details bank_Details);

	public void AddCompany(Company company);

//	public List<User_Details> GetAllUsers(Integer id);

//	public void update(User_Details users, int userid);
	public void logout(String email_id, String last_login_date);

//	public List<User_Details> logout(int userid, String last_login_date);
	public User_Details checkpassword(User_Details p);

	public void updateOrgInfo(Integer id, String employee_code, String designation, String band, String location,
			String department, String cost_center, String project_code, String domestic_eligibility,
			String international_eligibility, String date_of_joining, String date_of_termination);

	public void changepassword(String password, String email_id, String last_modified_date, String modified_by,
			String new_password);

	public void updateUserInfo(String email_id, String phone_number, Boolean is_meal, boolean is_baggage,
			boolean is_hold_booking, boolean is_approver, boolean is_travel_arranger, boolean is_trip_claim_approver);

	public void updatePersonalInfo(String email_id, String title, String fname, String last_name, String gender,
			String residency, String nationality, String dob, boolean is_flight_arranger_group,
			boolean is_flight_approver_group, String profile_type, Integer htl_travel_arranger_group,
			Integer htl_approver_group, Integer claim_approver_group);
//	public void Send_email(String email_id, Boolean send_email);

	public void UpdateOrg(Organizational_Details organizational_Details);

	public List<Organizational_Details> getOrgDetails(Integer id);

	public User_Details loginUser(User_Details a);

	public User_Details searchUser(User_Details b);

	public void deleteGSTDetails(int sno);
//	public void deleteGSTDetailsbynumber(int gst_number); 

	public List<Bank_Details> getBankDetails(String bank_name);

	public List<Bank_Details> getBankDetailsById(Integer userid);

	public List<GST_Details> getGSTDetails(Integer userid);

	public List<User_Details> searchUsers(Integer userid, String fname, String user_type, String status,
			String email_id, String phone_number);

	public List<GST_Details> gstDetailsByName(String user_name);

	// only get
	public List<Bank_mst> listAllbank_mst();

	public List<Department_Master_by_Corporate> listAllDepartment_Master_by_Corporate();

	public List<Documenttype_mst> listAllDocumenttype_mst();

	public List<Gender_mst> listAllGender_mst();

	public List<Gst_State_mst> listAllGst_State_mst();

	public List<Phonetype_mst> listAllPhonetype_mst();

	public List<Profiletype_mst> listAllProfiletype_mst();

	public List<Roles> listAllRoles();

	public List<Title_mst> listAllTitle_mst();

	public List<Userstaus_mst> listAllUserstaus_mst();

	public List<Addresstype_mst> listAllAddresstype_mst();

	public List<User_Details> getalluser(Integer company_id);

	// get & post
	public void AddAddress(Address_master address);

	public List<Address_master> listAddress(Integer userid);

	public void AddCompany(Companybranch Company);

	public List<Companybranch> listCompanybranch(Integer id);

	public List<Companybranch> listCompanybranchbyparent(Integer parent);

	public void AddLnkuserRole(lnk_user_role userRole);

	public List<lnk_user_role> getuserRolebyid(Integer userid);

	public void UpdateuserRolebyid(Integer userid, Integer roleid, String last_modified_date, String modified_by);

	public void Addstate_master(State_master state_master);

	public List<State_master> getstatebyid(String country_id);

	public void Adduser_type(User_Type user_type);

	public List<User_Type> getusertypebyid(Integer id);

//	add,get,update
	public void AddPassport_master(Passport passport_master);

	public List<Passport> getpassportbyid(Integer userid);

	public void Updatepassportbybyid(Integer userid, String expiry_date, String modified_date, String modified_by);

	public void AddVisa(Visa visa);

	public List<Visa> getuservisabyUid(Integer userid);

	public void UpdatevisabybyUid(Integer userid, String expiry_date, String modified_date, String modified_by);

	public void AddInsurance(Insurance insurance);

	public List<Insurance> getuserinsurancebyUid(Integer userid);

	public void UpdateinsurancebybyUid(Integer userid, String insurer, String region, Integer policy_no,
			String start_date, String end_date, String nominee);

}

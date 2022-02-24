package com.abc.corporateprofile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
import com.abc.corporateprofile.service.ICorporateprofileService;

@RestController
@RequestMapping(value = "/cds")
@CrossOrigin(origins="http://localhost:4200")
public class CorporateprofileController {
	@Autowired
	ICorporateprofileService cdsservice;
	@PostMapping(value = "/add")
	public void AddUser(@RequestBody User_Details user_Details) {
		cdsservice.AddUser(user_Details);
	}
		
	@PostMapping(value = "/gstadd")
	public void AddGSTDetails(@RequestBody GST_Details gst_Details) {
		cdsservice.AddGSTDetails(gst_Details);
	}
	
//	@PostMapping(value = "/getAllUsers")
//	public List<User_Details> GetAllUsers(Integer id) {
//		//System.out.println(prodName);
//		return cdsservice.GetAllUsers(id);	
//	}
	
	@PostMapping(value = "/addbankD")
	public void AddBankDetails(@RequestBody Bank_Details bank_Details) {
		cdsservice.AddBankDetails(bank_Details);
	}
	
	@PostMapping(value = "/addCompany")
	public void AddCompany(@RequestBody Company company) {
		cdsservice.AddCompany(company);
	}
	
	@PostMapping(value = "/addorg")
	public void UpdateOrg(@RequestBody Organizational_Details organizational_Details) {
		cdsservice.UpdateOrg(organizational_Details);
	}
	
	
	@PostMapping(value = "/login")
	public User_Details loginUser(@RequestBody User_Details a) {
		return cdsservice.loginUser(a);
	}
	
	@PostMapping(value = "/checkpassword")
	public User_Details checkpassword(@RequestBody User_Details p) {
		return cdsservice.checkpassword(p);
	}
	
	
//	@GetMapping(value = "/SendEmail/{email_id}/{send_email}")
//	public void Send_email( @PathVariable("email_id") String email_id,@PathVariable("send_email") Boolean send_email) {
//		cdsservice.Send_email( email_id,send_email);
//	}
	
	@GetMapping(value = "/logout/{email_id}/{last_login_date}")
	public void logout( @PathVariable("email_id") String email_id,@PathVariable("last_login_date") String last_login_date) {
		cdsservice.logout( email_id,last_login_date);
	}
	
	@GetMapping(value = "/forgot/{password}/{email_id}/{last_modified_date}/{modified_by}/{new_password}")
	public void changepassword( @PathVariable("password") String password,@PathVariable("email_id")String email_id,@PathVariable("last_modified_date")String last_modified_date,@PathVariable("modified_by") String modified_by,@PathVariable("new_password") String new_password) {
		cdsservice.changepassword( password,email_id,last_modified_date,modified_by,new_password );
	}
		
	@GetMapping(value = "/updateUserInfo/{email_id}/{phone_number}/{is_meal}/{is_baggage}/{is_hold_booking}/{is_approver}/{is_travel_arranger}/{is_trip_claim_approver}")
	public void updateUserInfo( @PathVariable("email_id")  String email_id,@PathVariable("phone_number") String phone_number, @PathVariable("is_meal")Boolean is_meal,@PathVariable("is_baggage") boolean is_baggage,
			@PathVariable("is_hold_booking") boolean is_hold_booking,@PathVariable("is_approver") boolean is_approver,@PathVariable("is_travel_arranger") boolean is_travel_arranger,@PathVariable("is_trip_claim_approver") boolean is_trip_claim_approver) {
		cdsservice.updateUserInfo(email_id,phone_number, is_meal,is_baggage,is_hold_booking,is_approver,is_travel_arranger,is_trip_claim_approver);
	}
	
	@GetMapping(value = "/updatePersonalInfo/{email_id}/{title}/{fname}/{last_name}/{gender}/{residency}/{nationality}/{dob}/{is_flight_arranger_group}/"
			+ "{is_flight_approver_group}/{profile_type}/{htl_travel_arranger_group}/{htl_approver_group}/{claim_approver_group}")
	public void updatePersonalInfo(@PathVariable("email_id")String email_id,@PathVariable("title") String title,@PathVariable("fname")String fname,@PathVariable("last_name") String last_name, @PathVariable("gender")String gender,
			@PathVariable("residency")String residency,@PathVariable("nationality") String nationality,@PathVariable("dob") String dob, @PathVariable("is_flight_arranger_group")boolean is_flight_arranger_group,
			@PathVariable("is_flight_approver_group")boolean is_flight_approver_group,@PathVariable("profile_type") String profile_type, @PathVariable("htl_travel_arranger_group")Integer htl_travel_arranger_group,
			@PathVariable("htl_approver_group")Integer htl_approver_group,@PathVariable("claim_approver_group") Integer claim_approver_group){
		cdsservice.updatePersonalInfo(email_id, title,fname,last_name,gender,
				residency,  nationality,  dob,  is_flight_arranger_group,
				 is_flight_approver_group,  profile_type,  htl_travel_arranger_group,
				 htl_approver_group,  claim_approver_group);
	}

	@GetMapping(value = "/updateOrgDetails/{id}/{employee_code}/{designation}/{band}/{location}/{department}/{cost_center}/{project_code}/{domestic_eligibility}/"
			+ "{international_eligibility}/{date_of_joining}/{date_of_termination}")
	public void updateOrgInfo(@PathVariable("id")Integer id,@PathVariable("employee_code") String employee_code,@PathVariable("designation") String designation, @PathVariable("band")String band,
			@PathVariable("location") String location,@PathVariable("department")String department,@PathVariable("cost_center") String cost_center,@PathVariable("project_code") String project_code,
			@PathVariable("domestic_eligibility") String domestic_eligibility,@PathVariable("international_eligibility")String international_eligibility,
			@PathVariable("date_of_joining") String date_of_joining,@PathVariable("date_of_termination") String date_of_termination){
		cdsservice.updateOrgInfo(id,employee_code, designation, band, location,
				department, cost_center,project_code, domestic_eligibility,
				international_eligibility, date_of_joining, date_of_termination);
	}
	
	@PostMapping(value = "/search")
	public User_Details searchUser(@RequestBody User_Details b) {
		return cdsservice.searchUser(b);
	}
	
	@GetMapping(value = "/search/{userid}/{fname}/{user_type}/{status}/{email_id}/{phone_number}")
	public List<User_Details> searchUsers(@PathVariable("userid")Integer userid, @PathVariable("fname")String fname, 
			@PathVariable("user_type")String user_type, @PathVariable("status")String status, @PathVariable("email_id")String email_id, 
			@PathVariable("phone_number")String phone_number){
		return cdsservice.searchUsers(userid, fname, user_type, status, email_id, phone_number);
	}
		
	@GetMapping(value = "/gstDetails/{userid}") //pathvariable
	public List<GST_Details> getGSTDetails(@PathVariable("userid") Integer userid) {
		//System.out.println(prodName);
		return cdsservice.getGSTDetails(userid);	
	}
	
	
	
	
	@GetMapping(value = "/gstDetailsbyname/{name}") //pathvariable
	public List<GST_Details> gstDetailsByName(@PathVariable("name") String user_name) {
		//System.out.println(prodName);
		return cdsservice.gstDetailsByName(user_name);	
	}
	
	@GetMapping(value = "/getbankDetails/{bank_name}") //pathvariable
	public List<Bank_Details> getBankDetails(@PathVariable("bank_name") String bank_name) {
		//System.out.println(prodName);
		return cdsservice.getBankDetails(bank_name);	
	}
	
	@GetMapping(value = "/getbankIdDetails/{userid}") //pathvariable
	public List<Bank_Details> getBankDetailsById(@PathVariable("userid") Integer userid) {
		//System.out.println(prodName);
		return cdsservice.getBankDetailsById(userid);	
	}
	
	@GetMapping(value = "/getorgIdDetails/{id}") //pathvariable
	public List<Organizational_Details> getOrgDetails(@PathVariable("id") Integer id) {
		//System.out.println(prodName);
		return cdsservice.getOrgDetails(id);	
	}
	
	
	
	@GetMapping(value = "/listAllbankmst") //pathvariable
	public List<Bank_mst> listAllbank_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllbank_mst();	
	}
	
	@GetMapping(value = "/listAlldepartmentmst") //pathvariable
	public List<Department_Master_by_Corporate> listAllDepartment_Master_by_Corporate()  {
		//System.out.println(prodName);
		return cdsservice.listAllDepartment_Master_by_Corporate();	
	}
	
	@GetMapping(value = "/listAlldocumenttype") //pathvariable
	public List<Documenttype_mst> listAllDocumenttype_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllDocumenttype_mst();	
	}
	
	@GetMapping(value = "/listAllgender") //pathvariable
	public List<Gender_mst> listAllGender_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllGender_mst();	
	}
	
	@GetMapping(value = "/listAllgststate") //pathvariable
	public List<Gst_State_mst> listAllGst_State_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllGst_State_mst();	
	}
	
	@GetMapping(value = "/listAllPhonetype") //pathvariable
	public List<Phonetype_mst> listAllPhonetype_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllPhonetype_mst();	
	}
	
	@GetMapping(value = "/listAllProfiletype") //pathvariable
	public List<Profiletype_mst> listAllProfiletype_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllProfiletype_mst();	
	}
	
	@GetMapping(value = "/listAllRoles") //pathvariable
	public List<Roles> listAllRoles()  {
		//System.out.println(prodName);
		return cdsservice.listAllRoles();	
	}
	
	@GetMapping(value = "/listAllTitle") //pathvariable
	public List<Title_mst> listAllTitle_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllTitle_mst();	
	}
	
	@GetMapping(value = "/listAllUserstaus") //pathvariable
	public List<Userstaus_mst> listAllUserstaus_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllUserstaus_mst();	
	}
	
	@PostMapping(value = "/listAllAddresstype_mst") //pathvariable
	public List<Addresstype_mst> listAllAddresstype_mst()  {
		//System.out.println(prodName);
		return cdsservice.listAllAddresstype_mst();	
	}
	
	
	//get & post
	
	@PostMapping(value = "/addressadd")
	public void AddAddress( @RequestBody Address_master address) {
		cdsservice.AddAddress(address);
	}

	@GetMapping(value = "/getAddress/{userid}") //pathvariable
	public List<Address_master> listAddress(@PathVariable("userid") Integer userid){
		//System.out.println(prodName);
		return cdsservice.listAddress(userid);	
	}


//	Companybranch
	@PostMapping(value = "/Companybranchadd")
	public void AddCompany(@RequestBody Companybranch Company){
		cdsservice.AddCompany(Company);
	}
	
	@PostMapping(value = "/getCompanybranch/{id}") //pathvariable
	public List<Companybranch>listCompanybranch(@PathVariable("id") Integer id){
		//System.out.println(prodName);
		return cdsservice.listCompanybranch(id);	
	}
	
	@PostMapping(value = "/getCompanybranchbyparent/{parent}") //pathvariable
	public List<Companybranch>listCompanybranchbyparent(@PathVariable("parent") Integer parent){
		//System.out.println(prodName);
		return cdsservice.listCompanybranchbyparent(parent);	
	}
	
	
//	lnk_user_role
	
	@PostMapping(value = "/lnkuserrole")
	public void AddLnkuserRole(@RequestBody lnk_user_role userRole){
		cdsservice.AddLnkuserRole(userRole);
	}
	
	@GetMapping(value = "/getuserRolebyid/{userid}") //pathvariable
	public List<lnk_user_role> getuserRolebyid(@PathVariable("userid") Integer userid){
		//System.out.println(prodName);
		return cdsservice.getuserRolebyid(userid);	
	}
	
	@GetMapping(value = "/updateuserRolebyid/{userid}/{roleid}/{last_modified_date}/{modified_by}")
	public void UpdateuserRolebyid(@PathVariable("userid") Integer  userid,@PathVariable("roleid") Integer roleid,@PathVariable("last_modified_date")  String last_modified_date,@PathVariable("modified_by")  String modified_by) {
		cdsservice.UpdateuserRolebyid( userid, roleid,  last_modified_date,  modified_by);
	}
	
	
	
//	Passport_master
	
	@PostMapping(value = "/AddPassport")
	public void AddPassport_master(@RequestBody Passport passport_maste){
		cdsservice.AddPassport_master(passport_maste);
	}
	
	@GetMapping(value = "/getpassportbyid/{userid}") //pathvariable
	public List<Passport> getpassportbyid(@PathVariable("userid") Integer userid){
		//System.out.println(prodName);
		return cdsservice.getpassportbyid(userid);	
	}
	
	@GetMapping(value = "/updatepassportbybyid/{userid}/{expiry_date}/{modified_date}/{modified_by}")
	public void Updatepassportbybyid(@PathVariable("userid")Integer userid, @PathVariable("expiry_date")String expiry_date,@PathVariable("modified_date") String modified_date,@PathVariable("modified_by") String modified_by) {
		cdsservice.Updatepassportbybyid(userid, expiry_date,modified_date,modified_by );
	}
	
	
//	state_master	
	@PostMapping(value = "/Addstatemaster")
	public void Addstate_master(@RequestBody State_master state_master){
		cdsservice.Addstate_master(state_master);
	}
	
	@PostMapping(value = "/getstatebyid/{country_id}") //pathvariable
	public List<State_master> getstatebyid(@PathVariable("country_id") String country_id){
		//System.out.println(prodName);
		return cdsservice.getstatebyid(country_id);	
	}
	
//	user_type
	@PostMapping(value = "/Addusertype")
	public void Adduser_type(@RequestBody User_Type user_type){
		cdsservice.Adduser_type(user_type);
	}
	
	@PostMapping(value = "/getusertypebyid/{id}") //pathvariable
	public List<User_Type> getusertypebyid(@PathVariable("id") Integer id){
		//System.out.println(prodName);
		return cdsservice.getusertypebyid(id);	
	}

	
//	visa
	
	@PostMapping(value = "/Addvisa")
	public void AddVisa(@RequestBody Visa visa){
		cdsservice.AddVisa(visa);
	}
	
	@GetMapping(value = "/getuservisabyUid/{userid}") //pathvariable
	public List<Visa>  getuservisabyUid(@PathVariable("userid") Integer userid){
		//System.out.println(prodName);
		return cdsservice.getuservisabyUid(userid);	
	}
	
	@GetMapping(value = "/updatevisabybyUid/{userid}/{expiry_date}/{modified_date}/{modified_by}")
	public void UpdatevisabybyUid(@PathVariable("userid")Integer userid, @PathVariable("expiry_date")String expiry_date,@PathVariable("modified_date") String modified_date,@PathVariable("modified_by") String modified_by) {
		cdsservice.UpdatevisabybyUid(userid, expiry_date,modified_date,modified_by );
	}
	
//	insurance
	
	@PostMapping(value = "/Addinsurance")
	public void AddInsurance(@RequestBody Insurance insurance){
		cdsservice.AddInsurance(insurance);
	}
	
	@GetMapping(value = "/getuserinsurancebyUid/{userid}") //pathvariable
	public List<Insurance> getuserinsurancebyUid(@PathVariable("userid") Integer userid){
		//System.out.println(prodName);
		return cdsservice.getuserinsurancebyUid(userid);	
	}
	
	
	
	@GetMapping(value = "/updateinsurancebybyUid/{userid}/{insurer}/{region}/{policy_no}/{start_date}/{end_date}/{nominee}")
	public void UpdateinsurancebybyUid(@PathVariable("userid")Integer userid,@PathVariable("insurer") String insurer,@PathVariable("region") String region,@PathVariable("policy_no") Integer policy_no,
			@PathVariable("start_date")String start_date,@PathVariable("end_date") String end_date,@PathVariable("nominee") String nominee){
		cdsservice.UpdateinsurancebybyUid(userid,insurer,region,policy_no,start_date,end_date,nominee);
	}
	
	
//	Company
	@GetMapping(value = "/getalluser/{company_id}") //pathvariable
	public List<User_Details> getalluser(@PathVariable("company_id")Integer company_id){
		//System.out.println(prodName);
		return cdsservice.getalluser(company_id);	
	}
	
	
	//////////////////////////////////
	
	
	@DeleteMapping("/gst/{sno}")
	private void deletegst(@PathVariable("sno") int sno) 
	{
		cdsservice.deleteGSTDetails(sno);
	}
	

	
}

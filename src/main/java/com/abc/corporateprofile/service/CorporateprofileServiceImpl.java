package com.abc.corporateprofile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.abc.corporateprofile.repository.CorporateAddressMasterRepository;
import com.abc.corporateprofile.repository.CorporateAddresstypeMstRepository;
import com.abc.corporateprofile.repository.CorporateBankDetailsRepository;
import com.abc.corporateprofile.repository.CorporateBankMstRepository;
import com.abc.corporateprofile.repository.CorporateCompanyBranchRepository;
import com.abc.corporateprofile.repository.CorporateCompanyRepository;
import com.abc.corporateprofile.repository.CorporateGenderMstRepository;
import com.abc.corporateprofile.repository.CorporateGststateMstRepository;
import com.abc.corporateprofile.repository.CorporateInsuranceMasterRepository;
import com.abc.corporateprofile.repository.CorporateLnkuserRoleRepository;
import com.abc.corporateprofile.repository.CorporatePassportMasterRepository;
import com.abc.corporateprofile.repository.CorporatePhonetypeMstRepository;
import com.abc.corporateprofile.repository.CorporateProfiletypeMstRepository;
import com.abc.corporateprofile.repository.CorporateRolesRepository;
import com.abc.corporateprofile.repository.CorporateStateMasterRepository;
import com.abc.corporateprofile.repository.CorporateTitleMstRepository;
import com.abc.corporateprofile.repository.CorporateUserTypeRepository;
import com.abc.corporateprofile.repository.CorporateUserstausMstRepository;
import com.abc.corporateprofile.repository.CorporateVisaMasterRepository;
import com.abc.corporateprofile.repository.CorporatedepartmentmasterbycorporateRepository;
import com.abc.corporateprofile.repository.CorporatedocumenttypeMstRepository;
import com.abc.corporateprofile.repository.CorporategstDetailRepository;
import com.abc.corporateprofile.repository.CorporateorgDetailRepository;
import com.abc.corporateprofile.repository.CorporateprofileRepository;

@Service("cdsservice")
@Transactional
public class CorporateprofileServiceImpl implements ICorporateprofileService {

	@Autowired
	private EmailService emailService;
	@Autowired
	CorporateprofileRepository cdsrepository;

	public void AddUser(User_Details user_Details) {
		if (cdsrepository.save(user_Details) != null) {
			String to = user_Details.getEmail_id();
			String password = user_Details.getPassword();

			emailService.sendMail(to, "Your password  ", password);

		} else {

		}
		cdsrepository.save(user_Details);

	}

	@Autowired
	CorporateorgDetailRepository orgrepository;

	public void UpdateOrg(Organizational_Details organizational_Details) {
		orgrepository.save(organizational_Details);
	}

	@Override
	public User_Details loginUser(User_Details a) {
		List<User_Details> data = cdsrepository.findAll();
		User_Details mya = null;
		for (User_Details user_Details : data) {
			if (user_Details.getEmail_id().equals(a.getEmail_id())
					&& user_Details.getPassword().equals(a.getPassword())) {
				mya = user_Details;
			}

		}
		return mya;
	}

//	@Override
//	public List<User_Details> GetAllUsers(Integer id){
//		// TODO Auto-generated method stub
//		return cdsrepository.GetAllUsers(id);
//	}
//	
	@Override
	public User_Details checkpassword(User_Details p) {
		List<User_Details> data = cdsrepository.findAll();
		User_Details mya = null;
		for (User_Details user_Details : data) {
			if (user_Details.getEmail_id().equals(p.getEmail_id())
					&& user_Details.getPassword().equals(p.getPassword())) {
				mya = user_Details;
				boolean viewstatus = true;
				System.out.println("Password Match" + viewstatus);
			} else {
				mya = null;
				System.out.println("Password Not Match");
			}
		}
		return mya;
	}

	@Autowired
	CorporategstDetailRepository gstrepository;

	public void AddGSTDetails(GST_Details gst_Details) {
		gstrepository.save(gst_Details);

	}

	@Override
	public void deleteGSTDetails(int sno) {
		gstrepository.deleteById(sno);
	}

	@Autowired
	CorporateBankDetailsRepository bankrepository;

	public void AddBankDetails(Bank_Details bank_Details) {
		bankrepository.save(bank_Details);

	}

	@Override
	public User_Details searchUser(User_Details b) {
		List<User_Details> data = cdsrepository.findAll();
		User_Details mya = new User_Details();
		for (User_Details user_Details : data) {
			if (user_Details.getEmail_id().equals(b.getEmail_id()) || user_Details.getFname().equals(b.getFname())
					|| user_Details.getUser_type().equals(b.getUser_type())
					|| user_Details.getUserid().equals(b.getUserid())
					|| user_Details.getPhone_number().equals(b.getPhone_number())) {
				mya = user_Details;
			}
		}
		return mya;
	}

	

	@Override
	public List<GST_Details> gstDetailsByName(String user_name) {
		// TODO Auto-generated method stub
		return cdsrepository.gstDetailsByName(user_name);
	}

	@Override
	public List<Bank_Details> getBankDetails(String bank_name) {
		// TODO Auto-generated method stub
		return cdsrepository.getBankDetails(bank_name);
	}

	@Override
	public List<Bank_Details> getBankDetailsById(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.getBankDetailsById(userid);
	}

	@Override
	public List<Organizational_Details> getOrgDetails(Integer id) {
		// TODO Auto-generated method stub
		return cdsrepository.getOrgDetails(id);
	}

	/////

	@Override
	public void logout(String email_id, String last_login_date) {
		// TODO Auto-generated method stub
		cdsrepository.logout(email_id, last_login_date);
//		addressmasterrepository.logout(email_id, last_login_date);
	}
//	public void Send_email(String email_id, Boolean send_email) {
//		cdsrepository.Send_email( email_id,  send_email);
//	}
//	
	////

	@Override
	public void changepassword(String password, String email_id, String last_modified_date, String modified_by,
			String new_password) {
		// TODO Auto-generated method stub

		cdsrepository.changepassword(password, email_id, last_modified_date, modified_by, new_password);
		emailService.sendMail(email_id, "Your new password  ", new_password);
	}

	@Override
	public void updateUserInfo(String email_id, String phone_number, Boolean is_meal, boolean is_baggage,
			boolean is_hold_booking, boolean is_approver, boolean is_travel_arranger, boolean is_trip_claim_approver) {
		// TODO Auto-generated method stub
		cdsrepository.updateUserInfo(email_id, phone_number, is_meal, is_baggage, is_hold_booking, is_approver,
				is_travel_arranger, is_trip_claim_approver);
	}

	@Override
	public void updatePersonalInfo(String email_id, String title, String fname, String last_name, String gender,
			String residency, String nationality, String dob, boolean is_flight_arranger_group,
			boolean is_flight_approver_group, String profile_type, Integer htl_travel_arranger_group,
			Integer htl_approver_group, Integer claim_approver_group) {
		// TODO Auto-generated method stub
		cdsrepository.updatePersonalInfo(email_id, title, fname, last_name, gender, residency, nationality, dob,
				is_flight_arranger_group, is_flight_approver_group, profile_type, htl_travel_arranger_group,
				htl_approver_group, claim_approver_group);
	}

	@Override
	public void updateOrgInfo(Integer id, String employee_code, String designation, String band, String location,
			String department, String cost_center, String project_code, String domestic_eligibility,
			String international_eligibility, String date_of_joining, String date_of_termination) {
		// TODO Auto-generated method stub
		cdsrepository.updateOrgInfo(id, employee_code, designation, band, location, department, cost_center,
				project_code, domestic_eligibility, international_eligibility, date_of_joining, date_of_termination);
	}

	@Autowired
	CorporateBankMstRepository bankmstrepository;

	public List<Bank_mst> listAllbank_mst() {
		// TODO Auto-generated method stub
		return bankmstrepository.findAll();
	}

	@Autowired
	CorporatedepartmentmasterbycorporateRepository departmentmstrepository;

	public List<Department_Master_by_Corporate> listAllDepartment_Master_by_Corporate() {
		// TODO Auto-generated method stub
		return departmentmstrepository.findAll();
	}

	@Autowired
	CorporatedocumenttypeMstRepository documenttypemstrepository;

	public List<Documenttype_mst> listAllDocumenttype_mst() {
		// TODO Auto-generated method stub
		return documenttypemstrepository.findAll();
	}

	@Autowired
	CorporateGenderMstRepository gendermstrepository;

	public List<Gender_mst> listAllGender_mst() {
		// TODO Auto-generated method stub
		return gendermstrepository.findAll();
	}

	@Autowired
	CorporateGststateMstRepository gststatemstrepository;

	public List<Gst_State_mst> listAllGst_State_mst() {
		// TODO Auto-generated method stub
		return gststatemstrepository.findAll();
	}

	@Autowired
	CorporatePhonetypeMstRepository phonetypemstrepository;

	public List<Phonetype_mst> listAllPhonetype_mst() {
		// TODO Auto-generated method stub
		return phonetypemstrepository.findAll();
	}

	@Autowired
	CorporateProfiletypeMstRepository profiletypemstrepository;

	public List<Profiletype_mst> listAllProfiletype_mst() {
		// TODO Auto-generated method stub
		return profiletypemstrepository.findAll();
	}

	@Autowired
	CorporateRolesRepository rolesrepository;

	public List<Roles> listAllRoles() {
		// TODO Auto-generated method stub
		return rolesrepository.findAll();
	}

	@Autowired
	CorporateTitleMstRepository titlemstrepository;

	public List<Title_mst> listAllTitle_mst() {
		// TODO Auto-generated method stub
		return titlemstrepository.findAll();
	}

	@Autowired
	CorporateUserstausMstRepository userstausmstrepository;

	public List<Userstaus_mst> listAllUserstaus_mst() {
		// TODO Auto-generated method stub
		return userstausmstrepository.findAll();
	}

	@Autowired
	CorporateAddresstypeMstRepository addresstypemstrepository;

	public List<Addresstype_mst> listAllAddresstype_mst() {
		// TODO Auto-generated method stub
		return addresstypemstrepository.findAll();
	}

	// get & post
	@Autowired
	CorporateAddressMasterRepository addressrepository;

	public void AddAddress(Address_master address) {
		// TODO Auto-generated method stub
		addressrepository.save(address);
	}

	@Override
	public List<Address_master> listAddress(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.listAddress(userid);
	}

//	Companybranch
	@Autowired
	CorporateCompanyBranchRepository Companyrepository;

	public void AddCompany(Companybranch Company) {
		// TODO Auto-generated method stub
		Companyrepository.save(Company);
	}

	@Override
	public List<Companybranch> listCompanybranch(Integer id) {
		// TODO Auto-generated method stub
		return cdsrepository.listCompanybranch(id);
	}

	@Override
	public List<Companybranch> listCompanybranchbyparent(Integer parent) {
		// TODO Auto-generated method stub
		return cdsrepository.listCompanybranchbyparent(parent);
	}

//	lnk_user_role
	@Autowired
	CorporateLnkuserRoleRepository userrolerepository;

	public void AddLnkuserRole(lnk_user_role userRole) {
		// TODO Auto-generated method stub
		userrolerepository.save(userRole);

	}

	@Override
	public List<lnk_user_role> getuserRolebyid(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.getuserRolebyid(userid);
	}

	@Override
	public void UpdateuserRolebyid(Integer userid, Integer roleid, String last_modified_date, String modified_by) {
		// TODO Auto-generated method stub
		cdsrepository.UpdateuserRolebyid(userid, roleid, last_modified_date, modified_by);
	}

//	Passport_master
	@Autowired
	CorporatePassportMasterRepository passportmasterrepository;

	public void AddPassport_master(Passport passport_master) {
		// TODO Auto-generated method stub
		passportmasterrepository.save(passport_master);

	}

	@Override
	public List<Passport> getpassportbyid(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.getpassportbyid(userid);
	}

	@Override
	public void Updatepassportbybyid(Integer userid, String expiry_date, String modified_date, String modified_by) {
		// TODO Auto-generated method stub
		cdsrepository.Updatepassportbybyid(userid, expiry_date, modified_date, modified_by);
	}

//	state_master	
	@Autowired
	CorporateStateMasterRepository statemasterrepository;

	public void Addstate_master(State_master state_master) {
		// TODO Auto-generated method stub
		statemasterrepository.save(state_master);
	}

	@Override
	public List<State_master> getstatebyid(String country_id) {
		// TODO Auto-generated method stub
		return cdsrepository.getstatebyid(country_id);
	}

//	user_type

	@Autowired
	CorporateUserTypeRepository usertyperepository;

	public void Adduser_type(User_Type user_type) {
		// TODO Auto-generated method stub
		usertyperepository.save(user_type);

	}

	@Override
	public List<User_Type> getusertypebyid(Integer id) {
		// TODO Auto-generated method stub
		return cdsrepository.getusertypebyid(id);
	}

	@Autowired
	CorporateVisaMasterRepository visarepository;

	public void AddVisa(Visa visa) {
		// TODO Auto-generated method stub
		visarepository.save(visa);
	}

	@Override
	public List<Visa> getuservisabyUid(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.getuservisabyUid(userid);
	}

	@Override
	public void UpdatevisabybyUid(Integer userid, String expiry_date, String modified_date, String modified_by) {
		// TODO Auto-generated method stub
		cdsrepository.UpdatevisabybyUid(userid, expiry_date, modified_date, modified_by);
	}

//	insurance
	@Autowired
	CorporateInsuranceMasterRepository insurancerepository;

	public void AddInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		insurancerepository.save(insurance);

	}

	@Override
	public List<Insurance> getuserinsurancebyUid(Integer userid) {
		// TODO Auto-generated method stub
		return cdsrepository.getuserinsurancebyUid(userid);
	}

	@Override
	public void UpdateinsurancebybyUid(Integer userid, String insurer, String region, Integer policy_no,
			String start_date, String end_date, String nominee) {
		// TODO Auto-generated method stub
		cdsrepository.UpdateinsurancebybyUid(userid, insurer, region, policy_no, start_date, end_date, nominee);

	}

	@Autowired
	CorporateCompanyRepository companyrepository;

	public void AddCompany(Company company) {
		// TODO Auto-generated method stub
		companyrepository.save(company);
	}

	@Override
	public List<User_Details> getalluser(Integer company_id) {
		// TODO Auto-generated method stub
		return companyrepository.getalluser(company_id);
	}

//	@Override
//	public User_Details searchUser(User_Details b) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<User_Details> searchUsers(Integer userid, String fname, String user_type, String status,
			String email_id, String phone_number) {
		// TODO Auto-generated method stub
		return gstrepository.searchUsers(userid, fname, user_type, status, email_id, phone_number);
	}

	@Override
	public List<GST_Details> getGSTDetails(String user_email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletepassport(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePassengerConfig(int id) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public List<GST_Details> getGSTDetails(String user_email) {
//		// TODO Auto-generated method stub
//		return cdsrepository.getGSTDetails(user_email);
//	}

}

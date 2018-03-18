package uvsoftgroup.springbootadminserver.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity(name="userregistration")
public class UserRegistration implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @TableGenerator(name="usr_seq",table="usrseqtable",
	 pkColumnName="usrkey", pkColumnValue="usrvalue", initialValue=100,allocationSize=1)
	 @GeneratedValue(strategy=GenerationType.TABLE, generator="usr_seq")
	 Long userRegistrationId;
	 Long userAddressId;
	 String userRegistrationFName;
	 String userRegistrationMName;
	 String userRegistrationLName;
	 String userRegistrationName;
	 String userRegistrationPassword;
	 String userRegistrationfullName;
	 Date userRegistrationCrDate;
	  byte[] bioMetricPhoto=null;
	  byte[] nationalId=null;
	  byte[] birthCertificate=null;
	  byte[] passportCopy=null;
	  byte[] drivingLicense=null;
	  
	
	  @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	  @JoinColumn(name="user_id")
	  List<UserRole> userRoles=new ArrayList<UserRole>();
	  
	
	public UserRegistration() {
		
	}
	
	

	public UserRegistration(Long userRegistrationId, Long userAddressId, String userRegistrationFName,
			String userRegistrationMName, String userRegistrationLName, String userRegistrationName,
			String userRegistrationPassword, String userRegistrationfullName, Date userRegistrationCrDate,
			byte[] bioMetricPhoto, byte[] nationalId, byte[] birthCertificate, byte[] passportCopy,
			byte[] drivingLicense, List<UserRole> userRoles) {
		super();
		this.userRegistrationId = userRegistrationId;
		this.userAddressId = userAddressId;
		this.userRegistrationFName = userRegistrationFName;
		this.userRegistrationMName = userRegistrationMName;
		this.userRegistrationLName = userRegistrationLName;
		this.userRegistrationName = userRegistrationName;
		this.userRegistrationPassword = userRegistrationPassword;
		this.userRegistrationfullName = userRegistrationfullName;
		this.userRegistrationCrDate = userRegistrationCrDate;
		this.bioMetricPhoto = bioMetricPhoto;
		this.nationalId = nationalId;
		this.birthCertificate = birthCertificate;
		this.passportCopy = passportCopy;
		this.drivingLicense = drivingLicense;
		this.userRoles = userRoles;
	}



	public Long getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(Long userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	public Long getUserAddressId() {
		return userAddressId;
	}

	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getUserRegistrationFName() {
		return userRegistrationFName;
	}

	public void setUserRegistrationFName(String userRegistrationFName) {
		this.userRegistrationFName = userRegistrationFName;
	}

	public String getUserRegistrationMName() {
		return userRegistrationMName;
	}

	public void setUserRegistrationMName(String userRegistrationMName) {
		this.userRegistrationMName = userRegistrationMName;
	}

	public String getUserRegistrationLName() {
		return userRegistrationLName;
	}

	public void setUserRegistrationLName(String userRegistrationLName) {
		this.userRegistrationLName = userRegistrationLName;
	}

	public String getUserRegistrationName() {
		return userRegistrationName;
	}

	public void setUserRegistrationName(String userRegistrationName) {
		this.userRegistrationName = userRegistrationName;
	}

	public String getUserRegistrationPassword() {
		return userRegistrationPassword;
	}

	public void setUserRegistrationPassword(String userRegistrationPassword) {
		this.userRegistrationPassword = userRegistrationPassword;
	}

	public String getUserRegistrationfullName() {
		return userRegistrationfullName;
	}

	public void setUserRegistrationfullName(String userRegistrationfullName) {
		this.userRegistrationfullName = userRegistrationfullName;
	}

	public Date getUserRegistrationCrDate() {
		return userRegistrationCrDate;
	}

	public void setUserRegistrationCrDate(Date userRegistrationCrDate) {
		this.userRegistrationCrDate = userRegistrationCrDate;
	}

	public byte[] getBioMetricPhoto() {
		return bioMetricPhoto;
	}

	public void setBioMetricPhoto(byte[] bioMetricPhoto) {
		this.bioMetricPhoto = bioMetricPhoto;
	}

	public byte[] getNationalId() {
		return nationalId;
	}

	public void setNationalId(byte[] nationalId) {
		this.nationalId = nationalId;
	}

	public byte[] getBirthCertificate() {
		return birthCertificate;
	}

	public void setBirthCertificate(byte[] birthCertificate) {
		this.birthCertificate = birthCertificate;
	}

	public byte[] getPassportCopy() {
		return passportCopy;
	}

	public void setPassportCopy(byte[] passportCopy) {
		this.passportCopy = passportCopy;
	}

	public byte[] getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(byte[] drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	  
	  
	 
}

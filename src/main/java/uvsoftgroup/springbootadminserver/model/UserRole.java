package uvsoftgroup.springbootadminserver.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity(name="userrole")
public class UserRole implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @TableGenerator(name="ur_seq",table="urseqtable",
	 pkColumnName="urkey", pkColumnValue="urvalue", initialValue=200,allocationSize=1)
	 @GeneratedValue(strategy=GenerationType.TABLE, generator="ur_seq")
	 Long userRoleId;
	 String userRoleName;
	 String userRoleType;
	 Date userRoleDate;
	 
	 

	public UserRole() {
	}
	

	public UserRole(Long userRoleId, String userRoleName, String userRoleType, Date userRoleDate) {
		super();
		this.userRoleId = userRoleId;
		this.userRoleName = userRoleName;
		this.userRoleType = userRoleType;
		this.userRoleDate = userRoleDate;
	}


	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public String getUserRoleType() {
		return userRoleType;
	}

	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}

	public Date getUserRoleDate() {
		return userRoleDate;
	}

	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}

	
	 
	
}

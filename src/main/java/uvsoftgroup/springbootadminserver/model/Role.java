package uvsoftgroup.springbootadminserver.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity(name="loginrole")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="loginrole_seq",table="loginroleseqtable",
	 pkColumnName="loginrolekey", pkColumnValue="loginrolevalue", initialValue=400,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="loginrole_seq")
	@Id
    private Long id;
    private String name;
    private String type;
    private String subType;
    
    
      @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	  @JoinColumn(name="userrole_id")
	  private User user;

    Role() {}

    
	public Role(Long id, String name, String type, String subType, User user) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.subType = subType;
		this.user = user;
	}


	public Role(String name) {
        this.name = name;
    }

	
	
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSubType() {
		return subType;
	}


	public void setSubType(String subType) {
		this.subType = subType;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

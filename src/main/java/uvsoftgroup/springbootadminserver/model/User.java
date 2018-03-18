package uvsoftgroup.springbootadminserver.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name="loginuser")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="loginuser_seq",table="loginuserseqtable",
	 pkColumnName="loginuserkey", pkColumnValue="loginuservalue", initialValue=300,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="loginuser_seq")
	@Id
    private Long id;
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @Column(name="userrole_id")
    private List<Role> roles=new ArrayList<Role>();

    public User() {}

    public User(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
    
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

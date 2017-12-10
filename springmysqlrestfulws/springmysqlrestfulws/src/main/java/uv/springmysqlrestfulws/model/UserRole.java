/**
 * 
 */
package uv.springmysqlrestfulws.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author A.Riaydh
 *
 */
@Entity
public class UserRole implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	 Long userRoleId;
	 String userRoleName;
	 String userRoleType;
	 Date userRoleDate;
	 
	 @ManyToOne(fetch=FetchType.LAZY)
	 @JoinColumn(name="userRegistrationId")
	 private UserRegistration userRegistration;
	 
	 
	
	public UserRegistration getUserRegistration() {
		return userRegistration;
	}
	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
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

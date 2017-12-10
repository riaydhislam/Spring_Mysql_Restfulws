/**
 * 
 */
package uv.springmysqlrestfulws.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author A.Riaydh
 *
 */
@Entity
public class UserRegistration implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	 Long userRegistrationId;
	 Long userAddressId;
	 String userRegistrationFName;
	 String userRegistrationMName;
	 String userRegistrationLName;
	 String userRegistrationName;
	 String userRegistrationPassword;
	 String userRegistrationfullName;
	 Date   userRegistrationCrDate;
	 Date userRegistrationLDate;
	 
	 @OneToMany(fetch=FetchType.LAZY)
	 @JoinColumn(name="userRegistrationId")
	 private List<UserRole> userRoles;

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

	public Date getUserRegistrationLDate() {
		return userRegistrationLDate;
	}

	public void setUserRegistrationLDate(Date userRegistrationLDate) {
		this.userRegistrationLDate = userRegistrationLDate;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	 
}

/**
 * 
 */
package uv.springmysqlrestfulws.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author A.Riaydh
 *
 */
@Entity
public class FloorInfoOwnershipInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long owId;
	Long owAddressId;
	String owFullName;
	String owType;
	Date owAppliedDate;
	Date owLastModifiedDate;
	Date owApprovedDate;
	String owStatus;
	String owRemark;
	Long owFlId;
	
	
	public FloorInfoOwnershipInfo() {
		super();
	}
	public Long getOwId() {
		return owId;
	}
	public void setOwId(Long owId) {
		this.owId = owId;
	}
	public Long getOwAddressId() {
		return owAddressId;
	}
	public void setOwAddressId(Long owAddressId) {
		this.owAddressId = owAddressId;
	}
	public String getOwFullName() {
		return owFullName;
	}
	public void setOwFullName(String owFullName) {
		this.owFullName = owFullName;
	}
	public String getOwType() {
		return owType;
	}
	public void setOwType(String owType) {
		this.owType = owType;
	}
	public Date getOwAppliedDate() {
		return owAppliedDate;
	}
	public void setOwAppliedDate(Date owAppliedDate) {
		this.owAppliedDate = owAppliedDate;
	}
	public Date getOwLastModifiedDate() {
		return owLastModifiedDate;
	}
	public void setOwLastModifiedDate(Date owLastModifiedDate) {
		this.owLastModifiedDate = owLastModifiedDate;
	}
	public Date getOwApprovedDate() {
		return owApprovedDate;
	}
	public void setOwApprovedDate(Date owApprovedDate) {
		this.owApprovedDate = owApprovedDate;
	}
	public String getOwStatus() {
		return owStatus;
	}
	public void setOwStatus(String owStatus) {
		this.owStatus = owStatus;
	}
	public String getOwRemark() {
		return owRemark;
	}
	public void setOwRemark(String owRemark) {
		this.owRemark = owRemark;
	}
	public Long getOwFlId() {
		return owFlId;
	}
	public void setOwFlId(Long owFlId) {
		this.owFlId = owFlId;
	}

}

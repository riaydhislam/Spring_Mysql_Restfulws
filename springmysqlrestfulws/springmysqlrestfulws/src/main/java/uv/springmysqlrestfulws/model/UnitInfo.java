/**
 * 
 */
package uv.springmysqlrestfulws.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
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
public class UnitInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long unId;
	Long unflId;
	Long unAddressId;
	String unCode;
	String unName;
	String unUseType;
	Double unNumberOfFloorUnit;
	Double unTotalUnitArea;
	Double unTotalHeight;
	Double unCenterLongitude;
	Double unCenterLatitude;
	byte [] unLayoutPicture;
	String unRemark;
	
	@OneToMany
	@JoinColumn(name="un_id_id")
	List<UnitInfoAuthorizationInfo> unitInfoAuthorizationInfo = new ArrayList<UnitInfoAuthorizationInfo>();
	
	@OneToMany
	@JoinColumn(name="un_id_id")
	List<UnitInfoBillingInfo > unitInfoBillingInfo = new ArrayList<UnitInfoBillingInfo>();
	
	@OneToMany
	@JoinColumn(name="un_id_id")
	List<UnitInfoOwnershipInfo> unitInfoOwnershipInfo = new ArrayList<UnitInfoOwnershipInfo>();
	
	@OneToMany
	@JoinColumn(name="un_id_id")
	List<UnitInfoPaymentInfo> unitInfoPaymentInfo = new ArrayList<UnitInfoPaymentInfo>();
	
	@OneToMany
	@JoinColumn(name="un_id_id")
	List<UnitInfoUtilityInfo> unitInfoUtilityInfo = new ArrayList<UnitInfoUtilityInfo>();
	
	public List<UnitInfoAuthorizationInfo> getUnitInfoAuthorizationInfo() {
		return unitInfoAuthorizationInfo;
	}
	public void setUnitInfoAuthorizationInfo(
			List<UnitInfoAuthorizationInfo> unitInfoAuthorizationInfo) {
		this.unitInfoAuthorizationInfo = unitInfoAuthorizationInfo;
	}
	public List<UnitInfoBillingInfo> getUnitInfoBillingInfo() {
		return unitInfoBillingInfo;
	}
	public void setUnitInfoBillingInfo(List<UnitInfoBillingInfo> unitInfoBillingInfo) {
		this.unitInfoBillingInfo = unitInfoBillingInfo;
	}
	public List<UnitInfoOwnershipInfo> getUnitInfoOwnershipInfo() {
		return unitInfoOwnershipInfo;
	}
	public void setUnitInfoOwnershipInfo(
			List<UnitInfoOwnershipInfo> unitInfoOwnershipInfo) {
		this.unitInfoOwnershipInfo = unitInfoOwnershipInfo;
	}
	public List<UnitInfoPaymentInfo> getUnitInfoPaymentInfo() {
		return unitInfoPaymentInfo;
	}
	public void setUnitInfoPaymentInfo(List<UnitInfoPaymentInfo> unitInfoPaymentInfo) {
		this.unitInfoPaymentInfo = unitInfoPaymentInfo;
	}
	public List<UnitInfoUtilityInfo> getUnitInfoUtilityInfo() {
		return unitInfoUtilityInfo;
	}
	public void setUnitInfoUtilityInfo(List<UnitInfoUtilityInfo> unitInfoUtilityInfo) {
		this.unitInfoUtilityInfo = unitInfoUtilityInfo;
	}
	public UnitInfo() {
		super();
	}
	public Long getUnId() {
		return unId;
	}
	public void setUnId(Long unId) {
		this.unId = unId;
	}
	public Long getUnflId() {
		return unflId;
	}
	public void setUnflId(Long unflId) {
		this.unflId = unflId;
	}
	public Long getUnAddressId() {
		return unAddressId;
	}
	public void setUnAddressId(Long unAddressId) {
		this.unAddressId = unAddressId;
	}
	public String getUnCode() {
		return unCode;
	}
	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}
	public String getUnName() {
		return unName;
	}
	public void setUnName(String unName) {
		this.unName = unName;
	}
	public String getUnUseType() {
		return unUseType;
	}
	public void setUnUseType(String unUseType) {
		this.unUseType = unUseType;
	}
	public Double getUnNumberOfFloorUnit() {
		return unNumberOfFloorUnit;
	}
	public void setUnNumberOfFloorUnit(Double unNumberOfFloorUnit) {
		this.unNumberOfFloorUnit = unNumberOfFloorUnit;
	}
	public Double getUnTotalUnitArea() {
		return unTotalUnitArea;
	}
	public void setUnTotalUnitArea(Double unTotalUnitArea) {
		this.unTotalUnitArea = unTotalUnitArea;
	}
	public Double getUnTotalHeight() {
		return unTotalHeight;
	}
	public void setUnTotalHeight(Double unTotalHeight) {
		this.unTotalHeight = unTotalHeight;
	}
	public Double getUnCenterLongitude() {
		return unCenterLongitude;
	}
	public void setUnCenterLongitude(Double unCenterLongitude) {
		this.unCenterLongitude = unCenterLongitude;
	}
	public Double getUnCenterLatitude() {
		return unCenterLatitude;
	}
	public void setUnCenterLatitude(Double unCenterLatitude) {
		this.unCenterLatitude = unCenterLatitude;
	}
	public byte[] getUnLayoutPicture() {
		return unLayoutPicture;
	}
	public void setUnLayoutPicture(byte[] unLayoutPicture) {
		this.unLayoutPicture = unLayoutPicture;
	}
	public String getUnRemark() {
		return unRemark;
	}
	public void setUnRemark(String unRemark) {
		this.unRemark = unRemark;
	}

}

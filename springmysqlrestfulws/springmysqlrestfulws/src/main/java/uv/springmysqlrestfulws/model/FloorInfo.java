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
public class FloorInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long flId;
	Long flBuId;
	Long flAddressId;
	String flCode;
	String flName;
	String flUseType;
	Double flNumberOfFloorUnit;
	Double flTotalFloorArea;
	Double flTotalFloorHeight;
	Double flCenterLongitude;
	Double flCenterLatitude;
	byte [] flLayoutPicture;
	String flRemark;
	
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List <FloorInfoAuthorizationInfo> floorInfoAuthorizationInfo = new ArrayList<FloorInfoAuthorizationInfo>();
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List<FloorInfoBillingInfo> floorInfoBillingInfo = new ArrayList<FloorInfoBillingInfo>();
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List <FloorInfoOwnershipInfo> floorInfoOwnershipInfo = new ArrayList<FloorInfoOwnershipInfo>();
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List<FloorInfoPaymentInfo> floorInfoPaymentInfo = new ArrayList<FloorInfoPaymentInfo>();
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List<FloorInfoUtilityInfo> FloorInfoUtilityInfo = new ArrayList<FloorInfoUtilityInfo>();
	@OneToMany
	@JoinColumn(name="fl_id_id")
	List<UnitInfo> unitInfo  = new ArrayList<UnitInfo>();
	public Long getFlId() {
		return flId;
	}
	public void setFlId(Long flId) {
		this.flId = flId;
	}
	public Long getFlBuId() {
		return flBuId;
	}
	public void setFlBuId(Long flBuId) {
		this.flBuId = flBuId;
	}
	public Long getFlAddressId() {
		return flAddressId;
	}
	public void setFlAddressId(Long flAddressId) {
		this.flAddressId = flAddressId;
	}
	public String getFlCode() {
		return flCode;
	}
	public void setFlCode(String flCode) {
		this.flCode = flCode;
	}
	public String getFlName() {
		return flName;
	}
	public void setFlName(String flName) {
		this.flName = flName;
	}
	public String getFlUseType() {
		return flUseType;
	}
	public void setFlUseType(String flUseType) {
		this.flUseType = flUseType;
	}
	public Double getFlNumberOfFloorUnit() {
		return flNumberOfFloorUnit;
	}
	public void setFlNumberOfFloorUnit(Double flNumberOfFloorUnit) {
		this.flNumberOfFloorUnit = flNumberOfFloorUnit;
	}
	public Double getFlTotalFloorArea() {
		return flTotalFloorArea;
	}
	public void setFlTotalFloorArea(Double flTotalFloorArea) {
		this.flTotalFloorArea = flTotalFloorArea;
	}
	public Double getFlTotalFloorHeight() {
		return flTotalFloorHeight;
	}
	public void setFlTotalFloorHeight(Double flTotalFloorHeight) {
		this.flTotalFloorHeight = flTotalFloorHeight;
	}
	public Double getFlCenterLongitude() {
		return flCenterLongitude;
	}
	public void setFlCenterLongitude(Double flCenterLongitude) {
		this.flCenterLongitude = flCenterLongitude;
	}
	public Double getFlCenterLatitude() {
		return flCenterLatitude;
	}
	public void setFlCenterLatitude(Double flCenterLatitude) {
		this.flCenterLatitude = flCenterLatitude;
	}
	public byte[] getFlLayoutPicture() {
		return flLayoutPicture;
	}
	public void setFlLayoutPicture(byte[] flLayoutPicture) {
		this.flLayoutPicture = flLayoutPicture;
	}
	public String getFlRemark() {
		return flRemark;
	}
	public void setFlRemark(String flRemark) {
		this.flRemark = flRemark;
	}
	public List<FloorInfoAuthorizationInfo> getFloorInfoAuthorizationInfo() {
		return floorInfoAuthorizationInfo;
	}
	public void setFloorInfoAuthorizationInfo(
			List<FloorInfoAuthorizationInfo> floorInfoAuthorizationInfo) {
		this.floorInfoAuthorizationInfo = floorInfoAuthorizationInfo;
	}
	public List<FloorInfoBillingInfo> getFloorInfoBillingInfo() {
		return floorInfoBillingInfo;
	}
	public void setFloorInfoBillingInfo(
			List<FloorInfoBillingInfo> floorInfoBillingInfo) {
		this.floorInfoBillingInfo = floorInfoBillingInfo;
	}
	public List<FloorInfoOwnershipInfo> getFloorInfoOwnershipInfo() {
		return floorInfoOwnershipInfo;
	}
	public void setFloorInfoOwnershipInfo(
			List<FloorInfoOwnershipInfo> floorInfoOwnershipInfo) {
		this.floorInfoOwnershipInfo = floorInfoOwnershipInfo;
	}
	public List<FloorInfoPaymentInfo> getFloorInfoPaymentInfo() {
		return floorInfoPaymentInfo;
	}
	public void setFloorInfoPaymentInfo(
			List<FloorInfoPaymentInfo> floorInfoPaymentInfo) {
		this.floorInfoPaymentInfo = floorInfoPaymentInfo;
	}
	public List<FloorInfoUtilityInfo> getFloorInfoUtilityInfo() {
		return FloorInfoUtilityInfo;
	}
	public void setFloorInfoUtilityInfo(
			List<FloorInfoUtilityInfo> floorInfoUtilityInfo) {
		FloorInfoUtilityInfo = floorInfoUtilityInfo;
	}
	public List<UnitInfo> getUnitInfo() {
		return unitInfo;
	}
	public void setUnitInfo(List<UnitInfo> unitInfo) {
		this.unitInfo = unitInfo;
	}  

	
	

}

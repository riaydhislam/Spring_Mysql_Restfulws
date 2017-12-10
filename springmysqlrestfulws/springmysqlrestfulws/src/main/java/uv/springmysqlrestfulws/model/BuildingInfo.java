/**
 * 
 */
package uv.springmysqlrestfulws.model;

import java.math.BigDecimal;
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
public class BuildingInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long buId;
	Long buAddressId;
	Long buPlId;
	String buCode;
	String buName;
	String buUseType;
	BigDecimal buNumberOfFloor;
	BigDecimal buTotalHeight;
	BigDecimal buNumberOfFloorUnit;
	BigDecimal buTotalGroundArea;
	BigDecimal buTotalFloorArea;
	BigDecimal buSetBackFront;
	BigDecimal buSetBackBack;
	BigDecimal buSetBackRight;
	BigDecimal buSetBackLeft;
	BigDecimal buCenterLongitude;
	BigDecimal buCenterLatitude;
	byte [] buLayoutPicture;
	String buRemark;
	
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<BuildingInfoAuthorizationInfo> buildingInfoAuthorizationInfo= new ArrayList<BuildingInfoAuthorizationInfo>();
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<BuildingInfoBillingInfo> buildingInfoBillingInfo = new ArrayList<BuildingInfoBillingInfo>();
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<BuildingInfoOwnershipInfo> buildingInfoOwnershipInfo = new ArrayList<BuildingInfoOwnershipInfo>();
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<BuildingInfoPaymentInfo> buildingInfoPaymentInfo = new ArrayList<BuildingInfoPaymentInfo>();
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<BuildingInfoUtilityInfo> buildingInfoUtilityInfo = new ArrayList<BuildingInfoUtilityInfo>();
	@OneToMany
	@JoinColumn(name="bu_id_id")
	List<FloorInfo> floorInfo = new ArrayList<FloorInfo>();
	
	public Long getBuId() {
		return buId;
	}
	public void setBuId(Long buId) {
		this.buId = buId;
	}
	public Long getBuAddressId() {
		return buAddressId;
	}
	public void setBuAddressId(Long buAddressId) {
		this.buAddressId = buAddressId;
	}
	public Long getBuPlId() {
		return buPlId;
	}
	public void setBuPlId(Long buPlId) {
		this.buPlId = buPlId;
	}
	public String getBuCode() {
		return buCode;
	}
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public String getBuUseType() {
		return buUseType;
	}
	public void setBuUseType(String buUseType) {
		this.buUseType = buUseType;
	}
	public BigDecimal getBuNumberOfFloor() {
		return buNumberOfFloor;
	}
	public void setBuNumberOfFloor(BigDecimal buNumberOfFloor) {
		this.buNumberOfFloor = buNumberOfFloor;
	}
	public BigDecimal getBuTotalHeight() {
		return buTotalHeight;
	}
	public void setBuTotalHeight(BigDecimal buTotalHeight) {
		this.buTotalHeight = buTotalHeight;
	}
	public BigDecimal getBuNumberOfFloorUnit() {
		return buNumberOfFloorUnit;
	}
	public void setBuNumberOfFloorUnit(BigDecimal buNumberOfFloorUnit) {
		this.buNumberOfFloorUnit = buNumberOfFloorUnit;
	}
	public BigDecimal getBuTotalGroundArea() {
		return buTotalGroundArea;
	}
	public void setBuTotalGroundArea(BigDecimal buTotalGroundArea) {
		this.buTotalGroundArea = buTotalGroundArea;
	}
	public BigDecimal getBuTotalFloorArea() {
		return buTotalFloorArea;
	}
	public void setBuTotalFloorArea(BigDecimal buTotalFloorArea) {
		this.buTotalFloorArea = buTotalFloorArea;
	}
	public BigDecimal getBuSetBackFront() {
		return buSetBackFront;
	}
	public void setBuSetBackFront(BigDecimal buSetBackFront) {
		this.buSetBackFront = buSetBackFront;
	}
	public BigDecimal getBuSetBackBack() {
		return buSetBackBack;
	}
	public void setBuSetBackBack(BigDecimal buSetBackBack) {
		this.buSetBackBack = buSetBackBack;
	}
	public BigDecimal getBuSetBackRight() {
		return buSetBackRight;
	}
	public void setBuSetBackRight(BigDecimal buSetBackRight) {
		this.buSetBackRight = buSetBackRight;
	}
	public BigDecimal getBuSetBackLeft() {
		return buSetBackLeft;
	}
	public void setBuSetBackLeft(BigDecimal buSetBackLeft) {
		this.buSetBackLeft = buSetBackLeft;
	}
	public BigDecimal getBuCenterLongitude() {
		return buCenterLongitude;
	}
	public void setBuCenterLongitude(BigDecimal buCenterLongitude) {
		this.buCenterLongitude = buCenterLongitude;
	}
	public BigDecimal getBuCenterLatitude() {
		return buCenterLatitude;
	}
	public void setBuCenterLatitude(BigDecimal buCenterLatitude) {
		this.buCenterLatitude = buCenterLatitude;
	}
	public byte[] getBuLayoutPicture() {
		return buLayoutPicture;
	}
	public void setBuLayoutPicture(byte[] buLayoutPicture) {
		this.buLayoutPicture = buLayoutPicture;
	}
	public String getBuRemark() {
		return buRemark;
	}
	public void setBuRemark(String buRemark) {
		this.buRemark = buRemark;
	}
	public List<BuildingInfoAuthorizationInfo> getBuildingInfoAuthorizationInfo() {
		return buildingInfoAuthorizationInfo;
	}
	public void setBuildingInfoAuthorizationInfo(
			List<BuildingInfoAuthorizationInfo> buildingInfoAuthorizationInfo) {
		this.buildingInfoAuthorizationInfo = buildingInfoAuthorizationInfo;
	}
	public List<BuildingInfoBillingInfo> getBuildingInfoBillingInfo() {
		return buildingInfoBillingInfo;
	}
	public void setBuildingInfoBillingInfo(
			List<BuildingInfoBillingInfo> buildingInfoBillingInfo) {
		this.buildingInfoBillingInfo = buildingInfoBillingInfo;
	}
	public List<BuildingInfoOwnershipInfo> getBuildingInfoOwnershipInfo() {
		return buildingInfoOwnershipInfo;
	}
	public void setBuildingInfoOwnershipInfo(
			List<BuildingInfoOwnershipInfo> buildingInfoOwnershipInfo) {
		this.buildingInfoOwnershipInfo = buildingInfoOwnershipInfo;
	}
	public List<BuildingInfoPaymentInfo> getBuildingInfoPaymentInfo() {
		return buildingInfoPaymentInfo;
	}
	public void setBuildingInfoPaymentInfo(
			List<BuildingInfoPaymentInfo> buildingInfoPaymentInfo) {
		this.buildingInfoPaymentInfo = buildingInfoPaymentInfo;
	}
	public List<BuildingInfoUtilityInfo> getBuildingInfoUtilityInfo() {
		return buildingInfoUtilityInfo;
	}
	public void setBuildingInfoUtilityInfo(
			List<BuildingInfoUtilityInfo> buildingInfoUtilityInfo) {
		this.buildingInfoUtilityInfo = buildingInfoUtilityInfo;
	}
	public List<FloorInfo> getFloorInfo() {
		return floorInfo;
	}
	public void setFloorInfo(List<FloorInfo> floorInfo) {
		this.floorInfo = floorInfo;
	}
	
	
	
}

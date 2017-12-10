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
public class AddressInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	 Long adId;
	 Long   adalId;
	 String adFirstName;
	 String adMiddleName;
	 String adLastName;
	 Date adBirthDate;
	 String adBirthCertificateNumber;
	 byte[] adBirthCertificateNumberPic;
	 String adNationalIdNumber;
	 byte[] adNationalIdNumberPic;
	 String adPassportNumber;
	 byte[] adPassportNumberPic;
	 String adSexStatus;
	 String adMobileNumber;
	 String adLandNumber;
	 String adEMail;
	 String adWeb;
	 String adWifeOrHaFullName;
	 String adWifeOrHusbandNationalId;
	 
	 String adFamilySize;
	 String adEducationLevel;
	 String adJobId;
	 String adJobStatus;
	 String adJobPosition;
	 String adJobProvider;
	 String adJobType;
	 Date adJoiningDate;
	 
	 String adFatherFullName;
	 String adFatherNationalId;
	 String adMotherFullName;
	 String adMotherNationalId;
	public Long getAdId() {
		return adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Long getAdalId() {
		return adalId;
	}
	public void setAdalId(Long adalId) {
		this.adalId = adalId;
	}
	public String getAdFirstName() {
		return adFirstName;
	}
	public void setAdFirstName(String adFirstName) {
		this.adFirstName = adFirstName;
	}
	public String getAdMiddleName() {
		return adMiddleName;
	}
	public void setAdMiddleName(String adMiddleName) {
		this.adMiddleName = adMiddleName;
	}
	public String getAdLastName() {
		return adLastName;
	}
	public void setAdLastName(String adLastName) {
		this.adLastName = adLastName;
	}
	public Date getAdBirthDate() {
		return adBirthDate;
	}
	public void setAdBirthDate(Date adBirthDate) {
		this.adBirthDate = adBirthDate;
	}
	public String getAdBirthCertificateNumber() {
		return adBirthCertificateNumber;
	}
	public void setAdBirthCertificateNumber(String adBirthCertificateNumber) {
		this.adBirthCertificateNumber = adBirthCertificateNumber;
	}
	public byte[] getAdBirthCertificateNumberPic() {
		return adBirthCertificateNumberPic;
	}
	public void setAdBirthCertificateNumberPic(byte[] adBirthCertificateNumberPic) {
		this.adBirthCertificateNumberPic = adBirthCertificateNumberPic;
	}
	public String getAdNationalIdNumber() {
		return adNationalIdNumber;
	}
	public void setAdNationalIdNumber(String adNationalIdNumber) {
		this.adNationalIdNumber = adNationalIdNumber;
	}
	public byte[] getAdNationalIdNumberPic() {
		return adNationalIdNumberPic;
	}
	public void setAdNationalIdNumberPic(byte[] adNationalIdNumberPic) {
		this.adNationalIdNumberPic = adNationalIdNumberPic;
	}
	public String getAdPassportNumber() {
		return adPassportNumber;
	}
	public void setAdPassportNumber(String adPassportNumber) {
		this.adPassportNumber = adPassportNumber;
	}
	public byte[] getAdPassportNumberPic() {
		return adPassportNumberPic;
	}
	public void setAdPassportNumberPic(byte[] adPassportNumberPic) {
		this.adPassportNumberPic = adPassportNumberPic;
	}
	public String getAdSexStatus() {
		return adSexStatus;
	}
	public void setAdSexStatus(String adSexStatus) {
		this.adSexStatus = adSexStatus;
	}
	public String getAdMobileNumber() {
		return adMobileNumber;
	}
	public void setAdMobileNumber(String adMobileNumber) {
		this.adMobileNumber = adMobileNumber;
	}
	public String getAdLandNumber() {
		return adLandNumber;
	}
	public void setAdLandNumber(String adLandNumber) {
		this.adLandNumber = adLandNumber;
	}
	public String getAdEMail() {
		return adEMail;
	}
	public void setAdEMail(String adEMail) {
		this.adEMail = adEMail;
	}
	public String getAdWeb() {
		return adWeb;
	}
	public void setAdWeb(String adWeb) {
		this.adWeb = adWeb;
	}
	public String getAdWifeOrHaFullName() {
		return adWifeOrHaFullName;
	}
	public void setAdWifeOrHaFullName(String adWifeOrHaFullName) {
		this.adWifeOrHaFullName = adWifeOrHaFullName;
	}
	public String getAdWifeOrHusbandNationalId() {
		return adWifeOrHusbandNationalId;
	}
	public void setAdWifeOrHusbandNationalId(String adWifeOrHusbandNationalId) {
		this.adWifeOrHusbandNationalId = adWifeOrHusbandNationalId;
	}
	public String getAdFamilySize() {
		return adFamilySize;
	}
	public void setAdFamilySize(String adFamilySize) {
		this.adFamilySize = adFamilySize;
	}
	public String getAdEducationLevel() {
		return adEducationLevel;
	}
	public void setAdEducationLevel(String adEducationLevel) {
		this.adEducationLevel = adEducationLevel;
	}
	public String getAdJobId() {
		return adJobId;
	}
	public void setAdJobId(String adJobId) {
		this.adJobId = adJobId;
	}
	public String getAdJobStatus() {
		return adJobStatus;
	}
	public void setAdJobStatus(String adJobStatus) {
		this.adJobStatus = adJobStatus;
	}
	public String getAdJobPosition() {
		return adJobPosition;
	}
	public void setAdJobPosition(String adJobPosition) {
		this.adJobPosition = adJobPosition;
	}
	public String getAdJobProvider() {
		return adJobProvider;
	}
	public void setAdJobProvider(String adJobProvider) {
		this.adJobProvider = adJobProvider;
	}
	public String getAdJobType() {
		return adJobType;
	}
	public void setAdJobType(String adJobType) {
		this.adJobType = adJobType;
	}
	public Date getAdJoiningDate() {
		return adJoiningDate;
	}
	public void setAdJoiningDate(Date adJoiningDate) {
		this.adJoiningDate = adJoiningDate;
	}
	public String getAdFatherFullName() {
		return adFatherFullName;
	}
	public void setAdFatherFullName(String adFatherFullName) {
		this.adFatherFullName = adFatherFullName;
	}
	public String getAdFatherNationalId() {
		return adFatherNationalId;
	}
	public void setAdFatherNationalId(String adFatherNationalId) {
		this.adFatherNationalId = adFatherNationalId;
	}
	public String getAdMotherFullName() {
		return adMotherFullName;
	}
	public void setAdMotherFullName(String adMotherFullName) {
		this.adMotherFullName = adMotherFullName;
	}
	public String getAdMotherNationalId() {
		return adMotherNationalId;
	}
	public void setAdMotherNationalId(String adMotherNationalId) {
		this.adMotherNationalId = adMotherNationalId;
	}


	
	
	
	 
}

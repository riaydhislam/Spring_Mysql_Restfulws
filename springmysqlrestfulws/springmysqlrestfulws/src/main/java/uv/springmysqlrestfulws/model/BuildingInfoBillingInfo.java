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
public class BuildingInfoBillingInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long biId;
	Long biCreaterAddressId;
	String biCreaterName;
	String biCreaterAuthority;
	Date biCreateDate;
	Date biPayDateUntil;
	Date biLastModifiedDate;
	Date biPrintDate;
	String biCurrency;
	String biCostType;
	byte [] biPrintCopy;
	Double biAmount;
	String biReferenceNumber;
	String biRemark;
	Long biBuId;
	
	
	
	
	public BuildingInfoBillingInfo() {
		super();
		
	}
	
	
	public Long getBiId() {
		return biId;
	}
	public void setBiId(Long biId) {
		this.biId = biId;
	}
	public Long getBiCreaterAddressId() {
		return biCreaterAddressId;
	}
	public void setBiCreaterAddressId(Long biCreaterAddressId) {
		this.biCreaterAddressId = biCreaterAddressId;
	}
	public String getBiCreaterName() {
		return biCreaterName;
	}
	public void setBiCreaterName(String biCreaterName) {
		this.biCreaterName = biCreaterName;
	}
	public String getBiCreaterAuthority() {
		return biCreaterAuthority;
	}
	public void setBiCreaterAuthority(String biCreaterAuthority) {
		this.biCreaterAuthority = biCreaterAuthority;
	}
	public Date getBiCreateDate() {
		return biCreateDate;
	}
	public void setBiCreateDate(Date biCreateDate) {
		this.biCreateDate = biCreateDate;
	}
	public Date getBiPayDateUntil() {
		return biPayDateUntil;
	}
	public void setBiPayDateUntil(Date biPayDateUntil) {
		this.biPayDateUntil = biPayDateUntil;
	}
	public Date getBiLastModifiedDate() {
		return biLastModifiedDate;
	}
	public void setBiLastModifiedDate(Date biLastModifiedDate) {
		this.biLastModifiedDate = biLastModifiedDate;
	}
	public Date getBiPrintDate() {
		return biPrintDate;
	}
	public void setBiPrintDate(Date biPrintDate) {
		this.biPrintDate = biPrintDate;
	}
	public String getBiCurrency() {
		return biCurrency;
	}
	public void setBiCurrency(String biCurrency) {
		this.biCurrency = biCurrency;
	}
	public String getBiCostType() {
		return biCostType;
	}
	public void setBiCostType(String biCostType) {
		this.biCostType = biCostType;
	}
	public byte[] getBiPrintCopy() {
		return biPrintCopy;
	}
	public void setBiPrintCopy(byte[] biPrintCopy) {
		this.biPrintCopy = biPrintCopy;
	}
	public Double getBiAmount() {
		return biAmount;
	}
	public void setBiAmount(Double biAmount) {
		this.biAmount = biAmount;
	}
	public String getBiReferenceNumber() {
		return biReferenceNumber;
	}
	public void setBiReferenceNumber(String biReferenceNumber) {
		this.biReferenceNumber = biReferenceNumber;
	}
	public String getBiRemark() {
		return biRemark;
	}
	public void setBiRemark(String biRemark) {
		this.biRemark = biRemark;
	}
	public Long getBiBuId() {
		return biBuId;
	}
	public void setBiBuId(Long biBuId) {
		this.biBuId = biBuId;
	}

}

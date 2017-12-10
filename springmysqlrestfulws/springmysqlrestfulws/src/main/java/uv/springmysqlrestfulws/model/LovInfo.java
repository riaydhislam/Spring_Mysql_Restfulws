/**
 * 
 */
package uv.springmysqlrestfulws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author A.Riaydh
 *
 */
@Entity
public class LovInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	Long loId;
	String tableName;
	String columnName;
	String lovKey;
	String lovValue;
	String lovRemark;
	
	public Long getLoId() {
		return loId;
	}
	public void setLoId(Long loId) {
		this.loId = loId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getLovKey() {
		return lovKey;
	}
	public void setLovKey(String lovKey) {
		this.lovKey = lovKey;
	}
	public String getLovValue() {
		return lovValue;
	}
	public void setLovValue(String lovValue) {
		this.lovValue = lovValue;
	}
	public String getLovRemark() {
		return lovRemark;
	}
	public void setLovRemark(String lovRemark) {
		this.lovRemark = lovRemark;
	}
	

}

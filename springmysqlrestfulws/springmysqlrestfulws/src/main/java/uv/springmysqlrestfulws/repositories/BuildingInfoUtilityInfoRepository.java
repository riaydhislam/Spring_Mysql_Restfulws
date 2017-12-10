/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.BuildingInfoUtilityInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="BuildingInfoUtilityInfo", path="buildingInfoUtilityInfos")
public interface BuildingInfoUtilityInfoRepository  extends PagingAndSortingRepository<BuildingInfoUtilityInfo, Long>{

}

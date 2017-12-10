/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.BuildingInfoAuthorizationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="buildingInfoAuthorizationInfo", path="buildingInfoAuthorizationInfos")
public interface BuildingInfoAuthorizationInfoRepository extends PagingAndSortingRepository<BuildingInfoAuthorizationInfo, Long>{

}

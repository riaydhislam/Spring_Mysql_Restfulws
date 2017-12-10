/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.BuildingInfoBillingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="buildingInfoBillingInfo",path="buildingInfoBillingInfos")
public interface BuildingInfoBillingInfoRepository extends PagingAndSortingRepository<BuildingInfoBillingInfo, Long> {

}

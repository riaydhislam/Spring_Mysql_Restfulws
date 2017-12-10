/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfoBillingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfoBillingInfo",path="foorInfoBillingInfos")
public interface FloorInfoBillingInfoRepository extends PagingAndSortingRepository<FloorInfoBillingInfo, Long>{

}

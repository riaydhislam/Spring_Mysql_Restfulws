/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.BuildingInfoPaymentInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="buildingInfoPaymentInfo",path="buildingInfoPaymentInfos")
public interface BuildingInfoPaymentInfoRepository extends PagingAndSortingRepository<BuildingInfoPaymentInfo, Long> {

}

/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.BuildingInfoOwnershipInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="BuildingInfoOwnershipInfo",path="buildingInfoOwnershipInfos")
public interface BuildingInfoOwnershipInfoRepository extends PagingAndSortingRepository<BuildingInfoOwnershipInfo, Long> {

}

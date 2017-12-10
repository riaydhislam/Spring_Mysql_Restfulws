/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfoOwnershipInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfoOwnershipInfo",path="floorInfoOwnershipInfos")
public interface FloorInfoOwnershipInfoRepository extends PagingAndSortingRepository<FloorInfoOwnershipInfo, Long> {

}

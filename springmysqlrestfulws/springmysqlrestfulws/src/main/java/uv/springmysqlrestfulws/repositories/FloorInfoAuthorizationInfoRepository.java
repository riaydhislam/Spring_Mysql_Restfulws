/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfoAuthorizationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfoAuthorizationInfo",path="floorInfoAuthorizationInfos")
public interface FloorInfoAuthorizationInfoRepository extends PagingAndSortingRepository<FloorInfoAuthorizationInfo, Long> {

}

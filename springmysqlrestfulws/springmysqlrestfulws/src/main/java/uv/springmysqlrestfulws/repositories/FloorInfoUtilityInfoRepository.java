/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfoUtilityInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfoUtilityInfo",path="floorInfoUtilityInfos")
public interface FloorInfoUtilityInfoRepository extends PagingAndSortingRepository<FloorInfoUtilityInfo, Long> {

}

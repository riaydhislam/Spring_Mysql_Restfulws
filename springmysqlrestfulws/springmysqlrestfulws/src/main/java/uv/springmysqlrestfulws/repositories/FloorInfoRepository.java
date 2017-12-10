/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfo",path="floorInfos")
public interface FloorInfoRepository extends PagingAndSortingRepository<FloorInfo, Long>{

}

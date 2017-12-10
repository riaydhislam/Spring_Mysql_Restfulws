/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UnitInfoUtilityInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfoUtilityInfo",path="unitInfoUtilityInfos")
public interface UnitInfoUtilityInfoRepository extends PagingAndSortingRepository<UnitInfoUtilityInfo, Long> {

}

/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UnitInfoAuthorizationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfoAuthorizationInfo",path="unitInfoAuthorizationInfos")
public interface UnitInfoAuthorizationInfoRepository extends PagingAndSortingRepository<UnitInfoAuthorizationInfo, Long> {

}

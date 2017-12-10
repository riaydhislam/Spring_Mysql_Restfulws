/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UnitInfoOwnershipInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfoOwnershipInfo",path="unitInfoOwnershipInfos")
public interface UnitInfoOwnershipInfoRepository extends PagingAndSortingRepository<UnitInfoOwnershipInfo, Long>{

}

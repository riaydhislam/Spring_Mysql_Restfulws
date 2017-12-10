/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UnitInfoBillingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfoBillingInfo",path="unitInfoBillingInfos")
public interface UnitInfoBillingInfoRepository extends PagingAndSortingRepository<UnitInfoBillingInfo, Long>{

}

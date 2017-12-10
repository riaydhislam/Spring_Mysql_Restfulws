/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UnitInfoPaymentInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfoPaymentInfo",path="unitInfoPaymentInfos")
public interface UnitInfoPaymentInfoRepository extends PagingAndSortingRepository<UnitInfoPaymentInfo, Long> {

}

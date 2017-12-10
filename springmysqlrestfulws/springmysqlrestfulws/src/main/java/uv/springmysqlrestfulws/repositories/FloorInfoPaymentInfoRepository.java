/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.FloorInfoPaymentInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfoPaymentInfo",path="floorInfoPaymentInfos")
public interface FloorInfoPaymentInfoRepository extends PagingAndSortingRepository<FloorInfoPaymentInfo, Long> {

}

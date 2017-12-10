/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.PlotInfoBillingInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoBillingInfo",path="plotInfoBillingInfo")
public interface PlotInfoBillingInfoRepository extends PagingAndSortingRepository<PlotInfoBillingInfo, Long> {

}

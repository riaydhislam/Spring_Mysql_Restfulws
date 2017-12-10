/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.PlotInfoAuthorizationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoAuthorizationInfo",path="plotInfoAuthorizationInfos")
public interface PlotInfoAuthorizationInfoRepository extends PagingAndSortingRepository<PlotInfoAuthorizationInfo, Long> {

}

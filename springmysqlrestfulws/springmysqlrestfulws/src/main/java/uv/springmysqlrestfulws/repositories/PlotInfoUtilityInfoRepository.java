/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.PlotInfoUtilityInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfoUtilityInfo",path="plotInfoUtilityInfos")
public interface PlotInfoUtilityInfoRepository extends PagingAndSortingRepository<PlotInfoUtilityInfo, Long> {

}

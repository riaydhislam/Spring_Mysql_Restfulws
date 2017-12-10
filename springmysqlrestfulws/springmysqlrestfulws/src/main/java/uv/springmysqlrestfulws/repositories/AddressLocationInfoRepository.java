/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.AddressLocationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="addressLocationInfo", path="addressLocationInfos")
public interface AddressLocationInfoRepository extends PagingAndSortingRepository<AddressLocationInfo,Long>{

}

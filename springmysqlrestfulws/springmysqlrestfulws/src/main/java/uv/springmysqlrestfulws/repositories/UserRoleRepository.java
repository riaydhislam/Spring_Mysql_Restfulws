/**
 * 
 */
package uv.springmysqlrestfulws.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springmysqlrestfulws.model.UserRole;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel = "userRole", path = "userRoles")
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole, Long> {

}

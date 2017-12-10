/**
 * 
 */
package uv.springmysqlrestfulws.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import uv.springmysqlrestfulws.model.UserRegistration;

/**
 * 
 * Extension of CrudRepository to provide additional methods to retrieve entities using the pagination and sorting abstraction.
 * Interface for generic CRUD operations on a repository for a specific type.CrudRepository extends Repository Interfaces
 * @author A.Riaydh
 *
 */
public interface UserRegistrationRepositoryJPA extends JpaRepository<UserRegistration, Long>{
	@Query("select u from UserRegistration u where u.userRegistrationLName like ?1% or u.userRegistrationName like ?2%")
	Page<UserRegistration> findByUserRegistrationLNameOrUserRegistrationName(
			                                   @Param("userRegistrationLName") String userRegistrationLName,
	                                           @Param("userRegistrationName") String userRegistrationName,
	                                           Pageable pageable);

}

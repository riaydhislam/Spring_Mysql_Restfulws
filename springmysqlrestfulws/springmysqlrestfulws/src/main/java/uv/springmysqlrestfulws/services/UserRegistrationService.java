/**
 * 
 */
package uv.springmysqlrestfulws.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import uv.springmysqlrestfulws.model.UserRegistration;

/**
 * @author A.Riaydh
 *
 */
public interface UserRegistrationService {
public Page<UserRegistration> listAllUserRegistrationByPage(Pageable pageable);
public Page<UserRegistration> findByUserRegistrationNameOrderByUserRegistrationIdAsc(String userRegistrationName, Pageable pageable);
// EntityManager interfaces	
public List<UserRegistration> listAllUserRegistration();
public UserRegistration findByUserRegistartionId(Long userRegistartionId);
public void addUserRegistartion(UserRegistration userRegistration);
public void updateUserRegistartion(Long urId, UserRegistration userRegistration);
public void deleteUserRegistartion(Long urId);
public boolean userRegistartionExists(Long urId);
	
}

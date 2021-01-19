package com.scrotify.matrimony.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scrotify.matrimony.entity.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long>{

	Optional<UserDetail> findUserDetailByEmailID(String emailId);

	Optional<UserDetail> findByUserId(Long userId);


}

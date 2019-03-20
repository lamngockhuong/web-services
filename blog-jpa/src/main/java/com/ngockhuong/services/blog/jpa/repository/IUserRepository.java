package com.ngockhuong.services.blog.jpa.repository;

import com.ngockhuong.services.blog.jpa.entity.UserEntity;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends IUserRepositoryCustom, BaseRepository<UserEntity, Integer> {

    UserEntity findByUserId(Long id) throws DataAccessException;
}

package com.stc.petlove.repositories;

import com.stc.petlove.entities.TaiKhoan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaiKhoanRepository extends MongoRepository<TaiKhoan, String> {
    boolean findByEmail(String email);

    @Query(value = "{'email': ?0}")
    Optional<TaiKhoan> getUser(String email);

    @Query(value = "{'email': ?0}", exists = true)
    boolean checkEmail(String email);

    boolean existsByEmail(String email);

    Optional<TaiKhoan> findById(String id);


    @Query(value = "{'trangThai': true}")
    List<TaiKhoan> getAlls();
}

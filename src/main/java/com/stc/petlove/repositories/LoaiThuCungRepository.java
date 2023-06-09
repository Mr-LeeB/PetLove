package com.stc.petlove.repositories;

import com.stc.petlove.entities.LoaiThuCung;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiThuCungRepository extends MongoRepository<LoaiThuCung, String> {
    boolean findByMaLoaiThuCung(String maLoaiThuCung);
    // CRUD methods
}

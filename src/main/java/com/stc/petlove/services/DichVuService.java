package com.stc.petlove.services;

import com.stc.petlove.dtos.DichVuDto;

import java.util.List;

public interface DichVuService {
    List<DichVuDto> findAll();

    DichVuDto findByMaDichVu(String maDichVu);

    DichVuDto create(DichVuDto dichVuDTO);

    DichVuDto update(String id, DichVuDto dichVuDTO);

    void delete(String id);
}

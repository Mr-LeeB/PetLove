package com.stc.petlove.services;

import com.stc.petlove.dtos.DichVuDto;
import com.stc.petlove.entities.DichVu;
import com.stc.petlove.repositories.DichVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public List<DichVuDto> findAll() {
        List<DichVu> dichVus = dichVuRepository.findAll();
        return dichVus.stream().map(DichVuDto::new).collect(Collectors.toList());
    }

    @Override
    public DichVuDto findByMaDichVu(String maDichVu) {
        DichVu dichVu = dichVuRepository.findByMaDichVu(maDichVu);
        return dichVu == null ? null : new DichVuDto(dichVu);
    }

    @Override
    public DichVuDto create(DichVuDto dichVuDTO) {
        DichVu dichVu = new DichVu();
        dichVu.setMaDichVu(dichVuDTO.getMaDichVu());
        dichVu.setTenDichVu(dichVuDTO.getTenDichVu());
        dichVu.setNoiDung(dichVuDTO.getNoiDung());
        dichVu.setTrangThai(dichVuDTO.isTrangThai());
        DichVu savedDichVu = dichVuRepository.save(dichVu);
        return new DichVuDto(savedDichVu);
    }
    @Override
    public DichVuDto update(String id, DichVuDto dichVuDTO) {
        DichVu dichVu = dichVuRepository.findById(id).orElse(null);
        if (dichVu == null) {
            return null;
        }
        dichVu.setMaDichVu(dichVuDTO.getMaDichVu());
        dichVu.setTenDichVu(dichVuDTO.getTenDichVu());
        dichVu.setNoiDung(dichVuDTO.getNoiDung());
        dichVu.setTrangThai(dichVuDTO.isTrangThai());
        DichVu savedDichVu = dichVuRepository.save(dichVu);
        return new DichVuDto(savedDichVu);
    }

    @Override
    public void delete(String id) {
        dichVuRepository.deleteById(id);
    }
}
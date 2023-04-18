package com.stc.petlove.dtos;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.embedded.GiaDichVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DichVuDto {
    private String id;

    private String maDichVu;

    private String tenDichVu;

    private String noiDung;
    private List<GiaDichVu> giaDichVus = new ArrayList<>();
    public DichVuDto(DichVu dichVu) {
        this.id = dichVu.getId();
        this.maDichVu = dichVu.getMaDichVu();
        this.tenDichVu = dichVu.getTenDichVu();
        this.noiDung = dichVu.getNoiDung();
        this.trangThai = dichVu.isTrangThai();
    }

    public DichVu toEntity() {
        DichVu dichVu = new DichVu();
        dichVu.setId(this.id);
        dichVu.setMaDichVu(this.maDichVu);
        dichVu.setTenDichVu(this.tenDichVu);
        dichVu.setNoiDung(this.noiDung);
        dichVu.setTrangThai(this.trangThai);
        return dichVu;
    }
    private boolean trangThai = true;
}

package com.stc.petlove.entities;

import com.stc.petlove.entities.embedded.GiaDichVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 4/11/23
 * Time      : 9:35 PM
 * Filename  : DichVu
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dich-vu")
public class DichVu {
    @Id
    private String id;

    // mã dịch vụ không được trùng
    private String maDichVu;


    private String tenDichVu;

    // nội dung là html
    private String noiDung;

    // Giá dịch vụ phụ thuộc vào loại thú cưng và cân nặng của thú cưng
    private List<GiaDichVu> giaDichVu = new ArrayList<>();
    public void setInfo(DichVu dichVu) {
        this.maDichVu = dichVu.getMaDichVu();
        this.tenDichVu = dichVu.getTenDichVu();
        this.noiDung = dichVu.getNoiDung();
        this.giaDichVu = dichVu.getGiaDichVu();
    }
    private boolean trangThai = true;
}

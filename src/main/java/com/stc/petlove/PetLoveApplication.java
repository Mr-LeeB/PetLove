package com.stc.petlove;

import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.repositories.TaiKhoanRepository;
import com.stc.petlove.utils.EnumRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class PetLoveApplication implements CommandLineRunner {
    private final TaiKhoanRepository taiKhoanRepository;
    @Autowired
    public PetLoveApplication(TaiKhoanRepository taiKhoanRepository) {
        this.taiKhoanRepository = taiKhoanRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PetLoveApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(taiKhoanRepository.count()==0){
            TaiKhoan user = new TaiKhoan("baoql","quangbao@gmail.com","quangbao","0123456789",
                    Collections.singletonList(EnumRole.ROLE_ADMIN.toString()));
            taiKhoanRepository.save(user);
        }
    }
}

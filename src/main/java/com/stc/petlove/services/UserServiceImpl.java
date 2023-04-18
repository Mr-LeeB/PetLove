package com.stc.petlove.services;

import com.stc.petlove.dtos.TaiKhoanDto;
import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.exceptions.NotFoundException;
import com.stc.petlove.repositories.TaiKhoanRepository;
import com.stc.petlove.repositories.TaiKhoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;


@Slf4j
@Service
public class UserServiceImpl implements UserService{
    private final TaiKhoanRepository userRepository;

    public UserServiceImpl(TaiKhoanRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Page<TaiKhoan> filter(String search, int page, int size, String sort, String column) {
        return null;
    }

    @Override
    public List<TaiKhoan> getAllUsers(String search) {
        return null;
    }

    @Override
    public TaiKhoan getUser(String id) {
        return null;
    }

    @Override
    public TaiKhoan getUserByEmail(String email) {
        return userRepository.getUser(email)
                .orElseThrow(()-> new NotFoundException(String.format("User with email %s does not exist",email)));
    }

    @Override
    public TaiKhoan getUserBydienThoai(String dienThoai) {
        return null;
    }

    @Override
    public TaiKhoan create(TaiKhoanDto dto, Principal principal) {
        return null;
    }

    @Override
    public TaiKhoan update(String id, TaiKhoanDto dto, Principal principal) {
        return null;
    }

    @Override
    public TaiKhoan changeStatus(String id, Principal principal) {
        return null;
    }
}

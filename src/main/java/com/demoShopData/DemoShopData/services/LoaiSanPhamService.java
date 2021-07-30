package com.demoShopData.DemoShopData.services;

import com.demoShopData.DemoShopData.custom_exceptions.LoaiSanPhamNotFoundException;
import com.demoShopData.DemoShopData.entities.LoaiSanPham;
import com.demoShopData.DemoShopData.repositories.LoaiSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamService {
    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;

    public Iterable<LoaiSanPham> getLoaiSanPhamByMaLoaiCha(Integer maloaicha) throws LoaiSanPhamNotFoundException {
        Iterable<LoaiSanPham> loaiSanPhamList = loaiSanPhamRepository.findByMaLoaiCha(maloaicha);
        if(loaiSanPhamList == null){
            throw new LoaiSanPhamNotFoundException("Không tìm thấy loại sản phẩm này!");
        } else {
            return loaiSanPhamList;
        }
    }
}

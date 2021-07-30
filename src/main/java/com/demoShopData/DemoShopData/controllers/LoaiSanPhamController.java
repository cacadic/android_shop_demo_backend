package com.demoShopData.DemoShopData.controllers;

import com.demoShopData.DemoShopData.custom_exceptions.LoaiSanPhamNotFoundException;
import com.demoShopData.DemoShopData.entities.LoaiSanPham;
import com.demoShopData.DemoShopData.services.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/loaisanpham")
public class LoaiSanPhamController {
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;

    @GetMapping(value = "")
    public ResponseEntity<?> getLoaiSanPham(@RequestParam Integer maloaicha) throws LoaiSanPhamNotFoundException{
        Iterable<LoaiSanPham> loaiSanPham = loaiSanPhamService.getLoaiSanPhamByMaLoaiCha(maloaicha);
        return new ResponseEntity<>(loaiSanPham, HttpStatus.OK);
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World!!!";
    }
}

package com.demoShopData.DemoShopData.controllers;

import com.demoShopData.DemoShopData.custom_exceptions.LoaiSanPhamNotFoundException;
import com.demoShopData.DemoShopData.entities.LoaiSanPham;
import com.demoShopData.DemoShopData.models.MenuResponse;
import com.demoShopData.DemoShopData.services.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping(value = "/menu")
    public ResponseEntity<?> getMenuLoaiSanPham () throws LoaiSanPhamNotFoundException {
        Iterable<LoaiSanPham> loaiSanPham = loaiSanPhamService.getLoaiSanPhamByMaLoaiCha(0);
        List<LoaiSanPham> menuList = new ArrayList();
        for (var value : loaiSanPham) {
            menuList.add(value);
        }

        List<MenuResponse> menuResponseList = new ArrayList<>();

        for (var value : menuList) {
            MenuResponse menuResponse = new MenuResponse();
            menuResponse.setMa(value.getMa());
            menuResponse.setTen(value.getTen());
            menuResponse.setMaLoaiCha(value.getMaLoaiCha());

            Iterable<LoaiSanPham> loaiSPConList = loaiSanPhamService.getLoaiSanPhamByMaLoaiCha(value.getMa().intValue());

            List<MenuResponse> menuResponseListCon = new ArrayList<>();

            for (var valueCon : loaiSPConList) {
                MenuResponse menuCon = new MenuResponse();
                menuCon.setMa(valueCon.getMa());
                menuCon.setTen(valueCon.getTen());
                menuCon.setMaLoaiCha(valueCon.getMaLoaiCha());

                Iterable<LoaiSanPham> loaiSPConList2 = loaiSanPhamService.getLoaiSanPhamByMaLoaiCha(valueCon.getMa().intValue());

                List<MenuResponse> menuResponseListCon2 = new ArrayList<>();

                for (var valueCon2 : loaiSPConList2) {
                    MenuResponse menuCon2 = new MenuResponse();
                    menuCon2.setMa(valueCon2.getMa());
                    menuCon2.setTen(valueCon2.getTen());
                    menuCon2.setMaLoaiCha(valueCon2.getMaLoaiCha());
                    menuResponseListCon2.add(menuCon2);
                }

                menuCon.setListMenuCon(menuResponseListCon2);
                menuResponseListCon.add(menuCon);

            }

            menuResponse.setListMenuCon(menuResponseListCon);

            menuResponseList.add(menuResponse);
        }

        return new ResponseEntity<>(menuResponseList, HttpStatus.OK);
    }
}

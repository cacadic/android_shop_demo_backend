package com.demoShopData.DemoShopData.models;

import java.util.List;

public class MenuResponse {
    private Long ma;
    private String ten;
    private int maLoaiCha;

    private List<MenuResponse> listMenuCon;

    public MenuResponse() {
    }

    public MenuResponse(Long ma, String ten, int maLoaiCha, List<MenuResponse> listMenuCon) {
        this.ma = ma;
        this.ten = ten;
        this.maLoaiCha = maLoaiCha;
        this.listMenuCon = listMenuCon;
    }

    public Long getMa() {
        return ma;
    }

    public void setMa(Long ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaLoaiCha() {
        return maLoaiCha;
    }

    public void setMaLoaiCha(int maLoaiCha) {
        this.maLoaiCha = maLoaiCha;
    }

    public List<MenuResponse> getListMenuCon() {
        return listMenuCon;
    }

    public void setListMenuCon(List<MenuResponse> listMenuCon) {
        this.listMenuCon = listMenuCon;
    }
}

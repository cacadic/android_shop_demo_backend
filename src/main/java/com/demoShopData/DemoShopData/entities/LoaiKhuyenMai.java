package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;

@Entity
@Table(name = "loaikhuyemai")
public class LoaiKhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "ten", nullable = false)
    private String ten;

    public LoaiKhuyenMai() {
    }

    public LoaiKhuyenMai(String ten) {
        this.ten = ten;
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
}

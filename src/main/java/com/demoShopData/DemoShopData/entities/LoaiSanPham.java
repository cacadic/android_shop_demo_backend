package com.demoShopData.DemoShopData.entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name = "loaisanpham")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "maloai_cha")
    private Integer maLoaiCha;

    public LoaiSanPham() {
    }

    public LoaiSanPham(Long ma, String ten, Integer maLoaiCha) {
        this.ma = ma;
        this.ten = ten;
        this.maLoaiCha = maLoaiCha;
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

    public Integer getMaLoaiCha() {
        return maLoaiCha;
    }

    public void setMaLoaiCha(Integer maLoaiCha) {
        this.maLoaiCha = maLoaiCha;
    }
}

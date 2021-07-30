package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;

@Entity
@Table(name = "thuonghieu")
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "hinh", columnDefinition = "TEXT")
    private String hinh;

    @Column(name = "luotmua")
    private Long luotMua;

    public ThuongHieu() {
    }

    public ThuongHieu(String ten, String hinh, Long luotMua) {
        this.ten = ten;
        this.hinh = hinh;
        this.luotMua = luotMua;
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

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Long getLuotMua() {
        return luotMua;
    }

    public void setLuotMua(Long luotMua) {
        this.luotMua = luotMua;
    }
}

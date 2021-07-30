package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chitietdathang")
public class ChiTietDatHang implements Serializable {
    @Id
    @OneToOne()
    @JoinColumn(name = "madh", referencedColumnName = "ma", nullable = false)
    private DonDatHang donDatHang;

    @Id
    @OneToOne()
    @JoinColumn(name = "masp", referencedColumnName = "ma", nullable = false)
    private SanPham sanPham;

    @Column(name = "soluong", nullable = false)
    private Integer soLuong;

    public ChiTietDatHang() {
    }

    public ChiTietDatHang(DonDatHang donDatHang, SanPham sanPham, Integer soLuong) {
        this.donDatHang = donDatHang;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public DonDatHang getDonDatHang() {
        return donDatHang;
    }

    public void setDonDatHang(DonDatHang donDatHang) {
        this.donDatHang = donDatHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}

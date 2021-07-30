package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mongmuon")
public class MongMuon implements Serializable {
    @Id
    @OneToOne()
    @JoinColumn(name = "masp", referencedColumnName = "ma", nullable = false)
    private SanPham sanPham;

    @Id
    @OneToOne()
    @JoinColumn(name = "manv", referencedColumnName = "ma", nullable = false)
    private NhanVien nhanVien;

    public MongMuon() {
    }

    public MongMuon(SanPham sanPham, NhanVien nhanVien) {
        this.sanPham = sanPham;
        this.nhanVien = nhanVien;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}

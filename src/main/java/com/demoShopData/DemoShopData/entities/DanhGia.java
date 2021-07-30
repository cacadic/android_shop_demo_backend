package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "danhgia")
public class DanhGia implements Serializable {
    @Id
    @OneToOne()
    @JoinColumn(name = "masp", referencedColumnName = "ma", nullable = false)
    private SanPham sanPham;

    @Id
    @OneToOne()
    @JoinColumn(name = "manv", referencedColumnName = "ma", nullable = false)
    private NhanVien nhanVien;

    @Column(name = "noidung", columnDefinition = "TEXT")
    private String noiDung;

    @Column(name = "sosao")
    private Integer soSao;

    public DanhGia() {
    }

    public DanhGia(SanPham sanPham, NhanVien nhanVien, String noiDung, Integer soSao) {
        this.sanPham = sanPham;
        this.nhanVien = nhanVien;
        this.noiDung = noiDung;
        this.soSao = soSao;
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

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Integer getSoSao() {
        return soSao;
    }

    public void setSoSao(Integer soSao) {
        this.soSao = soSao;
    }
}

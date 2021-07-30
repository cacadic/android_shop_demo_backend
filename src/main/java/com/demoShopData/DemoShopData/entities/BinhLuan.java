package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "binhluan")
public class BinhLuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @OneToOne()
    @JoinColumn(name = "manv", referencedColumnName = "ma", nullable = false)
    private NhanVien nhanVien;

    @OneToOne()
    @JoinColumn(name = "masp", referencedColumnName = "ma", nullable = false)
    private SanPham sanPham;

    @Column(name = "noidung", columnDefinition = "TEXT", nullable = false)
    private String noiDung;

    @Column(name = "ngaybinhluan", nullable = false)
    private Date ngayBinhLuan;

    public BinhLuan() {
    }

    public BinhLuan(NhanVien nhanVien, SanPham sanPham, String noiDung, Date ngayBinhLuan) {
        this.nhanVien = nhanVien;
        this.sanPham = sanPham;
        this.noiDung = noiDung;
        this.ngayBinhLuan = ngayBinhLuan;
    }

    public Long getMa() {
        return ma;
    }

    public void setMa(Long ma) {
        this.ma = ma;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayBinhLuan() {
        return ngayBinhLuan;
    }

    public void setNgayBinhLuan(Date ngayBinhLuan) {
        this.ngayBinhLuan = ngayBinhLuan;
    }
}

package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dondathang")
public class DonDatHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "trangthai", nullable = false)
    private boolean trangThai;

    @Column(name = "ngaydat", nullable = false)
    private Date ngayDat;

    @Column(name = "ngaygiao", nullable = false)
    private Date ngayGiao;

    @Column(name = "mota")
    private String moTa;

    @OneToOne()
    @JoinColumn(name = "manv", referencedColumnName = "ma", nullable = false)
    private NhanVien nhanVien;

    public DonDatHang() {
    }

    public DonDatHang(NhanVien nhanVien, boolean trangThai, Date ngayDat, Date ngayGiao, String moTa ) {
        this.trangThai = trangThai;
        this.ngayDat = ngayDat;
        this.ngayGiao = ngayGiao;
        this.moTa = moTa;
        this.nhanVien = nhanVien;
    }

    public Long getMa() {
        return ma;
    }

    public void setMa(Long ma) {
        this.ma = ma;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}

package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "ten", nullable = false, length = 100)
    private String ten;

    @Column(name = "tendn", nullable = false, length = 20)
    private String tenDN;

    @Column(name = "matkhau", nullable = false)
    private String matKhau;

    @Column(name = "diachi", columnDefinition = "TEXT")
    private String diaChi;

    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @Column(name = "sodt", length = 15)
    private String soDT;

    @Column(name = "gioitinh", nullable = false)
    private boolean gioiTinh;

    @Column(name = "cmnd", length = 20)
    private String cmnd;

    @Column(name = "emaildocquyen")
    private String emailDocQuyen;

    @OneToOne()
    @JoinColumn(name = "maloainv", referencedColumnName = "ma")
    private LoaiNhanVien loaiNhanVien;

    public NhanVien() {
    }

    public NhanVien(String ten, String tenDN, String matKhau, String diaChi, Date ngaySinh, String soDT, boolean gioiTinh, String cmnd, LoaiNhanVien loaiNhanVien) {
        this.ten = ten;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.loaiNhanVien = loaiNhanVien;
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

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public LoaiNhanVien getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(LoaiNhanVien loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
}

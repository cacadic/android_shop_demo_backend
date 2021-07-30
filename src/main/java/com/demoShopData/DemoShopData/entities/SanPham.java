package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;

@Entity
@Table(name = "sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "gia", columnDefinition = "DECIMAL")
    private Long gia;

    @Column(name = "hinhlon", columnDefinition = "TEXT")
    private String hinhLon;

    @Column(name = "hinhnho", columnDefinition = "TEXT")
    private String hinhNho;

    @Column(name = "thongtin", columnDefinition = "TEXT")
    private String thongTin;

    @Column(name = "soluong")
    private Integer soLuong;

    @Column(name = "luotmua")
    private Long luotMua;

    @OneToOne()
    @JoinColumn(name = "maloaisp", referencedColumnName = "ma")
    private LoaiSanPham loaiSanPham;

    @OneToOne()
    @JoinColumn(name = "math", referencedColumnName = "ma")
    private ThuongHieu thuongHieu;

    @OneToOne()
    @JoinColumn(name = "manv", referencedColumnName = "ma")
    private NhanVien nhanVien;

    public SanPham() {
    }

    public SanPham(String ten, Long gia, String hinhLon, String hinhNho, String thongTin, Integer soLuong, Long luotMua, LoaiSanPham loaiSanPham, ThuongHieu thuongHieu, NhanVien nhanVien) {
        this.ten = ten;
        this.gia = gia;
        this.hinhLon = hinhLon;
        this.hinhNho = hinhNho;
        this.thongTin = thongTin;
        this.soLuong = soLuong;
        this.luotMua = luotMua;
        this.loaiSanPham = loaiSanPham;
        this.thuongHieu = thuongHieu;
        this.nhanVien = nhanVien;
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

    public Long getGia() {
        return gia;
    }

    public void setGia(Long gia) {
        this.gia = gia;
    }

    public String getHinhLon() {
        return hinhLon;
    }

    public void setHinhLon(String hinhLon) {
        this.hinhLon = hinhLon;
    }

    public String getHinhNho() {
        return hinhNho;
    }

    public void setHinhNho(String hinhNho) {
        this.hinhNho = hinhNho;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Long getLuotMua() {
        return luotMua;
    }

    public void setLuotMua(Long luotMua) {
        this.luotMua = luotMua;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}

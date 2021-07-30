package com.demoShopData.DemoShopData.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "chitietkhuyemai")
public class ChiTietKhuyenMai implements Serializable {
    @Id
    @OneToOne()
    @JoinColumn(name = "maloaikm", referencedColumnName = "ma", nullable = false)
    private LoaiKhuyenMai loaiKhuyenMai;

    @Id
    @OneToOne()
    @JoinColumn(name = "masp", referencedColumnName = "ma", nullable = false)
    private SanPham sanPham;

    @Column(name = "ngaybatdaukm", nullable = false)
    private Date ngayBatDauKM;

    @Column(name = "ngayketthuckm")
    private Date ngayKetThucKM;

    @Column(name = "phantramkm")
    private int phanTramKM;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(LoaiKhuyenMai loaiKhuyenMai, SanPham sanPham, Date ngayBatDauKM, Date ngayKetThucKM, int phanTramKM) {
        this.loaiKhuyenMai = loaiKhuyenMai;
        this.sanPham = sanPham;
        this.ngayBatDauKM = ngayBatDauKM;
        this.ngayKetThucKM = ngayKetThucKM;
        this.phanTramKM = phanTramKM;
    }

    public LoaiKhuyenMai getLoaiKhuyenMai() {
        return loaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(LoaiKhuyenMai loaiKhuyenMai) {
        this.loaiKhuyenMai = loaiKhuyenMai;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Date getNgayBatDauKM() {
        return ngayBatDauKM;
    }

    public void setNgayBatDauKM(Date ngayBatDauKM) {
        this.ngayBatDauKM = ngayBatDauKM;
    }

    public Date getNgayKetThucKM() {
        return ngayKetThucKM;
    }

    public void setNgayKetThucKM(Date ngayKetThucKM) {
        this.ngayKetThucKM = ngayKetThucKM;
    }

    public int getPhanTramKM() {
        return phanTramKM;
    }

    public void setPhanTramKM(int phanTramKM) {
        this.phanTramKM = phanTramKM;
    }
}

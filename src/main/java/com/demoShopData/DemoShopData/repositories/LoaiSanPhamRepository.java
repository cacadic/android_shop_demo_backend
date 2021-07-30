package com.demoShopData.DemoShopData.repositories;

import com.demoShopData.DemoShopData.entities.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham, Integer> {
    Iterable<LoaiSanPham> findByMaLoaiCha(Integer maloaicha);
}

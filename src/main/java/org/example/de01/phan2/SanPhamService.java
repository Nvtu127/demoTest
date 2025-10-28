package org.example.de01.phan2;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> listSP = new ArrayList<>();
    SanPham sanPham = new SanPham("sp01","NVT",2000,50f,10,"cntt");

     List<SanPham> GetAll(){

        return listSP;
    }
    public void addSanPham(SanPham sanPham){
         if(sanPham == null)throw  new IllegalArgumentException("san pham khong duoc null");
         if(sanPham.getMa() == null || sanPham.getMa().trim().isEmpty()
         ||sanPham.getTen() == null ||sanPham.getTen().trim().isEmpty()
                 || sanPham.getNamBaoHanh() == null
                 || sanPham.getGia()== null
                 || sanPham.getSoLuong() == null
                 || sanPham.getDanhMuc() == null||sanPham.getDanhMuc().trim().isEmpty()) {
            throw new IllegalArgumentException("Cac truong khong duoc de trong");

        }
        if(sanPham.getSoLuong() < 1 || sanPham.getSoLuong()>100) throw new IllegalArgumentException("So luong chi nhan tu 1 den 100");
        listSP.add(sanPham);

    }
}

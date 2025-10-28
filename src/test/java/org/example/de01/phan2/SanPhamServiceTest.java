package org.example.de01.phan2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    SanPhamService sanPhamService ;
    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    public void TuongDuong_Testaddhople(){
        SanPham sanPham = new SanPham("sp02","NVT",2000,50f,10,"cntt");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1,sanPhamService.GetAll().size());
    }

    @Test
    public void TuongDuong_TestaddKhonghople(){
        assertThrows(IllegalArgumentException.class, () -> {
            sanPhamService.addSanPham(new SanPham("sp02","NVT",2000,50f,-10,"cntt"));

        });
    }

    @Test
    public void bienDuoi_Testaddhople(){
        SanPham sanPham = new SanPham("sp03","NVT",2000,50f,1,"cntt");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1,sanPhamService.GetAll().size());
    }
    @Test
    public void bienTren_Testaddhople(){
        SanPham sanPham = new SanPham("sp04","NVT",2000,50f,100,"cntt");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1,sanPhamService.GetAll().size());
    }
    @Test
    public void bienDuoi_TestaddKhonghople(){
        assertThrows(IllegalArgumentException.class, () -> {
            sanPhamService.addSanPham(new SanPham("sp03","NVT",2000,50f,0,"cntt"));

        });
    }
    @Test
    public void bienTren_TestaddKhonghople(){
        assertThrows(IllegalArgumentException.class, () -> {
            sanPhamService.addSanPham(new SanPham("sp04","NVT",2000,50f,101,"cntt"));

        });
    }





    @AfterEach
    void tearDown() {
        sanPhamService = null;
    }
}
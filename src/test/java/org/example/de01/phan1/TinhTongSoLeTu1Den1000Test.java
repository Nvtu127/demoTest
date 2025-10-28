package org.example.de01.phan1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoLeTu1Den1000Test {

    TinhTongSoLeTu1Den1000 tinhTongSoLeTu1Den1000;
    @BeforeEach
    void setUp() {
        tinhTongSoLeTu1Den1000 = new TinhTongSoLeTu1Den1000();
    }
    // tuong duong 2 test(true||false)
    @Test
    void TuongDuong_TestTinhTongHopLe(){
        assertEquals(75,tinhTongSoLeTu1Den1000.tinhTong(10,20));

    }
    @Test
    void TuongDuong_TestTinhTongKhongHopLe(){
        assertThrows(IllegalArgumentException.class,() ->{
            tinhTongSoLeTu1Den1000.tinhTong(-50,1500);
        });
    }
    // viết 2 tương đương 4 con biên
    //(2 test pass 1 biên dưới  - 1 biên trên | 2 test  fail - ngoai le
    @Test
    void BienDuoi_testTinhTongHopLe(){
       assertEquals(1,tinhTongSoLeTu1Den1000.tinhTong(1,1));

    }
    @Test
    void Bientren_testTinhTongHopLe(){
        assertEquals(999,tinhTongSoLeTu1Den1000.tinhTong(999,1000));

    }
    @Test
    void testStartLaSoAm(){
        assertThrows(IllegalArgumentException.class,() ->{
            tinhTongSoLeTu1Den1000.tinhTong(-15,1500);
        });
    }
    @Test
    void testStartLonHonEnd(){
        assertThrows(IllegalArgumentException.class,() ->{
            tinhTongSoLeTu1Den1000.tinhTong(15,1);
        });
    }

    @AfterEach
    void tearDown() {
        tinhTongSoLeTu1Den1000 = null;
    }
}
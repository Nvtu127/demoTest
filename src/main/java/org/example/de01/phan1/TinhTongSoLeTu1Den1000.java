package org.example.de01.phan1;

public class TinhTongSoLeTu1Den1000 {
    public  int tinhTong (int start ,int end ){
        if (start > end || start < 0 || end < 0) throw  new IllegalArgumentException("khoang khong hop le");
        int tong = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 !=0){
                tong = tong + i;
            }

        }

        return  tong;

    }
}

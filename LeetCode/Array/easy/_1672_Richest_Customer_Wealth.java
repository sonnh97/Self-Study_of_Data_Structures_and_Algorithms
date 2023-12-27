public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth1(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int[] tongTaiSan = new int[soKhachHang];

        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            tongTaiSan[i] = tinhTongHangI;
        }

        int max = 0; // max phai duoc gan bang gia tri nho nhat
        for (int i = 0; i < soKhachHang; i++) {
//            System.out.println("TongTaiSan KH" + i + ": " + tongTaiSan[i]);
            if (tongTaiSan[i] > max) {
                max = tongTaiSan[i];
            }
        }
        return max;
    }

    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;

        int max = 0;
        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            if (tinhTongHangI > max) {
                max = tinhTongHangI;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {3, 2, 1} };
        maximumWealth(a);
    }
}
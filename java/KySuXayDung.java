import java.time.LocalDate;

public class KySuXayDung extends KySu {
    private String chungChiHanhNghe;
    private String linhVucCongTrinh;
    private String duAnPhuTrach;

    public KySuXayDung() {
    }

    public KySuXayDung(String maKySu, String hoTen, LocalDate ngaySinh, String gioiTinh,
                       String soDienThoai, String email, int soNamKinhNghiem, double luongCoBan,
                       String chungChiHanhNghe, String linhVucCongTrinh, String duAnPhuTrach) {
        super(maKySu, hoTen, ngaySinh, gioiTinh, soDienThoai, email, soNamKinhNghiem, luongCoBan);
        this.chungChiHanhNghe = chungChiHanhNghe;
        this.linhVucCongTrinh = linhVucCongTrinh;
        this.duAnPhuTrach = duAnPhuTrach;
    }

    public String getChungChiHanhNghe() {
        return chungChiHanhNghe;
    }

    public void setChungChiHanhNghe(String chungChiHanhNghe) {
        this.chungChiHanhNghe = chungChiHanhNghe;
    }

    public String getLinhVucCongTrinh() {
        return linhVucCongTrinh;
    }

    public void setLinhVucCongTrinh(String linhVucCongTrinh) {
        this.linhVucCongTrinh = linhVucCongTrinh;
    }

    public String getDuAnPhuTrach() {
        return duAnPhuTrach;
    }

    public void setDuAnPhuTrach(String duAnPhuTrach) {
        this.duAnPhuTrach = duAnPhuTrach;
    }

    public void thietKeKetCau() {
        System.out.println(getHoTen() + " dang thiet ke ket cau cho " + linhVucCongTrinh + ".");
    }

    public void giamSatThiCong() {
        System.out.println(getHoTen() + " dang giam sat thi cong du an " + duAnPhuTrach + ".");
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 4_500_000;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== KY SU XAY DUNG ===");
        super.hienThiThongTin();
        System.out.println("Chung chi hanh nghe: " + chungChiHanhNghe);
        System.out.println("Linh vuc cong trinh: " + linhVucCongTrinh);
        System.out.println("Du an phu trach: " + duAnPhuTrach);
        System.out.printf("Tong luong: %,.0f%n", tinhLuong());
    }
}

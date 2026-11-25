import java.time.LocalDate;

public class KySuCoKhi extends KySu {
    private String phanMemCAD;
    private String linhVucCheTao;
    private String loaiMayChuyenDung;

    public KySuCoKhi() {
    }

    public KySuCoKhi(String maKySu, String hoTen, LocalDate ngaySinh, String gioiTinh,
                     String soDienThoai, String email, int soNamKinhNghiem, double luongCoBan,
                     String phanMemCAD, String linhVucCheTao, String loaiMayChuyenDung) {
        super(maKySu, hoTen, ngaySinh, gioiTinh, soDienThoai, email, soNamKinhNghiem, luongCoBan);
        this.phanMemCAD = phanMemCAD;
        this.linhVucCheTao = linhVucCheTao;
        this.loaiMayChuyenDung = loaiMayChuyenDung;
    }

    public String getPhanMemCAD() {
        return phanMemCAD;
    }

    public void setPhanMemCAD(String phanMemCAD) {
        this.phanMemCAD = phanMemCAD;
    }

    public String getLinhVucCheTao() {
        return linhVucCheTao;
    }

    public void setLinhVucCheTao(String linhVucCheTao) {
        this.linhVucCheTao = linhVucCheTao;
    }

    public String getLoaiMayChuyenDung() {
        return loaiMayChuyenDung;
    }

    public void setLoaiMayChuyenDung(String loaiMayChuyenDung) {
        this.loaiMayChuyenDung = loaiMayChuyenDung;
    }

    public void thietKeBanVeKyThuat() {
        System.out.println(getHoTen() + " dang thiet ke ban ve ky thuat bang " + phanMemCAD + ".");
    }

    public void baoTriThietBi() {
        System.out.println(getHoTen() + " dang bao tri " + loaiMayChuyenDung + ".");
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 3_500_000;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== KY SU CO KHI ===");
        super.hienThiThongTin();
        System.out.println("Phan mem CAD: " + phanMemCAD);
        System.out.println("Linh vuc che tao: " + linhVucCheTao);
        System.out.println("Loai may chuyen dung: " + loaiMayChuyenDung);
        System.out.printf("Tong luong: %,.0f%n", tinhLuong());
    }
}

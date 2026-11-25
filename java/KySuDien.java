import java.time.LocalDate;

public class KySuDien extends KySu {
    private String capDienAp;
    private String heThongPhuTrach;
    private boolean chungChiAnToanDien;

    public KySuDien() {
    }

    public KySuDien(String maKySu, String hoTen, LocalDate ngaySinh, String gioiTinh,String soDienThoai, String email, int soNamKinhNghiem, double luongCoBan,String capDienAp, String heThongPhuTrach, boolean chungChiAnToanDien) {
        super(maKySu, hoTen, ngaySinh, gioiTinh, soDienThoai, email, soNamKinhNghiem, luongCoBan);
        this.capDienAp = capDienAp;
        this.heThongPhuTrach = heThongPhuTrach;
        this.chungChiAnToanDien = chungChiAnToanDien;
    }

    public String getCapDienAp() {
        return capDienAp;
    }

    public void setCapDienAp(String capDienAp) {
        this.capDienAp = capDienAp;
    }

    public String getHeThongPhuTrach() {
        return heThongPhuTrach;
    }

    public void setHeThongPhuTrach(String heThongPhuTrach) {
        this.heThongPhuTrach = heThongPhuTrach;
    }

    public boolean isChungChiAnToanDien() {
        return chungChiAnToanDien;
    }

    public void setChungChiAnToanDien(boolean chungChiAnToanDien) {
        this.chungChiAnToanDien = chungChiAnToanDien;
    }

    public void thietKeMachDien() {
        System.out.println(getHoTen() + " dang thiet ke mach dien cho " + heThongPhuTrach + " (" + capDienAp + ").");
    }

    public void kiemTraAnToanDien() {
        System.out.println(getHoTen() + " dang kiem tra an toan dien. Chung chi hop le: " + chungChiAnToanDien);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + (chungChiAnToanDien ? 4_000_000 : 2_500_000);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== KY SU DIEN ===");
        super.hienThiThongTin();
        System.out.println("Cap dien ap: " + capDienAp);
        System.out.println("He thong phu trach: " + heThongPhuTrach);
        System.out.println("Chung chi an toan dien: " + (chungChiAnToanDien ? "Co" : "Khong"));
        System.out.printf("Tong luong: %,.0f%n", tinhLuong());
    }
}

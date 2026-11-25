import java.time.LocalDate;

public class KySuPhanMem extends KySu {
    private String ngonNguLapTrinh;
    private String framework;
    private String capBac;

    public KySuPhanMem() {
    }

    public KySuPhanMem(String maKySu, String hoTen, LocalDate ngaySinh, String gioiTinh,String soDienThoai, String email, int soNamKinhNghiem, double luongCoBan,String ngonNguLapTrinh, String framework, String capBac) {
        super(maKySu, hoTen, ngaySinh, gioiTinh, soDienThoai, email, soNamKinhNghiem, luongCoBan);
        this.ngonNguLapTrinh = ngonNguLapTrinh;
        this.framework = framework;
        this.capBac = capBac;
    }

    public String getNgonNguLapTrinh() {
        return ngonNguLapTrinh;
    }

    public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
        this.ngonNguLapTrinh = ngonNguLapTrinh;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public void thietKeHeThong() {
        System.out.println(getHoTen() + " dang thiet ke kien truc he thong voi " + framework + ".");
    }

    public void vietMaNguon() {
        System.out.println(getHoTen() + " dang viet ma nguon bang " + ngonNguLapTrinh + ".");
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + 5_000_000;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== KY SU PHAN MEM ===");
        super.hienThiThongTin();
        System.out.println("Ngon ngu lap trinh: " + ngonNguLapTrinh);
        System.out.println("Framework: " + framework);
        System.out.println("Cap bac: " + capBac);
        System.out.printf("Tong luong: %,.0f%n", tinhLuong());
    }
}

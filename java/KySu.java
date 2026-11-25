import java.time.LocalDate;
import java.util.Scanner;

public class KySu {
    private String maKySu;
    private String hoTen;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String soDienThoai;
    private String email;
    private int soNamKinhNghiem;
    private double luongCoBan;

    public KySu() {
    }

    public KySu(String maKySu, String hoTen, LocalDate ngaySinh, String gioiTinh,String soDienThoai, String email, int soNamKinhNghiem, double luongCoBan) {
        this.maKySu = maKySu;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.luongCoBan = luongCoBan;
    }

    public String getMaKySu() {
        return maKySu;
    }

    public void setMaKySu(String maKySu) {
        this.maKySu = maKySu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma ky su: ");
        this.maKySu = sc.nextLine();
        System.out.print("Ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Ngay sinh (YYYY-MM-DD): ");
        this.ngaySinh = LocalDate.parse(sc.nextLine());
        System.out.print("Gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("So dien thoai: ");
        this.soDienThoai = sc.nextLine();
        System.out.print("Email: ");
        this.email = sc.nextLine();
        System.out.print("So nam kinh nghiem: ");
        this.soNamKinhNghiem = Integer.parseInt(sc.nextLine());
        System.out.print("Luong co ban: ");
        this.luongCoBan = Double.parseDouble(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("Ma ky su: " + maKySu);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Email: " + email);
        System.out.println("So nam kinh nghiem: " + soNamKinhNghiem);
        System.out.printf("Luong co ban: %,.0f%n", luongCoBan);
    }

    public double tinhLuong() {
        return luongCoBan + soNamKinhNghiem * 1_000_000;
    }

    public void lamViec() {
        System.out.println(hoTen + " dang thuc hien cong viec ky thuat.");
    }
}

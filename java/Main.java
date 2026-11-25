import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        KySuPhanMem ksPhanMem = new KySuPhanMem(
                "KS01",
                "Nguyen Van An",
                LocalDate.of(1998, 5, 12),
                "Nam",
                "0901234567",
                "an.nguyen@company.vn",
                4,
                18_000_000,
                "Java",
                "Spring Boot",
                "Senior"
        );

        KySuXayDung ksXayDung = new KySuXayDung(
                "KS02",
                "Tran Thi Binh",
                LocalDate.of(1995, 9, 20),
                "Nu",
                "0912345678",
                "binh.tran@company.vn",
                6,
                16_000_000,
                "Hang I",
                "Dan dung & Cong nghiep",
                "Toa nha Van phong A"
        );

        KySuDien ksDien = new KySuDien(
                "KS03",
                "Le Hoang Cuong",
                LocalDate.of(1996, 3, 8),
                "Nam",
                "0923456789",
                "cuong.le@company.vn",
                5,
                15_500_000,
                "22kV",
                "Tram bien ap Khu A",
                true
        );

        KySuCoKhi ksCoKhi = new KySuCoKhi(
                "KS04",
                "Pham Minh Dung",
                LocalDate.of(1997, 11, 2),
                "Nam",
                "0934567890",
                "dung.pham@company.vn",
                3,
                15_000_000,
                "SolidWorks",
                "Co khi chinh xac",
                "May phay CNC 5 truc"
        );

        KySu[] danhSachKySu = {ksPhanMem, ksXayDung, ksDien, ksCoKhi};

        for (KySu ks : danhSachKySu) {
            ks.hienThiThongTin();
            ks.lamViec();
            System.out.println();
        }

        ksPhanMem.thietKeHeThong();
        ksPhanMem.vietMaNguon();
        ksXayDung.thietKeKetCau();
        ksXayDung.giamSatThiCong();
        ksDien.thietKeMachDien();
        ksDien.kiemTraAnToanDien();
        ksCoKhi.thietKeBanVeKyThuat();
        ksCoKhi.baoTriThietBi();
    }
}

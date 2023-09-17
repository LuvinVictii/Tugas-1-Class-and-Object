package id.its.pbo;

public class DateProgram {
    public static void main(String[] args) {
        // Membuat objek date1 dengan tanggal 12/25/2020
        Date date1 = new Date(12, 25, 2020);
        System.out.println("Date 1: " + date1.displayDate());

        // Membuat objek date2 dengan tanggal 2/29/2020 (tahun kabisat)
        Date date2 = new Date(2, 29, 2020);
        System.out.println("Date 2: " + date2.displayDate());

        // Membuat objek date3 dengan tanggal 2/29/2021 (bukan tahun kabisat)
        // Harusnya akan diatur menjadi 2/1/2021
        Date date3 = new Date(2, 29, 2021);
        System.out.println("Date 3: " + date3.displayDate());

        // Mengubah tanggal pada objek date1 menjadi 10/31/2021
        date1.setMonth(10);
        date1.setDay(31);
        date1.setYear(2021);
        System.out.println("Date 1 after modification: " + date1.displayDate());
    }
}

package karyawanapp;

import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public void login() {
        System.out.println("User " + nama + " login.");
    }
}

// Subclass (inheritance + polymorphism)
class admin extends User {
    public admin(String nama) {
        super(nama);
    }

    @Override
    public void login() {
        System.out.println("Admin " + nama + " berhasil login sebagai Admin.");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input Outout sederhana
        ArrayList<karyawan> daftar = new ArrayList<>(); //array

        System.out.print("Masukkan nama Anda: "); //input Outout sederhana
        String nama = input.nextLine(); //input Outout sederhana

        System.out.print("Login sebagai admin? (y/n): ");
        String status = input.nextLine();

        User user = status.equalsIgnoreCase("y") ? new admin(nama) : new User(nama);
        user.login(); // Polymorphism

        int pilihan;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Gaji");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Keluar");
            System.out.println("==================");
            System.out.print("Pilih: ");

            while (!input.hasNextInt()) {
                System.out.println("Masukkan angka yang valid!");
                input.next();
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String n = input.nextLine();
                    System.out.print("Posisi: ");
                    String p = input.nextLine();
                    System.out.print("Gaji: ");
                    try {
                        int g = Integer.parseInt(input.nextLine());
                        daftar.add(new karyawan(n, p, g));
                        System.out.println("Karyawan ditambahkan.");
                    } catch (NumberFormatException e) {
                        System.out.println("Input gaji salah. Harus berupa angka tanpa titik.");
                    }
                }
                case 2 -> {
                    if (daftar.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            System.out.println((i + 1) + ". " + daftar.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (daftar.isEmpty()) {
                        System.out.println("Data kosong.");
                        break;
                    }
                    System.out.print("Nomor karyawan: ");
                    try {
                        int idx = Integer.parseInt(input.nextLine()) - 1;
                        System.out.print("Gaji baru: ");
                        int gajiBaru = Integer.parseInt(input.nextLine());
                        daftar.get(idx).setGaji(gajiBaru);
                        System.out.println("Gaji diubah.");
                    } catch (Exception e) {
                        System.out.println("Input tidak valid.");
                    }
                }
                case 4 -> {
                    if (daftar.isEmpty()) {
                        System.out.println("Data kosong.");
                        break;
                    }
                    System.out.print("Nomor karyawan: ");
                try {
                        int idx = Integer.parseInt(input.nextLine()) - 1;
                        daftar.remove(idx);
                        System.out.println("Karyawan dihapus.");
                    } catch (Exception e) {
                        System.out.println("Input salah.");
                    }
                }
                case 5 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);
    }
}

package karyawanapp;

public class karyawan {
    private String nama;
    private String posisi;
    private int gaji;

    public karyawan(String nama, String posisi, int gaji) {
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    // Getter & Setter (Accessor & Mutator)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getPosisi() { return posisi; }
    public void setPosisi(String posisi) { this.posisi = posisi; }

    public int getGaji() { return gaji; }
    public void setGaji(int gaji) { this.gaji = gaji; }

    public String toString() {
        return nama + " | " + posisi + " | Rp " + gaji;
    }
}

// Inheritance + Polymorphism
class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public void login() {
        System.out.println("User " + nama + " login.");
    }
}

class admin extends User {
    public admin(String nama) {
        super(nama);
    }

    @Override
    public void login() {
        System.out.println("Admin " + nama + " berhasil login sebagai Admin.");
    }
}

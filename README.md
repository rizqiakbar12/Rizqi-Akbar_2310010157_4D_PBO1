# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana untuk mengelola data karyawan, dikembangkan sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini dibuat menggunakan Java untuk mengelola data karyawan. Pengguna dapat login, menambah, melihat, mengubah, dan menghapus data karyawan. 

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `User`, `Admin` dan `Main` adalah contoh dari class.

```bash
public class karyawan { ... }
class User { ... }
class admin extends User { ... }
public class main { ... }

```

2. **Object** adalah instance dari class. Pada kode ini, object dibuat saat menambahkan karyawan dan saat login.

```bash
daftar.add(new karyawan(n, p, g));
User user = status.equalsIgnoreCase("y") ? new admin(nama) : new User(nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `posisi` dan `gaji` adalah contoh atribut.

```bash
private String nama;
private String posisi;
private int gaji;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `karyawan` , `user` dan `admin`.

```bash
public karyawan(String nama, String posisi, int gaji) {
    this.nama = nama;
    this.posisi = posisi;
    this.gaji = gaji;
}

public User(String nama) {
    this.nama = nama;
}

public admin(String nama) {
    super(nama);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` , `setPosisi` dan `setGaji` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setPosisi(String posisi) {
    this.posisi = posisi;
}

public void setGaji(int gaji) {
    this.gaji = gaji;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getPosisi` dan `getGaji` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getPosisi() {
    return posisi;
}

public int getGaji() {
    return gaji;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` , `posisi` dan `gaji` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String posisi;
private int gaji;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Admin` mewarisi `User` dengan sintaks `extends`.

```bash
class admin extends User {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `login()` di class `admin` merupakan overriding dari method `login()` di class `User`. Saat objek bertipe `User` diisi oleh instance dari admin, method `login()` yang dijalankan adalah milik `admin`, bukan User, meskipun dipanggil melalui referensi User. Hal ini adalah contoh runtime polymorphism.

```bash
User user = new admin("Nama");
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.
Pada kode ini, seleksi `if-else` digunakan untuk menentukan apakah pengguna login sebagai `admin` atau `user` biasa, dan seleksi `switch` digunakan untuk menangani pilihan menu dalam program.

```bash
contoh if-else:
User user = status.equalsIgnoreCase("y") ? new admin(nama) : new User(nama);

contoh switch:
switch (pilihan) {
    case 1 -> { ... } // Tambah karyawan
    case 2 -> { ... } // Lihat data
    case 3 -> { ... } // Ubah gaji
    case 4 -> { ... } // Hapus karyawan
    case 5 -> System.out.println("Keluar...");
    default -> System.out.println("Pilihan tidak tersedia.");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan perulangan `do-while` untuk menampilkan menu utama secara terus-menerus hingga pengguna memilih keluar `(pilihan == 5)`.

```bash
int pilihan;
do {
    System.out.println("\n====== MENU ======");
    System.out.println("1. Tambah Karyawan");
    System.out.println("2. Lihat Data");
    System.out.println("3. Ubah Gaji");
    System.out.println("4. Hapus Karyawan");
    System.out.println("5. Keluar");
    System.out.println("====================");
    System.out.print("Pilih: ");
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk membaca input dari keyboard, dan method `System.out.prin`t serta `System.out.println` untuk menampilkan pesan ke pengguna.

```bash
Scanner input = new Scanner(System.in);

System.out.print("Masukkan nama Anda: ");
String nama = input.nextLine();

System.out.println("\n====== MENU ======");
System.out.println("1. Tambah Karyawan");
System.out.println("2. Lihat Data");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, digunakan `ArrayList<karyawan>`, yaitu bentuk array dinamis di Java, untuk menyimpan data-data karyawan.

```bash
ArrayList<karyawan> daftar = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan blok `try-catch` untuk mengantisipasi input yang salah, seperti saat pengguna memasukkan gaji bukan angka atau memilih indeks karyawan yang tidak valid.

```bash
try {
    int g = Integer.parseInt(input.nextLine());
    daftar.add(new karyawan(n, p, g));
} catch (NumberFormatException e) {
    System.out.println("Input gaji salah. Harus berupa angka tanpa titik.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rizqi Akbar
NPM: 210010157

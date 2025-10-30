# 📘 QUIZ Pra UTS – Algoritma Pemrograman 
# Praktikum-Pra-uts-Week-6

### 🏫 Universitas Telkom Surabaya

**Program Studi:** Rekayasa Perangkat Lunak(RPL)
**Mata Kuliah:** Algoritma Pemrograman
**Semester 1:** Ganjil 2025/2026
**Assessment ke:** 1 
**Metode:** Tes Pengkodean

--- 

## ⚙️ Petunjuk Umum

* Terdiri dari **3 soal utama** dengan total 100 poin.
* Tidak diperkenankan menggunakan AI atau alat bantu otomatis.
* Semua logika dan kode harus dibuat manual menggunakan editor dan compiler.
* Setiap program wajib mencantumkan **nama dan NIM**.

---

## 🧩 Soal 1 – Validasi Nomor Identifikasi Perangkat (25 poin)

### 📝 Deskripsi

Dira, asisten laboratorium baru, bertugas membuat **nomor identifikasi perangkat** yang memenuhi beberapa aturan:

1. Nomor terdiri dari **tiga digit angka yang berbeda**.
   Contoh: `123`, `456`, `789`
2. Digit pertama ≤ digit kedua ≤ digit ketiga.
3. Digit ketiga **harus bilangan ganjil**.
4. Program harus **memvalidasi 5 nomor** yang diinput oleh pengguna.

### 📥 Input

5 buah angka, masing-masing terdiri dari 3 digit.

### 📤 Output

Setiap angka diikuti dengan status:

```
<nomor> valid
<nomor> tidak valid
```

### 💡 Contoh

**Input:**

```
123
456
789
101
135
```

**Output:**

```
123 valid
456 tidak valid
789 valid
101 tidak valid
135 valid
```

---

## 🚗 Soal 2 – Algoritma Tarif Parkir Otomatis (40 poin)

### 📝 Deskripsi

Buat program untuk **menghitung tarif parkir otomatis** berdasarkan lama waktu parkir kendaraan.

### 📋 Ketentuan Tarif

| Lama Parkir | Tarif    |
| ----------- | -------- |
| < 2 jam     | Rp5.000  |
| 2–5 jam     | Rp10.000 |
| > 5 jam     | Rp15.000 |

### 📥 Input

* Jam dan menit masuk
* Jam dan menit keluar

### 📤 Output

* Lama waktu parkir
* Tarif parkir yang harus dibayar

### 💡 Catatan

Gunakan **percabangan (if–else)** untuk menentukan tarif berdasarkan durasi hasil perhitungan selisih waktu masuk dan keluar.

---

## 🔢 Soal 3 – Faktor Persekutuan Terbesar (FPB) (35 poin)

### 📝 Deskripsi

Program harus dapat menentukan **Faktor Persekutuan Terbesar (FPB)** dari dua bilangan bulat.
FPB adalah bilangan bulat terbesar yang dapat membagi habis kedua bilangan tersebut.

### 📥 Input

Dua bilangan bulat, misalnya:

```
9 12
```

### 📤 Output

Hasil FPB dari kedua bilangan tersebut:

```
FPB 9 dan 12 adalah 3
```

### 💡 Contoh Lain

| Input  | Output                        |
| ------ | ----------------------------- |
| 12 16  | FPB dari 12 dan 16 adalah 4   |
| 120 80 | FPB dari 120 dan 80 adalah 40 |
| 27 45  | FPB dari 27 dan 45 adalah 9   |

---

## 🧠 Tujuan Pembelajaran

* Menggunakan **logika dasar pemrograman**.
* Menerapkan **struktur kontrol (percabangan & perulangan)**.
* Mengembangkan **algoritma sederhana menjadi program nyata**.

---

## 🧾 Catatan Tambahan ni

* Program berjalan **tanpa error**.
* Menggunakan **komentar dan format kode yang rapi**.
* Hasil output sesuai dengan contoh yang diminta.

---

✍️ **Disusun oleh:**
Mahasiswa Rekayasa Perangkat Lunak
Universitas Telkom Surabaya

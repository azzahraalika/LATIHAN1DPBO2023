# Saya [Azzahra Alika Putri Yudha] [2105899]
# mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
# Aamiin.


from Mahasiswa import Mahasiswa

mhs1 = Mahasiswa("Taeyong", "21010795", "IlmuKomputer", "FPMIPA", "6")
mhs2 = Mahasiswa("Alika", "2105899", "IlmuKedokteran", "FK", "4")
mhs3 = Mahasiswa("Mark", "21020899", "SastraInggris", "FPBS", "4")

mhs = []

print("========================")
print("          MENU          ")
print("========================")
print("1. Tambah Data Mahasiswa")
print("2. Tampilkan Data Mahasiswa")
print("3. Update Data Mahasiswa")
print("4. Hapus Data Mahasiswa")
print("5. Exit")
print(" ")

mhs.append(mhs1)
mhs.append(mhs2)
mhs.append(mhs3)

n = 0
__NIM = ""
while n != 5:
    n = int(input("Pilihan  : "))
    print(" ")
    if n == 1:
        print("== Masukkan data mahasiswa ==")
        nama = input("Nama           : ")
        nim = input("NIM            : ")
        prodi = input("Program Studi  : ")
        fakultas = input("Fakultas       : ")
        semester = input("Semester       : ")

        mhs.append(Mahasiswa(nama, nim, prodi, fakultas, semester))
        print("BERHASIL DITAMBAHKAN!")
        print(" ")

    elif n == 2:
        print("== DATA MAHASISWA 2023 ==")
        i = 0
        for mahasiswa in mhs:
            print(str(i + 1) + ".", "Nama           : " + mahasiswa.getNama())
            print("   NIM            : " + mahasiswa.getNim())
            print("   Program Studi  : " + mahasiswa.getProdi())
            print("   Fakultas       : " + mahasiswa.getFakultas())
            print("   Semester       : " + mahasiswa.getSemester())
            print(" ")
            i += 1

    elif n == 3:
        print("Masukkan NIM mahasiswa yang ingin diubah datanya!")
        NIM = input("NIM    : ")

        for mahasiswa in mhs:
            if NIM.lower() == mahasiswa.getNim().lower():
                print("Silahkan masukkan data baru")
                nama = input("   Nama           : ")
                nim = input("   NIM            : ")
                prodi = input("   Program Studi  : ")
                fakultas = input("   Fakultas       : ")
                semester = input("   Semester       : ")

                mahasiswa.setNama(nama)
                mahasiswa.setNim(nim)
                mahasiswa.setProdi(prodi)
                mahasiswa.setFakultas(fakultas)
                mahasiswa.setSemester(semester)
                print("BERHASIL DI UPDATE!")
                print(" ")

    elif n == 4:
       print("Masukkan NIM yang ingin dihapus!") 
       NIM = input("NIM     : ")
       i =0
       for mahasiswa in mhs:
            if NIM.lower() == mahasiswa.getNim().lower():
                mhs.pop(i)
                break
            print("BERHASIL DI HAPUS!")
            print(" ")
            i += 1
            


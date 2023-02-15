/*
Saya [Azzahra Alika Putri Yudha] [2105899]
mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/


import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("Taeyong", "21010795", "IlmuKomputer", "FPMIPA", 6);
        Mahasiswa mhs2 = new Mahasiswa("Alika", "2105899", "IlmuKedokteran", "FK", 4);
        Mahasiswa mhs3 = new Mahasiswa("Mark", "21020899", "SastraInggris", "FPBS", 4);

        int i, n = 0;
        String nama = "";
        String nim = "";
        String prodi = "";
        String fakultas = "";
        int semester = 0;
        String NIM = "";

        ArrayList<Mahasiswa> list = new ArrayList<>();

        System.out.println("========================");
        System.out.println("          MENU          ");
        System.out.println("========================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Update Data Mahasiswa");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("0. Exit");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        list.add(mhs1);
        list.add(mhs2);
        list.add(mhs3);

        do{
            System.out.print("Pilihan    : ");
           try{
            n = sc.nextInt();
            }catch(Exception e){
                System.out.println("Harus integer!");
            }
            System.out.println(" "); 

            if(n == 1){
                System.out.println("== Masukkan data mahasiswa ==");
                System.out.print("Nama           : ");
                try{
                    nama = sc.next();
                }catch (Exception e){
                }

                System.out.print("NIM            : ");
                try{
                    nim = sc.next();
                }catch (Exception e){
                }

                System.out.print("Program Studi  : ");
                try{
                    prodi = sc.next();
                }catch (Exception e){
                }

                System.out.print("Fakultas       : ");
                try{
                    fakultas = sc.next();
                }catch (Exception e){
                }

                System.out.print("Semester       : ");
                try{
                    semester = sc.nextInt();
                }catch (Exception e){
                }

                Mahasiswa temp = new Mahasiswa(nama, nim, prodi, fakultas, semester);
                list.add(temp);
                System.out.println("BERHASIL DITAMBAHKAN!");
                System.out.println(" ");
            }    
            else if(n == 2){
                System.out.println("== DATA MAHASISWA 2023 ==");
                for(i = 0; i < list.size(); i++){
                    System.out.println(Integer.toString(i + 1) + "." + "Nama           : " + list.get(i).getNama());
                    System.out.println("  NIM            : " + list.get(i).getNim());
                    System.out.println("  Program Studi  : " + list.get(i).getProdi());
                    System.out.println("  Fakultas       : " + list.get(i).getFakultas());
                    System.out.println("  Semester       : " + list.get(i).getSemester());
                    System.out.println(" ");
                }
            }
            else if(n == 3){
                System.out.println("Masukkan NIM mahasiswa yang ingin diubah");
                System.out.print("NIM   : ");
                try{
                    NIM = sc.next();
                }catch (Exception e){
                }

                for(i = 0; i < list.size(); i++){
                    if(NIM.equals(list.get(i).getNim())){
                        System.out.println("Masukkan data baru : ");
                        System.out.print("    Nama           : ");
                        try{
                            nama = sc.next();
                        }catch (Exception e){
                        }

                        System.out.print("    NIM            : ");
                        try{
                            nim = sc.next();
                        }catch (Exception e){
                        }

                        System.out.print("    Program Studi  : ");
                        try{
                            prodi = sc.next();
                        }catch (Exception e){
                        }

                        System.out.print("    Fakultas       : ");
                        try{
                            fakultas = sc.next();
                        }catch (Exception e){
                        }

                        System.out.print("    Semester       : ");
                        try{
                            semester = sc.nextInt();
                        }catch (Exception e){
                        }
                        
                        list.get(i).setNama(nama);
                        list.get(i).setNim(nim);
                        list.get(i).setProdi(prodi);
                        list.get(i).setFakultas(fakultas);
                        list.get(i).setSemester(semester);
                        System.out.println("BERHASIL DI UPDATE!");
                        System.out.println(" ");                        
                    }
                }
            }
            else if(n == 4){
                System.out.println("Masukkan NIM mahasiswa yang ingin dihapus");
                System.out.print("NIM   : ");
                try{
                    NIM = sc.next();
                }catch (Exception e){
                }

                for(i = 0; i < list.size(); i++){
                    if(NIM.equals(list.get(i).getNim())){
                        list.remove(i);
                    }
                }

                System.out.println("BERHASIL DI HAPUS");
                System.out.println(" ");
            }
        }while(n != 0);
    }
}
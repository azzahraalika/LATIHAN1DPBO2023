/*
Saya [Azzahra Alika Putri Yudha] [2105899]
mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/


import java.util.Arrays;


public class Mahasiswa{
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;
    private int semester;

    public Mahasiswa(){
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
        this.semester = 0; 
    }

    public Mahasiswa(String nama, String nim, String prodi, String fakultas, int semester){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.semester = semester;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim(){
        return this.nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getProdi(){
        return this.prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    public int getSemester(){
        return this.semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }
}
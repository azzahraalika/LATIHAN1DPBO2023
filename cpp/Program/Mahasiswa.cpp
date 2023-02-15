/*
Saya [Azzahra Alika Putri Yudha] [2105899]
mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/


#include <iostream>
#include <string>

using namespace std;

class Mahasiswa{
    private:
        string nama;
        string nim;
        string prodi;
        string fakultas;
        int semester;

    public:
        Mahasiswa(){
            this->nama = "";
            this->nim = "";
            this->prodi = "";
            this->fakultas = "";
            this->semester = 0;
        }

        Mahasiswa(string nama, string nim, string prodi, string fakultas, int semester){
            this->nama = nama;
            this->nim = nim;
            this->prodi = prodi;
            this->fakultas = fakultas;
            this->semester = semester;
        }

        void setNama(string nama){
            this->nama = nama;
        }

        string getNama(){
            return this->nama;
        }

        void setNim(string nim){
            this->nim = nim;
        }

        string getNim(){
            return this->nim;
        }

        void setProdi(string prodi){
            this->prodi = prodi;
        }

        string getProdi(){
            return this->prodi;
        }

        void setFakultas(string fakultas){
            this->fakultas = fakultas;
        }

        string getFakultas(){
            return this->fakultas;
        }

        void setSemester(int semester){
            this->semester = semester;
        }

        int getSemester(){
            return this->semester;
        }

        ~Mahasiswa(){
            
        }
};
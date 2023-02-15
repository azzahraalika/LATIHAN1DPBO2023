/*
Saya [Azzahra Alika Putri Yudha] [2105899]
mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/


#include <bits/stdc++.h>
#include "Mahasiswa.cpp"


using namespace std;

int main(){
    Mahasiswa mhs1("Taeyong", "21010795", "IlmuKomputer", "FPMIPA", 6);
    Mahasiswa mhs2("Alika", "2105899", "IlmuKedokteran", "FK", 4);
    Mahasiswa mhs3("Mark", "21020899", "SastraInggris", "FPBS", 4);

    int i, n = 0;
    string nama;
    string nim;
    string prodi;
    string fakultas;
    int semester;
    string NIM;

    list<Mahasiswa> llist;

    cout << "========================" << '\n';
    cout << "          MENU          " << '\n';
    cout << "========================" << '\n';
    cout << "1. Tambah Data Mahasiswa" << '\n';
    cout << "2. Tampilkan Data Mahasiswa" << '\n';
    cout << "3. Update Data Mahasiswa" << '\n';
    cout << "4. Hapus Data Mahasiswa" << '\n';
    cout << "0. Exit" << '\n';
    cout << '\n';

    llist.push_back(mhs1);
    llist.push_back(mhs2);
    llist.push_back(mhs3);

    do{
        cout << "Pilihan  : ";
        cin >> n;
        cout << '\n';

        if(n == 1){
            Mahasiswa temp;

            cout << "== Masukkan data mahasiswa ==" << '\n';
            cout << "Nama           : ";
            cin >> nama;

            cout << "NIM            : ";
            cin >> nim;

            cout << "Program Studi  : ";
            cin >> prodi;

            cout << "Fakultas       : ";
            cin >> fakultas;

            cout << "Semester       : ";
            cin >> semester;

            temp.setNama(nama);
            temp.setNim(nim);
            temp.setProdi(prodi);
            temp.setFakultas(fakultas);
            temp.setSemester(semester);

            llist.push_back(temp);
            cout << "BERHASIL DITAMBAHKAN" << '\n';
            cout << '\n';
        }
        else if(n == 2){
            cout << "== DATA MAHASISWA 2023 ==" << '\n';
            i = 0;
            for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
                cout << (i + 1) << "." << "Nama           : " << it->getNama() << '\n';
                cout << "  NIM            : " << it->getNim() << '\n';
                cout << "  Program Studi  : " << it->getProdi() << '\n';
                cout << "  Fakultas       : " << it->getFakultas() << '\n';
                cout << "  Semester       : " << it->getSemester() << '\n';
                cout << '\n';
                i++;
            }
        }
        else if(n == 3){
            cout << "Masukkan NIM mahasiswa yang ingin diubah" <<'\n';
            cout << "NIM    : ";
            cin >> NIM;
            cout << '\n';

            for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
                if(NIM == it->getNim()){
                    cout <<"Masukkan data baru : " << '\n';
                    cout << "    Nama           : ";
                    cin >> nama;

                    cout << "    NIM            : ";
                    cin >> nim;

                    cout << "    Program Studi  : ";
                    cin >> prodi;

                    cout << "    Fakultas       : ";
                    cin >> fakultas;

                    cout << "    Semester       : ";
                    cin >> semester;

                    it->setNama(nama);
                    it->setNim(nim);
                    it->setProdi(prodi);
                    it->setFakultas(fakultas);
                    it->setSemester(semester);

                    break;
                }
            }

            cout << "BERHASIL DI UPDATE!" << '\n';
            cout << '\n';
        }
        else if(n == 4){
            cout << "Masukkan NIM mahasiswa yang ingin dihapus" << '\n';
            cout << "NIM    : ";
            cin >> NIM;
            cout << '\n';

            for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
                if(NIM == it->getNim()){
                    llist.erase(it);

                    break;
                }
            }  
            
            cout << "BERHASIL DI HAPUS" << '\n';
            cout << '\n';
        }

    }while(n != 0);

    return 0;

};
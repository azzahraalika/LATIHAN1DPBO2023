<?php


// Saya [Azzahra Alika Putri Yudha] [2105899]
// mengerjakan LATIHAN 2 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
// Aamiin.


class Mahasiswa{
    private $nama = '';
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';
    private $kelamin = '';
    private $semester = 0;

    public function __construct($nama = '', $nim = '', $prodi = '', $fakultas = '', $kelamin = '', $semester = 0){
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->kelamin = $kelamin;
        $this->semester = $semester;
    }

    public function setNama($nama){
        $this->nama = $nama;
    }

    public function getNama(){
        return $this->nama;
    }

    public function setNim($nim){
        $this->nama = $nim;
    }

    public function getNim(){
        return $this->nim;
    }

    public function setProdi($prodi){
        $this->prodi = $prodi;
    }

    public function getProdi(){
        return $this->prodi;
    }

    public function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }

    public function getFakultas(){
        return $this->fakultas;
    }

    public function setKelamin($kelamin){
        $this->kelamin = $kelamin;
    }

    public function getKelamin(){
        return $this->kelamin;
    }

    public function setSemester($semester){
        $this->semester = $semester;
    }

    public function getSemester(){
        return $this->semester;
    }

    public function __destruct() {
        
    }
}
?>
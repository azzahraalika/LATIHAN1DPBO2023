<?php


// Saya [Azzahra Alika Putri Yudha] [2105899]
// mengerjakan LATIHAN 2 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
// Aamiin.


require ('Mahasiswa.php');

$mahasiswa = new Mahasiswa('Azzahra Alika', '2105899', 'Ilmu Komputer', 'FPMIPA', 'P', 4);
$mahasiswa1 = new Mahasiswa('bubu', '2106900', 'Ilmu Komputer', 'FPMIPA', 'L', 6);

echo '<table>';

echo '<tr><td>Nama</td><td>:</td><td>' . $mahasiswa->getNama() . '</td></tr>';
echo '<tr><td>NIM</td><td>:</td><td>' .  $mahasiswa->getNim() . '</td></tr>';
echo '<tr><td>Program Studi</td><td>:</td><td>' . $mahasiswa->getProdi() . '</td></tr>';
echo '<tr><td>Fakultas</td><td>:</td><td>' . $mahasiswa->getFakultas() . '</td></tr>';
echo '<tr><td>Jenis Kelamin</td><td>:</td><td>' . $mahasiswa->getKelamin() . '</td></tr>';
echo '<tr><td>Semester</td><td>:</td><td>' . $mahasiswa->getSemester() . '</td></tr>';

echo '</table>';
echo '<hr>';

echo '<table>';
echo '<tr><td>Nama</td><td>:</td><td>' . $mahasiswa1->getNama() . '</td></tr>';
echo '<tr><td>NIM</td><td>:</td><td>' .  $mahasiswa1->getNim() . '</td></tr>';
echo '<tr><td>Program Studi</td><td>:</td><td>' . $mahasiswa1->getProdi() . '</td></tr>';
echo '<tr><td>Fakultas</td><td>:</td><td>' . $mahasiswa1->getFakultas() . '</td></tr>';
echo '<tr><td>Jenis Kelamin</td><td>:</td><td>' . $mahasiswa1->getKelamin() . '</td></tr>';
echo '<tr><td>Semester</td><td>:</td><td>' . $mahasiswa1->getSemester() . '</td></tr>';
echo '</table>';

?>
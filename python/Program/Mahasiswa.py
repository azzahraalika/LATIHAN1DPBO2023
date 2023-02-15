# Saya [Azzahra Alika Putri Yudha] [2105899]
# mengerjakan LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
# Aamiin.


class Mahasiswa:
    __nama = ""
    __nim = ""
    __prodi = ""
    __fakultas = ""
    __semester = ""

    def __init__(self, nama = "", nim = "", prodi = "", fakultas = "", semester = ""):
        self.__nama = nama
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas
        self.__semester = semester

    def getNama(self):
        return self.__nama

    def setNama(self, nama):
        self.__nama = nama

    def getNim(self):
        return self.__nim

    def setNim(self, nim):
        self.__nim = nim

    def getProdi(self):
        return self.__prodi

    def setProdi(self, prodi):
        self.__prodi = prodi

    def getFakultas(self):
        return self.__fakultas

    def setFakultas(self, fakultas):
        self.__fakultas = fakultas

    def getSemester(self):
        return self.__semester

    def setSemester(self, semester):
        self.__semester = semester

package AbsentStudent;
// Generated Sep 30, 2021 10:24:13 PM by Hibernate Tools 4.3.1


import NamaSiswa.Nama_Siswa;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * TblSiswa generated by hbm2java
 */
@ManagedBean
public class TblSiswa  implements java.io.Serializable {


     private int idSiswa;
     private String nomorSiswa;
     private String kelas;
     private String namaSiswa;
     private String tanggalLahir;
     private String jenisKelamin;
     private String alamat;
     
    public void save_siswa()
    {
        Nama_Siswa add = new Nama_Siswa();
        add.add_siswa(this);
    }
     
    public List<TblSiswa> getAllRecords()
    {
        Nama_Siswa stud = new Nama_Siswa();
        List<TblSiswa> iStud = stud.retrieveTblSiswa();
        return iStud;
    }
     
    public String getById()
    {
        String id_siswa = Integer.toString(idSiswa);
        Nama_Siswa stud = new Nama_Siswa();
        List<TblSiswa> stud1 = stud.getbyID(id_siswa);
        try {
            if (stud1 != null) {
                idSiswa = stud1.get(0).idSiswa;
                nomorSiswa = stud1.get(0).nomorSiswa;
                kelas = stud1.get(0).kelas;
                namaSiswa = stud1.get(0).namaSiswa;
                tanggalLahir = stud1.get(0).tanggalLahir;
                jenisKelamin = stud1.get(0).jenisKelamin;
                alamat = stud1.get(0).alamat;
                return "Nama Siswa";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Failed Search Nama Siswa";
    }
    
    public String editSiswa()
    {
        Nama_Siswa stud = new Nama_Siswa();
        stud.editSiswa(this);
        idSiswa = 0;
        nomorSiswa = "";
        kelas = "";
        namaSiswa = "";
        tanggalLahir = null;
        jenisKelamin = "";
        alamat = "";
        return "Nama Siswa";
    }
    
    public String deleteSiswa()
    {
        //String id_siswa = Integer.toString(idSiswa);
        Nama_Siswa stud = new Nama_Siswa();
        stud.deleteSiswa(idSiswa);
        idSiswa = 0;
        nomorSiswa = "";
        kelas = "";
        namaSiswa = "";
        tanggalLahir = null;
        jenisKelamin = "";
        alamat = "";
        return "Nama Siswa";
    }

    public TblSiswa() {
    }

    public TblSiswa(int idSiswa, String nomorSiswa, String kelas, String namaSiswa, String tanggalLahir, String jenisKelamin, String alamat) {
       this.idSiswa = idSiswa;
       this.nomorSiswa = nomorSiswa;
       this.kelas = kelas;
       this.namaSiswa = namaSiswa;
       this.tanggalLahir = tanggalLahir;
       this.jenisKelamin = jenisKelamin;
       this.alamat = alamat;
    }
   
    public int getIdSiswa() {
        return this.idSiswa;
    }
    
    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }
    public String getNomorSiswa() {
        return this.nomorSiswa;
    }
    
    public void setNomorSiswa(String nomorSiswa) {
        this.nomorSiswa = nomorSiswa;
    }
    public String getKelas() {
        return this.kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public String getNamaSiswa() {
        return this.namaSiswa;
    }
    
    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }
    public String getTanggalLahir() {
        return this.tanggalLahir;
    }
    
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }




}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs112b.pkg2022429952.latihan60.akatsuki;

/**
 *
 * @author Eggi Firman S
 */
public class Orochimaru extends Akatsuki {
    private String partnerKerja;

    public Orochimaru() {
        this.nama = "Orochimaru";
        this.asalNegara = "Konohagakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Kayu, Yin, Yang ";
        this.jutsu = "Teknik Memanggil, Teknik Klon Ular, Edo Tensei";
        this.partnerKerja = "Sasori";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah salah satu Sannin legendaris dari  " + asalNegara+
                ". \nOrochimaru dulu pernah menjadi anggota akatsuki sebelum dia hijrah ke Otogakure " +
                "\ndan memutuskan untuk bersolo karir. Dia keluar setelah gagal mengambil tubuh " +
                "\nItachi Uchiha lalu pergi ke desa Otogakure.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}

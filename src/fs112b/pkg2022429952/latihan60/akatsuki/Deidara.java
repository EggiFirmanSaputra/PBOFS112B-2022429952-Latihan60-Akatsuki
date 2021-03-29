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
public class Deidara extends Akatsuki {
    private String partnerKerja;

    public Deidara() {
        this.nama = "Deidara";
        this.asalNegara = "Iwagakure";
        this.elemen = "Tanah dan ledakan";
        this.jutsu = "-";
        this.partnerKerja = "Sasori kemudian dengan Tobi(Obito)";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah Ninja Pelarian dari " + asalNegara);
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
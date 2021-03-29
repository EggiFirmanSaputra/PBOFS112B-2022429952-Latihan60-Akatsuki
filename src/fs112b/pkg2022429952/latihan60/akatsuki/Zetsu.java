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
public class Zetsu extends Akatsuki {
    private String partnerKerja;

    public Zetsu() {
        this.nama = "Zetsu";
        this.asalNegara = "-";
        this.elemen = "Kayu";
        this.jutsu = "menyerap cakra";
        this.partnerKerja = "Obito";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah mata-mata Akatsuki. Zetsu terdiri dari zetsu hitam dan putih, " +
                "\n sehingga membuatnya memiliki dua kepribadian. Kanibal. Zetsu Hitam diciptakan oleh Kaguya");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
import java.util.Scanner;
class SumGenap
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int angka;
        int n = 0;
        int genap = 0;
        int repeat = 0;
        /* ^^^^^^^^^^^^^
        Pendeklarasian awal, dari variabel */
//======================================================================================================
        System.out.print("masukkan angka : ");
        angka = sc.nextInt();
        /*Peng inputan batasan dari proses Pengulangan */
//======================================================================================================
        if(angka>0)
        /*Syarat awal untuk di lakukannya proses selanjutnya. 
        Sehingga angka tidak boleh negatieve*/
//======================================================================================================
        {
            while(repeat<angka)
            /*Pernyataan bersyarat, di artikan : Jika repeat tidak lebih dari angka,
            maka akan di lakukannya serangkaian proses , namun proses dalam while akan berhenti
            ketika variabel repeat lebih besar dari variabel inputan angka*/
//======================================================================================================
            {
                n = n + genap;
                /*n di gunakan sebagai awalan perhitungan dari proses */
//======================================================================================================
                genap = genap + 2;
                /*genap di gunakan sebagai penjumlahan bilangan genap,
                yang mana Variabel genap akan di proses +2 (Karena bilangan genap) setiap terjadinya
                proses "While" */
//======================================================================================================
                repeat++;
                /*repeat variabel untuk pengulangan, gunanya membatasi Loop/pengulangan. */
//======================================================================================================
            }
            System.out.print(n);
            /*yang di keluarkan variabel "n" karena variabel tsb menyimpan hasil dari penjumlahan
            di mana carakerjanya dengan pendeklarasian bahwa n = n + genap */
//======================================================================================================
        }
        else
        System.out.print("TIDAK BOLEH NEGATIF");

    }
}
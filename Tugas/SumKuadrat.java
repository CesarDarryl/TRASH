import java.util.Scanner;
class SumKuadrat
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int angka;
        int kuadrat;
        int penjumlahan = 0;
        /*Predefined data, dimana berisi Type dari variabel */
        /*variabel penjumlahan di nyatakan 0
        supaya tidak terjadi error karena variabel tidak memiliki nilai(Null) */
        int n = 1;
//======================================================================================================
        System.out.print("Masukkan angka\t : ");
        angka = sc.nextInt();

        if(angka>0)
        {
            do
           {
               /*Mencari hasil perkalian kuadrat */
               kuadrat = n*n;
//======================================================================================================
               /*setelah selesai, Variabel kuadrat akan ber isi
               nilai dari hasil perkalian n, dimana variabel n dimulai dari 1 */

               /*setelah variabel kuadrat di ketahui, maka akan di proses dengan
               menambahkannya oleh variabel penjumlahan
               variabel penjumlahan di deklarasikan = 0. */
               penjumlahan += kuadrat;
//======================================================================================================
               /*melakukan Counter untuk menambahkan nilai dari n, 
               yang semula 1 akan di tambahkan 1(n++ adalah menambahkan 1) menjadi 2.
               dan akan di proses pada pencarian variabel nilai kuadrat.*/
               n++;
//======================================================================================================
           }
           /*Setelah proses perhitungan selesai, maka akan di periksa,
           apakah variabel n melebihi dari variabel angka?
           jika iya , makan akan di lakukan proses Output/Print out hasil dari n
           jika tidak , maka proses Loop/Pengulangan akan terus terjadi
           sampai variabel n melebihi variabel angka */
           while(n<=angka);
           System.out.print("Nilai penjumlahan bilangan kuadrat pertama2 : " + penjumlahan);
//======================================================================================================
        }
        else
        System.out.print("Angka tidak boleh negative");
    }
}
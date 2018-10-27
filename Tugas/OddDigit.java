import java.util.Scanner;
class OddDigit
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int angka;
        int ganjil = 0;
        int i;
        /*Predefined data, dimana berisi Type dari variabel */
//======================================================================================================
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        /*Peng inputan angka yang akan di periksa Ganjil genap nya */
//======================================================================================================
        if(angka>0)
        /*Pernyataan dimana variabel angka harus lebih dari 0
        atau tak boleh negativ */
//======================================================================================================
        {
            while(true)
            /*Syarat pengulangan di anggap true,
            pengulangan akan terus di lakukan
            sampai ada Syarat untuk melakukan break */
//======================================================================================================
            {
                i = angka%10;
                /*mengisi variabel i dengan hasil dari modulus inputan 
                dengan kata lain, variabel angka akan terus di bagi dengan 10
                dan mengambil hasil sisa dari pembagian*/
//======================================================================================================
                if(i %2 == 1)
                /*Setelah itu isi variabel i akan di cek ,apakah dia itu ganjil
                atau genap */
//======================================================================================================
                {
                    /*Apa bila terbukti ganjil, maka Counter akan menambahkan
                    angka 1 (+1) dan akan menyimpannya pada variabel Ganjil
                    .tiap lolos dari pernyataan if di atas akan selalu di tambah 1(+1). */
                    ganjil++;
//======================================================================================================
                }
                /*Angka akan selalu di bagi 10, guna melakukan pengecekan
                pada urutan Angka yang di inputkan.
                karena di bagi 10 sama saja memajukan Koma dari belakang ke depan
                dan angka di belakang koma itulah yang akan di lakukan pengecekan
                untuk mengisi variabel i */
                angka = angka/10;
//======================================================================================================
                /*jika variabel angka setelah di bagi 10,Kurang dari 0/ sama dengan 0
                maka akan di lakukan Break/ pemberhentian Loop */
                if(angka <= 0)break;
//======================================================================================================
            }
            /*di lakukan peng Outputan variabel Ganjil.
            variabel ganjil adalah variabel Counter 
            yang akan terus bertambah satu (+1)
            jika syarat di atas Terpenuhi */
            System.out.print(ganjil);
//======================================================================================================
        }
        else
        {
            /*Output apabila angka inputan yang di masukkan kurang dari 0/ negative */
            System.out.print("angka tidak boleh negative");
        }
    }
}
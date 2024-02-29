import java.util.Scanner;
public class PersegiPanjangDemo_1 {
    Scanner sc = new Scanner(System.in);
    PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

    for (int i = 0; i< 3; i++){
        arrayOfPersegiPanjang[i] = new PersegiPanjang();

        System.out.println("Persegi Panjang ke-" + (i+1) + " :");
        System.out.print("Masukkan Panjang: ");
        arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        System.out.println("Masukkan Lebar: ");
        arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    }
    for  (int j = 0; j < 3; j++) {
        System.out.println("Persegi Panjang ke-" + (j+1)+ ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
    }
    
}
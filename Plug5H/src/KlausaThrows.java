
public class KlausaThrows {
    public static void uji(int angka) {
       if ( angka <0 ){
           throw new NullPointerException ("KESALAHAN :"+ "Null Pointer EXCEPTION");
       } else {
           throw new ArithmeticException ("KESALAHAN :"+"Arithmetic Exception ");
       }
    }
    
    public static void main(String[] args) {
        System.out.println("\n***** MENGGUNAKAN KLAUSA "+"THROWSSS\n");
        try {
            uji(0);
        } catch (Exception exc){
            System.err.println("Exception ditangkap disini");
            System.err.println("\tPemberitahuan!!!"+exc.getMessage());
    }
        System.out.println("Pernyataan ini diluar blok trycatch");
    
}
}
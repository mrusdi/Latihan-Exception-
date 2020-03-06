
public class TryCatchFinally {
     public static void main(String[] args) {
        System.out.println("\n*******program"+"TANPA EXCEPTION HANDLING"+"******\n");
        try {
             int hasil =9/0;
        System.out.println("Hasil pembagian ="+ hasil);
        System.out.println("Pernyataan setelah "+"bebas dari exception");
      }
        catch (ArithmeticException exc ){
            System.out.println("");
            System.err.println("ArithmeticException "+ "menangkap exception hasil pembagian"+"oleh nol");
            System.err.println("\n Exception yang ditangkap"+"adalah"+ exc);
            System.out.println("");
           }
       finally {
            System.out.println("");
            System.out.println("\n pernyataan dalam blok finally");
        }
        System.out.println("\n pernyataan diluar blok "+"try-catchfinally");
        }
}

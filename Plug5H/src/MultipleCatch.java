
public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("\n******* MENGGUNAKAN MULTIPLE"+ "CATCH\n");
        try {
            int [] array = new int[9];
            array[9] = 13/1;
            System.out.println("Elemen array index ke"+ "9 adalah "+array[9]);
            System.out.println("Pernyataan dalam  blok "+ "try setelah bebas dari exception.");
        }catch (ArrayIndexOutOfBoundsException exc){
            System.err.println("Aanda mengakses array di"+ "luar index yang di deklarasikan.");
        } catch (NegativeArraySizeException exc){
            System.err.println("Anda mendeklarasikan array"+"dengan ukuran negatif.");
        }catch (Exception exc){
            System.err.println(" Anda melakukan pembagian"+"bilangan oleh nol");
        }
    }
}

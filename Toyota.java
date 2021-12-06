public class Toyota extends Mobil {
    public void tampilkanToyota() {
    String bahanBakar;
        
    bahanBakar = "Solar";
    Mobil m = new Mobil();
    m.inputdata("Fortuner","SUV","Semi-Automatic");
    m.tampildata();
        
    System.out.println("Jenis bahan bakar : "+bahanBakar);
    }
}

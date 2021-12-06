public class Honda extends Mobil {
    public void tampilkanHonda() {
        String bahanbakar;
        
        bahanbakar = "pertalite";
        
        Mobil m = new Mobil();
        m.inputdata("Honda Jazz","HZX","Automatic");
        m.tampildata();
        
        System.out.println("Jenis bahan bakar : "+bahanbakar);
    }
}

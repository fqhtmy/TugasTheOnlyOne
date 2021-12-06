public class Suzuki extends Mobil {
    public void tampilkanSuzuki() {
        String BahanBakar;
        
        BahanBakar = "Premium";
        Mobil m = new Mobil();
        m.inputdata("Ertiga","LMPV","Automatic");
        m.tampildata();
        
        System.out.println("Jenis bahan bakar : "+BahanBakar);
    }
}

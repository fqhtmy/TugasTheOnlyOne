public class Mobil {
    private String merk;
    private String jenis;
    private String transmisi;
    
        public String getMerk() {
            return merk;
        }
        public String getTransmisi() {
            return transmisi;
        }
        public String getJenis() {
            return jenis;
        }
        public void setJenis(String jenis) {
            this.jenis = jenis;
        }
        public void setMerk(String merk) {
            this.merk = merk;
        }
        public void setTransmisi(String transmisi) {
            this.transmisi = transmisi;
        }
        public void tampildata() {
            System.out.println("Merk mobil : "+getMerk());
            System.out.println("Jenis mobil : "+getJenis());
            System.out.println("Transmisi mobil : "+getTransmisi());      
        }
        public void inputdata(String m, String j, String t) {
            setMerk(m);
            setJenis(j);
            setTransmisi(t);            
        }
}

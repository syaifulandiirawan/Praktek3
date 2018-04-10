package praktek3;
public class rokok_filterAksi {
    public static void main(String[] args) {
        rokok_filter f = new rokok_filter();
        
        f.setMerk("sampoerna");
        f.setWarna("putih");
        f.setHarga(20000);
        //gak bisa f.jenisfilter();
        
        f.cetakInfo();
        System.out.print("merknya \t: ");
        System.out.println(f.getMerk());
        System.out.print("warnanya \t: ");
        System.out.println(f.getWarna());
        System.out.print("harganya \t: ");
        System.out.println(f.getHarga());
        
        rokok_kretek rk = new rokok_kretek();
        rk.setMerk("djisamsoe");
        rk.setWarna("coklat");
        rk.setHarga(15000);
        rk.setJenisfilter("bold");
        rk.cetakInfo();
        System.out.println("jenis \t:"+rk.getJenisfilter());
        rk.throttle();
    } 
}

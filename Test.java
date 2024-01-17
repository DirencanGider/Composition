public class Test {

    public static void main(String[] args) {

        /*
        Projenin son aşamasında Test kısmına geldik.
        Monitor[Kasa, Anakart, Monitor(Resolution)] şeklinde.
        Objeleri oluştururken küçükten büyüğe doğru gideceğiz. İlk olarak Resolution ile başlayacağız.
        */

        Resolution resolution = new Resolution(1920,1080);

        Monitor monitor = new Monitor("24IE", "PHILIPS","24", resolution);

        Kasa kasa = new Kasa("XMGT7", "XIGMATEK","METAL");

        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10,"Windows 10");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayari_ac(); /* Composition'ın mantığı işte bu. İç içe objelere referanslar sayesinde
                                        erişebiliyoruz. */

        pc.getMonitor().monitoru_kapat();

        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");

    }

}

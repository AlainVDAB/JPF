package be.vdab.jpfhfdst10.oef;

public class TestMain {
    public static void main(String[] args) {
        /*var test = new Vrachtwagen(5862);
        test.setNummerplaat("1-kar-659");
        test.setPk(2);
        test.setGemVerbruik(8.9f);
        test.setKostprijs(459.2f);
        test.setPolishouder("Badabou");


        System.out.println(test.getKyotoScore());
        test.toon();*/

        var voertuigen = new Voertuig[6];

        voertuigen[0]= new Vrachtwagen();
        voertuigen[1]= new Vrachtwagen(3654);
        voertuigen[2]= new Vrachtwagen("Alain",6002.3f,101,15.6f,"2-mpr-328",5213f);
        voertuigen[3]= new Personenwagen();
        voertuigen[4]= new Personenwagen(4,4);
        voertuigen[5]= new Personenwagen("Karen",3999.9f,20,8.2f,"1-aya-328",5,5);

        for (var voertuig :voertuigen){
            System.out.println(voertuig.toString());
            voertuig.toon();
            System.out.println("Kyotoscore :" + voertuig.getKyotoScore() +"\n");



        }


    }
}

package be.vdab.jpfhfdst7.oef;

public class Randomgenerator {
    public static void main(String[] args) {
        var lengte = 10000;
        //var test = 0;
        var raster = new int[100];

        for (var i = 0; i < lengte; i++) {
            var random = (int) (Math.random() * 100) + 1;
            raster[random - 1]++;
            //if (random == 69) {test++}
        }

        for (var i = 0; i < 100; i++) {
            if (raster[i] != 0) {
                System.out.print((i + 1) + ": " + raster[i] + "\t");

            }
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }


        }
        //System.out.println("test :" + test);
    }
}
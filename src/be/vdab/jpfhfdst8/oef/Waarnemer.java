package be.vdab.jpfhfdst8.oef;


    public class Waarnemer {
        private int maxTemp;
        private int minTemp;
        private int aantalWaarnemingen;
        private double somTemp;
        public int getMaxTemp() {
            return aantalWaarnemingen > 0 ? maxTemp : 0;
        }
        public int getMinTemp() {
            return aantalWaarnemingen > 0 ? minTemp : 0;
        }
        public int getAantalWaarnemingen() {
            return aantalWaarnemingen;
        }
        public double getGemTemp() {
            return aantalWaarnemingen > 0 ? somTemp/aantalWaarnemingen : 0;
        }

        public void registreer(int temp) {
            somTemp += temp;
            aantalWaarnemingen++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
        }
    }


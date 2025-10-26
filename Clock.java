public class Clock {
    //Déclaration et encapsulation des attributes
        private int h;
        private  int m;
        private int s;

    //Création setters/getters
        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getM() {
            return m;
        }

        public void setM(int m) {
            this.m = m;
        }

        public int getS() {
            return s;
        }

        public void setS(int s) {
            this.s = s;
        }
     //Constructor
        public Clock(){
        }
        public Clock(int s){
            this.s = s;
        }
    //Methods de la Class

        public String getclock(){
            long millis = System.currentTimeMillis();
            long totalSec = millis / 1000;
            s= (int) (totalSec % 86400);

            while ( s < 0){
                s += 86400;
            }
            h = (s/3600)+ 1;
            m = (s%3600)/60;
            s = s%60;


            return String.format("%02d:%02d:%02d GMT+01", h, m, s);

        }



}

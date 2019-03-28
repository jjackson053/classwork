package classwork;

    public class SuperHero {
        protected String name;
        private  String[] specialPowers;

        public String[] getSpecialPowers(){
            return specialPowers;
        }
        public void setSpecialPowers(String[] specialPowers){
            this.specialPowers =specialPowers;
        }
        public SuperHero(){

        }

        public SuperHero(String[] specialPowers){
           this.specialPowers = specialPowers;
        }



        public String printSuperPowers(){
            String f = "";
            for(int x=0; x < specialPowers.length; x++ ){
            f = f + specialPowers[x];

            }
            return name + " powers are " + "[ "+ f +" ]";
        }
}

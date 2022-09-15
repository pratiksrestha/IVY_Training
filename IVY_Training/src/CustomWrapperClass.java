public class CustomWrapperClass {
        private int i;
        CustomWrapperClass(int i){
            this.i=i;
        }
        public int getValue(){
            return i;
        }
        public void setValue(int i){
            this.i=i;
        }
        @Override
        public String toString() {
            return Integer.toString(i);
        }

        //Testing the custom wrapper class
        public static void main(String[] args){
            CustomWrapperClass j=new CustomWrapperClass(10);
            System.out.println(j);
            System.out.println(((Object)j).getClass().getSimpleName());
        }
}

class CustomWrapper {
        private int i;
        CustomWrapper(int i){
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
}



public class CustomWrapperClass{
    public static void main(String[] args){
        CustomWrapper j=new CustomWrapper(10);
        System.out.println(j);
        System.out.println(((Object)j).getClass().getSimpleName());
    }
}
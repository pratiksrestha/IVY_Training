    class RegularFaculty {
        String name="Ritika";
        int n=5;
        public void info()
        {
            System.out.println(name+" "+n);
        }
    }
    public class GenericClassDemo<T extends RegularFaculty>
    {
        T value;

        public GenericClassDemo(T value)
        {
            this.value = value;
        }
        public void pv()

        {
            value.info();
        }

        public static void main(String[] args) {
            RegularFaculty regularFaculty=new RegularFaculty();
            GenericClassDemo<RegularFaculty> n=new GenericClassDemo<>(regularFaculty);
            n.pv();
        }

    }


public interface DemoInterface {
    public void type();
    public void action();

    default void specs(){
        System.out.println("latest model");
    }

    static void source(){
        System.out.println("solar powered");
    }

    class model{
        public void detail(){
            System.out.println("latest 9.9.9");
        }
    }
}


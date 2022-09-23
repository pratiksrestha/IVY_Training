// class MyThread extends Thread{
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getId()+"is running");
//    }
//}
//
//public class MultiThreading {
//    public static void main(String[] args) {
//        try {
//            for (int i = 0; i < 10; i++) {
//                MyThread myThread = new MyThread();
//                myThread.start();
//
//            }
//        }
//        catch(Exception e){
//            System.out.println("Exception caught");
//        }
//    }
//}

 class MyThread implements Runnable{
     @Override
     public void run(){
         System.out.println(Thread.currentThread().getId()+"is running");
     }
 }
 public class MultiThreading{
     public static void main(String[] args) {
         try{
             for(int i=0;i<10;i++){
                 Thread myThread=new Thread(new MyThread());
                 myThread.start();
             }
         }
         catch(Exception e){
             System.out.println("Exception Occurred");
         }

     }
 }

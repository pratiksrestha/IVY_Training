import java.util.*;

public class CollectionOneArrayList {
    public static void main(String[] args){
        ArrayList sample_list = new ArrayList();
        sample_list.add(1);
        sample_list.add("hello");
        sample_list.add(3.14);
        System.out.println(sample_list);
        Iterator itr = sample_list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
//        a.add("hello");
        for(int k:a)
            System.out.println(k);

        HashSet h = new HashSet<>();
        h.add(1);
        h.add("hello");
        h.add(3);
        h.add(1);
        System.out.println(h);


        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 100);
        hm.put(2, 200);
        hm.put(3, 300);
        hm.put(3, 500);
        System.out.println(hm);

        Set<Map.Entry<Integer, Integer>> st = hm.entrySet();
        for(Map.Entry<Integer, Integer> me:st){
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }

    }
}

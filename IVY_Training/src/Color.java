import java.util.*;

enum PrimaryColors {Red, Green, Blue}

interface MysteryColorAnalyser {
    int numberOfDistinctColors(List<PrimaryColors> mysteryColors);
    int colorOccurrence(List<PrimaryColors> mysteryColors, PrimaryColors color);
}
public class Color implements MysteryColorAnalyser {
    public static void main(String[] args) {
        System.out.println(PrimaryColors.Red);
        System.out.println(PrimaryColors.Green);
        System.out.println(PrimaryColors.Blue);
        List<PrimaryColors> mentos = new ArrayList<>();
        mentos.add(PrimaryColors.Red);
        mentos.add(PrimaryColors.Blue);
        mentos.add(PrimaryColors.Green);
        mentos.add(PrimaryColors.Red);
        mentos.add(PrimaryColors.Red);
        System.out.println(mentos);
        int result_distinct=new Color().numberOfDistinctColors(mentos);
        System.out.println(result_distinct);
        int result_occurrence=new Color().colorOccurrence(mentos, PrimaryColors.Red);
        System.out.println(result_occurrence);
    }
    @Override
    public int numberOfDistinctColors(List<PrimaryColors> mentos)
    {
        HashSet<PrimaryColors> hset = new HashSet<PrimaryColors>(mentos);
        return hset.size();
    }
    @Override
    public int colorOccurrence(List<PrimaryColors> mentos, PrimaryColors color)
    {
        int count=0;
        for(int i=0;i<mentos.size();i++)
        {
            if(mentos.get(i).equals(color))
            {
                count++;
            }
        }
        return count;
    }
}

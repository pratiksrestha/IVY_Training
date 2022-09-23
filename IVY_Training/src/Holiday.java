public class Holiday {
    private String name;
    private int day;
    private String month;
    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
        System.out.println(name+" "+day+" "+month);
    }

    public boolean inSameMonth(Holiday hol){
        System.out.println(this.name);
        System.out.println(hol.name);
        return this.month.equals(hol.month);
    }

    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

    public static void main(String[] args) {
        Holiday hol = new Holiday("Independence Day",4,"July");
        Holiday hol1 = new Holiday("Republic Day",31,"July");
        Holiday hol2 = new Holiday("Christmas",14,"December");
        Holiday hol3 = new Holiday("New Year Day",01,"January");

        Holiday dates[] = new Holiday[4];
        dates[0]=hol;
        dates[1]=hol1;
        dates[2]=hol2;
        dates[3]=hol3;
        for (Holiday i : dates) {
            System.out.println(i.name+" "+i.day+" "+i.month);
        }
        boolean bonusMonth = hol.inSameMonth(hol1);
        System.out.println(bonusMonth);
        double average = avgDate(dates);
        System.out.println(average);
    }
}


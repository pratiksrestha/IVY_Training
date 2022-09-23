public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String t,String s,String r){
        title=t;
        studio=s;
        rating=r;
    }
    public Movie(String t,String s){
        title=t;
        studio=s;
        rating="PG";
    }
    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.contains("PG")) {
                pgMov[newArrayIndex] = mov[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    public static void main(String[] args) {
        Movie mov = new Movie("Casino Royale","Eon Productions","PG");
        Movie mov1 = new Movie("Royale","Eon Productions","PG-13");
        Movie mov2 = new Movie("Royale","Eon Productions");

        Movie pg[]=new Movie[3];
        pg[0]=mov;
        pg[1]=mov1;
        pg[2]=mov2;
        Movie results[] = getPG(pg);
        for(int i=0; i < results.length; i++){
            if(results[i]!=null){
                System.out.println(results[i].title +" "+results[i].rating);}
        }
    }

}
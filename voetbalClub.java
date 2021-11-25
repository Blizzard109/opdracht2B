package rs.week1.practicum2b;

public class voetbalClub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private String naam;
    private int[] puntenSeizoen = new int[5];

    public voetbalClub(String naam){
        this.naam = naam;
        if(this.naam == "Feijenoord"){
            puntenSeizoen[0] = 4;
            puntenSeizoen[1] = 3;
            puntenSeizoen[2] = 1;
            puntenSeizoen[3] = 0;
            puntenSeizoen[4] = 10;
        }else{
            for(int i=0;i<=4;i++){
                puntenSeizoen[i] = 0;
            }
        }
    }

    public String ToString(){
        String s = naam + " " + puntenSeizoen[0] + " " + puntenSeizoen[1] + " " + puntenSeizoen[2] + " " + puntenSeizoen[3] + " " + puntenSeizoen[4];
        return s;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten(){
        int i = aantalGelijk * 1 + aantalGewonnen * 3;
        return i;
    }

    public static void main(String[] args){
        voetbalClub ajx = new voetbalClub("Ajax      ");
        voetbalClub feij = new voetbalClub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx.ToString());
        System.out.println(feij.ToString());
    }
}

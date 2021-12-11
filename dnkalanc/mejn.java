
public class zad8 {
    public static void main(String[] args){
        DNKLanac dnk = new DNKLanac(8);

        dnk.dodaj('A');
        dnk.dodaj('C');
        dnk.dodaj('C');
        dnk.dodaj('G');
        dnk.dodaj('T');
        dnk.dodaj('T');
        dnk.dodaj('T');
        dnk.dodaj('T');

        dnk.ispisiKarike();
        dnk.ispisiKarikeObrnuto();
    }
}
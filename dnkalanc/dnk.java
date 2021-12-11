public class DNKLanac {
    char[] DNKniz;
    int curr = 0;

    DNKLanac(int max){
        if(max <= 0){
            this.DNKniz = new char[256];
        }
        else{
            this.DNKniz = new char[max];
        }
    }

    DNKLanac(String DNK_Lanac, int maxKarika){
        this(maxKarika);
        for(int x = 0; x < DNK_Lanac.length(); x++){
            this.DNKniz[x] = DNK_Lanac.charAt(x);
        }
        this.curr = DNK_Lanac.length();
    }

    void dodaj(char x){
        if(x == 'A' || x == 'C' || x == 'G' || x == 'T'){
            this.DNKniz[curr] = x;
            curr++;
        }
    }

    int getA(){
        int counter = 0;

        for(int x = 0; x < curr; x++){
            if(this.DNKniz[x] == 'A')
                counter++;
        }

        return counter;
    }

    int getTrenutnaDuzina(){
        return curr;
    }

    int getMax(){
        return this.DNKniz.length;
    }

    int getEmpty(){
        return this.DNKniz.length - curr;
    }

    void ispisiKarike(){
        String karike = "";

        for(int x = 0; x < curr; x++)
            karike = karike + DNKniz[x];

        System.out.println(karike);
    }

    void ispisiKarikeObrnuto(){
        String karike = "";

        for(int x = (curr - 1); x >= 0; x--)
            karike = karike + DNKniz[x];

        System.out.println(karike);
    }
}
package Week_4_Build.Laskin5;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n; // Korjattu virhe, vähennä n, ei 1
    }

    public void kerro(int n) {
        tulos = tulos * n; // Lisätty kerto-operaation toteutus
    }

    public void jaa(int n) {
        if (n == 0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n; // Korjattu nelio-operaation toteutus
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }
}


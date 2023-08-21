package zipcode;

public class Hamming {

    private int Distance;
    private String s;
    private String s1;

    public Hamming(String s, String s1) throws IllegalArgumentException{
this.s = s;
this.s1 = s1

        if(s.length!=s1.length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        for (int i = 0; i < car2.length; i++) {
            if (s.charAt[i] != s1.charAt[i]) {
                Distance++;
            }
        }
    }

    public int getHammingDistance() {
        return Distance;
    }
}

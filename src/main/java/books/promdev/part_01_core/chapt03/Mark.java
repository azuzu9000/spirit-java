package books.promdev.part_01_core.chapt03;

public class Mark {
    private int mark = 3;
    public static int coeff = 5;
    
    public double getResult() {
        return (double) coeff * mark / 100;
    }
    
    public static void setCoeffFloat(float c) {
        coeff = (int) ((int) coeff * c);
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}
package praktic.geometry.shapes;
import praktic.geometry.shapes.Rectangle;

public class Rectangle {
    private int Id;
    private double Panjang;
    private double Lebar;

    public Rectangle(int Id, double Panjang, double Lebar) {
        this.Id = Id;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }

    public int getID(int Id) {
        return Id = Id;
    }

    public double getPanjang(double Panjang) {
        return Panjang = Panjang;
    }

    public double getLebar(double Lebar) {
        return Lebar = Lebar;
    }

    public double getKeliling(double Keliling) {
        return Keliling = 2 * (Panjang + Lebar);
    }

    public double getLuas(double Luas) {
        return Luas = Panjang * Lebar;
    }

    public void infoRectangle() {
        System.out.println("ID : " + Id);
        System.out.println("Panjang : " + Panjang);
        System.out.println("Lebar : " + Lebar);
        System.out.println("Keliling : " + getKeliling(Panjang));
        System.out.println("Luas : " + getLuas(Lebar));
    }
}
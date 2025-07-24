package finance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bayon
 */
public class Compte {
     
    public static long id=1234567L;
    private int code;
    private double soldes;
    private String mike;

    public Compte() {
    }

    public Compte(int code) {
        this.code = code;
    }

    public Compte(int code, double soldes) {
        this.code = code;
        this.soldes = soldes;
    }

    public Compte(double soldes) {
        this.soldes = soldes;
    }

    public Compte(int code, double soldes, String Mike) {
        this.code = code;
        this.soldes = soldes;
        this.mike = mike;
    }

    public int getCode() {
        return code;
    }

    public double getSoldes() {
        return soldes;
    }

    public String getMike() {
        return mike;

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSoldes(double soldes) {
        this.soldes = soldes;
    }

    public void setMike(String mike) {
        this.mike = mike;
    }

    @Override
    public String toString() {
        return "Compte{" + "code=" + code + ", soldes=" + soldes + ", mike=" + mike + '}';
    }

}

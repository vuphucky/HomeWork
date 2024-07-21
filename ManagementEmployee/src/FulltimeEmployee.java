public class FulltimeEmployee extends Employee {
    private double basicSalary;
    private double bonusMoney;
    private double penaltyMoney;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getPenaltyMoney() {
        return penaltyMoney;
    }

    public void setPenaltyMoney(double penaltyMoney) {
        this.penaltyMoney = penaltyMoney;
    }

    public FulltimeEmployee(String id, String name, int age, String phoneNumber, String email, double basicSalary, double bonusMoney, double penaltyMoney) {
        super(id, name, age, phoneNumber, email);
        this.basicSalary = basicSalary;
        this.bonusMoney = bonusMoney;
        this.penaltyMoney = penaltyMoney;
    }


    @Override
    public double getSalary() {
        return  basicSalary + (bonusMoney - penaltyMoney);
    }

    @Override
    public String toString() {
        return "Nhan vien fulltime: " + super.toString() + ", luong cung = " + basicSalary + ", tien thuong = " + bonusMoney + ", tien phat = " + penaltyMoney
                + ", tien luong thang nay = " + getSalary();
    }
}

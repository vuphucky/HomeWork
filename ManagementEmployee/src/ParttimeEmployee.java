public class ParttimeEmployee extends Employee {
    public double workingTime;

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    public ParttimeEmployee(String id, String name, int age, String phoneNumber, String email, double workingTime) {
        super(id, name, age, phoneNumber, email);
        this.workingTime = workingTime;
    }


    @Override
    public double getSalary() {
        return workingTime * 100000;
    }

    @Override
    public String toString() {
        return "nhan vien parttime: " + super.toString() + ", thoi gian lam viec = " + workingTime + "tien luong thang nay = " + getSalary();
    }
}

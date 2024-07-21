public class ComparableSalaryFulltime extends FulltimeEmployee implements Comparable<ComparableSalaryFulltime>{
    public ComparableSalaryFulltime(String id, String name, int age, String phoneNumber, String email, double basicSalary, double bonusMoney, double penaltyMoney) {
        super(id, name, age, phoneNumber, email, basicSalary, bonusMoney, penaltyMoney);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public int compareTo(ComparableSalaryFulltime o) {
        if (getSalary() > o.getSalary()){
            return 1;
        } else if (getSalary() < o. getSalary()){
            return -1;
        } else {
            return 0;
        }
    }
}

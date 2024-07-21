import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Employee fullTime1 = new FulltimeEmployee("FT", "Minh Juan", 24, "0123456789", "minhJuan@gmail.com", 4000000, 500000,100000);
       Employee fullTime2 = new FulltimeEmployee("FT", "Duc Juy", 24, "0123456654", "ducJuy@gmail.com", 5000000, 900000,200000);
       Employee fullTime3 = new FulltimeEmployee("FT", "Janh Long", 24, "0123456321", "janhlong@gmail.com", 10000000, 500000,500000);

       Employee partTime1 = new ParttimeEmployee("PT","Van Chuyen", 22, "0123654987", "vanchuyen@gmail.com", 30);
       Employee partTime2 = new ParttimeEmployee("PT","Phuc Ky", 24, "0123654321", "phucky@gmail.com", 29);
       Employee partTime3 = new ParttimeEmployee("PT","Minh Bo", 25, "01297654315", "minhbo@gmail.com", 25);

       Employee [] employees = {fullTime1, fullTime2,fullTime3, partTime1, partTime2, partTime3};

        System.out.println("Tien luong trung binh nhan vien cua cong ty = " + getAvrAllSalary(employees));
        System.out.println("tong tien luong cua nhan vien parttime = " + getSumParttimeSalry(employees));
        System.out.println("Nhung Nhan vien co luong thap hon luong trung binh cong ty: ");
        displayFulltimeSalaryLessArvSalary(employees);

        ComparableSalaryFulltime[] comparableSalaryFulltimes = new ComparableSalaryFulltime[3];
        comparableSalaryFulltimes[0] = new ComparableSalaryFulltime("FT", "Minh Juan", 24, "0123456789", "minhJuan@gmail.com", 4000000, 500000,100000);
        comparableSalaryFulltimes[1] = new ComparableSalaryFulltime("FT", "Duc Juy", 24, "0123456654", "ducJuy@gmail.com", 5000000, 900000,200000);
        comparableSalaryFulltimes[2] = new ComparableSalaryFulltime("FT", "Janh Long", 24, "0123456321", "janhlong@gmail.com", 7000000, 500000,500000);
        Arrays.sort(comparableSalaryFulltimes);
        System.out.println("Sap xep nhan vien fulltime luong tang dan:");
        for (ComparableSalaryFulltime fulltime: comparableSalaryFulltimes){
            System.out.println(fulltime);
        }
    }

    public static double getAvrAllSalary(Employee[] employees) {
        double sumAllSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumAllSalary += employees[i].getSalary();
        }
        double result = sumAllSalary / employees.length;
        return result;
    }

    public static double getSumParttimeSalry(Employee[] employees ){
        double sumParttimeSalry = 0;
        for (Employee employee:employees){
            if (employee instanceof ParttimeEmployee){
                sumParttimeSalry += ((ParttimeEmployee)employee).getSalary();
            }
        }
        return sumParttimeSalry;
    }

    public static void displayFulltimeSalaryLessArvSalary(Employee[] employees){
        for(Employee employee:employees){
            if (employee instanceof FulltimeEmployee && ((FulltimeEmployee)employee).getSalary() < getAvrAllSalary(employees)){
                System.out.println(employee);
            }
        }
    }

}
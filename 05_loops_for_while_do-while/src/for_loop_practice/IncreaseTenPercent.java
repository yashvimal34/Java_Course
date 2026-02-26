package for_loop_practice;

public class IncreaseTenPercent {
    public static void main(String[] args){

        double[] salary = {20000.34, 45000.65, 30000.89, 50000.34};

        for(int i = 0; i < salary.length; i++){
            salary[i] = salary[i] + (salary[i] * 0.10);
        }

        for (int i = 0; i < salary.length; i++){
            System.out.println("Updated Salary: " + salary[i]);
        }

    }
}

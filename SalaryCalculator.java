public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
    return (daysSkipped < 5) ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
    return (productsSold < 20) ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
    return (productsSold < 20) ? (productsSold * 10) : (productsSold * 13);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = multiplierPerDaysSkipped(daysSkipped) * 1000 + bonusForProductSold(productsSold)  ;
        return salary < 2000 ? salary : 2000.00;
    } 
}

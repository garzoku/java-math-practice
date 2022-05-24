public class MathApp {

  public int getLargestSalary() {
    int job1Salary = 45000;
    int job2Salary = 35000;
    return Math.max(job1Salary, job2Salary);
  }

  public int getSmallestPrice() {
    int carPrice = 25000;
    int truckPrice = 35000;
    return Math.min(carPrice, truckPrice);
  }

  public double getCircleRadius() {
    return 7.25 * 7.25 * Math.PI;
  }

  public double getSquareRoot() {
    double num1 = 5.0;
    return Math.sqrt(num1);
  }

  public double getDistanceBetween() {
    double x1 = 5;
    double y1 = 10;
    double x2 = 85;
    double y2 = 50;
    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
  }

  public double getAbsoluteValue() {
    double num2 = -3.8;
    return Math.abs(num2);
  }

  public double getRandomNumber() {
    return Math.random();
  }

  public static void main(String[] args) {
    MathApp app = new MathApp();
    System.out.println(app.getLargestSalary());
    System.out.println(app.getSmallestPrice());
    System.out.println(app.getCircleRadius());
    System.out.println(app.getSquareRoot());
    System.out.println(app.getDistanceBetween());
    System.out.println(app.getAbsoluteValue());
    System.out.println(app.getRandomNumber());
  }
}

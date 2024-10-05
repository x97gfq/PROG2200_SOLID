package LiskovSubstitution.example2;

class FullTimeEmployee extends Employee {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.2;
    }
}
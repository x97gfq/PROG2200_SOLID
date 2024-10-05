package LiskovSubstitution.example2;

class PartTimeEmployee extends Employee {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
}

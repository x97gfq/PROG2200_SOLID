package LiskovSubstitution.example3;

class WordDocument extends Document {
    @Override
    public void print() {
        System.out.println("Printing Word document");
    }
}
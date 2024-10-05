package LiskovSubstitution.example3;

class PdfDocument extends Document {
    @Override
    public void print() {
        System.out.println("Printing PDF document");
    }
}
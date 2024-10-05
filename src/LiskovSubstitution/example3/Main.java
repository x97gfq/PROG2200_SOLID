package LiskovSubstitution.example3;

import LiskovSubstitution.example1.Bird;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Document doc = new WordDocument();
        doc.print(); // Output: Printing Word document

        Document doc2 = new PdfDocument();
        doc2.print(); // Output: Printing PDF document

        //in a list:
        ArrayList<Document> docs = new ArrayList<>();
        docs.add(doc);
        docs.add(doc2);

        for(Document d:docs) {
            d.print();
        }
    }
}

public class DocumentTester
{
    public static void main(String[] args) {
        System.out.println("Testing Object Creation");
        Document doc = new Document();
        System.out.println("Object Created\nTesting getter methods");
        System.out.println(doc.getPlace());
        System.out.println(doc.getContents());
        //Should return string
        System.out.println(doc);
        System.out.println("Testing append method");
        doc.append('h');
        System.out.println(doc);
        doc.append('i');
        System.out.println(doc);
        System.out.println("Testing forward movement");
        doc.move(1);
        System.out.println(doc.getPlace());
        System.out.println("Testing backwards movement");
        doc.move(-1);
        System.out.println(doc.getPlace());
        System.out.println("Testing OOB movement");
        //Should return false
        System.out.println(doc.move(-1));
        System.out.println("Testing add function");
        doc.add('i');
        System.out.println(doc);
        System.out.println("Testing add with string");
        doc.add("abc");
        System.out.println(doc);
    }
}
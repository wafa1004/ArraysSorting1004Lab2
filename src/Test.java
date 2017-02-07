import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by ismail on 2017-02-07.
 */
public class Test {
    public static void main(String[] args){
        OrdArray ordArray1 = new OrdArray(4);
        OrdArray ordArray2 = new OrdArray(3);
        OrdArray ordArray = new OrdArray(7);

        ordArray1.insert(56);
        ordArray1.insert(44);
        ordArray1.insert(21);
        ordArray1.insert(59);

        ordArray2.insert(91);
        ordArray2.insert(12);
        ordArray2.insert(34);
        //ordArray.merge(ordArray1,ordArray2);
        ordArray1.display();
        System.out.println("--------------------------------------------------------------");
        ordArray2.display();
        System.out.println("--------------------------------------------------------------");
        ordArray.merge(ordArray1,ordArray2);
        ordArray.display();
    }
}

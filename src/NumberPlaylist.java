import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlaylist {
    public static void main(String[] args) {
        //Creating collection
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        //Method 1 using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Method 2 using explicit consumer interface
        class MyClass implements Consumer<Integer>{
            public void accept(Integer t){
                System.out.println("method2: consumer implementation: " + t);
            }
        }
        MyClass myClass = new MyClass();
        list.forEach(myClass);

        //Method 3 using anonymous consumer interface
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer e){
                System.out.println("Method3: anonymous consumer implementation: " + e);
            }
        });

        //Method 4 using explicit lambda function
        Consumer<Integer> consumer = n ->{
            System.out.println("Method4: using explicit lambda function: " + n);
        };
        list.forEach(consumer);

        //Method 5 using implicit lambda function
        list.forEach(n -> {
            System.out.println("Method5: using implicit lambda function: " + n);
        });

        //Method 6 Implicit lambda function to print double value
        Function<Integer,Double> toDoubleFunction= Integer::doubleValue;
        list.forEach(n -> {
            System.out.println("Method6: forEach lambda double value: "+ n);
            toDoubleFunction.apply(n);
        });

        //Method 7 to print even numbers
        Predicate<Integer> predicate = n -> n>0 && n%2==0;
        list.forEach(n -> System.out.println("Value of: "+ n + " check even "+ predicate.test(n)));
    }
}

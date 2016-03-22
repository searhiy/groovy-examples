package groovy

import groovy.transform.PackageScope

/**
 * Created by Serhii K. on 3/22/2016.
 */
class DifferencesWithJava {

    public static void main(String[] args) {
        int[]a = [1,2,3]

        Object o = "Object";
        int result = method(o);
        //assertEquals(1, result);

        /*new File('/path/to/file').eachLine('UTF-8') {
            println it
        }*/

        // java 8
        //Runnable run = () -> System.out.println("Run");
        //list.forEach(System.out::println);

        // groovy
        //Runnable run = { println 'run' }
        //list.each { println it } // or list.each(this.&println)
    }

    static int method(String arg) {
        return 1;
    }
    static int method(Object arg) {
        return 2;
    }
}

class Person {
    @PackageScope String name
}

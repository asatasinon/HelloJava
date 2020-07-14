package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("无参无返回值方法-Test1: HelloWorld!");
        };
        new Thread(() -> {
            System.out.println("无参无返回值方法-Test1: HelloWorld!");
        }).start();
        useTest1(
                () -> {
                    System.out.println("无参无返回值方法-Test1: HelloWorld!");
                });

        useTest2(
                (String s) -> {
                    System.out.println( "带参无返回值方法-" + s);
                });

        useTest3(
                () -> {
                    return  100;
                });

        useTest4(
                (int x, int y) -> {
                   return x + y;
                });

        /*省略参数类型*/
        useTest5(
                (x, y) -> {
                   return x + y;
                });
        /*
        不允许只省略一部分的参数类型
        要全部省略
        useTest4(
                (x, int y) -> {
                    return x + y;
                });
        */

        /*省略()*/
        useTest6(
                s -> {
                    System.out.println( "省略 () 的写法-" + s);
                });

        /*省略{} ; */
        useTest6(
                s -> System.out.println( "省略 () {} ; 的写法-" + s)
                );

        /*省略 参数类型 {} ; return */
        useTest7((x, y) -> x+y);
    }

    /*无参无返回值方法*/
    public static void useTest1(LambdaTest1 lt) {
        lt.test1();
    }
    /*带参无返回值方法*/
    public static void useTest2(LambdaTest2 lt) {
        lt.test2("Test2: HelloWorld!");
    }
    /*无参有返回值方法*/
    public static void useTest3(LambdaTest3 lt) {
        int x = lt.test3();
        System.out.println("无参有返回值方法-Test3: " + x);
    }
    /*有参有返回值方法*/
    public static void useTest4(LambdaTest4 lt) {
        int x = lt.test4(100,200);
        System.out.println("有参有返回值方法-Test4: " + x);
    }

    public static void useTest5(LambdaTest4 lt) {
        int x = lt.test4(1000,2000);
        System.out.println("省略 参数类型 的写法-Test5: " + x);
    }

    public static void useTest6(LambdaTest2 lt) {
        lt.test2("Test6: HelloWorld!");
    }

    public static void useTest7(LambdaTest4 lt) {
        int x = lt.test4(10000,20000);
        System.out.println("省略 参数类型 {} ; return 的写法-Test7: " + x);
    }

}





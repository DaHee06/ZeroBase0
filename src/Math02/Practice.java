package Math02;

public class Practice{
    public static void main(String[] args) {

        Myset a = new Myset();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new Myset(new int[]{1, 2, 3, 4, 5});
        Myset b = new Myset(new int[]{2,4,6,8,10});
        System.out.println("a: "+a.list);
        System.out.println("b: "+b.list);

        Myset result = a.retainAll(b);
        System.out.println("교집합 : " + result.list);

        result = a.addAll(b);
        System.out.println("합집합 : " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합 : " + result.list);
    }
}

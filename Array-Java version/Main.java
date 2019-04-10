public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr = new int [10];
//        for (int i=0; i<arr.length; i++)
//            arr[i] = i;
//
//        int [] scores = new int[]{100,99,66};
//        for (int i = 0; i<scores.length; i++)
//            System.out.println(scores[i]);
//
//        System.out.println("########################");
//
//        for (int score: scores)
//            System.out.println(score);
//
//
//        scores[0] = 98;
//        for (int score: scores)
//            System.out.println(score);
//
//    }

        Array<Integer> arr = new Array<>();
        for (int i = 0 ; i< 10; i++)
            arr.addLast(i);

        System.out.println(arr);

        arr.add(1,100);   //自动扩容；
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);   //缩小容量
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

    }
}

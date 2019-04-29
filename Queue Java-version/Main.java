import java.util.Random;

public class Main {
    // 测试使用q运行opCount个enqueue和dequeue操作所需要的时间，单位：秒
    private static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i<opCount ; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i<opCount;i++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime )/1000000000.0;
    }
    public static void main(String[] args) {
	// write your code here
        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue , opCount);
        System.out.println("Arrayqueue, time:" +time1 + " s");

        LoopQueue<Integer> LoopQueue = new LoopQueue<>();
        double time2 = testQueue(LoopQueue , opCount);
        System.out.println("LoopQueue, time:" +time2 + " s");
    }
}

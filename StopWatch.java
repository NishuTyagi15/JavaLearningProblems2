import java.util.Scanner;

public class StopWatch {
    public long startTime = 0;
    public long stopTime = 0;
    public long elapsed;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Start Time is :" +startTime);
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("Stop Time is :" +stopTime);
    }

    public long elapsedTime() {
        elapsed = stopTime-startTime;
        return elapsed;
    }

    public static void main (String[] args) throws Exception
	{
		StopWatch sw=new StopWatch();
		Scanner S=new Scanner (System.in);
		System.out.println("Press '1' to Start Time: ");
		S.nextInt();
		sw.start();

		System.out.println("Press '2' to Stop Time: ");
		S.nextInt();
		sw.stop();

		long q=sw.elapsedTime();
		System.out.println("Total Time Elapsed(in millisec) is:"+q);
		System.out.println("Converting millisec to seconds: "+(q/1000)+" sec");
	}
}

class MyThread extends Thread{
    @Override
    public void  run()
    {
        for(int i =0; i<10;i++)
        {
            System.out.println("This is Child Thread");
        }
    }
}
public class MultiThread {
    public static void main(String[] args)
    {
        System.out.println("Hi");
        MyThread t = new MyThread();
        t.start();
        for(int i =0; i<10;i++)
        {
            System.out.println("This is Main Thread");
            System.out.println("thread Main");
        }

    }
    
}

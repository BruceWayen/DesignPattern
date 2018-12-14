package com.github.thread;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @                           _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *@DESCRIPTION 多线程,线程池,队列
 *@AUTHOR SongHongWei
 *@TIME 2018/8/22-17:08
 *@PACKAGE_NAME prodmng.songhw.thread
 **/
public class Client
{
    public static void main(String[] args)
        throws Exception
    {
        ExecutorService executorService = Executors.newCachedThreadPool();//创建线程池
        Task task1 = creatTask("线程1");//创建线程
        Task task2 = creatTask("线程2");
        Task task3 = creatTask("线程3");
        executorService.execute(task1);//将线程加入线程池中
        executorService.execute(task1);
        executorService.execute(task1);
        executorService.execute(task1);
        executorService.execute(task1);
        executorService.execute(task1);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        Thread.sleep(600);//主线程睡眠600ms
        executorService.shutdown();//关闭线程池

        Iterator<String> iterator = task1.getQueue().iterator();//取出线程1的所有队列,并遍历
        while (true)
        {
            if (executorService.isTerminated())
            {
                while (iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }
                break;
            }
        }
    }

    public static Task creatTask(String name)
    {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        return new Task(queue, name);

    }
}

package com.github.thread;

import java.util.concurrent.ArrayBlockingQueue;

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
 *@DESCRIPTION 普通线程处理类
 *@AUTHOR SongHongWei
 *@TIME 2018/8/22-16:28
 *@PACKAGE_NAME prodmng.songhw.thread
 **/
public class Task implements Runnable
{
    private ArrayBlockingQueue<String> queue; //任务队列

    private int taskCount = 0;//记录处理任务的个数

    private String name;//线程名称

    public Task()
    {
    }

    public Task(ArrayBlockingQueue<String> queue, String name)
    {
        this.queue = queue;
        this.name = name;
    }

    private synchronized String getResult()
    {
        return name + "处理完第" + taskCount++ + "个任务";
    }

    @Override
    public void run()
    {

        try
        {
            queue.put(getResult());//任务放进去
        }
        catch (InterruptedException e)
        {
            queue.add("出错了");//任务放进去
        }
        //System.out.println(getResult());
    }

    public ArrayBlockingQueue<String> getQueue()
    {
        return queue;
    }
}

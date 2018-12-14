package com.github.interview;

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
 *@DESCRIPTION ${END}
 *@AUTHOR SongHongWei
 *@TIME 2018/9/15-19:52
 *@PACKAGE_NAME com.github.interview
 **/
public class SimpleThreadB implements Runnable
{
    static volatile Client client;

    static volatile boolean flag = false;

    public SimpleThreadB(Client client)
    {
        this.client = client;
    }

    @Override
    public void run()
    {
        try
        {
            int i = -1;
            while (i >= -100)
            {
                synchronized (SimpleThreadA.class)
                {
                    //if (client.flag)
                    if (flag)
                    {
                        System.out.println(i--);
                        //client.flag = false;
                        SimpleThreadA.flag = false;
                        SimpleThreadB.flag=false;
                        SimpleThreadA.class.notifyAll();
                    }
                    else
                    {
                        SimpleThreadA.class.wait();
                    }

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

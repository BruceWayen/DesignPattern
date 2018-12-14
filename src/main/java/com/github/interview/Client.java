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
 *@DESCRIPTION 面试编程题
 *@AUTHOR SongHongWei
 *@TIME 2018/9/15-19:43
 *@PACKAGE_NAME com.github.interview
 **/
public class Client
{
    static volatile boolean flag = false;

    public static void main(String[] args)
    {
        Client client = new Client();
        client.testThread(client);
        //System.out.println(client.computeAge(8));

    }

    /**
     *@DESCRIPTION 利用递归计算年龄
     *@AUTHOR SongHongWei
     *@TIME 2018/9/15-19:44
     *@CLASS_NAME Client
     **/
    public int computeAge(int num)
    {
        if (num == 1)
        {
            return 20;
        }
        return computeAge(num - 1) + 2;
    }

    /**
     *@DESCRIPTION 找出给定字符串的最长回文字符串
     *@AUTHOR SongHongWei
     *@TIME 2018/9/15-19:48
     *@CLASS_NAME Client
     **/

    public void testThread(Client c)
    {

        Thread a = new Thread(new SimpleThreadA(c));
        Thread b = new Thread(new SimpleThreadB(c));
        a.start();
        b.start();

    }
}

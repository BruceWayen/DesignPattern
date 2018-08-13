package com.github.pattern.single;

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
 *@DESCRIPTION 模拟调用单例模式的计数器场景
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-19:16
 *@PACKAGE_NAME test.factory.single
 **/
public class Client
{
    public static void main(String[] args)
    {
        int count = 0;
        //Singleton instance = Singleton.getInstance();//获取实例
        //for (int i = 0; i < 10; i++)
        //{
        //    count = instance.addCount();//模拟调用10次计数
        //}
        //System.out.println("count====" + count);
        //Singleton instance2 = Singleton.getInstance();//模拟另一处地方获取该实例并调用计数器方法
        //count = instance2.addCount();//
        for (int i = 0; i < 999999; i++)
        {
            Thread thread = new Thread(new Single());
            thread.start();
        }

        System.out.println("count====" + count);//如果两处地方获取的不是同一个实例,那么第二次获取的对象count值应该为1,否则为11
    }
}

class Single implements Runnable
{

    @Override
    public void run()
    {
        Singleton instance = Singleton.getInstance();//获取实例
        System.out.println("count====" +  instance.addCount());//如果两处地方获取的不是同一个实例,那么第二次获取的对象count值应该为1,否则为11
    }

}

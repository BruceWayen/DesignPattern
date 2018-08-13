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
 *@DESCRIPTION 单例模式
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-19:14
 *@PACKAGE_NAME test.factory.single
 **/
public class Singleton
{
    //new一个实例
    private static Singleton instance ;//= new Singleton();

    //构造方法私有化
    private Singleton()
    {

    }

    //对外提供一个实例对象
    public static Singleton getInstance()
    {
        if (instance==null)
            instance =  new Singleton();
        return instance;
    }

    //计数器
    private int count;

    //计数器方法
    public int addCount()
    {
        return ++count;
    }
}

package com.github.pattern.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;

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
 *@TIME 2018/7/22-23:42
 *@PACKAGE_NAME test.proxy.cglibproxy
 **/
public class Client
{
    public static void main(String[] args)
    {
       // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\class");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);//实际执行的对象
        enhancer.setCallback(new CglibProxy());//代理者
        RealSubject subject = (RealSubject)enhancer.create();//代理对象
        subject.excute();
        subject.hello();

    }
}

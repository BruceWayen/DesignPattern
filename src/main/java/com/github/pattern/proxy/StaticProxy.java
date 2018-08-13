package com.github.pattern.proxy;

import com.github.pattern.proxy.jdkproxy.RealSubject;
import com.github.pattern.proxy.jdkproxy.Subject;

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
 *@TIME 2018/7/22-22:50
 *@PACKAGE_NAME test.proxy.jdkproxy
 **/
public class StaticProxy implements Subject
{
    private RealSubject realSubject;

    public StaticProxy(RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    @Override
    public void excute()
    {
        System.out.println("proxy doing someting before");
        realSubject.excute();
        System.out.println("proxy doing something after");
    }

    @Override
    public void hello()
    {
        System.out.println("proxy  sayhello before");
        realSubject.hello();
        System.out.println("proxy sayhello after");
    }
}

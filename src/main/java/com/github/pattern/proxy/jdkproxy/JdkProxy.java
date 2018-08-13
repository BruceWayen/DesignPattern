package com.github.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
 *@TIME 2018/7/22-22:56
 *@PACKAGE_NAME test.proxy.jdkproxy
 **/
public class JdkProxy implements InvocationHandler
{
    private RealSubject realSubject;

    public JdkProxy(RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    /**
     *@DESCRIPTION  proxy 代理类,method 代理方法,args 方法参数
     *@AUTHOR SongHongWei
     *@TIME   2018/8/11-15:19
     *@CLASS_NAME JdkProxy
    **/ 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        System.out.println("jdk proxy doing someting before...");
        Object invoke = null;
        try
        {
            invoke = method.invoke(realSubject, args);
            System.out.println("output proxy return value..." + invoke);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("catch exception ...");
            throw e;
        }
        finally
        {
            System.out.println("jdk proxy doing something after...");
        }
        return invoke;
    }
}

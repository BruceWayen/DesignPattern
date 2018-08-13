package com.github.pattern.proxy.cglibproxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

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
 *@TIME 2018/7/22-23:39
 *@PACKAGE_NAME test.proxy.cglibproxy
 **/
public class CglibProxy implements MethodInterceptor
{
    /**
     *@DESCRIPTION ：o生成的代理对象，method：被代理对象方法，objects：方法入参，methodProxy:代理方法
     *@AUTHOR SongHongWei
     *@TIME   2018/8/11-15:46
     *@CLASS_NAME CglibProxy
    **/ 
    @Override
    public Object intercept(Object o, Method method, Object[] objects,
        MethodProxy methodProxy)
        throws Throwable
    {
        System.out.println("cglib proxy doing someting before...");
        Object invoke = null;
        try
        {   //代理类调用父类的方法
            invoke = methodProxy.invokeSuper(o, objects);
            System.out.println("output proxy return value..." + invoke);
        }
        catch (Exception e)
        {
            System.out.println("catch exception ...");
            throw e;
        }
        finally
        {
            System.out.println("cglib proxy doing something after...");
        }
        return invoke;
    }
}

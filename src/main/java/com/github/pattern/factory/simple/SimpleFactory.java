package com.github.pattern.factory.simple;

import com.github.pattern.util.PropertiesUtil;

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
 *@DESCRIPTION 简单工厂模式的工厂类
 *@AUTHOR SongHongWei
 *@TIME 2018/8/11-23:27
 *@PACKAGE_NAME test.factory.simple
 **/
public class SimpleFactory
{

    /**
     *@DESCRIPTION 根据不同的产品名称生产不同的产品
     *@AUTHOR SongHongWei
     *@TIME 2018/8/11-23:31
     *@CLASS_NAME SimpleFactory
     **/
    public Object getProduct(String productName)
    {
        if ("A".equals(productName))
        {
            return new ProductA();
        }
        else if ("B".equals(productName))
        {
            return new ProductB();
        }
        //新增一个汽车的产品,就需要对工厂类就行修改
        else if ("BMW".equals(productName))
        {
            return new BMW();
        }
        else if ("Audi".equals(productName))
        {
            return new Audi();
        }
        return null;
    }

    /**
     *@DESCRIPTION 这里引入了PropertiesUtil工具类
     *@AUTHOR SongHongWei
     *@TIME   2018/8/12-0:18
     *@CLASS_NAME SimpleFactory
    **/ 
    public static  Object getProductByReflect(String productName)
    {
        String className = PropertiesUtil.getPropertyValue(productName);
        try
        {
          return  Class.forName(className).newInstance();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}

package com.github.pattern.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
 *@TIME 2018/8/12-0:08
 *@PACKAGE_NAME test.util
 **/
public class PropertiesUtil
{
    /**
     *@DESCRIPTION 根据key值获取properties文件的value
     *@AUTHOR SongHongWei
     *@TIME 2018/8/12-0:09
     *@CLASS_NAME PropertiesUtil
     **/
    public static String getPropertyValue(String key)
    {
        String value = null;
        try
        {
            InputStream in = Properties.class.getResourceAsStream("/test/factory/simple/bean.properties");
            Properties p = new Properties();
            p.load(in);
            value = p.getProperty(key);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return value;
    }

}

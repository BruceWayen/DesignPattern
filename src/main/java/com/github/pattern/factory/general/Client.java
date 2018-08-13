package com.github.pattern.factory.general;

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
 *@DESCRIPTION 模拟客户端调用
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-15:33
 *@PACKAGE_NAME test.factory.general
 **/
public class Client
{
    public static void main(String[] args)
    {
        //客户现在提需求,说想要一个联想的鼠标
        AbstractMouseFactory abstractMouseFactory = new LenovoMouseFactory();
        //让联想工厂去生产一个联想鼠标
        MouseProduct mouser = abstractMouseFactory.createMouser();
        //打印出鼠标的名称
        mouser.getMouserName();
        //现在客户觉得联想鼠标用腻了,想换个产品,所以想要个Dell的鼠标
        abstractMouseFactory = new DellMouseFactory();
        //好的,Dell鼠标生产出来了
        mouser = abstractMouseFactory.createMouser();
        //打印出鼠标的名称
        mouser.getMouserName();
    }
}

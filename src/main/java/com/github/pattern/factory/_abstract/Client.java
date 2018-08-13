package com.github.pattern.factory._abstract;

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
 *@TIME 2018/8/12-17:20
 *@PACKAGE_NAME test.factory._abstract
 **/
public class Client
{
    public static void main(String[] args)
    {
        //用户希望自己组装台电脑,但是想用联想的键盘和Dell的鼠标
        AbstractPcFactory pcFactory = new LenovoPcFactory();
        //得到联想键盘
        pcFactory.getKeyBoard().getKeyBoardName();
        pcFactory = new DellPcFactory();
        //得到Dell鼠标
        pcFactory.getMouse().getMouserName();
    }
}

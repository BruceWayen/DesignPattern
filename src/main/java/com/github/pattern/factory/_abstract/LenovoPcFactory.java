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
 *@DESCRIPTION 联想鼠标工厂, 负责生产联想鼠标
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-15:30
 *@PACKAGE_NAME test.factory.general
 **/
public class LenovoPcFactory extends AbstractPcFactory
{
    /*
     * 生产一个联想鼠标
     */

    @Override
    public MouseProduct getMouse()
    {
        return new LenovoMouse();
    }

    /*
     * 生产一个联想键盘
     */
    @Override
    public keyBoardProduct getKeyBoard()
    {
        return new LenovoKeyBoard();
    }
}

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
 *@DESCRIPTION 戴尔鼠标工厂, 负责生产戴尔鼠标
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-15:30
 *@PACKAGE_NAME test.factory.general
 **/
public class DellPcFactory extends AbstractPcFactory
{
    /*
     * 生产一个戴尔鼠标
     */
    @Override
    public MouseProduct getMouse()
    {
        return new DellMouse();
    }

    /*
     *生产一个戴尔键盘
     */
    @Override
    public keyBoardProduct getKeyBoard()
    {
        return new DellKeyBoard();
    }
}

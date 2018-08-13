package com.github.pattern.strategy;

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
 *@DESCRIPTION 定义一个购物类, 就是用来买东西的, 买完东西肯定要调支付接口, 至于选哪种支付手段就是用户自己决定了,
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-21:13
 *@PACKAGE_NAME test.strategy
 **/
public class Shopping
{
    private PayMethod payMethod;

    public Shopping(PayMethod payMethod)
    {
        this.payMethod = payMethod;
    }

    //付钱,支付用什么方式付钱,客户自己选择
    public void payMoney()
    {
        System.out.println("我在购物,现在要付钱了");
        payMethod.payMoney();
    }
}

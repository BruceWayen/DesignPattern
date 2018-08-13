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
 *@DESCRIPTION ${END}
 *@AUTHOR SongHongWei
 *@TIME 2018/8/12-21:18
 *@PACKAGE_NAME test.strategy
 **/
public class Client
{
    public static void main(String[] args)
    {
        Shopping shop = new Shopping(new Alipay());//使用支付宝付款
        shop.payMoney();
        System.out.println("---------------------------------");
        shop = new Shopping(new TenPay());//使用财付通付款
        shop.payMoney();
        System.out.println("---------------------------------");
        shop = new Shopping(new CreditCard());//使用信用卡付款
        shop.payMoney();
    }

}

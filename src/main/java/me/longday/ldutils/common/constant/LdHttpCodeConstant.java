package me.longday.ldutils.common.constant;

/**
 * @author 君
 */
public enum LdHttpCodeConstant {
    /**
     * @desc :操作成功, code:200
     */
    SUCCESS(200,"操作成功"),
    /**
     * @desc :登录成功, code:201
     */
    LOGIN_SUCCESS(201,"登录成功"),
    /**
     * @desc :退出成功,code:202
     */
    LOGOUT_SUCCESS(202,"退出成功"),
    /**
     * @desc :需要登录, code:401
     */
    NEED_LOGIN(401,"需要登录后操作"),
    /**
     * @desc :需要登录, code:403
     */
    NO_OPERATOR_AUTH(403,"无权限操作"),
    /**
     * @desc :服务出现错误, code:500
     */
    SYSTEM_ERROR(500,"服务器出现错误"),
    /**
     * @desc :用户名已存在, code:501
     */
    USERNAME_EXIST(501,"用户名已存在"),
    /**
     * @desc :手机号已存在, code:502
     */
    PHONENUMBER_EXIST(502,"手机号已存在"),
    /**
     * @desc :邮箱已存在, code:503
     */
    EMAIL_EXIST(503, "邮箱已存在"),
    /**
     * @desc :必需填写用户名, code:504
     */
    REQUIRE_USERNAME(504, "必需填写用户名"),
    /**
     * @desc :用户名或密码错误, code:505
     */
    LOGIN_ERROR(505,"用户名或密码错误"),

    /**
     * @desc :退出错误,请确定登录状态, code:506
     */
    LOGOUT_ERROR(506,"退出错误,请确定登录状态");

    final int code;
    final String msg;
    LdHttpCodeConstant(int code, String message){
        this.code = code;
        this.msg = message;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.result;
//和http的状态码差不多
public enum ResultCode {
    //这个逻辑是这样的
    //下面的success fail 什么的全是resultcode类型的
    //你要是要里面的数字的话，要写  resultcode.code去拿
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),

    /**
     * 未认证（签名错误）
     */
    UNAUTHORIZED(401),

    /**
     * 接口不存在
     */
    NOT_FOUND(404),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}

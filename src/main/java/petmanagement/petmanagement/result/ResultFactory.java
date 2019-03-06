/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.result;

/**
 * 描述:
 * 相应结果
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-05 下午10:28
 */
public class ResultFactory {
    //就是写了一堆生成不同样子的result

    public static Result buildSuccessResult(Object data) {
        return buidResult(ResultCode.SUCCESS, "成功", data);
        //ResultCode.SUCCESS 人家是个resultcode的类
    }

    public static Result buildFailResult(String message) {
        return buidResult(ResultCode.FAIL, message, null);
        //ResultCode.FAIL 这个也是个resultcode的类
    }

    public static Result buidResult(ResultCode resultCode, String message, Object data) {
        return buidResult(resultCode.code, message, data);
        //这个 .code 是真的拿数字！！！
    }

    public static Result buidResult(int resultCode, String message, Object data) {
        return new Result(resultCode, message, data);
    }
    //这就对了，去创建了一个result的类


}
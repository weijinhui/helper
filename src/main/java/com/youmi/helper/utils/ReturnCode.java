package com.youmi.helper.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mominqiang on 2018/3/23.
 */
public class ReturnCode {

    public static final String SUCCESS_CODE = "200";
    public static final String ERROR_CODE = "500";
    public static final String EXCEPTION_OCCUR = "501";
    public static final String FAIL_CODE = "100";
    public static final String LOGIN_FAILED = "101";
    public static final String LOGIN_INFO_MISS = "102";

    public static final String API_AUTH_PARAMETER_LACK = "103";
    public static final String API_AUTH_ACCOUNT_LACK = "104";
    public static final String API_AUTH_SIGNATURE_ERROR = "105";
    public static final String API_AUTH_TOKEN_EXPIRED = "106";
    public static final String API_AUTH_TOKEN_LACK = "107";
    public static final String API_AUTH_TOKEN_WRONG = "108";

    public static final String SERVER_CDE_LACK = "109";
    public static final String API_LACK_PARAMETER = "E109";
    public static final String API_WRiTE_INFO_FAILED = "E110";


    public static final Map<String, String> messageMap = new HashMap<>();

    static{
        messageMap.put(SUCCESS_CODE, "操作成功!");
        messageMap.put(ERROR_CODE, "操作错误!");
        messageMap.put(LOGIN_INFO_MISS, "登录信息不完整！");
        messageMap.put(API_AUTH_PARAMETER_LACK, "授权参数信息不完整！");
        messageMap.put(API_AUTH_ACCOUNT_LACK, "授权失败，无此账号信息。");
        messageMap.put(API_AUTH_SIGNATURE_ERROR, "授权失败，签名错误！");
        messageMap.put(API_AUTH_TOKEN_EXPIRED,"请求失败，apiToken超时,请重新授权！");
        messageMap.put(API_AUTH_TOKEN_LACK, "请求失败，无此apiToken信息，请重新授权！");
        messageMap.put(API_AUTH_TOKEN_WRONG, "请求失败，apiToken校验失败！");
        messageMap.put(SERVER_CDE_LACK, "获取失败，无此服务系统信息！");
        messageMap.put(EXCEPTION_OCCUR, "操作失败！系统异常。");
        messageMap.put(API_LACK_PARAMETER, "请求失败，缺少必要参数！");
        messageMap.put(API_WRiTE_INFO_FAILED, "请求失败，数据写入失败！");
        messageMap.put(API_WRiTE_INFO_FAILED, "请求失败，数据写入失败！");

    }

}

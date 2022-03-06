package ink.mints.controller.utils;

public final class Message {

    static String success = "请求成功";
    static String failed = "请求失败";
    static String error = "请求异常";

    public static String Success() {
        return success;
    }

    public static String Failed() {
        return failed;
    }

    public static String Error() {
        return error;
    }
}

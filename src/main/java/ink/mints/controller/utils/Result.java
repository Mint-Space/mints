package ink.mints.controller.utils;

public class Result {

    private int code;
    private Object data;
    private Enum<Status> status;
    private String msg;

    public Result(){

    }

    public Result(int code, Enum<Status> status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public Result(int code, Object data, Enum<Status> status, String msg) {
        this.code = code;
        this.data = data;
        this.status = status;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
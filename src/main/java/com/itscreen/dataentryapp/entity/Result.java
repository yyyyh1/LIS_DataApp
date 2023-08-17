package com.itscreen.dataentryapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code;  // 1: succeed
    private String errMsg;  // error msg
    private T data; // data
    private Map map = new HashMap();  // dynamic data

    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.code = 1;  //success code
        r.data = data;
        return r;
    }

    public static <T> Result<T> error(String errMsg) {
        Result<T> r = new Result<>();
        r.errMsg = errMsg; //set error msg
        r.code = 0;  // default error code
        return r;
    }

    public Result<T> add(String msg, String value) {
        this.map.put(msg, value);
        return this;
    }
}

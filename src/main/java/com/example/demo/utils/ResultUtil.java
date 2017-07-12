package com.example.demo.utils;

import com.example.demo.domain.Result;

/**
 * Created by cw on 2017/7/12.
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result =new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);

        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }
}

package me.longday.ldutils.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NonNull;
import me.longday.ldutils.common.constant.LdHttpCodeConstant;

import java.io.Serializable;

/**
 * @author 君
 * @version 1.0
 * @desc 统一响应结果对象
 * @since 2022-11-19
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class AxiosRes<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public AxiosRes() {
        this(LdHttpCodeConstant.SUCCESS.getCode(),LdHttpCodeConstant.SUCCESS.getMsg(),null);
    }
    public AxiosRes(Integer code, String msg) {
        this(code,msg,null);
    }
    public AxiosRes(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> AxiosRes<T> errorResult(int code, String msg) {
        AxiosRes<T> result = new AxiosRes<>();
        return result.error(code, msg);
    }

    public static <T> AxiosRes<T> ERROR(LdHttpCodeConstant enums) {
        AxiosRes<T> result = new AxiosRes<>();
        return result.error(enums.getCode(), enums.getMsg());
    }
    public static <T> AxiosRes<T> SUCCESS(LdHttpCodeConstant enums) {
        return new AxiosRes<>(enums.getCode(),enums.getMsg());
    }

    public static <T> AxiosRes<T> SUCCESS(int code, String msg) {
        AxiosRes<T> result = new AxiosRes<>();
        return result.ok(code, null, msg);
    }

    public static <T> AxiosRes<T> SUCCESS(@NonNull T data) {
        AxiosRes<T> result = new AxiosRes<>();
        result.setData(data);
        return result;
    }

    public AxiosRes<T> error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public AxiosRes<T> ok(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        return this;
    }


    public static <T> AxiosRes<T> resultByEnum(LdHttpCodeConstant enums, T data){
        return new AxiosRes<>(enums.getCode(),enums.getMsg(),data);
    }

}

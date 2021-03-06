package com.xiaozhi.result.resultImpl;

import com.xiaozhi.result.BaseResult;
import com.xiaozhi.result.ResultCode;

import java.io.Serializable;

/**
 * Created by 小智 on 2017/4/24 0024.
 */
public class WebResult<T> implements BaseResult, Serializable{
    private int code;               //返回码
    private String describe;        //返回描述
    private T data;                 //返回数据

    public WebResult(){
        this.data = null;
        this.code = ResultCode.SUCCESS.getCode();
        this.describe = ResultCode.SUCCESS.getDescribe();
    }

    public WebResult(T data){
        this.data = data;
        this.code = ResultCode.SUCCESS.getCode();
        this.describe = ResultCode.SUCCESS.getDescribe();
    }

    public WebResult(ResultCode resultCode){
        this.describe = resultCode.getDescribe();
        this.code = resultCode.getCode();
        this.data = null;
    }

    @Override
    public int getCode(){
        return code;
    }

    @Override
    public String getDescribe(){
        return describe;
    }

    @Override
    public T getData(){
        return data;
    }

    @Override
    public boolean isSuccess(){
        if (this.code == ResultCode.SUCCESS.getCode())
            return true;
        else
            return false;
    }
}

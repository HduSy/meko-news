package cn.meko.model;

/**
 * Created by chu on 2017/6/2.
 */
import java.io.Serializable;

public class AppJsonMessage implements Serializable
{
    //
    private static final long serialVersionUID = 714679657596837388L;

    public AppJsonMessage()
    {
    }

    public AppJsonMessage(EnumDescribable enumDescribable)
    {
        this.code = enumDescribable.getCode();
        this.msg = enumDescribable.getMessage();
    }

    public AppJsonMessage(EnumDescribable enumDescribable, Object data)
    {
        this.code = enumDescribable.getCode();
        this.msg = enumDescribable.getMessage();
        this.data = data;
    }

    private Integer code;

    private String  msg;

    private Object  data;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }
}

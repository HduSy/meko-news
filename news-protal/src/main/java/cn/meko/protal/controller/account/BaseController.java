package cn.meko.protal.controller.account;


import cn.meko.model.AppJsonMessage;
import cn.meko.model.EnumDescribable;

/**
 * Created by chu on 2017/6/2.
 */
public class BaseController {
    /**
     * 接口处理结果反馈 : ：API接口返回数据或交易处理结果的JSON处理
     * @param describable 异常代码描述
     *  {@link AppJsonMessage}
     */
    public AppJsonMessage getJsonMessage(EnumDescribable describable)
    {
        AppJsonMessage jsonMessage = new AppJsonMessage();
        jsonMessage.setCode(describable.getCode());
        jsonMessage.setMsg(describable.getMessage());
        return jsonMessage;
    }

    /**
     * 接口处理结果反馈 : ：API接口返回数据或交易处理结果的JSON处理
     * @param describable 异常代码描述
     * @param object 单结果返回对象
     * @return {@link AppJsonMessage}
     */
    protected AppJsonMessage getJsonMessage(EnumDescribable describable, Object object)
    {
        AppJsonMessage jsonMessage = new AppJsonMessage();
        jsonMessage.setCode(describable.getCode());
        jsonMessage.setMsg(describable.getMessage());
        jsonMessage.setData(object);
        return jsonMessage;
    }

    protected AppJsonMessage getJsonMessage(Object object){
        AppJsonMessage jsonMessage = new AppJsonMessage();

        jsonMessage.setData(object);

        return jsonMessage;
    }

}

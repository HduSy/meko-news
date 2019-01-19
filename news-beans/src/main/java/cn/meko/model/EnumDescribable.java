package cn.meko.model;

/**
 * Created by chu on 2017/6/2.
 */

import java.io.Serializable;

/**
 * 错误码描述接口
 *
 * <p>File：ErrorCodeDescribable.java</p>
 * <p>Title: </p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2014 2014年3月6日 下午3:06:33</p>
 * <p>Company: xiyundata.com</p>
 * @author vanilla
 * @version 1.0
 */
public interface EnumDescribable extends Serializable
{
    /**
     * 获取异常代码
     * @return
     * @author vanilla
     */
    Integer getCode();

    /**
     * 获取异常代码描述
     * @return
     * @author vanilla
     */
    String getMessage();
}
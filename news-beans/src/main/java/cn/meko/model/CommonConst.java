package cn.meko.model;

public enum CommonConst implements EnumDescribable
{
    // 状态码范围：0 到 999
    SUCCESS(0, "操作成功！"),
    Fall(1002,"操作失败！"),
    VALID_ERR(1001, "参数验证错误"), //
    VALID_PHONE_ERR(2000, "手机号码格式不正确"), //
    VALID_CAPTCHA_ERR(2001, "验证码类型不正确"), //
    PHONE_NUM_HAS_REGISTERED(2002, "手机号码已注册"), //
    CODE_HAS_EXPIRED(2003, "验证码已过期"), //
    CODE_NOT_EQUAL(2004, "验证码不正确"),//
    USER_NOT_EXIST(2005, "用户不存在"), //
    USER_NOT_LOGIN(2006, "用户未登录"), //
    VALID_OPERATE_ONE_ERR(2007,"至少保留一个tab"),
    VALID_OPERATE_SIX_ERR(2008,"最多关注六个tab"),
    VALID_NOT_EXIST(2009,"该参数内容不存在"),
    SESSION_INVALIDATED(2010,"验证码已失效"),
    USER_IS_STOP(2011,"用户已经被禁用"),
    USER_LOGIN_FAULT(2012,"用户登录失败"),
    USER_NOT_EXISTS(2013,"用户不存在"),
;
    private CommonConst(Integer code, String message)
    {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据状态码获取状态码描述
     * @param code 状态码
     * @return String 状态码描述
     */
    public static String getMessage(Integer code)
    {
        String result = null;
        for (CommonConst c : CommonConst.values())
        {
            if (c.code.equals(code))
            {
                result = c.message;
            }
        }
        return result;
    }

    public Integer code;

    public String  message;

    /*
     * (non-Javadoc)
     * @see com.zttx.web.bean.EnumDescribable#getCode()
     */
    public Integer getCode()
    {
        return this.code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    /*
     * (non-Javadoc)
     * @see com.zttx.web.bean.EnumDescribable#getMessage()
     */
    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}

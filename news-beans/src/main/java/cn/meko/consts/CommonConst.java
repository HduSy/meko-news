package cn.meko.consts;

import cn.meko.model.EnumDescribable;

public enum CommonConst implements EnumDescribable {
    PARAME_RROR(121016, "请求参数异常"),
    ERROR_HANDLE(121038, "非法操作"),
    SUCCESS(0, "操作成功"),
    USER_NOT_EXISTS(126001, "该用户不存在"),
    USER_LOGIN_FAULT(126002, "用户名或密码错误"),
    USER_PHONE_FAULT(126003, "该手机号未注册"),
    USER_PWD_FAULT(126004, "请勿使用近期使用过的密码"),
    USER_MSGCODE_FAULT(126005, "验证码错误"),
    PHONE_ALREADY_EXIXTS(126006, "手机号已被注册"),
    NO_POWER(126007, "该用户权限不足"),
    USER_NOT_LOGIN(126008, "用户未登录"),
    NO_DATA(126009, "未请求到数据"),
    TO_USER_NOT_EXISTS(126010, "收件人不存在"),

    PROJECTS_IS_DEL(126011, "该项目已被删除"),
    FINANCE_IS_DEL(126012, "该资金已被删除"),
    COOPERATION_IS_DEL(126013, "该合作已被删除"),
    ACTICITY_IS_DEL(126014, "该活动已被删除"),
    ARTICLE_IS_DEL(126015, "该新闻已被删除"),
    TRAINING_IS_DEL(126016, "该培训已被删除"),


    PARAMS_VALID_ERR(126016, "参数验证错误"),
    UPLOAD_FAULT(126008, "文件上传失败"),
    DEL_DATA_FAULT(126009, "记录删除失败"),
    UP_DATA_FAULT(126010, "记录修改失败"),
    MOVE_FAULT(126011, "文件移动失败"),
    SMS_SEND_ERR(126012, "短信发送失败"),
    DATA_SYNC_ERR(126013, "用户同步失败"),
    FAIL(126999, "操作失败"),
    WAYBILL_DEFAULT_ERR(126024, "不能删除默认快递单模板"),
    REGIONAL_HAVE_CHILD(126025, "不能删除有下级区域的记录"),

    BANK_TYPE_ERR(126026, "银行卡编码错误"),
    BANK_NOT_EXIST(126027, "银行卡不存在或者已删除"),//
    BANK_CARD_NUM_OUT(126028, "银行卡数量超过限制"),
    BANK_EXIST_ERR(126029, "银行卡已存在"),
    REPLY_EMPTY_ERR(126030, "回复内容不能为空"),
    PRODUCT_REPLY_NOT_EXIST_ERR(126031, "该评价不存在"),
    REPLY_REPLY_EXIST_ERR(126032, "回复已存在不能再次回复"),;


    public Integer code;

    public String message;

    private CommonConst(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据状态码获取状态码描述
     *
     * @param code 状态码
     * @return String 状态码描述
     */
    public static String getMessage(Integer code) {
        String result = null;
        for (CommonConst c : CommonConst.values()) {
            if (c.code.equals(code)) {
                result = c.message;
            }
        }
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

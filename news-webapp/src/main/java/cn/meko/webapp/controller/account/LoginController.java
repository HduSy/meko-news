package cn.meko.webapp.controller.account;
/**
 * Description: //TODO
 * Created by meko on 19-1-19下午5:24
 */

import cn.meko.consts.SystemConst;
import cn.meko.entity.UserInfo;
import cn.meko.model.AppJsonMessage;
import cn.meko.model.CommonConst;
import cn.meko.webapp.controller.core.BaseController;
import cn.meko.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *@ClassName LoginController
 *@Description TODO
 *@Author meko
 *@Date 19-1-19 下午5:24
 *@Version 1.0
 **/
@Controller
public class LoginController extends BaseController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/login")
    public String loginForward(Model model, HttpServletRequest request)
    {
        return "/account/login";
    }

    @ResponseBody
    @RequestMapping(value = "/login/check",method = RequestMethod.POST)
    public AppJsonMessage loginCheck(UserInfo userInfo, HttpSession session, String url) throws Exception {
        UserInfo user = userInfoService.findUserByPhone(userInfo);
        if (user != null){
            if((userInfo.getPassword()).equals(user.getPassword())){
                session.setAttribute(SystemConst.USER_SESSION,user);
                return this.getJsonMessage(CommonConst.SUCCESS);
            }else {
                return this.getJsonMessage(CommonConst.USER_LOGIN_FAULT);
            }
        }else {
            return this.getJsonMessage(CommonConst.USER_NOT_EXISTS);
        }
    }
}

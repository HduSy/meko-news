package cn.meko.webapp.controller.account;/**
 * Description: //TODO
 * Created by meko on 19-1-19下午9:22
 */

import cn.meko.entity.UserInfo;
import cn.meko.model.AppJsonMessage;
import cn.meko.model.CommonConst;
import cn.meko.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *@ClassName ResignController
 *@Description TODO
 *@Author meko
 *@Date 19-1-19 下午9:22
 *@Version 1.0
 **/
@Controller
public class ResignController extends BaseController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/register")
    public String registerForward(Model model, HttpServletRequest request)
    {
        return "/account/signup";
    }

    @ResponseBody
    @RequestMapping("/resign")
    public AppJsonMessage resign(UserInfo userInfo)throws Exception{
        try {
            userInfoService.createUser(userInfo);
        }catch (Exception e){
            System.out.println(e);
        }

        return this.getJsonMessage(CommonConst.SUCCESS);
    }
}

package cn.meko.protal.controller.account;/**
 * Description: //TODO
 * Created by meko on 19-1-19下午9:22
 */

import cn.meko.entity.UserInfo;
import cn.meko.model.AppJsonMessage;
import cn.meko.model.CommonConst;
import cn.meko.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ResponseBody
    @RequestMapping("/resign")
    public AppJsonMessage resign(UserInfo userInfo)throws Exception{
        userInfoService.createUser(userInfo);
        return this.getJsonMessage(CommonConst.SUCCESS);
    }
}

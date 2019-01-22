package cn.meko.webapp.controller.contract;
/**
 * Description: //TODO
 * Created by meko on 19-1-21下午9:27
 */

import cn.meko.entity.Htb;
import cn.meko.model.AppJsonMessage;
import cn.meko.model.BootStrapDataGridResult;
import cn.meko.model.CommonConst;
import cn.meko.service.HtbService;
import cn.meko.webapp.controller.core.BaseController;
import com.google.common.hash.HashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *@ClassName HtbController
 *@Description TODO 合同信息Controller
 *@Author meko
 *@Date 19-1-21 下午9:27
 *@Version 1.0
 **/
@Controller
@RequestMapping(value = "/contract")
public class HtbController extends BaseController{

    @Autowired
    private HtbService htbService;
    /**
     * @Author Meko
     * @Description //TODO 获取合同list
     * @MethodName getContract
     * @Date 19-1-21 下午9:31
     * @Param [htb]
     * @return cn.meko.model.AppJsonMessage
     **/
    @ResponseBody
    @RequestMapping(value = "/getContract")
    public AppJsonMessage getContract(Htb htb){
        try {
            List<Htb> list = htbService.findHtb(htb);
            return  this.getJsonMessage(CommonConst.SUCCESS,list);
        }catch (Exception e){
            e.getStackTrace();
            System.out.println(e);
        }
        return this.getJsonMessage(CommonConst.Fall);
    }

    @ResponseBody
    @RequestMapping(value = "/insertContract")
    public AppJsonMessage insertContract(Htb htb){
        htbService.insertHtb(htb);
        return this.getJsonMessage(CommonConst.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/updateContract")
    public AppJsonMessage updateContract(Htb htb){
        htbService.updateHtb(htb);
        return this.getJsonMessage(CommonConst.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteContract")
    public AppJsonMessage deleteContract(Htb htb){
        htbService.deleteHtb(htb);
        return this.getJsonMessage(CommonConst.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/getContractList")
    public BootStrapDataGridResult getContractList(int page,int rows){
        try {
            return htbService.getContractList(page, rows);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            return null;
        }
    }
}

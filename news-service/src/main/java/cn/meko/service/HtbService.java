package cn.meko.service;
/**
 * Description: //TODO
 * Created by meko on 19-1-21下午9:17
 */

import cn.meko.entity.Htb;
import cn.meko.model.BootStrapDataGridResult;

import java.util.List;

/**
 *@InterfaceName HtbService
 *@Description TODO 合同服务
 *@Author meko
 *@Date 19-1-21 下午9:17
 *@Version 1.0
 **/
public interface HtbService {
    List<Htb> findHtb(Htb htb);
    void insertHtb(Htb htb);
    void deleteHtb(Htb htb);
    void updateHtb(Htb htb);
    BootStrapDataGridResult getContractList(int page, int rows) throws Exception;
}

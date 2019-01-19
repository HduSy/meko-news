package cn.meko.service;/**
 * Description: //TODO
 * Created by meko on 19-1-19下午9:19
 */

import cn.meko.entity.UserInfo;

/**
 *@InterfaceName UserInfoService
 *@Description TODO
 *@Author meko
 *@Date 19-1-19 下午9:19
 *@Version 1.0
 **/
public interface UserInfoService {
    UserInfo findUserByPhone(UserInfo userInfo)throws Exception;
    void createUser(UserInfo userInfo) throws Exception;
}

package cn.meko.service;/**
 * Description: //TODO
 * Created by meko on 19-1-19下午9:20
 */

import cn.meko.entity.UserInfo;
import cn.meko.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@ClassName UserInfoServiceImpl
 *@Description TODO
 *@Author meko
 *@Date 19-1-19 下午9:20
 *@Version 1.0
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo findUserByPhone(UserInfo userInfo) throws Exception {
        return userInfoMapper.selectByPrimaryKey(userInfo.getPhone());
    }

    public void createUser(UserInfo userInfo) throws Exception {
        userInfoMapper.insert(userInfo);
    }
}

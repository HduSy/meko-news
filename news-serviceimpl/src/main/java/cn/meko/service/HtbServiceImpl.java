package cn.meko.service;
/**
 * Description: //TODO
 * Created by meko on 19-1-21下午9:18
 */

import cn.meko.entity.Htb;
import cn.meko.entity.HtbExample;
import cn.meko.mapper.HtbMapper;
import cn.meko.model.BootStrapDataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName HtbServiceImpl
 *@Description TODO
 *@Author meko
 *@Date 19-1-21 下午9:18
 *@Version 1.0
 **/
@Service
public class HtbServiceImpl implements HtbService {

    @Autowired
    private HtbMapper htbMapper;

    /**
     * @return java.util.List<cn.meko.entity.Htb>
     * @Author Meko
     * @Description //TODO 根据合同id查找合同，默认输入为空则返回所有的合同
     * @MethodName findHtb
     * @Date 19-1-21 下午9:27
     * @Param [htb]
     **/
    public List<Htb> findHtb(Htb htb) {
        HtbExample example = new HtbExample();
        if (htb.getHtbh() != "" && htb.getHtbh() != null) {
            HtbExample.Criteria criteria = example.createCriteria();
            criteria.andHtbhEqualTo(htb.getHtbh());
        }
        return htbMapper.selectByExample(example);
    }

    /**
     * @return void
     * @Author Meko
     * @Description //TODO 插入合同信息
     * @MethodName insertHtb
     * @Date 19-1-21 下午9:32
     * @Param [htb]
     **/
    public void insertHtb(Htb htb) {
        htbMapper.insert(htb);
    }

    //    删除合同记录
    public void deleteHtb(Htb htb) {
        htbMapper.deleteByPrimaryKey(htb.getHtbh());
    }

    //    更新合同记录
    public void updateHtb(Htb htb) {
        htbMapper.updateByPrimaryKey(htb);
    }


    public BootStrapDataGridResult getContractList(int page, int rows) throws Exception {

        HtbExample example = new HtbExample();
        PageHelper.startPage(page, rows);

        List<Htb> htbList = htbMapper.selectByExample(example);
        BootStrapDataGridResult result = new BootStrapDataGridResult();
        result.setPage(page);
        result.setRows(rows);
        result.setRowsList(htbList);
        PageInfo<Htb> pageInfo = new PageInfo<Htb>(htbList);
        result.setTotalPage(pageInfo.getPages());
        result.setTotal(pageInfo.getTotal());
        result.setSize(pageInfo.getSize());
        return result;
    }
}
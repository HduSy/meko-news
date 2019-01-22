package cn.meko.service;

/**
 * Description: //TODO
 * Created by meko on 19-1-20上午12:46
 */

import cn.meko.entity.Htb;
import cn.meko.entity.HtbExample;
import cn.meko.entity.News;
import cn.meko.entity.NewsExample;
import cn.meko.mapper.NewsMapper;
import cn.meko.model.BootStrapDataGridResult;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName NewsServiceImpl
 *@Description TODO
 *@Author meko
 *@Date 19-1-20 上午12:46
 *@Version 1.0
 **/
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public void createNews(News news) throws Exception {
        newsMapper.insert(news);
    }

    public List<News> findNews(News news) throws Exception {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryEqualTo(news.getCategory());
        return newsMapper.selectByExample(example);
    }


}

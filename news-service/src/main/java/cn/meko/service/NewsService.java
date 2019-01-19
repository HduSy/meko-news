package cn.meko.service;/**
 * Description: //TODO
 * Created by meko on 19-1-20上午12:45
 */

import cn.meko.entity.News;
import cn.meko.entity.NewsExample;

import java.util.List;

/**
 *@InterfaceName NewsService
 *@Description TODO
 *@Author meko
 *@Date 19-1-20 上午12:45
 *@Version 1.0
 **/
public interface NewsService {
    void createNews(News news) throws Exception;
    List<News> findNews(NewsExample example) throws Exception;
}

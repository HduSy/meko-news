package cn.meko.webapp.controller.News;
/**
 * Description: //TODO
 * Created by meko on 19-1-20下午3:49
 */

import cn.meko.entity.News;
import cn.meko.model.AppJsonMessage;
import cn.meko.model.CommonConst;
import cn.meko.service.NewsService;
import cn.meko.webapp.controller.core.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *@ClassName NewsController
 *@Description TODO
 *@Author meko
 *@Date 19-1-20 下午3:49
 *@Version 1.0
 **/
@Controller
public class NewsController extends BaseController {

    @Autowired
    private NewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/requireNews")
    public AppJsonMessage requireNews(News news){
        try {

            List<News> lists = newsService.findNews(news);
            return this.getJsonMessage(CommonConst.SUCCESS,lists);

        }catch (Exception e){
            e.getStackTrace();
            System.out.println(e);
        }
        return this.getJsonMessage(CommonConst.Fall);
    }

}


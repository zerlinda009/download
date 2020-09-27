package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Controller
public class DownloadController {
    @RequestMapping("/list")
    public ModelAndView getDownloadList() {
        String resourcePath;
        {
            resourcePath = this.getClass().getResource("").getPath();
            int end = resourcePath.indexOf("WEB-INF");
            resourcePath = resourcePath.substring(0, end);
        }

        List<String> fileNameList;{
            File file = new File(resourcePath + "files");
            fileNameList = Arrays.asList(file.list());
        }

        ModelAndView modelAndView;
        {
            ModelMap modelMap;
            {
                modelMap = new ModelMap();
                modelMap.put("fileNameList", fileNameList);
            }

            String viewName = "downloadList";

            modelAndView = new ModelAndView(viewName, modelMap);
        }

        return modelAndView;
    }
}

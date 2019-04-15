package com.controlller;

import com.model.Subject;
import com.model.Title;
import com.result.CodeMsg;
import com.result.Result;
import com.service.TitleService;
import com.service.impl.SingleServiceImpl;
import com.service.impl.SubjectServiceImpl;
import com.service.impl.TitleServiceImpl;
import com.vo.TitleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SingleController {

    @Autowired
    SubjectServiceImpl subjectService;
    @Autowired
    TitleServiceImpl titleService;
    //进入单选题添加页面
    @GetMapping("/single/toadd")
    public String toAddSingle(Model model){
        List<Subject> subjects=subjectService.findAllSubject();
        model.addAttribute("subjects",subjects);
        return "addsingle";
    }

    //执行单选题添加
    @PostMapping("/single/doadd")
        @ResponseBody
        public Result addSingle(Title title){
            boolean result=titleService.insertTitle(title);
            if (result){
                return Result.success(CodeMsg.ADD_SUCCESS);
            }else {
                return Result.error(CodeMsg.ADD_FAILE);
            }
    }

    //进入单选题管理页面
    @GetMapping("/single/manager")
    public String singleManager(Model model){
        List<TitleVo> titles=titleService.findAllTitle("single");
        model.addAttribute("titles",titles);
        return "singlemanager";
    }

    //进入单选题修改页面
   @GetMapping("/single/toupdate/{titleId}")
    public String toUpdate(Model model,@PathVariable("titleId") int titleId){
      Title title=titleService.findById(titleId);
      model.addAttribute("title",title);
      List<Subject> subjects=subjectService.findAllSubject();
      model.addAttribute("subjects",subjects);
        return "updatesingle";
    }

    //执行单选题修改
   @PostMapping("/single/doupdate")
    @ResponseBody
    public Result doUpdate(Title title){
        boolean result=titleService.updateTitle(title);
       if (result){
           return Result.success(CodeMsg.UPDATE_SUCCESS);
       }else {
           return Result.success(CodeMsg.UPDATE_FAILE);
       }
    }

    //删除单选题
    @RequestMapping("/single/dodelete/{titleId}")
    @ResponseBody
    public Result doDelete(@PathVariable("titleId") int titleId){
       boolean result= titleService.deleteTitle(titleId);
        if (result){
            return Result.success(CodeMsg.DELETE_SUCCESS);
        }else {
            return Result.success(CodeMsg.DELETE_FAILE);
        }
    }

}

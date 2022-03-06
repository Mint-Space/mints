package ink.mints.controller;

import ink.mints.controller.utils.Message;
import ink.mints.controller.utils.Status;
import ink.mints.controller.utils.Result;
import ink.mints.entity.Home;
import ink.mints.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homes")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping
    public Result getAll(){
        List<Home> flag = homeService.list();
        if(flag != null && flag.size() > 0){
            return new Result(200,flag, Status.SUCCESS, Message.Success());
        }else if(flag != null){
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }else {
            return new Result(500,flag, Status.ERROR,Message.Error());
        }

    }

    @GetMapping("{id}")
    public Result getHomeById(@PathVariable Integer id){
        Home flag = homeService.getById(id);
        if(flag != null && flag.getId() != null){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else if(flag != null){
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }else {
            return new Result(500,flag, Status.ERROR,Message.Error());
        }
    }

    @PostMapping
    public Result saveHome(@RequestBody Home home){
        boolean flag = homeService.save(home);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }
    }

    @PutMapping
    public Result updateHome(@RequestBody Home home){
        boolean flag = homeService.updateById(home);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,null, Status.FAILED,Message.Failed());
        }
    }

    @DeleteMapping("{id}")
    public Result deleteHomeById(@PathVariable Integer id){
        boolean flag = homeService.removeById(id);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }
    }
}

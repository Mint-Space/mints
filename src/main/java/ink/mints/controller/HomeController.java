package ink.mints.controller;

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
    public List<Home> getAll(){
        return homeService.list();
    }

    @GetMapping("{id}")
    public Home getHomeById(@PathVariable Integer id){
        return homeService.getById(id);
    }

    @PostMapping
    public boolean saveHome(@RequestBody Home home){
        return homeService.save(home);
    }

    @PutMapping
    public boolean updateHome(@RequestBody Home home){
        return homeService.update(home,null);
    }

    @DeleteMapping("{id}")
    public boolean deleteHomeById(@PathVariable Integer id){
        return homeService.removeById(id);
    }
}

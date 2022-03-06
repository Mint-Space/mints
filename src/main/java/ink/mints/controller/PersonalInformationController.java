package ink.mints.controller;

import ink.mints.controller.utils.Message;
import ink.mints.controller.utils.Result;
import ink.mints.controller.utils.Status;
import ink.mints.entity.PersonalInformation;
import ink.mints.service.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonalInformationController {

    @Autowired
    PersonalInformationService personalInformationService;

    @GetMapping
    public Result getAll(){
        List<PersonalInformation> flag = personalInformationService.list();
        if(flag != null && flag.size() > 0){
            return new Result(200,flag, Status.SUCCESS, Message.Success());
        }else if(flag != null){
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }else {
            return new Result(500,flag, Status.ERROR,Message.Error());
        }
    }

    @GetMapping("{id}")
    public Result getPersonById(@PathVariable Integer id){
        PersonalInformation flag = personalInformationService.getById(id);
        if(flag != null && flag.getId() != null){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else if(flag != null){
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }else {
            return new Result(500,flag, Status.ERROR,Message.Error());
        }
    }

    @PostMapping
    public Result savePerson(@RequestBody PersonalInformation personalInformation){
        boolean flag = personalInformationService.save(personalInformation);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }
    }

    @PutMapping
    public Result updatePerson(@RequestBody PersonalInformation personalInformation){
        boolean flag = personalInformationService.updateById(personalInformation);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }
    }

    @DeleteMapping("{id}")
    public Result deletePersonById(@PathVariable Integer id){
        boolean flag = personalInformationService.removeById(id);
        if(flag){
            return new Result(200,flag, Status.SUCCESS,Message.Success());
        }else {
            return new Result(400,flag, Status.FAILED,Message.Failed());
        }
    }
}

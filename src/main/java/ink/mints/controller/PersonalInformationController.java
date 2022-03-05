package ink.mints.controller;

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
    public List<PersonalInformation> getAll(){
        return personalInformationService.list();
    }

    @GetMapping("{id}")
    public PersonalInformation getPersonById(@PathVariable Integer id){
        return personalInformationService.getById(id);
    }

    @PostMapping
    public boolean savePerson(@RequestBody PersonalInformation personalInformation){
        return personalInformationService.save(personalInformation);
    }

    @PutMapping
    public boolean updatePerson(@RequestBody PersonalInformation personalInformation){
        return personalInformationService.updateById(personalInformation);
    }

    @DeleteMapping("{id}")
    public boolean deletePersonById(@PathVariable Integer id){
        return personalInformationService.removeById(id);
    }
}

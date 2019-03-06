/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petmanagement.petmanagement.entity.*;
import petmanagement.petmanagement.service.PetServiceImpl;
import java.util.List;
import petmanagement.petmanagement.service.PetService;

/**
 * 描述:
 * about pet
 *
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-04 下午11:51
 */

/*
controller 是描述路径和使用 service里的方法的
 */


@RestController
@RequestMapping("/pet")
public class PetController {
@Autowired
    private PetServiceImpl petService;

@RequestMapping("/findPets")
//这个方法感觉没什么用啊，是要所有的pet名单吗
public List<Pet> findPets(){
    List<Pet> findPets=null;
    try{
        findPets=petService.findPets();
        //
    }catch (Exception e){
        e.printStackTrace();
    }
    return findPets;//就是刚才那个list<pet>
}

@RequestMapping("/findPetByPid")
//有别于上面的找所有，这里只要一个，所以返回值不是list,而是个pet
    public Pet findPetByPid(int pid){
    Pet pet=null;
    try{
        pet=petService.findPetByPid(pid);
    }catch (Exception e){
        e.printStackTrace();
    }
    return pet;
}


@RequestMapping("/deletePet")
    //delete
    public boolean deletePet(int pid){
    try{
        if(petService.deletePet(pid)==1){
            return true;
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    return false;
}

@RequestMapping("/insertPet")
public Pet insertPet(@RequestBody Pet pet){
    try{
        petService.insertPet(pet);
        return pet;
    }catch (Exception e){
        e.printStackTrace();
    }
    return null;
}


@RequestMapping("/updatePet")
    public boolean updatePet(@RequestBody Pet pet){
    try{
        if(petService.updatePet(pet)==1){
            return true;
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    return  false;
}




}
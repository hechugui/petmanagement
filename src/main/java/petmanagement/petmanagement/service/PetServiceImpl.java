/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import petmanagement.petmanagement.entity.Pet;
import petmanagement.petmanagement.mapper.PetMapper;
import petmanagement.petmanagement.service.PetService;
import java.util.List;

/**
 * 描述:
 * pet service
 * service 是过来把自己的方法用mapper里的函数解释一遍的
 * @author Chuchu He ,also Ye Chen
 * @create 2019-03-04 下午11:53
 */


/*
@Service对应的是业务层Bean
@Service("userService")注解是告诉Spring，当Spring要创建UserServiceImpl的的实例时，bean的名字必须叫做"userService"，这样当Action需要使用UserServiceImpl的的实例时,就可以由Spring创建好的"userService"，然后注入给Action：在Action只需要声明一个名字叫“userService”的变量来接收由Spring注入的"userService"即可，具体代码如下：

     // 注入userService
     @Resource(name = "userService")
     private UserService userService;

 */
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;
    //必须要写，说好了是把自己的方法用mapper里的实现一遍的

    @Override
    public List<Pet> findPets(){
    return petMapper.findPet();
    }
    @Override
    public Pet findPetByPid(int pid){
        return petMapper.findPetByPid(pid);
    }

    @Override
    public int deletePet(int pid){
        return petMapper.deletePet(pid);
    }

    @Override
    public void insertPet(Pet pet){
        petMapper.updatePet(pet);
    }

    @Override
    public int updatePet(Pet pet){
        return petMapper.updatePet(pet);
    }



}
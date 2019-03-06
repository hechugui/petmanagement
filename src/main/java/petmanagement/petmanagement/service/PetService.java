/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.service;
import org.springframework.web.bind.annotation.RequestBody;
import petmanagement.petmanagement.entity.Pet;
import petmanagement.petmanagement.mapper.*;
import java.util.List;

//这里不用写public 什么的也没事

public interface PetService {
 List<Pet> findPets();

 Pet findPetByPid(int pid);

int deletePet(int pid);

    int updatePet(Pet pet);

    void insertPet(Pet pet);

}

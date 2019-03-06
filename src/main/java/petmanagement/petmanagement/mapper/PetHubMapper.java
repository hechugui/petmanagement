package petmanagement.petmanagement.mapper;

import org.springframework.stereotype.Repository;
import petmanagement.petmanagement.entity.PetHub;

@Repository
public interface PetHubMapper {
    int deleteByPrimaryKey(Integer hubid);

    int insert(PetHub record);

    int insertSelective(PetHub record);

    PetHub selectByPrimaryKey(Integer hubid);

    int updateByPrimaryKeySelective(PetHub record);

    int updateByPrimaryKey(PetHub record);
}
package petmanagement.petmanagement.mapper;

import org.springframework.stereotype.Repository;
import petmanagement.petmanagement.entity.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
package petmanagement.petmanagement.mapper;

import org.springframework.stereotype.Repository;
import petmanagement.petmanagement.entity.Admin;

@Repository
//@repository是数据层的bean
public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
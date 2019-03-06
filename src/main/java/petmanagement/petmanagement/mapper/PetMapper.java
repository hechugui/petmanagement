package petmanagement.petmanagement.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import petmanagement.petmanagement.entity.Pet;
import java.util.List;



@Repository
public interface PetMapper {

    int deleteByPrimaryKey(Integer petid);

    int insert(Pet record);

    int insertSelective(Pet record);

    Pet selectByPrimaryKey(Integer petid);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);

    @Select("select * from pet where petid=#{petid}")
    Pet findPetByPid(int petid);

    @Select("select * from pet")
    List<Pet> findPet();

    @Update("update pet set type=#{type},age=#{age},sex=#{sex},color=#{color},statu=#{statu},hubid=#{hubid},adopterid=#{adopterid}")
    int updatePet(Pet pet);

    @Delete("delete from pet where petid=#{petid}")
    int deletePet(int petid);

    @Insert("insert into pet(type,age,sex.color,statu,hubid,adopterid) value(#{type},#{age},#{sex},#{color},#{statu},#{hubid},#{adopterid})")
    @Options(useGeneratedKeys = true,keyProperty = "petid")
    void insertPet(Pet pet);
//    option注解标签useGeneratedKeys=true表示使用数据库自动增长的主键，
// keyColumn用于指定数据库table中的主键，keyProperty用于指定传入对象的成员变量。

  //  @Options(useGeneratedKeys=true,keyProperty="userId",keyColumn="userId")

//    这个注解的意思就是，使用数据库自动增长的主键，
// 并从table中userId字段里面把数据放到传入对象的成员变量userId里面。
//    如果我们已经在数据库表中指定了主键，那么keyColumn属性可以缺省。




}
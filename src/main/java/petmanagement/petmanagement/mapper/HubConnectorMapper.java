package petmanagement.petmanagement.mapper;

import org.springframework.stereotype.Repository;
import petmanagement.petmanagement.entity.HubConnector;

@Repository
public interface HubConnectorMapper {
    int deleteByPrimaryKey(Integer connectorid);

    int insert(HubConnector record);

    int insertSelective(HubConnector record);

    HubConnector selectByPrimaryKey(Integer connectorid);

    int updateByPrimaryKeySelective(HubConnector record);

    int updateByPrimaryKey(HubConnector record);
}
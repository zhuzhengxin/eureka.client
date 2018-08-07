package eureka.client.mapper;

import eureka.client.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
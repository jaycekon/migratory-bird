package com.jaycekon.api;

import com.jaycekon.repository.mapper.UserMapper;
import com.jaycekon.repository.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * TODO 加点注释
 *
 * @author <a href="mailto:weijie_huang"> weijie_huang </a>
 * 2018/5/28 13:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = userMapper.selectByIdCard("440182199410253333");
        Assert.notNull(user,"数据库连接异常！");
    }
}

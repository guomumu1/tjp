package com.jrx.tjp.web.service.impl;

import com.jrx.tjp.core.service.IDemoService;
import com.jrx.tjp.web.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/**
 * 用户服务实现类
 * @author zwg
 * @date 2018/3/1.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired @Qualifier(value = "demoServiceImpl")
    IDemoService demoService;

    /**
     * 要使用org.slf4j.Logger和org.slf4j.LoggerFactory
     * 使用门面模式的日志框架，有利于维护和各个类的日志处理方式统一
     */
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * 修改用户密码
     *
     * @param id     用户ID
     * @param oldPwd 旧密码
     * @param newPwd 新密码
     * @return 1成功，其他未失败
     */
    @Override
    public int updateUserPwd(int id, String oldPwd, String newPwd) {

        /*
        * 输入日志使用参数传递模式，不要使用字符串拼接如："用户ID："+id+""
        * 以免logger级别不够，白白浪费字符串拼接带来的资源浪费
        */
        logger.debug("用户ID：{}，旧密码：{}，新密码：{}",id,oldPwd,newPwd);
        logger.info("用户ID：{}，旧密码：{}，新密码：{}",id,oldPwd,newPwd);
        //单行注释放在语句上面

        /*
         * 多行语句注释 语句块之间用空行分割
         */

        return 1;
    }


    /**
     * 调用示例方法
     *
     * @param param 参数
     * @return 返回值
     */
    @Override
    public String callDemoFunc(String param) {
        return demoService.demoFunc(param);
    }
}

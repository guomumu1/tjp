package com.jrx.tjp.web.service;

/**
 * 用户服务接口类
 * @author zwg
 * @date 2018/3/1.
 */
public interface IUserService {


    /**
     * 修改用户密码
     * @param id       用户ID
     * @param oldPwd   旧密码
     * @param newPwd   新密码
     * @return         1成功，其他未失败
     */
    int updateUserPwd(int id, String oldPwd, String newPwd);

    /**
     * 调用示例方法
     * @param param 参数
     * @return 返回值
     */
    String callDemoFunc(String param);
}

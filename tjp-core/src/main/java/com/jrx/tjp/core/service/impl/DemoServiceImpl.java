package com.jrx.tjp.core.service.impl;

import com.jrx.tjp.core.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * 演示服务实现类
 *
 * @author zwg
 * @create 2018-03-05 11:51
 */
@Service("demoServiceImpl")
public class DemoServiceImpl implements IDemoService {


    /**
     * 演示方法
     *
     * @param param 参数
     * @return 返回值
     */
    @Override
    public String demoFunc(String param) {
        return "this is demo Func, param:"+param;
    }
}

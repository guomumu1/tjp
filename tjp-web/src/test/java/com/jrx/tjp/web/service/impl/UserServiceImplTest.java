package com.jrx.tjp.web.service.impl;

import com.jrx.tjp.web.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用户服务实现测试类
 *
 * @author zwg
 * @date 2018/3/1.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    @Autowired
    IUserService userService;

    @Test
    public void updateUserPwdTest() throws Exception {
        Integer id = 1;
        String oldPwd = "123456";
        String newPwd = "abcdef";
        int result = userService.updateUserPwd(id,oldPwd,newPwd);
        //使用断言判断结果，不要通过输出日志的形式进行人为判断
        Assert.assertEquals(result,1);
    }

    @Test
    public void callDemoFuncTest() throws Exception {
        String param = "参数";
        String res = userService.callDemoFunc(param);
        Assert.assertNotNull(res);
        System.out.println(res);
    }

    @Test
    public void test(){
        int []a={4,2,1,6,3,6,0,-5,1,1};
        int i,j;
        int low,high,mid;
        int temp;
        for(i=1;i<10;i++){
            temp=a[i];
            low=0;
            high=i-1;
            while(low<=high){
                mid=(low+high)/2;
                if(a[mid]>temp)
                    high=mid-1;
                else
                    low=mid+1;
            }
            for(j=i-1;j>high;j--)
                a[j+1]=a[j];
            a[high+1]=temp;
        }
        for(i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }

}
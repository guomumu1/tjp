package com.jrx.tjp.mybatis.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * 用户Mapper接口类的sql对象
 *
 * @author zwg
 * @create 2018-03-15 16:55
 */
public class UserSqlBuilder {

    public static String getUserByName(final String name){
        return new SQL(){{
            SELECT("*");
            FROM("user");
            if (name != null) {
                WHERE("name = #{value}");
            }
        }}.toString();
    }
}

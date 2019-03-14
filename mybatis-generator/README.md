# 代码自动生成模块

## 版本更新
* 1.3.5  
    1. org.mybatis.generator 升级到1.3.5版本  
    2. MyCommentGenerator实现新版本中的方法addModelClassComment  
    3. 对get和set方法注释修改  
    
* 1.3.2  
    基础版本


## mybatis generator 自动生成实体，映射类和xml文件
* 需要配置 maven插件 参见pom.xml
  ``` xml
  <plugin>
      <groupId>org.mybatis.generator</groupId>
      <artifactId>mybatis-generator-maven-plugin</artifactId>
      <version>1.3.5</version>
      <configuration>
          <configurationFile>${basedir}/src/test/resources/generator-config-oracle.xml</configurationFile>
          <overwrite>true</overwrite>
          <verbose>true</verbose>
      </configuration>
      <dependencies>
          <dependency>
              <groupId>com.jrx.tjp</groupId>
              <artifactId>mybatis-generator</artifactId>
              <version>1.3.5</version>
          </dependency>
      </dependencies>
  </plugin>
  ``` 
* 配置generator-config.xml文件在resources中，注意修改内容
    + 数据库驱动jar的路径
    + 修改实体类、mapper类、xml配置文件的生成路径，targetProject路径必须存在，targetPackage目录可以自动生成
    + oracle数据库需要指定 <property name="remarksReporting" value="true"></property> 否则获取不到注释


## 问题
* tinyint 导出实体中的类型为Byte而不是Integer类型
   ``` xml
   <!-- 有些表的字段需要指定java类型 tinyint smallint  text等 -->
   <table schema="" tableName="">
       <columnOverride column="" javaType="" />
   </table>
   ```
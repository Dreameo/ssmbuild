1、复习bootstrap各个样式
2、ContextLoader加载是不是要配置log4j
    log4j:WARN No appenders could be found for logger (org.springframework.web.context.ContextLoader).
3、当只是跳转页面，可以在springmvc-config.xml中配置view-controller实现页面跳转。<mvc:view-controller path="/book/toAdd" view-name="book/add"/>
4、idea编辑器有报错信息，老是跳转到第一个错误，关闭方法：https://blog.csdn.net/duanluan/article/details/107761889
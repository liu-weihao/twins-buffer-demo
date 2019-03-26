# 双Buffer缓冲池Demo工程
1、拉取[TwinsBuffer主工程](https://github.com/liu-weihao/twins-buffer)，使用maven打包此工程：
```shell
mvn clean package install -DskipTests
```
在target目录下得到了一个jar包：twins-buffer-${version}.jar

2、如果有nexus私有仓库，可以将打包得到的jar包部署上去，以便在pom中加入依赖。

没有nexus也可以直接引用本地的jar包。

在引用方加入依赖：
```xml
<dependency>
    <groupId>com.dx.ss.buffer</groupId>
    <artifactId>twins-buffer</artifactId>
    <version>1.0.2</version>
</dependency>
```
3、如果有需要，可以在application.yml(properties)中配置相关参数,详细的配置请移步[这里](https://github.com/liu-weihao/twins-buffer)。
```yml
buffer:
  allow-duplicate: false
  capacity: 1000
  threshold: 0.8
  pool:
    enable-temporary-storage: true
    buffer-time-in-seconds: 60
```

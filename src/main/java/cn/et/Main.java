package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @EnableConfigServer这个注释代表：
 * 		启用分布式配置中心，读取远程git仓库获取配置。
 * 
 * 		所有spring的配置中心的配置文件，都有以下几种格式组成：
 * 	1、配置文件是属于哪个应用的（application）
 * 2、配置文件是属于哪个阶段的（profile），一般就三个阶段（开发阶段，测试阶段，产品阶段）
 * 3、配置文件在在git仓库的哪个分支下（label）
 * @author Administrator
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}

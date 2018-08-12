package com.bow.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


/**
 * 目标名称，必须指出
 */
@Mojo(name = "count", defaultPhase = LifecyclePhase.COMPILE)
public class CountMojo extends AbstractMojo {

	/**
	 * 配置变量，在插件的configuration元素下配置变量名
	 */
	@Parameter
	private String name;

	/**
	 * 目标执行的方法
	 * 
	 * @throws MojoExecutionException e
	 * @throws MojoFailureException e
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("中文 count>>>>>>> " + name);
	}
}
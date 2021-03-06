package com.wgcloud.entity;

import java.util.Date;

/**
 *
 * @ClassName:AppInfo.java     
 * @version v2.1
 * @author: wgcloud     
 * @date: 2019年11月16日
 * @Description: app端口信息
 * @Copyright: 2019-2022 wgcloud. All rights reserved.
 *
 */
public class AppInfo extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2913111613773445949L;



	/**
	 * host名称
	 */
	private String hostname;

	/**
	 * 应用进程ID
	 */
    private String appPid;
    
    /**
	 * 应用进程名称
	 */
    private String appName;

	/**
	 *内存使用M
	 */
	private Double memPer;

	/**
	 * cpu使用率
	 */
	private Double cpuPer;


	/**
     * 创建时间
     */
    private Date createTime;


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	

	public String getAppPid() {
		return appPid;
	}

	public void setAppPid(String appPid) {
		this.appPid = appPid;
	}


	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Double getMemPer() {
		return memPer;
	}

	public void setMemPer(Double memPer) {
		this.memPer = memPer;
	}

	public Double getCpuPer() {
		return cpuPer;
	}

	public void setCpuPer(Double cpuPer) {
		this.cpuPer = cpuPer;
	}
}
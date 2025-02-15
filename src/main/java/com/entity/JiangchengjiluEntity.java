package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 奖惩记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
@TableName("jiangchengjilu")
public class JiangchengjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangchengjiluEntity() {
		
	}
	
	public JiangchengjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 所在支部
	 */
					
	private String suozaizhibu;
	
	/**
	 * 奖惩
	 */
					
	private String jiangcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 条文
	 */
					
	private String tiaowen;
	
	/**
	 * 文档
	 */
					
	private String wendang;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：所在支部
	 */
	public void setSuozaizhibu(String suozaizhibu) {
		this.suozaizhibu = suozaizhibu;
	}
	/**
	 * 获取：所在支部
	 */
	public String getSuozaizhibu() {
		return suozaizhibu;
	}
	/**
	 * 设置：奖惩
	 */
	public void setJiangcheng(String jiangcheng) {
		this.jiangcheng = jiangcheng;
	}
	/**
	 * 获取：奖惩
	 */
	public String getJiangcheng() {
		return jiangcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：条文
	 */
	public void setTiaowen(String tiaowen) {
		this.tiaowen = tiaowen;
	}
	/**
	 * 获取：条文
	 */
	public String getTiaowen() {
		return tiaowen;
	}
	/**
	 * 设置：文档
	 */
	public void setWendang(String wendang) {
		this.wendang = wendang;
	}
	/**
	 * 获取：文档
	 */
	public String getWendang() {
		return wendang;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}

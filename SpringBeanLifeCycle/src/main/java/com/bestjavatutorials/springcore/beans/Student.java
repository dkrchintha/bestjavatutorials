package com.bestjavatutorials.springcore.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Student implements BeanPostProcessor {
	/* InitializingBean, DisposableBean, */

	private String name;
	private long SSID;
	private int rollNo;
	private String[] courses;
	private List<String> certifications;
	private Map<String, String> skills;
	private Set<String> education;
	private short intials;
	private byte barcode;
	private Date dateOfbirth;

	/*
	 * public void afterPropertiesSet() throws Exception {
	 * 
	 * System.out.println("After Properties Set ");
	 * 
	 * System.out.println("Student Details  Name " + name + " SSID " + SSID +
	 * " Roll No  " + rollNo + " Courses  " + Arrays.toString(courses) +
	 * " Certifications " + certifications + "  Skills " + skills +
	 * " Education " + education + " Intials " + intials + " BarCode " + barcode
	 * + " Date of Birth " + dateOfbirth);
	 * 
	 * }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSSID() {
		return SSID;
	}

	public void setSSID(long sSID) {
		SSID = sSID;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	public Set<String> getEducation() {
		return education;
	}

	public void setEducation(Set<String> education) {
		this.education = education;
	}

	public short getIntials() {
		return intials;
	}

	public void setIntials(short intials) {
		this.intials = intials;
	}

	public byte getBarcode() {
		return barcode;
	}

	public void setBarcode(byte barcode) {
		this.barcode = barcode;
	}

	public Date getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public void destroy() throws Exception {
		System.out.println("Disposable Bean  Destroy ");

	}

	public void myinit() {
		System.out.println("MY  init-method Initialization Method");
	}

	public void mydestroy() {
		System.out.println("My destory-method destroy Method");
	}

	@PostConstruct
	public void mypostinit() {
		System.out.println("MY PostConstruct Method");
	}

	@PreDestroy
	public void myPostdestroy() {
		System.out.println("My predestroy Method");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Post Process AFTER Init BEANPOSTPROCESSOR "+arg0.getClass().getName());
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println(" Post Process  BEFORE Init BEANPOSTPROCESSOR "+arg0.getClass().getName());
		return arg0;
	}

}

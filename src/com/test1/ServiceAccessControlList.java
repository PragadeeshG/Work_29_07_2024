package com.test1;

public class ServiceAccessControlList {
	private String accessManagement;
	private String controls;
	private String globalService;
	private String networkAccess;
	private Integer fileSystemId;
	private Integer userCode;
	private String sequenceNumber;
	private String protocol;
	private String networkACL;
	private String fileSystemACL;

	public ServiceAccessControlList() {

	}

	public ServiceAccessControlList(String accessManagement, String controls, String globalService,
			String networkAccess, Integer fileSystemId, Integer userCode, String sequenceNumber, String protocol,
			String networkACL, String fileSystemACL) {
		super();
		this.accessManagement = accessManagement;
		this.controls = controls;
		this.globalService = globalService;
		this.networkAccess = networkAccess;
		this.fileSystemId = fileSystemId;
		this.userCode = userCode;
		this.sequenceNumber = sequenceNumber;
		this.protocol = protocol;
		this.networkACL = networkACL;
		this.fileSystemACL = fileSystemACL;
	}

	public String getAccessManagement() {
		return accessManagement;
	}

	public void setAccessManagement(String accessManagement) {
		this.accessManagement = accessManagement;
	}

	public String getControls() {
		return controls;
	}

	public void setControls(String controls) {
		this.controls = controls;
	}

	public String getGlobalService() {
		return globalService;
	}

	public void setGlobalService(String globalService) {
		this.globalService = globalService;
	}

	public String getNetworkAccess() {
		return networkAccess;
	}

	public void setNetworkAccess(String networkAccess) {
		this.networkAccess = networkAccess;
	}

	public Integer getFileSystemId() {
		return fileSystemId;
	}

	public void setFileSystemId(Integer fileSystemId) {
		this.fileSystemId = fileSystemId;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getNetworkACL() {
		return networkACL;
	}

	public void setNetworkACL(String networkACL) {
		this.networkACL = networkACL;
	}

	public String getFileSystemACL() {
		return fileSystemACL;
	}

	public void setFileSystemACL(String fileSystemACL) {
		this.fileSystemACL = fileSystemACL;
	}

}

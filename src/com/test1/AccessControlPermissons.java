package com.test1;

public class AccessControlPermissons {
	private long aclCode;
	private String sequenceNumber;
	private String aclName;
	private boolean isActive;
	private boolean isAllowed;
	private String version;
	private String statement;
	private String remark;
	private String networkProtocol;
	private String source;
	private boolean logAvailable;
	private long destinationNetwork;
	private String advancedACL;
	private String otherCriteria;
	private String networkLayer;
	private String securityDevice;

	public AccessControlPermissons() {

	}

	public AccessControlPermissons(long aclCode, String sequenceNumber, String aclName, boolean isActive,
			boolean isAllowed, String version, String statement, String remark, String networkProtocol, String source,
			boolean logAvailable, long destinationNetwork, String advancedACL, String otherCriteria,
			String networkLayer, String securityDevice) {
		super();
		this.aclCode = aclCode;
		this.sequenceNumber = sequenceNumber;
		this.aclName = aclName;
		this.isActive = isActive;
		this.isAllowed = isAllowed;
		this.version = version;
		this.statement = statement;
		this.remark = remark;
		this.networkProtocol = networkProtocol;
		this.source = source;
		this.logAvailable = logAvailable;
		this.destinationNetwork = destinationNetwork;
		this.advancedACL = advancedACL;
		this.otherCriteria = otherCriteria;
		this.networkLayer = networkLayer;
		this.securityDevice = securityDevice;
	}

	public long getAclCode() {
		return aclCode;
	}

	public void setAclCode(long aclCode) {
		this.aclCode = aclCode;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getAclName() {
		return aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isAllowed() {
		return isAllowed;
	}

	public void setAllowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getNetworkProtocol() {
		return networkProtocol;
	}

	public void setNetworkProtocol(String networkProtocol) {
		this.networkProtocol = networkProtocol;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isLogAvailable() {
		return logAvailable;
	}

	public void setLogAvailable(boolean logAvailable) {
		this.logAvailable = logAvailable;
	}

	public long getDestinationNetwork() {
		return destinationNetwork;
	}

	public void setDestinationNetwork(long destinationNetwork) {
		this.destinationNetwork = destinationNetwork;
	}

	public String getAdvancedACL() {
		return advancedACL;
	}

	public void setAdvancedACL(String advancedACL) {
		this.advancedACL = advancedACL;
	}

	public String getOtherCriteria() {
		return otherCriteria;
	}

	public void setOtherCriteria(String otherCriteria) {
		this.otherCriteria = otherCriteria;
	}

	public String getNetworkLayer() {
		return networkLayer;
	}

	public void setNetworkLayer(String networkLayer) {
		this.networkLayer = networkLayer;
	}

	public String getSecurityDevice() {
		return securityDevice;
	}

	public void setSecurityDevice(String securityDevice) {
		this.securityDevice = securityDevice;
	}

}

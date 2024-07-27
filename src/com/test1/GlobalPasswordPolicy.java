package com.test1;

public class GlobalPasswordPolicy {
	private long policyId;
	private Integer aclCode;
	private String hasUppercase;
	private String hasLowerCase;
	private String hasNonNumeric;
	private String hasNumbers;
	private Integer repeatedPasswordCount;
	private String passwordExpiration;
	private Integer minimumLength;

	public GlobalPasswordPolicy() {

	}

	public GlobalPasswordPolicy(long policyId, Integer aclCode, String hasUppercase, String hasLowerCase,
			String hasNonNumeric, String hasNumbers, Integer repeatedPasswordCount, String passwordExpiration,
			Integer minimumLength) {
		super();
		this.policyId = policyId;
		this.aclCode = aclCode;
		this.hasUppercase = hasUppercase;
		this.hasLowerCase = hasLowerCase;
		this.hasNonNumeric = hasNonNumeric;
		this.hasNumbers = hasNumbers;
		this.repeatedPasswordCount = repeatedPasswordCount;
		this.passwordExpiration = passwordExpiration;
		this.minimumLength = minimumLength;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public Integer getAclCode() {
		return aclCode;
	}

	public void setAclCode(Integer aclCode) {
		this.aclCode = aclCode;
	}

	public String getHasUppercase() {
		return hasUppercase;
	}

	public void setHasUppercase(String hasUppercase) {
		this.hasUppercase = hasUppercase;
	}

	public String getHasLowerCase() {
		return hasLowerCase;
	}

	public void setHasLowerCase(String hasLowerCase) {
		this.hasLowerCase = hasLowerCase;
	}

	public String getHasNonNumeric() {
		return hasNonNumeric;
	}

	public void setHasNonNumeric(String hasNonNumeric) {
		this.hasNonNumeric = hasNonNumeric;
	}

	public String getHasNumbers() {
		return hasNumbers;
	}

	public void setHasNumbers(String hasNumbers) {
		this.hasNumbers = hasNumbers;
	}

	public Integer getRepeatedPasswordCount() {
		return repeatedPasswordCount;
	}

	public void setRepeatedPasswordCount(Integer repeatedPasswordCount) {
		this.repeatedPasswordCount = repeatedPasswordCount;
	}

	public String getPasswordExpiration() {
		return passwordExpiration;
	}

	public void setPasswordExpiration(String passwordExpiration) {
		this.passwordExpiration = passwordExpiration;
	}

	public Integer getMinimumLength() {
		return minimumLength;
	}

	public void setMinimumLength(Integer minimumLength) {
		this.minimumLength = minimumLength;
	}

}

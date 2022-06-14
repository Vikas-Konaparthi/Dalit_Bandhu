package com.example.kmc;

import com.google.android.material.textfield.TextInputLayout;
public class Individual {

    String name;
    String fatherName;
    String age;
    String houseNo;
    String aadhar;
    String phoneNo;
    String preferredUnit;
    String bankName;
    String bankAccNo;
    String psUpload;
    String spApproved;
    String village;
    String mandal;
    String district;
    String dbAccount;
    String sp_remarks;
    String so_remarks;
    String ctrApproved;
    String secOfficerUpload;
    String status;
    String secOfficerApproved;
    String approvalAmount;
    String bankIFSC;
    String vendorName;
    String vendorAccountNo;
    String vendorIFSC;
    String vendorAgency;
    String vendorBankName;
    String groundingStatus;
    String grounding_img;
    String individualAmountRequired;
    String spApproved2;
    String spAmountApproved;
    String psApprovedAmount;
    String quotationImage;

    public String getSecOfficerUpload() {
        return secOfficerUpload;
    }

    public void setSecOfficerUpload(String secOfficerUpload) {
        this.secOfficerUpload = secOfficerUpload;
    }

    public Individual(){}

    public String getPsUpload() {
        return psUpload;
    }

    public void setPsUpload(String psUpload) {
        this.psUpload = psUpload;
    }

    public Individual(String grounding_img,String vendorName,String vendorAccountNo,String vendorIFSC,String groundingStatus,String bankIFSC,String approvalAmount,String secOfficerApproved,String name, String fatherName, String age, String houseNo, String aadhar, String phoneNo, String preferredUnit, String bankName, String bankAccNo, String psPDF, String spApproved, String village, String mandal, String district,String dbAccount,String sp_remarks,String so_remarks,String ctrApproved,String secOfficerUpload,String status,String individualAmountRequired,String spApproved2,String spAmountApproved,String psApprovedAmount,String vendorAgency,String vendorBankName,String quotationImage) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.houseNo = houseNo;
        this.aadhar = aadhar;
        this.phoneNo = phoneNo;
        this.preferredUnit = preferredUnit;
        this.bankName = bankName;
        this.bankAccNo = bankAccNo;
        this.psUpload = psPDF;
        this.spApproved=spApproved;
        this.village=village;
        this.mandal=mandal;
        this.district=district;
        this.dbAccount=dbAccount;
        this.sp_remarks=sp_remarks;
        this.so_remarks=so_remarks;
        this.ctrApproved=ctrApproved;
        this.secOfficerUpload=secOfficerUpload;
        this.status=status;
        this.secOfficerApproved=secOfficerApproved;
        this.approvalAmount=approvalAmount;
        this.bankIFSC=bankIFSC;
        this.vendorAccountNo=vendorAccountNo;
        this.vendorIFSC=vendorIFSC;
        this.vendorName=vendorName;
        this.groundingStatus=groundingStatus;
        this.grounding_img=grounding_img;
        this.individualAmountRequired=individualAmountRequired;
        this.spApproved2=spApproved2;
        this.spAmountApproved=spAmountApproved;
        this.psApprovedAmount=psApprovedAmount;
        this.vendorAgency=vendorAgency;
        this.vendorBankName=vendorBankName;
        this.quotationImage=quotationImage;
    }

    public String getVendorAgency() {
        return vendorAgency;
    }

    public void setVendorAgency(String vendorAgency) {
        this.vendorAgency = vendorAgency;
    }

    public String getVendorBankName() {
        return vendorBankName;
    }

    public String getQuotationImage() {
        return quotationImage;
    }

    public void setQuotationImage(String quotationImage) {
        this.quotationImage = quotationImage;
    }

    public void setVendorBankName(String vendorBankName) {
        this.vendorBankName = vendorBankName;
    }

    public String getPsApprovedAmount() {
        return psApprovedAmount;
    }

    public void setPsApprovedAmount(String psApprovedAmount) {
        this.psApprovedAmount = psApprovedAmount;
    }

    public String getSpApproved2() {
        return spApproved2;
    }

    public void setSpApproved2(String spApproved2) {
        this.spApproved2 = spApproved2;
    }

    public String getSpAmountApproved() {
        return spAmountApproved;
    }

    public void setSpAmountApproved(String spAmountApproved) {
        this.spAmountApproved = spAmountApproved;
    }

    public String getIndividualAmountRequired() {
        return individualAmountRequired;
    }

    public void setIndividualAmountRequired(String individualAmountRequired) {
        this.individualAmountRequired = individualAmountRequired;
    }

    public String getGrounding_img() {
        return grounding_img;
    }

    public void setGrounding_img(String grounding_img) {
        this.grounding_img = grounding_img;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAccountNo() {
        return vendorAccountNo;
    }

    public void setVendorAccountNo(String vendorAccountNo) {
        this.vendorAccountNo = vendorAccountNo;
    }

    public String getVendorIFSC() {
        return vendorIFSC;
    }

    public void setVendorIFSC(String vendorIFSC) {
        this.vendorIFSC = vendorIFSC;
    }

    public String getGroundingStatus() {
        return groundingStatus;
    }

    public void setGroundingStatus(String groundingStatus) {
        this.groundingStatus = groundingStatus;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    public String getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(String approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public String getSecOfficerApproved() {
        return secOfficerApproved;
    }

    public void setSecOfficerApproved(String secOfficerApproved) {
        this.secOfficerApproved = secOfficerApproved;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSp_remarks() {
        return sp_remarks;
    }

    public void setSp_remarks(String sp_remarks) {
        this.sp_remarks = sp_remarks;
    }

    public String getSo_remarks() {
        return so_remarks;
    }

    public void setSo_remarks(String so_remarks) {
        this.so_remarks = so_remarks;
    }

    public String getCtrApproved() {
        return ctrApproved;
    }

    public void setCtrApproved(String ctrApproved) {
        this.ctrApproved = ctrApproved;
    }

    public String getDbAccount() {
        return dbAccount;
    }

    public void setDbAccount(String dbAccount) {
        this.dbAccount = dbAccount;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMandal() {
        return mandal;
    }

    public void setMandal(String mandal) {
        this.mandal = mandal;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSpApproved() {
        return spApproved;
    }

    public void setSpApproved(String spApproved) {
        this.spApproved = spApproved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPreferredUnit() {
        return preferredUnit;
    }

    public void setPreferredUnit(String preferredUnit) {
        this.preferredUnit = preferredUnit;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }
}

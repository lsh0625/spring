package org.zerock.test0;

public class DTO {
    private String dutyAddr;
    private String dutyFax;
    private String dutyName;
    private String dutyTel;
    private String dutyTimeStart;
    private String dutyTimeEnd;
    private String hpid;
    private String postCode;
    private double latitude;
    private double longitude;

    public String getDutyAddr() {
        return dutyAddr;
    }

    public void setDutyAddr(String dutyAddr) {
        this.dutyAddr = dutyAddr;
    }

    public String getDutyFax() {
        return dutyFax;
    }

    public void setDutyFax(String dutyFax) {
        this.dutyFax = dutyFax;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public String getDutyTel() {
        return dutyTel;
    }

    public void setDutyTel(String dutyTel) {
        this.dutyTel = dutyTel;
    }

    public String getDutyTimeStart() {
        return dutyTimeStart;
    }

    public void setDutyTimeStart(String dutyTimeStart) {
        this.dutyTimeStart = dutyTimeStart;
    }

    public String getDutyTimeEnd() {
        return dutyTimeEnd;
    }

    public void setDutyTimeEnd(String dutyTimeEnd) {
        this.dutyTimeEnd = dutyTimeEnd;
    }

    public String getHpid() {
        return hpid;
    }

    public void setHpid(String hpid) {
        this.hpid = hpid;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


// 생성자, Getter 및 Setter 생략

    @Override
    public String toString() {
        return "MedicalInstitutionDTO{" +
                "dutyAddr='" + dutyAddr + '\'' +
                ", dutyFax='" + dutyFax + '\'' +
                ", dutyName='" + dutyName + '\'' +
                ", dutyTel='" + dutyTel + '\'' +
                ", dutyTimeStart='" + dutyTimeStart + '\'' +
                ", dutyTimeEnd='" + dutyTimeEnd + '\'' +
                ", hpid='" + hpid + '\'' +
                ", postCode='" + postCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

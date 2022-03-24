package com.greedy.sangbum.member.model.dto;

import java.sql.Date;
import java.util.List;

public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String temPwdYN;
    private java.sql.Date pwdChangedDatetime;
    private String pwdExpDate;
    private String name;
    private java.sql.Date registDatetime;
    private int accumLoginCount;
    private int loginFailedCount;
    private String accLockYn;
    private String accInactiveYn;
    private String accExpDate;
    private String accExpYn;
    private java.sql.Date accSecessionDatetime;
    private String accSecessionYn;

    private List<MemberRoleDTO> memberRoleList;

    public MemberDTO(int no, String id, String pwd, String temPwdYN, Date pwdChangedDatetime, String pwdExpDate, String name, Date registDatetime, int accumLoginCount, int loginFailedCount, String accLockYn, String accInactiveYn, String accExpDate, String accExpYn, Date accSecessionDatetime, String accSecessionYn, List<MemberRoleDTO> memberRoleList) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.temPwdYN = temPwdYN;
        this.pwdChangedDatetime = pwdChangedDatetime;
        this.pwdExpDate = pwdExpDate;
        this.name = name;
        this.registDatetime = registDatetime;
        this.accumLoginCount = accumLoginCount;
        this.loginFailedCount = loginFailedCount;
        this.accLockYn = accLockYn;
        this.accInactiveYn = accInactiveYn;
        this.accExpDate = accExpDate;
        this.accExpYn = accExpYn;
        this.accSecessionDatetime = accSecessionDatetime;
        this.accSecessionYn = accSecessionYn;
        this.memberRoleList = memberRoleList;
    }

    public MemberDTO() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTemPwdYN() {
        return temPwdYN;
    }

    public void setTemPwdYN(String temPwdYN) {
        this.temPwdYN = temPwdYN;
    }

    public Date getPwdChangedDatetime() {
        return pwdChangedDatetime;
    }

    public void setPwdChangedDatetime(Date pwdChangedDatetime) {
        this.pwdChangedDatetime = pwdChangedDatetime;
    }

    public String getPwdExpDate() {
        return pwdExpDate;
    }

    public void setPwdExpDate(String pwdExpDate) {
        this.pwdExpDate = pwdExpDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistDatetime() {
        return registDatetime;
    }

    public void setRegistDatetime(Date registDatetime) {
        this.registDatetime = registDatetime;
    }

    public int getAccumLoginCount() {
        return accumLoginCount;
    }

    public void setAccumLoginCount(int accumLoginCount) {
        this.accumLoginCount = accumLoginCount;
    }

    public int getLoginFailedCount() {
        return loginFailedCount;
    }

    public void setLoginFailedCount(int loginFailedCount) {
        this.loginFailedCount = loginFailedCount;
    }

    public String getAccLockYn() {
        return accLockYn;
    }

    public void setAccLockYn(String accLockYn) {
        this.accLockYn = accLockYn;
    }

    public String getAccInactiveYn() {
        return accInactiveYn;
    }

    public void setAccInactiveYn(String accInactiveYn) {
        this.accInactiveYn = accInactiveYn;
    }

    public String getAccExpDate() {
        return accExpDate;
    }

    public void setAccExpDate(String accExpDate) {
        this.accExpDate = accExpDate;
    }

    public String getAccExpYn() {
        return accExpYn;
    }

    public void setAccExpYn(String accExpYn) {
        this.accExpYn = accExpYn;
    }

    public Date getAccSecessionDatetime() {
        return accSecessionDatetime;
    }

    public void setAccSecessionDatetime(Date accSecessionDatetime) {
        this.accSecessionDatetime = accSecessionDatetime;
    }

    public String getAccSecessionYn() {
        return accSecessionYn;
    }

    public void setAccSecessionYn(String accSecessionYn) {
        this.accSecessionYn = accSecessionYn;
    }

    public List<MemberRoleDTO> getMemberRoleList() {
        return memberRoleList;
    }

    public void setMemberRoleList(List<MemberRoleDTO> memberRoleList) {
        this.memberRoleList = memberRoleList;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", temPwdYN='" + temPwdYN + '\'' +
                ", pwdChangedDatetime=" + pwdChangedDatetime +
                ", pwdExpDate='" + pwdExpDate + '\'' +
                ", name='" + name + '\'' +
                ", registDatetime=" + registDatetime +
                ", accumLoginCount=" + accumLoginCount +
                ", loginFailedCount=" + loginFailedCount +
                ", accLockYn='" + accLockYn + '\'' +
                ", accInactiveYn='" + accInactiveYn + '\'' +
                ", accExpDate='" + accExpDate + '\'' +
                ", accExpYn='" + accExpYn + '\'' +
                ", accSecessionDatetime=" + accSecessionDatetime +
                ", accSecessionYn='" + accSecessionYn + '\'' +
                ", memberRoleList=" + memberRoleList +
                '}';
    }
}

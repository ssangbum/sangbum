package com.greedy.sangbum.member.model.dto;

public class AuthorityDTO {

    private int code;       //권한코드
    private String name;    //권한명
    private String desc;    //권한설명

    public AuthorityDTO(int code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public AuthorityDTO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "AuthorityDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

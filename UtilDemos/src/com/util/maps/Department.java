package com.util.maps;

public class Department {
    private String DeptHead;
    private  int deptId;
    private String deptName;

    public Department() {
    }

    public Department(String deptHead, int deptId, String deptName) {
        DeptHead = deptHead;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return DeptHead;
    }

    public void setDeptHead(String deptHead) {
        DeptHead = deptHead;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DeptHead='" + DeptHead + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

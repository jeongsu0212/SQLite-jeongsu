package com.human.sqlite_jeongsu;
/*
StudentVO클래스는 xml과 DB와 메인액티비티java 와
데이터를 GET/SET 하기위해서
 */
public class StudentVO {
    //VO클래스의 멤버변수
    //Cursor id(레코드= 한줄아이디)
    //m은 member의 클래스 변수
    private int mid;
    //학년
    private int mgrade;
    //학번
    private int mnumber;
    //이름
    private String mname;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getMgrade() {
        return mgrade;
    }

    public void setMgrade(int mgrade) {
        this.mgrade = mgrade;
    }

    public int getMnumber() {
        return mnumber;
    }

    public void setMnumber(int mnumber) {
        this.mnumber = mnumber;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}

package com.xm.swc.pojo.po;

public class Indexpage {
    private Integer indexid;

    private String indexcontent;

    private String indexname;

    public Indexpage() {
    }

    public Integer getIndexid() {
        return indexid;
    }

    public void setIndexid(Integer indexid) {
        this.indexid = indexid;
    }

    public String getIndexcontent() {
        return indexcontent;
    }

    public void setIndexcontent(String indexcontent) {
        this.indexcontent = indexcontent == null ? null : indexcontent.trim();
    }

    public String getIndexname() {
        return indexname;
    }

    public void setIndexname(String indexname) {
        this.indexname = indexname == null ? null : indexname.trim();
    }
}
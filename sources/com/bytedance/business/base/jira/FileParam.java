package com.bytedance.business.base.jira;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class FileParam implements Serializable {
    public String content;
    public String name;
    public int type;

    static {
        Covode.recordClassIndex(15731);
    }

    public String getContent() {
        return this.content;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public static FileParam obtainImg(String str) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName("img");
        fileParam.setType(2);
        return fileParam;
    }

    public static FileParam obtainTxt(String str, String str2) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName(str2);
        fileParam.setType(1);
        return fileParam;
    }

    public static FileParam obtainTxtFile(String str, String str2) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName(str2);
        fileParam.setType(3);
        return fileParam;
    }

    public static FileParam obtain(String str, String str2, int i2) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str2);
        fileParam.setName(str);
        fileParam.setType(i2);
        return fileParam;
    }
}

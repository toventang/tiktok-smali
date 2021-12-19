package com.ss.android.ugc.aweme.qrcode;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class j implements Serializable {
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public j f119753a = new j((byte) 0);

        static {
            Covode.recordClassIndex(77809);
        }
    }

    static {
        Covode.recordClassIndex(77808);
    }

    private j() {
    }

    public String getWebDes() {
        return this.webDes;
    }

    public String getWebImage() {
        return this.webImage;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebDes(String str) {
        this.webDes = str;
    }

    public void setWebImage(String str) {
        this.webImage = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    public j(int i2, String str, String str2) {
        this.type = i2;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public j(int i2, String str, boolean z, String str2, String str3) {
        this.type = i2;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}

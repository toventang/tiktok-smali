package com.ss.android.ugc.playerkit.simapicommon.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class g implements Serializable {
    @c(a = "player_access_key")
    protected String aK;
    @c(a = "file_cs")
    protected String fileCheckSum;
    @c(a = "file_hash")
    String fileHash;
    @c(a = "height")
    int height;
    public Object origin;
    @c(a = "data_size")
    long size;
    @c(a = "uri")
    public String uri;
    @c(a = "url_key")
    public String urlKey;
    @c(a = "url_list")
    protected List<String> urlList;
    @c(a = "width")
    int width;

    static {
        Covode.recordClassIndex(98034);
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public String getaK() {
        return this.aK;
    }

    public int hashCode() {
        String str;
        int i2;
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        List<String> list = this.urlList;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i4 + i3;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setSize(long j2) {
        this.size = j2;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public void setaK(String str) {
        this.aK = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.uri;
        if (str == null ? gVar.uri != null : !str.equals(gVar.uri)) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 == null ? gVar.urlKey != null : !str2.equals(gVar.urlKey)) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = gVar.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }
}

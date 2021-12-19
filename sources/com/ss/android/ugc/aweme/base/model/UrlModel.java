package com.ss.android.ugc.aweme.base.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class UrlModel implements Serializable {
    @c(a = "file_hash")
    public String fileHash;
    @c(a = "height")
    public int height;
    @c(a = "data_size")
    public long size;
    @c(a = "uri")
    public String uri;
    @c(a = "url_key")
    public String urlKey;
    @c(a = "url_list")
    public List<String> urlList;
    @c(a = "width")
    public int width;

    static {
        Covode.recordClassIndex(41989);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        String str = this.uri;
        if (str == null ? urlModel.uri != null : !str.equals(urlModel.uri)) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 == null ? urlModel.urlKey != null : !str2.equals(urlModel.urlKey)) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = urlModel.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }
}

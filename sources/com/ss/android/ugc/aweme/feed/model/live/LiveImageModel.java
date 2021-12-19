package com.ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class LiveImageModel implements Serializable {
    @c(a = "avg_color")
    public String avgColor;
    @c(a = "height")
    private int height;
    @c(a = "image_type")
    private int imageType;
    @c(a = "open_web_url")
    private String schema;
    @c(a = "uri")
    protected String uri;
    @c(a = "url_list")
    protected List<String> urlList;
    @c(a = "width")
    private int width;

    static {
        Covode.recordClassIndex(59498);
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getImageType() {
        return this.imageType;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.uri)) {
            return true;
        }
        List<String> list = this.urlList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return hash(this.avgColor, this.uri, this.urlList, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setImageType(int i2) {
        this.imageType = i2;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    private static int hash(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i2 = 1;
        for (Object obj : objArr) {
            int i3 = i2 * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i2 = i3 + hashCode;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LiveImageModel liveImageModel = (LiveImageModel) obj;
            if (this.width != liveImageModel.width || this.height != liveImageModel.height || !equals(this.avgColor, liveImageModel.avgColor) || !equals(this.uri, liveImageModel.uri) || !equals(this.urlList, liveImageModel.urlList)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}

package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class UrlModel {
    @c(a = "height")
    private Integer height;
    @c(a = "uri")
    private String uri;
    @c(a = "url_key")
    private String urlKey;
    @c(a = "url_list")
    private List<String> urlList = new ArrayList();
    @c(a = "width")
    private Integer width;

    static {
        Covode.recordClassIndex(63103);
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public Integer getHeight() {
        Integer num = this.height;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getUri() {
        String str = this.uri;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getUrlKey() {
        String str = this.urlKey;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getWidth() {
        Integer num = this.width;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}

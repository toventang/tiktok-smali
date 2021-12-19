package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class SearchNilText implements Serializable {
    private String content;
    private String link;
    private String url;

    static {
        Covode.recordClassIndex(50953);
    }

    public String getContent() {
        return this.content;
    }

    public String getLink() {
        return this.link;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}

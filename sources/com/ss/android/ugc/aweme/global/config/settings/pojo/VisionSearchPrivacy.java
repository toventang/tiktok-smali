package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class VisionSearchPrivacy {
    @c(a = "content")
    private String content;
    @c(a = "links")
    private List<VisionSearchPrivacyLink> links = new ArrayList();
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63111);
    }

    public List<VisionSearchPrivacyLink> getLinks() {
        return this.links;
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}

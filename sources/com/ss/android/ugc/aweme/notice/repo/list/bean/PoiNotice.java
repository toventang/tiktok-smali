package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class PoiNotice {
    @c(a = "content")
    public String content;
    @c(a = "image_url")
    public UrlModel imageUrl;
    @c(a = "schema_url")
    public String schemaUrl;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(72539);
    }
}

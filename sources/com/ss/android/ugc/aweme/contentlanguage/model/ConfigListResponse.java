package com.ss.android.ugc.aweme.contentlanguage.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.a.a;
import java.util.List;

public class ConfigListResponse extends BaseResponse {
    @c(a = "content_languages")
    List<a> contentLanguage;

    static {
        Covode.recordClassIndex(48499);
    }

    public List<a> getContentLanguage() {
        return this.contentLanguage;
    }

    public void setContentLanguage(List<a> list) {
        this.contentLanguage = list;
    }
}

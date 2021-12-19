package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.x.b.a;
import com.bytedance.x.b.b;
import com.bytedance.x.b.f;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class ai implements Serializable {
    @c(a = "ad_choice")
    public af adChoiceIcon;
    @c(a = "adVerifications")
    public List<a> adVerificationList;
    @com.google.gson.a.a(a = false)
    @c(a = "creative_type")
    public int creative_type = 4;
    @com.google.gson.a.a(a = false)
    @c(a = "impression_type")
    public int impression_type = 4;
    @c(a = "enable_content_url")
    public boolean isEnableContentUrl;
    @c(a = "local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;
    @c(a = "providerType")
    public int providerType = 2;
    @c(a = "local_cache_vast")
    public f vast;
    @com.google.gson.a.a(a = false)
    @c(a = "vastContent")
    public String vastContent;
    @com.google.gson.a.a(a = false)
    @c(a = "vastUrl")
    public String vastUrl;
    @com.google.gson.a.a(a = false)
    @c(a = "vastWrapperCount")
    public int vastWrapperCount = 1;

    static {
        Covode.recordClassIndex(46155);
    }

    public List<b> getCreativeList() {
        f fVar = this.vast;
        if (fVar == null) {
            return null;
        }
        return fVar.creativeList;
    }

    public Set<String> getImpressions() {
        f fVar = this.vast;
        if (fVar == null) {
            return null;
        }
        return fVar.impressionSet;
    }
}

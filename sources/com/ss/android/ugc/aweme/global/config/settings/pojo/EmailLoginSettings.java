package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class EmailLoginSettings {
    @c(a = "domain_recommendation")
    private List<String> domainRecommendation = new ArrayList();

    static {
        Covode.recordClassIndex(63032);
    }

    public List<String> getDomainRecommendation() {
        return this.domainRecommendation;
    }
}

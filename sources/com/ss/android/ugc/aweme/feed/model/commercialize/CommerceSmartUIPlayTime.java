package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class CommerceSmartUIPlayTime implements Serializable {
    @c(a = "package")
    private UrlPackage packageUrl;
    @c(a = "params")
    private List<Integer> params;

    static {
        Covode.recordClassIndex(59478);
    }

    public final UrlPackage getPackageUrl() {
        return this.packageUrl;
    }

    public final List<Integer> getParams() {
        return this.params;
    }

    public final void setPackageUrl(UrlPackage urlPackage) {
        this.packageUrl = urlPackage;
    }

    public final void setParams(List<Integer> list) {
        this.params = list;
    }
}

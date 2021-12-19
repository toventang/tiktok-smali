package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class SimpleShopSeedingModel implements Serializable {
    @c(a = "cover")
    private final String cover;
    @c(a = "seed_id")
    private final String seedId;
    @c(a = "seed_tag")
    private final String seedTag;
    @c(a = "title")
    private final String title;
    @c(a = "url")
    private final String url;
    @c(a = "views")
    private final String views;

    static {
        Covode.recordClassIndex(59452);
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedTag() {
        return this.seedTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViews() {
        return this.views;
    }
}

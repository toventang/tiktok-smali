package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class a extends b {
    @c(a = "package_type")
    private int packageType;
    @c(a = "resource_type")
    private int resourceType;
    @c(a = "stickers")
    private List<com.ss.android.ugc.aweme.emoji.g.a> stickers;

    static {
        Covode.recordClassIndex(56106);
    }

    public final int getPackageType() {
        return this.packageType;
    }

    public final int getResourceType() {
        return this.resourceType;
    }

    public final List<com.ss.android.ugc.aweme.emoji.g.a> getStickers() {
        return this.stickers;
    }

    public final void setPackageType(int i2) {
        this.packageType = i2;
    }

    public final void setResourceType(int i2) {
        this.resourceType = i2;
    }

    public final void setStickers(List<com.ss.android.ugc.aweme.emoji.g.a> list) {
        this.stickers = list;
    }
}

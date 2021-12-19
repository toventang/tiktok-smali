package com.ss.android.ugc.aweme.services.shoutout;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AVAnchorPublishStruct {
    private final String img;
    private final String keyword;
    private final String url;

    static {
        Covode.recordClassIndex(79794);
    }

    public final String getImg() {
        return this.img;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public AVAnchorPublishStruct(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.img = str;
        this.url = str2;
        this.keyword = str3;
    }
}

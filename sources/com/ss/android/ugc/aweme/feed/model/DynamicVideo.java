package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class DynamicVideo implements Serializable {
    @c(a = "gecko_channel")
    private final List<String> geckoChannel;
    @c(a = "lynx_scheme")
    private final String lynxScheme;

    static {
        Covode.recordClassIndex(59369);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.DynamicVideo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicVideo copy$default(DynamicVideo dynamicVideo, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dynamicVideo.lynxScheme;
        }
        if ((i2 & 2) != 0) {
            list = dynamicVideo.geckoChannel;
        }
        return dynamicVideo.copy(str, list);
    }

    public final String component1() {
        return this.lynxScheme;
    }

    public final List<String> component2() {
        return this.geckoChannel;
    }

    public final DynamicVideo copy(String str, List<String> list) {
        return new DynamicVideo(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicVideo)) {
            return false;
        }
        DynamicVideo dynamicVideo = (DynamicVideo) obj;
        return l.a(this.lynxScheme, dynamicVideo.lynxScheme) && l.a(this.geckoChannel, dynamicVideo.geckoChannel);
    }

    public final int hashCode() {
        String str = this.lynxScheme;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.geckoChannel;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DynamicVideo(lynxScheme=" + this.lynxScheme + ", geckoChannel=" + this.geckoChannel + ")";
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public DynamicVideo(String str, List<String> list) {
        this.lynxScheme = str;
        this.geckoChannel = list;
    }
}

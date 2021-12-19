package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LiveReplayCover {
    public final String liveCoverUrl;
    public final String liveId;

    static {
        Covode.recordClassIndex(75239);
    }

    public static /* synthetic */ LiveReplayCover copy$default(LiveReplayCover liveReplayCover, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveReplayCover.liveId;
        }
        if ((i2 & 2) != 0) {
            str2 = liveReplayCover.liveCoverUrl;
        }
        return liveReplayCover.copy(str, str2);
    }

    public final LiveReplayCover copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new LiveReplayCover(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveReplayCover)) {
            return false;
        }
        LiveReplayCover liveReplayCover = (LiveReplayCover) obj;
        return l.a(this.liveId, liveReplayCover.liveId) && l.a(this.liveCoverUrl, liveReplayCover.liveCoverUrl);
    }

    public final int hashCode() {
        String str = this.liveId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.liveCoverUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LiveReplayCover(liveId=" + this.liveId + ", liveCoverUrl=" + this.liveCoverUrl + ")";
    }

    public LiveReplayCover(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.liveId = str;
        this.liveCoverUrl = str2;
    }
}

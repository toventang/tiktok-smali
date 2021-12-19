package com.ss.android.ugc.aweme.homepage.story.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a extends BaseResponse implements Serializable {
    @c(a = "user_ids")
    private final List<Long> uidList;
    @c(a = "version")
    private final long version;

    static {
        Covode.recordClassIndex(63238);
    }

    public static int com_ss_android_ugc_aweme_homepage_story_model_GetFeedResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.homepage.story.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, List list, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aVar.uidList;
        }
        if ((i2 & 2) != 0) {
            j2 = aVar.version;
        }
        return aVar.copy(list, j2);
    }

    public final List<Long> component1() {
        return this.uidList;
    }

    public final long component2() {
        return this.version;
    }

    public final a copy(List<Long> list, long j2) {
        return new a(list, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.uidList, aVar.uidList) && this.version == aVar.version;
    }

    public final int hashCode() {
        List<Long> list = this.uidList;
        return ((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_homepage_story_model_GetFeedResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.version);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GetFeedResponse(uidList=" + this.uidList + ", version=" + this.version + ")";
    }

    public final List<Long> getUidList() {
        return this.uidList;
    }

    public final long getVersion() {
        return this.version;
    }

    public a(List<Long> list, long j2) {
        this.uidList = list;
        this.version = j2;
    }
}

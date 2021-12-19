package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class KMReportReason {
    @c(a = "video")
    private final List<a> video;

    static {
        Covode.recordClassIndex(67767);
    }

    public KMReportReason() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.common.response.KMReportReason */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KMReportReason copy$default(KMReportReason kMReportReason, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = kMReportReason.video;
        }
        return kMReportReason.copy(list);
    }

    public final List<a> component1() {
        return this.video;
    }

    public final KMReportReason copy(List<a> list) {
        l.d(list, "");
        return new KMReportReason(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof KMReportReason) && l.a(this.video, ((KMReportReason) obj).video);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.video;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "KMReportReason(video=" + this.video + ")";
    }

    public final List<a> getVideo() {
        return this.video;
    }

    public KMReportReason(List<a> list) {
        l.d(list, "");
        this.video = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KMReportReason(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list);
    }
}

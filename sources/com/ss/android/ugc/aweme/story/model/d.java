package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class d extends BaseResponse implements Serializable {
    @c(a = "story_archive_detail")
    private final c detail;

    static {
        Covode.recordClassIndex(90271);
    }

    public static /* synthetic */ d copy$default(d dVar, c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = dVar.detail;
        }
        return dVar.copy(cVar);
    }

    public final c component1() {
        return this.detail;
    }

    public final d copy(c cVar) {
        return new d(cVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.detail, ((d) obj).detail);
        }
        return true;
    }

    public final int hashCode() {
        c cVar = this.detail;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryArchDetailResponse(detail=" + this.detail + ")";
    }

    public final c getDetail() {
        return this.detail;
    }

    public d(c cVar) {
        this.detail = cVar;
    }
}

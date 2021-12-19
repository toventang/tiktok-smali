package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class j extends BaseResponse implements Serializable {
    @c(a = "awemes")
    private final List<Aweme> awemes;

    static {
        Covode.recordClassIndex(90277);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.j */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j copy$default(j jVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = jVar.awemes;
        }
        return jVar.copy(list);
    }

    public final List<Aweme> component1() {
        return this.awemes;
    }

    public final j copy(List<? extends Aweme> list) {
        return new j(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.awemes, ((j) obj).awemes);
        }
        return true;
    }

    public final int hashCode() {
        List<Aweme> list = this.awemes;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserStoriesResponse(awemes=" + this.awemes + ")";
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends Aweme> list) {
        this.awemes = list;
    }
}

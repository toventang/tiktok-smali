package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "extra")
    private final String extra;
    @com.google.gson.a.c(a = "items")
    private final List<Aweme> items;
    @com.google.gson.a.c(a = "statistic")
    private final e statistic;

    static {
        Covode.recordClassIndex(90270);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, e eVar, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar = cVar.statistic;
        }
        if ((i2 & 2) != 0) {
            list = cVar.items;
        }
        if ((i2 & 4) != 0) {
            str = cVar.extra;
        }
        return cVar.copy(eVar, list, str);
    }

    public final e component1() {
        return this.statistic;
    }

    public final List<Aweme> component2() {
        return this.items;
    }

    public final String component3() {
        return this.extra;
    }

    public final c copy(e eVar, List<? extends Aweme> list, String str) {
        return new c(eVar, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.statistic, cVar.statistic) && l.a(this.items, cVar.items) && l.a(this.extra, cVar.extra);
    }

    public final int hashCode() {
        e eVar = this.statistic;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<Aweme> list = this.items;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.extra;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "StoryArchDetail(statistic=" + this.statistic + ", items=" + this.items + ", extra=" + this.extra + ")";
    }

    public final String getExtra() {
        return this.extra;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final e getStatistic() {
        return this.statistic;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, List<? extends Aweme> list, String str) {
        this.statistic = eVar;
        this.items = list;
        this.extra = str;
    }
}

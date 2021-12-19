package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import h.f.b.l;

public final class az {
    @c(a = "searchLiveData")

    /* renamed from: a  reason: collision with root package name */
    public final SearchLiveList f82352a;
    @c(a = "requestInfo")

    /* renamed from: b  reason: collision with root package name */
    public final ak f82353b;

    static {
        Covode.recordClassIndex(51265);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return l.a(this.f82352a, azVar.f82352a) && l.a(this.f82353b, azVar.f82353b);
    }

    public final int hashCode() {
        SearchLiveList searchLiveList = this.f82352a;
        int i2 = 0;
        int hashCode = (searchLiveList != null ? searchLiveList.hashCode() : 0) * 31;
        ak akVar = this.f82353b;
        if (akVar != null) {
            i2 = akVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchLiveData(searchLiveList=" + this.f82352a + ", requestInfo=" + this.f82353b + ")";
    }

    public az(SearchLiveList searchLiveList, ak akVar) {
        l.d(akVar, "");
        this.f82352a = searchLiveList;
        this.f82353b = akVar;
    }
}

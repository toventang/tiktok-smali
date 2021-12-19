package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class SearchOperationInfo implements Serializable {
    @c(a = "live_room")
    private Aweme aweme;
    @c(a = "activity")
    private SearchOperation operation;

    static {
        Covode.recordClassIndex(50956);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.operation.hashCode() * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i2 = aweme2.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setOperation(SearchOperation searchOperation) {
        l.d(searchOperation, "");
        this.operation = searchOperation;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchOperationInfo");
        SearchOperationInfo searchOperationInfo = (SearchOperationInfo) obj;
        if (!(!l.a(this.operation, searchOperationInfo.operation)) && !(!l.a(this.aweme, searchOperationInfo.aweme))) {
            return true;
        }
        return false;
    }

    public SearchOperationInfo(SearchOperation searchOperation, Aweme aweme2) {
        l.d(searchOperation, "");
        this.operation = searchOperation;
        this.aweme = aweme2;
    }
}

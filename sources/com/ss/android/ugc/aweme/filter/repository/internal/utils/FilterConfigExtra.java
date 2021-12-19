package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class FilterConfigExtra {
    @c(a = "filterconfig")
    private String filterconfig;

    static {
        Covode.recordClassIndex(60671);
    }

    public FilterConfigExtra() {
        this(null, 1, null);
    }

    public static /* synthetic */ FilterConfigExtra copy$default(FilterConfigExtra filterConfigExtra, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = filterConfigExtra.filterconfig;
        }
        return filterConfigExtra.copy(str);
    }

    public final String component1() {
        return this.filterconfig;
    }

    public final FilterConfigExtra copy(String str) {
        return new FilterConfigExtra(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FilterConfigExtra) && l.a(this.filterconfig, ((FilterConfigExtra) obj).filterconfig);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.filterconfig;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FilterConfigExtra(filterconfig=" + this.filterconfig + ")";
    }

    public final String getFilterconfig() {
        return this.filterconfig;
    }

    public final void setFilterconfig(String str) {
        this.filterconfig = str;
    }

    public FilterConfigExtra(String str) {
        this.filterconfig = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterConfigExtra(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}

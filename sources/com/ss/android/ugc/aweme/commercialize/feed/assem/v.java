package com.ss.android.ugc.aweme.commercialize.feed.assem;

import android.content.Context;
import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import h.f.b.l;

public final class v implements c {

    /* renamed from: a  reason: collision with root package name */
    public final bd f74163a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f74164b;

    static {
        Covode.recordClassIndex(45759);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.f74163a, vVar.f74163a) && l.a(this.f74164b, vVar.f74164b);
    }

    public final int hashCode() {
        bd bdVar = this.f74163a;
        int i2 = 0;
        int hashCode = (bdVar != null ? bdVar.hashCode() : 0) * 31;
        Context context = this.f74164b;
        if (context != null) {
            i2 = context.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VideoCommerceHierarchyData(delegate=" + this.f74163a + ", context=" + this.f74164b + ")";
    }

    private /* synthetic */ v() {
        this(null, null);
    }

    public v(bd bdVar, Context context) {
        this.f74163a = bdVar;
        this.f74164b = context;
    }
}

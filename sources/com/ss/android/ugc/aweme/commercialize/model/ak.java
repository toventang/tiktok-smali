package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.List;

public final class ak {
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f74860a;
    @c(a = "children")

    /* renamed from: b  reason: collision with root package name */
    public final List<ak> f74861b;

    static {
        Covode.recordClassIndex(46158);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return l.a(this.f74860a, akVar.f74860a) && l.a(this.f74861b, akVar.f74861b);
    }

    public final int hashCode() {
        String str = this.f74860a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<ak> list = this.f74861b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OptionListItemParams(name=" + this.f74860a + ", children=" + this.f74861b + ")";
    }
}

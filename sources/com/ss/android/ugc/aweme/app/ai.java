package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public final String f66560a;

    static {
        Covode.recordClassIndex(40917);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ai) && l.a(this.f66560a, ((ai) obj).f66560a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f66560a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchTabInfo(type=" + this.f66560a + ")";
    }

    public ai(String str) {
        l.d(str, "");
        this.f66560a = str;
    }
}

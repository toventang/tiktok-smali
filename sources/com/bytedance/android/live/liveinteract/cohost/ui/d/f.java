package com.bytedance.android.live.liveinteract.cohost.ui.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f10339a;

    static {
        Covode.recordClassIndex(5452);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f10339a, ((f) obj).f10339a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10339a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TitleItem(title=" + this.f10339a + ")";
    }

    public final void a(String str) {
        l.d(str, "");
        this.f10339a = str;
    }

    public f(String str) {
        l.d(str, "");
        this.f10339a = str;
    }
}

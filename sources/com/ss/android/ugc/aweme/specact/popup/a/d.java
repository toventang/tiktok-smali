package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = b.f37372a)

    /* renamed from: a  reason: collision with root package name */
    public String f134418a;

    static {
        Covode.recordClassIndex(87878);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f134418a, ((d) obj).f134418a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f134418a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Font(color=" + this.f134418a + ")";
    }

    public /* synthetic */ d() {
        this("");
    }

    private d(String str) {
        l.d(str, "");
        this.f134418a = str;
    }
}

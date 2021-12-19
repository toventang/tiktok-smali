package com.ss.android.sdk.webview;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f60179a;

    static {
        Covode.recordClassIndex(37172);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f60179a, ((b) obj).f60179a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f60179a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWebActivityEvent(id=" + this.f60179a + ")";
    }

    public b(String str) {
        l.d(str, "");
        this.f60179a = str;
    }
}

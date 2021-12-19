package com.ss.android.ugc.aweme.feed.ui.seekbar;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f95085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f95086b;

    /* renamed from: c  reason: collision with root package name */
    public final String f95087c;

    static {
        Covode.recordClassIndex(60277);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f95085a, cVar.f95085a) && this.f95086b == cVar.f95086b && l.a(this.f95087c, cVar.f95087c);
    }

    public final int hashCode() {
        Aweme aweme = this.f95085a;
        int i2 = 0;
        int hashCode = (((aweme != null ? aweme.hashCode() : 0) * 31) + this.f95086b) * 31;
        String str = this.f95087c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FullFeedFragmentPanelPageStateChangeEvent(mAweme=" + this.f95085a + ", state=" + this.f95086b + ", eventType=" + this.f95087c + ")";
    }

    public c(Aweme aweme, int i2, String str) {
        l.d(str, "");
        this.f95085a = aweme;
        this.f95086b = i2;
        this.f95087c = str;
    }
}

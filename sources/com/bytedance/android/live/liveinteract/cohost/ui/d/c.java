package com.bytedance.android.live.liveinteract.cohost.ui.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f10335a;

    static {
        Covode.recordClassIndex(5449);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f10335a, ((c) obj).f10335a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10335a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NoOnlineFriendItem(contentText=" + this.f10335a + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c() {
        /*
            r2 = this;
            r0 = 2131827327(0x7f111a7f, float:1.9287563E38)
            java.lang.String r1 = com.bytedance.android.live.core.f.y.a(r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.ui.d.c.<init>():void");
    }

    private c(String str) {
        l.d(str, "");
        this.f10335a = str;
    }
}

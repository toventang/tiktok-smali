package com.bytedance.android.live.liveinteract.cohost.ui.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10338b;

    static {
        Covode.recordClassIndex(5451);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f10337a, eVar.f10337a) && l.a(this.f10338b, eVar.f10338b);
    }

    public final int hashCode() {
        String str = this.f10337a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10338b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SuggestionItem(suggestContent=" + this.f10337a + ", clickableContent=" + this.f10338b + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e() {
        /*
            r3 = this;
            r0 = 2131827301(0x7f111a65, float:1.928751E38)
            java.lang.String r2 = com.bytedance.android.live.core.f.y.a(r0)
            java.lang.String r1 = ""
            h.f.b.l.b(r2, r1)
            r0 = 2131827302(0x7f111a66, float:1.9287513E38)
            java.lang.String r0 = com.bytedance.android.live.core.f.y.a(r0)
            h.f.b.l.b(r0, r1)
            r3.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.ui.d.e.<init>():void");
    }

    private e(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f10337a = str;
        this.f10338b = str2;
    }
}

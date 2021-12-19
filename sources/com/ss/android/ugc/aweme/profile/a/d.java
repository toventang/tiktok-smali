package com.ss.android.ugc.aweme.profile.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class d implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f115833c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f115834a;

    /* renamed from: b  reason: collision with root package name */
    public final String f115835b;

    static {
        Covode.recordClassIndex(74717);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f115834a == dVar.f115834a && l.a(this.f115835b, dVar.f115835b);
    }

    public final int hashCode() {
        int i2 = this.f115834a * 31;
        String str = this.f115835b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ClickGuideCardEvent(clickCardName=" + this.f115834a + ", content=" + this.f115835b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74718);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d(int i2, String str) {
        l.d(str, "");
        this.f115834a = i2;
        this.f115835b = str;
    }
}

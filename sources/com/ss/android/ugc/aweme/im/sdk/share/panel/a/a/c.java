package com.ss.android.ugc.aweme.im.sdk.share.panel.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f103400d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f103401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f103402b;

    /* renamed from: c  reason: collision with root package name */
    public final int f103403c;

    static {
        Covode.recordClassIndex(66262);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f103401a, cVar.f103401a) && this.f103402b == cVar.f103402b && this.f103403c == cVar.f103403c;
    }

    public final int hashCode() {
        String str = this.f103401a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f103402b) * 31) + this.f103403c;
    }

    public final String toString() {
        return "ShareLimitTipModel(userName=" + this.f103401a + ", limitType=" + this.f103402b + ", shareType=" + this.f103403c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66263);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ c(String str, int i2) {
        this(str, i2, 1);
    }

    public c(String str, int i2, int i3) {
        l.d(str, "");
        this.f103401a = str;
        this.f103402b = i2;
        this.f103403c = i3;
    }
}

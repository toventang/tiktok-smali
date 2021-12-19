package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f74883a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f74884b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f74885a = "";

        /* renamed from: b  reason: collision with root package name */
        public boolean f74886b = true;

        static {
            Covode.recordClassIndex(46168);
        }
    }

    static {
        Covode.recordClassIndex(46167);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f74883a, eVar.f74883a) && this.f74884b == eVar.f74884b;
    }

    public final int hashCode() {
        String str = this.f74883a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f74884b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "AdHalfWebPageHideParams(clickFrom=" + this.f74883a + ", needLog=" + this.f74884b + ")";
    }

    private e(String str, boolean z) {
        this.f74883a = str;
        this.f74884b = z;
    }

    public /* synthetic */ e(String str, boolean z, byte b2) {
        this(str, z);
    }
}

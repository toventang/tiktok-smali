package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.favorites.api.d;
import h.f.b.l;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f91003c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final d f91004a;

    /* renamed from: b  reason: collision with root package name */
    public final int f91005b;

    static {
        Covode.recordClassIndex(57226);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f91004a, bVar.f91004a) && this.f91005b == bVar.f91005b;
    }

    public final int hashCode() {
        d dVar = this.f91004a;
        return ((dVar != null ? dVar.hashCode() : 0) * 31) + this.f91005b;
    }

    public final String toString() {
        return "CollectionDetailWithType(detail=" + this.f91004a + ", type=" + this.f91005b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57227);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(d dVar, int i2) {
        l.d(dVar, "");
        this.f91004a = dVar;
        this.f91005b = i2;
    }
}

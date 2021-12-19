package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86787c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f86788a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f86789b;

    static {
        Covode.recordClassIndex(54362);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f86788a, iVar.f86788a) && this.f86789b == iVar.f86789b;
    }

    public final int hashCode() {
        Object obj = this.f86788a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        boolean z = this.f86789b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "TrackTag(data=" + this.f86788a + ", isTrack=" + this.f86789b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54363);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private i(Object obj) {
        l.d(obj, "");
        this.f86788a = obj;
        this.f86789b = false;
    }

    public /* synthetic */ i(Object obj, byte b2) {
        this(obj);
    }
}

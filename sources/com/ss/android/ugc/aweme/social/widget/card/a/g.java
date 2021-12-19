package com.ss.android.ugc.aweme.social.widget.card.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f133741e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<f, a> f133742a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f133743b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f133744c;

    /* renamed from: d  reason: collision with root package name */
    public final int f133745d;

    static {
        Covode.recordClassIndex(87493);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f133742a, gVar.f133742a) && this.f133743b == gVar.f133743b && this.f133744c == gVar.f133744c && this.f133745d == gVar.f133745d;
    }

    public final int hashCode() {
        Map<f, a> map = this.f133742a;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        boolean z = this.f133743b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f133744c) {
            i2 = 0;
        }
        return ((i6 + i2) * 31) + this.f133745d;
    }

    public final String toString() {
        return "PermissionConfig(types=" + this.f133742a + ", shouldRequestData=" + this.f133743b + ", shouldInsertUser=" + this.f133744c + ", groupIndex=" + this.f133745d + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87494);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ g(Map map) {
        this(map, false, false, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.social.widget.card.a.f, ? extends com.ss.android.ugc.aweme.social.widget.card.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Map<f, ? extends a> map, boolean z, boolean z2, int i2) {
        l.d(map, "");
        this.f133742a = map;
        this.f133743b = z;
        this.f133744c = z2;
        this.f133745d = i2;
    }
}

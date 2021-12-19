package com.ss.android.ugc.gamora.editor.lightening.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f146117d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f146118a;

    /* renamed from: b  reason: collision with root package name */
    public final V f146119b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f146120c;

    static {
        Covode.recordClassIndex(96023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f146118a, gVar.f146118a) && l.a(this.f146119b, gVar.f146119b) && l.a(this.f146120c, gVar.f146120c);
    }

    public final int hashCode() {
        h hVar = this.f146118a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        V v = this.f146119b;
        int hashCode2 = (hashCode + (v != null ? v.hashCode() : 0)) * 31;
        Throwable th = this.f146120c;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LoadEvent(state=" + this.f146118a + ", data=" + ((Object) this.f146119b) + ", exception=" + this.f146120c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96024);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private g(h hVar, V v, Throwable th) {
        l.d(hVar, "");
        this.f146118a = hVar;
        this.f146119b = v;
        this.f146120c = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Object obj, Throwable th, int i2) {
        this(hVar, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? null : th);
    }
}

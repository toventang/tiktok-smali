package com.bytedance.ies.im.core.api.j;

import com.bytedance.common.wschannel.b.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f33994d = new b(c.CONNECTION_UNKNOWN, null);

    /* renamed from: e  reason: collision with root package name */
    public static final a f33995e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f33996a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33997b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33998c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f33996a, bVar.f33996a) && l.a(this.f33997b, bVar.f33997b) && l.a(this.f33998c, bVar.f33998c);
    }

    public final int hashCode() {
        c cVar = this.f33996a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f33997b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33998c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "WsStateInfo(state=" + this.f33996a + ", url=" + this.f33997b + ", sessionId=" + this.f33998c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20235);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(20234);
    }

    public b(c cVar, String str) {
        l.d(cVar, "");
        this.f33996a = cVar;
        this.f33997b = str;
    }
}

package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a.m;

public final class f extends m {

    /* renamed from: a  reason: collision with root package name */
    public final m.b f49324a;

    /* renamed from: b  reason: collision with root package name */
    public final a f49325b;

    static {
        Covode.recordClassIndex(30863);
    }

    public static final class a extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private m.b f49326a;

        /* renamed from: b  reason: collision with root package name */
        private a f49327b;

        static {
            Covode.recordClassIndex(30864);
        }

        @Override // com.google.android.datatransport.cct.a.m.a
        public final m a() {
            return new f(this.f49326a, this.f49327b);
        }

        @Override // com.google.android.datatransport.cct.a.m.a
        public final m.a a(a aVar) {
            this.f49327b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.m.a
        public final m.a a(m.b bVar) {
            this.f49326a = bVar;
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        m.b bVar = this.f49324a;
        int i2 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i3 = (hashCode ^ 1000003) * 1000003;
        a aVar = this.f49325b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f49324a + ", androidClientInfo=" + this.f49325b + "}";
    }

    public final boolean equals(Object obj) {
        m.b bVar;
        a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m) || ((bVar = this.f49324a) != null ? !bVar.equals(((f) obj).f49324a) : ((f) obj).f49324a != null) || ((aVar = this.f49325b) != null ? !aVar.equals(((f) obj).f49325b) : ((f) obj).f49325b != null)) {
            return false;
        }
        return true;
    }

    /* synthetic */ f(m.b bVar, a aVar) {
        this.f49324a = bVar;
        this.f49325b = aVar;
    }
}

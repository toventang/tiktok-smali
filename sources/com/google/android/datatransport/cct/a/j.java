package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a.t;

public final class j extends t {

    /* renamed from: a  reason: collision with root package name */
    public final t.c f49357a;

    /* renamed from: b  reason: collision with root package name */
    public final t.b f49358b;

    static {
        Covode.recordClassIndex(30870);
    }

    public static final class a extends t.a {

        /* renamed from: a  reason: collision with root package name */
        private t.c f49359a;

        /* renamed from: b  reason: collision with root package name */
        private t.b f49360b;

        static {
            Covode.recordClassIndex(30871);
        }

        @Override // com.google.android.datatransport.cct.a.t.a
        public final t a() {
            return new j(this.f49359a, this.f49360b);
        }

        @Override // com.google.android.datatransport.cct.a.t.a
        public final t.a a(t.b bVar) {
            this.f49360b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.t.a
        public final t.a a(t.c cVar) {
            this.f49359a = cVar;
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        t.c cVar = this.f49357a;
        int i2 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i3 = (hashCode ^ 1000003) * 1000003;
        t.b bVar = this.f49358b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f49357a + ", mobileSubtype=" + this.f49358b + "}";
    }

    public final boolean equals(Object obj) {
        t.c cVar;
        t.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t) || ((cVar = this.f49357a) != null ? !cVar.equals(((j) obj).f49357a) : ((j) obj).f49357a != null) || ((bVar = this.f49358b) != null ? !bVar.equals(((j) obj).f49358b) : ((j) obj).f49358b != null)) {
            return false;
        }
        return true;
    }

    /* synthetic */ j(t.c cVar, t.b bVar) {
        this.f49357a = cVar;
        this.f49358b = bVar;
    }
}

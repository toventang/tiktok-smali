package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.c;
import com.google.android.datatransport.e;
import com.google.android.datatransport.runtime.j;
import java.util.Objects;

final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private final k f49390a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49391b;

    /* renamed from: c  reason: collision with root package name */
    private final c<?> f49392c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f49393d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.datatransport.b f49394e;

    static {
        Covode.recordClassIndex(30904);
    }

    static final class a extends j.a {

        /* renamed from: a  reason: collision with root package name */
        private k f49395a;

        /* renamed from: b  reason: collision with root package name */
        private String f49396b;

        /* renamed from: c  reason: collision with root package name */
        private c<?> f49397c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f49398d;

        /* renamed from: e  reason: collision with root package name */
        private com.google.android.datatransport.b f49399e;

        static {
            Covode.recordClassIndex(30905);
        }

        a() {
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j a() {
            String str = "";
            if (this.f49395a == null) {
                str = str + " transportContext";
            }
            if (this.f49396b == null) {
                str = str + " transportName";
            }
            if (this.f49397c == null) {
                str = str + " event";
            }
            if (this.f49398d == null) {
                str = str + " transformer";
            }
            if (this.f49399e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f49395a, this.f49396b, this.f49397c, this.f49398d, this.f49399e, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a a(com.google.android.datatransport.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f49399e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a a(c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f49397c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a a(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f49398d = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a a(k kVar) {
            Objects.requireNonNull(kVar, "Null transportContext");
            this.f49395a = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f49396b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.j
    public final k a() {
        return this.f49390a;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final String b() {
        return this.f49391b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.j
    public final c<?> c() {
        return this.f49392c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.j
    public final e<?, byte[]> d() {
        return this.f49393d;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final com.google.android.datatransport.b e() {
        return this.f49394e;
    }

    public final int hashCode() {
        return ((((((((this.f49390a.hashCode() ^ 1000003) * 1000003) ^ this.f49391b.hashCode()) * 1000003) ^ this.f49392c.hashCode()) * 1000003) ^ this.f49393d.hashCode()) * 1000003) ^ this.f49394e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f49390a + ", transportName=" + this.f49391b + ", event=" + this.f49392c + ", transformer=" + this.f49393d + ", encoding=" + this.f49394e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (!this.f49390a.equals(jVar.a()) || !this.f49391b.equals(jVar.b()) || !this.f49392c.equals(jVar.c()) || !this.f49393d.equals(jVar.d()) || !this.f49394e.equals(jVar.e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private b(k kVar, String str, c<?> cVar, e<?, byte[]> eVar, com.google.android.datatransport.b bVar) {
        this.f49390a = kVar;
        this.f49391b = str;
        this.f49392c = cVar;
        this.f49393d = eVar;
        this.f49394e = bVar;
    }

    /* synthetic */ b(k kVar, String str, c cVar, e eVar, com.google.android.datatransport.b bVar, byte b2) {
        this(kVar, str, cVar, eVar, bVar);
    }
}

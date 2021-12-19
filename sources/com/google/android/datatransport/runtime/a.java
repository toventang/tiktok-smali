package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.h;
import java.util.Map;
import java.util.Objects;

final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f49378a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f49379b;

    /* renamed from: c  reason: collision with root package name */
    private final g f49380c;

    /* renamed from: d  reason: collision with root package name */
    private final long f49381d;

    /* renamed from: e  reason: collision with root package name */
    private final long f49382e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f49383f;

    static {
        Covode.recordClassIndex(30901);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.a$a  reason: collision with other inner class name */
    public static final class C1198a extends h.a {

        /* renamed from: a  reason: collision with root package name */
        Map<String, String> f49384a;

        /* renamed from: b  reason: collision with root package name */
        private String f49385b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f49386c;

        /* renamed from: d  reason: collision with root package name */
        private g f49387d;

        /* renamed from: e  reason: collision with root package name */
        private Long f49388e;

        /* renamed from: f  reason: collision with root package name */
        private Long f49389f;

        static {
            Covode.recordClassIndex(30902);
        }

        C1198a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.h.a
        public final Map<String, String> a() {
            Map<String, String> map = this.f49384a;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h b() {
            String str = "";
            if (this.f49385b == null) {
                str = str + " transportName";
            }
            if (this.f49387d == null) {
                str = str + " encodedPayload";
            }
            if (this.f49388e == null) {
                str = str + " eventMillis";
            }
            if (this.f49389f == null) {
                str = str + " uptimeMillis";
            }
            if (this.f49384a == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f49385b, this.f49386c, this.f49387d, this.f49388e.longValue(), this.f49389f.longValue(), this.f49384a, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a a(Integer num) {
            this.f49386c = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a a(long j2) {
            this.f49388e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a b(long j2) {
            this.f49389f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a a(g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f49387d = gVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f49385b = str;
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.h.a
        public final h.a a(Map<String, String> map) {
            this.f49384a = map;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.h
    public final String a() {
        return this.f49378a;
    }

    @Override // com.google.android.datatransport.runtime.h
    public final Integer b() {
        return this.f49379b;
    }

    @Override // com.google.android.datatransport.runtime.h
    public final g c() {
        return this.f49380c;
    }

    @Override // com.google.android.datatransport.runtime.h
    public final long d() {
        return this.f49381d;
    }

    @Override // com.google.android.datatransport.runtime.h
    public final long e() {
        return this.f49382e;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.datatransport.runtime.h
    public final Map<String, String> f() {
        return this.f49383f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f49378a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f49379b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.f49381d;
        long j3 = this.f49382e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f49380c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f49383f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f49378a + ", code=" + this.f49379b + ", encodedPayload=" + this.f49380c + ", eventMillis=" + this.f49381d + ", uptimeMillis=" + this.f49382e + ", autoMetadata=" + this.f49383f + "}";
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!this.f49378a.equals(hVar.a()) || ((num = this.f49379b) != null ? !num.equals(hVar.b()) : hVar.b() != null) || !this.f49380c.equals(hVar.c()) || this.f49381d != hVar.d() || this.f49382e != hVar.e() || !this.f49383f.equals(hVar.f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private a(String str, Integer num, g gVar, long j2, long j3, Map<String, String> map) {
        this.f49378a = str;
        this.f49379b = num;
        this.f49380c = gVar;
        this.f49381d = j2;
        this.f49382e = j3;
        this.f49383f = map;
    }

    /* synthetic */ a(String str, Integer num, g gVar, long j2, long j3, Map map, byte b2) {
        this(str, num, gVar, j2, j3, map);
    }
}

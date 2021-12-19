package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a.o;
import java.util.Arrays;

public final class g extends o {

    /* renamed from: a  reason: collision with root package name */
    final long f49328a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49329b;

    /* renamed from: c  reason: collision with root package name */
    final long f49330c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f49331d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49332e;

    /* renamed from: f  reason: collision with root package name */
    final long f49333f;

    /* renamed from: g  reason: collision with root package name */
    public final t f49334g;

    static {
        Covode.recordClassIndex(30865);
    }

    @Override // com.google.android.datatransport.cct.a.o
    public final long a() {
        return this.f49328a;
    }

    @Override // com.google.android.datatransport.cct.a.o
    public final long b() {
        return this.f49330c;
    }

    @Override // com.google.android.datatransport.cct.a.o
    public final long c() {
        return this.f49333f;
    }

    public final int hashCode() {
        int hashCode;
        long j2 = this.f49328a;
        long j3 = this.f49330c;
        int hashCode2 = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f49329b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f49331d)) * 1000003;
        String str = this.f49332e;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j4 = this.f49333f;
        int i3 = (((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        t tVar = this.f49334g;
        if (tVar != null) {
            i2 = tVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f49328a + ", eventCode=" + this.f49329b + ", eventUptimeMs=" + this.f49330c + ", sourceExtension=" + Arrays.toString(this.f49331d) + ", sourceExtensionJsonProto3=" + this.f49332e + ", timezoneOffsetSeconds=" + this.f49333f + ", networkConnectionInfo=" + this.f49334g + "}";
    }

    public static final class a extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f49335a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f49336b;

        /* renamed from: c  reason: collision with root package name */
        private Long f49337c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f49338d;

        /* renamed from: e  reason: collision with root package name */
        private String f49339e;

        /* renamed from: f  reason: collision with root package name */
        private Long f49340f;

        /* renamed from: g  reason: collision with root package name */
        private t f49341g;

        static {
            Covode.recordClassIndex(30866);
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o a() {
            String str = "";
            if (this.f49335a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f49336b == null) {
                str = str + " eventCode";
            }
            if (this.f49337c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f49340f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new g(this.f49335a.longValue(), this.f49336b.intValue(), this.f49337c.longValue(), this.f49338d, this.f49339e, this.f49340f.longValue(), this.f49341g);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a a(t tVar) {
            this.f49341g = tVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a a(int i2) {
            this.f49336b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a b(long j2) {
            this.f49337c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a c(long j2) {
            this.f49340f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a a(long j2) {
            this.f49335a = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a a(String str) {
            this.f49339e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.a.o.a
        public final o.a a(byte[] bArr) {
            this.f49338d = bArr;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f49328a == oVar.a()) {
                g gVar = (g) oVar;
                if (this.f49329b != gVar.f49329b || this.f49330c != oVar.b() || !Arrays.equals(this.f49331d, gVar.f49331d) || ((str = this.f49332e) != null ? !str.equals(gVar.f49332e) : gVar.f49332e != null) || this.f49333f != oVar.c() || ((tVar = this.f49334g) != null ? !tVar.equals(gVar.f49334g) : gVar.f49334g != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* synthetic */ g(long j2, int i2, long j3, byte[] bArr, String str, long j4, t tVar) {
        this.f49328a = j2;
        this.f49329b = i2;
        this.f49330c = j3;
        this.f49331d = bArr;
        this.f49332e = str;
        this.f49333f = j4;
        this.f49334g = tVar;
    }
}

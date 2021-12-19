package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a.a;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final int f49307a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49308b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49309c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49310d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49311e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49312f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49313g;

    /* renamed from: h  reason: collision with root package name */
    public final String f49314h;

    static {
        Covode.recordClassIndex(30860);
    }

    public static final class a extends a.AbstractC1197a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f49315a;

        /* renamed from: b  reason: collision with root package name */
        private String f49316b;

        /* renamed from: c  reason: collision with root package name */
        private String f49317c;

        /* renamed from: d  reason: collision with root package name */
        private String f49318d;

        /* renamed from: e  reason: collision with root package name */
        private String f49319e;

        /* renamed from: f  reason: collision with root package name */
        private String f49320f;

        /* renamed from: g  reason: collision with root package name */
        private String f49321g;

        /* renamed from: h  reason: collision with root package name */
        private String f49322h;

        static {
            Covode.recordClassIndex(30861);
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a a() {
            String str = "";
            if (this.f49315a == null) {
                str = str + " sdkVersion";
            }
            if (str.isEmpty()) {
                return new d(this.f49315a.intValue(), this.f49316b, this.f49317c, this.f49318d, this.f49319e, this.f49320f, this.f49321g, this.f49322h);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a a(String str) {
            this.f49316b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a b(String str) {
            this.f49317c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a c(String str) {
            this.f49318d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a d(String str) {
            this.f49319e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a e(String str) {
            this.f49320f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a f(String str) {
            this.f49321g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a g(String str) {
            this.f49322h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC1197a
        public final a.AbstractC1197a a(int i2) {
            this.f49315a = Integer.valueOf(i2);
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i2 = (this.f49307a ^ 1000003) * 1000003;
        String str = this.f49308b;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 ^ hashCode) * 1000003;
        String str2 = this.f49309c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        String str3 = this.f49310d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 ^ hashCode3) * 1000003;
        String str4 = this.f49311e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 ^ hashCode4) * 1000003;
        String str5 = this.f49312f;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i8 = (i7 ^ hashCode5) * 1000003;
        String str6 = this.f49313g;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i9 = (i8 ^ hashCode6) * 1000003;
        String str7 = this.f49314h;
        if (str7 != null) {
            i3 = str7.hashCode();
        }
        return i9 ^ i3;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f49307a + ", model=" + this.f49308b + ", hardware=" + this.f49309c + ", device=" + this.f49310d + ", product=" + this.f49311e + ", osBuild=" + this.f49312f + ", manufacturer=" + this.f49313g + ", fingerprint=" + this.f49314h + "}";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            d dVar = (d) ((a) obj);
            if (this.f49307a != dVar.f49307a || ((str = this.f49308b) != null ? !str.equals(dVar.f49308b) : dVar.f49308b != null) || ((str2 = this.f49309c) != null ? !str2.equals(dVar.f49309c) : dVar.f49309c != null) || ((str3 = this.f49310d) != null ? !str3.equals(dVar.f49310d) : dVar.f49310d != null) || ((str4 = this.f49311e) != null ? !str4.equals(dVar.f49311e) : dVar.f49311e != null) || ((str5 = this.f49312f) != null ? !str5.equals(dVar.f49312f) : dVar.f49312f != null) || ((str6 = this.f49313g) != null ? !str6.equals(dVar.f49313g) : dVar.f49313g != null) || ((str7 = this.f49314h) != null ? !str7.equals(dVar.f49314h) : dVar.f49314h != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* synthetic */ d(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f49307a = i2;
        this.f49308b = str;
        this.f49309c = str2;
        this.f49310d = str3;
        this.f49311e = str4;
        this.f49312f = str5;
        this.f49313g = str6;
        this.f49314h = str7;
    }
}

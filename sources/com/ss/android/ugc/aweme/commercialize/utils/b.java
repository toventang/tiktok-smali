package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f75623a;

    /* renamed from: b  reason: collision with root package name */
    public final String f75624b;

    /* renamed from: c  reason: collision with root package name */
    public final String f75625c;

    /* renamed from: d  reason: collision with root package name */
    public final String f75626d;

    /* renamed from: e  reason: collision with root package name */
    public final String f75627e;

    /* renamed from: f  reason: collision with root package name */
    public final String f75628f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f75629g;

    /* renamed from: h  reason: collision with root package name */
    public final String f75630h;

    /* renamed from: i  reason: collision with root package name */
    public final long f75631i;

    static {
        Covode.recordClassIndex(46650);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f75623a, bVar.f75623a) && l.a(this.f75624b, bVar.f75624b) && l.a(this.f75625c, bVar.f75625c) && l.a(this.f75626d, bVar.f75626d) && l.a(this.f75627e, bVar.f75627e) && l.a(this.f75628f, bVar.f75628f) && this.f75629g == bVar.f75629g && l.a(this.f75630h, bVar.f75630h) && this.f75631i == bVar.f75631i;
    }

    public final int hashCode() {
        Aweme aweme = this.f75623a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f75624b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f75625c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f75626d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f75627e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f75628f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f75629g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str6 = this.f75630h;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        long j2 = this.f75631i;
        return ((i6 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Aweme f75632a;

        /* renamed from: b  reason: collision with root package name */
        private String f75633b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f75634c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f75635d = "";

        /* renamed from: e  reason: collision with root package name */
        private String f75636e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f75637f = "";

        /* renamed from: g  reason: collision with root package name */
        private boolean f75638g;

        /* renamed from: h  reason: collision with root package name */
        private String f75639h = "";

        /* renamed from: i  reason: collision with root package name */
        private long f75640i;

        static {
            Covode.recordClassIndex(46651);
        }

        public final b a() {
            return new b(this.f75632a, this.f75633b, this.f75634c, this.f75635d, this.f75636e, this.f75637f, this.f75638g, this.f75639h, this.f75640i, (byte) 0);
        }

        public final a a(long j2) {
            this.f75640i = j2;
            return this;
        }

        public final a a(boolean z) {
            this.f75638g = z;
            return this;
        }

        public final a a(Aweme aweme) {
            l.d(aweme, "");
            this.f75632a = aweme;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f75634c = str;
            return this;
        }

        public final a c(String str) {
            l.d(str, "");
            this.f75635d = str;
            return this;
        }

        public final a d(String str) {
            l.d(str, "");
            this.f75636e = str;
            return this;
        }

        public final a e(String str) {
            l.d(str, "");
            this.f75637f = str;
            return this;
        }

        public final a f(String str) {
            l.d(str, "");
            this.f75639h = str;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f75633b = str;
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("label=" + this.f75624b + ", refer=" + this.f75625c);
        if (this.f75626d.length() > 0) {
            sb.append(", showFailReason=" + this.f75626d);
        }
        if (this.f75627e.length() > 0) {
            sb.append(", cardType=" + this.f75627e);
        }
        if (this.f75628f.length() > 0) {
            sb.append(", status=" + this.f75628f);
        }
        if (this.f75623a != null) {
            sb.append(", aweme_id=" + this.f75623a.getAid());
        }
        sb.append(", is_preload=" + this.f75629g);
        if (this.f75630h.length() > 0) {
            sb.append(", anchor_id=" + this.f75629g);
        }
        if (this.f75631i != 0) {
            sb.append(", room_id=" + this.f75629g);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    private b(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j2) {
        this.f75623a = aweme;
        this.f75624b = str;
        this.f75625c = str2;
        this.f75626d = str3;
        this.f75627e = str4;
        this.f75628f = str5;
        this.f75629g = z;
        this.f75630h = str6;
        this.f75631i = j2;
    }

    public /* synthetic */ b(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j2, byte b2) {
        this(aweme, str, str2, str3, str4, str5, z, str6, j2);
    }
}

package com.ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final a f121529g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f121530a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f121531b;

    /* renamed from: c  reason: collision with root package name */
    public final String f121532c;

    /* renamed from: d  reason: collision with root package name */
    public final String f121533d;

    /* renamed from: e  reason: collision with root package name */
    public final long f121534e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f121535f;

    static {
        Covode.recordClassIndex(79160);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f121530a == gVar.f121530a && l.a(this.f121531b, gVar.f121531b) && l.a(this.f121532c, gVar.f121532c) && l.a(this.f121533d, gVar.f121533d) && this.f121534e == gVar.f121534e && l.a(this.f121535f, gVar.f121535f);
    }

    public final String toString() {
        return "SearchUserSugRequest(mentionType=" + this.f121530a + ", awemeID=" + this.f121531b + ", keyword=" + this.f121532c + ", source=" + this.f121533d + ", count=" + this.f121534e + ", uidFilterList=" + this.f121535f + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79161);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        long j2 = this.f121530a;
        int i5 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Long l2 = this.f121531b;
        int i6 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i5 + i2) * 31;
        String str = this.f121532c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f121533d;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        long j3 = this.f121534e;
        int i9 = (((i8 + i4) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        List<String> list = this.f121535f;
        if (list != null) {
            i6 = list.hashCode();
        }
        return i9 + i6;
    }

    public g(long j2, Long l2, String str, String str2, long j3, List<String> list) {
        l.d(str, "");
        l.d(str2, "");
        this.f121530a = j2;
        this.f121531b = l2;
        this.f121532c = str;
        this.f121533d = str2;
        this.f121534e = j3;
        this.f121535f = list;
    }
}

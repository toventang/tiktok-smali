package com.ss.android.ugc.aweme.tools.draft.h;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "event_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f139779a;
    @c(a = "old_db_version")

    /* renamed from: b  reason: collision with root package name */
    public final int f139780b;
    @c(a = "new_db_version")

    /* renamed from: c  reason: collision with root package name */
    public final int f139781c;
    @c(a = "update_version_code")

    /* renamed from: d  reason: collision with root package name */
    public final int f139782d;
    @c(a = "timestamp")

    /* renamed from: e  reason: collision with root package name */
    public final long f139783e;
    @c(a = "utc_time")

    /* renamed from: f  reason: collision with root package name */
    public final String f139784f;

    static {
        Covode.recordClassIndex(91366);
    }

    public a() {
        this(null, 0, 0, 0, 0, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f139779a, aVar.f139779a) && this.f139780b == aVar.f139780b && this.f139781c == aVar.f139781c && this.f139782d == aVar.f139782d && this.f139783e == aVar.f139783e && l.a(this.f139784f, aVar.f139784f);
    }

    public final String toString() {
        return "DBEvent(eventName=" + this.f139779a + ", oldDBVersion=" + this.f139780b + ", newDBVersion=" + this.f139781c + ", versionCode=" + this.f139782d + ", timestamp=" + this.f139783e + ", utcTime=" + this.f139784f + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f139779a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f139783e;
        int i4 = ((((((((i2 * 31) + this.f139780b) * 31) + this.f139781c) * 31) + this.f139782d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f139784f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public a(String str, int i2, int i3, int i4, long j2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f139779a = str;
        this.f139780b = i2;
        this.f139781c = i3;
        this.f139782d = i4;
        this.f139783e = j2;
        this.f139784f = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r9, int r10, int r11, int r12, long r13, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r5 = r13
            r2 = r10
            r3 = r11
            r1 = r9
            r0 = r16 & 1
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r7
        L_0x000b:
            r0 = r16 & 2
            r4 = -1
            if (r0 == 0) goto L_0x0011
            r2 = -1
        L_0x0011:
            r0 = r16 & 4
            if (r0 == 0) goto L_0x0016
            r3 = -1
        L_0x0016:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x002b
        L_0x001a:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0020
            r5 = 0
        L_0x0020:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
        L_0x0029:
            r7 = r15
            goto L_0x0024
        L_0x002b:
            r4 = r12
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.h.a.<init>(java.lang.String, int, int, int, long, java.lang.String, int):void");
    }
}

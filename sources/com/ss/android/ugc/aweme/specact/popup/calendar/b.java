package com.ss.android.ugc.aweme.specact.popup.calendar;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "identifier")

    /* renamed from: a  reason: collision with root package name */
    public final String f134607a;
    @c(a = "repeatFrequency")

    /* renamed from: b  reason: collision with root package name */
    public final String f134608b;
    @c(a = "repeatInterval")

    /* renamed from: c  reason: collision with root package name */
    public final int f134609c;
    @c(a = "repeatCount")

    /* renamed from: d  reason: collision with root package name */
    public final int f134610d;
    @c(a = "startDate")

    /* renamed from: e  reason: collision with root package name */
    public final long f134611e;
    @c(a = "endDate")

    /* renamed from: f  reason: collision with root package name */
    public final long f134612f;
    @c(a = "alarmOffset")

    /* renamed from: g  reason: collision with root package name */
    public final long f134613g;
    @c(a = "allDay")

    /* renamed from: h  reason: collision with root package name */
    public final boolean f134614h;
    @c(a = "title")

    /* renamed from: i  reason: collision with root package name */
    public final String f134615i;
    @c(a = "notes")

    /* renamed from: j  reason: collision with root package name */
    public final String f134616j;
    @c(a = "enterFrom")

    /* renamed from: k  reason: collision with root package name */
    public final String f134617k;

    static {
        Covode.recordClassIndex(87958);
    }

    public b() {
        this(null, null, 0, 0, 0, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f134607a, bVar.f134607a) && l.a(this.f134608b, bVar.f134608b) && this.f134609c == bVar.f134609c && this.f134610d == bVar.f134610d && this.f134611e == bVar.f134611e && this.f134612f == bVar.f134612f && this.f134613g == bVar.f134613g && this.f134614h == bVar.f134614h && l.a(this.f134615i, bVar.f134615i) && l.a(this.f134616j, bVar.f134616j) && l.a(this.f134617k, bVar.f134617k);
    }

    public final String toString() {
        return "CalendarParams(identifier=" + this.f134607a + ", repeatFrequency=" + this.f134608b + ", repeatInterval=" + this.f134609c + ", repeatCount=" + this.f134610d + ", startDate=" + this.f134611e + ", endDate=" + this.f134612f + ", alarmOffset=" + this.f134613g + ", allDay=" + this.f134614h + ", title=" + this.f134615i + ", notes=" + this.f134616j + ", enterFrom=" + this.f134617k + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f134607a;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        String str2 = this.f134608b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f134611e;
        long j3 = this.f134612f;
        long j4 = this.f134613g;
        int i8 = (((((((((((i7 + i3) * 31) + this.f134609c) * 31) + this.f134610d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z = this.f134614h;
        if (z) {
            z = true;
        }
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        String str3 = this.f134615i;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str4 = this.f134616j;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str5 = this.f134617k;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i14 + i6;
    }

    private b(String str, String str2, long j2, long j3, long j4, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f134607a = str;
        this.f134608b = str2;
        this.f134609c = 0;
        this.f134610d = 0;
        this.f134611e = j2;
        this.f134612f = j3;
        this.f134613g = j4;
        this.f134614h = false;
        this.f134615i = str3;
        this.f134616j = str4;
        this.f134617k = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(java.lang.String r14, java.lang.String r15, long r16, long r18, long r20, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            r13 = this;
            r1 = r25
            r11 = r23
            r2 = r14
            r10 = r22
            r3 = r15
            r4 = r16
            r6 = r18
            r0 = r1 & 1
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0013
            r2 = r12
        L_0x0013:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0018
            r3 = r12
        L_0x0018:
            r0 = r1 & 16
            r8 = -1
            if (r0 == 0) goto L_0x0020
            r4 = -1
        L_0x0020:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0026
            r6 = -1
        L_0x0026:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0040
        L_0x002a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002f
            r10 = r12
        L_0x002f:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0034
            r11 = r12
        L_0x0034:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r13
            r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12)
            return
        L_0x003d:
            r12 = r24
            goto L_0x0038
        L_0x0040:
            r8 = r20
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.popup.calendar.b.<init>(java.lang.String, java.lang.String, long, long, long, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}

package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "eventId")

    /* renamed from: a  reason: collision with root package name */
    public String f108636a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public String f108637b;
    @c(a = "note")

    /* renamed from: c  reason: collision with root package name */
    public String f108638c;
    @c(a = "startTime")

    /* renamed from: d  reason: collision with root package name */
    public long f108639d;
    @c(a = "endTime")

    /* renamed from: e  reason: collision with root package name */
    public long f108640e;
    @c(a = "alarmMinutes")

    /* renamed from: f  reason: collision with root package name */
    public Integer f108641f;
    @c(a = "enter_from")

    /* renamed from: g  reason: collision with root package name */
    public String f108642g;
    @c(a = "anchor")

    /* renamed from: h  reason: collision with root package name */
    public a f108643h;

    static {
        Covode.recordClassIndex(69626);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f108636a, bVar.f108636a) && l.a(this.f108637b, bVar.f108637b) && l.a(this.f108638c, bVar.f108638c) && this.f108639d == bVar.f108639d && this.f108640e == bVar.f108640e && l.a(this.f108641f, bVar.f108641f) && l.a(this.f108642g, bVar.f108642g) && l.a(this.f108643h, bVar.f108643h);
    }

    public final String toString() {
        return "CalendarEvent(eventId=" + this.f108636a + ", title=" + this.f108637b + ", note=" + this.f108638c + ", startTime=" + this.f108639d + ", endTime=" + this.f108640e + ", alarmMinutes=" + this.f108641f + ", enterFrom=" + this.f108642g + ", anchor=" + this.f108643h + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f108636a;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str2 = this.f108637b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.f108638c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        long j2 = this.f108639d;
        long j3 = this.f108640e;
        int i10 = (((((i9 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Integer num = this.f108641f;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str4 = this.f108642g;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        a aVar = this.f108643h;
        if (aVar != null) {
            i7 = aVar.hashCode();
        }
        return i12 + i7;
    }
}

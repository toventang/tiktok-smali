package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "calendar_remind_time")

    /* renamed from: a  reason: collision with root package name */
    public long f134415a;
    @com.google.gson.a.c(a = "calendar_title")

    /* renamed from: b  reason: collision with root package name */
    public String f134416b;
    @com.google.gson.a.c(a = "calendar_desc")

    /* renamed from: c  reason: collision with root package name */
    public String f134417c;

    static {
        Covode.recordClassIndex(87877);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f134415a == cVar.f134415a && l.a(this.f134416b, cVar.f134416b) && l.a(this.f134417c, cVar.f134417c);
    }

    public final String toString() {
        return "CalendarInfo(calendarRemindTime=" + this.f134415a + ", calendarTitle=" + this.f134416b + ", calendarDesc=" + this.f134417c + ")";
    }

    public /* synthetic */ c() {
        this("", "");
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f134415a;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f134416b;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i3 + i2) * 31;
        String str2 = this.f134417c;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    private c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f134415a = 0;
        this.f134416b = str;
        this.f134417c = str2;
    }
}

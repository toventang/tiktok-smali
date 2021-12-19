package com.ss.android.ugc.aweme.compliance.protection.common.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "screen_time_management")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f77950a;
    @com.google.gson.a.c(a = "restrict_mode")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f77951b;
    @com.google.gson.a.c(a = "search_restriction")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f77952c;

    static {
        Covode.recordClassIndex(48319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f77950a, cVar.f77950a) && l.a(this.f77951b, cVar.f77951b) && l.a(this.f77952c, cVar.f77952c);
    }

    public final int hashCode() {
        Integer num = this.f77950a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f77951b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f77952c;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GuardianRestrictionBean(screenTimeManagement=" + this.f77950a + ", restrictMode=" + this.f77951b + ", searchRestriction=" + this.f77952c + ")";
    }

    public /* synthetic */ c() {
        this(0, 0, 0);
    }

    public c(Integer num, Integer num2, Integer num3) {
        this.f77950a = num;
        this.f77951b = num2;
        this.f77952c = num3;
    }
}

package com.ss.android.ugc.aweme.compliance.protection.common.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "screen_time_management")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f77942a;
    @c(a = "restrict_mode")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f77943b;

    static {
        Covode.recordClassIndex(48317);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f77942a, aVar.f77942a) && l.a(this.f77943b, aVar.f77943b);
    }

    public final int hashCode() {
        Integer num = this.f77942a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f77943b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DigitalWellbeingBean(screenTimeManagement=" + this.f77942a + ", restrictMode=" + this.f77943b + ")";
    }

    public /* synthetic */ a() {
        this(0, 0);
    }

    private a(Integer num, Integer num2) {
        this.f77942a = num;
        this.f77943b = num2;
    }
}

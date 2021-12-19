package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ac {
    @c(a = "every_day_count")

    /* renamed from: a  reason: collision with root package name */
    public final int f118325a;
    @c(a = "total_count")

    /* renamed from: b  reason: collision with root package name */
    public final int f118326b;

    static {
        Covode.recordClassIndex(76843);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f118325a == acVar.f118325a && this.f118326b == acVar.f118326b;
    }

    public final int hashCode() {
        return (this.f118325a * 31) + this.f118326b;
    }

    public final String toString() {
        return "EditPageLongPressTipsData(everydayCount=" + this.f118325a + ", totalCount=" + this.f118326b + ")";
    }

    private ac() {
        this.f118325a = 1;
        this.f118326b = 5;
    }

    public /* synthetic */ ac(byte b2) {
        this();
    }
}

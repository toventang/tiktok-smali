package com.ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.journey.w;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = "recommend_group")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f104766a;
    @c(a = "interest_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<w> f104767b;
    @c(a = "select_duration")

    /* renamed from: c  reason: collision with root package name */
    public final int f104768c;

    static {
        Covode.recordClassIndex(67170);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f104766a, dVar.f104766a) && l.a(this.f104767b, dVar.f104767b) && this.f104768c == dVar.f104768c;
    }

    public final int hashCode() {
        Integer num = this.f104766a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<w> list = this.f104767b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f104768c;
    }

    public final String toString() {
        return "UpdateInterestList(recommend_group=" + this.f104766a + ", interest_list=" + this.f104767b + ", select_duration=" + this.f104768c + ")";
    }

    public d(Integer num, List<w> list, int i2) {
        l.d(list, "");
        this.f104766a = num;
        this.f104767b = list;
        this.f104768c = i2;
    }
}

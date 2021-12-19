package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class af {
    @c(a = "interest_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<w> f104827a;
    @c(a = "recommend_group")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f104828b;
    @c(a = "special_type")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f104829c;
    @c(a = "select_duration")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f104830d;
    @c(a = "select_interest_type")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f104831e;

    static {
        Covode.recordClassIndex(67231);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return l.a(this.f104827a, afVar.f104827a) && l.a(this.f104828b, afVar.f104828b) && l.a(this.f104829c, afVar.f104829c) && l.a(this.f104830d, afVar.f104830d) && l.a(this.f104831e, afVar.f104831e);
    }

    public final int hashCode() {
        List<w> list = this.f104827a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f104828b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f104829c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f104830d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f104831e;
        if (num4 != null) {
            i2 = num4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "SelectedInterestList(interest_list=" + this.f104827a + ", recommend_group=" + this.f104828b + ", special_type=" + this.f104829c + ", select_duration=" + this.f104830d + ", select_interest_type=" + this.f104831e + ")";
    }

    public /* synthetic */ af(List list, Integer num, Integer num2, Integer num3) {
        this(list, num, num2, num3, 0);
    }

    private af(List<w> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f104827a = list;
        this.f104828b = num;
        this.f104829c = num2;
        this.f104830d = num3;
        this.f104831e = num4;
    }
}

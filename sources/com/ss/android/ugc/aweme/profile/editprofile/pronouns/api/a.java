package com.ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "max_num")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f116174a;
    @c(a = "pronouns_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f116175b;

    static {
        Covode.recordClassIndex(74941);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f116174a, aVar.f116174a) && l.a(this.f116175b, aVar.f116175b);
    }

    public final int hashCode() {
        Integer num = this.f116174a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<String> list = this.f116175b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileEditPronounsParams(maxPronounsNum=" + this.f116174a + ", pronounsList=" + this.f116175b + ")";
    }

    public /* synthetic */ a() {
        this(4, z.INSTANCE);
    }

    private a(Integer num, List<String> list) {
        this.f116174a = num;
        this.f116175b = list;
    }
}

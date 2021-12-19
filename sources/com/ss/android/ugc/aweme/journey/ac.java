package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ac {
    @c(a = "value")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f104816a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final String f104817b;
    @c(a = "subtitle")

    /* renamed from: c  reason: collision with root package name */
    public final String f104818c;

    static {
        Covode.recordClassIndex(67228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f104816a, acVar.f104816a) && l.a(this.f104817b, acVar.f104817b) && l.a(this.f104818c, acVar.f104818c);
    }

    public final int hashCode() {
        Integer num = this.f104816a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f104817b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f104818c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Options(value=" + this.f104816a + ", title=" + this.f104817b + ", subtitle=" + this.f104818c + ")";
    }
}

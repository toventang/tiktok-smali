package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "multiselect")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f104801a;
    @c(a = "options")

    /* renamed from: b  reason: collision with root package name */
    public final List<ac> f104802b;

    static {
        Covode.recordClassIndex(67218);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f104801a, aVar.f104801a) && l.a(this.f104802b, aVar.f104802b);
    }

    public final int hashCode() {
        Boolean bool = this.f104801a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<ac> list = this.f104802b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Choices(multiselect=" + this.f104801a + ", options=" + this.f104802b + ")";
    }
}

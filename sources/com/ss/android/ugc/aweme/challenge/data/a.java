package com.ss.android.ugc.aweme.challenge.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.Objects;

public final class a {
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f69924a;
    @c(a = "is_private")

    /* renamed from: b  reason: collision with root package name */
    public Boolean f69925b;

    static {
        Covode.recordClassIndex(43121);
    }

    public final int hashCode() {
        int i2;
        String str = this.f69924a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return (i2 * 31) + (l.a(this.f69925b, true) ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.data.LocalHashTag");
        a aVar = (a) obj;
        if (!(!l.a((Object) this.f69924a, (Object) aVar.f69924a)) && !(!l.a(this.f69925b, aVar.f69925b))) {
            return true;
        }
        return false;
    }

    public a(String str, Boolean bool) {
        l.d(str, "");
        this.f69924a = str;
        this.f69925b = bool;
    }
}

package com.ss.android.ugc.aweme.choosemusic.model.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f70598a;

    /* renamed from: b  reason: collision with root package name */
    public final String f70599b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f70600c;

    /* renamed from: d  reason: collision with root package name */
    public final int f70601d;

    static {
        Covode.recordClassIndex(43539);
    }

    public final String toString() {
        return "MusicListRequestParam(radioCursor=" + this.f70598a + ", idsArrayJson=" + this.f70599b + ", isCommerceMusic=" + this.f70600c + ", soundPageScene=" + this.f70601d + ")";
    }

    public final int hashCode() {
        int i2;
        int i3 = this.f70598a * 31;
        String str = this.f70599b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return ((i3 + i2) * 31) + (this.f70600c ? 1 : 0);
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.data.MusicListRequestParam");
        e eVar = (e) obj;
        if (this.f70598a == eVar.f70598a && !(!l.a((Object) this.f70599b, (Object) eVar.f70599b)) && this.f70600c == eVar.f70600c && this.f70601d == eVar.f70601d) {
            return true;
        }
        return false;
    }

    public e(int i2, String str, boolean z, int i3) {
        this.f70598a = i2;
        this.f70599b = str;
        this.f70600c = z;
        this.f70601d = i3;
    }
}

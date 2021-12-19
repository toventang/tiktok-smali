package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.playerkit.model.f;
import h.f.b.l;

public final class d {
    @c(a = "libra_key")

    /* renamed from: a  reason: collision with root package name */
    public String f143282a = null;
    @c(a = "key")

    /* renamed from: b  reason: collision with root package name */
    public int f143283b = 0;
    @c(a = StringSet.type)

    /* renamed from: c  reason: collision with root package name */
    public int f143284c = 0;
    @c(a = "scene")

    /* renamed from: d  reason: collision with root package name */
    public int f143285d = 0;

    static {
        Covode.recordClassIndex(93781);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f143282a, dVar.f143282a) && this.f143283b == dVar.f143283b && this.f143284c == dVar.f143284c && this.f143285d == dVar.f143285d;
    }

    public final int hashCode() {
        String str = this.f143282a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.f143283b) * 31) + this.f143284c) * 31) + this.f143285d;
    }

    public final String toString() {
        return "DynamicOptionModel(libraKey=" + this.f143282a + ", key=" + this.f143283b + ", type=" + this.f143284c + ", scene=" + this.f143285d + ")";
    }

    private d() {
    }

    public final f a() {
        f fVar = new f();
        fVar.f148722a = this.f143283b;
        fVar.f148724c = this.f143284c;
        fVar.f148725d = this.f143285d;
        return fVar;
    }
}

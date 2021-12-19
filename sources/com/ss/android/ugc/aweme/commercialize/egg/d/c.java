package com.ss.android.ugc.aweme.commercialize.egg.d;

import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f73960a;

    static {
        Covode.recordClassIndex(45554);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f73960a, ((c) obj).f73960a);
        }
        return true;
    }

    public final int hashCode() {
        e eVar = this.f73960a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CommerceEggPreloadResource(lottieComposition=" + this.f73960a + ")";
    }

    public c(e eVar) {
        this.f73960a = eVar;
    }
}

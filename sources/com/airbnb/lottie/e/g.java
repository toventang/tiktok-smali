package com.airbnb.lottie.e;

import androidx.c.e;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f5527a = new g();

    /* renamed from: b  reason: collision with root package name */
    public final e<String, com.airbnb.lottie.e> f5528b;

    static {
        Covode.recordClassIndex(2301);
    }

    g() {
        if (!d.a.f5625a) {
            this.f5528b = new e<>(10485760);
        } else if (d.a.f5630f) {
            this.f5528b = new e<>(8);
        } else {
            this.f5528b = new e<>(20);
        }
    }

    public final com.airbnb.lottie.e a(String str) {
        if (str == null) {
            return null;
        }
        return this.f5528b.a(str);
    }

    public final void a(String str, com.airbnb.lottie.e eVar) {
        if (str != null) {
            this.f5528b.a(str, eVar);
        }
    }
}

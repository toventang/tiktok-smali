package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.a;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.c;
import com.airbnb.lottie.e.a.f;
import com.airbnb.lottie.e.a.h;
import com.airbnb.lottie.i.g;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(2357);
    }

    static f b(JsonReader jsonReader, e eVar) {
        return new f(a(jsonReader, g.a(), eVar, v.f5674a));
    }

    static h c(JsonReader jsonReader, e eVar) {
        return new h(a(jsonReader, g.a(), eVar, aa.f5663a));
    }

    static a d(JsonReader jsonReader, e eVar) {
        return new a(a(jsonReader, eVar, f.f5664a));
    }

    static com.airbnb.lottie.e.a.d a(JsonReader jsonReader, e eVar) {
        return new com.airbnb.lottie.e.a.d(a(jsonReader, eVar, m.f5668a));
    }

    static c a(JsonReader jsonReader, e eVar, int i2) {
        return new c(a(jsonReader, eVar, new j(i2)));
    }

    public static b a(JsonReader jsonReader, e eVar, boolean z) {
        float f2;
        if (z) {
            f2 = g.a();
        } else {
            f2 = 1.0f;
        }
        return new b(a(jsonReader, f2, eVar, i.f5666a));
    }

    static <T> List<com.airbnb.lottie.j.a<T>> a(JsonReader jsonReader, e eVar, af<T> afVar) {
        return p.a(jsonReader, eVar, 1.0f, afVar);
    }

    private static <T> List<com.airbnb.lottie.j.a<T>> a(JsonReader jsonReader, float f2, e eVar, af<T> afVar) {
        return p.a(jsonReader, eVar, f2, afVar);
    }
}

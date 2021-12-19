package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.a;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.c;
import com.bytedance.lottie.c.a.f;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(24951);
    }

    static f b(JsonReader jsonReader, g gVar) {
        return new f(a(jsonReader, h.a(), gVar, v.f40682a));
    }

    static com.bytedance.lottie.c.a.h c(JsonReader jsonReader, g gVar) {
        return new com.bytedance.lottie.c.a.h(a(jsonReader, h.a(), gVar, aa.f40672a));
    }

    static a d(JsonReader jsonReader, g gVar) {
        return new a(a(jsonReader, gVar, f.f40673a));
    }

    static com.bytedance.lottie.c.a.d a(JsonReader jsonReader, g gVar) {
        return new com.bytedance.lottie.c.a.d(a(jsonReader, gVar, m.f40677a));
    }

    static c a(JsonReader jsonReader, g gVar, int i2) {
        return new c(a(jsonReader, gVar, new j(i2)));
    }

    public static b a(JsonReader jsonReader, g gVar, boolean z) {
        float f2;
        if (z) {
            f2 = h.a();
        } else {
            f2 = 1.0f;
        }
        return new b(a(jsonReader, f2, gVar, i.f40675a));
    }

    static <T> List<com.bytedance.lottie.g.a<T>> a(JsonReader jsonReader, g gVar, af<T> afVar) {
        return p.a(jsonReader, gVar, 1.0f, afVar);
    }

    private static <T> List<com.bytedance.lottie.g.a<T>> a(JsonReader jsonReader, float f2, g gVar, af<T> afVar) {
        return p.a(jsonReader, gVar, f2, afVar);
    }
}

package com.bytedance.android.live.network;

import com.bytedance.android.e.a.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class k extends e.a {
    static {
        Covode.recordClassIndex(6642);
    }

    k() {
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (type != d.b.class) {
            return null;
        }
        return l.f12130a;
    }
}

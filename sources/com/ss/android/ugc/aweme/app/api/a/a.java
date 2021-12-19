package com.ss.android.ugc.aweme.app.api.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class a extends e.a {
    static {
        Covode.recordClassIndex(40934);
    }

    @Override // com.bytedance.retrofit2.e.a
    public final e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        return new b(type, annotationArr, qVar, qVar.f42568c, this);
    }
}

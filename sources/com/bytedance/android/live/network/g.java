package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

final /* synthetic */ class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final f f12113a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f12114b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f12115c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12116d;

    /* renamed from: e  reason: collision with root package name */
    private final Type f12117e;

    /* renamed from: f  reason: collision with root package name */
    private final Annotation[] f12118f;

    /* renamed from: g  reason: collision with root package name */
    private final q f12119g;

    static {
        Covode.recordClassIndex(6631);
    }

    g(f fVar, Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, q qVar) {
        this.f12113a = fVar;
        this.f12114b = cls;
        this.f12115c = clsArr;
        this.f12116d = str;
        this.f12117e = type;
        this.f12118f = annotationArr;
        this.f12119g = qVar;
    }

    @Override // com.bytedance.retrofit2.e
    public final Object a(Object obj) {
        return this.f12113a.a(this.f12114b, this.f12115c, this.f12116d, this.f12117e, this.f12118f, this.f12119g, (TypedInput) obj);
    }
}

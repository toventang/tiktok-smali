package com.bytedance.android.live.network;

import com.bytedance.android.live.network.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.q;
import h.a.n;
import h.f.b.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class j extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12128a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final c.a f12129b;

    static {
        Covode.recordClassIndex(6640);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public j(c.a aVar) {
        l.d(aVar, "");
        this.f12129b = aVar;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        Annotation[] annotationArr2;
        a.EnumC0254a a2;
        if (annotationArr == null) {
            annotationArr2 = new Annotation[0];
        } else {
            annotationArr2 = annotationArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotationArr2) {
            if (annotation instanceof com.bytedance.android.live.network.a.a) {
                arrayList.add(annotation);
            }
        }
        com.bytedance.android.live.network.a.a aVar = (com.bytedance.android.live.network.a.a) n.h((List) arrayList);
        if (aVar == null || (a2 = aVar.a()) == null) {
            return this.f12129b.a(type, annotationArr, qVar);
        }
        c<?> a3 = this.f12129b.a(type, annotationArr, qVar);
        if (a3 != null) {
            return new m(a3, a2);
        }
        return null;
    }
}

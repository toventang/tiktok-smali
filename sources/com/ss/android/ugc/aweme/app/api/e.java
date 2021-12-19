package com.ss.android.ugc.aweme.app.api;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import com.bytedance.retrofit2.w;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.ep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    m f66607a = new m();

    static {
        Covode.recordClassIndex(40951);
    }

    static class a implements c<i> {

        /* renamed from: a  reason: collision with root package name */
        private final c<i<u>> f66608a;

        static {
            Covode.recordClassIndex(40952);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66608a.a();
        }

        a(c<i<u>> cVar) {
            this.f66608a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ i a(b bVar) {
            return this.f66608a.a(bVar).a(new g<u, R>() {
                /* class com.ss.android.ugc.aweme.app.api.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40953);
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [R, T] */
                @Override // b.g
                public final R then(i<u> iVar) {
                    com.bytedance.retrofit2.client.c cVar;
                    if (iVar.b()) {
                        throw new CancellationException();
                    } else if (!iVar.c()) {
                        u d2 = iVar.d();
                        T t = iVar.d().f42630b;
                        if (t instanceof BaseResponse) {
                            T t2 = t;
                            if (d2.f42629a != null) {
                                ep.a(t2.status_code, d2.f42629a.f42473a, t2.toString());
                            }
                        }
                        if ((t instanceof g) && (cVar = d2.f42629a) != null) {
                            Object obj = cVar.f42478f;
                            if (obj instanceof com.bytedance.frameworks.baselib.network.http.a) {
                                t.setRequestInfo((com.bytedance.frameworks.baselib.network.http.a) obj);
                            }
                        }
                        if (t instanceof d) {
                            t.setRequestId(a.a(d2.f42629a.f42476d));
                        }
                        return t;
                    } else {
                        throw iVar.e();
                    }
                }
            });
        }

        static String a(List<com.bytedance.retrofit2.client.b> list) {
            if (list == null) {
                return null;
            }
            for (com.bytedance.retrofit2.client.b bVar : list) {
                if ("X-TT-LOGID".equalsIgnoreCase(bVar.f42471a)) {
                    return bVar.f42472b;
                }
            }
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (w.a(type) != i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = w.a(0, (ParameterizedType) type);
            Class<?> a3 = w.a(a2);
            if (d.class.isAssignableFrom(a3)) {
                c<?> a4 = this.f66607a.a(com.google.gson.internal.b.a((Type) null, i.class, com.google.gson.internal.b.a((Type) null, u.class, a2)), annotationArr, qVar);
                if (a4 != null) {
                    return new a(a4);
                }
            }
            if (a3 != u.class) {
                return this.f66607a.a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is " + type.getTypeName());
    }
}

package com.ss.android.ugc.aweme.app.api;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.w;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import com.ss.android.ugc.aweme.utils.dv;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;

public final class b extends c.a {
    static {
        Covode.recordClassIndex(40937);
    }

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        c<?> f66590a;

        static {
            Covode.recordClassIndex(40938);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66590a.a();
        }

        a(c<?> cVar) {
            this.f66590a = cVar;
        }

        @Override // com.bytedance.retrofit2.c
        public final Object a(final com.bytedance.retrofit2.b bVar) {
            return ((i) this.f66590a.a(bVar)).a((g) new g() {
                /* class com.ss.android.ugc.aweme.app.api.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40939);
                }

                @Override // b.g
                public final Object then(i iVar) {
                    if (iVar.c()) {
                        Exception e2 = iVar.e();
                        dv.a(e2, bVar.request().getUrl(), "");
                        if (e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                            bVar.request().getUrl();
                        }
                        throw e2;
                    } else if (!iVar.b()) {
                        return iVar.d();
                    } else {
                        throw new CancellationException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$b  reason: collision with other inner class name */
    static class C1493b implements c {

        /* renamed from: a  reason: collision with root package name */
        c<?> f66593a;

        static {
            Covode.recordClassIndex(40940);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66593a.a();
        }

        C1493b(c<?> cVar) {
            this.f66593a = cVar;
        }

        @Override // com.bytedance.retrofit2.c
        public final Object a(final com.bytedance.retrofit2.b bVar) {
            q qVar = (q) this.f66593a.a(bVar);
            l.a(qVar, new k() {
                /* class com.ss.android.ugc.aweme.app.api.b.C1493b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40941);
                }

                @Override // com.google.c.h.a.k
                public final void onSuccess(Object obj) {
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    dv.a(th, bVar.request().getUrl(), "");
                    if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        bVar.request().getUrl();
                    }
                }
            }, u.a.INSTANCE);
            return qVar;
        }
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, com.bytedance.retrofit2.q qVar) {
        Class<?> a2 = w.a(type);
        if (a2 != q.class && a2 != i.class) {
            return null;
        }
        c<?> a3 = qVar.a(this, type, annotationArr);
        if (a2 == q.class) {
            return new C1493b(a3);
        }
        if (a2 == i.class) {
            return new a(a3);
        }
        throw new AssertionError();
    }
}

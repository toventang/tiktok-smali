package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.u;
import com.bytedance.retrofit2.w;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.ep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

public final class f extends c.a {

    /* renamed from: a  reason: collision with root package name */
    n f66610a = new n();

    static {
        Covode.recordClassIndex(40954);
    }

    static class a implements c<q> {

        /* renamed from: a  reason: collision with root package name */
        private final c<q<u>> f66611a;

        static {
            Covode.recordClassIndex(40955);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66611a.a();
        }

        a(c<q<u>> cVar) {
            this.f66611a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ q a(b bVar) {
            return new com.google.c.h.a.b<R>(this.f66611a.a(bVar)) {
                /* class com.ss.android.ugc.aweme.app.api.f.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ q f66612a;

                static {
                    Covode.recordClassIndex(40956);
                }

                {
                    this.f66612a = r4;
                    l.a(r4, new k<u>() {
                        /* class com.ss.android.ugc.aweme.app.api.f.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(40957);
                        }

                        @Override // com.google.c.h.a.k
                        public final void onFailure(Throwable th) {
                            AnonymousClass1.this.a(th);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.c.h.a.k
                        public final /* synthetic */ void onSuccess(u uVar) {
                            com.bytedance.retrofit2.client.c cVar;
                            String str;
                            u uVar2 = uVar;
                            if (uVar2.f42629a.a()) {
                                T t = uVar2.f42630b;
                                if (t instanceof d) {
                                    T t2 = t;
                                    List<com.bytedance.retrofit2.client.b> list = uVar2.f42629a.f42476d;
                                    if (list != null) {
                                        Iterator<com.bytedance.retrofit2.client.b> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            com.bytedance.retrofit2.client.b next = it.next();
                                            if ("X-TT-LOGID".equalsIgnoreCase(next.f42471a)) {
                                                str = next.f42472b;
                                                break;
                                            }
                                        }
                                    }
                                    str = null;
                                    t2.setRequestId(str);
                                }
                                if ((t instanceof g) && (cVar = uVar2.f42629a) != null) {
                                    Object obj = cVar.f42478f;
                                    if (obj instanceof com.bytedance.frameworks.baselib.network.http.a) {
                                        t.setRequestInfo((com.bytedance.frameworks.baselib.network.http.a) obj);
                                    }
                                }
                                if (t instanceof BaseResponse) {
                                    T t3 = t;
                                    if (uVar2.f42629a != null) {
                                        ep.a(t3.status_code, uVar2.f42629a.f42473a, t3.toString());
                                    }
                                }
                                AnonymousClass1.this.b((Object) t);
                                return;
                            }
                            AnonymousClass1.this.a((Throwable) new RuntimeException("HttpException"));
                        }
                    }, u.a.INSTANCE);
                }
            };
        }
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, com.bytedance.retrofit2.q qVar) {
        if (w.a(type) != q.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = w.a(0, (ParameterizedType) type);
            Class<?> a3 = w.a(a2);
            if (d.class.isAssignableFrom(a3) || g.class.isAssignableFrom(a3)) {
                c<?> a4 = this.f66610a.a(com.google.gson.internal.b.a((Type) null, q.class, com.google.gson.internal.b.a((Type) null, com.bytedance.retrofit2.u.class, a2)), annotationArr, qVar);
                if (a4 != null) {
                    return new a(a4);
                }
            }
            if (a3 != com.bytedance.retrofit2.u.class) {
                return this.f66610a.a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}

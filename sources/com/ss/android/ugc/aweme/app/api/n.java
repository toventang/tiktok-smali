package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.bytedance.retrofit2.w;
import com.google.c.h.a.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class n extends c.a {
    static {
        Covode.recordClassIndex(40972);
    }

    static final class a implements c<q> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f66636a;

        static {
            Covode.recordClassIndex(40973);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66636a;
        }

        a(Type type) {
            this.f66636a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ q a(com.bytedance.retrofit2.b bVar) {
            return new com.google.c.h.a.b<R>(bVar) {
                /* class com.ss.android.ugc.aweme.app.api.n.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.retrofit2.b f66637a;

                static {
                    Covode.recordClassIndex(40974);
                }

                @Override // com.google.c.h.a.b
                public final void c() {
                    this.f66637a.cancel();
                }

                {
                    this.f66637a = r3;
                    r3.enqueue(new d<R>() {
                        /* class com.ss.android.ugc.aweme.app.api.n.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(40975);
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<R> bVar, Throwable th) {
                            AnonymousClass1.this.a(th);
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<R> bVar, u<R> uVar) {
                            if (uVar.f42629a.a()) {
                                AnonymousClass1.this.b((Object) uVar.f42630b);
                            } else {
                                AnonymousClass1.this.a((Throwable) new RuntimeException("HttpException"));
                            }
                        }
                    });
                }
            };
        }
    }

    static final class b implements c<q<u>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f66640a;

        static {
            Covode.recordClassIndex(40976);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66640a;
        }

        b(Type type) {
            this.f66640a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ q<u> a(com.bytedance.retrofit2.b bVar) {
            return new com.google.c.h.a.b<u>(bVar) {
                /* class com.ss.android.ugc.aweme.app.api.n.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.retrofit2.b f66641a;

                static {
                    Covode.recordClassIndex(40977);
                }

                @Override // com.google.c.h.a.b
                public final void c() {
                    this.f66641a.cancel();
                }

                {
                    this.f66641a = r3;
                    r3.enqueue(new d<R>() {
                        /* class com.ss.android.ugc.aweme.app.api.n.b.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(40978);
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<R> bVar, u<R> uVar) {
                            AnonymousClass1.this.b(uVar);
                        }

                        @Override // com.bytedance.retrofit2.d
                        public final void a(com.bytedance.retrofit2.b<R> bVar, Throwable th) {
                            AnonymousClass1.this.a(th);
                        }
                    });
                }
            };
        }
    }

    n() {
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, com.bytedance.retrofit2.q qVar) {
        if (w.a(type) != q.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = w.a(0, (ParameterizedType) type);
            if (w.a(a2) != u.class) {
                return new a(a2);
            }
            if (a2 instanceof ParameterizedType) {
                return new b(w.a(0, (ParameterizedType) a2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}

package com.ss.android.ugc.aweme.app.api;

import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import com.bytedance.retrofit2.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class m extends c.a {
    static {
        Covode.recordClassIndex(40967);
    }

    static final class a implements c<i> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f66630a;

        static {
            Covode.recordClassIndex(40968);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66630a;
        }

        a(Type type) {
            this.f66630a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ i a(com.bytedance.retrofit2.b bVar) {
            final j jVar = new j();
            bVar.enqueue(new d<R>() {
                /* class com.ss.android.ugc.aweme.app.api.m.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40969);
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(com.bytedance.retrofit2.b<R> bVar, u<R> uVar) {
                    if (uVar.f42629a.a()) {
                        jVar.b((Object) uVar.f42630b);
                    } else {
                        jVar.b((Exception) new RuntimeException("HttpException"));
                    }
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(com.bytedance.retrofit2.b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f4869a;
        }
    }

    static final class b implements c<i<u>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f66633a;

        static {
            Covode.recordClassIndex(40970);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66633a;
        }

        b(Type type) {
            this.f66633a = type;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ i<u> a(com.bytedance.retrofit2.b bVar) {
            final j jVar = new j();
            bVar.enqueue(new d<R>() {
                /* class com.ss.android.ugc.aweme.app.api.m.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40971);
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(com.bytedance.retrofit2.b<R> bVar, u<R> uVar) {
                    if (uVar.f42629a.a()) {
                        jVar.b(uVar);
                    } else {
                        jVar.b((Exception) new RuntimeException("HttpException"));
                    }
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(com.bytedance.retrofit2.b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f4869a;
        }
    }

    m() {
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (w.a(type) != i.class) {
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
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}

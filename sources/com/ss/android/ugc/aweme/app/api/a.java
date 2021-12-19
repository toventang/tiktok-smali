package com.ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.k;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlinx.coroutines.av;
import kotlinx.coroutines.w;
import kotlinx.coroutines.y;

public final class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f66579a = new b((byte) 0);

    static {
        Covode.recordClassIndex(40929);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.a$a  reason: collision with other inner class name */
    static final class C1491a implements c<av<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f66580a;

        static {
            Covode.recordClassIndex(40930);
        }

        @Override // com.bytedance.retrofit2.c
        public final Type a() {
            return this.f66580a;
        }

        /* renamed from: com.ss.android.ugc.aweme.app.api.a$a$b */
        public static final class b implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w f66581a;

            static {
                Covode.recordClassIndex(40932);
            }

            b(w wVar) {
                this.f66581a = wVar;
            }

            @Override // com.bytedance.retrofit2.d
            public final void a(com.bytedance.retrofit2.b<R> bVar, Throwable th) {
                l.d(bVar, "");
                l.d(th, "");
                this.f66581a.a(th);
            }

            @Override // com.bytedance.retrofit2.d
            public final void a(com.bytedance.retrofit2.b<R> bVar, u<R> uVar) {
                l.d(bVar, "");
                l.d(uVar, "");
                if (uVar.f42629a.a()) {
                    w wVar = this.f66581a;
                    T t = uVar.f42630b;
                    if (t == null) {
                        l.b();
                    }
                    wVar.a((Object) t);
                    return;
                }
                this.f66581a.a((Throwable) new k(uVar));
            }
        }

        public C1491a(Type type) {
            l.d(type, "");
            this.f66580a = type;
        }

        /* renamed from: com.ss.android.ugc.aweme.app.api.a$a$a  reason: collision with other inner class name */
        static final class C1492a extends m implements h.f.a.b<Throwable, z> {
            final /* synthetic */ com.bytedance.retrofit2.b $call;
            final /* synthetic */ w $deferred;

            static {
                Covode.recordClassIndex(40931);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1492a(w wVar, com.bytedance.retrofit2.b bVar) {
                super(1);
                this.$deferred = wVar;
                this.$call = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Throwable th) {
                com.bytedance.retrofit2.b bVar;
                if (this.$deferred.l() && (bVar = this.$call) != null) {
                    bVar.cancel();
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.retrofit2.c
        public final /* synthetic */ av<? extends Object> a(com.bytedance.retrofit2.b bVar) {
            w a2 = y.a();
            a2.a((h.f.a.b<? super Throwable, z>) new C1492a(a2, bVar));
            if (bVar != null) {
                bVar.enqueue(new b(a2));
            }
            return a2;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(40933);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private a() {
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<?> a(Type type, Annotation[] annotationArr, q qVar) {
        l.d(type, "");
        l.d(annotationArr, "");
        l.d(qVar, "");
        if (!l.a(av.class, com.bytedance.retrofit2.w.a(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = com.bytedance.retrofit2.w.a(0, (ParameterizedType) type);
            l.b(a2, "");
            return new C1491a(a2);
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }
}

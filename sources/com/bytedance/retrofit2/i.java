package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class i extends c.a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f42509a;

    static {
        Covode.recordClassIndex(26034);
    }

    static final class a<T> implements b<T>, l {

        /* renamed from: a  reason: collision with root package name */
        final Executor f42512a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f42513b;

        static {
            Covode.recordClassIndex(26036);
        }

        @Override // com.bytedance.retrofit2.b
        public final void cancel() {
            this.f42513b.cancel();
        }

        @Override // com.bytedance.retrofit2.b
        public final u execute() {
            return this.f42513b.execute();
        }

        @Override // com.bytedance.retrofit2.b
        public final boolean isCanceled() {
            return this.f42513b.isCanceled();
        }

        @Override // com.bytedance.retrofit2.b
        public final Request request() {
            return this.f42513b.request();
        }

        @Override // com.bytedance.retrofit2.b, java.lang.Object
        public final b<T> clone() {
            return new a(this.f42512a, this.f42513b.clone());
        }

        @Override // com.bytedance.retrofit2.l
        public final void doCollect() {
            b<T> bVar = this.f42513b;
            if (bVar instanceof l) {
                ((l) bVar).doCollect();
            }
        }

        @Override // com.bytedance.retrofit2.b
        public final void enqueue(final d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f42513b.enqueue(new j<T>() {
                /* class com.bytedance.retrofit2.i.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26037);
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(b<T> bVar, final u<T> uVar) {
                    a.this.f42512a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.i.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(26038);
                        }

                        public final void run() {
                            if (a.this.f42513b.isCanceled()) {
                                dVar.a(a.this, new IOException("Canceled"));
                            } else {
                                dVar.a(a.this, uVar);
                            }
                        }
                    });
                }

                @Override // com.bytedance.retrofit2.j
                public final void b(b<T> bVar, u<T> uVar) {
                    d dVar = dVar;
                    if (dVar instanceof j) {
                        ((j) dVar).b(bVar, uVar);
                    }
                }

                @Override // com.bytedance.retrofit2.d
                public final void a(b<T> bVar, final Throwable th) {
                    a.this.f42512a.execute(new Runnable() {
                        /* class com.bytedance.retrofit2.i.a.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(26039);
                        }

                        public final void run() {
                            dVar.a(a.this, th);
                        }
                    });
                }
            });
        }

        a(Executor executor, b<T> bVar) {
            this.f42512a = executor;
            this.f42513b = bVar;
        }
    }

    i(Executor executor) {
        this.f42509a = executor;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final c<b<?>> a(Type type, Annotation[] annotationArr, q qVar) {
        if (w.a(type) != b.class) {
            return null;
        }
        final Type e2 = w.e(type);
        return new c<b<?>>() {
            /* class com.bytedance.retrofit2.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26035);
            }

            @Override // com.bytedance.retrofit2.c
            public final Type a() {
                return e2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.retrofit2.c
            public final /* synthetic */ b<?> a(b bVar) {
                return new a(i.this.f42509a, bVar);
            }
        };
    }
}

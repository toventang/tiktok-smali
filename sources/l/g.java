package l;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import l.c;
import okhttp3.Request;

/* access modifiers changed from: package-private */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f159240a;

    static {
        Covode.recordClassIndex(105764);
    }

    static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final Executor f159243a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f159244b;

        static {
            Covode.recordClassIndex(105766);
        }

        @Override // l.b
        public final l<T> a() {
            return this.f159244b.a();
        }

        @Override // l.b
        public final boolean b() {
            return this.f159244b.b();
        }

        @Override // l.b
        public final Request d() {
            return this.f159244b.d();
        }

        @Override // l.b
        /* renamed from: c */
        public final b<T> clone() {
            return new a(this.f159243a, this.f159244b.c());
        }

        @Override // l.b
        public final void a(final d<T> dVar) {
            o.a(dVar, "callback == null");
            this.f159244b.a(new d<T>() {
                /* class l.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(105767);
                }

                @Override // l.d
                public final void a(b<T> bVar, final Throwable th) {
                    a.this.f159243a.execute(new Runnable() {
                        /* class l.g.a.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(105769);
                        }

                        public final void run() {
                            dVar.a(a.this, th);
                        }
                    });
                }

                @Override // l.d
                public final void a(b<T> bVar, final l<T> lVar) {
                    a.this.f159243a.execute(new Runnable() {
                        /* class l.g.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(105768);
                        }

                        public final void run() {
                            if (a.this.f159244b.b()) {
                                dVar.a(a.this, new IOException("Canceled"));
                            } else {
                                dVar.a(a.this, lVar);
                            }
                        }
                    });
                }
            });
        }

        a(Executor executor, b<T> bVar) {
            this.f159243a = executor;
            this.f159244b = bVar;
        }
    }

    g(Executor executor) {
        this.f159240a = executor;
    }

    @Override // l.c.a
    public final c<?, ?> a(Type type) {
        if (o.a(type) != b.class) {
            return null;
        }
        final Type e2 = o.e(type);
        return new c<Object, b<?>>() {
            /* class l.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(105765);
            }

            @Override // l.c
            public final Type a() {
                return e2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [l.b] */
            @Override // l.c
            public final /* synthetic */ b<?> a(b<Object> bVar) {
                return new a(g.this.f159240a, bVar);
            }
        };
    }
}

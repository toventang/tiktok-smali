package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.bytedance.jedi.a.h.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.tools.b.a.d;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;

public abstract class b<RESP, V> extends e<V> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<d> f149277a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<String> f149278b;

    protected interface a<RESPONSE> {
        static {
            Covode.recordClassIndex(98307);
        }

        void a(ExceptionResult exceptionResult);

        void a(RESPONSE response);
    }

    static {
        Covode.recordClassIndex(98306);
    }

    /* access modifiers changed from: protected */
    public abstract void a(h.f.a.a<? extends d> aVar, h.f.a.a<String> aVar2, a<RESP> aVar3);

    /* access modifiers changed from: protected */
    public abstract V d(RESP resp);

    @Override // com.bytedance.jedi.a.h.a
    public final t<V> b() {
        t a2 = t.a(new c(this));
        l.b(a2, "");
        t<V> d2 = a2.d(new C4032b(this));
        l.b(d2, "");
        return d2;
    }

    static final class c<T> implements w<f<? extends RESP>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149280a;

        static {
            Covode.recordClassIndex(98309);
        }

        c(b bVar) {
            this.f149280a = bVar;
        }

        public static final class a implements a<RESP> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f149281a;

            static {
                Covode.recordClassIndex(98310);
            }

            a(v vVar) {
                this.f149281a = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.tools.h.b.b.b.a
            public final void a(RESP resp) {
                this.f149281a.a(g.a(resp));
                this.f149281a.a();
            }

            @Override // com.ss.android.ugc.tools.h.b.b.b.a
            public final void a(ExceptionResult exceptionResult) {
                Exception exc;
                String str;
                Exception exception;
                if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                    exception.printStackTrace();
                }
                v vVar = this.f149281a;
                if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
                    StringBuilder sb = new StringBuilder("Failed on fetch from effect platform, msg : ");
                    Integer num = null;
                    if (exceptionResult != null) {
                        str = exceptionResult.getMsg();
                    } else {
                        str = null;
                    }
                    StringBuilder append = sb.append(str).append(", code : ");
                    if (exceptionResult != null) {
                        num = Integer.valueOf(exceptionResult.getErrorCode());
                    }
                    exc = new RuntimeException(append.append(num).append('.').toString());
                }
                vVar.b(exc);
                this.f149281a.a();
            }
        }

        @Override // f.a.w
        public final void subscribe(v<f<RESP>> vVar) {
            l.d(vVar, "");
            a aVar = new a(vVar);
            b bVar = this.f149280a;
            bVar.a(bVar.f149277a, this.f149280a.f149278b, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.b$b  reason: collision with other inner class name */
    static final class C4032b<T, R> implements f.a.d.g<f<? extends RESP>, V> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149279a;

        static {
            Covode.recordClassIndex(98308);
        }

        C4032b(b bVar) {
            this.f149279a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.tools.h.b.b.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            f fVar = (f) obj;
            l.d(fVar, "");
            return this.f149279a.d(fVar.a());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(h.f.a.a<? extends d> aVar, h.f.a.a<String> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149277a = aVar;
        this.f149278b = aVar2;
    }
}

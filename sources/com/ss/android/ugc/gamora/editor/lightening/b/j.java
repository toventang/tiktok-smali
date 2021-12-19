package com.ss.android.ugc.gamora.editor.lightening.b;

import android.content.Context;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import f.a.w;
import h.a.n;
import h.v;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f146124g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    VideoPublishEditModel f146125a;

    /* renamed from: b  reason: collision with root package name */
    Context f146126b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.c, z> f146127c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f146128d;

    /* renamed from: e  reason: collision with root package name */
    public final t<g<i>> f146129e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public f.a.b.b f146130f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f146131h;

    static {
        Covode.recordClassIndex(96027);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96028);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f146138a = new e();

        static {
            Covode.recordClassIndex(96034);
        }

        e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new RuntimeException("download file failed");
        }
    }

    static final class k implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146144a;

        static {
            Covode.recordClassIndex(96040);
        }

        k(j jVar) {
            this.f146144a = jVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f146144a.a(false);
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f146134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f146135b;

        static {
            Covode.recordClassIndex(96030);
        }

        c(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            this.f146134a = cVar;
            this.f146135b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return v.a(this.f146134a, this.f146135b);
        }
    }

    public final synchronized boolean a() {
        boolean z;
        MethodCollector.i(3133);
        z = this.f146131h;
        MethodCollector.o(3133);
        return z;
    }

    public final synchronized void a(boolean z) {
        MethodCollector.i(3514);
        this.f146131h = z;
        MethodCollector.o(3514);
    }

    public static final class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f146132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f146133b;

        static {
            Covode.recordClassIndex(96029);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f146132a.invoke(str);
        }

        b(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f146132a = bVar;
            this.f146133b = bVar2;
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(Integer num, String str) {
            h.f.a.b bVar = this.f146133b;
            if (str == null) {
                str = "";
            }
            bVar.invoke(str);
        }
    }

    static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f146140a = new g();

        static {
            Covode.recordClassIndex(96036);
        }

        g() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            Object h2 = n.h(list);
            if (h2 != null) {
                return h2;
            }
            throw new RuntimeException("load music result is empty");
        }
    }

    static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final i f146142a = new i();

        static {
            Covode.recordClassIndex(96038);
        }

        i() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.p pVar = (h.p) obj;
            h.f.b.l.d(pVar, "");
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) pVar.getFirst();
            cVar.path = (String) pVar.getSecond();
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$j  reason: collision with other inner class name */
    static final class C3901j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146143a;

        static {
            Covode.recordClassIndex(96039);
        }

        C3901j(j jVar) {
            this.f146143a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f146143a.f146130f = (f.a.b.b) obj;
            this.f146143a.a(true);
            this.f146143a.f146129e.setValue(new g<>(h.LOADING, null, null, 6));
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146146a;

        static {
            Covode.recordClassIndex(96042);
        }

        m(j jVar) {
            this.f146146a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            t<g<i>> tVar = this.f146146a.f146129e;
            h.f.b.l.b(th, "");
            h.f.b.l.d(th, "");
            tVar.setValue(new g<>(h.FAIL, null, th, 2));
        }
    }

    static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f146137b;

        static {
            Covode.recordClassIndex(96031);
        }

        d(j jVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f146136a = jVar;
            this.f146137b = cVar;
        }

        @Override // f.a.w
        public final void subscribe(final f.a.v<h.p<com.ss.android.ugc.aweme.shortvideo.c, String>> vVar) {
            h.f.b.l.d(vVar, "");
            j jVar = this.f146136a;
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f146137b;
            AnonymousClass1 r5 = new h.f.a.b<String, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.lightening.b.j.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(96032);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(String str) {
                    h.f.b.l.d(str, "");
                    vVar.a(v.a(this.this$0.f146137b, str));
                    vVar.a();
                    return z.f158842a;
                }
            };
            AnonymousClass2 r4 = new h.f.a.b<String, z>() {
                /* class com.ss.android.ugc.gamora.editor.lightening.b.j.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(96033);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(String str) {
                    String str2 = str;
                    h.f.b.l.d(str2, "");
                    f.a.v vVar = vVar;
                    h.f.b.l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.b(new RuntimeException(str2));
                    }
                    return z.f158842a;
                }
            };
            if (jVar.f146126b == null) {
                r4.invoke("not init");
                return;
            }
            p s = com.ss.android.ugc.aweme.port.in.g.a().s();
            Context context = jVar.f146126b;
            if (context == null) {
                h.f.b.l.b();
            }
            s.a(context, cVar, 6, new b(r5, r4));
        }
    }

    static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146139a = new f();

        static {
            Covode.recordClassIndex(96035);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List<T> list = (List) obj;
            h.f.b.l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                com.ss.android.ugc.aweme.shortvideo.c b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b((MusicModel) t);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        }
    }

    static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146141a;

        static {
            Covode.recordClassIndex(96037);
        }

        h(j jVar) {
            this.f146141a = jVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) obj;
            h.f.b.l.d(cVar, "");
            j jVar = this.f146141a;
            String b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(cVar);
            if (com.ss.android.ugc.tools.utils.i.a(b2) && new File(b2).length() > 0) {
                f.a.t c2 = f.a.t.c(new c(cVar, b2));
                h.f.b.l.b(c2, "");
                return c2;
            } else if (cVar != null) {
                f.a.t a2 = f.a.t.a(new d(jVar, cVar));
                h.f.b.l.b(a2, "");
                return a2;
            } else {
                f.a.t b3 = f.a.t.b((Callable<? extends Throwable>) e.f146138a);
                h.f.b.l.b(b3, "");
                return b3;
            }
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f146145a;

        static {
            Covode.recordClassIndex(96041);
        }

        l(j jVar) {
            this.f146145a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) obj;
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
            if (cVar2 == null || (str = cVar2.getMusicId()) == null) {
                str = "";
            }
            h.f.b.l.b(str, "");
            boolean z = !h.m.p.a((CharSequence) str);
            t<g<i>> tVar = this.f146145a.f146129e;
            h.f.b.l.b(cVar, "");
            tVar.setValue(new g<>(h.SUCCESS, new i(cVar, z), null, 4));
            if (!z) {
                this.f146145a.f146128d = cVar;
                cr.a().a(cVar);
                h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.c, z> bVar = this.f146145a.f146127c;
                if (bVar != null) {
                    bVar.invoke(cVar);
                }
            }
        }
    }
}

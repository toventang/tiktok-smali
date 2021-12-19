package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.a.b;
import com.bytedance.ies.powerpreload.b.j;
import com.bytedance.ies.powerpreload.c;
import com.bytedance.ies.powerpreload.d.a;
import com.bytedance.ies.powerpreload.task.f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.net.preload.a;
import com.ss.android.ugc.aweme.network.a.f;
import f.a.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class InitPowerPreloadTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107794a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69007);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69008);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends AbsOpenResultCallback {
        static {
            Covode.recordClassIndex(69009);
        }

        b() {
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onOpen(Intent intent) {
            com.bytedance.ies.powerpreload.d.a a2;
            super.onOpen(intent);
            if (intent != null) {
                intent.putExtra("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
                if (f.a()) {
                    T t = null;
                    if (c.a.a() && (a2 = a.C0777a.a()) != null) {
                        l.c(intent, "");
                        com.bytedance.ies.powerpreload.d.b bVar = a2.f34525a;
                        l.c(intent, "");
                        l.c(intent, "");
                        Uri data = intent.getData();
                        ComponentName component = intent.getComponent();
                        String className = component != null ? component.getClassName() : null;
                        if ((data != null && data.isOpaque()) || !c.a.a()) {
                            return;
                        }
                        if (data != null) {
                            if (className != null) {
                                String uri = data.toString();
                                l.a((Object) uri, "");
                                l.c(uri, "");
                                Uri parse = Uri.parse(uri);
                                String a3 = l.a(parse.getAuthority(), (Object) parse.getPath());
                                for (T t2 : com.bytedance.ies.powerpreload.e.f34529a) {
                                    Iterator<T> it = t2.f34520e.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Uri parse2 = Uri.parse(it.next());
                                            if (l.a((Object) a3, (Object) l.a(parse2.getAuthority(), (Object) parse2.getPath()))) {
                                                List<String> list = t2.f34519d;
                                                List<String> list2 = t2.f34520e;
                                                String str = t2.f34521f;
                                                String str2 = t2.f34522g;
                                                l.c(list, "");
                                                l.c(list2, "");
                                                com.bytedance.ies.powerpreload.d dVar = new com.bytedance.ies.powerpreload.d(list, list2, str, str2);
                                                if (l.a((Object) dVar.f34521f, (Object) className)) {
                                                    try {
                                                        com.bytedance.ies.powerpreload.a.a(intent);
                                                        com.bytedance.ies.powerpreload.b bVar2 = bVar.f34528a;
                                                        if (bVar2 == null) {
                                                            l.a("preloadProxy");
                                                        }
                                                        bVar2.a(dVar, com.bytedance.ies.powerpreload.d.b.a(intent));
                                                        return;
                                                    } catch (Exception e2) {
                                                        com.bytedance.ies.powerpreload.a.a.a(e2);
                                                        return;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (className != null) {
                            l.c(className, "");
                            Iterator<T> it2 = com.bytedance.ies.powerpreload.e.f34529a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                T next = it2.next();
                                if (l.a((Object) next.f34521f, (Object) className)) {
                                    t = next;
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                try {
                                    com.bytedance.ies.powerpreload.a.a(intent);
                                    com.bytedance.ies.powerpreload.b bVar3 = bVar.f34528a;
                                    if (bVar3 == null) {
                                        l.a("preloadProxy");
                                    }
                                    bVar3.a(t3, com.bytedance.ies.powerpreload.d.b.a(intent));
                                } catch (Exception e3) {
                                    com.bytedance.ies.powerpreload.a.a.a(e3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final class d implements com.bytedance.ies.powerpreload.task.d<ab<?>> {

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.a f107796a;

            static {
                Covode.recordClassIndex(69012);
            }

            a(f.a aVar) {
                this.f107796a = aVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.a f107797a;

            static {
                Covode.recordClassIndex(69013);
            }

            b(f.a aVar) {
                this.f107797a = aVar;
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(69011);
        }

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.powerpreload.task.f$a] */
        @Override // com.bytedance.ies.powerpreload.task.d
        public final /* synthetic */ void a(ab<?> abVar, f.a aVar) {
            ab<?> abVar2 = abVar;
            l.d(abVar2, "");
            abVar2.a(f.a.k.a.a(g.a())).c(new a(aVar)).b((f.a.d.f<? super Object>) new b(aVar)).c();
        }
    }

    public static final class e implements com.bytedance.ies.powerpreload.task.d<Future<?>> {
        static {
            Covode.recordClassIndex(69014);
        }

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.powerpreload.task.f$a] */
        @Override // com.bytedance.ies.powerpreload.task.d
        public final /* synthetic */ void a(Future<?> future, f.a aVar) {
            Future<?> future2 = future;
            l.d(future2, "");
            future2.get();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final com.ss.android.ugc.aweme.lego.ab k() {
        return com.ss.android.ugc.aweme.lego.ab.DEFAULT;
    }

    static final class c extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107795a = new c();

        static {
            Covode.recordClassIndex(69010);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService a2 = g.a();
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
        l.b(a2, "");
        b.a aVar = new b.a(a2);
        c cVar = c.f107795a;
        l.c(cVar, "");
        aVar.f34487c = cVar;
        IRetrofitFactory a3 = RetrofitFactory.a();
        l.b(a3, "");
        l.c(a3, "");
        aVar.f34486b.f34502a = a3;
        aVar.f34485a = false;
        b.a a4 = aVar.a(ab.class, new d()).a(Future.class, new e());
        if (a4.f34487c == null) {
            a4.f34487c = b.a.C0771a.f34490a;
        }
        Application application = a4.f34489e;
        boolean z = a4.f34485a;
        j jVar = a4.f34486b;
        h.f.a.a<? extends ExecutorService> aVar2 = a4.f34487c;
        if (aVar2 == null) {
            l.a();
        }
        com.bytedance.ies.powerpreload.a.b bVar = new com.bytedance.ies.powerpreload.a.b(application, z, jVar, aVar2, a4.f34488d, (byte) 0);
        l.c(bVar, "");
        com.bytedance.ies.powerpreload.c cVar2 = (com.bytedance.ies.powerpreload.c) new com.bytedance.ies.powerpreload.f(new c.a.C0773a(bVar)).a(bVar);
        l.c(cVar2, "");
        com.bytedance.ies.powerpreload.c.f34504a = cVar2;
        bVar.f34483d.invoke().execute(c.a.b.f34513a);
        if (com.bytedance.ies.powerpreload.c.f34504a == null) {
            l.a("instance");
        }
        com.ss.android.ugc.aweme.net.preload.a.f112496b = new a.C2873a();
        RouteManager.getInstance().addGlobalResultCallback(new b());
    }
}

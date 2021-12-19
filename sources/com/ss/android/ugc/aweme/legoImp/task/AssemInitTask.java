package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.feed.experiment.y;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.z;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

public final class AssemInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<String> f107730a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArraySet<b> f107731b = new CopyOnWriteArraySet<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f107732c = 10;

    /* renamed from: d  reason: collision with root package name */
    public static final h f107733d = i.a((h.f.a.a) d.f107741a);

    /* renamed from: e  reason: collision with root package name */
    public static final c f107734e = new c((byte) 0);

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

        /* renamed from: a  reason: collision with root package name */
        public static final a f107735a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h f107736b = i.a((h.f.a.a) C2770a.f107737a);

        public static ExecutorService a() {
            return (ExecutorService) f107736b.getValue();
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssemInitTask$a$a  reason: collision with other inner class name */
        static final class C2770a extends m implements h.f.a.a<ExecutorService> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2770a f107737a = new C2770a();

            static {
                Covode.recordClassIndex(68927);
            }

            C2770a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ExecutorService invoke() {
                l.a a2 = l.a(o.SERIAL);
                a2.f79173b = "assem-serial-t";
                return g.a(a2.a());
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final b f107738a = new b();

            static {
                Covode.recordClassIndex(68928);
            }

            b() {
            }

            public final void run() {
                try {
                    if (com.ss.android.ugc.aweme.performance.i.a()) {
                        Process.setThreadPriority(-20);
                    } else {
                        Process.setThreadPriority(-10);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        static {
            Covode.recordClassIndex(68926);
        }
    }

    public static final class c {
        static {
            Covode.recordClassIndex(68930);
        }

        private c() {
        }

        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f107740a;

            static {
                Covode.recordClassIndex(68931);
            }

            public a(String str) {
                this.f107740a = str;
            }

            public final void run() {
                for (T t : AssemInitTask.f107731b) {
                    if (h.f.b.l.a((Object) t.f107739a, (Object) this.f107740a)) {
                        if (t != null && AssemInitTask.f107732c > 0) {
                            r.a("feed_refactor_exception_log", new com.ss.android.ugc.aweme.app.f.d().a("log", AssemInitTask.f107730a.toString()).f66730a);
                            AssemInitTask.f107732c--;
                            return;
                        }
                        return;
                    }
                }
            }
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class e implements k {
        static {
            Covode.recordClassIndex(68933);
        }

        e() {
        }

        @Override // com.bytedance.assem.arch.extensions.k
        public final void a(String str, Exception exc) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(exc, "");
            com.ss.android.ugc.aweme.framework.a.a.a(str, exc);
        }

        @Override // com.bytedance.assem.arch.extensions.k
        public final void a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.aweme.framework.a.a.a(4, str, str2);
            try {
                if (AssemInitTask.f107730a.size() <= 100) {
                    AssemInitTask.f107730a.add("Assem tag: " + str + ", msg: " + str2);
                }
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(h.r.a(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107741a = new d();

        static {
            Covode.recordClassIndex(68932);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68925);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f107739a;

        static {
            Covode.recordClassIndex(68929);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.f.b.l.a(this.f107739a, ((b) obj).f107739a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f107739a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "AwemeTask(aid=" + this.f107739a + ")";
        }

        public b(String str) {
            h.f.b.l.d(str, "");
            this.f107739a = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        h.f.b.l.d(context, "");
        boolean z = false;
        j.f25646a = false;
        j.f25650e = com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.a();
        j.f25648c = com.ss.android.ugc.aweme.feed.experiment.w.a();
        if (((Boolean) y.f93097a.getValue()).booleanValue() || com.ss.android.ugc.aweme.feed.experiment.x.f93096a) {
            z = true;
        }
        j.f25649d = z;
        j.f25652g = a.a();
        a.a().execute(a.b.f107738a);
        j.f25647b = new e();
    }
}

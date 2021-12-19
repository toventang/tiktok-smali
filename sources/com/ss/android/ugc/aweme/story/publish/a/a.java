package com.ss.android.ugc.aweme.story.publish.a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.scheduler.k;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.story.publish.a.b;
import com.ss.android.ugc.aweme.story.publish.a.c;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicInteger f138043a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    static final CopyOnWriteArrayList<String> f138044b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    static final CopyOnWriteArrayList<c> f138045c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f138046d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f138047e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f138048f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f138049g = i.a((h.f.a.a) b.f138053a);

    /* renamed from: h  reason: collision with root package name */
    private static final h f138050h = i.a((h.f.a.a) f.f138059a);

    /* renamed from: i  reason: collision with root package name */
    private static final h f138051i = i.a((h.f.a.a) c.f138055a);

    public static b a() {
        return (b) f138051i.getValue();
    }

    private static z.b d() {
        return (z.b) f138049g.getValue();
    }

    private static f.AnonymousClass1 e() {
        return (f.AnonymousClass1) f138050h.getValue();
    }

    private a() {
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f138053a = new b();

        static {
            Covode.recordClassIndex(90283);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new z.b() {
                /* class com.ss.android.ugc.aweme.story.publish.a.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                private final int f138054a = 3;

                static {
                    Covode.recordClassIndex(90284);
                }

                {
                    g.a().A();
                }

                @Override // com.ss.android.ugc.aweme.port.in.z.b
                public final void a(int i2, boolean z) {
                    if (i2 <= this.f138054a && z) {
                        l.d("account_logout_reset", "");
                        q.a("ParallelStoryPublishScheduler:reset");
                        a.c();
                        a.f138045c.clear();
                        Collection<c> values = a.f138046d.values();
                        l.b(values, "");
                        for (T t : values) {
                            if (!(t.f138091c instanceof x.a)) {
                                com.ss.android.ugc.aweme.shortvideo.publish.a.a a2 = b.a.a().a("account_logout_reset").a();
                                b a3 = a.a();
                                String str = t.f138094f;
                                l.d(a2, "");
                                a3.b().execute(new b.d(a3, str, a2));
                            }
                            t.a(true);
                        }
                        a.f138046d.clear();
                    }
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f138055a = new c();

        static {
            Covode.recordClassIndex(90285);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class f extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f138059a = new f();

        static {
            Covode.recordClassIndex(90288);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new k() {
                /* class com.ss.android.ugc.aweme.story.publish.a.a.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(90289);
                }

                @Override // com.ss.android.ugc.aweme.scheduler.k
                public final boolean a(com.ss.android.ugc.aweme.shortvideo.publish.q qVar, com.ss.android.ugc.aweme.shortvideo.publish.q qVar2) {
                    l.d(qVar, "");
                    l.d(qVar2, "");
                    return l.a(qVar, qVar2);
                }
            };
        }
    }

    private static void f() {
        if (!f138048f) {
            f138048f = true;
            g.a().A().a(d());
        }
    }

    public static final boolean b() {
        if (f138043a.get() != 0 || (!f138045c.isEmpty())) {
            return true;
        }
        return false;
    }

    public static void c() {
        g.a().A().b(d());
        f138048f = false;
    }

    static {
        Covode.recordClassIndex(90281);
    }

    public static final class e extends com.ss.android.ugc.aweme.shortvideo.publish.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f138058a;

        static {
            Covode.recordClassIndex(90287);
        }

        e(c cVar) {
            this.f138058a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            super.onFinish(dVar, obj);
            if (this.f138058a.a(false)) {
                a.a().a(this.f138058a);
            }
            a.a().a(this);
            if (!a.b()) {
                a.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$a  reason: collision with other inner class name */
    public static final class C3633a extends m implements h.f.a.b<c, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3633a f138052a = new C3633a();

        static {
            Covode.recordClassIndex(90282);
        }

        C3633a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            a.f138047e.a(cVar2);
            return h.z.f158842a;
        }
    }

    public static final Bitmap a(com.ss.android.ugc.aweme.shortvideo.publish.q qVar) {
        l.d(qVar, "");
        a();
        return b.a(qVar);
    }

    public static final x b(String str) {
        l.d(str, "");
        c cVar = f138046d.get(str);
        if (cVar != null) {
            return cVar.f138091c;
        }
        return null;
    }

    public static final com.ss.android.ugc.aweme.shortvideo.publish.q c(String str) {
        l.d(str, "");
        c cVar = f138046d.get(str);
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public static final c d(String str) {
        l.d(str, "");
        return f138046d.get(str);
    }

    public static final c a(Bundle bundle) {
        l.d(bundle, "");
        String sb = new StringBuilder().append(SystemClock.elapsedRealtime()).append('_').append(bundle.hashCode()).toString();
        bundle.putBoolean("publish_story_mode", true);
        c cVar = new c(sb, bundle, null, C3633a.f138052a);
        f138046d.put(sb, cVar);
        return cVar;
    }

    private static boolean b(c cVar) {
        String str = cVar.f138092d;
        if (f138045c.contains(cVar) || f138044b.contains(str)) {
            return true;
        }
        return false;
    }

    public static final boolean a(com.ss.android.ugc.aweme.shortvideo.x<ai> xVar) {
        l.d(xVar, "");
        Collection<c> values = f138046d.values();
        l.b(values, "");
        boolean z = false;
        for (T t : values) {
            l.d(xVar, "");
            List<com.ss.android.ugc.aweme.shortvideo.publish.k> list = t.f138089a;
            c.j jVar = new c.j(xVar);
            ListIterator<com.ss.android.ugc.aweme.shortvideo.publish.k> listIterator = list.listIterator();
            boolean z2 = false;
            while (listIterator.hasNext()) {
                com.ss.android.ugc.aweme.shortvideo.publish.k next = listIterator.next();
                if (((Boolean) jVar.invoke(next)).booleanValue()) {
                    t.f138090b.remove(next);
                    listIterator.remove();
                    z2 = true;
                }
            }
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    public static final boolean a(String str) {
        l.d(str, "");
        q.a("ParallelStoryPublishScheduler,scheduleTask,scheduleId:".concat(String.valueOf(str)));
        c cVar = f138046d.get(str);
        if (cVar != null) {
            cVar.b();
            a aVar = f138047e;
            l.b(cVar, "");
            if (aVar.a(cVar).length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final String a(c cVar) {
        if (b(cVar)) {
            q.a("ParallelStoryPublishScheduler," + cVar + " is existed.directly return.");
            return "";
        }
        f();
        String str = cVar.f138092d;
        String a2 = a().a(cVar.f138093e, cVar.f138094f, e());
        cVar.f138094f = a2;
        q.a("ParallelStoryPublishScheduler:start publish,scheduleId:" + str + ",taskId:" + a2);
        if (a2 == null) {
            q.c("ParallelStoryPublishScheduler:start publish,create task failed,add to pending task");
            f138045c.add(cVar);
        } else {
            f138043a.incrementAndGet();
            f138044b.add(str);
            a().a(new d(str, a2), a2);
            a().a(cVar, a2);
            a().a(new e(cVar), a2);
        }
        q.a("ParallelStoryPublishScheduler:startPublishReal,scheduleId:" + str + ",taskId:" + a2);
        return str;
    }

    public static final class d extends com.ss.android.ugc.aweme.shortvideo.publish.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f138056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138057b;

        static {
            Covode.recordClassIndex(90286);
        }

        d(String str, String str2) {
            this.f138056a = str;
            this.f138057b = str2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            q.a("ParallelStoryPublishScheduler:publish task done.scheduleId:" + this.f138056a + ",taskId:" + this.f138057b + ",result:" + (dVar instanceof d.c));
            a.f138044b.remove(this.f138056a);
            if (a.f138043a.decrementAndGet() < 0) {
                a.f138043a.set(0);
            }
            a aVar = a.f138047e;
            if (!a.f138045c.isEmpty()) {
                c remove = a.f138045c.remove(0);
                q.a("ParallelStoryPublishScheduler:scheduleNext,scheduleId:" + remove.f138092d + ",pendingTaskSize:" + a.f138045c.size());
                l.b(remove, "");
                aVar.a(remove);
            }
            a.a().a(this);
        }
    }

    public static final boolean a(com.ss.android.ugc.aweme.shortvideo.publish.k kVar, String str) {
        l.d(kVar, "");
        l.d(str, "");
        c cVar = f138046d.get(str);
        if (cVar == null) {
            return false;
        }
        cVar.a(kVar);
        return true;
    }

    public static final boolean a(com.ss.android.ugc.aweme.shortvideo.publish.k kVar, String str, boolean z) {
        l.d(kVar, "");
        l.d(str, "");
        c cVar = f138046d.get(str);
        if (cVar == null) {
            return false;
        }
        cVar.a(kVar, z);
        return true;
    }
}

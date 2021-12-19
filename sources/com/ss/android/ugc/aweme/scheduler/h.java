package com.ss.android.ugc.aweme.scheduler;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.scheduler.i;
import com.ss.android.ugc.aweme.scheduler.j;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.dq;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f120862a = new l(1, 1, true, true);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f120863b;

    /* renamed from: c  reason: collision with root package name */
    static final ReentrantLock f120864c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    static String f120865d;

    /* renamed from: e  reason: collision with root package name */
    static final ArrayList<com.ss.android.ugc.aweme.shortvideo.publish.k> f120866e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public static d f120867f;

    /* renamed from: g  reason: collision with root package name */
    static volatile i f120868g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f120869h = new h();

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f120870i = SettingsManager.a().a("enable_new_publish_when_null_id", false);

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f120871j = SettingsManager.a().a("enable_all_schedule_alog", false);

    /* renamed from: k  reason: collision with root package name */
    private static final e f120872k = new e();

    /* renamed from: l  reason: collision with root package name */
    private static final ParallelPublishCallback f120873l;

    private h() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.k f120874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120875b;

        static {
            Covode.recordClassIndex(78746);
        }

        a(com.ss.android.ugc.aweme.shortvideo.publish.k kVar, String str) {
            this.f120874a = kVar;
            this.f120875b = str;
        }

        public final void run() {
            h.b(this.f120874a, this.f120875b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.k f120879a;

        static {
            Covode.recordClassIndex(78748);
        }

        c(com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
            this.f120879a = kVar;
        }

        public final void run() {
            i iVar = h.f120868g;
            if (iVar != null) {
                iVar.a(this.f120879a);
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f120880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f120881b;

        static {
            Covode.recordClassIndex(78749);
        }

        d(i iVar, com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f120880a = iVar;
            this.f120881b = aVar;
        }

        public final void run() {
            i iVar = this.f120880a;
            if (iVar != null) {
                iVar.a(this.f120881b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$h  reason: collision with other inner class name */
    static final class C3127h extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3127h f120888a = new C3127h();

        static {
            Covode.recordClassIndex(78753);
        }

        C3127h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            d dVar = h.f120867f;
            if (dVar != null) {
                dVar.a();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f120889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f120890b;

        static {
            Covode.recordClassIndex(78754);
        }

        i(q qVar, i iVar) {
            this.f120889a = qVar;
            this.f120890b = iVar;
        }

        public final void run() {
            this.f120890b.f120902a.a(this.f120889a);
            this.f120890b.a();
        }
    }

    public static final int c() {
        if (com.ss.android.ugc.aweme.settings.m.a()) {
            return j.f120942b.b();
        }
        return 0;
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.k f120892b;

        static {
            Covode.recordClassIndex(78755);
        }

        j(String str, com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
            this.f120891a = str;
            this.f120892b = kVar;
        }

        public final void run() {
            j jVar = j.f120942b;
            String str = this.f120891a;
            if (str == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.publish.k kVar = this.f120892b;
            ExecutorService executorService = h.f120863b;
            h.f.b.l.b(executorService, "");
            jVar.a(str, kVar, executorService);
        }
    }

    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f120895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120896b = null;

        static {
            Covode.recordClassIndex(78757);
        }

        public l(x xVar) {
            this.f120895a = xVar;
        }

        public final void run() {
            i iVar = h.f120868g;
            if (iVar != null) {
                iVar.a(this.f120895a);
            }
            j jVar = j.f120942b;
            String str = this.f120896b;
            x<ai> xVar = this.f120895a;
            ExecutorService executorService = h.f120863b;
            h.f.b.l.b(executorService, "");
            jVar.a(str, xVar, executorService);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f120876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.x f120877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.k f120878c;

        static {
            Covode.recordClassIndex(78747);
        }

        b(i.a aVar, com.ss.android.ugc.aweme.shortvideo.publish.x xVar, com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
            this.f120876a = aVar;
            this.f120877b = xVar;
            this.f120878c = kVar;
        }

        public final void run() {
            this.f120878c.onFinish(((x.a) this.f120877b).f129901a, ((x.a) this.f120877b).f129902b);
            bj.d("PublishScheduler | addCallback direct finish " + this.f120876a.f120912a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f120886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f120887b;

        static {
            Covode.recordClassIndex(78752);
        }

        g(i iVar, com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f120886a = iVar;
            this.f120887b = aVar;
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            this.f120886a.a(this.f120887b);
            h.f120864c.lock();
            try {
                h.f120866e.clear();
                h.f120865d = null;
                h.f120864c.unlock();
                h.f120868g = null;
            } catch (Throwable th) {
                h.f120864c.unlock();
                throw th;
            }
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.k f120894b;

        static {
            Covode.recordClassIndex(78756);
        }

        k(String str, com.ss.android.ugc.aweme.shortvideo.publish.k kVar) {
            this.f120893a = str;
            this.f120894b = kVar;
        }

        public final void run() {
            Iterator<T> it = h.f120862a.b(this.f120893a).iterator();
            while (it.hasNext()) {
                i iVar = it.next().f120916e;
                if (iVar != null) {
                    iVar.b(this.f120894b);
                }
            }
        }
    }

    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120897a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.x f120898b;

        static {
            Covode.recordClassIndex(78758);
        }

        public m(com.ss.android.ugc.aweme.shortvideo.x xVar) {
            this.f120898b = xVar;
        }

        public final void run() {
            Iterator<T> it = h.f120862a.b(this.f120897a).iterator();
            while (it.hasNext()) {
                i iVar = it.next().f120916e;
                if (iVar != null) {
                    iVar.a(this.f120898b);
                }
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120882a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f120883b;

        static {
            Covode.recordClassIndex(78750);
        }

        e(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f120883b = aVar;
        }

        public final void run() {
            List<i.a> b2 = h.f120862a.b(this.f120882a);
            ArrayList<i.a> arrayList = new ArrayList();
            for (T t : b2) {
                if (!(t.f120913b instanceof x.a)) {
                    arrayList.add(t);
                }
            }
            for (i.a aVar : arrayList) {
                i iVar = aVar.f120916e;
                if (iVar != null) {
                    iVar.a(this.f120883b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120884a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f120885b;

        static {
            Covode.recordClassIndex(78751);
        }

        f(String str, com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f120885b = aVar;
        }

        public final void run() {
            List<i.a> b2 = h.f120862a.b(this.f120884a);
            ArrayList<i.a> arrayList = new ArrayList();
            for (T t : b2) {
                if (!(t.f120913b instanceof x.a)) {
                    arrayList.add(t);
                }
            }
            for (i.a aVar : arrayList) {
                i iVar = aVar.f120916e;
                if (iVar != null) {
                    iVar.a(this.f120885b);
                }
            }
        }
    }

    static {
        ParallelPublishCallback parallelPublishCallback;
        Covode.recordClassIndex(78745);
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
        a2.f79173b = "PublishScheduler";
        f120863b = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        if (com.ss.android.ugc.aweme.settings.m.c()) {
            parallelPublishCallback = new ParallelPublishCallback(C3127h.f120888a);
        } else {
            parallelPublishCallback = new ParallelPublishCallback(null, 1, null);
        }
        f120873l = parallelPublishCallback;
    }

    /* access modifiers changed from: package-private */
    public static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f120899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f120901c;

        static {
            Covode.recordClassIndex(78759);
        }

        n(i.a aVar, String str, q qVar) {
            this.f120899a = aVar;
            this.f120900b = str;
            this.f120901c = qVar;
        }

        public final void run() {
            i iVar;
            this.f120899a.a(this.f120901c);
            com.ss.android.ugc.aweme.shortvideo.publish.x xVar = this.f120899a.f120913b;
            if (xVar instanceof x.b) {
                h.c("ReStartNewPublish " + this.f120900b);
            } else if (xVar instanceof x.a) {
                com.ss.android.ugc.aweme.shortvideo.publish.d dVar = ((x.a) xVar).f129901a;
                if (dVar instanceof d.c) {
                    h.c("ReStartAlreadySuccessPublish " + this.f120900b);
                } else if (dVar instanceof d.a) {
                    bj.a("PublishScheduler | reStart Cancel Publish, reStart new. old:" + this.f120900b + " new:" + h.a(this.f120901c));
                } else if (dVar instanceof d.b) {
                    bj.a("PublishScheduler | reStart Failed Publish, reStart new. old:" + this.f120900b + " new:" + h.a(this.f120901c));
                }
            } else if ((xVar instanceof x.d) && (iVar = this.f120899a.f120916e) != null) {
                iVar.a();
            }
        }
    }

    public static final synchronized void a() {
        synchronized (h.class) {
            MethodCollector.i(11579);
            if (j.f120942b.b() > 0) {
                if (j.f120942b.c()) {
                    g.a("PublishSchedule startCacheTask taskIsRunning");
                    MethodCollector.o(11579);
                    return;
                }
                if (com.ss.android.ugc.aweme.settings.m.c()) {
                    List<i.a> list = j.f120941a;
                    h.f.b.l.b(list, "");
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().f120913b instanceof x.c) {
                            g.a("PublishSchedule startCacheTask PublishTaskList.taskResume");
                            List<i.a> list2 = j.f120941a;
                            h.f.b.l.b(list2, "");
                            for (T t : list2) {
                                if (t.f120913b instanceof x.c) {
                                    bj.a("PublishParallel taskResume id=" + t.f120912a);
                                    i iVar = t.f120916e;
                                    if (iVar != null) {
                                        if (iVar.f120906e) {
                                            g.a("PublishParallel PublishTask(" + iVar.f120902a.f120912a + ") invoke resume");
                                            c cVar = iVar.f120904c;
                                            if (cVar != null) {
                                                cVar.c();
                                            }
                                            iVar.f120906e = false;
                                        }
                                        MethodCollector.o(11579);
                                        return;
                                    }
                                    MethodCollector.o(11579);
                                    return;
                                }
                            }
                            MethodCollector.o(11579);
                            return;
                        }
                    }
                }
                i.a a2 = j.f120942b.a();
                if (a2 != null && a2.f120916e == null) {
                    q qVar = a2.f120917f;
                    boolean z = f120871j;
                    e eVar = f120872k;
                    l lVar = f120862a;
                    ExecutorService executorService = f120863b;
                    h.f.b.l.b(executorService, "");
                    i iVar2 = new i("PublishScheduler", qVar, z, eVar, lVar, executorService);
                    h.f.b.l.d(a2, "");
                    iVar2.f120902a = a2;
                    g.a("PublishParallel startCacheTask new task  id=" + a2.f120912a);
                    a2.f120916e = iVar2;
                }
                f120864c.lock();
                i iVar3 = null;
                if (a2 != null) {
                    try {
                        if (h.f.b.l.a((Object) f120865d, (Object) a2.f120912a)) {
                            StringBuilder sb = new StringBuilder("PublishParallel startCacheTask oldPublishRecord.addcallback=");
                            ArrayList<com.ss.android.ugc.aweme.shortvideo.publish.k> arrayList = f120866e;
                            g.a(sb.append(arrayList.size()).toString());
                            for (T t2 : arrayList) {
                                i iVar4 = a2.f120916e;
                                if (iVar4 == null) {
                                    h.f.b.l.b();
                                }
                                iVar4.a((com.ss.android.ugc.aweme.shortvideo.publish.k) t2);
                            }
                            f120865d = null;
                            StringBuilder sb2 = new StringBuilder("cancelTaskCallbackList  size=");
                            ArrayList<com.ss.android.ugc.aweme.shortvideo.publish.k> arrayList2 = f120866e;
                            g.a(sb2.append(arrayList2.size()).toString());
                            arrayList2.clear();
                        }
                    } catch (Throwable th) {
                        f120864c.unlock();
                        MethodCollector.o(11579);
                        throw th;
                    }
                }
                f120864c.unlock();
                g.a(new StringBuilder("PublishParallel startCacheTask execute task id=").append(a2 != null ? a2.f120912a : null).toString());
                ExecutorService executorService2 = f120863b;
                if (a2 != null) {
                    iVar3 = a2.f120916e;
                }
                executorService2.execute(iVar3);
            }
            MethodCollector.o(11579);
        }
    }

    public static final boolean b() {
        boolean z = false;
        if (!com.ss.android.ugc.aweme.settings.m.a()) {
            List<i.a> b2 = f120862a.b(null);
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                Iterator<T> it = b2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next().f120913b instanceof x.a)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bj.d("PublishScheduler | isPublishing publishId:" + ((String) null) + " result:" + z);
            return z;
        } else if (!j.f120942b.c() && f120868g == null) {
            return false;
        } else {
            return true;
        }
    }

    public static final q a(String str) {
        if (com.ss.android.ugc.aweme.settings.m.a()) {
            return j.f120942b.a(str);
        }
        i.a a2 = f120862a.a(str);
        if (a2 != null) {
            return a2.f120917f;
        }
        return null;
    }

    public static final Bitmap b(q qVar) {
        h.f.b.l.d(qVar, "");
        if (!(qVar.f129882k instanceof VideoPublishEditModel)) {
            return null;
        }
        BaseShortVideoContext baseShortVideoContext = qVar.f129882k;
        Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        return dq.a((VideoPublishEditModel) baseShortVideoContext);
    }

    public static final void c(String str) {
        h.f.b.l.d(str, "");
        bj.b("PublishScheduler | ".concat(String.valueOf(str)));
        com.ss.android.ugc.aweme.df.f.a("PublishScheduler|".concat(String.valueOf(str)));
    }

    public static void d(String str) {
        h.f.b.l.d(str, "");
        bj.d("PublishScheduler | ".concat(String.valueOf(str)));
    }

    public static final i a(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        h.f.b.l.d(aVar, "");
        if (com.ss.android.ugc.aweme.settings.m.a()) {
            i iVar = f120868g;
            f120868g = null;
            f120863b.execute(new d(iVar, aVar));
            return iVar;
        }
        f120863b.execute(new e(aVar));
        return null;
    }

    public static final void b(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        i iVar;
        h.f.b.l.d(aVar, "");
        if (com.ss.android.ugc.aweme.settings.m.a() && (iVar = f120868g) != null) {
            f120863b.execute(new g(iVar, aVar));
        }
    }

    public static final void c(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        h.f.b.l.d(aVar, "");
        if (com.ss.android.ugc.aweme.settings.m.a()) {
            j jVar = j.f120942b;
            ExecutorService executorService = f120863b;
            h.f.b.l.b(executorService, "");
            jVar.a(executorService, aVar);
            return;
        }
        f120863b.execute(new f(null, aVar));
    }

    public static final synchronized String a(Bundle bundle) {
        String str;
        synchronized (h.class) {
            MethodCollector.i(11402);
            h.f.b.l.d(bundle, "");
            bj.a("PublishScheduler addPublishTask");
            q a2 = a.a(bundle);
            if ((a2.f129882k instanceof VideoPublishEditModel) && com.ss.android.ugc.aweme.settings.m.a()) {
                com.ss.android.ugc.aweme.port.in.g.a().o().l().b(a2.f129882k.getDraftPrimaryKey());
            }
            boolean z = f120871j;
            e eVar = f120872k;
            l lVar = f120862a;
            ExecutorService executorService = f120863b;
            h.f.b.l.b(executorService, "");
            i iVar = new i("PublishScheduler", a2, z, eVar, lVar, executorService);
            iVar.a(f120873l);
            bj.a("ParallelPublish  PublishScheduler  addPublishTask id=" + iVar.f120902a.f120912a);
            j.f120942b.a(iVar.f120902a);
            str = iVar.f120902a.f120912a;
            MethodCollector.o(11402);
        }
        return str;
    }

    public static final void c(Bundle bundle) {
        String str;
        i.a aVar;
        h.f.b.l.d(bundle, "");
        if (c() == 0) {
            q a2 = a.a(bundle);
            boolean z = f120871j;
            e eVar = f120872k;
            l lVar = f120862a;
            ExecutorService executorService = f120863b;
            h.f.b.l.b(executorService, "");
            i iVar = new i("PublishScheduler", a2, z, eVar, lVar, executorService);
            f120868g = iVar;
            iVar.a(f120873l);
            StringBuilder sb = new StringBuilder("PublishParallel PublishScheduler PrePublishTask id=");
            i iVar2 = f120868g;
            if (iVar2 == null || (aVar = iVar2.f120902a) == null) {
                str = null;
            } else {
                str = aVar.f120912a;
            }
            g.a(sb.append(str).toString());
            executorService.execute(f120868g);
        }
    }

    public static String a(q qVar) {
        boolean z = f120871j;
        e eVar = f120872k;
        l lVar = f120862a;
        ExecutorService executorService = f120863b;
        h.f.b.l.b(executorService, "");
        i iVar = new i("PublishScheduler", qVar, z, eVar, lVar, executorService);
        if (!lVar.a(iVar.f120902a)) {
            return null;
        }
        executorService.execute(iVar);
        bj.a("PublishScheduler | startNewPublish creationId:" + qVar.f129873b + ' ' + "publishId:" + iVar.f120902a.f120912a);
        return iVar.f120902a.f120912a;
    }

    public static final synchronized String b(Bundle bundle) {
        String str;
        i.a aVar;
        synchronized (h.class) {
            MethodCollector.i(11577);
            h.f.b.l.d(bundle, "");
            i iVar = f120868g;
            if (iVar == null) {
                MethodCollector.o(11577);
                return "";
            }
            f120868g = null;
            j.f120942b.a(iVar.f120902a);
            q a2 = a.a(bundle);
            StringBuilder sb = new StringBuilder("ParallelPublish startPreStartTask execute task id=");
            i iVar2 = f120868g;
            if (iVar2 == null || (aVar = iVar2.f120902a) == null) {
                str = null;
            } else {
                str = aVar.f120912a;
            }
            bj.a(sb.append(str).toString());
            f120864c.lock();
            try {
                if (h.f.b.l.a((Object) f120865d, (Object) iVar.f120902a.f120912a)) {
                    Iterator<T> it = f120866e.iterator();
                    while (it.hasNext()) {
                        iVar.a((com.ss.android.ugc.aweme.shortvideo.publish.k) it.next());
                    }
                    f120865d = null;
                    StringBuilder sb2 = new StringBuilder("cancelTaskCallbackList  size=");
                    ArrayList<com.ss.android.ugc.aweme.shortvideo.publish.k> arrayList = f120866e;
                    bj.a(sb2.append(arrayList.size()).toString());
                    arrayList.clear();
                }
                f120864c.unlock();
                f120863b.execute(new i(a2, iVar));
                String str2 = iVar.f120902a.f120912a;
                MethodCollector.o(11577);
                return str2;
            } catch (Throwable th) {
                f120864c.unlock();
                MethodCollector.o(11577);
                throw th;
            }
        }
    }

    public static final synchronized void b(String str) {
        synchronized (h.class) {
            MethodCollector.i(11583);
            h.f.b.l.d(str, "");
            if (!j.f120942b.c()) {
                MethodCollector.o(11583);
            } else if (com.ss.android.ugc.aweme.settings.m.c()) {
                g.a("PublishScheduler force pause");
                j.f120942b.a(j.e.f120955a);
                MethodCollector.o(11583);
            } else {
                if (com.ss.android.ugc.aweme.settings.m.b()) {
                    g.a("PublishScheduler force cancel");
                    c(b.a.a().a(str).a());
                }
                MethodCollector.o(11583);
            }
        }
    }

    public static final String a(Bundle bundle, String str) {
        h.f.b.l.d(bundle, "");
        return f120869h.a(a.a(bundle), str);
    }

    public static void b(com.ss.android.ugc.aweme.shortvideo.publish.k kVar, String str) {
        String str2;
        i.a aVar;
        h.f.b.l.d(kVar, "");
        if (!com.ss.android.ugc.aweme.settings.m.a()) {
            i.a a2 = f120862a.a(str);
            if (a2 != null) {
                com.ss.android.ugc.aweme.shortvideo.publish.x xVar = a2.f120913b;
                if (xVar instanceof x.a) {
                    com.ss.android.ugc.aweme.base.m.f68150a.execute(new b(a2, xVar, kVar));
                    return;
                }
                i iVar = a2.f120916e;
                if (iVar != null) {
                    iVar.a(kVar);
                    bj.d("PublishScheduler | addCallback success " + a2.f120912a);
                }
            }
        } else if (str != null) {
            i iVar2 = f120868g;
            if (iVar2 == null || (aVar = iVar2.f120902a) == null) {
                str2 = null;
            } else {
                str2 = aVar.f120912a;
            }
            if (h.f.b.l.a((Object) str2, (Object) str)) {
                f120863b.execute(new c(kVar));
            }
            j.f120942b.a(str, kVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String a(com.ss.android.ugc.aweme.shortvideo.publish.q r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.scheduler.h.a(com.ss.android.ugc.aweme.shortvideo.publish.q, java.lang.String):java.lang.String");
    }

    public static final void a(com.ss.android.ugc.aweme.shortvideo.publish.k kVar, String str) {
        h.f.b.l.d(kVar, "");
        bj.d("PublishScheduler | addCallback call ".concat(String.valueOf(str)));
        f120863b.execute(new a(kVar, str));
    }
}

package com.ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.scheduler.i;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final List<i.a> f120941a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    public static final j f120942b = new j();

    private j() {
    }

    public final synchronized void a(ExecutorService executorService, com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        MethodCollector.i(13040);
        l.d(executorService, "");
        l.d(aVar, "");
        executorService.execute(new d(aVar));
        MethodCollector.o(13040);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f120946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120947b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExecutorService f120948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f120949d;

        static {
            Covode.recordClassIndex(78778);
        }

        b(i.a aVar, String str, ExecutorService executorService, k kVar) {
            this.f120946a = aVar;
            this.f120947b = str;
            this.f120948c = executorService;
            this.f120949d = kVar;
        }

        public final void run() {
            i iVar = this.f120946a.f120916e;
            if (iVar != null) {
                iVar.b(this.f120949d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f120950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExecutorService f120952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f120953d;

        static {
            Covode.recordClassIndex(78779);
        }

        c(i.a aVar, String str, ExecutorService executorService, x xVar) {
            this.f120950a = aVar;
            this.f120951b = str;
            this.f120952c = executorService;
            this.f120953d = xVar;
        }

        public final void run() {
            i iVar = this.f120950a.f120916e;
            if (iVar != null) {
                iVar.a(this.f120953d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f120943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecutorService f120944b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f120945c;

        static {
            Covode.recordClassIndex(78777);
        }

        a(List list, ExecutorService executorService, x xVar) {
            this.f120943a = list;
            this.f120944b = executorService;
            this.f120945c = xVar;
        }

        public final void run() {
            for (i iVar : this.f120943a) {
                if (iVar != null) {
                    iVar.a(this.f120945c);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(78776);
    }

    public final synchronized int b() {
        int size;
        MethodCollector.i(12843);
        size = f120941a.size();
        MethodCollector.o(12843);
        return size;
    }

    public final synchronized i.a a() {
        MethodCollector.i(12479);
        List<i.a> list = f120941a;
        if (list.size() > 0) {
            i.a aVar = list.get(0);
            MethodCollector.o(12479);
            return aVar;
        }
        MethodCollector.o(12479);
        return null;
    }

    public final synchronized boolean c() {
        MethodCollector.i(12844);
        List<i.a> list = f120941a;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f120913b instanceof x.d) {
                MethodCollector.o(12844);
                return true;
            }
        }
        MethodCollector.o(12844);
        return false;
    }

    public final synchronized ArrayList<String> d() {
        ArrayList<String> arrayList;
        MethodCollector.i(12943);
        arrayList = new ArrayList<>();
        List<i.a> list = f120941a;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String draftPrimaryKey = it.next().f120917f.f129882k.getDraftPrimaryKey();
            if (draftPrimaryKey == null) {
                draftPrimaryKey = "";
            }
            arrayList.add(draftPrimaryKey);
        }
        MethodCollector.o(12943);
        return arrayList;
    }

    public final synchronized String f() {
        T t;
        String str;
        MethodCollector.i(13284);
        List<i.a> list = f120941a;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f120913b instanceof x.d) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (str = t2.f120912a) == null) {
            str = "";
        }
        MethodCollector.o(13284);
        return str;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f120954a;

        static {
            Covode.recordClassIndex(78780);
        }

        d(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f120954a = aVar;
        }

        public final void run() {
            List<i.a> list = j.f120941a;
            l.b(list, "");
            for (T t : list) {
                com.ss.android.ugc.aweme.shortvideo.publish.x xVar = t.f120913b;
                if (xVar instanceof x.d) {
                    if (((x.d) xVar).f129905a < 60) {
                        g.a("PublishParallel cancelPublish id=" + t.f120912a);
                        i iVar = t.f120916e;
                        if (iVar != null) {
                            iVar.a(this.f120954a);
                        }
                    } else {
                        g.a("PublishParallel cancelPublish id=" + t.f120912a + " can't pause because its progress >= 60");
                    }
                }
            }
        }
    }

    public final synchronized List<q> e() {
        ArrayList arrayList;
        MethodCollector.i(13209);
        arrayList = new ArrayList();
        List<i.a> list = f120941a;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f120917f);
        }
        bj.a("getAllPublishModel size=" + arrayList.size());
        MethodCollector.o(13209);
        return arrayList;
    }

    public final synchronized void a(i.a aVar) {
        MethodCollector.i(12477);
        l.d(aVar, "");
        f120941a.add(aVar);
        MethodCollector.o(12477);
    }

    public final synchronized boolean b(i.a aVar) {
        boolean remove;
        MethodCollector.i(12478);
        l.d(aVar, "");
        remove = f120941a.remove(aVar);
        MethodCollector.o(12478);
        return remove;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<i.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120955a = new e();

        static {
            Covode.recordClassIndex(78781);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i.a aVar) {
            i.a aVar2 = aVar;
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.shortvideo.publish.x xVar = aVar2.f120913b;
            if (xVar instanceof x.d) {
                if (((x.d) xVar).f129905a < 60) {
                    g.a("PublishParallel taskPause id=" + aVar2.f120912a);
                    i iVar = aVar2.f120916e;
                    if (iVar != null && !iVar.f120906e) {
                        g.a("PublishParallel PublishTask(" + iVar.f120902a.f120912a + ") invoke pause");
                        c cVar = iVar.f120904c;
                        if (cVar != null) {
                            cVar.b();
                        }
                        iVar.f120906e = true;
                    }
                } else {
                    g.a("PublishParallel taskPause id=" + aVar2.f120912a + " can't pause because its progress >= 60");
                }
            }
            return z.f158842a;
        }
    }

    public final synchronized q a(String str) {
        MethodCollector.i(13126);
        List<i.a> list = f120941a;
        l.b(list, "");
        for (T t : list) {
            if (l.a((Object) t.f120912a, (Object) str)) {
                q qVar = t.f120917f;
                MethodCollector.o(13126);
                return qVar;
            }
        }
        List<i.a> list2 = f120941a;
        if (list2.size() > 0) {
            q qVar2 = list2.get(list2.size() - 1).f120917f;
            MethodCollector.o(13126);
            return qVar2;
        }
        MethodCollector.o(13126);
        return null;
    }

    public final synchronized void a(h.f.a.b<? super i.a, z> bVar) {
        MethodCollector.i(13283);
        l.d(bVar, "");
        List<i.a> list = f120941a;
        l.b(list, "");
        for (T t : list) {
            l.b(t, "");
            bVar.invoke(t);
        }
        MethodCollector.o(13283);
    }

    public final synchronized void a(String str, k kVar) {
        i iVar;
        MethodCollector.i(12597);
        l.d(str, "");
        l.d(kVar, "");
        List<i.a> list = f120941a;
        l.b(list, "");
        for (T t : list) {
            if (l.a((Object) t.f120912a, (Object) str) && (iVar = t.f120916e) != null) {
                iVar.a(kVar);
            }
        }
        MethodCollector.o(12597);
    }

    public final synchronized void a(String str, k kVar, ExecutorService executorService) {
        MethodCollector.i(12720);
        l.d(str, "");
        l.d(kVar, "");
        l.d(executorService, "");
        List<i.a> list = f120941a;
        l.b(list, "");
        for (T t : list) {
            if (l.a((Object) t.f120912a, (Object) str)) {
                executorService.execute(new b(t, str, executorService, kVar));
            }
        }
        MethodCollector.o(12720);
    }

    public final synchronized void a(String str, com.ss.android.ugc.aweme.shortvideo.x<ai> xVar, ExecutorService executorService) {
        MethodCollector.i(12842);
        l.d(xVar, "");
        l.d(executorService, "");
        if (str != null) {
            List<i.a> list = f120941a;
            l.b(list, "");
            for (T t : list) {
                if (l.a((Object) t.f120912a, (Object) str)) {
                    executorService.execute(new c(t, str, executorService, xVar));
                }
            }
            MethodCollector.o(12842);
            return;
        }
        List<i.a> list2 = f120941a;
        l.b(list2, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f120916e);
        }
        executorService.execute(new a(arrayList, executorService, xVar));
        MethodCollector.o(12842);
    }
}

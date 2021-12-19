package com.ss.android.ugc.aweme.scheduler;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.scheduler.e;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public a f120902a;

    /* renamed from: b  reason: collision with root package name */
    public final m f120903b;

    /* renamed from: c  reason: collision with root package name */
    c f120904c;

    /* renamed from: d  reason: collision with root package name */
    public final List<k> f120905d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    boolean f120906e;

    /* renamed from: f  reason: collision with root package name */
    public final l f120907f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f120908g;

    /* renamed from: h  reason: collision with root package name */
    private final m f120909h = m.f68150a;

    /* renamed from: i  reason: collision with root package name */
    private boolean f120910i;

    /* renamed from: j  reason: collision with root package name */
    private final e f120911j;

    static {
        Covode.recordClassIndex(78760);
    }

    public static final class f extends k {

        /* renamed from: a  reason: collision with root package name */
        public boolean f120929a;

        /* renamed from: b  reason: collision with root package name */
        public final c.b f120930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f120931c;

        static {
            Covode.recordClassIndex(78767);
        }

        public final void a() {
            this.f120931c.a(false, true);
        }

        public static final class a extends c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f120932a;

            static {
                Covode.recordClassIndex(78768);
            }

            @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
            public final void a() {
                super.a();
                if (this.f120932a.f120931c.f120902a.f120917f.f129874c == 0) {
                    this.f120932a.a();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(f fVar) {
                this.f120932a = fVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(i iVar) {
            this.f120931c = iVar;
            a aVar = new a(this);
            this.f120930b = aVar;
            c.C1870c.f80046a.a(aVar);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            c.C1870c.f80046a.b(this.f120930b);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            if (this.f120931c.f120902a.f120917f.f129874c == 0 && !this.f120929a && c.C1870c.f80046a.a()) {
                a();
                this.f120929a = true;
            }
        }
    }

    public final void a() {
        c cVar = this.f120904c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        public boolean f120921a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f120922b;

        /* renamed from: c  reason: collision with root package name */
        public final a f120923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f120924d;

        static {
            Covode.recordClassIndex(78763);
        }

        public static final class a extends c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f120925a;

            static {
                Covode.recordClassIndex(78764);
            }

            @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
            public final void a() {
                super.a();
                if (this.f120925a.f120924d.f120902a.f120917f.f129874c == 0) {
                    this.f120925a.a();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f120925a = cVar;
            }
        }

        public final void a() {
            String str = this.f120924d.f120902a.f120912a;
            l.d(str, "");
            PublishService.a.a("show publishId:".concat(String.valueOf(str)));
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            if (o.a(a2, PublishService.class)) {
                PublishService.a.a("service is running");
            } else {
                Intent intent = new Intent(a2, PublishService.class);
                intent.putExtra("PUBLISH_ID", str);
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.startForegroundService(intent);
                } else {
                    PublishService.a.a(a2, intent);
                }
            }
            this.f120924d.a(true, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(i iVar) {
            this.f120924d = iVar;
            a aVar = new a(this);
            this.f120923c = aVar;
            c.C1870c.f80046a.a(aVar);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            c.C1870c.f80046a.b(this.f120923c);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            if (this.f120924d.f120902a.f120917f.f129874c == 0) {
                if (!this.f120922b) {
                    if (com.ss.android.ugc.aweme.settings.m.a()) {
                        PublishService.a.a("clearProgress");
                        Context a2 = com.ss.android.ugc.aweme.df.b.a();
                        PublishService.a.a(a2);
                        androidx.core.app.l.a(a2).a((String) null, 1);
                    } else {
                        PublishService.a.a();
                    }
                    this.f120922b = true;
                }
                if (!this.f120921a) {
                    com.ss.android.ugc.aweme.df.c cVar = c.C1870c.f80046a;
                    l.b(cVar, "");
                    if (cVar.a()) {
                        a();
                        this.f120921a = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f120919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f120920b;

        static {
            Covode.recordClassIndex(78762);
        }

        b(k kVar, x xVar) {
            this.f120919a = kVar;
            this.f120920b = xVar;
        }

        public final void run() {
            this.f120919a.onProgress(((x.d) this.f120920b).f129905a, ((x.d) this.f120920b).f129906b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f120927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f120928b;

        static {
            Covode.recordClassIndex(78766);
        }

        e(List list, h.f.a.b bVar) {
            this.f120927a = list;
            this.f120928b = bVar;
        }

        public final void run() {
            for (Object obj : this.f120927a) {
                this.f120928b.invoke(obj);
            }
        }
    }

    public static final class h extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f120933a;

        /* renamed from: b  reason: collision with root package name */
        private volatile x f120934b;

        static {
            Covode.recordClassIndex(78770);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f120935a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.d f120936b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f120937c;

            static {
                Covode.recordClassIndex(78771);
            }

            a(h hVar, com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
                this.f120935a = hVar;
                this.f120936b = dVar;
                this.f120937c = obj;
            }

            public final void run() {
                h hVar = this.f120935a;
                if (hVar.a(hVar.f120933a.f120902a.f120913b, "finish on no running")) {
                    this.f120935a.f120933a.f120902a.a(this.f120936b, this.f120937c);
                    this.f120935a.f120933a.f120907f.a();
                    this.f120935a.f120933a.a(new h.f.a.b<k, z>(this) {
                        /* class com.ss.android.ugc.aweme.scheduler.i.h.a.AnonymousClass1 */
                        final /* synthetic */ a this$0;

                        static {
                            Covode.recordClassIndex(78772);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(k kVar) {
                            k kVar2 = kVar;
                            l.d(kVar2, "");
                            kVar2.onFinish(this.this$0.f120936b, this.this$0.f120937c);
                            return z.f158842a;
                        }
                    });
                    this.f120935a.f120933a.f120905d.clear();
                }
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f120938a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f120939b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f120940c;

            static {
                Covode.recordClassIndex(78773);
            }

            b(h hVar, int i2, Object obj) {
                this.f120938a = hVar;
                this.f120939b = i2;
                this.f120940c = obj;
            }

            public final void run() {
                h hVar = this.f120938a;
                if (hVar.a(hVar.f120933a.f120902a.f120913b, "progress:" + this.f120939b + " on no running") && !(this.f120938a.f120933a.f120902a.f120913b instanceof x.c)) {
                    this.f120938a.f120933a.f120902a.a(new x.d(this.f120939b, this.f120940c));
                    this.f120938a.f120933a.a(new h.f.a.b<k, z>(this) {
                        /* class com.ss.android.ugc.aweme.scheduler.i.h.b.AnonymousClass1 */
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(78774);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(k kVar) {
                            k kVar2 = kVar;
                            l.d(kVar2, "");
                            kVar2.onProgress(this.this$0.f120939b, this.this$0.f120940c);
                            return z.f158842a;
                        }
                    });
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(i iVar) {
            this.f120933a = iVar;
        }

        static final class c extends h.f.b.m implements h.f.a.b<k, z> {
            final /* synthetic */ Object $extra;
            final /* synthetic */ String $stage;
            final /* synthetic */ ah $state;

            static {
                Covode.recordClassIndex(78775);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, ah ahVar, Object obj) {
                super(1);
                this.$stage = str;
                this.$state = ahVar;
                this.$extra = obj;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(k kVar) {
                k kVar2 = kVar;
                l.d(kVar2, "");
                kVar2.onStageUpdate(this.$stage, this.$state, this.$extra);
                return z.f158842a;
            }
        }

        public final boolean a(x xVar, String str) {
            if (xVar instanceof x.d) {
                return true;
            }
            if (com.ss.android.ugc.aweme.settings.m.a() && (xVar instanceof x.c)) {
                return true;
            }
            this.f120933a.a(xVar, str);
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            g.a("PublishParallel PublishTask(" + this.f120933a.f120902a.f120912a + ") onProgress " + i2 + " callbackList size " + this.f120933a.f120905d.size());
            this.f120933a.f120908g.execute(new b(this, i2, obj));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            g.a("PublishParallel PublishTask(" + this.f120933a.f120902a.f120912a + ") onFinish " + dVar + " callbackList size " + this.f120933a.f120905d.size());
            if (dVar instanceof d.c) {
                j.f120942b.b(this.f120933a.f120902a);
                j.f120942b.b();
            } else if (dVar instanceof d.b) {
                q.a("publishtask PublishCallback  onFinish=Failed publishid=" + this.f120933a.f120902a.f120912a);
                j.f120942b.b(this.f120933a.f120902a);
                j.f120942b.b();
            } else {
                q.a("publishtask PublishCallback  onFinish=Cancel publishid=" + this.f120933a.f120902a.f120912a);
                if (com.ss.android.ugc.aweme.settings.m.a() && com.ss.android.ugc.aweme.settings.m.b()) {
                    h.f120864c.lock();
                    try {
                        h.f120865d = this.f120933a.f120902a.f120912a;
                        Iterator<T> it = this.f120933a.f120905d.iterator();
                        while (it.hasNext()) {
                            h.f120866e.add(it.next());
                        }
                        q.a("cancelTaskCallbackList  size=" + h.f120866e.size());
                    } finally {
                        h.f120864c.unlock();
                    }
                }
            }
            this.f120933a.f120908g.execute(new a(this, dVar, obj));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onStageUpdate(String str, ah ahVar, Object obj) {
            x dVar;
            l.d(str, "");
            l.d(ahVar, "");
            int hashCode = str.hashCode();
            if (hashCode != -1653244709) {
                if (hashCode == 349916616 && str.equals("STAGE_SYNTHETIC_RESUME")) {
                    g.a("PublishParallel PublishTask(" + this.f120933a.f120902a.f120912a + ") resumed");
                    a aVar = this.f120933a.f120902a;
                    if (this.f120934b != null) {
                        dVar = this.f120934b;
                        if (dVar == null) {
                            l.b();
                        }
                    } else {
                        dVar = new x.d(0, null);
                    }
                    aVar.a(dVar);
                    this.f120934b = null;
                }
            } else if (str.equals("STAGE_SYNTHETIC_PAUSE")) {
                g.a("PublishParallel PublishTask(" + this.f120933a.f120902a.f120912a + ") paused");
                x xVar = this.f120933a.f120902a.f120913b;
                if (!l.a(xVar, x.c.f129904a)) {
                    this.f120934b = xVar;
                } else {
                    this.f120934b = null;
                }
                this.f120933a.f120902a.a(x.c.f129904a);
            }
            this.f120933a.a(new c(str, ahVar, obj));
        }
    }

    public final void run() {
        if (com.ss.android.ugc.aweme.settings.m.a() || !(!l.a(this.f120902a.f120913b, x.b.f129903a))) {
            this.f120902a.a(new x.d(0, null));
            a aVar = this.f120902a;
            String str = aVar.f120912a;
            l.d(aVar, "");
            l.d(str, "");
            IPublishServiceFactory a2 = PublishServiceFactoryImpl.a();
            e.a aVar2 = new e.a(aVar, a2, a2.a(aVar.f120917f), str);
            this.f120904c = aVar2;
            aVar2.a(new h(this));
            a(false, false);
            if (com.ss.android.ugc.aweme.settings.h.a() && !this.f120902a.f120917f.f129883l) {
                a(new c(this));
            }
            if (!com.ss.android.ugc.aweme.settings.h.a()) {
                a(new f(this));
                return;
            }
            return;
        }
        a(this.f120902a.f120913b, "start not new");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f120912a;

        /* renamed from: b  reason: collision with root package name */
        public volatile x f120913b = x.b.f129903a;

        /* renamed from: c  reason: collision with root package name */
        public long f120914c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f120915d = -1;

        /* renamed from: e  reason: collision with root package name */
        public i f120916e;

        /* renamed from: f  reason: collision with root package name */
        public volatile com.ss.android.ugc.aweme.shortvideo.publish.q f120917f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f120918g;

        static {
            Covode.recordClassIndex(78761);
        }

        public final void a(com.ss.android.ugc.aweme.shortvideo.publish.q qVar) {
            l.d(qVar, "");
            this.f120917f = qVar;
        }

        public final void a(x xVar) {
            i iVar;
            m mVar;
            l.d(xVar, "");
            this.f120913b = xVar;
            if ((xVar instanceof x.d) && this.f120914c == -1) {
                this.f120914c = SystemClock.uptimeMillis();
            }
            if ((this.f120918g || !(this.f120913b instanceof x.d)) && (iVar = this.f120916e) != null && (mVar = iVar.f120903b) != null) {
                mVar.b("change state to:" + this.f120913b);
            }
        }

        public final void a(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            a(new x.a(dVar, obj));
            this.f120915d = SystemClock.uptimeMillis();
            this.f120916e = null;
        }

        public a(com.ss.android.ugc.aweme.shortvideo.publish.q qVar, i iVar, boolean z) {
            l.d(qVar, "");
            this.f120917f = qVar;
            this.f120918g = z;
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            this.f120912a = uuid;
            this.f120916e = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<k, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120926a = new d();

        static {
            Covode.recordClassIndex(78765);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            kVar2.onFinish(d.a.f129782a, null);
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.x<ai> xVar) {
        l.d(xVar, "");
        a(this.f120905d, new g(xVar));
    }

    public final void b(k kVar) {
        l.d(kVar, "");
        this.f120905d.remove(kVar);
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<k, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.x $callback;

        static {
            Covode.recordClassIndex(78769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.ss.android.ugc.aweme.shortvideo.x xVar) {
            super(1);
            this.$callback = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(k kVar) {
            boolean z;
            k kVar2 = kVar;
            l.d(kVar2, "");
            if (!(kVar2 instanceof f) || !l.a(((f) kVar2).f120859a, this.$callback)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public final void a(h.f.a.b<? super k, z> bVar) {
        if (!this.f120905d.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f120905d);
            this.f120909h.execute(new e(arrayList, bVar));
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        l.d(aVar, "");
        if (com.ss.android.ugc.aweme.settings.m.a()) {
            if (!this.f120910i) {
                this.f120910i = true;
            } else {
                return;
            }
        } else if (this.f120902a.f120913b instanceof x.a) {
            this.f120903b.b("finish need not cancel");
            return;
        }
        r.a("publish_service_cancel", new com.ss.android.ugc.tools.f.b().a("invoke_type", "realStopPublish").f149193a);
        c cVar = this.f120904c;
        if (cVar != null) {
            cVar.a(aVar);
        }
        this.f120902a.a(d.a.f129782a, null);
        a(d.f120926a);
        this.f120907f.c(this.f120902a.f120912a);
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        this.f120905d.add(kVar);
        x xVar = this.f120902a.f120913b;
        if ((xVar instanceof x.d) && ((x.d) xVar).f129905a > 0) {
            this.f120909h.execute(new b(kVar, xVar));
        }
    }

    private static boolean a(List<k> list, h.f.a.b<? super k, Boolean> bVar) {
        ListIterator<k> listIterator = list.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            if (bVar.invoke(listIterator.next()).booleanValue()) {
                listIterator.remove();
                z = true;
            }
        }
        return z;
    }

    public final void a(x xVar, String str) {
        if (!(xVar instanceof x.a) || !l.a(((x.a) xVar).f129901a, d.a.f129782a)) {
            this.f120903b.a(str + ", require cancel, but state:" + xVar);
        }
    }

    public final void a(boolean z, boolean z2) {
        BaseShortVideoContext baseShortVideoContext = this.f120902a.f120917f.f129882k;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            videoPublishEditModel.isOpenForegroundPublish = z;
            videoPublishEditModel.isBackgroundPublish = z2;
        }
    }

    public i(String str, com.ss.android.ugc.aweme.shortvideo.publish.q qVar, boolean z, e eVar, l lVar, Executor executor) {
        l.d(str, "");
        l.d(qVar, "");
        l.d(eVar, "");
        l.d(lVar, "");
        l.d(executor, "");
        this.f120911j = eVar;
        this.f120907f = lVar;
        this.f120908g = executor;
        this.f120902a = new a(qVar, this, z);
        this.f120903b = new m(str + "-PublishTask-" + this.f120902a.f120912a);
    }
}

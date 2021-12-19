package com.ss.android.ugc.aweme.story.publish.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.p;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class c extends k {

    /* renamed from: h  reason: collision with root package name */
    public static final a f138088h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<k> f138089a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<k> f138090b;

    /* renamed from: c  reason: collision with root package name */
    public volatile x f138091c;

    /* renamed from: d  reason: collision with root package name */
    public final String f138092d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f138093e;

    /* renamed from: f  reason: collision with root package name */
    public String f138094f = null;

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.b<c, z> f138095g;

    /* renamed from: i  reason: collision with root package name */
    private int f138096i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f138097j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f138098k;

    static {
        Covode.recordClassIndex(90300);
    }

    public final q a() {
        return (q) this.f138098k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90301);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        this.f138091c = x.b.f129903a;
        this.f138097j = 0;
    }

    static final class i extends m implements h.f.a.a<q> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(90309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return com.ss.android.ugc.aweme.scheduler.a.a(this.this$0.f138093e);
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ k $callback;
        final /* synthetic */ x $tmpState;

        static {
            Covode.recordClassIndex(90302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, x xVar) {
            super(0);
            this.$callback = kVar;
            this.$tmpState = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.onFinish(((x.a) this.$tmpState).f129901a, ((x.a) this.$tmpState).f129902b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$c  reason: collision with other inner class name */
    public static final class C3635c extends m implements h.f.a.a<z> {
        final /* synthetic */ k $callback;
        final /* synthetic */ x $tmpState;

        static {
            Covode.recordClassIndex(90303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3635c(k kVar, x xVar) {
            super(0);
            this.$callback = kVar;
            this.$tmpState = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.onProgress(((x.d) this.$tmpState).f129905a, ((x.d) this.$tmpState).f129906b);
            return z.f158842a;
        }
    }

    private static boolean d() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean c2 = c();
        com.ss.android.ugc.aweme.lancet.j.f107226e = c2;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $task;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(90305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, h.f.a.b bVar) {
            super(0);
            this.this$0 = cVar;
            this.$task = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll(this.this$0.f138089a);
            for (Object obj : arrayList) {
                this.$task.invoke(obj);
            }
            return z.f158842a;
        }
    }

    public final String toString() {
        return "TaskInfo[scheduleId:" + this.f138092d + ",taskId:" + this.f138094f + ",state:" + this.f138091c + ']';
    }

    private static String a(int i2) {
        String string = com.ss.android.ugc.aweme.port.in.i.f115645a.getString(i2);
        l.b(string, "");
        return string;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<k, Boolean> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(90304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(k kVar) {
            l.d(kVar, "");
            return Boolean.valueOf(!this.this$0.f138090b.contains(kVar));
        }
    }

    static final class f extends m implements h.f.a.b<k, z> {
        final /* synthetic */ Object $extra;
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.d $redirectResult;

        static {
            Covode.recordClassIndex(90306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            super(1);
            this.$redirectResult = dVar;
            this.$extra = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            kVar2.onFinish(this.$redirectResult, this.$extra);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<k, z> {
        final /* synthetic */ Object $extra;
        final /* synthetic */ int $progress;

        static {
            Covode.recordClassIndex(90307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2, Object obj) {
            super(1);
            this.$progress = i2;
            this.$extra = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            kVar2.onProgress(this.$progress, this.$extra);
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<k, z> {
        final /* synthetic */ Object $extra;
        final /* synthetic */ String $stage;
        final /* synthetic */ ah $state;

        static {
            Covode.recordClassIndex(90308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, ah ahVar, Object obj) {
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

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<k, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.x $callback;

        static {
            Covode.recordClassIndex(90310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.shortvideo.x xVar) {
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
            if (!(kVar2 instanceof com.ss.android.ugc.aweme.scheduler.f) || !l.a(((com.ss.android.ugc.aweme.scheduler.f) kVar2).f120859a, this.$callback)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    private final void a(h.f.a.b<? super k, z> bVar) {
        com.ss.android.ugc.asve.f.g.a(new e(this, bVar));
    }

    private final void a(String str) {
        com.ss.android.ugc.tools.utils.q.a("StoryScheduleTask," + str + " | " + this);
    }

    private static String a(p pVar) {
        Throwable th;
        String str;
        Throwable th2 = null;
        if (pVar != null) {
            th = pVar.f129870d;
        } else {
            th = null;
        }
        if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            Throwable th3 = pVar.f129870d;
            Objects.requireNonNull(th3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            str = ((com.ss.android.ugc.aweme.base.api.a.b.a) th3).getErrorMsg();
        } else {
            str = null;
        }
        if ((pVar == null || !pVar.f129869c) && d()) {
            if (pVar != null) {
                th2 = pVar.f129870d;
            }
            if (com.ss.android.ugc.aweme.publish.g.c.a.b(th2) == 100101) {
                str = a((int) R.string.g8k);
            }
        } else {
            str = a((int) R.string.g8h);
        }
        if (str == null || str.length() == 0) {
            return a((int) R.string.g8g);
        }
        return str;
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        a("removeCallback,callback:" + kVar.getClass());
        this.f138089a.remove(kVar);
        this.f138090b.remove(kVar);
    }

    public final boolean a(boolean z) {
        a("destroy");
        x xVar = this.f138091c;
        if (z || (xVar instanceof x.a)) {
            this.f138097j = 0;
            if ((!(xVar instanceof x.a) || !(((x.a) xVar).f129901a instanceof d.c)) && !z) {
                n.a((List) this.f138089a, (h.f.a.b) new d(this));
            } else {
                this.f138089a.clear();
                this.f138090b.clear();
            }
            return true;
        }
        a("directly quit destroy,forceClear:".concat(String.valueOf(z)));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onProgress(int i2, Object obj) {
        super.onProgress(i2, obj);
        if (this.f138091c instanceof x.d) {
            x xVar = this.f138091c;
            Objects.requireNonNull(xVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.PublishState.Running");
            if (((x.d) xVar).f129905a >= i2) {
                return;
            }
        }
        this.f138091c = new x.d(i2, obj);
        a("onProgressUpdate:".concat(String.valueOf(i2)));
        a(new g(i2, obj));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
        l.d(dVar, "");
        super.onFinish(dVar, obj);
        a("onFinish");
        boolean z = dVar instanceof d.b;
        if (z) {
            if (this.f138096i <= 0) {
                a("disable auto retry caused by task configure.");
            } else if (!(this.f138091c instanceof x.d)) {
                a("disable auto retry caused by task is not running");
            } else {
                com.ss.android.ugc.aweme.df.c cVar = c.C1870c.f80046a;
                l.b(cVar, "");
                if (cVar.a()) {
                    a("disable auto retry caused by app in in background");
                } else {
                    int i2 = this.f138097j;
                    this.f138097j = i2 + 1;
                    if (i2 >= this.f138096i) {
                        a("disable auto retry caused by time reach.retryTime:" + this.f138096i + ",current:" + this.f138097j);
                    } else {
                        this.f138095g.invoke(this);
                        return;
                    }
                }
            }
        }
        this.f138097j = 0;
        this.f138091c = new x.a(dVar, obj);
        if (z) {
            p pVar = ((d.b) dVar).f129783a;
            dVar = new d.b(new p(a(pVar), pVar.f129868b, pVar.f129869c, pVar.f129870d, pVar.f129871e));
        } else if (dVar instanceof d.a) {
            dVar = new d.b(new p(a((p) null), "", false, new Throwable("auto cancel"), null));
        }
        a(new f(dVar, obj));
    }

    public final void a(k kVar, boolean z) {
        l.d(kVar, "");
        a("addCallback,callback:" + kVar.getClass() + ",isPermanent:" + z);
        x xVar = this.f138091c;
        if (xVar instanceof x.a) {
            com.ss.android.ugc.asve.f.g.a(new b(kVar, xVar));
            return;
        }
        this.f138089a.add(kVar);
        if (z) {
            this.f138090b.add(kVar);
        }
        if ((xVar instanceof x.d) && ((x.d) xVar).f129905a > 0) {
            com.ss.android.ugc.asve.f.g.a(new C3635c(kVar, xVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onStageUpdate(String str, ah ahVar, Object obj) {
        l.d(str, "");
        l.d(ahVar, "");
        super.onStageUpdate(str, ahVar, obj);
        a(new h(str, ahVar, obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.story.publish.a.c, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, Bundle bundle, String str2, h.f.a.b<? super c, z> bVar) {
        l.d(str, "");
        l.d(bundle, "");
        l.d(bVar, "");
        this.f138092d = str;
        this.f138093e = bundle;
        this.f138095g = bVar;
        this.f138096i = bundle.getInt("extra_auto_retry", 0);
        this.f138089a = new ArrayList();
        this.f138090b = new LinkedHashSet();
        this.f138091c = x.b.f129903a;
        this.f138098k = h.i.a((h.f.a.a) new i(this));
    }
}

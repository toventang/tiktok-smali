package com.ss.android.ugc.aweme.story.publish.a;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.df.j;
import com.ss.android.ugc.aweme.scheduler.i;
import com.ss.android.ugc.aweme.scheduler.l;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dq;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f138060e = SettingsManager.a().a("enable_all_schedule_alog", false);

    /* renamed from: f  reason: collision with root package name */
    public static final a f138061f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f138062a = 10;

    /* renamed from: b  reason: collision with root package name */
    public final int f138063b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f138064c = false;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f138065d = true;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f138066g = h.i.a((h.f.a.a) new g(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f138067h = h.i.a((h.f.a.a) e.f138079a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f138068i = h.i.a((h.f.a.a) f.f138080a);

    /* renamed from: j  reason: collision with root package name */
    private final boolean f138069j = true;

    private final com.ss.android.ugc.aweme.scheduler.e c() {
        return (com.ss.android.ugc.aweme.scheduler.e) this.f138068i.getValue();
    }

    public final l a() {
        return (l) this.f138066g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService b() {
        return (ExecutorService) this.f138067h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.scheduler.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f138080a = new f();

        static {
            Covode.recordClassIndex(90296);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.scheduler.e invoke() {
            return new com.ss.android.ugc.aweme.scheduler.e();
        }
    }

    static final class e extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f138079a = new e();

        static {
            Covode.recordClassIndex(90295);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
            a2.f79173b = "StoryPublishTaskExecutor";
            return com.ss.android.ugc.aweme.cw.g.a(a2.a());
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.scheduler.l> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.scheduler.l invoke() {
            return new com.ss.android.ugc.aweme.scheduler.l(this.this$0.f138062a, this.this$0.f138063b, this.this$0.f138065d, this.this$0.f138064c);
        }
    }

    static {
        Covode.recordClassIndex(90290);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f138073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f138074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f138075c;

        static {
            Covode.recordClassIndex(90293);
        }

        c(i.a aVar, x xVar, k kVar) {
            this.f138073a = aVar;
            this.f138074b = xVar;
            this.f138075c = kVar;
        }

        public final void run() {
            this.f138075c.onFinish(((x.a) this.f138074b).f129901a, ((x.a) this.f138074b).f129902b);
            bj.d("StoryPublishTaskExecutor | addCallback direct finish " + this.f138073a.f120912a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138082b = null;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f138083c;

        static {
            Covode.recordClassIndex(90298);
        }

        h(b bVar, String str, k kVar) {
            this.f138081a = bVar;
            this.f138083c = kVar;
        }

        public final void run() {
            Iterator<T> it = this.f138081a.a().b(this.f138082b).iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.scheduler.i iVar = it.next().f120916e;
                if (iVar != null) {
                    iVar.b(this.f138083c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$b  reason: collision with other inner class name */
    public static final class RunnableC3634b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f138071b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f138072c;

        static {
            Covode.recordClassIndex(90292);
        }

        RunnableC3634b(b bVar, k kVar, String str) {
            this.f138070a = bVar;
            this.f138071b = kVar;
            this.f138072c = str;
        }

        public final void run() {
            b bVar = this.f138070a;
            k kVar = this.f138071b;
            String str = this.f138072c;
            h.f.b.l.d(kVar, "");
            i.a a2 = bVar.a().a(str);
            if (a2 != null) {
                x xVar = a2.f120913b;
                if (xVar instanceof x.a) {
                    j.f80052a.execute(new c(a2, xVar, kVar));
                    return;
                }
                com.ss.android.ugc.aweme.scheduler.i iVar = a2.f120916e;
                if (iVar != null) {
                    iVar.a(kVar);
                    bj.d("StoryPublishTaskExecutor | addCallback success " + a2.f120912a);
                }
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.a.a f138078c;

        static {
            Covode.recordClassIndex(90294);
        }

        d(b bVar, String str, com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
            this.f138076a = bVar;
            this.f138077b = str;
            this.f138078c = aVar;
        }

        public final void run() {
            List<i.a> b2 = this.f138076a.a().b(this.f138077b);
            ArrayList<i.a> arrayList = new ArrayList();
            for (T t : b2) {
                if (!(t.f120913b instanceof x.a)) {
                    arrayList.add(t);
                }
            }
            for (i.a aVar : arrayList) {
                com.ss.android.ugc.aweme.scheduler.i iVar = aVar.f120916e;
                if (iVar != null) {
                    iVar.a(this.f138078c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f138084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f138085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f138086c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f138087d;

        static {
            Covode.recordClassIndex(90299);
        }

        i(i.a aVar, b bVar, String str, q qVar) {
            this.f138084a = aVar;
            this.f138085b = bVar;
            this.f138086c = str;
            this.f138087d = qVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.scheduler.i iVar;
            this.f138084a.a(this.f138087d);
            x xVar = this.f138084a.f120913b;
            if (xVar instanceof x.b) {
                com.ss.android.ugc.aweme.scheduler.h.c("ReStartNewPublish " + this.f138086c);
            } else if (xVar instanceof x.a) {
                com.ss.android.ugc.aweme.shortvideo.publish.d dVar = ((x.a) xVar).f129901a;
                if (dVar instanceof d.c) {
                    com.ss.android.ugc.aweme.scheduler.h.c("ReStartAlreadySuccessPublish " + this.f138086c);
                } else if (dVar instanceof d.a) {
                    bj.a("PublishScheduler | reStart Cancel Publish, reStart new. old:" + this.f138086c + " new:" + this.f138085b.b(this.f138087d));
                } else if (dVar instanceof d.b) {
                    bj.a("PublishScheduler | reStart Failed Publish, reStart new. old:" + this.f138086c + " new:" + this.f138085b.b(this.f138087d));
                }
            } else if ((xVar instanceof x.d) && (iVar = this.f138084a.f120916e) != null) {
                iVar.a();
            }
        }
    }

    public static Bitmap a(q qVar) {
        h.f.b.l.d(qVar, "");
        if (!(qVar.f129882k instanceof VideoPublishEditModel)) {
            return null;
        }
        BaseShortVideoContext baseShortVideoContext = qVar.f129882k;
        Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        return dq.a((VideoPublishEditModel) baseShortVideoContext);
    }

    public final void a(k kVar) {
        h.f.b.l.d(kVar, "");
        bj.d("StoryPublishTaskExecutor | removeCallback call " + ((String) null));
        b().execute(new h(this, null, kVar));
    }

    public final String b(q qVar) {
        boolean z = f138060e;
        com.ss.android.ugc.aweme.scheduler.e c2 = c();
        com.ss.android.ugc.aweme.scheduler.l a2 = a();
        ExecutorService b2 = b();
        h.f.b.l.b(b2, "");
        com.ss.android.ugc.aweme.scheduler.i iVar = new com.ss.android.ugc.aweme.scheduler.i("StoryPublishTaskExecutor", qVar, z, c2, a2, b2);
        if (!a().a(iVar.f120902a)) {
            return null;
        }
        b().execute(iVar);
        bj.a("StoryPublishTaskExecutor | startNewPublish creationId:" + qVar.f129873b + " publishId:" + iVar.f120902a.f120912a);
        return iVar.f120902a.f120912a;
    }

    public final void a(k kVar, String str) {
        h.f.b.l.d(kVar, "");
        bj.d("StoryPublishTaskExecutor | addCallback call ".concat(String.valueOf(str)));
        b().execute(new RunnableC3634b(this, kVar, str));
    }

    public final String a(Bundle bundle, String str, com.ss.android.ugc.aweme.scheduler.k kVar) {
        h.f.b.l.d(bundle, "");
        return a(com.ss.android.ugc.aweme.scheduler.a.a(bundle), str, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String a(com.ss.android.ugc.aweme.shortvideo.publish.q r5, java.lang.String r6, com.ss.android.ugc.aweme.scheduler.k r7) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.publish.a.b.a(com.ss.android.ugc.aweme.shortvideo.publish.q, java.lang.String, com.ss.android.ugc.aweme.scheduler.k):java.lang.String");
    }
}

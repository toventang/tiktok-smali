package com.ss.android.ugc.aweme.sharedar;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.n;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.tools.utils.q;
import com.ss.ugc.effectplatform.model.Effect;
import h.c.f;
import h.f.b.l;
import h.h;
import h.i;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f124471j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f124472a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    final h f124473b = i.a((h.f.a.a) C3253c.f124488a);

    /* renamed from: c  reason: collision with root package name */
    final h f124474c = i.a((h.f.a.a) e.f124489a);

    /* renamed from: d  reason: collision with root package name */
    final h f124475d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    public final t<Integer> f124476e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final t<Boolean> f124477f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public final androidx.fragment.app.e f124478g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f124479h;

    /* renamed from: i  reason: collision with root package name */
    public final m f124480i;

    /* renamed from: k  reason: collision with root package name */
    private Effect f124481k;

    /* renamed from: l  reason: collision with root package name */
    private final h f124482l = i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(81738);
    }

    public final d c() {
        return (d) this.f124482l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81739);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharedar.b
    public final LiveData<Boolean> b() {
        return this.f124477f;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.c$c  reason: collision with other inner class name */
    static final class C3253c extends h.f.b.m implements h.f.a.a<CoroutineExceptionHandler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3253c f124488a = new C3253c();

        static {
            Covode.recordClassIndex(81747);
        }

        C3253c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CoroutineExceptionHandler invoke() {
            return new a(CoroutineExceptionHandler.f158926c);
        }

        /* renamed from: com.ss.android.ugc.aweme.sharedar.c$c$a */
        public static final class a extends h.c.a implements CoroutineExceptionHandler {
            static {
                Covode.recordClassIndex(81748);
            }

            public a(f.c cVar) {
                super(cVar);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public final void handleException(h.c.f fVar, Throwable th) {
                StringBuilder sb = new StringBuilder("Thread[");
                Thread currentThread = Thread.currentThread();
                l.b(currentThread, "");
                q.a("SharedAR", sb.append(currentThread.getName()).append("], exception: ").append(Log.getStackTraceString(th)).toString());
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f124489a = new e();

        static {
            Covode.recordClassIndex(81750);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            return cd.a(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharedar.b
    public final void a() {
        c().a(16385, 10, 0, null);
    }

    public final Effect d() {
        Effect effect = this.f124481k;
        if (effect == null) {
            l.a("effect");
        }
        return effect;
    }

    static final class f extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((com.bytedance.o.f) this.this$0.f124472a.getValue(), this.this$0.f124479h, new h.f.a.a<Boolean>(this) {
                /* class com.ss.android.ugc.aweme.sharedar.c.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(81752);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    ac a2 = ae.a(this.this$0.this$0.f124478g, (ad.b) null).a(ShortVideoContextViewModel.class);
                    l.b(a2, "");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
                    if (shortVideoContext != null) {
                        z = shortVideoContext.b();
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.o.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.o.f invoke() {
            com.ss.android.ugc.aweme.sharedar.a.a aVar = new com.ss.android.ugc.aweme.sharedar.a.a();
            AnonymousClass1 r2 = new h.f.a.b<n, h.z>(this) {
                /* class com.ss.android.ugc.aweme.sharedar.c.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(81741);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$a */
                public static final class a extends p<androidx.fragment.app.e> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f124483a;

                    static {
                        Covode.recordClassIndex(81742);
                    }

                    public a(AnonymousClass1 r1) {
                        this.f124483a = r1;
                    }

                    @Override // com.bytedance.o.p
                    public final androidx.fragment.app.e get(com.bytedance.o.f fVar) {
                        l.d(fVar, "");
                        return this.f124483a.this$0.this$0.f124478g;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$b  reason: collision with other inner class name */
                public static final class C3251b extends p<com.bytedance.creativex.recorder.b.a.d> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f124484a;

                    static {
                        Covode.recordClassIndex(81743);
                    }

                    public C3251b(AnonymousClass1 r1) {
                        this.f124484a = r1;
                    }

                    @Override // com.bytedance.o.p
                    public final com.bytedance.creativex.recorder.b.a.d get(com.bytedance.o.f fVar) {
                        l.d(fVar, "");
                        return this.f124484a.this$0.this$0.f124479h;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$c  reason: collision with other inner class name */
                public static final class C3252c extends p<m> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f124485a;

                    static {
                        Covode.recordClassIndex(81744);
                    }

                    public C3252c(AnonymousClass1 r1) {
                        this.f124485a = r1;
                    }

                    @Override // com.bytedance.o.p
                    public final m get(com.bytedance.o.f fVar) {
                        l.d(fVar, "");
                        return this.f124485a.this$0.this$0.f124480i;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$d */
                public static final class d extends p<c> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f124486a;

                    static {
                        Covode.recordClassIndex(81745);
                    }

                    public d(AnonymousClass1 r1) {
                        this.f124486a = r1;
                    }

                    @Override // com.bytedance.o.p
                    public final c get(com.bytedance.o.f fVar) {
                        l.d(fVar, "");
                        return this.f124486a.this$0.this$0;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.sharedar.c$b$1$e */
                public static final class e extends p<am> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f124487a;

                    static {
                        Covode.recordClassIndex(81746);
                    }

                    public e(AnonymousClass1 r1) {
                        this.f124487a = r1;
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.am, java.lang.Object] */
                    /* JADX WARNING: Unknown variable types count: 1 */
                    @Override // com.bytedance.o.p
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final kotlinx.coroutines.am get(com.bytedance.o.f r2) {
                        /*
                            r1 = this;
                            java.lang.String r0 = ""
                            h.f.b.l.d(r2, r0)
                            com.ss.android.ugc.aweme.sharedar.c$b$1 r0 = r1.f124487a
                            com.ss.android.ugc.aweme.sharedar.c$b r0 = r0.this$0
                            com.ss.android.ugc.aweme.sharedar.c r0 = r0.this$0
                            h.h r0 = r0.f124475d
                            java.lang.Object r0 = r0.getValue()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sharedar.c.b.AnonymousClass1.e.get(com.bytedance.o.f):java.lang.Object");
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(n nVar) {
                    n nVar2 = nVar;
                    l.d(nVar2, "");
                    l.b(nVar2.a(androidx.fragment.app.e.class, (String) null, (p) new a(this)), "");
                    l.b(nVar2.a(com.bytedance.creativex.recorder.b.a.d.class, (String) null, (p) new C3251b(this)), "");
                    l.b(nVar2.a(m.class, (String) null, (p) new C3252c(this)), "");
                    l.b(nVar2.a(c.class, (String) null, (p) new d(this)), "");
                    l.b(nVar2.a(am.class, (String) null, (p) new e(this)), "");
                    return h.z.f158842a;
                }
            };
            l.d(aVar, "");
            l.d(r2, "");
            r2.invoke(aVar.a());
            com.bytedance.o.f a2 = aVar.a().a();
            l.b(a2, "");
            return a2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<am> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ am invoke() {
            return an.a(com.ss.android.ugc.asve.editor.d.f62009a.plus((z) this.this$0.f124474c.getValue()).plus((CoroutineExceptionHandler) this.this$0.f124473b.getValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.sharedar.b
    public final void a(Effect effect) {
        l.d(effect, "");
        this.f124481k = effect;
    }

    @Override // com.ss.android.ugc.aweme.sharedar.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_url", str);
        jSONObject.put("invitee_name", str2);
        c().a(16385, 6, 0, jSONObject.toString());
    }

    public c(androidx.fragment.app.e eVar, com.bytedance.creativex.recorder.b.a.d dVar, m mVar) {
        l.d(eVar, "");
        l.d(dVar, "");
        l.d(mVar, "");
        this.f124478g = eVar;
        this.f124479h = dVar;
        this.f124480i = mVar;
    }

    public final void a(int i2, long j2, long j3, String str) {
        c().a(i2, j2, j3, str);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.b
    public final void a(int i2, int i3, int i4, String str) {
        d c2 = c();
        long j2 = (long) i2;
        long j3 = (long) i3;
        long j4 = (long) i4;
        if (c2.f124493c.invoke().booleanValue()) {
            for (com.ss.android.ugc.aweme.sharedar.a.a.a aVar : (List) c2.f124491a.getValue()) {
                if (d.a(16385, j2) && d.a(aVar.a(), j3)) {
                    q.a("SharedAR", "[Effect --> Client]: msgID(" + j2 + "), arg1(" + j3 + "), arg2(" + j4 + "), arg3(" + str + "), match handler=" + aVar.getClass().getSimpleName());
                    aVar.a((int) j2, j4, str);
                }
            }
        }
    }
}

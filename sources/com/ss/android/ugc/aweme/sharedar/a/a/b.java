package com.ss.android.ugc.aweme.sharedar.a.a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.u;
import h.z;
import java.io.File;
import kotlinx.coroutines.am;
import kotlinx.coroutines.n;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124439b = {new y(b.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(b.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0), new y(b.class, "coroutineScope", "getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f124440d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final h f124441c = h.i.a((h.f.a.a) C3248b.f124448a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f124442e = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f124443f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.sharedar.c.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f124444g = com.bytedance.o.b.a.a(getDiContainer(), am.class);

    /* renamed from: h  reason: collision with root package name */
    private final h f124445h = h.i.a((h.f.a.a) e.f124450a);

    /* renamed from: i  reason: collision with root package name */
    private int f124446i;

    /* renamed from: j  reason: collision with root package name */
    private u<String, String, String> f124447j;

    static {
        Covode.recordClassIndex(81707);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 12;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f124442e.a(this, f124439b[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.sharedar.c c() {
        return (com.ss.android.ugc.aweme.sharedar.c) this.f124443f.a(this, f124439b[1]);
    }

    public final com.ss.android.ugc.aweme.sharedar.h d() {
        return (com.ss.android.ugc.aweme.sharedar.h) this.f124445h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81708);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.sharedar.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f124450a = new e();

        static {
            Covode.recordClassIndex(81714);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sharedar.h invoke() {
            return new com.ss.android.ugc.aweme.sharedar.h();
        }
    }

    public final ShortVideoContext e() {
        ac a2 = ae.a(b(), (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        return shortVideoContext;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$b  reason: collision with other inner class name */
    static final class C3248b extends m implements h.f.a.a<File> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3248b f124448a = new C3248b();

        static {
            Covode.recordClassIndex(81709);
        }

        C3248b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ File invoke() {
            File a2 = g.a().g().c().a(g.a().g().c().g(g.a().g().c().d("shared_ar")), "avatar");
            if (!a2.exists() && !a2.mkdirs()) {
                q.b("create shared ar effect avatar temp directory failed.");
            }
            return a2;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ u $config;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(81715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, u uVar) {
            super(0);
            this.this$0 = bVar;
            this.$config = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(11122);
            String a2 = com.ss.android.ugc.aweme.sharedar.e.a(this.this$0.b());
            q.a("SharedAR", "my carrier name: ".concat(String.valueOf(a2)));
            SharedARModel sharedARModel = this.this$0.e().S;
            if (sharedARModel != null) {
                sharedARModel.setSharedARTelco(a2);
            }
            boolean z = this.this$0.d().f124500a.getBoolean("shared_ar_dialog_shown", false);
            if (this.this$0.e().b() && !z) {
                com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this.this$0.b());
                bVar.a(R.string.fv1, AnonymousClass1.f124451a);
                com.bytedance.tux.dialog.b a3 = a.C1094a.a(this.this$0.b());
                b bVar2 = this.this$0;
                androidx.fragment.app.e b2 = bVar2.b();
                Object third = this.$config.getThird();
                View inflate = LayoutInflater.from(b2).inflate(R.layout.f9, (ViewGroup) null);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                File a4 = g.a().g().c().a(g.a().g().c().g(bVar2.c().d().getUnzipPath()), "/".concat(String.valueOf(third)));
                if (a4.exists()) {
                    v a5 = r.a(a4);
                    a5.E = (SmartImageView) inflate.findViewById(R.id.eir);
                    a5.c();
                }
                l.b(inflate, "");
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.e.d.a(a3, inflate).b((CharSequence) this.$config.getFirst()).d((CharSequence) this.$config.getSecond()).a(bVar).a(false)).a().b().show();
                this.this$0.d().f124500a.storeBoolean("shared_ar_dialog_shown", true);
            }
            z zVar = z.f158842a;
            MethodCollector.o(11122);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.m f124449a;

        static {
            Covode.recordClassIndex(81710);
        }

        c(kotlinx.coroutines.m mVar) {
            this.f124449a = mVar;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            this.f124449a.resumeWith(h.q.m223constructorimpl(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(81711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.b$d$b  reason: collision with other inner class name */
        public static final class C3249b extends k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
            final /* synthetic */ File $avatarFile;
            final /* synthetic */ Bitmap $bitmap;
            int label;

            static {
                Covode.recordClassIndex(81713);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3249b(Bitmap bitmap, File file, h.c.d dVar) {
                super(2, dVar);
                this.$bitmap = bitmap;
                this.$avatarFile = file;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new C3249b(this.$bitmap, this.$avatarFile, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
                return ((C3249b) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    h.r.a(obj);
                    return Boolean.valueOf(com.ss.android.ugc.tools.utils.c.a(this.$bitmap, this.$avatarFile, 80, Bitmap.CompressFormat.JPEG));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements h.f.a.m<am, h.c.d<? super Bitmap>, Object> {
            int label;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(81712);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, h.c.d dVar2) {
                super(2, dVar2);
                this.this$0 = dVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Bitmap> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    h.r.a(obj);
                    this.label = 1;
                    n nVar = new n(h.c.a.b.a(this), 1);
                    com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
                    if (e2 == null) {
                        nVar.resumeWith(h.q.m223constructorimpl(null));
                    } else {
                        com.ss.android.ugc.tools.c.a.a(e2.f(), 0, 0, new c(nVar));
                    }
                    obj = nVar.e();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    h.r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 250
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sharedar.a.a.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.o.f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    public final void a(String str, File file) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filepath", file.getPath());
        jSONObject.put("username", str);
        c().a(16385, 11L, 0L, jSONObject.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, long r12, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sharedar.a.a.b.a(int, long, java.lang.String):void");
    }
}

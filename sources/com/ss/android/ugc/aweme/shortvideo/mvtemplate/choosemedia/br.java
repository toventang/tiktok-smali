package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.ai;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.utils.bh;
import com.ss.android.ugc.aweme.utils.hx;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.p;
import h.q;
import h.r;
import h.u;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class br implements v {

    /* renamed from: i  reason: collision with root package name */
    public static final a f129078i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ProgressDialog f129079a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f129080b;

    /* renamed from: c  reason: collision with root package name */
    public int f129081c;

    /* renamed from: d  reason: collision with root package name */
    volatile com.ss.android.ugc.aweme.ak.c f129082d;

    /* renamed from: e  reason: collision with root package name */
    volatile bz f129083e;

    /* renamed from: f  reason: collision with root package name */
    public final Activity f129084f;

    /* renamed from: g  reason: collision with root package name */
    public final long f129085g;

    /* renamed from: h  reason: collision with root package name */
    public final long f129086h;

    /* renamed from: j  reason: collision with root package name */
    private List<? extends MediaModel> f129087j;

    /* renamed from: k  reason: collision with root package name */
    private ShortVideoContext f129088k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f129089l = h.i.a((h.f.a.a) new j(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f129090m = h.i.a((h.f.a.a) new f(this));

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(br brVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = brVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(br brVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = brVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(null, this);
        }
    }

    static {
        Covode.recordClassIndex(84717);
    }

    private final boolean d() {
        return ((Boolean) this.f129090m.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    static final class a {
        static {
            Covode.recordClassIndex(84718);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.view.e.d f129095a;

        static {
            Covode.recordClassIndex(84734);
        }

        l(com.ss.android.ugc.tools.view.e.d dVar) {
            this.f129095a = dVar;
        }

        public final void run() {
            this.f129095a.a((Boolean) true);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(br brVar) {
            super(0);
            this.this$0 = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!this.this$0.f129080b || !ai.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f129091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ br f129092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f129093c;

        static {
            Covode.recordClassIndex(84729);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g
        public final void a() {
            this.f129092b.a(10);
            this.f129091a.resumeWith(q.m223constructorimpl(true));
        }

        g(h.c.d dVar, br brVar, List list) {
            this.f129091a = dVar;
            this.f129092b = brVar;
            this.f129093c = list;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<Handler> {
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(br brVar) {
            super(0);
            this.this$0 = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            if (this.this$0.f129084f instanceof androidx.lifecycle.m) {
                return new SafeHandler((androidx.lifecycle.m) this.this$0.f129084f);
            }
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void c() {
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2 = this.f129079a;
        if (progressDialog2 != null) {
            Boolean valueOf = Boolean.valueOf(progressDialog2.isShowing());
            if (valueOf == null) {
                h.f.b.l.b();
            }
            if (valueOf.booleanValue() && (progressDialog = this.f129079a) != null) {
                progressDialog.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ int $increaseProgress;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(br brVar, int i2) {
            super(0);
            this.this$0 = brVar;
            this.$increaseProgress = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f129081c += this.$increaseProgress;
            ProgressDialog progressDialog = this.this$0.f129079a;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.setProgress(Math.min(this.this$0.f129081c, 100));
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.tools.view.e.d */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        com.ss.android.ugc.tools.view.e.b bVar;
        Activity activity = this.f129084f;
        if (activity != null && !activity.isFinishing()) {
            ProgressDialog progressDialog = this.f129079a;
            if (progressDialog == null || !progressDialog.isShowing()) {
                if (d()) {
                    Activity activity2 = this.f129084f;
                    com.ss.android.ugc.tools.view.e.d a2 = com.ss.android.ugc.tools.view.e.d.a(activity2, activity2.getString(R.string.g4k));
                    a2.a(new k(this));
                    ((Handler) this.f129089l.getValue()).postDelayed(new l(a2), 5000);
                    a(0);
                    bVar = a2;
                } else {
                    Activity activity3 = this.f129084f;
                    com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(activity3, activity3.getString(R.string.g4k));
                    b2.setIndeterminate(true);
                    bVar = b2;
                }
                this.f129079a = bVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(br brVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = brVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new e(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.b();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(br brVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = brVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new i(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.b();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ br f129094a;

        static {
            Covode.recordClassIndex(84733);
        }

        k(br brVar) {
            this.f129094a = brVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129094a.c();
            br brVar = this.f129094a;
            bz bzVar = brVar.f129083e;
            if (bzVar != null) {
                bzVar.a((CancellationException) null);
            }
            com.ss.android.ugc.aweme.ak.c cVar = brVar.f129082d;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public final void a(int i2) {
        if (d()) {
            hx.a(0, new m(this, i2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $videosInfo;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(br brVar, List list, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = brVar;
            this.$videosInfo = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            b bVar = new b(this.this$0, this.$videosInfo, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
            int label;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(84721);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = bVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    br brVar = this.this$0.this$0;
                    List<? extends MediaModel> list = this.this$0.$videosInfo;
                    this.label = 1;
                    obj = brVar.a(list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br$b$b  reason: collision with other inner class name */
        public static final class C3361b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
            int label;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(84722);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3361b(b bVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = bVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new C3361b(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
                return ((C3361b) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    br brVar = this.this$0.this$0;
                    List<? extends MediaModel> list = this.this$0.$videosInfo;
                    this.label = 1;
                    obj = brVar.b(list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super p<? extends Boolean, ? extends String>>, Object> {
        final /* synthetic */ int $percent;
        final /* synthetic */ VideoSegment $segment;
        final /* synthetic */ com.ss.android.ugc.aweme.ak.c $videoCompressHelper;
        Object L$0;
        int label;
        final /* synthetic */ br this$0;

        static {
            Covode.recordClassIndex(84723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(br brVar, com.ss.android.ugc.aweme.ak.c cVar, VideoSegment videoSegment, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = brVar;
            this.$videoCompressHelper = cVar;
            this.$segment = videoSegment;
            this.$percent = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new c(this.this$0, this.$videoCompressHelper, this.$segment, this.$percent, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super p<? extends Boolean, ? extends String>> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class b extends h.f.b.m implements h.f.a.b<Float, z> {
            final /* synthetic */ z.c $lastProgress;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(84725);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(z.c cVar, c cVar2) {
                super(1);
                this.$lastProgress = cVar;
                this.this$0 = cVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Float f2) {
                int floatValue = (int) (f2.floatValue() * ((float) this.this$0.$percent));
                if (floatValue - this.$lastProgress.element > 0) {
                    this.this$0.this$0.a(floatValue - this.$lastProgress.element);
                    this.$lastProgress.element = floatValue;
                }
                return h.z.f158842a;
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.L$0 = this;
                this.label = 1;
                h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                z.c cVar = new z.c();
                cVar.element = 0;
                this.$videoCompressHelper.a(null, this.$segment, new b(cVar, this), new a(hVar));
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    h.f.b.l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.f.b.m implements h.f.a.m<Boolean, String, h.z> {
            final /* synthetic */ h.c.d $continuation;

            static {
                Covode.recordClassIndex(84724);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.c.d dVar) {
                super(2);
                this.$continuation = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ h.z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                h.f.b.l.d(str, "");
                bh.a(this.$continuation, v.a(Boolean.valueOf(booleanValue), str));
                return h.z.f158842a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r8, h.c.d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br.b(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r18, h.c.d<? super java.lang.Boolean> r19) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.br.a(java.util.List, h.c.d):java.lang.Object");
    }

    public br(Activity activity, long j2, long j3) {
        h.f.b.l.d(activity, "");
        this.f129084f = activity;
        this.f129085g = j2;
        this.f129086h = j3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        boolean z;
        String str;
        boolean z2;
        h.f.b.l.d(intent, "");
        if (i3 == -1 && i2 == 2) {
            if (intent.getIntExtra("key_choose_scene", -1) == 13) {
                z = true;
            } else {
                z = false;
            }
            this.f129080b = z;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra != null) {
                this.f129087j = parcelableArrayListExtra;
                this.f129088k = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                List<? extends MediaModel> list = this.f129087j;
                if (list == null) {
                    h.f.b.l.a("selectedMediaData");
                }
                u<Boolean, Integer, Long> a2 = bq.a(this.f129084f, list, this.f129085g, this.f129086h);
                boolean booleanValue = a2.component1().booleanValue();
                int intValue = a2.component2().intValue();
                long longValue = a2.component3().longValue();
                if (booleanValue) {
                    ShortVideoContext shortVideoContext = this.f129088k;
                    if (list.size() > 1) {
                        str = "multiple_content";
                    } else {
                        str = "single_content";
                    }
                    int size = list.size() - intValue;
                    String a3 = com.ss.android.ugc.aweme.shortvideo.ac.b.a(intValue, list.size() - intValue);
                    if (list.size() > 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.f(shortVideoContext, "video", str, intValue, size, a3, z2).a((int) longValue).b(1).a(this.f129088k).a();
                    this.f129081c = 0;
                    bz bzVar = this.f129083e;
                    if (bzVar != null) {
                        bzVar.a((CancellationException) null);
                    }
                    this.f129083e = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new b(this, list, null), 3);
                }
            }
        }
    }
}

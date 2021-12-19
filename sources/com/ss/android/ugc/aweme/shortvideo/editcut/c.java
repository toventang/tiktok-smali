package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.ai;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ad;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ae;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.bh;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.view.b;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.r;
import h.u;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class c implements com.ss.android.ugc.aweme.ak.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f128242j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ProgressDialog f128243a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ak.c f128244b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends VideoSegment> f128245c;

    /* renamed from: d  reason: collision with root package name */
    public int f128246d;

    /* renamed from: e  reason: collision with root package name */
    public long f128247e;

    /* renamed from: f  reason: collision with root package name */
    public long f128248f;

    /* renamed from: g  reason: collision with root package name */
    public final Activity f128249g;

    /* renamed from: h  reason: collision with root package name */
    public final long f128250h;

    /* renamed from: i  reason: collision with root package name */
    public final long f128251i;

    /* renamed from: k  reason: collision with root package name */
    private bz f128252k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f128253l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f128254m = h.i.a((h.f.a.a) new m(this));
    private final h.h n = h.i.a((h.f.a.a) h.f128262a);
    private long o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$c  reason: collision with other inner class name */
    public static final class C3346c extends h.c.b.a.d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3346c(c cVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    static {
        Covode.recordClassIndex(84065);
    }

    private final Handler d() {
        return (Handler) this.f128254m.getValue();
    }

    private final boolean e() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84066);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f128255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f128256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f128257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f128258d;

        /* renamed from: e  reason: collision with root package name */
        private List<? extends com.ss.android.ugc.aweme.shortvideo.c> f128259e;

        /* renamed from: f  reason: collision with root package name */
        private final long f128260f = System.currentTimeMillis();

        /* renamed from: g  reason: collision with root package name */
        private long f128261g;

        static {
            Covode.recordClassIndex(84072);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void b() {
            a(false, this.f128259e);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void c() {
            a(false, this.f128259e);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a() {
            long currentTimeMillis = System.currentTimeMillis();
            this.f128261g = currentTimeMillis;
            this.f128256b.f128247e = currentTimeMillis - this.f128260f;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
            this.f128259e = list;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void b(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            a(false, null);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f128256b.f128248f = System.currentTimeMillis() - this.f128261g;
            a(true, this.f128259e);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            a(false, null);
        }

        private final void a(boolean z, List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
            this.f128256b.a(10);
            this.f128255a.resumeWith(h.q.m223constructorimpl(new u(Boolean.valueOf(z), list, Long.valueOf(System.currentTimeMillis() - this.f128258d))));
        }

        e(h.c.d dVar, c cVar, List list, long j2) {
            this.f128255a = dVar;
            this.f128256b = cVar;
            this.f128257c = list;
            this.f128258d = j2;
        }
    }

    public static final class p implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128269a;

        static {
            Covode.recordClassIndex(84089);
        }

        @Override // com.ss.android.ugc.aweme.view.b.c
        public final void a() {
            this.f128269a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(c cVar) {
            this.f128269a = cVar;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f128262a = new h();

        static {
            Covode.recordClassIndex(84075);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(ai.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.view.e.d f128268a;

        static {
            Covode.recordClassIndex(84088);
        }

        o(com.ss.android.ugc.tools.view.e.d dVar) {
            this.f128268a = dVar;
        }

        public final void run() {
            this.f128268a.a((Boolean) true);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Handler> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            if (this.this$0.f128249g instanceof androidx.lifecycle.m) {
                return new SafeHandler((androidx.lifecycle.m) this.this$0.f128249g);
            }
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void a() {
        b("click");
        b(3);
        this.f128253l = true;
        bz bzVar = this.f128252k;
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
        com.ss.android.ugc.aweme.ak.c cVar = this.f128244b;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void c() {
        ProgressDialog progressDialog = this.f128243a;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.ss.android.ugc.tools.view.widget.k.b(this.f128243a);
            d().removeCallbacksAndMessages(null);
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f128263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f128264b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f128265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f128266d;

        static {
            Covode.recordClassIndex(84076);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g
        public final void a() {
            this.f128264b.a(10);
            this.f128263a.resumeWith(h.q.m223constructorimpl(v.a(true, Long.valueOf(System.currentTimeMillis() - this.f128266d))));
        }

        i(h.c.d dVar, c cVar, List list, long j2) {
            this.f128263a = dVar;
            this.f128264b = cVar;
            this.f128265c = list;
            this.f128266d = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ int $increaseProgress;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar, int i2) {
            super(0);
            this.this$0 = cVar;
            this.$increaseProgress = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f128246d += this.$increaseProgress;
            ProgressDialog progressDialog = this.this$0.f128243a;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.setProgress(Math.min(this.this$0.f128246d, 100));
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.tools.view.e.d */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        com.ss.android.ugc.aweme.view.b bVar;
        if (!this.f128249g.isFinishing()) {
            ProgressDialog progressDialog = this.f128243a;
            if (progressDialog == null || !progressDialog.isShowing()) {
                if (e()) {
                    Activity activity = this.f128249g;
                    com.ss.android.ugc.tools.view.e.d a2 = com.ss.android.ugc.tools.view.e.d.a(activity, activity.getString(R.string.g4k));
                    a2.a(new n(this));
                    d().postDelayed(new o(a2), 5000);
                    a(0);
                    bVar = a2;
                } else {
                    com.ss.android.ugc.aweme.view.b a3 = b.C3836b.a(this.f128249g, b.a.VISIBLE, new p(this));
                    a3.setMessage(this.f128249g.getString(R.string.g4k));
                    bVar = a3;
                }
                this.f128243a = bVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f128267a;

        static {
            Covode.recordClassIndex(84087);
        }

        n(c cVar) {
            this.f128267a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128267a.c();
            this.f128267a.a();
        }
    }

    public static void a(String str) {
        bj.a("CutOptimizedVideoChosenHandler:".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
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
    public static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new g(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
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
    public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new k(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((k) create(amVar, dVar)).invokeSuspend(z.f158842a);
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

    private static long b(List<? extends VideoSegment> list) {
        Iterator<T> it = list.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().f125478b;
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.p<? extends Boolean, ? extends String>>, Object> {
        final /* synthetic */ int $percent;
        final /* synthetic */ VideoSegment $segment;
        final /* synthetic */ com.ss.android.ugc.aweme.ak.c $videoCompressHelper;
        Object L$0;
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, com.ss.android.ugc.aweme.ak.c cVar2, VideoSegment videoSegment, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$videoCompressHelper = cVar2;
            this.$segment = videoSegment;
            this.$percent = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new b(this.this$0, this.$videoCompressHelper, this.$segment, this.$percent, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.p<? extends Boolean, ? extends String>> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.f.b.m implements h.f.a.b<Float, z> {
            final /* synthetic */ z.c $lastProgress;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(84068);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(z.c cVar, b bVar) {
                super(1);
                this.$lastProgress = cVar;
                this.this$0 = bVar;
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
                long currentTimeMillis = System.currentTimeMillis();
                z.c cVar = new z.c();
                cVar.element = 0;
                this.$videoCompressHelper.a(null, this.$segment, new a(cVar, this), new C3345b(currentTimeMillis, hVar, this));
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
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$b$b  reason: collision with other inner class name */
        public static final class C3345b extends h.f.b.m implements h.f.a.m<Boolean, String, h.z> {
            final /* synthetic */ h.c.d $continuation;
            final /* synthetic */ long $start;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(84069);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3345b(long j2, h.c.d dVar, b bVar) {
                super(2);
                this.$start = j2;
                this.$continuation = dVar;
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ h.z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                h.f.b.l.d(str, "");
                c.a("compress single video,input:" + this.this$0.$segment.a(false) + ",result:" + booleanValue + ",cost:" + (System.currentTimeMillis() - this.$start));
                bh.a(this.$continuation, v.a(Boolean.valueOf(booleanValue), str));
                return h.z.f158842a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ h.f.a.a $onFinish;
        final /* synthetic */ List $selectedMediaList;
        final /* synthetic */ Intent $startIntent;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        boolean Z$1;
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(84079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar, List list, Intent intent, h.f.a.a aVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$selectedMediaList = list;
            this.$startIntent = intent;
            this.$onFinish = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            l lVar = new l(this.this$0, this.$selectedMediaList, this.$startIntent, this.$onFinish, dVar);
            lVar.L$0 = obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((l) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super u<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
            final /* synthetic */ ArrayList $videoSegments;
            int label;
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(84083);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar, ArrayList arrayList, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$videoSegments = arrayList;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new a(this.this$0, this.$videoSegments, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super u<? extends Boolean, ? extends Boolean, ? extends Long>> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    c cVar = this.this$0.this$0;
                    ArrayList arrayList = this.$videoSegments;
                    this.label = 1;
                    obj = cVar.c(arrayList, this);
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
        public static final class b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super u<? extends Boolean, ? extends List<? extends com.ss.android.ugc.aweme.shortvideo.c>, ? extends Long>>, Object> {
            final /* synthetic */ ArrayList $targetList;
            int label;
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(84084);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(l lVar, ArrayList arrayList, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$targetList = arrayList;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new b(this.this$0, this.$targetList, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super u<? extends Boolean, ? extends List<? extends com.ss.android.ugc.aweme.shortvideo.c>, ? extends Long>> dVar) {
                return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    c cVar = this.this$0.this$0;
                    ArrayList arrayList = this.$targetList;
                    this.label = 1;
                    obj = cVar.b(arrayList, this);
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
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$l$c  reason: collision with other inner class name */
        public static final class C3347c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.p<? extends Boolean, ? extends Long>>, Object> {
            final /* synthetic */ ArrayList $videoSegments;
            int label;
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(84085);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3347c(l lVar, ArrayList arrayList, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = lVar;
                this.$videoSegments = arrayList;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new C3347c(this.this$0, this.$videoSegments, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super h.p<? extends Boolean, ? extends Long>> dVar) {
                return ((C3347c) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    c cVar = this.this$0.this$0;
                    ArrayList arrayList = this.$videoSegments;
                    this.label = 1;
                    obj = cVar.a(arrayList, this);
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

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x015a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0167  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x017c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x018b  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x019d A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0213 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0230 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0240  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x02a8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x02b6  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x02bd  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02c3 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02c4 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x02c5 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
            // Method dump skipped, instructions count: 788
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.c.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(int i2) {
        if (e()) {
            hx.a(0, new q(this, i2));
        }
    }

    public final void b(String str) {
        com.ss.android.ugc.aweme.common.r.a("click_cancel_loading_content", new com.ss.android.ugc.tools.f.b().a("cancel_from", str).a("time_elapsed", System.currentTimeMillis() - this.o).f149193a);
    }

    public static List<ImportVideoInfo> a(List<? extends VideoSegment> list) {
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new ImportVideoInfo(t.f125482f, t.f125483g, t.c(), t.b(), t.a(true).toString(), t.f125478b, t.e() - t.d(), t.v, t.w, t.a(), t.f(), t.a(false).toString()));
        }
        return arrayList;
    }

    public final void b(int i2) {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("status", i2).a("time_elapsed", System.currentTimeMillis() - this.o);
        List<? extends VideoSegment> list = this.f128245c;
        if (list != null) {
            int i3 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().x && (i3 = i3 + 1) < 0) {
                        h.a.n.b();
                    }
                }
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("pic_cnt", i3).a("video_cnt", list.size() - i3);
            long j2 = 0;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                j2 += it2.next().f125478b;
            }
            a3.a("total_import_duration", j2);
        }
        com.ss.android.ugc.aweme.common.r.a("tools_performance_pre_cut_opt_process", a2.f149193a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r14, h.c.d<? super h.p<java.lang.Boolean, java.lang.Long>> r15) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.c.a(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r15, h.c.d<? super h.u<java.lang.Boolean, ? extends java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.c>, java.lang.Long>> r16) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.c.b(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r21, h.c.d<? super h.u<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r22) {
        /*
        // Method dump skipped, instructions count: 525
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.c.c(java.util.List, h.c.d):java.lang.Object");
    }

    public c(Activity activity, long j2, long j3) {
        h.f.b.l.d(activity, "");
        this.f128249g = activity;
        this.f128250h = j2;
        this.f128251i = j3;
    }

    @Override // com.ss.android.ugc.aweme.ak.a
    public final void a(List<? extends MediaModel> list, Intent intent, Intent intent2, h.f.a.a<h.z> aVar) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(intent, "");
        h.f.b.l.d(intent2, "");
        this.o = System.currentTimeMillis();
        bz bzVar = this.f128252k;
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
        if (list.isEmpty()) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (com.ss.android.ugc.aweme.port.in.g.a().l().getAlbumService().checkMediaDurationValid(this.f128249g, list, this.f128250h, this.f128251i).component1().booleanValue()) {
            this.f128246d = 0;
            this.f128252k = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new l(this, list, intent2, aVar, null), 2);
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void a(Intent intent, List<? extends VideoSegment> list, List<? extends com.ss.android.ugc.aweme.shortvideo.c> list2, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel) {
        boolean z;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        boolean z2;
        long j2;
        long duration;
        float f2;
        int i2;
        long duration2;
        Workspace a2 = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a();
        ad adVar = new ad();
        adVar.f125560i = a2;
        com.ss.android.ugc.aweme.shortvideo.cut.d.a(adVar, intent);
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.shortvideo.cut.scene.b bVar = new com.ss.android.ugc.aweme.shortvideo.cut.scene.b(list, 0, false, z, false, null, null);
        EditPreviewInfo a3 = com.ss.android.ugc.aweme.shortvideo.cut.n.a(true, a2, list, new long[]{-1, -1});
        List<EditVideoSegment> videoList = a3.getVideoList();
        String str = "";
        if (videoList != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
            multiEditVideoRecordData.useMusic = true;
            multiEditVideoRecordData.concatAudio = str;
            multiEditVideoRecordData.concatVideo = str;
            multiEditVideoRecordData.curRecordingDir = str;
            multiEditVideoRecordData.startTime = 0;
            multiEditVideoRecordData.segmentDataList = new ArrayList(videoList.size());
            for (EditVideoSegment editVideoSegment : videoList) {
                List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordData.segmentDataList;
                h.f.b.l.d(editVideoSegment, str);
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                multiEditVideoSegmentRecordData.videoPath = editVideoSegment.getVideoPath();
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    j2 = videoCutInfo.getStart();
                } else {
                    j2 = 0;
                }
                multiEditVideoSegmentRecordData.setStartTime(j2);
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    duration = videoCutInfo2.getEnd();
                } else {
                    duration = editVideoSegment.getVideoFileInfo().getDuration();
                }
                multiEditVideoSegmentRecordData.setEndTime(duration);
                if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                    multiEditVideoSegmentRecordData.draftVideoPath = editVideoSegment.getVideoPath();
                }
                multiEditVideoSegmentRecordData.videoLength = editVideoSegment.getVideoFileInfo().getDuration() * 1000;
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    f2 = videoCutInfo3.getSpeed();
                } else {
                    f2 = 1.0f;
                }
                multiEditVideoSegmentRecordData.setVideoSpeed(f2);
                VideoCutInfo videoCutInfo4 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo4 != null) {
                    i2 = videoCutInfo4.getRotate();
                } else {
                    i2 = 0;
                }
                multiEditVideoSegmentRecordData.rotate = i2;
                multiEditVideoSegmentRecordData.width = editVideoSegment.getVideoFileInfo().getWidth();
                multiEditVideoSegmentRecordData.height = editVideoSegment.getVideoFileInfo().getHeight();
                list3.add(multiEditVideoSegmentRecordData);
                long j3 = multiEditVideoRecordData.endTime;
                VideoCutInfo videoCutInfo5 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo5 != null) {
                    duration2 = videoCutInfo5.getEnd() - videoCutInfo5.getStart();
                } else {
                    duration2 = editVideoSegment.getVideoFileInfo().getDuration();
                }
                multiEditVideoRecordData.endTime = j3 + duration2;
            }
            List<MultiEditVideoSegmentRecordData> list4 = multiEditVideoRecordData.segmentDataList;
            if (list4 != null) {
                int i3 = 0;
                for (T t : list4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h.a.n.a();
                    }
                    t.videoKey = i3;
                    i3 = i4;
                }
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            multiEditVideoRecordData.endTime = Math.min(b(list), com.ss.android.ugc.aweme.shortvideo.cut.p.a());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (multiEditVideoRecordData.segmentDataList.size() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                multiEditVideoRecordData.isSingleVideo = z2;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData;
            Intent a4 = com.ss.android.ugc.aweme.shortvideo.cut.d.a(new Intent(intent), adVar, bVar, this.o);
            a4.putExtra("workspace", a2);
            a4.putExtra("extra_av_is_fast_import", true);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.os.Parcelable");
            a4.putExtra("extra_edit_preview_info", (Parcelable) a3);
            a4.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
            Objects.requireNonNull(cut2EditTransferModel, "null cannot be cast to non-null type android.os.Parcelable");
            a4.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
            if (!arrayList.isEmpty()) {
                a4.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
            }
            if (cut2EditTransferModel.getMusicSyncMode()) {
                if (list2 != null) {
                    cVar = (com.ss.android.ugc.aweme.shortvideo.c) list2.get(0);
                } else {
                    cVar = null;
                }
                String c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar);
                if (c2 != null) {
                    str = c2;
                }
                a2.a(str);
            }
            VECutVideoActivity.a.a(this.f128249g, a4, adVar.q, ae.a(adVar));
        }
    }
}

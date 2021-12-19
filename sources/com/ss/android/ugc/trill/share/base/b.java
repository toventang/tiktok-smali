package com.ss.android.ugc.trill.share.base;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import b.j;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.u;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ac;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.k;
import com.ss.android.ugc.aweme.share.v;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.shortvideo.view.b;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.ss.android.ugc.aweme.watermark.s;
import com.ss.android.ugc.trill.share.base.d;
import com.ss.android.ugc.trill.share.base.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import h.z;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b extends AbsDownloadListener {
    public static final a A = new a((byte) 0);
    public static boolean z;
    private final String B;
    private final String C;
    private String D;
    private int E;
    private p<Integer, String> F;
    private String G;
    private UrlModel H;
    private boolean I;
    private final com.ss.android.ugc.aweme.common.c<?, ?> J;
    private String K;
    private ACLCommonShare L;
    private d M;
    private String N;
    private final Handler O;
    private long P;
    private String Q;
    private String R;
    private JSONObject S;
    private final Runnable T;

    /* renamed from: a  reason: collision with root package name */
    public final String f150618a;

    /* renamed from: b  reason: collision with root package name */
    public String f150619b;

    /* renamed from: c  reason: collision with root package name */
    public String f150620c;

    /* renamed from: d  reason: collision with root package name */
    public int f150621d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.b f150622e;

    /* renamed from: f  reason: collision with root package name */
    public String f150623f;

    /* renamed from: g  reason: collision with root package name */
    public String f150624g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.share.a.a.b f150625h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f150626i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f150627j;

    /* renamed from: k  reason: collision with root package name */
    public int f150628k;

    /* renamed from: l  reason: collision with root package name */
    public Aweme f150629l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.festival.h f150630m;
    long n;
    long o;
    int p;
    public g q;
    public com.ss.android.ugc.aweme.watermark.p r;
    public final com.ss.android.ugc.aweme.video.local.a s;
    public boolean t;
    public final q<IWaterMarkService> u;
    public String v;
    public String w;
    public s x;
    public Context y;

    static {
        Covode.recordClassIndex(99052);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(99053);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(boolean z) {
            ShareDependService.a.a().a(z);
        }
    }

    public static final class i implements q<IWaterMarkService> {

        /* renamed from: a  reason: collision with root package name */
        public IWaterMarkService f150639a;

        static {
            Covode.recordClassIndex(99062);
        }

        i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* bridge */ /* synthetic */ IWaterMarkService b() {
            if (this.f150639a == null) {
                this.f150639a = WaterMarkServiceImpl.b();
            }
            return this.f150639a;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.v = str;
        com.ss.android.ugc.aweme.share.d.c.f123454f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r5 != null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.share.base.b.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }

    public final void e() {
        com.ss.android.ugc.aweme.video.e.c(this.f150619b);
    }

    private final void i() {
        b.i.b(new h(this), com.ss.android.ugc.aweme.cw.g.a());
    }

    private static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.trill.share.base.b$b  reason: collision with other inner class name */
    public static final class CallableC4058b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150631a;

        static {
            Covode.recordClassIndex(99054);
        }

        CallableC4058b(b bVar) {
            this.f150631a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IWaterMarkService b2 = this.f150631a.u.b();
            if (b2 == null) {
                return null;
            }
            com.ss.android.ugc.aweme.watermark.p pVar = this.f150631a.r;
            if (pVar == null) {
                l.b();
            }
            b2.prepareDataForI18n(pVar);
            return null;
        }
    }

    private final boolean g() {
        if (l.a((Object) this.K, (Object) "download_action") || l.a((Object) this.K, (Object) "share_download")) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i2 = this.f150621d;
        if (i2 >= 100) {
            this.f150621d = 100;
        } else if (i2 < 0) {
            this.f150621d = 0;
        }
        com.ss.android.b.a.a.a.b(this.T);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150633a;

        static {
            Covode.recordClassIndex(99056);
        }

        d(b bVar) {
            this.f150633a = bVar;
        }

        public final void run() {
            this.f150633a.a();
            a.a(false);
            if (this.f150633a.f150625h != null) {
                com.ss.android.ugc.aweme.feed.share.a.a.b bVar = this.f150633a.f150625h;
                if (bVar == null) {
                    l.b();
                }
                bVar.a(this.f150633a.f150620c);
            }
            com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(4, b.a(this.f150633a), 0));
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150637a;

        static {
            Covode.recordClassIndex(99060);
        }

        g(b bVar) {
            this.f150637a = bVar;
        }

        public final void run() {
            if (this.f150637a.f150622e != null) {
                com.ss.android.ugc.aweme.shortvideo.view.b bVar = this.f150637a.f150622e;
                if (bVar == null) {
                    l.b();
                }
                if (bVar.isShowing()) {
                    com.ss.android.ugc.aweme.shortvideo.view.b bVar2 = this.f150637a.f150622e;
                    if (bVar2 == null) {
                        l.b();
                    }
                    bVar2.a(this.f150637a.f150621d);
                }
            }
        }
    }

    public final void b() {
        com.ss.android.ugc.aweme.share.d.c.f123449a = false;
        com.ss.android.ugc.aweme.share.d.c.f123450b = false;
        if (this.O.hasMessages(1)) {
            this.O.removeMessages(1);
        }
        if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
            com.ss.android.ugc.aweme.video.e.c(this.f150620c);
            e();
        }
        com.ss.android.b.a.a.a.b(new c(this));
    }

    public static final class f extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f150635a;

        static {
            Covode.recordClassIndex(99058);
        }

        static final class a implements b.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f150636a;

            static {
                Covode.recordClassIndex(99059);
            }

            a(f fVar) {
                this.f150636a = fVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.view.b.a
            public final void a() {
                com.ss.android.ugc.aweme.share.d.c.f123451c = true;
                b.z = true;
                if (com.ss.android.ugc.aweme.share.d.c.f123449a) {
                    com.ss.android.ugc.aweme.video.local.a aVar = this.f150636a.f150635a.s;
                    Context context = this.f150636a.f150635a.y;
                    l.d(context, "");
                    Downloader.getInstance(context).cancel(aVar.f143450a);
                    com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                    RuntimeBehaviorServiceImpl.c().a("download_cancel");
                } else {
                    if (com.ss.android.ugc.aweme.share.d.c.f123450b) {
                        IWaterMarkService b2 = this.f150636a.f150635a.u.b();
                        if (b2 != null) {
                            b2.cancelWaterMark();
                        }
                        com.ss.android.ugc.aweme.share.d.c.f123450b = false;
                    }
                    RuntimeBehaviorServiceImpl.c().a("water_mark_cancel");
                }
                this.f150636a.f150635a.b();
                r.a("download_cancel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f150636a.f150635a.v).a("group_id", b.a(this.f150636a.f150635a).getAid()).f66730a);
            }
        }

        public final void handleMessage(Message message) {
            com.ss.android.ugc.aweme.shortvideo.view.b bVar;
            ImageView imageView;
            ValueAnimator valueAnimator;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2;
            l.d(message, "");
            if (1 == message.what && (bVar = this.f150635a.f150622e) != null && bVar.isShowing()) {
                bVar.f132631c = new a(this);
                int b2 = (int) n.b(this.f150635a.y, 180.0f);
                if (bVar.f132630b) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    bVar.f132634f = bVar.findViewById(R.id.dqe);
                    ObjectAnimator objectAnimator3 = null;
                    if (bVar.f132634f != null) {
                        valueAnimator = ValueAnimator.ofInt(bVar.f132634f.getWidth(), b2);
                        valueAnimator.addUpdateListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: INVOKE  
                              (r11v3 'valueAnimator' android.animation.ValueAnimator)
                              (wrap: com.ss.android.ugc.aweme.shortvideo.view.b$2 : 0x0058: CONSTRUCTOR  (r4v10 com.ss.android.ugc.aweme.shortvideo.view.b$2) = (r5v0 'bVar' com.ss.android.ugc.aweme.shortvideo.view.b) call: com.ss.android.ugc.aweme.shortvideo.view.b.2.<init>(com.ss.android.ugc.aweme.shortvideo.view.b):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener):void in method: com.ss.android.ugc.trill.share.base.b.f.handleMessage(android.os.Message):void, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0058: CONSTRUCTOR  (r4v10 com.ss.android.ugc.aweme.shortvideo.view.b$2) = (r5v0 'bVar' com.ss.android.ugc.aweme.shortvideo.view.b) call: com.ss.android.ugc.aweme.shortvideo.view.b.2.<init>(com.ss.android.ugc.aweme.shortvideo.view.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.trill.share.base.b.f.handleMessage(android.os.Message):void, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 31 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.view.b, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 37 more
                            */
                        /*
                        // Method dump skipped, instructions count: 310
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.share.base.b.f.handleMessage(android.os.Message):void");
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    f(b bVar, Looper looper) {
                        super(looper);
                        this.f150635a = bVar;
                    }
                }

                /* access modifiers changed from: package-private */
                public static final class c implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f150632a;

                    static {
                        Covode.recordClassIndex(99055);
                    }

                    c(b bVar) {
                        this.f150632a = bVar;
                    }

                    public final void run() {
                        this.f150632a.e();
                        a.a(false);
                        if (this.f150632a.f150625h != null) {
                            com.ss.android.ugc.aweme.feed.share.a.a.b bVar = this.f150632a.f150625h;
                            if (bVar == null) {
                                l.b();
                            }
                            bVar.a();
                        }
                        this.f150632a.a();
                        if (this.f150632a.t) {
                            return;
                        }
                        if (this.f150632a.f150628k == -113) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f150632a.y).a(R.string.ft6).a();
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f150632a.y).a(R.string.fgi).a();
                        }
                    }
                }

                private final void h() {
                    if (this.f150627j || this.f150626i) {
                        com.ss.android.ugc.aweme.watermark.p pVar = new com.ss.android.ugc.aweme.watermark.p();
                        this.r = pVar;
                        pVar.f144818a = this.f150619b;
                        pVar.f144819b = this.f150620c;
                        ShareDependService a2 = ShareDependService.a.a();
                        Aweme aweme = this.f150629l;
                        if (aweme == null) {
                            l.a("mAweme");
                        }
                        User author = aweme.getAuthor();
                        l.b(author, "");
                        com.ss.android.ugc.aweme.account.model.a a3 = a2.a(author);
                        Aweme aweme2 = this.f150629l;
                        if (aweme2 == null) {
                            l.a("mAweme");
                        }
                        com.ss.android.ugc.aweme.watermark.p a4 = pVar.a(a3, aweme2.getVideo());
                        a4.f144822e = this.f150627j;
                        a4.f144825h = this.f150626i;
                        a4.f144827j = false;
                        com.ss.android.ugc.aweme.shortvideo.festival.n a5 = com.ss.android.ugc.aweme.shortvideo.festival.n.a();
                        l.b(a5, "");
                        a4.f144826i = a5.c();
                        a4.f144824g = this.x;
                        a4.f144828k = true;
                        a4.f144829l = this.G;
                    }
                }

                public final void c() {
                    com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                    com.ss.android.ugc.aweme.share.d.c.f123450b = false;
                    if (this.O.hasMessages(1)) {
                        this.O.removeMessages(1);
                    }
                    if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                        com.ss.android.ugc.aweme.video.e.c(this.f150620c);
                        e();
                        com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                        return;
                    }
                    e();
                    com.ss.android.b.a.a.a.b(new d(this));
                    if (l.a((Object) this.w, (Object) "long_press_download")) {
                        Aweme aweme = this.f150629l;
                        if (aweme == null) {
                            l.a("mAweme");
                        }
                        com.ss.android.ugc.aweme.app.f.b.a(aweme, "mask", this.G);
                        return;
                    }
                    Aweme aweme2 = this.f150629l;
                    if (aweme2 == null) {
                        l.a("mAweme");
                    }
                    com.ss.android.ugc.aweme.app.f.b.a(aweme2, this.f150624g, this.G);
                }

                public final boolean d() {
                    boolean z2;
                    this.D = this.C + this.f150623f + "_mute.mp4";
                    String str = this.f150620c;
                    if (str == null) {
                        l.b();
                    }
                    String str2 = this.D;
                    if (str2 == null) {
                        l.b();
                    }
                    l.d(str, "");
                    l.d(str2, "");
                    j jVar = new j();
                    AVExternalServiceImpl.a().abilityService().processService().muteVideo(str, str2, new v.a(jVar));
                    b.i<TResult> iVar = jVar.f4869a;
                    l.b(iVar, "");
                    try {
                        iVar.f();
                        com.ss.android.ugc.aweme.video.e.c(this.f150620c);
                        TResult d2 = iVar.d();
                        if (d2 != null) {
                            if (d2.intValue() == 0) {
                                this.f150620c = this.D;
                                return true;
                            }
                        }
                        String str3 = this.f150620c;
                        Long valueOf = Long.valueOf(this.n);
                        String str4 = this.G;
                        if (!this.f150627j) {
                            if (!this.f150626i) {
                                z2 = false;
                                b.i.b(new ac.a.b(str3, valueOf, iVar.d(), str4, z2), b.i.f4824a);
                                com.ss.android.ugc.aweme.video.e.c(this.D);
                                return false;
                            }
                        }
                        z2 = true;
                        b.i.b(new ac.a.b(str3, valueOf, iVar.d(), str4, z2), b.i.f4824a);
                        com.ss.android.ugc.aweme.video.e.c(this.D);
                        return false;
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }

                /* access modifiers changed from: package-private */
                public static final class h<V> implements Callable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f150638a;

                    static {
                        Covode.recordClassIndex(99061);
                    }

                    h(b bVar) {
                        this.f150638a = bVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        b.a(this.f150638a, "download_time", "add_watermark");
                        com.ss.android.ugc.aweme.video.e.a(this.f150638a.f150618a, false);
                        if (this.f150638a.f150627j) {
                            b bVar = this.f150638a;
                            g.a aVar = new g.a(b.a(this.f150638a), this.f150638a.f150623f);
                            aVar.f150659f = this.f150638a.f150627j;
                            boolean z = this.f150638a.f150626i;
                            StringBuilder sb = new StringBuilder();
                            if (z) {
                                sb.append("ins_special");
                            } else {
                                sb.append("topleft");
                            }
                            if (!com.ss.android.ugc.aweme.shortvideo.festival.g.a() && z && com.ss.android.ugc.aweme.share.h.b.a()) {
                                sb.append(",ins_ending");
                            }
                            aVar.f150657d = sb.toString();
                            int i2 = 1;
                            aVar.f150655b = 1;
                            bVar.q = new g(aVar);
                            g gVar = this.f150638a.q;
                            if (gVar != null) {
                                gVar.f150653a.f150654a = System.currentTimeMillis();
                                r.a("client_watermark_start", new com.ss.android.ugc.aweme.app.f.d().a("start_watermark", gVar.f150653a.f150654a).a("watermark_id", gVar.f150653a.f150656c).a("watermark_sdk", gVar.f150653a.f150655b).a("watermark_type", gVar.f150653a.f150657d).a("is_self_video", gVar.f150653a.f150658e).f66730a);
                            }
                            RuntimeBehaviorServiceImpl.c().a("water_mark_start");
                            b bVar2 = this.f150638a;
                            com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                            com.ss.android.ugc.aweme.share.d.c.f123450b = true;
                            com.ss.android.ugc.aweme.watermark.p pVar = bVar2.r;
                            if (pVar == null) {
                                l.b();
                            }
                            pVar.n = bVar2.n;
                            pVar.f144830m = bVar2.o;
                            if (bVar2.f150626i && com.ss.android.ugc.aweme.share.h.b.a()) {
                                i2 = 2;
                            }
                            bVar2.p = i2;
                            Aweme aweme = bVar2.f150629l;
                            if (aweme == null) {
                                l.a("mAweme");
                            }
                            ac.a.a(aweme.getAid(), bVar2.v, bVar2.f150624g, "short", null, bVar2.p);
                            com.ss.android.ugc.aweme.turbo.api.b.a().waterMarkStart();
                            IWaterMarkService b2 = bVar2.u.b();
                            if (b2 != null) {
                                com.ss.android.ugc.aweme.watermark.p pVar2 = bVar2.r;
                                if (pVar2 == null) {
                                    l.b();
                                }
                                b2.waterMark(pVar2);
                            }
                        } else {
                            com.ss.android.ugc.aweme.video.e.c(this.f150638a.f150619b, this.f150638a.f150620c);
                            b bVar3 = this.f150638a;
                            if (!bVar3.a(b.a(bVar3), this.f150638a.f150624g) || this.f150638a.d()) {
                                this.f150638a.c();
                            } else {
                                this.f150638a.b();
                            }
                        }
                        return z.f158842a;
                    }
                }

                public final void a() {
                    Context context = this.y;
                    if (context instanceof Activity) {
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        if (!((Activity) context).isFinishing()) {
                            int i2 = Build.VERSION.SDK_INT;
                            Context context2 = this.y;
                            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                            if (((Activity) context2).isDestroyed()) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    com.ss.android.ugc.aweme.shortvideo.view.b bVar = this.f150622e;
                    if (bVar != null && bVar.isShowing()) {
                        com.ss.android.ugc.aweme.shortvideo.view.b bVar2 = this.f150622e;
                        if (bVar2 == null) {
                            l.b();
                        }
                        bVar2.dismiss();
                    }
                }

                public static final class e implements s {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f150634a;

                    static {
                        Covode.recordClassIndex(99057);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    e(b bVar) {
                        this.f150634a = bVar;
                    }

                    @Override // com.ss.android.ugc.aweme.watermark.s
                    public final void a(int i2) {
                        b bVar = this.f150634a;
                        com.ss.android.ugc.aweme.shortvideo.festival.h hVar = bVar.f150630m;
                        if (hVar == null) {
                            l.b();
                        }
                        bVar.f150621d = hVar.a(com.ss.android.ugc.aweme.shortvideo.festival.l.VIDEO_WATER_TYPE, i2);
                        com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(2, b.a(this.f150634a), this.f150634a.f150621d));
                        this.f150634a.f();
                    }

                    @Override // com.ss.android.ugc.aweme.watermark.s
                    public final void a(String str) {
                        l.d(str, "");
                        com.ss.android.ugc.aweme.share.d.c.f123450b = false;
                        if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                            com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                            return;
                        }
                        g gVar = this.f150634a.q;
                        if (gVar != null) {
                            gVar.a(1);
                        }
                        RuntimeBehaviorServiceImpl.c().a("water_mark_success");
                        b bVar = this.f150634a;
                        if (!bVar.a(b.a(bVar), this.f150634a.f150624g) || this.f150634a.d()) {
                            this.f150634a.c();
                        } else {
                            this.f150634a.b();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.watermark.s
                    public final void b(int i2) {
                        com.ss.android.ugc.aweme.share.d.c.f123450b = false;
                        this.f150634a.f150628k = i2;
                        com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(5, b.a(this.f150634a), 0));
                        g gVar = this.f150634a.q;
                        if (gVar != null) {
                            gVar.a(0);
                        }
                        RuntimeBehaviorServiceImpl.c().a("water_mark_error");
                        String str = this.f150634a.f150619b;
                        String str2 = this.f150634a.f150620c;
                        Aweme a2 = b.a(this.f150634a);
                        StringBuilder sb = new StringBuilder("WaterMark:");
                        sb.append("inputPath:").append(str);
                        sb.append(",");
                        sb.append("outputPath:").append(str2);
                        if (a2 != null) {
                            sb.append(",");
                            sb.append("aweme_id:").append(a2.getAid());
                        }
                        u.a(sb.toString(), "");
                        if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                            com.ss.android.ugc.aweme.video.e.c(this.f150634a.f150620c);
                            this.f150634a.e();
                            com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                            return;
                        }
                        this.f150634a.b();
                    }
                }

                public final void a(com.ss.android.ugc.aweme.feed.share.a.a.b bVar) {
                    this.f150625h = bVar;
                    com.ss.android.ugc.aweme.share.d.b.f123443a = bVar;
                }

                public final void b(String str) {
                    l.d(str, "");
                    this.w = str;
                }

                public final void c(String str) {
                    l.d(str, "");
                    this.N = str;
                }

                public static final /* synthetic */ Aweme a(b bVar) {
                    Aweme aweme = bVar.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    return aweme;
                }

                private static boolean b(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 1) {
                        return true;
                    }
                    return false;
                }

                private static boolean c(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare == null) {
                        return false;
                    }
                    int transcode = aCLCommonShare.getTranscode();
                    if (transcode == 2 || transcode == 3) {
                        return true;
                    }
                    return false;
                }

                private static boolean a(ACLCommonShare aCLCommonShare) {
                    if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 2) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    l.d(downloadInfo, "");
                    super.onCanceled(downloadInfo);
                    Aweme aweme = this.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(3, aweme, 0));
                    com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                    this.s.a(this.y);
                    if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                        com.ss.android.ugc.aweme.video.e.c(this.f150620c);
                        e();
                        com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    l.d(downloadInfo, "");
                    super.onProgress(downloadInfo);
                    int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
                    com.ss.android.ugc.aweme.shortvideo.festival.h hVar = this.f150630m;
                    if (hVar == null) {
                        l.b();
                    }
                    this.f150621d = hVar.a(com.ss.android.ugc.aweme.shortvideo.festival.l.VIDEO_DOWNLOAD_TYPE, curBytes);
                    f();
                    Aweme aweme = this.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(2, aweme, this.f150621d));
                }

                private final ACLCommonShare a(Aweme aweme) {
                    String str;
                    if (!g()) {
                        return null;
                    }
                    if (l.a((Object) this.K, (Object) "download_action")) {
                        if (l.a((Object) com.ss.android.ugc.aweme.share.c.f123414a, (Object) "long_press_download")) {
                            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
                            if (awemeACLShareInfo != null) {
                                return awemeACLShareInfo.getDownloadMaskPanel();
                            }
                            return null;
                        }
                        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
                        if (awemeACLShareInfo2 != null) {
                            return awemeACLShareInfo2.getDownloadGeneral();
                        }
                        return null;
                    } else if (!l.a((Object) this.K, (Object) "share_download") || (str = this.f150624g) == null) {
                        return null;
                    } else {
                        return h.a.b(aweme, str);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    l.d(downloadInfo, "");
                    super.onStart(downloadInfo);
                    Aweme aweme = this.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(1, aweme, 0));
                    com.ss.android.ugc.aweme.share.d.c.f123449a = true;
                    d dVar = this.M;
                    if (dVar != null) {
                        dVar.f150642b = System.currentTimeMillis();
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("start_download", dVar.f150642b).a("is_self_video", dVar.f150643c).a("is_server_watermark", dVar.f150641a);
                        Aweme aweme2 = dVar.f150644d;
                        if (aweme2 == null) {
                            l.a("mAweme");
                        }
                        r.a("download_start", a2.a("aweme_id", aweme2.getAid()).a("download_url", dVar.f150645e).f66730a);
                    }
                }

                private final void a(boolean z2) {
                    a.a(true);
                    Aweme aweme = this.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    com.ss.android.ugc.aweme.share.d.c.f123453e = aweme;
                    if (z2) {
                        com.ss.android.ugc.aweme.video.e.a(this.B, false);
                        a(this, "download_time", "download");
                        com.ss.android.ugc.aweme.app.n.a("ug_save_video_start", new JSONObject());
                        this.G = com.ss.android.ugc.aweme.video.util.b.a(this.G);
                        d dVar = new d();
                        Aweme aweme2 = this.f150629l;
                        if (aweme2 == null) {
                            l.a("mAweme");
                        }
                        d a2 = dVar.a(com.ss.android.ugc.aweme.feed.share.a.a.a(aweme2)).a(this.L);
                        Aweme aweme3 = this.f150629l;
                        if (aweme3 == null) {
                            l.a("mAweme");
                        }
                        this.M = a2.a(aweme3);
                        com.ss.android.ugc.aweme.share.d.c.f123449a = true;
                        this.s.a(this);
                        Aweme aweme4 = this.f150629l;
                        if (aweme4 == null) {
                            l.a("mAweme");
                        }
                        String a3 = com.ss.android.ugc.aweme.app.e.a.a(aweme4, this.G);
                        this.G = a3;
                        d dVar2 = this.M;
                        if (dVar2 != null) {
                            dVar2.f150645e = a3;
                        }
                        com.ss.android.ugc.aweme.video.local.a aVar = this.s;
                        Context context = this.y;
                        Aweme aweme5 = this.f150629l;
                        if (aweme5 == null) {
                            l.a("mAweme");
                        }
                        String aid = aweme5.getAid();
                        l.b(aid, "");
                        String str = this.G;
                        if (str == null) {
                            l.b();
                        }
                        aVar.a(context, aid, str, l.a(this.f150623f, (Object) ".mp4"), this.B);
                        RuntimeBehaviorServiceImpl.c().a("download_start");
                        if (this.f150627j) {
                            b.i.b(new CallableC4058b(this), com.ss.android.ugc.aweme.cw.g.a());
                            return;
                        }
                        return;
                    }
                    this.f150630m = new com.ss.android.ugc.aweme.shortvideo.festival.i(false, true);
                    i();
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    l.d(downloadInfo, "");
                    super.onSuccessed(downloadInfo);
                    com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                    this.s.a(this.y);
                    if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                        com.ss.android.ugc.aweme.video.e.c(this.f150620c);
                        e();
                        com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                        return;
                    }
                    Aweme aweme = this.f150629l;
                    if (aweme == null) {
                        l.a("mAweme");
                    }
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    Aweme aweme2 = this.f150629l;
                    if (aweme2 == null) {
                        l.a("mAweme");
                    }
                    int awemeType = aweme2.getAwemeType();
                    c.a aVar = new c.a();
                    aVar.f93987a = aid;
                    aVar.f93990d = 1;
                    aVar.f93991e = awemeType;
                    p<Integer, String> pVar = this.F;
                    if (pVar == null) {
                        l.b();
                    }
                    aVar.f93992f = pVar.getFirst().intValue();
                    this.J.a(aVar.a());
                    String targetFilePath = downloadInfo.getTargetFilePath();
                    if (targetFilePath != null) {
                        this.f150619b = targetFilePath;
                        if (targetFilePath.length() != 0) {
                            File file = new File(targetFilePath);
                            d dVar = this.M;
                            if (dVar == null) {
                                l.b();
                            }
                            if (dVar.f150642b != 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                d dVar2 = this.M;
                                if (dVar2 == null) {
                                    l.b();
                                }
                                this.n = currentTimeMillis - dVar2.f150642b;
                                this.o = file.length() / this.n;
                                RuntimeBehaviorServiceImpl.c().a("download_success");
                                d dVar3 = this.M;
                                if (dVar3 == null) {
                                    l.b();
                                }
                                String str = this.v;
                                l.d(str, "");
                                long currentTimeMillis2 = System.currentTimeMillis();
                                b.i.b(new d.b(dVar3, targetFilePath, currentTimeMillis2, str, currentTimeMillis2 - dVar3.f150642b), b.i.f4824a);
                                if (!this.f150627j && !this.f150626i) {
                                    long length = file.length();
                                    Long valueOf = Long.valueOf(this.n);
                                    String str2 = this.G;
                                    Aweme aweme3 = this.f150629l;
                                    if (aweme3 == null) {
                                        l.a("mAweme");
                                    }
                                    Boolean valueOf2 = Boolean.valueOf(a(aweme3, this.f150624g));
                                    UrlModel urlModel = this.H;
                                    Aweme aweme4 = this.f150629l;
                                    if (aweme4 == null) {
                                        l.a("mAweme");
                                    }
                                    ac.a.a(targetFilePath, length, valueOf, str2, false, -1, "success", valueOf2, urlModel, ac.a.a(aweme4));
                                    Aweme aweme5 = this.f150629l;
                                    if (aweme5 == null) {
                                        l.a("mAweme");
                                    }
                                    ac.a.a(aweme5.getAid(), this.v, this.f150624g, "short", ac.a.a(this.H), 0);
                                }
                            }
                            r.onEvent(MobClick.obtain().setEventName(this.Q).setLabelName(this.R).setValue(String.valueOf(System.currentTimeMillis() - this.P)).setJsonObject(this.S));
                            if (file.length() < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                l.b(iESSettingsProxy, "");
                                Boolean supportFilterErrorFile = iESSettingsProxy.getSupportFilterErrorFile();
                                l.b(supportFilterErrorFile, "");
                                if (supportFilterErrorFile.booleanValue()) {
                                    e();
                                    String str3 = this.G;
                                    if (str3 == null) {
                                        l.b();
                                    }
                                    if (h.m.p.b(str3, "http://", false)) {
                                        String str4 = this.G;
                                        if (str4 == null) {
                                            l.b();
                                        }
                                        this.G = h.m.p.a(str4, "http://", "https://");
                                        this.s.a(this);
                                        Aweme aweme6 = this.f150629l;
                                        if (aweme6 == null) {
                                            l.a("mAweme");
                                        }
                                        String a2 = com.ss.android.ugc.aweme.app.e.a.a(aweme6, this.G);
                                        this.G = a2;
                                        d dVar4 = this.M;
                                        if (dVar4 != null) {
                                            dVar4.f150645e = a2;
                                        }
                                        com.ss.android.ugc.aweme.video.local.a aVar2 = this.s;
                                        Context context = this.y;
                                        Aweme aweme7 = this.f150629l;
                                        if (aweme7 == null) {
                                            l.a("mAweme");
                                        }
                                        String aid2 = aweme7.getAid();
                                        l.b(aid2, "");
                                        String str5 = this.G;
                                        if (str5 == null) {
                                            l.b();
                                        }
                                        aVar2.a(context, aid2, str5, l.a(this.f150623f, (Object) ".mp4"), this.B);
                                        return;
                                    }
                                    this.E = 3;
                                    onFailed(null, new BaseException(-1, "Download hijacked"));
                                    return;
                                }
                            }
                            i();
                        }
                    }
                }

                private b(Context context, boolean z2) {
                    l.d(context, "");
                    this.y = context;
                    this.s = new com.ss.android.ugc.aweme.video.local.a();
                    this.u = new i();
                    this.N = "";
                    this.v = "";
                    this.w = "download_to_share";
                    this.O = new f(this, Looper.getMainLooper());
                    this.P = -1;
                    this.T = new g(this);
                    this.x = new e(this);
                    this.f150626i = z2;
                    String e2 = am.e(this.y);
                    l.b(e2, "");
                    this.B = e2;
                    String f2 = am.f(this.y);
                    l.b(f2, "");
                    this.f150618a = f2;
                    String g2 = am.g(this.y);
                    l.b(g2, "");
                    this.C = g2;
                    com.ss.android.ugc.aweme.common.c<?, ?> cVar = new com.ss.android.ugc.aweme.common.c<>();
                    this.J = cVar;
                    cVar.a(new com.ss.android.ugc.aweme.feed.u.a());
                }

                private final boolean a(ACLCommonShare aCLCommonShare, boolean z2) {
                    if (!g()) {
                        Aweme aweme = this.f150629l;
                        if (aweme == null) {
                            l.a("mAweme");
                        }
                        return com.ss.android.ugc.aweme.feed.share.a.a.a(aweme, z2);
                    } else if (z2) {
                        return c(aCLCommonShare);
                    } else {
                        return a(aCLCommonShare);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    boolean z2;
                    super.onFailed(downloadInfo, baseException);
                    com.ss.android.ugc.aweme.share.d.c.f123449a = false;
                    this.s.a(this.y);
                    if (baseException == null) {
                        b();
                    } else if (com.ss.android.ugc.aweme.share.d.c.f123451c) {
                        com.ss.android.ugc.aweme.video.e.c(this.f150620c);
                        e();
                        com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                    } else {
                        Aweme aweme = this.f150629l;
                        if (aweme == null) {
                            l.a("mAweme");
                        }
                        String str = this.G;
                        StringBuilder sb = new StringBuilder("DownloaderError:");
                        sb.append("error_code:").append(baseException.getErrorCode());
                        sb.append(",");
                        sb.append("error_message:").append(baseException.getMessage());
                        if (aweme != null) {
                            sb.append(",");
                            sb.append("aweme_id:").append(aweme.getAid());
                        }
                        u.a(sb.toString(), str);
                        int errorCode = baseException.getErrorCode();
                        long currentTimeMillis = System.currentTimeMillis();
                        d dVar = this.M;
                        if (dVar == null) {
                            l.b();
                        }
                        Long valueOf = Long.valueOf(currentTimeMillis - dVar.f150642b);
                        String str2 = this.G;
                        if (this.f150627j || this.f150626i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Integer valueOf2 = Integer.valueOf(errorCode);
                        String errorMessage = baseException.getErrorMessage();
                        Aweme aweme2 = this.f150629l;
                        if (aweme2 == null) {
                            l.a("mAweme");
                        }
                        Boolean valueOf3 = Boolean.valueOf(a(aweme2, this.f150624g));
                        UrlModel urlModel = this.H;
                        Aweme aweme3 = this.f150629l;
                        if (aweme3 == null) {
                            l.a("mAweme");
                        }
                        ac.a.a(null, -1, valueOf, str2, z2, valueOf2, errorMessage, valueOf3, urlModel, ac.a.a(aweme3));
                        if (this.E < 3) {
                            d dVar2 = this.M;
                            if (dVar2 != null) {
                                dVar2.a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), false, this.v);
                            }
                            this.E++;
                            UrlModel urlModel2 = this.H;
                            if (urlModel2 != null && !com.bytedance.common.utility.collection.b.a((Collection) urlModel2.getUrlList())) {
                                UrlModel urlModel3 = this.H;
                                if (urlModel3 == null) {
                                    l.b();
                                }
                                List<String> urlList = urlModel3.getUrlList();
                                int i2 = this.E;
                                UrlModel urlModel4 = this.H;
                                if (urlModel4 == null) {
                                    l.b();
                                }
                                this.G = urlList.get(i2 % urlModel4.getUrlList().size());
                            }
                            this.G = com.ss.android.ugc.aweme.video.util.b.a(this.G);
                            this.s.a(this);
                            Aweme aweme4 = this.f150629l;
                            if (aweme4 == null) {
                                l.a("mAweme");
                            }
                            String a2 = com.ss.android.ugc.aweme.app.e.a.a(aweme4, this.G);
                            this.G = a2;
                            d dVar3 = this.M;
                            if (dVar3 != null) {
                                dVar3.f150645e = a2;
                            }
                            com.ss.android.ugc.aweme.video.local.a aVar = this.s;
                            Context context = this.y;
                            Aweme aweme5 = this.f150629l;
                            if (aweme5 == null) {
                                l.a("mAweme");
                            }
                            String aid = aweme5.getAid();
                            l.b(aid, "");
                            String str3 = this.G;
                            if (str3 == null) {
                                l.b();
                            }
                            aVar.a(context, aid, str3, l.a(this.f150623f, (Object) ".mp4"), this.B);
                            return;
                        }
                        Aweme aweme6 = this.f150629l;
                        if (aweme6 == null) {
                            l.a("mAweme");
                        }
                        com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(5, aweme6, 0));
                        b();
                        String str4 = baseException.getErrorMessage() + "    ***  Number of Retries *** :" + this.E;
                        com.bytedance.ies.ugc.appcontext.d.a();
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                            com.ss.android.ugc.aweme.lancet.j.f107229h = j();
                        }
                        if (com.ss.android.ugc.aweme.lancet.j.f107229h) {
                            JSONObject a3 = new com.ss.android.ugc.aweme.app.f.c().a("errorCode", Integer.valueOf(errorCode)).a("errorDes", str4).a();
                            if (errorCode == 1052) {
                                a3.putOpt("availableStorageSize", Long.valueOf(c.b.d.b(com.bytedance.ies.ugc.appcontext.d.a())));
                                a3.putOpt("totalStorageSize", Long.valueOf(c.b.d.c(com.bytedance.ies.ugc.appcontext.d.a())));
                            }
                            com.bytedance.apm.b.a("aweme_download_error_rate", 1, a3);
                        }
                        String str5 = String.valueOf(errorCode);
                        if (errorCode > 0) {
                            Aweme aweme7 = this.f150629l;
                            if (aweme7 == null) {
                                l.a("mAweme");
                            }
                            if (ac.a.a(aweme7)) {
                                str5 = str5 + "P";
                            }
                        }
                        RuntimeBehaviorServiceImpl.c().a("download_error", str5);
                        com.ss.android.ugc.aweme.app.f.a.a("aweme_movie_download_log", "", str4, this.G);
                        d dVar4 = this.M;
                        if (dVar4 == null) {
                            l.b();
                        }
                        dVar4.a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), true, this.v);
                    }
                }

                static /* synthetic */ void a(b bVar, String str, String str2) {
                    bVar.P = System.currentTimeMillis();
                    bVar.Q = str;
                    bVar.R = str2;
                    bVar.S = null;
                }

                public final void a(Aweme aweme, String str, boolean z2) {
                    boolean z3;
                    boolean z4;
                    String str2;
                    boolean z5;
                    String builder;
                    String str3 = "";
                    l.d(aweme, str3);
                    l.d(str, str3);
                    this.f150629l = aweme;
                    this.K = str;
                    this.L = a(aweme);
                    boolean z6 = false;
                    com.ss.android.ugc.aweme.share.d.c.f123451c = false;
                    this.t = com.ss.android.ugc.aweme.share.d.c.b("download");
                    if (!this.f150626i || !a(this.L, true)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    this.f150626i = z3;
                    this.f150627j = a(this.L, false);
                    if (z2 || b(this.L)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.I = z4;
                    if (com.ss.android.ugc.aweme.shortvideo.festival.g.a()) {
                        this.f150627j = true;
                    }
                    a aVar = new a();
                    aVar.f150617e = this.f150624g;
                    Aweme aweme2 = this.f150629l;
                    if (aweme2 == null) {
                        l.a("mAweme");
                    }
                    aVar.a(aweme2, this.f150627j, this.f150626i, g(), this.L, this.I);
                    this.f150627j = aVar.f150615c;
                    this.f150623f = aVar.f150614b;
                    UrlModel urlModel = aVar.f150613a;
                    this.H = urlModel;
                    if (urlModel == null || com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList())) {
                        u.a aVar2 = u.a.DOWNLOAD_URL;
                        Aweme aweme3 = this.f150629l;
                        if (aweme3 == null) {
                            l.a("mAweme");
                        }
                        u.a(aVar2, aweme3);
                        return;
                    }
                    UrlModel urlModel2 = this.H;
                    if (urlModel2 != null && !com.bytedance.common.utility.collection.b.a((Collection) urlModel2.getUrlList())) {
                        UrlModel urlModel3 = this.H;
                        if (urlModel3 == null) {
                            l.b();
                        }
                        String str4 = urlModel3.getUrlList().get(0);
                        this.G = str4;
                        if (str4 != null) {
                            Aweme aweme4 = this.f150629l;
                            if (aweme4 == null) {
                                l.a("mAweme");
                            }
                            if (y.e(aweme4)) {
                                UrlModel urlModel4 = this.H;
                                if (urlModel4 == null) {
                                    l.b();
                                }
                                List<String> urlList = urlModel4.getUrlList();
                                UrlModel urlModel5 = this.H;
                                if (urlModel5 == null) {
                                    l.b();
                                }
                                this.G = urlList.get(urlModel5.getUrlList().size() - 1);
                                if (h.m.p.a((CharSequence) str4, (CharSequence) "ratio", false)) {
                                    builder = new h.m.l("(ratio=[^&]*)").replace(str4, "ratio=default");
                                } else {
                                    Uri.Builder buildUpon = Uri.parse(this.G).buildUpon();
                                    buildUpon.appendQueryParameter("ratio", "default");
                                    builder = buildUpon.toString();
                                }
                                this.G = builder;
                            }
                        }
                    }
                    Aweme aweme5 = this.f150629l;
                    if (aweme5 == null) {
                        l.a("mAweme");
                    }
                    k.a(aweme5, this.v, this.w, this.N, FeedParamProvider.a.a(this.y).getFromGroupId(), FeedParamProvider.a.a(this.y).getNewsId());
                    if (!this.f150626i) {
                        str2 = this.C + this.f150623f + ".mp4";
                    } else {
                        str2 = this.C + this.f150623f + "_ins.mp4";
                    }
                    this.f150620c = str2;
                    if (com.ss.android.ugc.aweme.video.e.b(str2)) {
                        Aweme aweme6 = this.f150629l;
                        if (aweme6 == null) {
                            l.a("mAweme");
                        }
                        com.ss.android.ugc.aweme.share.d.c.f123453e = aweme6;
                        Aweme aweme7 = this.f150629l;
                        if (aweme7 == null) {
                            l.a("mAweme");
                        }
                        com.ss.android.ugc.aweme.share.d.c.a(com.ss.android.ugc.aweme.share.d.a.a(1, aweme7, 0));
                        c();
                        return;
                    }
                    if (!this.t) {
                        if (this.f150622e == null) {
                            Context context = this.y;
                            if (context == null) {
                                l.b();
                            }
                            this.f150622e = com.ss.android.ugc.aweme.shortvideo.view.b.a(context, context.getResources().getString(R.string.fgh));
                            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.v).a("is_long_item", 0);
                            if (this.f150629l == null) {
                                l.a("mAweme");
                            } else {
                                Aweme aweme8 = this.f150629l;
                                if (aweme8 == null) {
                                    l.a("mAweme");
                                    l.b();
                                }
                                str3 = aweme8.getAid();
                            }
                            r.a("download_process_popup_show", a2.a("group_id", str3).a("download_method", this.w).f66730a);
                        }
                        com.ss.android.ugc.aweme.shortvideo.view.b bVar = this.f150622e;
                        if (bVar != null) {
                            bVar.a(0);
                        }
                    }
                    String str5 = this.B + this.f150623f + ".mp4";
                    this.f150619b = str5;
                    com.ss.android.ugc.aweme.share.d.b.f123444b = this.f150620c;
                    com.ss.android.ugc.aweme.share.d.b.f123445c = this.f150619b;
                    if (!com.ss.android.ugc.aweme.video.e.b(str5) || z) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (this.f150627j && !z2) {
                        z6 = true;
                    }
                    this.f150630m = new com.ss.android.ugc.aweme.shortvideo.festival.i(z5, z6);
                    h();
                    a(z5);
                    if (!this.t) {
                        this.O.sendEmptyMessageDelayed(1, 30000);
                    }
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public b(Context context, boolean z2, int i2, String str) {
                    this(context, z2);
                    String str2 = "";
                    l.d(context, str2);
                    this.f150624g = str;
                    com.ss.android.ugc.aweme.share.d.c.f123455g = str;
                    int i3 = 2;
                    if (i2 == 0) {
                        i3 = 0;
                        str2 = "homepage_hot";
                    } else if (i2 == 1) {
                        str2 = "homepage_follow";
                        i3 = 1;
                    } else if (i2 != 2) {
                        if (i2 != 1000) {
                            if (i2 != 1001) {
                                if (i2 != 2000) {
                                    if (i2 != 2001) {
                                        if (i2 == 3002) {
                                            i3 = 5;
                                            str2 = "challenge_hot";
                                        } else if (i2 == 3003) {
                                            i3 = 9;
                                            str2 = "challenge";
                                        } else if (i2 == 4000) {
                                            i3 = 6;
                                            str2 = "music_hot";
                                        } else if (i2 == 4001) {
                                            i3 = 8;
                                            str2 = "music_new";
                                        } else if (i2 == 5000) {
                                            i3 = 7;
                                            str2 = "found";
                                        } else if (i2 != 8000) {
                                            i3 = -1;
                                        } else {
                                            i3 = 20;
                                            str2 = "window_follow";
                                        }
                                    }
                                }
                            }
                            i3 = 4;
                            str2 = "personal_collection";
                        }
                        i3 = 3;
                        str2 = "personal_homepage";
                    } else {
                        str2 = "homepage_fresh";
                    }
                    this.F = new p<>(Integer.valueOf(i3), str2);
                }
            }

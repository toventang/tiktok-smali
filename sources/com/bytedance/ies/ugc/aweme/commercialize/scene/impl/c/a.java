package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.playerkit.model.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class a implements com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a {

    /* renamed from: k  reason: collision with root package name */
    public static final C0782a f34685k = new C0782a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b f34686a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f34687b;

    /* renamed from: c  reason: collision with root package name */
    public int f34688c;

    /* renamed from: d  reason: collision with root package name */
    public int f34689d;

    /* renamed from: e  reason: collision with root package name */
    public int f34690e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f34691f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f34692g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f34693h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f34694i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f34695j;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c f34696l;

    /* renamed from: m  reason: collision with root package name */
    private AwemeRawAd f34697m;
    private AwemeSearchAdModel n;
    private Long o;
    private int p;
    private int q;
    private Integer r = 0;
    private Runnable s;
    private final h t = i.a((h.f.a.a) d.f34700a);
    private boolean u = true;

    static {
        Covode.recordClassIndex(20803);
    }

    public final Handler d() {
        return (Handler) this.t.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a$a  reason: collision with other inner class name */
    public static final class C0782a {
        static {
            Covode.recordClassIndex(20804);
        }

        private C0782a() {
        }

        public /* synthetic */ C0782a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34698a;

        static {
            Covode.recordClassIndex(20805);
        }

        b(a aVar) {
            this.f34698a = aVar;
        }

        public final void run() {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34698a.f34686a;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34699a;

        static {
            Covode.recordClassIndex(20806);
        }

        c(a aVar) {
            this.f34699a = aVar;
        }

        public final void run() {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34699a.f34686a;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34700a = new d();

        static {
            Covode.recordClassIndex(20807);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a
    public final void c() {
        Handler d2;
        Runnable runnable = this.s;
        if (runnable != null && (d2 = d()) != null) {
            d2.removeCallbacks(runnable);
        }
    }

    public final long e() {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34686a;
        if (bVar != null) {
            return (long) bVar.a();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f34687b
            r2 = 0
            if (r0 == 0) goto L_0x0041
            r1 = 0
            boolean r0 = r0.isAd()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0013
            h.f.b.l.b()
        L_0x0013:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f34687b
            if (r0 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r0.getWebUrl()
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f34687b
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = r0.getOpenUrl()
        L_0x003b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            return r2
        L_0x0042:
            java.lang.Integer r0 = r3.r
            if (r0 == 0) goto L_0x0041
            int r1 = r3.p
            int r0 = r0.intValue()
            if (r1 < r0) goto L_0x0041
            boolean r0 = r3.u
            if (r0 != 0) goto L_0x0041
            java.lang.Integer r0 = r3.r
            if (r0 != 0) goto L_0x0059
            h.f.b.l.b()
        L_0x0059:
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0041
            r0 = 1
            return r0
        L_0x0061:
            r0 = r1
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a.f():boolean");
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Aweme f34701a;

        /* renamed from: b  reason: collision with root package name */
        public long f34702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f34703c;

        static {
            Covode.recordClassIndex(20808);
        }

        public final void run() {
            long e2;
            if (l.a(this.f34701a, this.f34703c.f34687b)) {
                if (this.f34703c.f34693h) {
                    e2 = 0;
                    this.f34703c.f34693h = false;
                } else {
                    e2 = this.f34703c.e();
                }
                if (!this.f34703c.f34694i && (e2 >= ((long) this.f34703c.f34689d) || (e2 < this.f34702b && this.f34703c.f34688c > 0))) {
                    a.a(this.f34703c.f34691f);
                    this.f34703c.f34694i = true;
                    this.f34702b = e2;
                    Handler d2 = this.f34703c.d();
                    if (d2 != null) {
                        d2.postDelayed(this, 100);
                    }
                } else if (this.f34703c.f34695j || (e2 < ((long) this.f34703c.f34690e) && (e2 >= this.f34702b || this.f34703c.f34688c <= 0))) {
                    this.f34702b = e2;
                    Handler d3 = this.f34703c.d();
                    if (d3 != null) {
                        d3.postDelayed(this, 100);
                    }
                } else {
                    this.f34703c.f34695j = true;
                    a.a(this.f34703c.f34692g);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f34703c = aVar;
            this.f34701a = aVar.f34687b;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a
    public final void a() {
        long j2;
        Boolean bool;
        this.f34688c++;
        int i2 = this.p + 1;
        this.p = i2;
        com.ss.android.ugc.aweme.feed.helper.h a2 = com.ss.android.ugc.aweme.feed.helper.h.a();
        l.b(a2, "");
        this.p = i2 + a2.f93342e;
        com.ss.android.ugc.aweme.feed.helper.h a3 = com.ss.android.ugc.aweme.feed.helper.h.a();
        l.b(a3, "");
        a3.f93342e = this.p;
        f();
        if (f()) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34686a;
            if (bVar != null) {
                bVar.d();
            }
            this.u = true;
        }
        long e2 = e();
        long j3 = (long) (this.f34688c - 1);
        Long l2 = this.o;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        Long.signum(j3);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "over", this.f34697m).a("duration", Long.valueOf(e2 + (j3 * j2))).a("video_length", this.o).b();
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar2 = this.f34686a;
        if (bVar2 != null) {
            bool = bVar2.f();
        } else {
            bool = null;
        }
        if (!l.a((Object) bool, (Object) true)) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "auto_play", this.f34697m).b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a
    public final void b() {
        Boolean bool;
        String str;
        Integer animationType;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34686a;
        String str2 = null;
        if (bVar != null) {
            bool = bVar.f();
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar2 = this.f34686a;
            if (bVar2 != null) {
                bVar2.e();
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "auto_play", this.f34697m).b();
        }
        Aweme aweme = this.f34687b;
        if (aweme != null) {
            a(aweme);
            this.f34688c = 0;
            Aweme aweme2 = this.f34687b;
            if (aweme2 != null) {
                Boolean valueOf = Boolean.valueOf(aweme2.isAd());
                if (valueOf == null) {
                    l.b();
                }
                if (valueOf.booleanValue()) {
                    Aweme aweme3 = this.f34687b;
                    if (aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd2.getWebUrl();
                    }
                    if (TextUtils.isEmpty(str)) {
                        Aweme aweme4 = this.f34687b;
                        if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null)) {
                            str2 = awemeRawAd.getOpenUrl();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                    }
                    AwemeSearchAdModel awemeSearchAdModel = this.n;
                    if (awemeSearchAdModel != null && (animationType = awemeSearchAdModel.getAnimationType()) != null && animationType.intValue() == 1 && this.f34688c == this.q) {
                        this.s = new e(this);
                        Handler d2 = d();
                        if (d2 != null) {
                            Runnable runnable = this.s;
                            Objects.requireNonNull(runnable, "null cannot be cast to non-null type java.lang.Runnable");
                            d2.post(runnable);
                        }
                    }
                }
            }
        }
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static long a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return 1;
        }
        Video video = aweme.getVideo();
        l.b(video, "");
        video.getDuration();
        Video video2 = aweme.getVideo();
        l.b(video2, "");
        return (long) video2.getDuration();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.c cVar) {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b bVar;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        AwemeSearchAdModel awemeSearchAdModel;
        float f2;
        l.d(cVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c cVar2 = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c) cVar;
        this.f34696l = cVar2;
        Integer num = null;
        if (cVar2 != null) {
            bVar = cVar2.f34651b;
        } else {
            bVar = null;
        }
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.search_player.ISearchAdVideoPlayerSceneCallBack");
        this.f34686a = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b) bVar;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c cVar3 = this.f34696l;
        if (cVar3 != null) {
            awemeRawAd = cVar3.f34652a;
        } else {
            awemeRawAd = null;
        }
        this.f34697m = awemeRawAd;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c cVar4 = this.f34696l;
        if (cVar4 != null) {
            aweme = cVar4.f34653c;
        } else {
            aweme = null;
        }
        this.f34687b = aweme;
        AwemeRawAd awemeRawAd2 = this.f34697m;
        if (awemeRawAd2 != null) {
            awemeSearchAdModel = awemeRawAd2.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.n = awemeSearchAdModel;
        this.o = Long.valueOf(a(this.f34687b));
        AwemeSearchAdModel awemeSearchAdModel2 = this.n;
        float f3 = 0.0f;
        if (awemeSearchAdModel2 != null) {
            f2 = awemeSearchAdModel2.getShowButtonSeconds();
        } else {
            f2 = 0.0f;
        }
        this.f34689d = (int) (f2 * 1000.0f);
        AwemeSearchAdModel awemeSearchAdModel3 = this.n;
        if (awemeSearchAdModel3 != null) {
            f3 = awemeSearchAdModel3.getButtonColorShowSeconds();
        }
        this.f34690e = (int) (f3 * 1000.0f);
        this.f34691f = new b(this);
        this.f34692g = new c(this);
        AwemeSearchAdModel awemeSearchAdModel4 = this.n;
        if (awemeSearchAdModel4 != null) {
            num = awemeSearchAdModel4.getShowMaskTimes();
        }
        this.r = num;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a
    public final void a(n nVar) {
        Integer animationType;
        l.d(nVar, "");
        com.ss.android.ugc.aweme.feed.helper.h a2 = com.ss.android.ugc.aweme.feed.helper.h.a();
        l.b(a2, "");
        a2.f93342e = 0;
        com.ss.android.ugc.aweme.feed.helper.h a3 = com.ss.android.ugc.aweme.feed.helper.h.a();
        l.b(a3, "");
        a3.f93343f = false;
        AwemeSearchAdModel awemeSearchAdModel = this.n;
        if (!(awemeSearchAdModel == null || (animationType = awemeSearchAdModel.getAnimationType()) == null || animationType.intValue() != 1)) {
            this.f34695j = false;
            this.f34694i = false;
            this.u = false;
            this.f34693h = true;
            this.p = 0;
            this.f34688c = 0;
        }
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b bVar = this.f34686a;
        if (bVar != null) {
            bVar.g();
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "auto_play", this.f34697m).b();
    }
}

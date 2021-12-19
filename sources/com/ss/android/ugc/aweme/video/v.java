package com.ss.android.ugc.aweme.video;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.n.a;
import com.ss.android.ugc.aweme.experiment.fk;
import com.ss.android.ugc.aweme.feed.helper.u;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.e;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.c.c;
import com.ss.android.ugc.aweme.video.n;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.ss.android.ugc.aweme.video.simplayer.b.b;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.playerkit.model.d;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.ttvideoengine.aj;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class v implements i {

    /* renamed from: d  reason: collision with root package name */
    private static v f143996d;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f143997j;

    /* renamed from: l  reason: collision with root package name */
    private static LruCache<String, a> f143998l = new LruCache<String, a>() {
        /* class com.ss.android.ugc.aweme.video.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(94224);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, a aVar) {
            return 1;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public f f143999a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f144000b;

    /* renamed from: c  reason: collision with root package name */
    public a f144001c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f144002e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f144003f;

    /* renamed from: g  reason: collision with root package name */
    private b f144004g;

    /* renamed from: h  reason: collision with root package name */
    private String f144005h;

    /* renamed from: i  reason: collision with root package name */
    private String f144006i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144007k;

    @Override // com.ss.android.ugc.aweme.video.i
    public final void B() {
        P();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final f L() {
        return this.f143999a;
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final m.e a() {
        return m.e.TT;
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final String f() {
        return this.f144005h;
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final boolean p() {
        return this.f144000b;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(OnUIPlayListener onUIPlayListener) {
        this.f143999a.a(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(boolean z) {
        this.f144007k = z;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, boolean z) {
        return a(video, null, false, z);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(com.ss.android.ugc.aweme.video.c.b bVar) {
        Video video = bVar.f143355a;
        Audio audio = bVar.f143356b;
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "tryPlay aid:" + e.a(video));
        }
        if (video == null) {
            return null;
        }
        int i2 = bVar.f143358d;
        boolean z = bVar.f143359e.f143348b;
        boolean z2 = bVar.f143359e.f143350d;
        boolean z3 = bVar.f143359e.f143349c;
        com.ss.android.ugc.aweme.player.sdk.b.b resolution = bVar.f143357c.getResolution();
        x xVar = x.Normal;
        boolean z4 = bVar.f143359e.f143351e;
        boolean z5 = bVar.f143359e.f143352f;
        String str = bVar.f143359e.f143354h;
        if (!TextUtils.isEmpty(video.getVideoAdTag())) {
            str = video.getVideoAdTag();
        }
        xVar.setLoop(z4);
        xVar.setTag(str);
        b.a(video);
        b.a(this);
        boolean z6 = video.getPlayAddr() != null && TextUtils.equals(video.getPlayAddr().getSourceId(), this.f144006i) && com.ss.android.ugc.aweme.player.ab.abs.e.f115041a && !f143997j;
        n.b c2 = new n.b().a(com.ss.android.ugc.aweme.video.simcommon.a.a(video)).a(i2).e(z2).c(z3);
        c2.f143496a.f143485e = resolution;
        n.b m2 = c2.a(xVar).f(video.isNeedSetCookie()).k(z6).b(z5).d(z).a(Audio.convertToSimAudio(video, audio)).c((bVar.f143361g ? Audio.InfoIdType.TRANSLATED : Audio.InfoIdType.ORIGINAL).getInfoId()).m(bVar.f143362h);
        if (bVar.f143360f != null) {
            c cVar = bVar.f143360f;
            m2.l(cVar.f143363a).b(cVar.f143364b).b(cVar.f143365c);
        }
        if (this.f144007k) {
            m2.f143496a.R = false;
        }
        this.f143999a.a(m2.f143496a);
        f143997j = true;
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(n nVar) {
        String str;
        i playAddr;
        if (nVar != null && nVar.f143482b != null) {
            if (q.a()) {
                StringBuilder sb = new StringBuilder("tryPrepareNext aid:");
                h hVar = nVar.f143482b;
                if (hVar == null || (playAddr = hVar.getPlayAddr()) == null) {
                    str = "null";
                } else {
                    str = playAddr.getSourceId() == null ? "nullid" : playAddr.getSourceId();
                }
                com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
            }
            this.f143999a.b(nVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(VideoUrlModel videoUrlModel, boolean z, c cVar) {
        x xVar = x.Normal;
        if (com.ss.android.ugc.aweme.video.simplayer.b.a.a("tryPlayWithInitialStart")) {
            return "155";
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "tryPlayWithInitialStart aid:" + (videoUrlModel != null ? videoUrlModel.getSourceId() : "null"));
        }
        if (!com.ss.android.ugc.playerkit.b.a(com.ss.android.ugc.aweme.video.simcommon.a.a((UrlModel) videoUrlModel))) {
            return "156";
        }
        if (!this.f144002e && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
            f143998l.put(videoUrlModel.getSourceId(), new a());
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        String uri = videoUrlModel.getUri();
        com.ss.android.ugc.playerkit.c.b.f148656b = bitRatedRatioUri;
        com.ss.android.ugc.playerkit.c.b.a(bitRatedRatioUri);
        com.ss.android.ugc.playerkit.a.f148650a.a(uri, "player_try_play");
        boolean z2 = TextUtils.equals(videoUrlModel.getSourceId(), this.f144006i) && com.ss.android.ugc.aweme.player.ab.abs.e.f115041a && !f143997j;
        n.b bVar = new n.b();
        bVar.f143496a.f143486f = com.ss.android.ugc.aweme.video.simcommon.a.a(videoUrlModel);
        n.b c2 = bVar.c(true);
        c2.f143496a.t = true;
        n.b m2 = c2.a(xVar).a(0).d(true).f(z).a(videoUrlModel.getVideoAdTag()).k(z2).a(false).m(false);
        if (cVar != null) {
            m2.l(cVar.f143363a).b(cVar.f143364b).b(cVar.f143365c);
        }
        this.f143999a.a(m2.f143496a);
        this.f144000b = true;
        f143997j = true;
        return "prepareWithInitialStart";
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, OnUIPlayListener onUIPlayListener, int i2) {
        return a(video, (Audio) null, false, onUIPlayListener, i2);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(Surface surface) {
        this.f143999a.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(int i2) {
        this.f143999a.h().a(i2);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(float f2, float f3) {
        this.f143999a.i().a(f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(com.ss.android.ugc.aweme.video.simcommon.a.a(aweme.getVideo()));
        }
        com.ss.android.ugc.playerkit.simapicommon.a.f148867b.execute(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: INVOKE  
              (wrap: java.util.concurrent.ExecutorService : 0x0021: SGET  (r1v1 java.util.concurrent.ExecutorService) =  com.ss.android.ugc.playerkit.simapicommon.a.b java.util.concurrent.ExecutorService)
              (wrap: com.ss.android.ugc.aweme.video.simplayer.s$2 : 0x0025: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.video.simplayer.s$2) = (r2v0 'arrayList' java.util.ArrayList) call: com.ss.android.ugc.aweme.video.simplayer.s.2.<init>(java.util.List):void type: CONSTRUCTOR)
             type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.video.v.a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.video.simplayer.s$2) = (r2v0 'arrayList' java.util.ArrayList) call: com.ss.android.ugc.aweme.video.simplayer.s.2.<init>(java.util.List):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.v.a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.simplayer.s, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0009:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.playerkit.simapicommon.a.h r0 = com.ss.android.ugc.aweme.video.simcommon.a.a(r0)
            r2.add(r0)
            goto L_0x0009
        L_0x0021:
            java.util.concurrent.ExecutorService r1 = com.ss.android.ugc.playerkit.simapicommon.a.f148867b
            com.ss.android.ugc.aweme.video.simplayer.s$2 r0 = new com.ss.android.ugc.aweme.video.simplayer.s$2
            r0.<init>(r2)
            r1.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.v.a(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final void a(String str) {
        this.f143999a.i().a(str);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(Aweme aweme) {
        if (TextUtils.isEmpty(this.f144005h) && aweme != null) {
            this.f144005h = aweme.getAid();
        }
        this.f144004g.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(Audio.InfoIdType infoIdType) {
        this.f143999a.b(infoIdType.getInfoId());
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void a(float f2) {
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "seek aid:" + (this.f143999a.m().b() != null ? this.f143999a.m().b().getSourceId() : "null") + ", progress:" + f2);
        }
        this.f143999a.a(f2);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, OnUIPlayListener onUIPlayListener) {
        return c(video, onUIPlayListener);
    }

    public v() {
        this(true);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void D() {
        this.f143999a.a();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void E() {
        this.f143999a.g();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void H() {
        this.f143999a.e();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void v() {
        this.f144004g.b(fk.f90051a);
    }

    static {
        Covode.recordClassIndex(94223);
    }

    private int R() {
        return this.f143999a.m().a().o();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void F() {
        this.f143999a.i().a();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void G() {
        this.f143999a.i().b();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void I() {
        this.f143999a.h().f();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void J() {
        this.f143999a.h().g();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final String b() {
        return this.f143999a.h().i();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int d() {
        return this.f143999a.h().k();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final String e() {
        return this.f143999a.h().l();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final float g() {
        return this.f143999a.h().m();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final float h() {
        return this.f143999a.h().n();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final float i() {
        return this.f143999a.h().o();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final long j() {
        return this.f143999a.h().d();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int k() {
        return this.f143999a.h().h();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int l() {
        return this.f143999a.h().a();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int m() {
        return this.f143999a.h().b();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final long n() {
        return this.f143999a.h().e();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final boolean o() {
        return this.f143999a.j().a();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final VideoUrlModel q() {
        return com.ss.android.ugc.aweme.video.simcommon.a.a(this.f143999a.m().b());
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final boolean r() {
        return this.f143999a.h().p();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final j.f s() {
        return this.f143999a.h().c();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int t() {
        return this.f143999a.h().q();
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final boolean u() {
        return this.f143999a.h().r();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void A() {
        this.f143999a.e();
        aj.a();
        this.f143999a.c();
        this.f144000b = false;
        this.f144004g.f143846a = 1;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void C() {
        this.f143999a.e();
        this.f143999a.f();
        this.f144000b = false;
        this.f144004g.f143846a = 1;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final long K() {
        j.f v = this.f143999a.m().a().v();
        if (v != null) {
            return v.f115316g;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final int M() {
        return (int) this.f143999a.m().a().a(13);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final int N() {
        return (int) this.f143999a.m().a().a(14);
    }

    @Override // com.ss.android.ugc.aweme.video.h
    public final int c() {
        return this.f143999a.h().j();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void w() {
        if (com.bytedance.ies.abmock.b.a().a(true, "cold_launch_player_opt_exp", 2) == 1) {
            this.f144004g.a(false);
        } else if (com.bytedance.ies.abmock.b.a().a(true, "cold_launch_player_opt_exp", 2) == 2) {
            this.f143999a.m().a().c(new com.ss.android.ugc.aweme.video.simplayer.a.a());
        }
    }

    public static i O() {
        MethodCollector.i(10656);
        i a2 = u.a(com.bytedance.ies.ugc.appcontext.f.j());
        if (a2 != null) {
            MethodCollector.o(10656);
            return a2;
        }
        if (o.c()) {
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 instanceof androidx.fragment.app.e) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) j2;
                l.d(eVar, "");
                i iVar = FeedPlayerManagerViewModel.a.a(eVar).f143219a;
                if (iVar != null) {
                    MethodCollector.o(10656);
                    return iVar;
                }
            }
        }
        if (f143996d == null) {
            synchronized (v.class) {
                try {
                    if (f143996d == null) {
                        v vVar = new v(false);
                        f143996d = vVar;
                        vVar.f143999a.k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10656);
                    throw th;
                }
            }
        }
        v vVar2 = f143996d;
        MethodCollector.o(10656);
        return vVar2;
    }

    private void Q() {
        long n = n();
        if (!this.f144002e && this.f143999a.m().b() != null && !TextUtils.isEmpty(this.f143999a.m().b().getSourceId()) && n >= 0) {
            a aVar = f143998l.get(this.f143999a.m().b().getSourceId());
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f143229a = n;
            aVar.f143230b = R();
            f143998l.put(this.f143999a.m().b().getSourceId(), aVar);
        }
    }

    public final void P() {
        String str;
        this.f144001c.b();
        if (q.a()) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.f143999a.m().b() != null) {
                str = this.f143999a.m().b().getSourceId();
            } else {
                str = "null";
            }
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
        }
        this.f143999a.b();
        this.f144000b = false;
        Q();
        this.f144003f = false;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void x() {
        String str;
        if (q.a()) {
            StringBuilder sb = new StringBuilder("render aid:");
            if (this.f143999a.m().b() != null) {
                str = this.f143999a.m().b().getSourceId();
            } else {
                str = "null";
            }
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
        }
        this.f143999a.m().a().c();
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void y() {
        String str;
        if (!com.ss.android.ugc.aweme.video.simplayer.b.a.a("resumePlay")) {
            this.f144001c.a();
            if (q.a()) {
                StringBuilder sb = new StringBuilder("resumePlay aid:");
                if (this.f143999a.m().b() != null) {
                    str = this.f143999a.m().b().getSourceId();
                } else {
                    str = "null";
                }
                com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
            }
            this.f143999a.d();
            this.f144000b = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void z() {
        String str;
        if (q.a()) {
            StringBuilder sb = new StringBuilder("stopPlay aid:");
            if (this.f143999a.m().b() != null) {
                str = this.f143999a.m().b().getSourceId();
            } else {
                str = "null";
            }
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
        }
        if (b.f143845b) {
            b.f143845b = false;
            return;
        }
        Q();
        this.f143999a.m().a().e();
        this.f144000b = false;
    }

    private static a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new a();
        }
        a aVar = f143998l.get(str);
        if (aVar == null) {
            return new a();
        }
        return aVar;
    }

    public v(f fVar) {
        this.f144001c = com.ss.android.ugc.aweme.commercialize.n.b.f74918b;
        this.f143999a = fVar;
        com.ss.android.ugc.aweme.player.sdk.a.f115103a = q.a();
        this.f144004g = new b(this, this.f143999a.m().a());
    }

    private boolean a(d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.f148707c)) {
            return false;
        }
        return this.f143999a.m().a().a(dVar.f148707c, dVar.f148707c);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String b(n nVar) {
        if (nVar == null || nVar.f143482b == null) {
            return "160";
        }
        this.f143999a.a(nVar);
        return "tryPlayWithInitialStart pr";
    }

    @Override // com.ss.android.ugc.aweme.video.j
    public final String b(String str) {
        j.g u;
        com.ss.android.ugc.aweme.player.sdk.api.l a2 = this.f143999a.m().a();
        j.g gVar = null;
        if (!(a2 == null || (u = a2.u()) == null)) {
            gVar = u;
        }
        return aa.a(gVar, str);
    }

    public v(boolean z) {
        boolean z2;
        this.f144001c = com.ss.android.ugc.aweme.commercialize.n.b.f74918b;
        this.f144002e = false;
        com.ss.android.ugc.aweme.player.sdk.a.f115103a = q.a();
        if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_up_enable", 0) != 1 || (e.f() && !e.d())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "player_v3_up_force_enable", 0) == 1 || (e.e() && e.d())) {
            z2 = true;
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "PlayerManager con useV3:".concat(String.valueOf(z2)));
        }
        if (z2) {
            this.f143999a = ISimPlayerService$$CC.get$$STATIC$$().a(z, !this.f144002e);
        } else {
            this.f143999a = ISimPlayerService$$CC.get$$STATIC$$().a();
        }
        this.f144004g = new b(this, this.f143999a.m().a());
    }

    private boolean a(VideoUrlModel videoUrlModel) {
        String bitRatedRatioUri;
        if (videoUrlModel == null) {
            return false;
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "checkResumePlay aid:" + videoUrlModel.getSourceId());
        }
        if (this.f143999a.m().b() != null && TextUtils.equals(videoUrlModel.getUri(), this.f143999a.m().b().getUri()) && TextUtils.equals(videoUrlModel.getRatio(), this.f143999a.m().b().getRatio())) {
            if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                bitRatedRatioUri = videoUrlModel.getDashVideoId();
            } else {
                bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
            }
            if (TextUtils.isEmpty(videoUrlModel.getSourceId()) || !this.f143999a.m().a().a(videoUrlModel.getSourceId(), bitRatedRatioUri)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final boolean b(OnUIPlayListener onUIPlayListener) {
        return this.f143999a.m().a().b(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void c(OnUIPlayListener onUIPlayListener) {
        String str;
        this.f144001c.b();
        if (q.a()) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.f143999a.m().b() != null) {
                str = this.f143999a.m().b().getSourceId();
            } else {
                str = "null";
            }
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", sb.append(str).toString());
        }
        if (onUIPlayListener != null && this.f143999a.m().a().b(onUIPlayListener)) {
            this.f143999a.b();
            this.f144000b = false;
            Q();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final void b(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Audio.InfoIdType infoIdType;
        Video video;
        Audio.InfoIdType infoIdType2;
        if (aweme != null) {
            String aid = aweme.getAid();
            if (this.f144006i == null) {
                this.f144006i = aid;
            }
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "cold_launch_player_opt_exp", 2) == 1) {
            b bVar = this.f144004g;
            if (q.a()) {
                com.ss.android.ugc.aweme.bm.b.a("PreCreateHelper", "tryPrerenderVideoColdStart aweme:".concat(String.valueOf(aweme)));
            }
            bVar.a(true);
            if (!bVar.f143848d && aweme != null && !aweme.isLive() && (video = aweme.getVideo()) != null && aweme.getVideo().getProperPlayAddr() != null) {
                video.setRationAndSourceId(aweme.getAid());
                boolean a2 = com.ss.android.ugc.aweme.video.util.d.a(aweme);
                n.b a3 = new n.b().a(com.ss.android.ugc.aweme.video.simcommon.a.a(video)).f(video.isNeedSetCookie()).a(Audio.Companion.convertToSimAudio(aweme.getVideo(), aweme.getAudio()));
                if (a2) {
                    infoIdType2 = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType2 = Audio.InfoIdType.ORIGINAL;
                }
                bVar.f143847c.a(a3.c(infoIdType2.getInfoId()).f143496a);
                bVar.f143848d = true;
            }
        } else if (com.bytedance.ies.abmock.b.a().a(true, "cold_launch_player_opt_exp", 2) == 2 && aweme != null && !aweme.isLive()) {
            c a4 = com.ss.android.ugc.aweme.video.util.d.a(aweme.getVideo(), true);
            boolean a5 = com.ss.android.ugc.aweme.video.util.d.a(aweme);
            Video video2 = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (video2 != null && aweme.getVideo().getProperPlayAddr() != null) {
                video2.setRationAndSourceId(aweme.getAid());
                if (com.bytedance.ies.abmock.b.a().a(true, "feed_cold_start_pre_decode_not_render", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (com.bytedance.ies.abmock.b.a().a(true, "feed_cold_start_prerender_range_enable", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (com.bytedance.ies.abmock.b.a().a(true, "force_first_video_soft_decode", 0) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (com.bytedance.ies.abmock.b.a().a(true, "force_first_video_hardware_decode", 0) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                n.b bVar2 = new n.b();
                n.b f2 = bVar2.a(com.ss.android.ugc.aweme.video.simcommon.a.a(video2)).f(video2.isNeedSetCookie());
                f2.f143496a.F = true;
                n.b j2 = f2.j(z);
                j2.f143496a.f143488h = z3;
                j2.f143496a.S = z4;
                n.b a6 = j2.g(z2).a(video2.getVideoAdTag()).a(Audio.convertToSimAudio(video2, audio));
                if (a5) {
                    infoIdType = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType = Audio.InfoIdType.ORIGINAL;
                }
                a6.c(infoIdType.getInfoId()).m(false);
                if (a4 != null) {
                    bVar2.l(a4.f143363a).b(a4.f143364b).b(a4.f143365c);
                }
                a(bVar2.f143496a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String b(Video video, OnUIPlayListener onUIPlayListener) {
        return c(video, onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, int i2) {
        return a(video, (Audio) null, false, true, i2);
    }

    public String c(Video video, OnUIPlayListener onUIPlayListener) {
        return a(video, (Audio) null, false, onUIPlayListener, 0);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, Audio audio, boolean z, boolean z2) {
        return a(video, audio, z, z2, 0);
    }

    private String b(Video video, Audio audio, boolean z, boolean z2, int i2) {
        return c(video, audio, z, z2, i2);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, Audio audio, boolean z, boolean z2, int i2) {
        return b(video, audio, z, z2, i2);
    }

    private String a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i2) {
        return a(video, (Audio) null, false, onUIPlayListener, i2, (c) null);
    }

    private String c(Video video, Audio audio, boolean z, boolean z2, int i2) {
        return a(video, audio, z, z2, i2, true);
    }

    private String a(Video video, Audio audio, boolean z, boolean z2, int i2, boolean z3) {
        return a(video, audio, z, z2, i2, true, true, null);
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, Audio audio, boolean z, OnUIPlayListener onUIPlayListener, int i2, c cVar) {
        String sourceId;
        String sourceId2;
        if (com.ss.android.ugc.aweme.video.simplayer.b.a.a("tryResumePlay")) {
            return "101";
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "tryResumePlay aid:" + e.a(video));
        }
        this.f144001c.a();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!this.f143999a.m().a().b(onUIPlayListener)) {
            return "103";
        }
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null && this.f143999a.m().c() == null) {
            return "105";
        }
        if (i2 > 0) {
            a(video, audio, z, true, i2, true, true, cVar);
            return "106";
        } else if (a(this.f143999a.m().c())) {
            this.f143999a.m().a().a(this.f143999a.m().c().f148707c);
            this.f144000b = false;
            return "107";
        } else if (a(playAddrBytevc1) || a(playAddrH264)) {
            com.ss.android.ugc.aweme.player.sdk.api.l a2 = this.f143999a.m().a();
            if (playAddrBytevc1 != null) {
                sourceId = playAddrBytevc1.getSourceId();
            } else {
                sourceId = playAddrH264.getSourceId();
            }
            a2.a(sourceId);
            this.f144000b = false;
            return "108";
        } else if (this.f144003f) {
            this.f144003f = false;
            if (playAddrBytevc1 != null) {
                sourceId2 = playAddrBytevc1.getSourceId();
            } else {
                sourceId2 = playAddrH264.getSourceId();
            }
            a c2 = c(sourceId2);
            if (c2 != null) {
                a(video, audio, z, true, (int) c2.f143229a, false, true, cVar);
                return "";
            }
            a(video, audio, z, true, 0, true, true, cVar);
            return "";
        } else {
            a(video, audio, z, true, 0, true, true, cVar);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.video.i
    public final String a(Video video, Audio audio, boolean z, boolean z2, int i2, boolean z3, boolean z4, c cVar) {
        boolean z5;
        boolean z6;
        Audio.InfoIdType infoIdType;
        if (video == null) {
            return null;
        }
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PlayerManager", "tryPlayWithInitialStart aid:" + e.a(video));
        }
        b.a(video);
        b.a(this);
        if (video.getPlayAddr() == null || !TextUtils.equals(video.getPlayAddr().getSourceId(), this.f144006i) || !com.ss.android.ugc.aweme.player.ab.abs.e.f115041a || f143997j) {
            z5 = false;
        } else {
            z5 = true;
        }
        n.b c2 = new n.b().a(com.ss.android.ugc.aweme.video.simcommon.a.a(video)).c(z2);
        if (this.f144004g.f143846a == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        n.b a2 = c2.h(z6).a(i2).d(z3).f(video.isNeedSetCookie()).k(z5).e(z4).a(video.getVideoAdTag()).a(Audio.convertToSimAudio(video, audio));
        if (z) {
            infoIdType = Audio.InfoIdType.TRANSLATED;
        } else {
            infoIdType = Audio.InfoIdType.ORIGINAL;
        }
        n.b m2 = a2.c(infoIdType.getInfoId()).m(false);
        if (cVar != null) {
            m2.l(cVar.f143363a).b(cVar.f143364b).b(cVar.f143365c);
        }
        this.f143999a.a(m2.f143496a);
        f143997j = true;
        return "";
    }
}

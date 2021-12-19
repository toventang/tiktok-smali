package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.n;
import com.bytedance.assem.arch.b.g;
import com.bytedance.assem.arch.b.j;
import com.bytedance.assem.arch.b.q;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.assem.f;
import com.ss.android.ugc.aweme.feed.assem.g;
import com.ss.android.ugc.aweme.feed.experiment.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.o;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public abstract class VideoBaseCell implements k, g, com.bytedance.tiktok.proxy.c<VideoBaseCell, VideoItemParams, ap<VideoBaseCell, VideoItemParams>>, ce {

    /* renamed from: a  reason: collision with root package name */
    private final h f91511a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    private boolean f91512b;

    /* renamed from: c  reason: collision with root package name */
    private final k f91513c;

    /* renamed from: i  reason: collision with root package name */
    protected VideoItemParams f91514i;

    /* renamed from: j  reason: collision with root package name */
    public Aweme f91515j;

    /* renamed from: k  reason: collision with root package name */
    public int f91516k;

    /* renamed from: l  reason: collision with root package name */
    protected Fragment f91517l;

    /* renamed from: m  reason: collision with root package name */
    boolean f91518m;
    public ap<VideoBaseCell, VideoItemParams> n;
    public com.ss.android.ugc.aweme.feed.assem.b o;
    public final cf p;

    static {
        Covode.recordClassIndex(57578);
    }

    private final n n() {
        return (n) this.f91511a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void E() {
    }

    public boolean K() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai
    public void L() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai
    public void M() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai
    public void N() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public com.ss.android.ugc.aweme.video.f.a O() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public com.ss.android.ugc.aweme.feed.adapter.a.a Q() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public boolean R() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public com.ss.android.ugc.aweme.feed.helper.d S() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public boolean T() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public aj U() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void V() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void W() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public boolean X() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(int i2, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(int i2, String str, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
    }

    public void a(f fVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(com.ss.android.ugc.aweme.im.service.model.d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(String str, int i2, int i3, int i4, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(String str, int i2, int i3, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(Map map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai
    public View ad() {
        return null;
    }

    public abstract com.ss.android.ugc.aweme.feed.assem.b ae();

    @Override // com.ss.android.ugc.playerkit.videoview.k
    public void b(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void b(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void b_(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public aj c(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void d(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void d(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public ag e() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void f() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void h() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void i() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void k() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public static final class a implements com.bytedance.tiktok.proxy.b<VideoBaseCell, VideoItemParams> {

        /* renamed from: a  reason: collision with root package name */
        private q f91519a;

        /* renamed from: b  reason: collision with root package name */
        private com.ss.android.ugc.aweme.feed.assem.b f91520b;

        static {
            Covode.recordClassIndex(57579);
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void a(boolean z) {
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void b() {
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void c() {
        }

        a() {
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void d() {
            q e2 = e();
            if (e2 != null) {
                e2.k();
            }
        }

        private final q e() {
            j jVar;
            com.ss.android.ugc.aweme.feed.assem.b bVar = this.f91520b;
            q qVar = null;
            if (bVar != null) {
                jVar = bVar.n;
            } else {
                jVar = null;
            }
            if (jVar instanceof q) {
                qVar = jVar;
            }
            return qVar;
        }

        @Override // com.bytedance.tiktok.proxy.b
        public final void a() {
            com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
            if (kVar != null) {
                kVar.a("AssemList", "cell unbindProxy " + this.f91520b + ", position=");
            }
            q e2 = e();
            if (e2 != null) {
                e2.j();
            }
            this.f91520b = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // com.bytedance.tiktok.proxy.b
        public final /* synthetic */ void a(int i2, VideoItemParams videoItemParams) {
            h.f.b.l.d(videoItemParams, "");
            q e2 = e();
            if (e2 != null) {
                e2.a(i2, videoItemParams);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, com.bytedance.tiktok.proxy.c, java.lang.Object, java.util.List, h.f.a.b, h.f.a.a] */
        @Override // com.bytedance.tiktok.proxy.b
        public final /* synthetic */ void a(int i2, com.bytedance.tiktok.proxy.c<VideoBaseCell, VideoItemParams, com.bytedance.tiktok.proxy.a<VideoBaseCell, VideoItemParams>> cVar, VideoItemParams videoItemParams, List list, h.f.a.b<? super VideoItemParams, z> bVar, h.f.a.a aVar) {
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(videoItemParams, "");
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(aVar, "");
            this.f91520b = ((VideoBaseCell) cVar).o;
            if (this.f91519a == null) {
                this.f91519a = new q();
            }
            q qVar = this.f91519a;
            if (qVar != null) {
                qVar.f25434d = i2;
            }
            com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
            if (kVar != null) {
                kVar.a("AssemList", "cell bindProxy: position=" + i2 + ", item=" + videoItemParams);
            }
            q qVar2 = this.f91519a;
            if (qVar2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.feed.assem.b bVar2 = this.f91520b;
            if (bVar2 == null) {
                h.f.b.l.b();
            }
            qVar2.a(bVar2, videoItemParams, list, bVar, aVar);
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.tiktok.proxy.c
    public final /* bridge */ /* synthetic */ VideoBaseCell aG_() {
        return this;
    }

    static final class b extends m implements h.f.a.a<n> {
        final /* synthetic */ VideoBaseCell this$0;

        static {
            Covode.recordClassIndex(57580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoBaseCell videoBaseCell) {
            super(0);
            this.this$0 = videoBaseCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public Aweme P() {
        return b();
    }

    @Override // com.bytedance.tiktok.proxy.c
    public final androidx.lifecycle.m aC_() {
        return this.p.f91768c;
    }

    @Override // com.bytedance.assem.arch.b.g
    public final View aE_() {
        return this.p.f91766a;
    }

    @Override // com.bytedance.assem.arch.b.g
    public final androidx.lifecycle.m aF_() {
        return this.p.f91768c;
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return n();
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        return new af();
    }

    private final void F() {
        n().a(i.a.ON_STOP);
    }

    private final void o() {
        n().a(i.a.ON_PAUSE);
    }

    @Override // com.bytedance.assem.arch.b.g
    public final e aD_() {
        return this.p.f91768c.getActivity();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void c() {
        j jVar;
        com.ss.android.ugc.aweme.feed.assem.b bVar = this.o;
        if (bVar != null && (jVar = bVar.n) != null) {
            jVar.g();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f91521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoBaseCell f91522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f91523c;

        static {
            Covode.recordClassIndex(57581);
        }

        c(VideoItemParams videoItemParams, VideoBaseCell videoBaseCell, int i2) {
            this.f91521a = videoItemParams;
            this.f91522b = videoBaseCell;
            this.f91523c = i2;
        }

        public final void run() {
            com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
            if (kVar != null) {
                kVar.a("AssemList", "VideoBaseCell BindProxy");
            }
            com.ss.android.ugc.aweme.feed.assem.g gVar = this.f91522b.p.n;
            if (gVar != null) {
                VideoItemParams videoItemParams = this.f91521a;
                VideoBaseCell videoBaseCell = this.f91522b;
                int i2 = this.f91523c;
                h.f.b.l.d(videoItemParams, "");
                h.f.b.l.d(videoBaseCell, "");
                z.e eVar = new z.e();
                eVar.element = (T) com.ss.android.ugc.aweme.feed.x.l.a(videoItemParams.mAweme);
                T t = eVar.element;
                if (!(t == null || t.length() == 0)) {
                    ap<VideoBaseCell, VideoItemParams> apVar = gVar.f92253a.get(eVar.element);
                    if (apVar == null) {
                        apVar = new ap<>(new a());
                        ConcurrentHashMap<String, ap<VideoBaseCell, VideoItemParams>> concurrentHashMap = gVar.f92253a;
                        String a2 = com.ss.android.ugc.aweme.feed.x.l.a(videoItemParams.mAweme);
                        if (a2 == null) {
                            h.f.b.l.b();
                        }
                        concurrentHashMap.put(a2, apVar);
                    }
                    ap<VideoBaseCell, VideoItemParams> apVar2 = videoBaseCell.n;
                    if (apVar2 != null) {
                        apVar2.a();
                    }
                    g.a aVar = new g.a(apVar, i2);
                    g.b bVar = new g.b(gVar, eVar, i2);
                    h.f.b.l.d(videoBaseCell, "");
                    h.f.b.l.d(aVar, "");
                    h.f.b.l.d(bVar, "");
                    apVar.a();
                    videoBaseCell.a(apVar);
                    apVar.f91596a = videoBaseCell;
                    com.bytedance.tiktok.proxy.b<R, ITEM> bVar2 = apVar.f91597b;
                    if (bVar2 != null) {
                        bVar2.a(i2, videoBaseCell, videoItemParams, null, aVar, bVar);
                    }
                }
            }
            com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f91524a;

                static {
                    Covode.recordClassIndex(57582);
                }

                {
                    this.f91524a = r1;
                }

                public final void run() {
                    j jVar;
                    androidx.lifecycle.i lifecycle;
                    androidx.lifecycle.i iVar;
                    VideoBaseCell videoBaseCell = this.f91524a.f91522b;
                    com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
                    if (kVar != null) {
                        StringBuilder append = new StringBuilder("tryObserveLifecycle: ").append(videoBaseCell).append(", ");
                        androidx.lifecycle.m aC_ = videoBaseCell.aC_();
                        if (aC_ != null) {
                            iVar = aC_.getLifecycle();
                        } else {
                            iVar = null;
                        }
                        kVar.a("AssemList", append.append(iVar).toString());
                    }
                    if (!videoBaseCell.f91518m) {
                        androidx.lifecycle.m aC_2 = videoBaseCell.aC_();
                        if (!(aC_2 == null || (lifecycle = aC_2.getLifecycle()) == null)) {
                            lifecycle.a(videoBaseCell);
                        }
                        videoBaseCell.f91518m = true;
                    }
                    com.ss.android.ugc.aweme.feed.assem.b bVar = this.f91524a.f91522b.o;
                    if (bVar != null && (jVar = bVar.n) != null) {
                        jVar.f();
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tiktok.proxy.a] */
    @Override // com.bytedance.tiktok.proxy.c
    public final /* bridge */ /* synthetic */ void a(ap<VideoBaseCell, VideoItemParams> apVar) {
        this.n = apVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(View view) {
        h.f.b.l.d(view, "");
        this.o = ae();
        com.bytedance.assem.arch.extensions.d.a(this, new d(this, view));
    }

    public VideoBaseCell(cf cfVar) {
        h.f.b.l.d(cfVar, "");
        this.p = cfVar;
        VideoBaseCell$dispatcher$1 videoBaseCell$dispatcher$1 = new VideoBaseCell$dispatcher$1(this);
        this.f91513c = videoBaseCell$dispatcher$1;
        getLifecycle().a(videoBaseCell$dispatcher$1);
    }

    static final class d extends m implements h.f.a.b<Assembler, h.z> {
        final /* synthetic */ View $parent;
        final /* synthetic */ VideoBaseCell this$0;

        static {
            Covode.recordClassIndex(57583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoBaseCell videoBaseCell, View view) {
            super(1);
            this.this$0 = videoBaseCell;
            this.$parent = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            com.ss.android.ugc.aweme.feed.assem.b bVar = this.this$0.o;
            if (bVar != null) {
                bVar.a(this.$parent);
            }
            com.ss.android.ugc.aweme.feed.assem.b bVar2 = this.this$0.o;
            if (bVar2 != null) {
                bVar2.f25472i = true;
            }
            com.ss.android.ugc.aweme.feed.assem.b bVar3 = this.this$0.o;
            if (bVar3 != null) {
                AssemSupervisor a2 = assembler2.a(this.this$0);
                if (a2 != null) {
                    bVar3.a(a2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            com.ss.android.ugc.aweme.feed.assem.b bVar4 = this.this$0.o;
            if (bVar4 != null) {
                bVar4.a((androidx.lifecycle.m) this.this$0);
            }
            return h.z.f158842a;
        }
    }

    public final void a(int i2, Aweme aweme) {
        String str;
        com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
        if (kVar != null) {
            kVar.a("AssemList", "VideoBaseCell onBind, position: ".concat(String.valueOf(i2)));
        }
        if (K() && w.a()) {
            com.ss.android.ugc.aweme.launcher.service.mob.a aVar = com.ss.android.ugc.aweme.launcher.service.mob.a.f107296a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            aVar.b(str);
        }
        com.bytedance.assem.arch.extensions.k kVar2 = com.bytedance.assem.arch.extensions.j.f25647b;
        if (kVar2 != null) {
            kVar2.a("AssemList", "VideoBaseCell onBindHitAssem, position: " + i2 + ", " + com.bytedance.assem.arch.extensions.j.f25649d + ", " + w.b());
        }
        VideoItemParams videoItemParams = this.f91514i;
        if (videoItemParams != null) {
            com.bytedance.assem.arch.extensions.k kVar3 = com.bytedance.assem.arch.extensions.j.f25647b;
            if (kVar3 != null) {
                kVar3.a("AssemList", "VideoBaseCell isAsyncBind");
            }
            com.bytedance.assem.arch.extensions.j.a(true).execute(new c(videoItemParams, this, i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(Aweme aweme, int i2) {
        a(aweme);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r1 != 3) goto L_0x0040;
     */
    @Override // androidx.lifecycle.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(androidx.lifecycle.m r4, androidx.lifecycle.i.a r5) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell.onStateChanged(androidx.lifecycle.m, androidx.lifecycle.i$a):void");
    }
}

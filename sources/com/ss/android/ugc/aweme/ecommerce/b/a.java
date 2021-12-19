package com.ss.android.ugc.aweme.ecommerce.b;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.extension.player.f;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommerce.b.b;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class a implements com.bytedance.tux.extension.player.a {
    public static final C2023a q = new C2023a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f84647a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f84648b;

    /* renamed from: c  reason: collision with root package name */
    public f f84649c;

    /* renamed from: d  reason: collision with root package name */
    public Video f84650d;

    /* renamed from: e  reason: collision with root package name */
    public int f84651e;

    /* renamed from: f  reason: collision with root package name */
    public long f84652f;

    /* renamed from: g  reason: collision with root package name */
    public v f84653g = new v();

    /* renamed from: h  reason: collision with root package name */
    public boolean f84654h;

    /* renamed from: i  reason: collision with root package name */
    boolean f84655i;

    /* renamed from: j  reason: collision with root package name */
    public float f84656j = -1.0f;

    /* renamed from: k  reason: collision with root package name */
    public int f84657k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f84658l;

    /* renamed from: m  reason: collision with root package name */
    public Runnable f84659m;
    public long n;
    final c o;
    public TuxPlayerView p;
    private final h r = i.a((h.f.a.a) b.f84661a);

    static {
        Covode.recordClassIndex(52858);
    }

    public final Handler i() {
        return (Handler) this.r.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a$a  reason: collision with other inner class name */
    public static final class C2023a {
        static {
            Covode.recordClassIndex(52860);
        }

        private C2023a() {
        }

        public /* synthetic */ C2023a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void g() {
        a();
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void d() {
        v vVar = this.f84653g;
        if (vVar != null) {
            vVar.F();
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void e() {
        v vVar = this.f84653g;
        if (vVar != null) {
            vVar.G();
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final int h() {
        return g.f();
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84661a = new b();

        static {
            Covode.recordClassIndex(52861);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private final void l() {
        i().removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84663a;

        static {
            Covode.recordClassIndex(52863);
        }

        d(a aVar) {
            this.f84663a = aVar;
        }

        public final void run() {
            this.f84663a.n += 1000;
            Runnable runnable = this.f84663a.f84659m;
            if (runnable != null) {
                this.f84663a.i().postDelayed(runnable, 1000);
            }
        }
    }

    public static void k() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.p().a(true);
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void a() {
        if (this.f84647a) {
            this.f84655i = true;
            v vVar = this.f84653g;
            if (vVar != null) {
                j();
                vVar.I();
                vVar.a(this.o);
                vVar.c(this.f84650d, this.o);
            }
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void b() {
        this.f84655i = false;
        this.f84658l = false;
        this.f84656j = -1.0f;
        v vVar = this.f84653g;
        if (vVar != null) {
            l();
            vVar.P();
            vVar.J();
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final boolean f() {
        v vVar = this.f84653g;
        if (vVar != null) {
            return vVar.f143999a.h().s();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        i().removeCallbacksAndMessages(null);
        d dVar = new d(this);
        this.f84659m = dVar;
        i().postDelayed(dVar, 1000);
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void c() {
        this.f84647a = false;
        SurfaceTexture surfaceTexture = this.f84648b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f84648b = null;
        v vVar = this.f84653g;
        if (vVar != null) {
            this.n = 0;
            l();
            vVar.z();
            vVar.a((OnUIPlayListener) null);
            vVar.H();
            vVar.C();
        }
        this.f84653g = null;
    }

    public static final class c implements OnUIPlayListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84662a;

        static {
            Covode.recordClassIndex(52862);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final OnUIPlayListener getWrapperedListener() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBufferedTimeMs(String str, long j2) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(String str, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onCompleteLoaded(String str, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onDecoderBuffering(String str, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onDecoderBuffering(boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str, int i2) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(String str, com.ss.android.ugc.playerkit.model.l lVar) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayPause(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayPrepare(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(String str, long j2, long j3) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayRelease(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str, JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlaying(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreParePlay(String str, n nVar) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreRenderSessionMissed(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(String str, o oVar) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrameFromResume(String str) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(n nVar) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onSeekEnd(String str, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onSeekStart(String str, int i2, float f2) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onVideoSizeChanged(String str, int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            a.k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f84662a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.b(String.valueOf(lVar));
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPausePlay(String str) {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.p().a(false);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            this.f84662a.f84652f = SystemClock.elapsedRealtime();
            b.i.b(b.d.f84675a, r.a());
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.a(String.valueOf(lVar));
            }
            Video video = this.f84662a.f84650d;
            if (lVar != null && video != null) {
                b.i.b(new b.c(video, lVar), r.a());
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f2) {
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.a(f2);
            }
            if (this.f84662a.f84656j == f2) {
                this.f84662a.f84657k++;
            } else {
                this.f84662a.f84657k = 0;
            }
            if (this.f84662a.f84657k > 1) {
                onBuffering(true);
            } else {
                onBuffering(false);
            }
            this.f84662a.f84656j = f2;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(boolean z) {
            if (z) {
                if (!this.f84662a.f84658l) {
                    f fVar = this.f84662a.f84649c;
                    if (fVar != null) {
                        fVar.a(true);
                    }
                    if (b.f84664a == -1) {
                        b.f84664a = SystemClock.elapsedRealtime();
                    }
                    this.f84662a.f84658l = true;
                }
            } else if (this.f84662a.f84658l) {
                f fVar2 = this.f84662a.f84649c;
                if (fVar2 != null) {
                    fVar2.a(false);
                }
                b.i.b(b.CallableC2024b.f84672a, r.a());
                this.f84662a.f84658l = false;
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(o oVar) {
            int i2;
            int i3;
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.a();
            }
            v vVar = this.f84662a.f84653g;
            if (vVar != null) {
                i2 = (int) vVar.i();
            } else {
                i2 = 0;
            }
            v vVar2 = this.f84662a.f84653g;
            if (vVar2 != null) {
                i3 = vVar2.c();
            } else {
                i3 = 0;
            }
            if (this.f84662a.f84652f != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f84662a.f84652f;
                Video video = this.f84662a.f84650d;
                int i4 = this.f84662a.f84651e;
                if (!(video == null || oVar == null)) {
                    b.i.b(new b.a(video, oVar, elapsedRealtime, i4, i2, i3), r.a());
                }
                this.f84662a.f84652f = 0;
            }
            a.k();
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBufferedPercent(String str, long j2, int i2) {
            f fVar = this.f84662a.f84649c;
            if (fVar != null) {
                fVar.a(i2);
            }
        }
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void a(float f2) {
        v vVar = this.f84653g;
        if (vVar != null) {
            vVar.a(f2);
        }
    }

    public static boolean a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return surfaceTexture.isReleased();
    }

    public a(TuxPlayerView tuxPlayerView) {
        l.d(tuxPlayerView, "");
        this.p = tuxPlayerView;
        TuxPlayerView tuxPlayerView2 = this.p;
        this.f84649c = tuxPlayerView2;
        tuxPlayerView2.getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f84660a;

            static {
                Covode.recordClassIndex(52859);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                l.d(surfaceTexture, "");
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                l.d(surfaceTexture, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f84660a = r1;
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                l.d(surfaceTexture, "");
                if (this.f84660a.f84648b == null || a.a(this.f84660a.f84648b)) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                l.d(surfaceTexture, "");
                if (this.f84660a.f84648b == null || a.a(this.f84660a.f84648b)) {
                    this.f84660a.f84648b = surfaceTexture;
                    v vVar = this.f84660a.f84653g;
                    if (vVar != null) {
                        vVar.a(new Surface(this.f84660a.f84648b));
                    }
                } else {
                    SurfaceTexture surfaceTexture2 = this.f84660a.f84648b;
                    if (surfaceTexture2 != null && (!l.a(surfaceTexture2, this.f84660a.p.getVideoView().getSurfaceTexture()))) {
                        int i4 = Build.VERSION.SDK_INT;
                        this.f84660a.p.getVideoView().setSurfaceTexture(surfaceTexture2);
                    }
                }
                this.f84660a.f84647a = true;
                if (this.f84660a.f84654h) {
                    a aVar = this.f84660a;
                    if (aVar.f84647a) {
                        aVar.f84654h = false;
                        aVar.f84655i = true;
                        v vVar2 = aVar.f84653g;
                        if (vVar2 != null) {
                            aVar.j();
                            vVar2.a(aVar.o);
                            vVar2.a(aVar.f84650d, true);
                            vVar2.I();
                            return;
                        }
                        return;
                    }
                    aVar.f84654h = true;
                }
            }
        });
        this.o = new c(this);
    }

    @Override // com.bytedance.tux.extension.player.a
    public final void a(int i2) {
        if (this.f84647a) {
            this.f84654h = false;
            this.f84655i = true;
            v vVar = this.f84653g;
            if (vVar != null) {
                j();
                vVar.a(this.o);
                vVar.a(this.f84650d, i2);
                vVar.I();
                return;
            }
            return;
        }
        this.f84654h = true;
    }
}

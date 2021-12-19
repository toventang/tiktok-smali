package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class b implements OnUIPlayListener {

    /* renamed from: h  reason: collision with root package name */
    public static final a f75943h = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private static final String f75944l = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<OnUIPlayListener> f75945a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.d.a f75946b = new com.ss.android.ugc.aweme.feed.d.a();

    /* renamed from: c  reason: collision with root package name */
    public final VideoViewComponent f75947c;

    /* renamed from: d  reason: collision with root package name */
    public final z f75948d;

    /* renamed from: e  reason: collision with root package name */
    public final v f75949e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f75950f;

    /* renamed from: g  reason: collision with root package name */
    public final C1730b f75951g;

    /* renamed from: i  reason: collision with root package name */
    private View f75952i;

    /* renamed from: j  reason: collision with root package name */
    private final ViewGroup f75953j;

    /* renamed from: k  reason: collision with root package name */
    private final Aweme f75954k;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
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
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, l lVar) {
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
    public final void onRetryOnError(String str, l lVar) {
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

    public static final class a {
        static {
            Covode.recordClassIndex(46836);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(46834);
    }

    public final void b() {
        z zVar = this.f75948d;
        if (zVar.f75823f != null) {
            zVar.f75823f.B();
        }
        this.f75946b.f92885a = 3;
        this.f75949e.J();
    }

    public final void a() {
        this.f75948d.c();
        z zVar = this.f75948d;
        if (!(!zVar.b() || zVar.a() == null || zVar.f75823f == null)) {
            zVar.f75823f.a(zVar.f75821d);
            zVar.f75823f.a(zVar.f75820c.b());
            zVar.f75823f.a(zVar.f75822e.a(zVar.f75818a), zVar.f75821d);
        }
        this.f75946b.f92885a = 4;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.b$b  reason: collision with other inner class name */
    public static final class C1730b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f75955a;

        static {
            Covode.recordClassIndex(46837);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1730b(b bVar) {
            this.f75955a = bVar;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            if (!this.f75955a.f75950f) {
                return;
            }
            if (this.f75955a.f75946b.f92885a == 0) {
                b bVar = this.f75955a;
                z zVar = bVar.f75948d;
                if (!(!zVar.b() || zVar.a() == null || zVar.f75823f == null)) {
                    zVar.f75823f.a(zVar.f75821d);
                    zVar.f75823f.a(zVar.f75820c.b());
                    zVar.f75823f.a(zVar.f75822e.a(zVar.f75818a), true);
                }
                bVar.f75948d.c();
                bVar.f75946b.f92885a = 2;
                return;
            }
            this.f75955a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onRenderReady(nVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
        Iterator<T> it = this.f75945a.iterator();
        while (it.hasNext()) {
            it.next().onRetryOnError(lVar);
        }
    }

    public final void a(int i2) {
        z zVar = this.f75948d;
        if (!(!zVar.b() || zVar.a() == null || zVar.f75823f == null)) {
            zVar.f75823f.a(zVar.f75821d);
            zVar.f75823f.a(zVar.f75820c.b());
            zVar.f75823f.a(zVar.f75822e.a(zVar.f75818a), i2);
        }
        this.f75948d.c();
        this.f75946b.f92885a = 2;
    }

    public b(ViewGroup viewGroup, Aweme aweme) {
        h.f.b.l.d(viewGroup, "");
        this.f75953j = viewGroup;
        this.f75954k = aweme;
        C1730b bVar = new C1730b(this);
        this.f75951g = bVar;
        v vVar = new v();
        this.f75949e = vVar;
        vVar.f144001c = new com.ss.android.ugc.aweme.commercialize.n.a() {
            /* class com.ss.android.ugc.aweme.commercialize.views.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(46835);
            }

            @Override // com.ss.android.ugc.aweme.commercialize.n.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.commercialize.n.a
            public final void b() {
            }
        };
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        this.f75947c = videoViewComponent;
        videoViewComponent.a(viewGroup);
        j jVar = videoViewComponent.f148883b;
        h.f.b.l.b(jVar, "");
        View a2 = jVar.a();
        h.f.b.l.b(a2, "");
        this.f75952i = a2;
        z zVar = new z(videoViewComponent, this);
        this.f75948d = zVar;
        zVar.f75823f = vVar;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                zVar.f75819b = aweme;
                zVar.f75818a = aweme.getForwardItem();
            } else {
                zVar.f75819b = null;
                zVar.f75818a = aweme;
            }
        }
        videoViewComponent.a(bVar);
    }
}

package com.ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.a.h;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.model.p;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.videoview.a;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoViewComponent implements au, g, h {

    /* renamed from: i  reason: collision with root package name */
    private static com.ss.android.ugc.playerkit.a.b f148881i = new com.ss.android.ugc.playerkit.a.b() {
        /* class com.ss.android.ugc.playerkit.videoview.VideoViewComponent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98044);
        }

        @Override // com.ss.android.ugc.playerkit.a.b
        public final void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        AppLog.recordMiscLog(com.bytedance.ies.ugc.appcontext.d.a(), "video_playq", jSONArray.getJSONObject(i2));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.playerkit.a.b
        public final void a(JSONArray jSONArray, String str) {
            if (!(jSONArray == null || TextUtils.isEmpty(str) || !com.ss.android.ugc.playerkit.model.c.f148702a.isEnablePlayerLogV2())) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        r.a(str, jSONArray.getJSONObject(i2));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public l f148882a;

    /* renamed from: b  reason: collision with root package name */
    public j f148883b;

    /* renamed from: c  reason: collision with root package name */
    public Set<OnUIPlayListener> f148884c;

    /* renamed from: d  reason: collision with root package name */
    public Video f148885d;

    /* renamed from: e  reason: collision with root package name */
    public Session f148886e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f148887f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f148888g;

    /* renamed from: h  reason: collision with root package name */
    public int f148889h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f148890j;

    /* renamed from: k  reason: collision with root package name */
    private e f148891k;

    /* renamed from: l  reason: collision with root package name */
    private a f148892l;

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onPageResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPagePause();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public void onPagePause() {
        b();
    }

    @v(a = i.a.ON_RESUME)
    public void onPageResume() {
        a();
    }

    public final void a(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f148883b = j.a(keepSurfaceTextureView);
        keepSurfaceTextureView.getContext();
        k();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final void a(OnUIPlayListener onUIPlayListener) {
        l lVar;
        this.f148884c.remove(onUIPlayListener);
        if (this.f148884c.isEmpty() && (lVar = this.f148882a) != null) {
            lVar.a((OnUIPlayListener) null);
        }
    }

    public final void a(k kVar) {
        this.f148883b.a(kVar);
    }

    public final void h() {
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.q();
        }
    }

    public final void i() {
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.r();
        }
    }

    static {
        Covode.recordClassIndex(98043);
    }

    private void k() {
        this.f148883b.a(new k() {
            /* class com.ss.android.ugc.playerkit.videoview.VideoViewComponent.AnonymousClass2 */

            static {
                Covode.recordClassIndex(98045);
            }

            @Override // com.ss.android.ugc.playerkit.videoview.k
            public final void b(int i2, int i3) {
            }

            @Override // com.ss.android.ugc.playerkit.videoview.k
            public final void aB_() {
                if (VideoViewComponent.this.f148883b.e() == 1) {
                    VideoViewComponent.this.f148882a.b((Surface) null);
                }
            }

            @Override // com.ss.android.ugc.playerkit.videoview.k
            public final void a(int i2, int i3) {
                if (VideoViewComponent.this.f148883b.e() == 1) {
                    VideoViewComponent.this.f148883b.f();
                }
                if (VideoViewComponent.this.f148888g) {
                    VideoViewComponent.this.f148888g = false;
                    VideoViewComponent videoViewComponent = VideoViewComponent.this;
                    videoViewComponent.a(videoViewComponent.f148885d, VideoViewComponent.this.f148889h);
                }
            }
        });
    }

    public final long e() {
        l lVar = this.f148882a;
        if (lVar != null) {
            return lVar.j();
        }
        return 0;
    }

    public final long f() {
        l lVar = this.f148882a;
        if (lVar != null) {
            return lVar.k();
        }
        return 0;
    }

    public final boolean g() {
        l lVar = this.f148882a;
        if (lVar != null) {
            return lVar.l();
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final j.g j() {
        l lVar = this.f148882a;
        if (lVar != null) {
            return lVar.u();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class b implements com.ss.android.ugc.playerkit.a.d<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f148895a;

        static {
            Covode.recordClassIndex(98047);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.playerkit.a.d
        public final /* synthetic */ Boolean a() {
            if (d.INSTANCE.cacheChecker() == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(d.INSTANCE.cacheChecker().a(this.f148895a));
        }

        b(VideoUrlModel videoUrlModel) {
            this.f148895a = videoUrlModel;
        }
    }

    public VideoViewComponent() {
        this.f148884c = Collections.newSetFromMap(new WeakHashMap());
        this.f148889h = 0;
        this.f148891k = l.f148969a;
        this.f148892l = new a(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public static class c implements com.ss.android.ugc.playerkit.a.d<u> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f148896a;

        /* renamed from: b  reason: collision with root package name */
        private Session f148897b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f148898c;

        static {
            Covode.recordClassIndex(98048);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.playerkit.a.d
        public final /* synthetic */ u a() {
            com.ss.android.ugc.playerkit.videoview.c.a aVar = com.ss.android.ugc.playerkit.videoview.c.a.f148919a;
            String urlKey = this.f148896a.getUrlKey();
            if (aVar.f148920b == null) {
                aVar.f148920b = com.ss.android.ugc.aweme.simkit.d.a().h().a();
            }
            com.ss.android.ugc.playerkit.videoview.b.c cVar = aVar.f148920b;
            aVar.c(urlKey);
            return cVar.a().a(e.a(this.f148896a), this.f148897b.playerType, this.f148898c);
        }

        c(VideoUrlModel videoUrlModel, Session session, boolean z) {
            this.f148896a = videoUrlModel;
            this.f148897b = session;
            this.f148898c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements com.ss.android.ugc.playerkit.a.d<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f148899a;

        static {
            Covode.recordClassIndex(98049);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.playerkit.a.d
        public final /* synthetic */ Integer a() {
            Integer valueOf;
            com.ss.android.ugc.playerkit.simapicommon.a.i a2 = e.a(this.f148899a);
            int i2 = -1;
            if (a2 != null) {
                com.ss.android.ugc.f.a.a.a.a.c hitBitrate = a2.getHitBitrate();
                if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                    valueOf = -1;
                }
                i2 = valueOf.intValue();
            }
            return Integer.valueOf(i2);
        }

        d(VideoUrlModel videoUrlModel) {
            this.f148899a = videoUrlModel;
        }
    }

    private void l() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "render() called " + this.f148882a);
        }
        if (this.f148882a != null) {
            a.C4019a.f148902a.a(this);
            this.f148887f = false;
            this.f148882a.c();
        }
    }

    public final void b() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "pause() called " + this.f148882a);
        }
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.f();
        }
        j jVar = this.f148883b;
        if (jVar != null) {
            jVar.g();
            l lVar2 = this.f148882a;
            if (lVar2 != null) {
                lVar2.t();
            }
        }
    }

    public final void d() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "release() called " + this.f148882a);
        }
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.g();
        }
        j jVar = this.f148883b;
        if (jVar != null) {
            jVar.h();
        }
    }

    public final void c() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "stop() called " + this.f148882a);
        }
        if (this.f148882a != null) {
            if (b.f148915a && com.ss.android.ugc.playerkit.b.a(this.f148882a.t()) && com.ss.android.ugc.playerkit.model.c.f148702a.isEnableBytevc1BlackList()) {
                b.f148915a = this.f148882a.i();
            }
            this.f148882a.e();
        }
        j jVar = this.f148883b;
        if (jVar != null) {
            jVar.h();
        }
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "resume() called " + this.f148882a);
        }
        Session session = this.f148886e;
        if (session != null && session.urlModel != null) {
            this.f148882a.a(this.f148886e.urlModel.getSourceId());
        }
    }

    private static com.ss.android.ugc.playerkit.a.d<Integer> c(VideoUrlModel videoUrlModel) {
        return new d(videoUrlModel);
    }

    private static com.ss.android.ugc.playerkit.a.d<Boolean> d(VideoUrlModel videoUrlModel) {
        return new b(videoUrlModel);
    }

    /* access modifiers changed from: package-private */
    public static class a implements OnUIPlayListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<VideoViewComponent> f148894a;

        static {
            Covode.recordClassIndex(98046);
        }

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
        public final void onDecoderBuffering(boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str, int i2) {
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

        private a(VideoViewComponent videoViewComponent) {
            this.f148894a = new WeakReference<>(videoViewComponent);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(boolean z) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onBuffering(z);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPausePlay(String str) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onPausePlay(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onPlayCompleted(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onPlayCompletedFirstTime(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f2) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onPlayProgressChange(f2);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onPreparePlay(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(o oVar) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f148887f = false;
                videoViewComponent.f148888g = false;
                a.C4019a.f148902a.a(videoViewComponent);
                if (!videoViewComponent.f148884c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                        onUIPlayListener.onRenderFirstFrame(oVar);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(n nVar) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onRenderReady(nVar);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (!(videoViewComponent == null || videoViewComponent.f148884c.isEmpty())) {
                for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                    onUIPlayListener.onResumePlay(str);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f148887f = false;
                if (!videoViewComponent.f148884c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                        onUIPlayListener.onRetryOnError(lVar);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            VideoViewComponent videoViewComponent = this.f148894a.get();
            if (videoViewComponent != null) {
                videoViewComponent.f148887f = false;
                if (!videoViewComponent.f148884c.isEmpty()) {
                    for (OnUIPlayListener onUIPlayListener : videoViewComponent.f148884c) {
                        onUIPlayListener.onPlayFailed(lVar);
                    }
                }
                if (lVar.f148747b && videoViewComponent.f148885d != null) {
                    videoViewComponent.a(videoViewComponent.f148885d.getPlayAddrH264(), true, videoViewComponent.f148889h, videoViewComponent.f148885d.isNeedSetCookie());
                }
            }
        }

        /* synthetic */ a(VideoViewComponent videoViewComponent, byte b2) {
            this(videoViewComponent);
        }
    }

    public final void a(float f2) {
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.a(f2);
        }
    }

    public final void b(OnUIPlayListener onUIPlayListener) {
        this.f148884c.add(onUIPlayListener);
        l lVar = this.f148882a;
        if (lVar != null) {
            lVar.a(this.f148892l);
        }
    }

    public final void a(ViewGroup viewGroup) {
        this.f148883b = j.a(viewGroup);
        viewGroup.getContext();
        k();
    }

    public VideoViewComponent(byte b2) {
        this.f148884c = Collections.newSetFromMap(new WeakHashMap());
        this.f148889h = 0;
        this.f148891k = m.f148970a;
        this.f148892l = new a(this, (byte) 0);
        this.f148890j = true;
    }

    private static boolean a(VideoUrlModel videoUrlModel) {
        List<String> urlList;
        boolean z = false;
        if (!(videoUrlModel == null || (urlList = videoUrlModel.getUrlList()) == null || urlList.size() <= 0)) {
            z = true;
            for (String str : urlList) {
                if (!a(com.bytedance.ies.ugc.appcontext.d.a(), str)) {
                    z = false;
                }
            }
        }
        return z;
    }

    private boolean b(VideoUrlModel videoUrlModel) {
        Session session;
        if (videoUrlModel != null && (session = this.f148886e) != null && session.urlModel != null && com.bytedance.common.utility.m.a(videoUrlModel.getUri(), this.f148886e.urlModel.getUri()) && com.bytedance.common.utility.m.a(videoUrlModel.getRatio(), this.f148886e.urlModel.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f148882a.a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        }
        return false;
    }

    public final void a(Video video) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "tryResume() called " + this.f148882a);
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 != null || playAddrH264 != null) {
            if (b(playAddrBytevc1) || b(playAddrH264)) {
                a();
            } else {
                a(video, this.f148889h);
            }
        }
    }

    private static boolean a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
            try {
                if (com.bytedance.ttnet.a.a.a(context).d(URI.create(str).getHost()) != null) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void a(Video video, int i2) {
        if (video != null) {
            this.f148885d = video;
            if (!this.f148883b.c()) {
                this.f148888g = true;
            } else if (this.f148887f) {
                l();
            } else if (b.a(video, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType())) {
                a(video.getPlayAddrBytevc1(), false, i2, video.isNeedSetCookie());
            } else {
                a(video.getPlayAddrH264(), false, i2, video.isNeedSetCookie());
            }
        }
    }

    private static com.ss.android.ugc.playerkit.a.d<u> a(VideoUrlModel videoUrlModel, Session session, boolean z) {
        return new c(videoUrlModel, session, z);
    }

    public final void a(VideoUrlModel videoUrlModel, boolean z, int i2, boolean z2) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("VideoViewComponent", "play() called " + this.f148882a);
        }
        if (videoUrlModel != null && com.ss.android.ugc.playerkit.b.a(e.a(videoUrlModel))) {
            String uri = videoUrlModel.getUri();
            if (TextUtils.isEmpty(uri)) {
                com.bytedance.c.a.a.a.b.a(new RuntimeException("VideoUrlModel url_key is null. vid=" + videoUrlModel.getSourceId()));
            }
            this.f148886e = com.ss.android.ugc.playerkit.session.a.f148854a.d(uri);
            this.f148889h = i2;
            if (this.f148890j) {
                this.f148882a = new h(new com.ss.android.ugc.aweme.player.sdk.a.i(com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType()));
            } else {
                this.f148882a = com.ss.android.ugc.playerkit.videoview.c.a.f148919a.b(uri);
            }
            this.f148886e.uri = uri;
            this.f148886e.urlModel = e.a(videoUrlModel);
            this.f148886e.playerType = this.f148882a.t();
            this.f148882a.a(this.f148892l);
            this.f148882a.a(f148881i);
            this.f148882a.a(this.f148891k);
            this.f148882a.a(d.INSTANCE.playInfoCallback());
            com.ss.android.ugc.playerkit.a.f148650a.a(this.f148886e.uri, "player_try_play");
            com.ss.android.ugc.playerkit.c.b.a(uri);
            p pVar = new p(a(videoUrlModel, this.f148886e, z), d(videoUrlModel), com.ss.android.ugc.playerkit.model.c.f148702a.context(), videoUrlModel.getSourceId(), true, com.ss.android.ugc.playerkit.model.c.f148702a.prepareConfig(), false, videoUrlModel.isBytevc1(), 0, c(videoUrlModel), uri, true, com.ss.android.ugc.playerkit.model.c.f148702a.isAsyncInit(), this.f148889h, null);
            pVar.v = com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerFramesWait();
            pVar.y = videoUrlModel.getBitRatedRatioUri();
            com.ss.android.ugc.playerkit.session.a.f148854a.a(pVar.y, videoUrlModel.getFileCheckSum());
            pVar.H = com.ss.android.ugc.playerkit.model.c.f148702a.isUseVideoTextureRenderer();
            if (z2 && a(videoUrlModel)) {
                pVar.I = true;
            }
            this.f148882a.a(this.f148883b.b());
            this.f148882a.a(pVar);
            j jVar = this.f148883b;
            if (jVar != null) {
                jVar.h();
            }
        }
    }
}

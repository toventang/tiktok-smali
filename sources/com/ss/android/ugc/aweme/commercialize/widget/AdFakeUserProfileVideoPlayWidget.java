package com.ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.ss.android.ugc.aweme.commercialize.utils.as;
import com.ss.android.ugc.aweme.commercialize.utils.z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import h.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class AdFakeUserProfileVideoPlayWidget extends AbsAdProfileWidget implements au, OnUIPlayListener, i, j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f76298k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.views.b f76299j;

    /* renamed from: l  reason: collision with root package name */
    private final h f76300l = h.i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f76301m = h.i.a((h.f.a.a) new e(this));
    private boolean n;
    private as o = new as();
    private boolean p;
    private Handler q = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(47058);
    }

    private final ViewGroup g() {
        return (ViewGroup) this.f76300l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ImageView e() {
        return (ImageView) this.f76301m.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(399, new org.greenrobot.eventbus.g(AdFakeUserProfileVideoPlayWidget.class, "onAdPopupWebPageEvent", com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
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
    public final void onBuffering(boolean z) {
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
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
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
    public final void onPlayProgressChange(float f2) {
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
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

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47059);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f76302a;

        static {
            Covode.recordClassIndex(47060);
        }

        b(ImageView imageView) {
            this.f76302a = imageView;
        }

        public final void run() {
            this.f76302a.setVisibility(8);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget this$0;

        static {
            Covode.recordClassIndex(47062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            super(0);
            this.this$0 = adFakeUserProfileVideoPlayWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.a(R.id.ffp);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget this$0;

        static {
            Covode.recordClassIndex(47063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            super(0);
            this.this$0 = adFakeUserProfileVideoPlayWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.a(R.id.fgt);
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f76305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f76306b;

        static {
            Covode.recordClassIndex(47064);
        }

        f(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, int i2) {
            this.f76305a = adFakeUserProfileVideoPlayWidget;
            this.f76306b = i2;
        }

        public final void run() {
            com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76305a.f76299j;
            if (bVar != null) {
                bVar.a(this.f76306b);
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f76307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f76308b;

        static {
            Covode.recordClassIndex(47065);
        }

        g(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, int i2) {
            this.f76307a = adFakeUserProfileVideoPlayWidget;
            this.f76308b = i2;
        }

        public final void run() {
            com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76307a.f76299j;
            if (bVar != null) {
                bVar.a(this.f76308b);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if (this.n) {
            com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76299j;
            if (bVar != null) {
                bVar.b();
            }
            f();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        com.ss.android.ugc.aweme.commercialize.views.b bVar;
        super.onResume();
        if (this.n && !this.p && (bVar = this.f76299j) != null && bVar.f75946b.f92885a != 0) {
            bVar.a();
        }
    }

    public final void f() {
        ImageView e2 = e();
        if (e2 != null) {
            e2.animate().alpha(0.0f).scaleX(2.5f).scaleY(2.5f).withEndAction(new b(e2)).setDuration(100).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76299j;
        if (bVar != null) {
            if (bVar.f75949e.b(bVar)) {
                z zVar = bVar.f75948d;
                if (zVar.f75823f != null && zVar.f75823f.b(zVar.f75821d)) {
                    zVar.f75823f.a((OnUIPlayListener) null);
                }
            }
            VideoViewComponent videoViewComponent = bVar.f75947c;
            videoViewComponent.f148883b.b(bVar.f75951g);
            bVar.f75945a.clear();
            try {
                bVar.f75949e.H();
                bVar.f75949e.C();
            } catch (Throwable unused) {
            }
        }
        Context context = this.f67007b;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        long j2 = this.o.f75611a;
        f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
        a2.f74804a = "homepage_ad";
        a2.f74805b = "play_break";
        a2.a(j2).b(aweme).a(context);
        if (aweme != null) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "play_break", aweme.getAwemeRawAd()).b("duration", Long.valueOf(j2)).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        com.ss.android.ugc.aweme.commercialize.log.j.w(this.f67007b, ((AbsAdProfileWidget) this).f75063a);
        this.o.a();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        v vVar;
        ViewGroup g2;
        com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76299j;
        if (!(bVar == null || (vVar = bVar.f75949e) == null || (g2 = g()) == null)) {
            a(g2, vVar.l(), vVar.m());
        }
        this.o.a();
        com.ss.android.ugc.aweme.commercialize.log.j.w(this.f67007b, ((AbsAdProfileWidget) this).f75063a);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f76303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Video f76304b;

        static {
            Covode.recordClassIndex(47061);
        }

        c(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, Video video) {
            this.f76303a = adFakeUserProfileVideoPlayWidget;
            this.f76304b = video;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commercialize.views.b bVar = this.f76303a.f76299j;
            if (bVar == null) {
                return;
            }
            if (bVar.f75946b.f92885a == 3) {
                bVar.a();
                this.f76303a.f();
                return;
            }
            bVar.b();
            ImageView e2 = this.f76303a.e();
            if (e2 != null) {
                e2.setAlpha(0.0f);
                e2.setScaleX(2.5f);
                e2.setScaleY(2.5f);
                e2.setVisibility(0);
                e2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(com.ss.android.ugc.aweme.commercialize.profile.i iVar) {
        Video video;
        ViewGroup g2;
        v vVar;
        h.f.b.l.d(iVar, "");
        super.a(iVar);
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        if (aweme != null && (video = aweme.getVideo()) != null && (g2 = g()) != null) {
            a(g2, video.getWidth(), video.getHeight());
            com.ss.android.ugc.aweme.commercialize.views.b bVar = new com.ss.android.ugc.aweme.commercialize.views.b(g2, ((AbsAdProfileWidget) this).f75063a);
            this.f76299j = bVar;
            bVar.f75950f = false;
            com.ss.android.ugc.aweme.commercialize.views.b bVar2 = this.f76299j;
            if (bVar2 != null && !bVar2.f75945a.contains(this)) {
                bVar2.f75945a.add(this);
            }
            com.ss.android.ugc.aweme.commercialize.views.b bVar3 = this.f76299j;
            if (!(bVar3 == null || (vVar = bVar3.f75949e) == null)) {
                com.ss.android.ugc.aweme.commercialize.utils.f.f75761b = new WeakReference<>(vVar);
            }
            View view = this.f67009d;
            if (view != null) {
                view.setOnClickListener(new c(this, video));
            }
        }
    }

    @r
    public final void onAdPopupWebPageEvent(com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d dVar) {
        int i2;
        com.ss.android.ugc.aweme.commercialize.views.b bVar;
        h.f.b.l.d(dVar, "");
        boolean z = dVar.f74408a;
        this.p = z;
        if (z) {
            com.ss.android.ugc.aweme.commercialize.views.b bVar2 = this.f76299j;
            if ((bVar2 == null || bVar2.f75946b.f92885a != 3) && (bVar = this.f76299j) != null) {
                bVar.b();
            }
        } else if (this.n) {
            com.ss.android.ugc.aweme.commercialize.views.b bVar3 = this.f76299j;
            if (bVar3 == null || bVar3.f75946b.f92885a != 0) {
                com.ss.android.ugc.aweme.commercialize.views.b bVar4 = this.f76299j;
                if (bVar4 != null) {
                    bVar4.a();
                }
                f();
                return;
            }
            com.ss.android.ugc.aweme.video.i a2 = com.ss.android.ugc.aweme.commercialize.utils.f.a();
            if (a2 != null) {
                i2 = (int) a2.n();
            } else {
                i2 = 0;
            }
            if (!com.ss.android.ugc.aweme.experiment.c.a()) {
                com.ss.android.ugc.aweme.commercialize.views.b bVar5 = this.f76299j;
                if (bVar5 != null) {
                    bVar5.a(i2);
                    return;
                }
                return;
            }
            this.q.post(new f(this, i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Context context = this.f67007b;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a();
        a2.f74804a = "homepage_ad";
        a2.f74805b = "pause";
        a2.b(aweme).a(context);
        if (aweme != null) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "pause", aweme.getAwemeRawAd()).c();
        }
        as asVar = this.o;
        if (asVar.f75614d) {
            asVar.f75614d = false;
            asVar.f75613c = System.currentTimeMillis();
            if (asVar.f75613c > 0 && asVar.f75612b > 0 && asVar.f75613c - asVar.f75612b > 0) {
                asVar.f75611a += asVar.f75613c - asVar.f75612b;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r8 != false) goto L_0x0035;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r8) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget.a(boolean):void");
    }

    private final void a(View view, int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            ViewWrapper viewWrapper = new ViewWrapper(view);
            viewWrapper.setWidth(com.bytedance.common.utility.n.a(this.f67007b));
            viewWrapper.setHeight((int) ((((float) viewWrapper.getWidth()) * ((float) i3)) / ((float) i2)));
            DataCenter dataCenter = this.f67010e;
            if (dataCenter != null) {
                dataCenter.a("ON_VIDEO_CONTAINER_SIZE_CHANGE", (Object) null);
            }
        }
    }
}

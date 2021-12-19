package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.shoutouts.a.a;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderRestrict;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPrice;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProduct;
import com.ss.android.ugc.aweme.shoutouts.model.StandardMoney;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError;
import com.ss.android.ugc.aweme.shoutouts.review.view.b;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class ShoutoutsProductPreviewActivity extends com.bytedance.ies.foundation.activity.a implements OnUIPlayListener, a.AbstractC3448a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f133290i = new a((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) new p(this));
    private final h.h B = h.i.a((h.f.a.a) new k(this));
    private final h.h C = h.i.a((h.f.a.a) new m(this));
    private final h.h D = h.i.a((h.f.a.a) new q(this));
    private final h.h E = h.i.a((h.f.a.a) new e(this));
    private SparseArray F;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f133291a;

    /* renamed from: b  reason: collision with root package name */
    public Video f133292b;

    /* renamed from: c  reason: collision with root package name */
    public ShoutoutsProduct f133293c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f133294d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shoutouts.review.d.a f133295e = new com.ss.android.ugc.aweme.shoutouts.review.d.a(this);

    /* renamed from: f  reason: collision with root package name */
    public SafeHandler f133296f = new SafeHandler(this);

    /* renamed from: g  reason: collision with root package name */
    public String f133297g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f133298h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f133299j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f133300k;

    /* renamed from: l  reason: collision with root package name */
    private String f133301l;

    /* renamed from: m  reason: collision with root package name */
    private String f133302m;
    private int n;
    private boolean o;
    private boolean p;
    private Integer q;
    private Integer r;
    private String s;
    private String t;
    private final long u = System.currentTimeMillis();
    private final h.h v = h.i.a((h.f.a.a) u.f133323a);
    private final h.h w = h.i.a((h.f.a.a) new d(this));
    private final h.h x = h.i.a((h.f.a.a) new n(this));
    private final h.h y = h.i.a((h.f.a.a) new c(this));
    private final h.h z = h.i.a((h.f.a.a) new t(this));

    static {
        Covode.recordClassIndex(87178);
    }

    private final KeepSurfaceTextureView j() {
        return (KeepSurfaceTextureView) this.z.getValue();
    }

    private final DmtStatusView k() {
        return (DmtStatusView) this.A.getValue();
    }

    private final View l() {
        return (View) this.B.getValue();
    }

    private final View m() {
        return (View) this.C.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.F;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.F == null) {
            this.F = new SparseArray();
        }
        View view = (View) this.F.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.F.put(i2, findViewById);
        return findViewById;
    }

    public final VideoViewComponent c() {
        return (VideoViewComponent) this.v.getValue();
    }

    public final ViewGroup d() {
        return (ViewGroup) this.w.getValue();
    }

    public final c e() {
        return (c) this.x.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(287, new org.greenrobot.eventbus.g(ShoutoutsProductPreviewActivity.class, "onShoutoutProductStatusChanged", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
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
    public final void onBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
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
    public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
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
    public final void onPlayStop(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, com.ss.android.ugc.playerkit.model.o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87179);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<h.f.a.a<? extends z>, z> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(1);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        public static final class a implements ShoutoutVideoDownloadListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f133311a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f133312b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f133313c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ IShoutOutsService f133314d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Long f133315e;

            static {
                Covode.recordClassIndex(87196);
            }

            @Override // com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener
            public final void onFail() {
                this.f133313c.invoke();
            }

            @Override // com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener
            public final void onSuccess(final String str) {
                h.f.b.l.d(str, "");
                this.f133313c.invoke();
                if (!TextUtils.isEmpty(str)) {
                    this.f133311a.this$0.f133296f.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.o.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f133316a;

                        static {
                            Covode.recordClassIndex(87197);
                        }

                        {
                            this.f133316a = r1;
                        }

                        public final void run() {
                            String str;
                            IShoutOutsService iShoutOutsService = this.f133316a.f133314d;
                            ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.f133316a.f133311a.this$0;
                            String str2 = str;
                            String str3 = this.f133316a.f133312b;
                            Long l2 = this.f133316a.f133315e;
                            if (l2 != null) {
                                str = String.valueOf(l2.longValue());
                            } else {
                                str = null;
                            }
                            iShoutOutsService.startShoutoutsPublishSyncActivity(shoutoutsProductPreviewActivity, str2, str3, str);
                        }
                    });
                }
            }

            a(o oVar, String str, h.f.a.a aVar, IShoutOutsService iShoutOutsService, Long l2) {
                this.f133311a = oVar;
                this.f133312b = str;
                this.f133313c = aVar;
                this.f133314d = iShoutOutsService;
                this.f133315e = l2;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h.f.a.a<? extends z> aVar) {
            List<String> list;
            Music music;
            VideoUrlModel playAddr;
            h.f.a.a<? extends z> aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.a().shoutOutsService();
            Video video = this.this$0.f133292b;
            Long l2 = null;
            if (video == null || (playAddr = video.getPlayAddr()) == null) {
                list = null;
            } else {
                list = playAddr.getUrlList();
            }
            String g2 = this.this$0.g();
            Aweme aweme = this.this$0.f133291a;
            if (!(aweme == null || (music = aweme.getMusic()) == null)) {
                l2 = Long.valueOf(music.getId());
            }
            if (!(list == null || !(!list.isEmpty()) || list.get(0) == null || g2 == null)) {
                ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.this$0;
                String str = list.get(0);
                h.f.b.l.b(str, "");
                String str2 = str;
                a aVar3 = new a(this, g2, aVar2, shoutOutsService, l2);
                h.f.b.l.d(shoutoutsProductPreviewActivity, "");
                h.f.b.l.d(str2, "");
                h.f.b.l.d(aVar3, "");
                AVExternalServiceImpl.a().shoutOutsService().startDownLoadVideo(shoutoutsProductPreviewActivity, str2, aVar3);
            }
            return z.f158842a;
        }
    }

    public static final class f implements com.ss.android.ugc.playerkit.videoview.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133305a;

        static {
            Covode.recordClassIndex(87185);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            this.f133305a.f133294d = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133305a = shoutoutsProductPreviewActivity;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            this.f133305a.f133294d = true;
            this.f133305a.h();
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<VideoViewComponent> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f133323a = new u();

        static {
            Covode.recordClassIndex(87206);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<AutoRTLImageView> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AutoRTLImageView invoke() {
            return this.this$0.findViewById(R.id.e3v);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.e3u);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.e3w);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c(this.this$0, (byte) 0);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.findViewById(R.id.ci4);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.f9d);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<KeepSurfaceTextureView> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KeepSurfaceTextureView invoke() {
            return this.this$0.d().findViewById(R.id.e3x);
        }
    }

    private final String o() {
        String str = this.f133301l;
        if (str != null) {
            return str;
        }
        ShoutoutsProduct shoutoutsProduct = this.f133293c;
        if (shoutoutsProduct != null) {
            return shoutoutsProduct.getCreatorUid();
        }
        return null;
    }

    public final String g() {
        String str = this.f133302m;
        if (str != null) {
            return str;
        }
        ShoutoutsProduct shoutoutsProduct = this.f133293c;
        if (shoutoutsProduct != null) {
            return shoutoutsProduct.getProductId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.a.a.AbstractC3448a
    public final void a() {
        k().setVisibility(8);
        ((ShoutoutsProductReviewError) this.E.getValue()).setVisibility(0);
    }

    public final void h() {
        if (this.f133294d && this.f133292b != null) {
            c().a(this.f133292b);
            j().setOnClickListener(new l(this));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            MethodCollector.i(4977);
            View inflate = ((ViewStub) this.this$0.findViewById(R.id.fjw)).inflate();
            if (inflate != null) {
                ViewGroup viewGroup = (ViewGroup) inflate;
                viewGroup.setVisibility(0);
                MethodCollector.o(4977);
                return viewGroup;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(4977);
            throw nullPointerException;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ShoutoutsProductReviewError> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutoutsProductReviewError invoke() {
            MethodCollector.i(1788);
            View findViewById = this.this$0.findViewById(R.id.fjp);
            h.f.b.l.b(findViewById, "");
            View inflate = ((ViewStub) findViewById).inflate();
            if (inflate != null) {
                final ShoutoutsProductReviewError shoutoutsProductReviewError = (ShoutoutsProductReviewError) inflate;
                shoutoutsProductReviewError.setRetryListener(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.e.AnonymousClass1 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(87184);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        shoutoutsProductReviewError.setVisibility(8);
                        this.this$0.this$0.f();
                        return z.f158842a;
                    }
                });
                MethodCollector.o(1788);
                return shoutoutsProductReviewError;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError");
            MethodCollector.o(1788);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ShoutoutsProductPreviewActivity this$0;

        static {
            Covode.recordClassIndex(87190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.this$0 = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            View view = this.this$0.e().getPopupView().f133425b;
            if (view == null) {
                h.f.b.l.a("clNewRequestView");
            }
            view.setVisibility(8);
            com.ss.android.ugc.aweme.shoutouts.b.a.a((Context) this.this$0, (Integer) 2, "shoutouts_detail_page");
            return z.f158842a;
        }
    }

    public static final class s implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextureView f133321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Video f133322c;

        static {
            Covode.recordClassIndex(87204);
        }

        public final void onGlobalLayout() {
            if (this.f133321b.getWidth() > 0 && this.f133321b.getHeight() > 0) {
                this.f133321b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                new com.ss.android.ugc.aweme.feed.helper.c().a(this.f133320a, this.f133321b, this.f133322c.getWidth(), this.f133322c.getHeight());
            }
        }

        s(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity, TextureView textureView, Video video) {
            this.f133320a = shoutoutsProductPreviewActivity;
            this.f133321b = textureView;
            this.f133322c = video;
        }
    }

    private final boolean n() {
        String str = this.f133301l;
        if (str != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            return h.f.b.l.a((Object) str, (Object) g2.getCurUserId());
        }
        ShoutoutsProduct shoutoutsProduct = this.f133293c;
        if (shoutoutsProduct == null) {
            return false;
        }
        String creatorUid = shoutoutsProduct.getCreatorUid();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        return h.f.b.l.a((Object) creatorUid, (Object) g3.getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.a.a.AbstractC3448a
    public final void b() {
        int i2;
        this.p = true;
        if (this.o) {
            if (e().getCurrentStyle() == com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_AGE_LESS_THAN_18) {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                i2 = h.g.a.a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()));
            } else {
                i2 = 0;
            }
            e().a(i2);
            e().setGotoSeeNewRequestListener(new j(this));
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        if (k().getVisibility() == 8 && this.f133292b != null && c().g()) {
            a(false);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onResume", true);
        super.onResume();
        if (k().getVisibility() == 8 && this.f133292b != null && !c().g() && !this.f133300k && !this.f133298h) {
            a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    private final String p() {
        if (h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor") || h.f.b.l.a((Object) this.f133297g, (Object) "homepage_folow") || h.f.b.l.a((Object) this.f133297g, (Object) "homepage_hot") || h.f.b.l.a((Object) this.f133297g, (Object) "personal_homepage") || h.f.b.l.a((Object) this.f133297g, (Object) "others_homepage")) {
            return "anchor";
        }
        if (h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview")) {
            return "edit_page";
        }
        if (h.f.b.l.a((Object) this.f133297g, (Object) "notification_page")) {
            return "tiktok_message";
        }
        return "profile_link";
    }

    public final void f() {
        String g2;
        k().setVisibility(0);
        k().f();
        this.f133295e.a(this.f133301l, g());
        if (!this.p && n() && (!h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview")) && (!h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor")) && (g2 = g()) != null) {
            this.f133295e.a(g2);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        String str;
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "shoutouts_detail_page");
        if (n()) {
            str = "creator";
        } else {
            str = "consumer";
        }
        hashMap.put("user_type", str);
        hashMap.put("enter_method", p());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.u));
        com.ss.android.ugc.aweme.common.r.a("stay_time", hashMap);
    }

    public final void i() {
        String str;
        String str2;
        Float f2;
        String str3;
        ShoutoutsPrice price;
        StandardMoney creatorEarning;
        HashMap hashMap = new HashMap();
        if (h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview") || h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor")) {
            str = "video_post_page";
        } else if (h.f.b.l.a((Object) this.f133297g, (Object) "home_page") && n()) {
            str = "personal_homepage";
        } else if (!h.f.b.l.a((Object) this.f133297g, (Object) "home_page") || n()) {
            str = this.f133297g;
        } else {
            str = "others_homepage";
        }
        hashMap.put("enter_from", str);
        if (n()) {
            str2 = "creator";
        } else {
            str2 = "consumer";
        }
        hashMap.put("user_type", str2);
        hashMap.put("to_user_id", o());
        ShoutoutsProduct shoutoutsProduct = this.f133293c;
        Integer num = null;
        if (shoutoutsProduct != null) {
            f2 = Float.valueOf(shoutoutsProduct.getRatingAvg());
        } else {
            f2 = null;
        }
        hashMap.put("score", String.valueOf(f2));
        ShoutoutsProduct shoutoutsProduct2 = this.f133293c;
        if (!(shoutoutsProduct2 == null || (price = shoutoutsProduct2.getPrice()) == null || (creatorEarning = price.getCreatorEarning()) == null)) {
            num = Integer.valueOf(creatorEarning.getMoney());
        }
        hashMap.put("price", String.valueOf(num));
        hashMap.put("enter_method", p());
        if (this.f133298h) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put("is_unfold", str3);
        com.ss.android.ugc.aweme.common.r.a("show_shoutouts_detail_page", hashMap);
    }

    public static final class b implements com.ss.android.ugc.aweme.shoutouts.api.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f133303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133304b;

        static {
            Covode.recordClassIndex(87180);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133304b = shoutoutsProductPreviewActivity;
        }

        @Override // com.ss.android.ugc.aweme.shoutouts.api.a
        public final void a(boolean z) {
            this.f133304b.f133298h = z;
            if (z) {
                if (this.f133304b.c().g()) {
                    this.f133304b.a(false);
                    this.f133303a = true;
                }
            } else if (this.f133303a) {
                this.f133303a = false;
                this.f133304b.a(false);
            }
            this.f133304b.i();
        }
    }

    public static final class r implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133318a;

        static {
            Covode.recordClassIndex(87200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133318a = shoutoutsProductPreviewActivity;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
            final /* synthetic */ r this$0;

            static {
                Covode.recordClassIndex(87201);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.this$0 = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                bVar2.a(R.string.a9e, AnonymousClass1.f133319a);
                String string = this.this$0.f133318a.getResources().getString(R.string.asg);
                h.f.b.l.b(string, "");
                bVar2.b(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.r.a.AnonymousClass2 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(87203);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        h.f.b.l.d(aVar, "");
                        com.ss.android.ugc.aweme.shoutouts.b.a.a(this.this$0.this$0.f133318a, this.this$0.this$0.f133318a.g(), "shoutouts_detail_page");
                        return z.f158842a;
                    }
                });
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.shoutouts.review.view.b.a
        public final void a(com.ss.android.ugc.aweme.shoutouts.review.c.a aVar) {
            String str;
            Bundle a2;
            Bundle a3;
            Integer num;
            boolean z;
            String string;
            ShoutoutsOrderRestrict restrict;
            ShoutoutsOrderRestrict restrict2;
            ShoutoutsOrderRestrict restrict3;
            h.f.b.l.d(aVar, "");
            int i2 = d.f133416a[aVar.ordinal()];
            Integer num2 = null;
            r4 = null;
            String str2 = null;
            num2 = null;
            if (i2 != 1) {
                if (i2 == 2) {
                    Intent intent = this.f133318a.getIntent();
                    if (intent == null || (a3 = a(intent)) == null) {
                        str = null;
                    } else {
                        str = a3.getString("title");
                    }
                    Intent intent2 = this.f133318a.getIntent();
                    if (!(intent2 == null || (a2 = a(intent2)) == null)) {
                        num2 = Integer.valueOf(a2.getInt(StringSet.type));
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("third_id", this.f133318a.g());
                    if (str != null && num2 != null) {
                        int intValue = num2.intValue();
                        String jSONObject2 = jSONObject.toString();
                        h.f.b.l.b(jSONObject2, "");
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(intValue, jSONObject2, str, null, null, null, null, false, null, null, null, null, null, 8184, null)));
                        this.f133318a.finish();
                    }
                } else if (i2 == 5) {
                    ShoutoutsProduct shoutoutsProduct = this.f133318a.f133293c;
                    if (shoutoutsProduct == null || (restrict3 = shoutoutsProduct.getRestrict()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(restrict3.getRestrictType());
                    }
                    if (num != null && num.intValue() == 2) {
                        String string2 = this.f133318a.getResources().getString(R.string.h4e);
                        h.f.b.l.b(string2, "");
                        String a4 = com.a.a(string2, Arrays.copyOf(new Object[]{18}, 1));
                        h.f.b.l.b(a4, "");
                        String string3 = this.f133318a.getResources().getString(R.string.h4f);
                        h.f.b.l.b(string3, "");
                        String a5 = com.a.a(string3, Arrays.copyOf(new Object[]{18, 18}, 2));
                        h.f.b.l.b(a5, "");
                        com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(this.f133318a).b(a4).d(a5), new a(this)).a().b().show();
                        return;
                    }
                    ShoutoutsProduct shoutoutsProduct2 = this.f133318a.f133293c;
                    if (shoutoutsProduct2 == null || (restrict2 = shoutoutsProduct2.getRestrict()) == null) {
                        z = false;
                    } else {
                        z = restrict2.getOtherRestrict();
                    }
                    ShoutoutsProduct shoutoutsProduct3 = this.f133318a.f133293c;
                    if (!(shoutoutsProduct3 == null || (restrict = shoutoutsProduct3.getRestrict()) == null)) {
                        str2 = restrict.getReason();
                    }
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    if (com.ss.android.ugc.aweme.shoutouts.review.d.a.b(g2.getCurUserId())) {
                        Resources resources = this.f133318a.getResources();
                        if (resources != null && (string = resources.getString(R.string.fze)) != null) {
                            h.f.b.l.b(string, "");
                            String a6 = com.a.a(string, Arrays.copyOf(new Object[]{"10"}, 1));
                            h.f.b.l.b(a6, "");
                            new com.bytedance.tux.g.b(this.f133318a).a(a6).b();
                        }
                    } else if (!z) {
                        ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.f133318a;
                        com.ss.android.ugc.aweme.shoutouts.b.a.a(shoutoutsProductPreviewActivity, shoutoutsProductPreviewActivity.g(), "shoutouts_detail_page");
                    } else if (str2 != null) {
                        new com.bytedance.tux.g.b(this.f133318a).a(str2).b();
                    }
                }
            } else if (h.f.b.l.a((Object) this.f133318a.f133297g, (Object) "tools_preview")) {
                new com.bytedance.tux.g.b(this.f133318a).a(this.f133318a.getResources().getString(R.string.g0_)).b();
            } else {
                com.ss.android.ugc.aweme.shoutouts.b.a.a(this.f133318a, (Integer) null, "shoutouts_detail_page");
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f133306a = new g();

        static {
            Covode.recordClassIndex(87186);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f133307a);
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133308a;

        static {
            Covode.recordClassIndex(87188);
        }

        h(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133308a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133308a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133310a;

        static {
            Covode.recordClassIndex(87192);
        }

        l(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133310a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133310a.a(true);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onRestoreInstanceState(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        bundle.putString("creator_id", this.f133301l);
        bundle.putString("product_id", g());
        bundle.putInt("is_anchor_add", this.n);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onShoutoutProductStatusChanged(com.ss.android.ugc.aweme.fe.method.j jVar) {
        h.f.b.l.d(jVar, "");
        if (jVar.f91311b != null && !(!h.f.b.l.a((Object) jVar.f91311b.optString("eventName"), (Object) "shoutouts_abnormal_close")) && h.f.b.l.a((Object) jVar.f91311b.optString("product_id"), (Object) g())) {
            finish();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsProductPreviewActivity f133309a;

        static {
            Covode.recordClassIndex(87189);
        }

        i(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f133309a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            e.b a2 = new e.b().a(new SharePackage.a().a("").a());
            a2.t = true;
            Aweme aweme = this.f133309a.f133291a;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f133309a.f133291a;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            e.b a3 = a2.a(new com.ss.android.ugc.aweme.shoutouts.player.f(str, str2));
            a3.o = false;
            new com.ss.android.ugc.aweme.sharer.ui.i(this.f133309a, R.style.a1d, a3.a()).show();
        }
    }

    public final void a(boolean z2) {
        if (this.f133299j) {
            if (!c().g() && this.f133292b != null) {
                c().a(this.f133292b);
                this.f133299j = false;
                this.f133300k = false;
                l().setVisibility(8);
            }
        } else if (c().g()) {
            c().b();
            this.f133299j = true;
            if (z2) {
                this.f133300k = true;
                l().setVisibility(0);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String a2;
        Integer num;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onCreate", true);
        activityConfiguration(g.f133306a);
        super.onCreate(bundle);
        setContentView(R.layout.b0d);
        if (bundle != null) {
            this.f133301l = bundle.getString("creator_id");
            this.f133302m = bundle.getString("product_id");
            this.n = bundle.getInt("is_anchor_add");
            this.f133297g = bundle.getString("enter_from");
        } else {
            try {
                this.f133301l = a(getIntent(), "creator_id");
                this.f133302m = a(getIntent(), "product_id");
                try {
                    this.n = getIntent().getIntExtra("is_anchor_add", 0);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.n == 1) {
                    a2 = "add_anchor";
                } else {
                    a2 = a(getIntent(), "enter_from");
                }
                this.f133297g = a2;
                if (h.f.b.l.a((Object) a2, (Object) "anchor_detail")) {
                    this.f133297g = a(getIntent(), "enter_from_detail");
                }
                this.s = a(getIntent(), "currencyCharacter");
                this.t = a(getIntent(), "description");
                String a3 = a(getIntent(), "coin");
                if (a3 != null) {
                    h.f.b.l.b(a3, "");
                    this.q = h.m.p.e(a3);
                }
                String a4 = a(getIntent(), "standardMoney");
                if (a4 != null) {
                    h.f.b.l.b(a4, "");
                    Float c2 = h.m.p.c(a4);
                    if (c2 != null) {
                        num = Integer.valueOf((int) c2.floatValue());
                    } else {
                        num = null;
                    }
                    this.r = num;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        k().setBuilder(DmtStatusView.a.a(this));
        ((AutoRTLImageView) this.y.getValue()).setOnClickListener(new h(this));
        m().setOnClickListener(new i(this));
        f();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.a.a.AbstractC3448a
    public final void a(ShoutoutsProduct shoutoutsProduct) {
        Video video;
        Boolean bool;
        Integer num;
        ShoutoutsOrderRestrict restrict;
        ShoutoutsOrderRestrict restrict2;
        String g2;
        ShoutoutsProduct shoutoutsProduct2;
        int i2;
        int coin;
        int i3;
        MethodCollector.i(4724);
        h.f.b.l.d(shoutoutsProduct, "");
        this.f133293c = shoutoutsProduct;
        Aweme videoInfo = shoutoutsProduct.getVideoInfo();
        this.f133291a = videoInfo;
        if (videoInfo != null) {
            video = videoInfo.getVideo();
        } else {
            video = null;
        }
        this.f133292b = video;
        if (video != null) {
            KeepSurfaceTextureView j2 = j();
            if (j2.getWidth() == 0 || j2.getHeight() == 0) {
                j2.getViewTreeObserver().addOnGlobalLayoutListener(new s(this, j2, video));
            } else {
                new com.ss.android.ugc.aweme.feed.helper.c().a(this, j2, video.getWidth(), video.getHeight());
            }
            c().a(j());
            c().b(this);
            com.ss.android.ugc.playerkit.videoview.j.a(j()).a(new f(this));
        }
        h();
        k().d();
        k().setVisibility(8);
        this.o = true;
        d().addView(e());
        String str = this.t;
        if (str != null) {
            e().setDescription(str);
        } else {
            String description = shoutoutsProduct.getDescription();
            if (description != null) {
                e().setDescription(description);
            }
        }
        ShoutoutsPrice price = shoutoutsProduct.getPrice();
        if (price != null) {
            Integer num2 = this.q;
            if (num2 != null) {
                coin = num2.intValue();
            } else {
                coin = price.getCoin();
            }
            Integer num3 = this.r;
            if (num3 == null) {
                StandardMoney buyerPayment = price.getBuyerPayment();
                if (buyerPayment != null) {
                    num3 = Integer.valueOf(buyerPayment.getMoney());
                } else {
                    num3 = null;
                }
            }
            String str2 = this.s;
            if (str2 == null) {
                StandardMoney buyerPayment2 = price.getBuyerPayment();
                if (buyerPayment2 != null) {
                    str2 = buyerPayment2.getCurrencyCharacter();
                } else {
                    str2 = null;
                }
            }
            c e2 = e();
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            e2.a(coin, i3, str2, shoutoutsProduct.getRatingAvg(), (long) shoutoutsProduct.getRatingCnt(), n(), shoutoutsProduct.getShowRating());
        }
        if (shoutoutsProduct.getShowRating()) {
            c e3 = e();
            String o2 = o();
            String g3 = g();
            PowerList powerList = e3.f133384a;
            if (powerList != null) {
                powerList.a(1, com.a.a(LayoutInflater.from(powerList.getContext()), R.layout.b0r, powerList, false));
                powerList.a(e3.getViewModel().a());
            }
            e3.getViewModel().f133336a = o2;
            e3.getViewModel().f133337b = g3;
            e3.getViewModel().f133338c = e3.getResources().getString(R.string.de5);
            e3.getViewModel().a().f34367c.e();
        }
        e().setBottomSheetCallback(new b(this));
        if (h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview") || h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor")) {
            e().a();
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) c.f133382d, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(500);
        e().setAnimation(animationSet);
        animationSet.start();
        if (!n()) {
            ShoutoutsProduct shoutoutsProduct3 = this.f133293c;
            if (shoutoutsProduct3 == null || (restrict2 = shoutoutsProduct3.getRestrict()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(restrict2.getOpening());
            }
            ShoutoutsProduct shoutoutsProduct4 = this.f133293c;
            if (shoutoutsProduct4 == null || (restrict = shoutoutsProduct4.getRestrict()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(restrict.getRestrictType());
            }
            if (h.f.b.l.a((Object) bool, (Object) false)) {
                e().a(com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_OUT_OF_SERVICE);
            } else if (num != null && num.intValue() == 1) {
                e().a(com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_AGE_LESS_THAN_18);
            } else {
                e().a(com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_FILL_ORDER);
            }
        } else if (this.n == 1) {
            e().a(com.ss.android.ugc.aweme.shoutouts.review.c.a.CREATOR_ADD_TO_VIDEO);
        } else {
            e().a(com.ss.android.ugc.aweme.shoutouts.review.c.a.CREATOR_MANAGE);
        }
        e().setReviewBottomBtnClickListener(new r(this));
        if (n() && (shoutoutsProduct2 = this.f133293c) != null && !shoutoutsProduct2.getPosted() && (!h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview")) && (!h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor"))) {
            if (e().getCurrentStyle() == com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_AGE_LESS_THAN_18) {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                i2 = h.g.a.a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()));
            } else {
                i2 = 0;
            }
            ShoutOutPopupView popupView = e().getPopupView();
            ViewGroup.LayoutParams layoutParams = popupView.getLayoutParams();
            if (layoutParams != null) {
                int i4 = c.f133382d;
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4 + h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())) + i2;
                View view = popupView.f133424a;
                if (view == null) {
                    h.f.b.l.a("clPostIntroView");
                }
                view.setVisibility(0);
                View view2 = popupView.f133424a;
                if (view2 == null) {
                    h.f.b.l.a("clPostIntroView");
                }
                view2.findViewById(R.id.bve).setOnClickListener(new ShoutOutPopupView.b(popupView));
                TuxButton tuxButton = popupView.f133426c;
                if (tuxButton == null) {
                    h.f.b.l.a("clPostView");
                }
                tuxButton.setOnClickListener(new ShoutOutPopupView.c(popupView));
                popupView.requestLayout();
                e().setPostIntroVideoListener(new o(this));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.o(4724);
                throw nullPointerException;
            }
        }
        if (this.p) {
            b();
        }
        if (!n()) {
            m().setVisibility(0);
        }
        if (!this.p && n() && this.f133302m == null && (!h.f.b.l.a((Object) this.f133297g, (Object) "tools_preview")) && (!h.f.b.l.a((Object) this.f133297g, (Object) "add_anchor")) && (g2 = g()) != null) {
            this.f133295e.a(g2);
        }
        if (this.f133292b == null) {
            j().setVisibility(8);
            ((ImageView) this.D.getValue()).setVisibility(0);
        }
        i();
        MethodCollector.o(4724);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

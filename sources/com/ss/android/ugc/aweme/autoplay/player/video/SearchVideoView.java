package com.ss.android.ugc.aweme.autoplay.player.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.cf;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.k;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class SearchVideoView extends FrameLayout implements WeakHandler.IHandler, b.d, f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b, eg {

    /* renamed from: d  reason: collision with root package name */
    public static final a f67557d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f67558a;

    /* renamed from: b  reason: collision with root package name */
    public MotionEvent f67559b;

    /* renamed from: c  reason: collision with root package name */
    public MotionEvent f67560c;

    /* renamed from: e  reason: collision with root package name */
    private b f67561e;

    /* renamed from: f  reason: collision with root package name */
    private c f67562f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f67563g;

    /* renamed from: h  reason: collision with root package name */
    private SearchPlayerCore f67564h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f67565i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f67566j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f67567k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f67568l;

    /* renamed from: m  reason: collision with root package name */
    private LongPressLayout f67569m;
    private boolean n;
    private final h.h o;
    private final h.h p;
    private View.OnTouchListener q;
    private long r;

    public interface b {
        static {
            Covode.recordClassIndex(41594);
        }

        void a(j jVar);
    }

    static {
        Covode.recordClassIndex(41592);
    }

    public SearchVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final RotateAnimation getMRotateAnimation() {
        return (RotateAnimation) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public final WeakHandler getMHandler() {
        return (WeakHandler) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return false;
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

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onPause() {
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

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41593);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void A() {
        b();
    }

    public final SearchPlayerCore getCore() {
        return this.f67564h;
    }

    public final c getDataProvider() {
        return this.f67562f;
    }

    public final boolean getEnableHideCoverAnim() {
        return this.f67565i;
    }

    public final boolean getEnableLifecycleObserver() {
        return this.f67566j;
    }

    public final ImageView getMCoverView() {
        return this.f67563g;
    }

    public final b getVideoPlayerStatusListener() {
        return this.f67561e;
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        eg.a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        eg.a.onDestroy(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onResume() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_START)
    public final void onStart() {
        eg.a.onStart(this);
    }

    public static final class d implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchVideoView f67571a;

        static {
            Covode.recordClassIndex(41596);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            this.f67571a.b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SearchVideoView searchVideoView) {
            this.f67571a = searchVideoView;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            c dataProvider = this.f67571a.getDataProvider();
            if (dataProvider != null && dataProvider.c()) {
                this.f67571a.hashCode();
                this.f67571a.hashCode();
                com.ss.android.ugc.aweme.flowfeed.utils.g mScrollStateManager = this.f67571a.getMScrollStateManager();
                if (mScrollStateManager != null) {
                    mScrollStateManager.a(this.f67571a.getMScrollStateObserver());
                }
                com.ss.android.ugc.aweme.flowfeed.utils.g mScrollStateManager2 = this.f67571a.getMScrollStateManager();
                if (mScrollStateManager2 != null) {
                    mScrollStateManager2.e();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return getItemView();
    }

    static final class e extends m implements h.f.a.a<WeakHandler> {
        final /* synthetic */ SearchVideoView this$0;

        static {
            Covode.recordClassIndex(41597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchVideoView searchVideoView) {
            super(0);
            this.this$0 = searchVideoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.this$0);
        }
    }

    private final View getItemView() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.f67575a;
        }
        return null;
    }

    private final com.ss.android.ugc.aweme.newfollow.c.c getMPlayVideoHelper() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.f67580f;
        }
        return null;
    }

    public final void b() {
        ImageView imageView = this.f67563g;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
        }
    }

    public final Aweme getMAweme() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.f67578d;
        }
        return null;
    }

    public final String getMEventType() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.r;
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.flowfeed.utils.g getMScrollStateManager() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.f67584j;
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.flowfeed.utils.i getMScrollStateObserver() {
        c cVar = this.f67562f;
        if (cVar != null) {
            return cVar.f67585k;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void y() {
        f fVar;
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void z() {
        f fVar;
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.z();
        }
    }

    public final long getCurrentPosition() {
        long j2 = this.r;
        if (j2 > 0) {
            return j2;
        }
        SearchPlayerCore searchPlayerCore = this.f67564h;
        if (searchPlayerCore != null) {
            return searchPlayerCore.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void x() {
        f fVar;
        if (com.ss.android.ugc.aweme.discover.b.j.d()) {
            b();
        }
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.x();
        }
    }

    static final class f extends m implements h.f.a.a<RotateAnimation> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f67572a = new f();

        static {
            Covode.recordClassIndex(41598);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RotateAnimation invoke() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    private final void d() {
        if (this.f67565i) {
            ImageView imageView = this.f67563g;
            if (imageView == null || imageView.getVisibility() != 8) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f67563g, View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new c(this));
                ofFloat.start();
                return;
            }
            return;
        }
        ImageView imageView2 = this.f67563g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b
    public final AbsInteractStickerWidget aA_() {
        Context context;
        AbsInteractStickerWidget a2 = com.ss.android.ugc.aweme.flowfeed.b.a.a().a();
        c cVar = this.f67562f;
        if (cVar != null) {
            context = cVar.f();
        } else {
            context = null;
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        com.ss.android.ugc.aweme.arch.widgets.base.e.a(eVar, null, getItemView(), eVar).a(R.id.bqg, a2);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void c() {
        f fVar;
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        SearchPlayerCore searchPlayerCore = this.f67564h;
        if (searchPlayerCore != null) {
            searchPlayerCore.setVisibility(8);
        }
        SearchPlayerCore searchPlayerCore2 = this.f67564h;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setVisibility(0);
        }
        c cVar = this.f67562f;
        if (cVar == null || (a2 = cVar.a()) == null || a2.f96176f == null) {
            b();
        }
        c cVar2 = this.f67562f;
        if (cVar2 != null && (fVar = cVar2.q) != null) {
            fVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f67566j) {
            Context context = getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                ef.b(eVar, this);
            }
        }
        hashCode();
        com.ss.android.ugc.aweme.flowfeed.utils.i mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            mScrollStateObserver.hashCode();
        }
        com.ss.android.ugc.aweme.flowfeed.utils.g mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.b(getMScrollStateObserver());
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        r rVar = null;
        if (this.f67566j) {
            Context context = getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                ef.a(eVar, this);
            }
        }
        hashCode();
        com.ss.android.ugc.aweme.flowfeed.utils.i mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            mScrollStateObserver.hashCode();
        }
        com.ss.android.ugc.aweme.flowfeed.utils.g mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.a(getMScrollStateObserver());
        }
        ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        c cVar = this.f67562f;
        if (cVar != null) {
            rVar = cVar.x;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
    }

    public final void setCore(SearchPlayerCore searchPlayerCore) {
        this.f67564h = searchPlayerCore;
    }

    public final void setCurrentPosition(long j2) {
        this.r = j2;
    }

    public final void setDataProvider(c cVar) {
        this.f67562f = cVar;
    }

    public final void setEnableHideCoverAnim(boolean z) {
        this.f67565i = z;
    }

    public final void setEnableLifecycleObserver(boolean z) {
        this.f67566j = z;
    }

    public final void setMCoverView(ImageView imageView) {
        this.f67563g = imageView;
    }

    public final void setVideoPlayerStatusListener(b bVar) {
        this.f67561e = bVar;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchVideoView f67570a;

        static {
            Covode.recordClassIndex(41595);
        }

        c(SearchVideoView searchVideoView) {
            this.f67570a = searchVideoView;
        }

        public final void onAnimationEnd(Animator animator) {
            ImageView mCoverView = this.f67570a.getMCoverView();
            if (mCoverView != null) {
                mCoverView.setVisibility(8);
            }
        }
    }

    private final void a(j jVar) {
        b bVar = this.f67561e;
        if (bVar != null) {
            bVar.a(jVar);
        }
    }

    public final void setMAweme(Aweme aweme) {
        c cVar = this.f67562f;
        if (cVar != null) {
            cVar.f67578d = aweme;
        }
    }

    public final void setMScrollStateManager(com.ss.android.ugc.aweme.flowfeed.utils.g gVar) {
        c cVar = this.f67562f;
        if (cVar != null) {
            cVar.f67584j = gVar;
        }
    }

    public final void setMScrollStateObserver(com.ss.android.ugc.aweme.flowfeed.utils.i iVar) {
        c cVar = this.f67562f;
        if (cVar != null) {
            cVar.f67585k = iVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onDecoderBuffering(boolean z) {
        f fVar;
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayProgressChange(float f2) {
        f fVar;
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onPlayProgressChange(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onRetryOnError(l lVar) {
        f fVar;
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onRetryOnError(lVar);
        }
    }

    public final void setMEventType(String str) {
        c cVar = this.f67562f;
        if (cVar != null) {
            if (str == null) {
                str = "";
            }
            cVar.a(str);
        }
    }

    public final void a(int i2) {
        if (i2 == 0) {
            a(false);
        } else if (i2 == 1) {
            a(false);
        } else if (i2 == 2) {
            a(true);
        } else if (i2 == 3) {
            a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompleted(String str) {
        h.f.b.l.b(com.a.a("onPlayCompleted: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        a(new j(7));
    }

    public final void setTapContainer(LongPressLayout longPressLayout) {
        h.f.b.l.d(longPressLayout, "");
        longPressLayout.setTapListener(this.q);
        LongPressLayout longPressLayout2 = this.f67569m;
        if (longPressLayout2 != null) {
            longPressLayout2.setTapListener(null);
        }
    }

    private final void a(boolean z) {
        if (this.n) {
            if (z) {
                ImageView imageView = this.f67568l;
                if (imageView == null || imageView.getVisibility() != 0) {
                    ImageView imageView2 = this.f67568l;
                    if (imageView2 != null) {
                        imageView2.startAnimation(getMRotateAnimation());
                    }
                    ImageView imageView3 = this.f67568l;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            ImageView imageView4 = this.f67568l;
            if (imageView4 == null || imageView4.getVisibility() != 8) {
                ImageView imageView5 = this.f67568l;
                if (imageView5 != null) {
                    imageView5.clearAnimation();
                }
                ImageView imageView6 = this.f67568l;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        b.a aVar;
        if (message != null && message.what == 0 && !com.ss.android.ugc.aweme.l.a.a.a(this.f67567k, 1200) && SystemClock.elapsedRealtime() - cf.f142771a >= 1000) {
            cf.f142771a = SystemClock.elapsedRealtime();
            c cVar = this.f67562f;
            if (cVar != null && (aVar = cVar.f67587m) != null) {
                aVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPausePlay(String str) {
        f fVar;
        if (com.ss.android.ugc.aweme.discover.b.j.d()) {
            b();
        }
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            this.r = mPlayVideoHelper.c();
        }
        a(1);
        a(new j(4));
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompletedFirstTime(String str) {
        f fVar;
        h.f.b.l.b(com.a.a("onPlayCompletedFirstTime: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        a(new j(6));
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayFailed(l lVar) {
        f fVar;
        h.f.b.l.b(com.a.a("onPlayFailed: error=%s", Arrays.copyOf(new Object[]{lVar}, 1)), "");
        a(new j(1));
        a(1);
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onPlayFailed(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        com.ss.android.ugc.aweme.flowfeed.utils.b a3;
        com.ss.android.ugc.aweme.video.i iVar;
        c cVar = this.f67562f;
        if (!(cVar == null || (a3 = cVar.a()) == null || (iVar = a3.f96176f) == null)) {
            Boolean.valueOf(iVar.o());
        }
        a(new j(12));
        c cVar2 = this.f67562f;
        if (cVar2 == null || (a2 = cVar2.a()) == null || a2.f96176f == null) {
            b();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPreparePlay(String str) {
        f fVar;
        h.f.b.l.b(com.a.a("onPreparePlay: sourceId=%s, visibility: " + getVisibility(), Arrays.copyOf(new Object[]{str}, 1)), "");
        a(2);
        a(new j(2));
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onResumePlay(String str) {
        long j2;
        f fVar;
        getVisibility();
        d();
        a(0);
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper = getMPlayVideoHelper();
        long j3 = 0;
        if (mPlayVideoHelper != null) {
            j2 = mPlayVideoHelper.b();
        } else {
            j2 = 0;
        }
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            j3 = mPlayVideoHelper2.c();
        }
        a(new j(j2, j3));
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onResumePlay(str);
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchVideoView f67574a;

        static {
            Covode.recordClassIndex(41600);
        }

        h(SearchVideoView searchVideoView) {
            this.f67574a = searchVideoView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.video.i iVar;
            h.f.b.l.d(obj, "");
            if (h.f.b.l.a((Object) "on_ear_phone_unplug", obj)) {
                c dataProvider = this.f67574a.getDataProvider();
                if (dataProvider == null || (iVar = dataProvider.o) == null || !iVar.o()) {
                    com.ss.android.ugc.aweme.main.g.a("pause", this.f67574a.getMEventType(), this.f67574a.getMAweme());
                    return;
                }
                SearchPlayerCore core = this.f67574a.getCore();
                if (core != null) {
                    core.y();
                }
                this.f67574a.a(1);
                com.ss.android.ugc.aweme.main.g.a("play", this.f67574a.getMEventType(), this.f67574a.getMAweme());
            }
        }
    }

    public final void a(Aweme aweme) {
        r rVar;
        String str = "";
        h.f.b.l.d(aweme, str);
        ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        c cVar = this.f67562f;
        if (cVar != null) {
            rVar = cVar.x;
        } else {
            rVar = null;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        setMAweme(aweme);
        SearchPlayerCore searchPlayerCore = this.f67564h;
        if (searchPlayerCore != null) {
            searchPlayerCore.a(aweme);
        }
        if (!(getMAweme() == null || getMAweme() == null)) {
            b();
        }
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onBuffering(boolean z) {
        int i2;
        f fVar;
        String str;
        a(new j(z));
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        a(i2);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(z);
            h.f.b.l.b(com.a.a("onBuffering: sourceId=%s, start=%s", Arrays.copyOf(objArr, 2)), "");
        }
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onRenderFirstFrame(o oVar) {
        String str;
        f fVar;
        if (oVar != null) {
            str = oVar.getId();
        } else {
            str = null;
        }
        h.f.b.l.b(com.a.a("onRenderFirstFrame: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        d();
        a(new j(5));
        if (TextUtils.equals(getMEventType(), "homepage_follow") && (getContext() instanceof androidx.fragment.app.e)) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FollowPageFirstFrameViewModel.a((androidx.fragment.app.e) context);
        }
        com.ss.android.ugc.aweme.main.g.a("video_play");
        c cVar = this.f67562f;
        if (cVar != null && (fVar = cVar.q) != null) {
            fVar.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        String str;
        h.f.b.l.d(nVar, "");
        a(0);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Long.valueOf(nVar.f148791c);
            h.f.b.l.b(com.a.a("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2)), "");
        }
        a(new j(0, nVar.f148791c));
    }

    static final class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchVideoView f67573a;

        static {
            Covode.recordClassIndex(41599);
        }

        g(SearchVideoView searchVideoView) {
            this.f67573a = searchVideoView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            MotionEvent motionEvent3;
            long j2;
            h.f.b.l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.f67573a.getMHandler().hasMessages(0)) {
                    this.f67573a.getMHandler().removeMessages(0);
                }
                MotionEvent motionEvent4 = this.f67573a.f67559b;
                MotionEvent motionEvent5 = this.f67573a.f67560c;
                int scaledDoubleTapSlop = ViewConfiguration.get(this.f67573a.getContext()).getScaledDoubleTapSlop();
                int i2 = scaledDoubleTapSlop * scaledDoubleTapSlop;
                if (!(motionEvent4 == null || motionEvent5 == null)) {
                    long eventTime = motionEvent.getEventTime() - motionEvent5.getEventTime();
                    if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                        int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                        int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                        if ((x * x) + (y * y) < i2) {
                            this.f67573a.f67558a = true;
                            if (!(this.f67573a.f67559b == null || (motionEvent2 = this.f67573a.f67559b) == null)) {
                                motionEvent2.recycle();
                            }
                            this.f67573a.f67559b = MotionEvent.obtain(motionEvent);
                        }
                    }
                }
                this.f67573a.f67558a = false;
                motionEvent2.recycle();
                this.f67573a.f67559b = MotionEvent.obtain(motionEvent);
            } else if (action == 1) {
                if (!this.f67573a.f67558a && this.f67573a.f67559b != null && !com.ss.android.ugc.aweme.flowfeed.utils.d.a(this.f67573a.f67559b, motionEvent, this.f67573a.getContext())) {
                    WeakHandler mHandler = this.f67573a.getMHandler();
                    Message obtainMessage = this.f67573a.getMHandler().obtainMessage(0);
                    long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                    MotionEvent motionEvent6 = this.f67573a.f67559b;
                    if (motionEvent6 != null) {
                        j2 = motionEvent6.getEventTime();
                    } else {
                        j2 = 0;
                    }
                    mHandler.sendMessageDelayed(obtainMessage, doubleTapTimeout + j2);
                }
                if (!(this.f67573a.f67560c == null || (motionEvent3 = this.f67573a.f67560c) == null)) {
                    motionEvent3.recycle();
                }
                this.f67573a.f67560c = MotionEvent.obtain(motionEvent);
            } else if (action == 2 && com.ss.android.ugc.aweme.flowfeed.utils.d.a(this.f67573a.f67559b, motionEvent, this.f67573a.getContext())) {
                this.f67573a.getMHandler().removeMessages(0);
            }
            return false;
        }
    }

    private /* synthetic */ SearchVideoView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchVideoView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        c cVar;
        com.ss.android.ugc.playerkit.videoview.i surfaceHolder;
        h.f.b.l.d(context, "");
        MethodCollector.i(2088);
        this.n = true;
        this.o = h.i.a((h.f.a.a) new e(this));
        this.p = h.i.a((h.f.a.a) f.f67572a);
        this.q = new g(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ach});
        h.f.b.l.b(obtainStyledAttributes, "");
        this.n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        com.a.a(LayoutInflater.from(getContext()), R.layout.awk, this, true);
        this.f67567k = (ViewGroup) findViewById(R.id.c99);
        this.f67564h = (SearchPlayerCore) findViewById(R.id.ekb);
        ImageView imageView = (ImageView) findViewById(R.id.byw);
        this.f67568l = imageView;
        if (!this.n && imageView != null) {
            imageView.setVisibility(8);
        }
        this.f67569m = (LongPressLayout) findViewById(R.id.cja);
        SearchPlayerCore searchPlayerCore = this.f67564h;
        if (searchPlayerCore != null) {
            cVar = searchPlayerCore.getDataProvider();
        } else {
            cVar = null;
        }
        this.f67562f = cVar;
        SearchPlayerCore searchPlayerCore2 = this.f67564h;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setMVideoViewListener(this);
        }
        SearchPlayerCore searchPlayerCore3 = this.f67564h;
        if (searchPlayerCore3 != null) {
            searchPlayerCore3.setMPlayerViewListener(this);
        }
        SearchPlayerCore searchPlayerCore4 = this.f67564h;
        if (searchPlayerCore4 != null) {
            searchPlayerCore4.setMVideoMobListener(new d(this.f67562f));
        }
        LongPressLayout longPressLayout = this.f67569m;
        if (longPressLayout != null) {
            longPressLayout.setTapListener(this.q);
        }
        SearchPlayerCore searchPlayerCore5 = this.f67564h;
        if (!(searchPlayerCore5 == null || (surfaceHolder = searchPlayerCore5.getSurfaceHolder()) == null)) {
            surfaceHolder.a(new d(this));
        }
        getMPlayVideoHelper();
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) j2;
            HomePageDataViewModel.a.a(eVar).f99126i.observe(eVar, new h(this));
        }
        MethodCollector.o(2088);
    }
}

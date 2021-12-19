package com.ss.android.ugc.aweme.xsearch.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.v;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.gp;
import com.ss.android.ugc.aweme.xsearch.video.d;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.a.m;
import h.p;
import h.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b extends FrameLayout implements com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f145256c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f145257a;

    /* renamed from: b  reason: collision with root package name */
    boolean f145258b;

    /* renamed from: d  reason: collision with root package name */
    private AbstractC3861b f145259d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.autoplay.player.video.c f145260e;

    /* renamed from: f  reason: collision with root package name */
    private LinearGradientDraweeView f145261f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f145262g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f145263h;

    /* renamed from: i  reason: collision with root package name */
    private SearchPlayerCore f145264i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f145265j;

    /* renamed from: k  reason: collision with root package name */
    private int f145266k;

    /* renamed from: l  reason: collision with root package name */
    private View f145267l;

    /* renamed from: m  reason: collision with root package name */
    private m<? super String, ? super Map<String, ? extends Object>, z> f145268m;
    private String n;
    private final h.h o;
    private final h.h p;

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$b  reason: collision with other inner class name */
    public interface AbstractC3861b {
        static {
            Covode.recordClassIndex(94985);
        }
    }

    static {
        Covode.recordClassIndex(94983);
    }

    private final c.AnonymousClass1 getContainerStatusProvider() {
        return (c.AnonymousClass1) this.o.getValue();
    }

    private final f.AnonymousClass1 getMImageDisplayLighten() {
        return (f.AnonymousClass1) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onDecoderBuffering(boolean z) {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94984);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class h extends com.google.gson.b.a<Aweme> {
        static {
            Covode.recordClassIndex(94997);
        }

        h() {
        }
    }

    public final SearchPlayerCore getCore() {
        return this.f145264i;
    }

    public final com.ss.android.ugc.aweme.autoplay.player.video.c getDataProvider() {
        return this.f145260e;
    }

    public final ImageView getMCoverBackground() {
        return this.f145263h;
    }

    public final ImageView getMCoverMask() {
        return this.f145262g;
    }

    public final LinearGradientDraweeView getMCoverView() {
        return this.f145261f;
    }

    public final AbstractC3861b getVideoPlayerStatusListener() {
        return this.f145259d;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this.f145264i;
    }

    static final class c extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ Context $context;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Context context) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.aweme.flowfeed.a.a(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f145269a;

                static {
                    Covode.recordClassIndex(94987);
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Fragment g() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final com.ss.android.ugc.playerkit.videoview.k h() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Context f() {
                    return this.f145269a.$context;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean c() {
                    return this.f145269a.this$0.isAttachedToWindow();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean e() {
                    return this.f145269a.this$0.isAttachedToWindow();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final String d() {
                    return "SearchVideoForLynx_" + this.f145269a.$context.hashCode();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145269a = r1;
                }
            };
        }
    }

    public static final class e implements com.ss.android.ugc.playerkit.videoview.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f145270a;

        static {
            Covode.recordClassIndex(94993);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            this.f145270a.d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f145270a = bVar;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.bytedance.lighten.a.c.d(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f145271a;

                static {
                    Covode.recordClassIndex(94995);
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, Throwable th) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145271a = r1;
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
                    h.f.b.l.d(uri, "");
                    ImageView mCoverMask = this.f145271a.this$0.getMCoverMask();
                    if (mCoverMask != null) {
                        mCoverMask.setVisibility(0);
                    }
                }
            };
        }
    }

    private final View getItemView() {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            return cVar.f67575a;
        }
        return null;
    }

    private final com.ss.android.ugc.aweme.newfollow.c.c getMPlayVideoHelper() {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            return cVar.f67580f;
        }
        return null;
    }

    public final void d() {
        ImageView imageView = this.f145263h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearGradientDraweeView linearGradientDraweeView = this.f145261f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setVisibility(0);
        }
    }

    public final Aweme getMAweme() {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            return cVar.f67578d;
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.flowfeed.utils.g getMScrollStateManager() {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            return cVar.f67584j;
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.flowfeed.utils.i getMScrollStateObserver() {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            return cVar.f67585k;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            return searchPlayerCore.m();
        }
        return false;
    }

    public static final class k implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f145273a;

        static {
            Covode.recordClassIndex(95000);
        }

        public final boolean onPreDraw() {
            this.f145273a.b();
            this.f145273a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(b bVar) {
            this.f145273a = bVar;
        }
    }

    private final void g() {
        ImageView imageView = this.f145263h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearGradientDraweeView linearGradientDraweeView = this.f145261f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void c() {
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar == null || (a2 = cVar.a()) == null || a2.f96176f == null) {
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
            if (cVar2 == null || cVar2.o == null) {
                d();
            }
        }
    }

    public final void f() {
        com.ss.android.ugc.aweme.autoplay.player.video.e eVar;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null && (eVar = cVar.f67586l) != null) {
            eVar.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f145265j = false;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        i();
    }

    private final void i() {
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            com.ss.android.ugc.aweme.autoplay.e.a.b(searchPlayerCore);
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

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b
    public final AbsInteractStickerWidget aA_() {
        Context context;
        AbsInteractStickerWidget a2 = com.ss.android.ugc.aweme.flowfeed.b.a.a().a();
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
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

    private final void h() {
        com.ss.android.ugc.aweme.flowfeed.utils.g gVar;
        com.ss.android.ugc.aweme.flowfeed.a.b bVar;
        com.ss.android.ugc.aweme.flowfeed.a.b bVar2;
        com.ss.android.ugc.aweme.autoplay.player.video.e eVar;
        if (this.f145258b) {
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
            if (!(cVar == null || (eVar = cVar.f67586l) == null)) {
                eVar.g();
            }
            com.ss.android.ugc.aweme.xsearch.a a2 = com.ss.android.ugc.aweme.xsearch.f.a(this);
            com.ss.android.ugc.aweme.flowfeed.a.b bVar3 = null;
            if (a2 != null) {
                gVar = a2.f145135a;
            } else {
                gVar = null;
            }
            setMScrollStateManager(gVar);
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
            if (cVar2 != null) {
                bVar = cVar2.f67582h;
            } else {
                bVar = null;
            }
            if (bVar instanceof com.ss.android.ugc.aweme.xsearch.e) {
                com.ss.android.ugc.aweme.autoplay.player.video.c cVar3 = this.f145260e;
                if (cVar3 != null) {
                    bVar2 = cVar3.f67582h;
                } else {
                    bVar2 = null;
                }
                Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.SearchLynxPlayObserver");
                com.ss.android.ugc.aweme.xsearch.e eVar2 = (com.ss.android.ugc.aweme.xsearch.e) bVar2;
                if (a2 != null) {
                    bVar3 = a2.f145137c;
                }
                eVar2.f145155a = bVar3;
            }
            SearchPlayerCore searchPlayerCore = this.f145264i;
            if (searchPlayerCore != null) {
                com.ss.android.ugc.aweme.autoplay.e.a.a(searchPlayerCore);
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
        }
    }

    public final void e() {
        com.ss.android.ugc.aweme.autoplay.player.video.e eVar;
        com.ss.android.ugc.aweme.autoplay.player.video.e eVar2;
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.search.f.a());
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        Integer num = null;
        if (!(cVar == null || (a2 = cVar.a()) == null || a2.f96172b != 3)) {
            a2.f96172b = 0;
        }
        d dVar = d.b.f145280a;
        Aweme mAweme2 = getMAweme();
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
        if (cVar2 != null) {
            eVar = cVar2.f67586l;
        } else {
            eVar = null;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar3 = this.f145260e;
        if (cVar3 != null) {
            num = Integer.valueOf(cVar3.A);
        }
        dVar.a(mAweme2, eVar, num, this.f145258b);
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar4 = this.f145260e;
        if (cVar4 != null && (eVar2 = cVar4.f67586l) != null) {
            eVar2.a(150);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        String str2;
        this.f145265j = true;
        super.onAttachedToWindow();
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            cVar.f67583i = getContainerStatusProvider();
        }
        com.ss.android.ugc.aweme.xsearch.c b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(this.f145257a);
        r rVar = null;
        if (b2 != null) {
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
            if (cVar2 != null) {
                str2 = cVar2.b();
            } else {
                str2 = null;
            }
            b2.f145141b = str2;
        }
        ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
        Aweme mAweme2 = getMAweme();
        if (mAweme2 == null || (str = mAweme2.getAid()) == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar3 = this.f145260e;
        if (cVar3 != null) {
            rVar = cVar3.x;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        if (m()) {
            Aweme mAweme3 = getMAweme();
            if (mAweme3 != null) {
                mAweme3.getAid();
            }
            e();
        } else {
            d();
            Aweme mAweme4 = getMAweme();
            if (mAweme4 != null) {
                mAweme4.getAid();
            }
        }
        h();
    }

    public final void b() {
        Aweme mAweme;
        Aweme mAweme2;
        Video video;
        int width;
        LinearGradientDraweeView linearGradientDraweeView = this.f145261f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setAlpha(1.0f);
        }
        LinearGradientDraweeView linearGradientDraweeView2 = this.f145261f;
        if (linearGradientDraweeView2 != null && (mAweme = getMAweme()) != null && (mAweme2 = getMAweme()) != null && (video = mAweme2.getVideo()) != null) {
            UrlModel originCover = video.getOriginCover();
            if (originCover != null) {
                float height = ((float) video.getHeight()) / ((float) video.getWidth());
                if (height < 1.0f) {
                    ViewGroup.LayoutParams layoutParams = linearGradientDraweeView2.getLayoutParams();
                    if (layoutParams.width > 0) {
                        width = layoutParams.width;
                    } else if (getWidth() > 0) {
                        width = getWidth();
                    } else {
                        width = video.getWidth();
                    }
                    int i2 = (int) (((float) width) * height);
                    layoutParams.width = width;
                    layoutParams.height = i2;
                    linearGradientDraweeView2.setLayoutParams(layoutParams);
                    v b2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(originCover)).a("SearchVideoForLynx").b(width, i2);
                    b2.f39916l = R.color.f159926j;
                    b2.E = linearGradientDraweeView2;
                    b2.a(getMImageDisplayLighten());
                    return;
                }
                v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(originCover)).a("SearchVideoForLynx");
                a2.f39916l = R.color.f159926j;
                a2.E = linearGradientDraweeView2;
                a2.a(getMImageDisplayLighten());
                return;
            }
            UrlModel cover = video.getCover();
            if (cover == null && mAweme.getImageInfos() != null && mAweme.getImageInfos().size() > 1) {
                ImageInfo imageInfo = mAweme.getImageInfos().get(0);
                h.f.b.l.b(imageInfo, "");
                cover = imageInfo.getLabelThumb();
            }
            v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(cover)).a("SearchVideoForLynx");
            a3.f39916l = R.color.f159926j;
            a3.E = this.f145261f;
            a3.a(getMImageDisplayLighten());
        }
    }

    public final void setCore(SearchPlayerCore searchPlayerCore) {
        this.f145264i = searchPlayerCore;
    }

    public final void setDataProvider(com.ss.android.ugc.aweme.autoplay.player.video.c cVar) {
        this.f145260e = cVar;
    }

    public final void setEventChangeListener(m<? super String, ? super Map<String, ? extends Object>, z> mVar) {
        this.f145268m = mVar;
    }

    public final void setMCoverBackground(ImageView imageView) {
        this.f145263h = imageView;
    }

    public final void setMCoverMask(ImageView imageView) {
        this.f145262g = imageView;
    }

    public final void setMCoverView(LinearGradientDraweeView linearGradientDraweeView) {
        this.f145261f = linearGradientDraweeView;
    }

    public final void setRate(int i2) {
        this.f145266k = i2;
    }

    public final void setVideoPlayerStatusListener(AbstractC3861b bVar) {
        this.f145259d = bVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        d();
        a(5);
    }

    public final void setMAweme(Aweme aweme) {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            cVar.f67578d = aweme;
        }
    }

    public final void setMScrollStateManager(com.ss.android.ugc.aweme.flowfeed.utils.g gVar) {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            cVar.f67584j = gVar;
        }
    }

    public final void setMScrollStateObserver(com.ss.android.ugc.aweme.flowfeed.utils.i iVar) {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            cVar.f67585k = iVar;
        }
    }

    public final void setMuted(boolean z) {
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            searchPlayerCore.setMute(z);
        }
    }

    public final void setRepeat(boolean z) {
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            searchPlayerCore.setRepeat(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ HashMap $map;

        static {
            Covode.recordClassIndex(94998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(HashMap hashMap) {
            super(1);
            this.$map = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            Object obj = this.$map.get("search_result_id");
            if (obj == null) {
                return "";
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ HashMap $map;

        static {
            Covode.recordClassIndex(94999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(HashMap hashMap) {
            super(1);
            this.$map = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            Object obj = this.$map.get("list_item_id");
            if (obj == null) {
                return "";
            }
            return obj;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPausePlay(String str) {
        if (com.ss.android.ugc.aweme.discover.b.j.d()) {
            d();
        }
        a(1);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompleted(String str) {
        h.f.b.l.b(com.a.a("onPlayCompleted: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        a(this, "ended");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPreparePlay(String str) {
        h.f.b.l.b(com.a.a("onPreparePlay: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        a(2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onResumePlay(String str) {
        g();
        a(0);
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            mPlayVideoHelper.b();
        }
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            mPlayVideoHelper2.c();
        }
    }

    public final void setAutoPlay(boolean z) {
        if (this.f145258b != z) {
            this.f145258b = z;
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
            if (cVar != null) {
                cVar.n = z;
            }
            if (this.f145258b) {
                h();
            } else {
                i();
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.autoplay.a.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.autoplay.a.a aVar) {
            com.ss.android.ugc.aweme.autoplay.a.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.a(new h.f.a.a<b.d>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(94989);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ b.d invoke() {
                    return this.this$0.this$0.getCore();
                }
            });
            aVar2.d(new h.f.a.a<Aweme>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(94990);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Aweme invoke() {
                    return this.this$0.this$0.getMAweme();
                }
            });
            aVar2.c(new h.f.a.a<Integer>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.d.AnonymousClass3 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(94991);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Integer invoke() {
                    int i2;
                    com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider = this.this$0.this$0.getDataProvider();
                    if (dataProvider != null) {
                        i2 = dataProvider.A;
                    } else {
                        i2 = -1;
                    }
                    return Integer.valueOf(i2);
                }
            });
            aVar2.b(new h.f.a.a<b.c>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.video.b.d.AnonymousClass4 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(94992);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ b.c invoke() {
                    com.ss.android.ugc.aweme.autoplay.player.video.e eVar;
                    com.ss.android.ugc.aweme.xsearch.c b2;
                    com.ss.android.ugc.aweme.autoplay.player.video.e eVar2 = new com.ss.android.ugc.aweme.autoplay.player.video.e(this.this$0.this$0.getCore(), this.this$0.this$0.getDataProvider());
                    com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider = this.this$0.this$0.getDataProvider();
                    if (dataProvider != null) {
                        dataProvider.f67586l = eVar2;
                    }
                    com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider2 = this.this$0.this$0.getDataProvider();
                    if (!(dataProvider2 == null || (eVar = dataProvider2.f67586l) == null || (b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(this.this$0.this$0.f145257a)) == null)) {
                        b2.f145144e = new WeakReference<>(eVar);
                    }
                    return eVar2;
                }
            });
            return z.f158842a;
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f145272a;

        static {
            Covode.recordClassIndex(94996);
        }

        g(b bVar) {
            this.f145272a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider;
            com.ss.android.ugc.aweme.video.i iVar;
            h.f.b.l.d(obj, "");
            if (h.f.b.l.a((Object) "on_ear_phone_unplug", obj) && (dataProvider = this.f145272a.getDataProvider()) != null && (iVar = dataProvider.o) != null && iVar.o()) {
                SearchPlayerCore core = this.f145272a.getCore();
                if (core != null) {
                    core.y();
                }
                this.f145272a.a(1);
            }
        }
    }

    private final boolean a(String str) {
        if (!TextUtils.equals(this.n, str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onBuffering(boolean z) {
        int i2;
        String str;
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
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompletedFirstTime(String str) {
        h.f.b.l.b(com.a.a("onPlayCompletedFirstTime: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore == null || !searchPlayerCore.getRepeat()) {
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayFailed(l lVar) {
        h.f.b.l.b(com.a.a("onPlayFailed: error=%s", Arrays.copyOf(new Object[]{lVar}, 1)), "");
        a(1);
        a("error", ag.c(h.v.a("error", String.valueOf(lVar))));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayProgressChange(float f2) {
        long j2;
        com.ss.android.ugc.aweme.video.i iVar;
        p[] pVarArr = new p[1];
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar == null || (iVar = cVar.o) == null) {
            j2 = 0;
        } else {
            j2 = iVar.n();
        }
        pVarArr[0] = h.v.a("progress", Integer.valueOf((int) j2));
        a("timeupdate", ag.c(pVarArr));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onRenderFirstFrame(o oVar) {
        String str;
        if (oVar != null) {
            str = oVar.getId();
        } else {
            str = null;
        }
        h.f.b.l.b(com.a.a("onRenderFirstFrame: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        g();
        com.ss.android.ugc.aweme.main.g.a("video_play");
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
    }

    public final void setAwemeIndex(a aVar) {
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar;
        List<Aweme> awemeList;
        String str;
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            cVar.A = aVar.f145254a;
        }
        com.ss.android.ugc.aweme.xsearch.c b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(this.f145257a);
        if (b2 != null && (dVar = b2.f145149j) != null && (awemeList = dVar.getAwemeList()) != null) {
            Aweme aweme = awemeList.get(aVar.f145255b);
            h.f.b.l.b(aweme, "");
            a(aweme);
            com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
            if (cVar2 != null) {
                str = cVar2.b();
            } else {
                str = null;
            }
            b2.f145141b = str;
        }
    }

    public final void setObjectFit(String str) {
        int i2;
        h.f.b.l.d(str, "");
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            if (str.hashCode() == 3143043 && str.equals("fill")) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            searchPlayerCore.setFitType(i2);
        }
    }

    public final void setRoundCorner(View view) {
        h.f.b.l.d(view, "");
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new gp((int) com.bytedance.lighten.a.d.c.a(getContext(), 2.0f)));
            view.setClipToOutline(true);
        }
    }

    private void a(Aweme aweme) {
        r rVar;
        String str = "";
        h.f.b.l.d(aweme, str);
        ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = this.f145260e;
        if (cVar != null) {
            rVar = cVar.x;
        } else {
            rVar = null;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        setMAweme(aweme);
        SearchPlayerCore searchPlayerCore = this.f145264i;
        if (searchPlayerCore != null) {
            searchPlayerCore.a(aweme);
        }
        if (getMAweme() != null && getMAweme() != null) {
            if ((getWidth() == 0 || getHeight() == 0) && (getLayoutParams() == null || getLayoutParams().width == 0 || getLayoutParams().height == 0)) {
                getViewTreeObserver().addOnPreDrawListener(new k(this));
            } else {
                b();
            }
            d();
        }
    }

    public final void setAweme(String str) {
        h.f.b.l.d(str, "");
        if (str != null && str.length() != 0) {
            Type type = new h().type;
            GsonProvider c2 = GsonHolder.c();
            h.f.b.l.b(c2, "");
            Aweme aweme = (Aweme) c2.b().a(str, type);
            if (aweme != null) {
                if (getMAweme() != null) {
                    Aweme mAweme = getMAweme();
                    if (mAweme == null) {
                        h.f.b.l.b();
                    }
                    if (!(!h.f.b.l.a((Object) mAweme.getAid(), (Object) aweme.getAid()))) {
                        return;
                    }
                }
                a(aweme);
            }
        }
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar;
        com.ss.android.ugc.aweme.video.i iVar;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar2;
        com.ss.android.ugc.aweme.video.i iVar2;
        if (i2 == 0) {
            if (a("play") && this.f145266k > 0 && (cVar = this.f145260e) != null && (iVar = cVar.o) != null) {
                iVar.a(this.f145266k);
            }
            a(this, "play");
        } else if (i2 == 1) {
            if (a("pause") && this.f145266k > 0 && (cVar2 = this.f145260e) != null && (iVar2 = cVar2.o) != null) {
                iVar2.J();
            }
            a(this, "pause");
        } else if (i2 == 2) {
            a(this, "loading");
        } else if (i2 == 5) {
            a(this, "stop");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSessionId(int r5) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.xsearch.video.b.setSessionId(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        com.ss.android.ugc.playerkit.videoview.i surfaceHolder;
        h.f.b.l.d(context, "");
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar = null;
        MethodCollector.i(1425);
        this.f145257a = -1;
        this.f145266k = -1;
        this.o = h.i.a((h.f.a.a) new c(this, context));
        this.p = h.i.a((h.f.a.a) new f(this));
        h.f.b.l.d("SearchVideoForLynx init", "");
        h.f.b.l.d("SearchVideoForLynx initView", "");
        com.a.a(LayoutInflater.from(getContext()), R.layout.axp, this, true);
        View findViewById = findViewById(R.id.c99);
        this.f145267l = findViewById;
        if (findViewById != null) {
            setRoundCorner(findViewById);
        }
        this.f145261f = (LinearGradientDraweeView) findViewById(R.id.agf);
        this.f145263h = (ImageView) findViewById(R.id.agj);
        this.f145262g = (ImageView) findViewById(R.id.agm);
        SearchPlayerCore searchPlayerCore = (SearchPlayerCore) findViewById(R.id.ekb);
        this.f145264i = searchPlayerCore;
        cVar = searchPlayerCore != null ? searchPlayerCore.getDataProvider() : cVar;
        this.f145260e = cVar;
        if (cVar != null) {
            cVar.n = false;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar2 = this.f145260e;
        if (cVar2 != null) {
            cVar2.f67575a = this;
        }
        SearchPlayerCore searchPlayerCore2 = this.f145264i;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setMVideoViewListener(this);
        }
        SearchPlayerCore searchPlayerCore3 = this.f145264i;
        if (searchPlayerCore3 != null) {
            searchPlayerCore3.setMPlayerViewListener(this);
        }
        SearchPlayerCore searchPlayerCore4 = this.f145264i;
        if (searchPlayerCore4 != null) {
            searchPlayerCore4.setMVideoMobListener(new c(this.f145260e));
        }
        h.f.b.l.d("SearchVideoForLynx initVideoView", "");
        SearchPlayerCore searchPlayerCore5 = this.f145264i;
        if (!(searchPlayerCore5 == null || (surfaceHolder = searchPlayerCore5.getSurfaceHolder()) == null)) {
            surfaceHolder.a(new e(this));
        }
        getMPlayVideoHelper();
        h.f.b.l.d("SearchVideoForLynx, initMob", "");
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar3 = this.f145260e;
        if (cVar3 != null) {
            cVar3.x = r.a.a();
        }
        h.f.b.l.d("SearchVideoForLynx, initAutoPlayComponents", "");
        com.ss.android.ugc.aweme.autoplay.player.video.e eVar = new com.ss.android.ugc.aweme.autoplay.player.video.e(this.f145264i, this.f145260e);
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar4 = this.f145260e;
        if (cVar4 != null) {
            cVar4.f67586l = eVar;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar5 = this.f145260e;
        if (cVar5 != null) {
            cVar5.f67582h = new com.ss.android.ugc.aweme.xsearch.e(this.f145264i);
        }
        h.f.b.l.d("SearchVideoForLynx observerEarPhoneUnplug", "");
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) j2;
            HomePageDataViewModel.a.a(eVar2).f99126i.observe(eVar2, new g(this));
        }
        h.f.b.l.d("SearchVideoForLynx, initAutoPlayComponents", "");
        d dVar = new d(this);
        h.f.b.l.d(dVar, "");
        com.ss.android.ugc.aweme.autoplay.a.a aVar = new com.ss.android.ugc.aweme.autoplay.a.a();
        dVar.invoke(aVar);
        setMScrollStateObserver(aVar);
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar6 = this.f145260e;
        if (cVar6 != null) {
            cVar6.f67582h = new com.ss.android.ugc.aweme.xsearch.e(this.f145264i);
            MethodCollector.o(1425);
            return;
        }
        MethodCollector.o(1425);
    }

    public final void setLogExtra(HashMap<String, Object> hashMap) {
        r rVar;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar;
        r rVar2;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar2;
        r rVar3;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar3;
        r rVar4;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar4;
        r rVar5;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar5;
        r rVar6;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar6;
        r rVar7;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar7;
        r rVar8;
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar8;
        r rVar9;
        r rVar10;
        h.f.b.l.d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    GsonProvider c2 = GsonHolder.c();
                    h.f.b.l.b(c2, "");
                    String b2 = c2.b().b(entry.getValue());
                    h.f.b.l.b(b2, "");
                    hashMap2.put(key, b2);
                } else {
                    hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                    if (h.f.b.l.a((Object) "enter_from", (Object) entry.getKey())) {
                        com.ss.android.ugc.aweme.autoplay.player.video.c cVar9 = this.f145260e;
                        if (!(cVar9 == null || (rVar10 = cVar9.x) == null)) {
                            String str = (String) hashMap2.get("enter_from");
                            if (str == null) {
                                str = "";
                            }
                            h.f.b.l.b(str, "");
                            rVar10.f(str);
                        }
                        hashMap2.remove("enter_from");
                    }
                }
            }
        }
        if (!(!hashMap2.keySet().contains("impr_id") || (cVar8 = this.f145260e) == null || (rVar9 = cVar8.x) == null)) {
            String str2 = (String) hashMap2.get("impr_id");
            if (str2 == null) {
                str2 = "";
            }
            h.f.b.l.b(str2, "");
            rVar9.h(str2);
        }
        if (!(!hashMap2.keySet().contains("search_keyword") || (cVar7 = this.f145260e) == null || (rVar8 = cVar7.x) == null)) {
            String str3 = (String) hashMap2.get("search_keyword");
            if (str3 == null) {
                str3 = "";
            }
            h.f.b.l.b(str3, "");
            rVar8.e(str3);
        }
        if (!(!hashMap2.keySet().contains("search_result_id") || (cVar6 = this.f145260e) == null || (rVar7 = cVar6.x) == null)) {
            rVar7.a(new i(hashMap2));
        }
        if (!(!hashMap2.keySet().contains("list_item_id") || (cVar5 = this.f145260e) == null || (rVar6 = cVar5.x) == null)) {
            rVar6.b(new j(hashMap2));
        }
        if (!(!hashMap2.keySet().contains("search_id") || (cVar4 = this.f145260e) == null || (rVar5 = cVar4.x) == null)) {
            String str4 = (String) hashMap2.get("search_id");
            if (str4 == null) {
                str4 = "";
            }
            h.f.b.l.b(str4, "");
            rVar5.g(str4);
        }
        if (!(!hashMap2.keySet().contains("music_id") || (cVar3 = this.f145260e) == null || (rVar4 = cVar3.x) == null)) {
            String str5 = (String) hashMap2.get("music_id");
            if (str5 == null) {
                str5 = "";
            }
            h.f.b.l.b(str5, "");
            h.f.b.l.d(str5, "");
            rVar4.p = str5;
        }
        if (!(!hashMap2.keySet().contains("token_type") || (cVar2 = this.f145260e) == null || (rVar3 = cVar2.x) == null)) {
            String str6 = (String) hashMap2.get("token_type");
            if (str6 == null) {
                str6 = "";
            }
            h.f.b.l.b(str6, "");
            rVar3.a(str6);
        }
        if (!(!hashMap2.keySet().contains("is_fullscreen") || (cVar = this.f145260e) == null || (rVar2 = cVar.x) == null)) {
            String str7 = (String) hashMap2.get("is_fullscreen");
            if (str7 == null) {
                str7 = "";
            }
            h.f.b.l.b(str7, "");
            h.f.b.l.d(str7, "");
            rVar2.v = str7;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c cVar10 = this.f145260e;
        if (!(cVar10 == null || (rVar = cVar10.x) == null)) {
            rVar.a(hashMap2);
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    private static /* synthetic */ void a(b bVar, String str) {
        bVar.a(str, new HashMap());
    }

    private final void a(String str, Map<String, ? extends Object> map) {
        if (a(str)) {
            this.n = str;
            m<? super String, ? super Map<String, ? extends Object>, z> mVar = this.f145268m;
            if (mVar != null) {
                mVar.invoke(str, map);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(1402);
        h.f.b.l.d("SearchVideoForLynx onMeasure", "");
        super.onMeasure(i2, i3);
        MethodCollector.o(1402);
    }

    public final void a(int i2, boolean z) {
        com.ss.android.ugc.aweme.newfollow.c.c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            mPlayVideoHelper.a((float) i2);
        }
        if (z) {
            e();
        } else {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(1404);
        h.f.b.l.d("SearchVideoForLynx onLayout", "");
        super.onLayout(z, i2, i3, i4, i5);
        MethodCollector.o(1404);
    }
}

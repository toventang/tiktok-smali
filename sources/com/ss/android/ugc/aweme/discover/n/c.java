package com.ss.android.ugc.aweme.discover.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.a.af;
import com.ss.android.ugc.aweme.discover.a.ag;
import com.ss.android.ugc.aweme.discover.a.as;
import com.ss.android.ugc.aweme.discover.a.at;
import com.ss.android.ugc.aweme.discover.a.v;
import com.ss.android.ugc.aweme.discover.a.x;
import com.ss.android.ugc.aweme.discover.a.y;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchView;
import com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.al;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.u.aa;
import com.ss.android.ugc.aweme.feed.u.ac;
import com.ss.android.ugc.aweme.feed.u.w;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.video.VideoAnchorView;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.av;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.s.a;
import com.ss.android.ugc.aweme.utils.ay;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.utils.du;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gp;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.iu;
import com.ss.android.ugc.aweme.utils.ix;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends a implements View.OnClickListener, com.ss.android.ugc.aweme.discover.b.b, w, com.ss.android.ugc.aweme.search.j.a, com.ss.android.ugc.aweme.search.k.p {
    private static final float aj = by.a(2);
    public static final b w = new b((byte) 0);
    private TextView A;
    private TagLayout B;
    private com.ss.android.ugc.aweme.discover.helper.f C;
    private TextView D;
    private LinearLayout E;
    private ViewStub F;
    private ViewStub G;
    private ViewStub H;
    private View I;
    private ViewStub J;
    private TextView K;
    private ImageView L;
    private TuxTextView M;
    private View N;
    private TuxIconView O;
    private FrameLayout P;
    private ac Q;
    private long R;
    private LinearLayout S;
    private ConstraintLayout T;
    private SmartImageView U;
    private TuxTextView V;
    private TuxTextView W;
    private View X;
    private ClickSearchViewModel Y;
    private final boolean Z;
    private String aa;
    private boolean ab;
    private com.ss.android.ugc.aweme.search.d.c ac;
    private com.ss.android.ugc.aweme.discover.b.g ad;
    private com.ss.android.ugc.aweme.search.ecom.video.a ae;
    private com.ss.android.ugc.aweme.search.ecom.a.a af;
    private final h.h ag;
    private final h.h ah;
    private final h.h ai;

    /* renamed from: b  reason: collision with root package name */
    public VideoAnchorView f81958b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f81959c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f81960d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f81961e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.a f81962f;

    /* renamed from: g  reason: collision with root package name */
    public int f81963g;

    /* renamed from: h  reason: collision with root package name */
    public int f81964h;

    /* renamed from: i  reason: collision with root package name */
    public SearchVideoView f81965i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.cs.a f81966j;
    boolean q;
    boolean r;
    public int s;
    public r t;
    public com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a u;
    public long v;
    private TextView x;
    private TextView y;
    private SmartCircleImageView z;

    private final q.AnonymousClass1 R() {
        return (q.AnonymousClass1) this.ag.getValue();
    }

    private final h.f.a.b<Aweme, String> S() {
        return (h.f.a.b) this.ah.getValue();
    }

    private final n.AnonymousClass1 T() {
        return (n.AnonymousClass1) this.ai.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a
    public final void G() {
        this.ab = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(androidx.core.g.e<String, Integer> eVar) {
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final boolean a(Video video, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int i() {
        return 16;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(51014);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$c  reason: collision with other inner class name */
    static final class C1915c extends h.f.b.m implements h.f.a.a<h.f.a.b<? super Aweme, ? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1915c f81971a = new C1915c();

        static {
            Covode.recordClassIndex(51015);
        }

        C1915c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.f.a.b<? super Aweme, ? extends String> invoke() {
            return AnonymousClass1.f81972a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a
    public final boolean D() {
        return this.ab;
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        I();
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final com.ss.android.ugc.aweme.search.j.a d() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean e() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean f() {
        return this.r;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final com.ss.android.ugc.aweme.search.model.d g() {
        return this.f81961e;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int l() {
        return this.s;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final void n() {
        I();
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        b.i.b(new k(this, str, F().f121278m, F().t, F().s), b.i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final void a(r rVar) {
        com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider;
        h.f.b.l.d(rVar, "");
        this.t = rVar;
        com.ss.android.ugc.aweme.discover.mixfeed.cs.a aVar = this.f81966j;
        if (aVar != null) {
            aVar.f81695a = rVar;
        }
        SearchVideoView J2 = J();
        if (!(J2 == null || (dataProvider = J2.getDataProvider()) == null)) {
            dataProvider.x = rVar;
        }
        View view = this.itemView;
        h.f.b.l.b(view, "");
        j.a.a(view, F());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.e
    public final /* synthetic */ void a(Aweme aweme, int i2) {
        super.a(aweme, i2);
        SmartImageView P2 = P();
        if (P2 != null) {
            P2.setUserVisibleHint(false);
        }
    }

    public static final class f implements com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81975a;

        static {
            Covode.recordClassIndex(51019);
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final ViewGroup a() {
            return this.f81975a.f81959c;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final Context c() {
            return this.f81975a.f81957a;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final ViewGroup d() {
            return this.f81975a.f81960d;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final void g() {
            this.f81975a.x();
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final void h() {
            this.f81975a.y();
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final String b() {
            return this.f81975a.F().f121272g;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final void e() {
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider;
            b.a aVar;
            com.ss.android.ugc.aweme.feed.helper.h a2 = com.ss.android.ugc.aweme.feed.helper.h.a();
            h.f.b.l.b(a2, "");
            a2.f93345h = 53;
            SearchVideoView J = this.f81975a.J();
            if (J != null && (dataProvider = J.getDataProvider()) != null && (aVar = dataProvider.f67587m) != null) {
                aVar.a();
            }
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b
        public final void f() {
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider;
            b.a aVar;
            com.ss.android.ugc.aweme.feed.helper.h a2 = com.ss.android.ugc.aweme.feed.helper.h.a();
            h.f.b.l.b(a2, "");
            a2.f93345h = 54;
            SearchVideoView J = this.f81975a.J();
            if (J != null && (dataProvider = J.getDataProvider()) != null && (aVar = dataProvider.f67587m) != null) {
                aVar.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f81975a = cVar;
        }
    }

    public static final class g implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81976a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchVideoView f81977b;

        static {
            Covode.recordClassIndex(51020);
        }

        @Override // com.ss.android.ugc.aweme.autoplay.player.b.a
        public final void a() {
            this.f81976a.onClick(this.f81977b);
        }

        g(c cVar, SearchVideoView searchVideoView) {
            this.f81976a = cVar;
            this.f81977b = searchVideoView;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(51027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b(this) {
                /* class com.ss.android.ugc.aweme.discover.n.c.n.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f81988a;

                static {
                    Covode.recordClassIndex(51028);
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final void a() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        aVar.c();
                    }
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final void b() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        aVar.d();
                    }
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final void c() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        aVar.e();
                    }
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final void d() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        aVar.f();
                    }
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final void f() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        aVar.g();
                    }
                }

                @Override // com.ss.android.ugc.aweme.discover.n.b
                public final Boolean e() {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.f81988a.this$0.u;
                    if (aVar != null) {
                        return Boolean.valueOf(aVar.h());
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81988a = r1;
                }
            };
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(51031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.aweme.autoplay.player.video.f(this) {
                /* class com.ss.android.ugc.aweme.discover.n.c.q.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ q f81991a;

                static {
                    Covode.recordClassIndex(51032);
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void A() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void B() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
                public final void c() {
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

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onCompleteLoaded(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPausePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompletedFirstTime(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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
                public final void onPreParePlay(String str, com.ss.android.ugc.playerkit.model.n nVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreRenderSessionMissed(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreparePlay(String str) {
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

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
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

                @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
                public final View w() {
                    return null;
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

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81991a = r1;
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
                    SearchVideoView J = this.f81991a.this$0.J();
                    if (J != null) {
                        J.setVisibility(0);
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a, com.ss.android.ugc.aweme.common.a.a
    public final int[] b() {
        return em.a(201);
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final View h() {
        View view = this.itemView;
        h.f.b.l.b(view, "");
        return view;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int k() {
        return getAdapterPosition();
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final SmartImageView p() {
        return P();
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final b.d q() {
        return J();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void s() {
        onClick(null);
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final Aweme u() {
        return (Aweme) ((com.ss.android.ugc.aweme.common.a.a) this).f76353m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return h();
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81990a;

        static {
            Covode.recordClassIndex(51030);
        }

        p(c cVar) {
            this.f81990a = cVar;
        }

        public final void run() {
            this.f81990a.O();
            this.f81990a.K();
        }
    }

    private final boolean U() {
        return TextUtils.equals(this.aa, "selfharm");
    }

    private final void X() {
        iu.a(this.D);
        iu.a(this.M);
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final r F() {
        r rVar = this.t;
        if (rVar == null) {
            return r.a.a();
        }
        return rVar;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void t() {
        com.ss.android.ugc.aweme.discover.b.g gVar = this.ad;
        if (gVar != null) {
            h.f.b.l.d(this, "");
            gVar.a(this, (Integer) null, (com.ss.android.ugc.aweme.discover.b.f) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean v() {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.u;
        if (aVar == null || !aVar.b()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(51010);
    }

    private final com.ss.android.ugc.aweme.mix.e.b ab() {
        return new com.ss.android.ugc.aweme.mix.e.b(F().f121274i, 3, F().f121269d, this.s);
    }

    public final void L() {
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        TuxIconView tuxIconView = this.O;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        M();
    }

    public final void M() {
        int i2;
        TuxIconView tuxIconView = this.O;
        if (tuxIconView != null) {
            if (com.ss.android.ugc.aweme.discover.b.a.a()) {
                i2 = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i2 = R.raw.icon_speaker_2_fill_ltr;
            }
            tuxIconView.setIconRes(i2);
        }
    }

    public final void N() {
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TuxIconView tuxIconView = this.O;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    public final void O() {
        long j2 = this.R;
        if (j2 != -1) {
            TextView textView = this.y;
            if (textView == null) {
                h.f.b.l.a("txtLikeCount");
            }
            textView.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int j() {
        View view = this.itemView;
        h.f.b.l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar != null) {
            return bVar.f3768a;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final boolean o() {
        com.ss.android.ugc.aweme.discover.b.g gVar = this.ad;
        if (gVar == null || !((Boolean) gVar.f80854m.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean r() {
        ClickSearchView a2;
        com.ss.android.ugc.aweme.discover.mixfeed.cs.a aVar = this.f81966j;
        if (aVar == null || (a2 = aVar.a()) == null || !a2.b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        SearchPlayerCore a2 = com.ss.android.ugc.aweme.discover.b.d.a(this);
        if (a2 != null) {
            a2.x();
        }
        SmartImageView P2 = P();
        if (P2 != null) {
            P2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        SearchPlayerCore a2 = com.ss.android.ugc.aweme.discover.b.d.a(this);
        if (a2 != null) {
            a2.a();
        }
        SmartImageView P2 = P();
        if (P2 != null) {
            com.ss.android.ugc.aweme.discover.b.d.b(P2);
        }
    }

    private final SmartImageView P() {
        ViewStub viewStub;
        ViewStub viewStub2;
        MethodCollector.i(1578);
        SmartImageView smartImageView = null;
        if (!com.ss.android.ugc.aweme.discover.b.h.d()) {
            MethodCollector.o(1578);
            return null;
        }
        if (!(this.U != null || (viewStub = this.G) == null || viewStub.getParent() == null || (viewStub2 = this.G) == null)) {
            viewStub2.setLayoutResource(R.layout.awj);
            View inflate = viewStub2.inflate();
            if (inflate instanceof SmartImageView) {
                smartImageView = inflate;
            }
            this.U = smartImageView;
        }
        SmartImageView smartImageView2 = this.U;
        MethodCollector.o(1578);
        return smartImageView2;
    }

    private final void W() {
        View Q2;
        View view = this.N;
        if (view != null) {
            view.setVisibility(8);
        }
        TuxTextView tuxTextView = this.M;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        if (!com.ss.android.ugc.aweme.search.a.a.a() && Q() != null && (Q2 = Q()) != null) {
            Q2.setVisibility(8);
        }
    }

    private final void aa() {
        int i2;
        TextView textView = this.D;
        if (textView != null) {
            Context context = this.f81957a;
            Object obj = this.f76353m;
            h.f.b.l.b(obj, "");
            textView.setText(ib.f(context, ((Aweme) obj).getCreateTime() * 1000));
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s((Aweme) ((com.ss.android.ugc.aweme.common.a.a) this).f76353m)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a
    public final void H() {
        long j2;
        int i2;
        AwemeStatistics statistics;
        Aweme aweme = (Aweme) this.f76353m;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j2 = -1;
        } else {
            j2 = statistics.getDiggCount();
        }
        this.R = j2;
        Aweme aweme2 = (Aweme) this.f76353m;
        if (aweme2 != null) {
            i2 = aweme2.getUserDigg();
        } else {
            i2 = 0;
        }
        this.f81963g = i2;
        this.itemView.post(new p(this));
    }

    public final SearchVideoView J() {
        ViewStub viewStub;
        ViewStub viewStub2;
        MethodCollector.i(1583);
        SearchVideoView searchVideoView = null;
        if (!com.ss.android.ugc.aweme.discover.b.h.c()) {
            MethodCollector.o(1583);
            return null;
        }
        if (!(this.f81965i != null || (viewStub = this.J) == null || viewStub.getParent() == null || (viewStub2 = this.J) == null)) {
            viewStub2.setLayoutResource(R.layout.ax0);
            View inflate = viewStub2.inflate();
            if (inflate instanceof SearchVideoView) {
                searchVideoView = inflate;
            }
            SearchVideoView searchVideoView2 = searchVideoView;
            this.f81965i = searchVideoView2;
            a(searchVideoView2);
        }
        SearchVideoView searchVideoView3 = this.f81965i;
        MethodCollector.o(1583);
        return searchVideoView3;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        Animatable i2;
        if (((a) this).n == null || ((a) this).n.getController() == null || (i2 = ((a) this).n.getController().i()) == null || !i2.isRunning()) {
            return false;
        }
        return true;
    }

    private final View Q() {
        ViewStub viewStub;
        ViewStub viewStub2;
        TuxTextView tuxTextView;
        MethodCollector.i(1589);
        TuxTextView tuxTextView2 = null;
        if (com.ss.android.ugc.aweme.search.a.a.a()) {
            MethodCollector.o(1589);
            return null;
        }
        if (!(this.X != null || (viewStub = this.H) == null || viewStub.getParent() == null || (viewStub2 = this.H) == null)) {
            View inflate = viewStub2.inflate();
            this.X = inflate;
            if (inflate != null) {
                tuxTextView = (TuxTextView) inflate.findViewById(R.id.d6a);
            } else {
                tuxTextView = null;
            }
            this.V = tuxTextView;
            View view = this.X;
            if (view != null) {
                tuxTextView2 = (TuxTextView) view.findViewById(R.id.fca);
            }
            this.W = tuxTextView2;
        }
        View view2 = this.X;
        MethodCollector.o(1589);
        return view2;
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a
    public final void I() {
        SearchVideoView J2;
        SearchPlayerCore core;
        SearchVideoView J3 = J();
        if (J3 != null) {
            Object obj = this.f76353m;
            h.f.b.l.b(obj, "");
            J3.a((Aweme) obj);
        }
        if (!(!com.ss.android.ugc.aweme.commercialize.e.a.b.s((Aweme) ((com.ss.android.ugc.aweme.common.a.a) this).f76353m) || (J2 = J()) == null || (core = J2.getCore()) == null)) {
            core.setMSearchAdViewCallBack(T());
        }
        SmartImageView P2 = P();
        if (P2 != null) {
            com.ss.android.ugc.aweme.discover.b.d.b(P2);
        }
        if (com.ss.android.ugc.aweme.search.s.a.c((Aweme) this.f76353m)) {
            Object obj2 = this.f76353m;
            h.f.b.l.b(obj2, "");
            Video video = ((Aweme) obj2).getVideo();
            h.f.b.l.b(video, "");
            a(video.getAiCover(), "SearchVideoHolder");
            return;
        }
        super.I();
    }

    public final void K() {
        if (this.f81957a != null) {
            if (this.Z) {
                Drawable a2 = com.ss.android.ugc.aweme.discover.helper.n.a(this.f81963g, this.f81957a, 2131233601);
                if (a2 != null) {
                    int a3 = (int) by.a(13);
                    a2.setBounds(0, 0, a3, a3);
                } else {
                    a2 = null;
                }
                TextView textView = this.y;
                if (textView == null) {
                    h.f.b.l.a("txtLikeCount");
                }
                textView.setCompoundDrawablesRelative(a2, null, null, null);
                return;
            }
            Drawable a4 = com.ss.android.ugc.aweme.discover.helper.n.a(this.f81963g, this.f81957a, 2131233606);
            TextView textView2 = this.y;
            if (textView2 == null) {
                h.f.b.l.a("txtLikeCount");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(a4, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private final void Y() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.I;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (ag.a()) {
                Aweme aweme = (Aweme) this.f76353m;
                if (aweme == null || aweme.playlist_info == null || !y.d()) {
                    layoutParams.height = (int) by.a(32);
                } else {
                    layoutParams.height = (int) by.a(98);
                }
                View view2 = this.I;
                if (view2 != null) {
                    View view3 = this.itemView;
                    h.f.b.l.b(view3, "");
                    view2.setBackground(androidx.core.content.b.a(view3.getContext(), (int) R.drawable.bec));
                }
            } else if (ag.b() || ag.c()) {
                Aweme aweme2 = (Aweme) this.f76353m;
                if (aweme2 == null || aweme2.playlist_info == null || !y.d()) {
                    layoutParams.height = (int) by.a(32);
                } else {
                    layoutParams.height = (int) by.a(98);
                }
                View view4 = this.I;
                if (view4 != null) {
                    View view5 = this.itemView;
                    h.f.b.l.b(view5, "");
                    view4.setBackground(androidx.core.content.b.a(view5.getContext(), (int) R.drawable.bed));
                }
            } else {
                layoutParams.height = (int) by.a(64);
                View view6 = this.I;
                if (view6 != null) {
                    View view7 = this.itemView;
                    h.f.b.l.b(view7, "");
                    view6.setBackground(androidx.core.content.b.a(view7.getContext(), (int) R.drawable.bbw));
                }
            }
            View view8 = this.I;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams);
            }
        }
    }

    private final void Z() {
        Video video;
        VideoTag videoTag;
        int i2;
        Drawable a2;
        Video video2;
        VideoTag videoTag2;
        hashCode();
        Aweme aweme = (Aweme) this.f76353m;
        if (aweme != null) {
            aweme.getAid();
        }
        Aweme aweme2 = (Aweme) this.f76353m;
        if (!(aweme2 == null || (video2 = aweme2.getVideo()) == null || (videoTag2 = video2.getVideoTag()) == null)) {
            videoTag2.getTitle();
        }
        Aweme aweme3 = (Aweme) this.f76353m;
        if (aweme3 == null || (video = aweme3.getVideo()) == null || (videoTag = video.getVideoTag()) == null || !hl.a(videoTag.getTitle())) {
            TextView textView = this.K;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        float a3 = ((float) h.j.h.a(videoTag.getOpacity(), 0, 100)) / 100.0f;
        Integer a4 = ay.a(videoTag.getBackgroundColor());
        Integer a5 = ay.a(videoTag.getFontColor());
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(videoTag.getTitle());
            textView2.setAlpha(a3);
            if (a5 != null) {
                i2 = a5.intValue();
            } else {
                i2 = -1;
            }
            textView2.setTextColor(i2);
            if (a4 != null) {
                a2 = cb.a(a4.intValue(), aj);
            } else {
                a2 = androidx.core.content.b.a(textView2.getContext(), (int) R.drawable.bc7);
            }
            textView2.setBackground(a2);
        }
    }

    static final class k<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f81982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f81983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f81984d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81985e;

        static {
            Covode.recordClassIndex(51024);
        }

        k(c cVar, String str, int i2, String str2, String str3) {
            this.f81981a = cVar;
            this.f81982b = str;
            this.f81983c = i2;
            this.f81984d = str2;
            this.f81985e = str3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            Integer num;
            String searchKeyword;
            String str3;
            String str4;
            Video video;
            VideoTag videoTag;
            ad c2;
            com.ss.android.ugc.aweme.search.k.q a2 = am.a();
            String str5 = "";
            if (a2 == null || (c2 = a2.c()) == null || (str = c2.f121173b) == null) {
                str = str5;
            }
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            Aweme aweme = (Aweme) this.f81981a.f76353m;
            String str6 = null;
            if (aweme == null || (video = aweme.getVideo()) == null || (videoTag = video.getVideoTag()) == null) {
                str2 = null;
            } else {
                str2 = videoTag.getEnglishTitle();
            }
            if (str2 != null && str2.length() > 0) {
                linkedHashMap.put("video_tag", str2);
            }
            VideoAnchorView videoAnchorView = this.f81981a.f81958b;
            if (videoAnchorView != null && videoAnchorView.getVisibility() == 0) {
                Aweme aweme2 = (Aweme) ((com.ss.android.ugc.aweme.common.a.a) this.f81981a).f76353m;
                if (aweme2 != null) {
                    str4 = com.ss.android.ugc.aweme.search.s.a.a(aweme2);
                } else {
                    str4 = str5;
                }
                linkedHashMap.put("anchor_info", str4);
            }
            if (this.f81981a.f81964h != 1 || com.ss.android.ugc.aweme.search.a.a.a()) {
                Aweme aweme3 = (Aweme) this.f81981a.f76353m;
                h.f.b.l.b(aweme3, str5);
                String str7 = this.f81982b;
                r F = this.f81981a.F();
                int i2 = this.f81983c;
                String str8 = this.f81984d;
                String str9 = this.f81985e;
                h.f.b.l.d(aweme3, str5);
                h.f.b.l.d(str7, str5);
                h.f.b.l.d(F, str5);
                h.f.b.l.d(str, str5);
                a.C3144a aVar = new a.C3144a(aweme3);
                a.b bVar = new a.b(aweme3);
                Video video2 = aweme3.getVideo();
                if (video2 == null || video2.getAiCover() == null || com.ss.android.ugc.aweme.search.s.a.e(aweme3)) {
                    Video video3 = aweme3.getVideo();
                    if ((video3 == null || video3.getAiCover() == null) && com.ss.android.ugc.aweme.search.s.a.e(aweme3)) {
                        str6 = (String) bVar.invoke();
                        num = 1;
                    } else {
                        Video video4 = aweme3.getVideo();
                        if (video4 == null || video4.getAiCover() == null || !com.ss.android.ugc.aweme.search.s.a.e(aweme3)) {
                            num = null;
                        } else {
                            str6 = (String) bVar.invoke();
                            if (str6 == null) {
                                str6 = (String) aVar.invoke();
                            }
                            num = 2;
                        }
                    }
                } else {
                    str6 = (String) aVar.invoke();
                    num = 0;
                }
                int i3 = -1;
                if (aweme3.getRank() != -1) {
                    i2 = aweme3.getRank();
                }
                av avVar = new av(F);
                avVar.o(str7);
                avVar.c(ac.a.f91473a.a(aweme3.getRequestId()));
                avVar.b(str);
                avVar.i(com.ss.android.ugc.aweme.metrics.ac.e(aweme3));
                avVar.a(com.ss.android.ugc.aweme.utils.w.a(aweme3, av.q, str7, F));
                avVar.a(Integer.valueOf(i2));
                if (str6 == null) {
                    str6 = str5;
                }
                avVar.c("cover_type", str6);
                if (num != null) {
                    i3 = num.intValue();
                }
                avVar.a("ai_cover", i3);
                if (str8 == null) {
                    str8 = "normal";
                }
                avVar.a("use_scenario", str8);
                if (str9 == null) {
                    str9 = "normal";
                }
                avVar.a("tns_ban_type", str9);
                com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
                if (!(b2 == null || (searchKeyword = b2.getSearchKeyword()) == null)) {
                    str5 = searchKeyword;
                }
                avVar.c("search_keyword_x", str5);
                avVar.a(linkedHashMap);
                avVar.f();
            } else {
                if (h.f.b.l.a((Object) this.f81981a.F().u, (Object) str5)) {
                    str3 = "playlist";
                } else {
                    str3 = this.f81981a.F().u;
                }
                Aweme aweme4 = (Aweme) this.f81981a.f76353m;
                h.f.b.l.b(aweme4, str5);
                ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) new au(this.f81981a.F()).a(this.f81981a.F().f121274i).o(this.f81981a.F().f121272g)).g(aweme4.getGroupId()).b(str)).x(str3)).w("0").f();
            }
            return z.f158842a;
        }
    }

    private final void V() {
        PlayListInfo playListInfo;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        Integer mixSrc;
        Aweme aweme = (Aweme) this.f76353m;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null) {
            Integer mixSrc2 = playListInfo.getMixSrc();
            if (mixSrc2 != null) {
                i2 = mixSrc2.intValue();
            } else {
                i2 = 0;
            }
            this.f81964h = i2;
            if (y.c() || (y.d() && this.f81964h == 0)) {
                View view = this.N;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            String str = "";
            if (y.d() && (mixSrc = playListInfo.getMixSrc()) != null && mixSrc.intValue() == 1 && com.ss.android.ugc.aweme.search.a.a.b()) {
                TuxTextView tuxTextView = this.M;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                TextView textView = this.D;
                Resources system = Resources.getSystem();
                h.f.b.l.b(system, str);
                com.bytedance.android.livesdk.utils.p.b(textView, h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
                TuxTextView tuxTextView2 = this.M;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(62);
                }
                TuxTextView tuxTextView3 = this.M;
                if (tuxTextView3 != null) {
                    a.C0730a aVar = new a.C0730a();
                    String mixName = playListInfo.getMixName();
                    if (mixName != null) {
                        str = mixName;
                    }
                    tuxTextView3.setText(a(new com.bytedance.tux.f.d(aVar.b(str).f33382a)));
                }
            } else if (com.ss.android.ugc.aweme.search.a.a.c() && this.f81964h == 1) {
                a(playListInfo);
                View view2 = this.itemView;
                h.f.b.l.b(view2, str);
                int b2 = androidx.core.graphics.a.b(androidx.core.content.b.c(view2.getContext(), R.color.bi), 0);
                View view3 = this.I;
                if (view3 != null) {
                    View view4 = this.itemView;
                    h.f.b.l.b(view4, str);
                    int[] iArr = {b2, androidx.core.content.b.c(view4.getContext(), R.color.bi)};
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    Resources system2 = Resources.getSystem();
                    h.f.b.l.a((Object) system2, str);
                    view3.setBackground(cb.a(iArr, orientation, TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics())));
                }
                View view5 = this.I;
                if (!(view5 == null || (layoutParams = view5.getLayoutParams()) == null)) {
                    Resources system3 = Resources.getSystem();
                    h.f.b.l.b(system3, str);
                    layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 75.0f, system3.getDisplayMetrics()));
                }
                View Q2 = Q();
                if (Q2 != null) {
                    Q2.setBackgroundColor(0);
                }
                MixFeedService.k().a(F().f121272g, playListInfo.getMixId(), ((Aweme) this.f76353m).getGroupId(), ((Aweme) this.f76353m).getAuthorUid(), ab());
            } else if (com.ss.android.ugc.aweme.search.a.a.d() && this.f81964h == 1) {
                a(playListInfo);
                View view6 = this.I;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View Q3 = Q();
                if (Q3 != null) {
                    View view7 = this.itemView;
                    h.f.b.l.b(view7, str);
                    Q3.setBackgroundColor(androidx.core.content.b.c(view7.getContext(), R.color.a4));
                }
                MixFeedService.k().a(F().f121272g, playListInfo.getMixId(), ((Aweme) this.f76353m).getGroupId(), ((Aweme) this.f76353m).getAuthorUid(), ab());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.n.a
    public final void E() {
        long j2;
        AwemeStatistics statistics;
        User author;
        String nickname;
        boolean z2;
        SpannableString spannableString;
        if (this.f76353m != null) {
            Y();
            I();
            Object obj = this.f76353m;
            h.f.b.l.b(obj, "");
            int i2 = 0;
            if (TextUtils.isEmpty(((Aweme) obj).getDesc()) || !as.b()) {
                TextView textView = this.x;
                if (textView == null) {
                    h.f.b.l.a("txtDesc");
                }
                textView.setText("");
                TextView textView2 = this.x;
                if (textView2 == null) {
                    h.f.b.l.a("txtDesc");
                }
                textView2.setVisibility(8);
            } else {
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView3 = this.x;
                if (textView3 == null) {
                    h.f.b.l.a("txtDesc");
                }
                textView3.setVisibility(0);
                Object obj2 = this.f76353m;
                h.f.b.l.b(obj2, "");
                List<TextExtraStruct> textExtra = ((Aweme) obj2).getTextExtra();
                Object obj3 = this.f76353m;
                h.f.b.l.b(obj3, "");
                String desc = ((Aweme) obj3).getDesc();
                this.f76353m = CommerceChallengeServiceImpl.e().a((Aweme) this.f76353m);
                if (!x.a() || U()) {
                    z2 = false;
                } else {
                    z2 = true;
                    TextView textView4 = this.x;
                    if (textView4 == null) {
                        h.f.b.l.a("txtDesc");
                    }
                    if (!(textView4 instanceof TuxTextView)) {
                        textView4 = null;
                    }
                    TuxTextView tuxTextView = (TuxTextView) textView4;
                    if (tuxTextView != null) {
                        View view = this.itemView;
                        h.f.b.l.b(view, "");
                        tuxTextView.setTextColor(view.getResources().getColor(R.color.c4));
                        tuxTextView.setTuxFont(41);
                    }
                }
                Object obj4 = this.f76353m;
                h.f.b.l.b(obj4, "");
                if (((Aweme) obj4).getSearchDesc() != null) {
                    if (z2) {
                        Object obj5 = this.f76353m;
                        h.f.b.l.b(obj5, "");
                        if (((Aweme) obj5).getHighlightInfoList() != null) {
                            com.ss.android.ugc.aweme.discover.helper.f fVar = this.C;
                            if (fVar == null) {
                                h.f.b.l.a("highlightHelper");
                            }
                            Object obj6 = this.f76353m;
                            h.f.b.l.b(obj6, "");
                            String searchDesc = ((Aweme) obj6).getSearchDesc();
                            h.f.b.l.b(searchDesc, "");
                            spannableString = fVar.a(searchDesc, "search_desc", 0);
                        }
                    }
                    Object obj7 = this.f76353m;
                    h.f.b.l.b(obj7, "");
                    spannableString = new SpannableString(((Aweme) obj7).getSearchDesc());
                } else {
                    Object obj8 = this.f76353m;
                    h.f.b.l.b(obj8, "");
                    spannableString = new SpannableString(((Aweme) obj8).getDesc());
                }
                TextView textView5 = this.x;
                if (textView5 == null) {
                    h.f.b.l.a("txtDesc");
                }
                textView5.setText(spannableString);
                ICommerceChallengeService e2 = CommerceChallengeServiceImpl.e();
                TextView textView6 = this.x;
                if (textView6 == null) {
                    h.f.b.l.a("txtDesc");
                }
                e2.a(textView6, (Aweme) this.f76353m, spannableString, "search_hashtag");
                Object obj9 = this.f76353m;
                h.f.b.l.b(obj9, "");
                ((Aweme) obj9).setTextExtra(textExtra);
                Object obj10 = this.f76353m;
                h.f.b.l.b(obj10, "");
                ((Aweme) obj10).setDesc(desc);
                int i3 = v.f80238a;
                if (i3 > 0) {
                    TextView textView7 = this.x;
                    if (textView7 == null) {
                        h.f.b.l.a("txtDesc");
                    }
                    textView7.setMaxLines(i3);
                }
            }
            Aweme aweme = (Aweme) this.f76353m;
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                TextView textView8 = this.A;
                if (textView8 == null) {
                    h.f.b.l.a("txtAuthorName");
                }
                if (in.m(author)) {
                    nickname = author.getUniqueId();
                } else {
                    nickname = author.getNickname();
                }
                textView8.setText(nickname);
                if (hl.a(author.getCustomVerify())) {
                    ImageView imageView = this.L;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                } else {
                    ImageView imageView2 = this.L;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                }
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(author.getAvatarThumb())).b(em.a(100)).a("AbsCellViewHolder");
                SmartCircleImageView smartCircleImageView = this.z;
                if (smartCircleImageView == null) {
                    h.f.b.l.a("authorAvatar");
                }
                a2.E = smartCircleImageView;
                a2.c();
            }
            TextView textView9 = this.y;
            if (textView9 == null) {
                h.f.b.l.a("txtLikeCount");
            }
            textView9.setVisibility(0);
            Aweme aweme2 = (Aweme) this.f76353m;
            if (aweme2 == null || (statistics = aweme2.getStatistics()) == null) {
                j2 = -1;
            } else {
                j2 = statistics.getDiggCount();
            }
            this.R = j2;
            Aweme aweme3 = (Aweme) this.f76353m;
            if (aweme3 != null) {
                i2 = aweme3.getUserDigg();
            }
            this.f81963g = i2;
            O();
            TagLayout tagLayout = this.B;
            if (tagLayout == null) {
                h.f.b.l.a("tagLayout");
            }
            tagLayout.setEventType(this.aa);
            if (((Aweme) this.f76353m).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.B;
                if (tagLayout2 == null) {
                    h.f.b.l.a("tagLayout");
                }
                tagLayout2.a((Aweme) this.f76353m, ((Aweme) this.f76353m).getVideoLabels(), new TagLayout.a(16));
            }
            Z();
            aa();
            W();
            V();
            if (ag.c()) {
                X();
            }
            Object obj11 = this.f76353m;
            h.f.b.l.b(obj11, "");
            c((Aweme) obj11);
        }
    }

    public final void a(com.ss.android.ugc.aweme.discover.b.g gVar) {
        if (gVar != null && com.ss.android.ugc.aweme.discover.b.h.b()) {
            this.ad = gVar;
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81970a;

        static {
            Covode.recordClassIndex(51013);
        }

        a(c cVar) {
            this.f81970a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int i2 = this.f81970a.s;
            if (num != null && num.intValue() == i2) {
                this.f81970a.y();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<ViewGroup.LayoutParams, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f81973a = new d();

        static {
            Covode.recordClassIndex(51017);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup.LayoutParams layoutParams) {
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            h.f.b.l.d(layoutParams2, "");
            if (!(layoutParams2 instanceof ConstraintLayout.a)) {
                layoutParams2 = null;
            }
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams2;
            if (aVar != null) {
                aVar.f2053j = R.id.fg_;
                aVar.bottomMargin = (int) by.a(5);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.search.ecom.video.a, List<? extends com.ss.android.ugc.aweme.search.ecom.a.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f81987a = new m();

        static {
            Covode.recordClassIndex(51026);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.search.ecom.a.a> invoke(com.ss.android.ugc.aweme.search.ecom.video.a aVar) {
            com.ss.android.ugc.aweme.search.ecom.video.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            List<com.ss.android.ugc.aweme.search.ecom.a.a> list = aVar2.f121113b;
            if (list == null || !(!list.isEmpty())) {
                return h.a.z.INSTANCE;
            }
            return list;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(Exception exc) {
        Aweme aweme = (Aweme) ((com.ss.android.ugc.aweme.common.a.a) this).f76353m;
        int i2 = 1;
        if (aweme != null && aweme.getUserDigg() == 1) {
            i2 = 0;
        }
        b(i2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g, com.ss.android.ugc.aweme.common.a.e
    public final void b(boolean z2) {
        super.b(z2);
        SmartImageView P2 = P();
        if (P2 != null) {
            P2.setAttached(z2);
            if (!z2) {
                com.ss.android.ugc.aweme.discover.b.d.b(P2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<ViewGroup.LayoutParams, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f81974a = new e();

        static {
            Covode.recordClassIndex(51018);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup.LayoutParams layoutParams) {
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            h.f.b.l.d(layoutParams2, "");
            if (!(layoutParams2 instanceof ConstraintLayout.a)) {
                layoutParams2 = null;
            }
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams2;
            if (aVar != null) {
                aVar.f2053j = R.id.fg7;
                aVar.bottomMargin = (int) by.a(10);
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(View view) {
        super(view);
        h.f.b.l.d(view, "");
        this.Z = com.ss.android.ugc.aweme.discover.a.w.a();
        this.s = -1;
        this.ag = h.i.a((h.f.a.a) new q(this));
        this.ah = h.i.a((h.f.a.a) C1915c.f81971a);
        this.ai = h.i.a((h.f.a.a) new n(this));
    }

    private final void b(int i2) {
        if (i2 == 1) {
            al.a(al.b() + 1);
            this.R++;
            this.f81963g = 1;
        } else if (i2 == 0) {
            al.a(Math.max(al.b() - 1, 0));
            this.R = Math.max(this.R - 1, 0L);
            this.f81963g = 0;
        }
        O();
        K();
    }

    public final void a(com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        SearchPlayerCore core;
        SearchPlayerCore core2;
        this.f81962f = aVar;
        if (aVar != null) {
            SearchVideoView J2 = J();
            if (!(J2 == null || (core2 = J2.getCore()) == null)) {
                core2.setContainerStatusProvider(aVar);
            }
            SearchVideoView J3 = J();
            if (J3 != null && (core = J3.getCore()) != null) {
                core.setVideoUiListener(R());
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f81979a = new i();

        static {
            Covode.recordClassIndex(51022);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.b(system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.b(system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            if (com.ss.android.ugc.aweme.discover.b.a.a()) {
                i2 = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i2 = R.raw.icon_speaker_2_ltr;
            }
            aVar2.f44749a = i2;
            aVar2.f44753e = Integer.valueOf((int) R.attr.aa);
            return z.f158842a;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81980a;

        static {
            Covode.recordClassIndex(51023);
        }

        j(c cVar) {
            this.f81980a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean z = true;
            int i2 = !com.ss.android.ugc.aweme.discover.b.a.a() ? 1 : 0;
            com.ss.android.ugc.aweme.discover.b.a.f80834a = i2;
            com.ss.android.ugc.aweme.bk.a.f68724a.f68725b.storeInt("key_search_auto_play_sound", i2);
            SearchPlayerCore a2 = com.ss.android.ugc.aweme.discover.b.d.a(this.f81980a);
            if (a2 != null) {
                if (!com.ss.android.ugc.aweme.discover.b.a.a() && !com.ss.android.ugc.aweme.utils.y.b((Aweme) ((com.ss.android.ugc.aweme.common.a.a) this.f81980a).f76353m)) {
                    z = false;
                }
                a2.setMute(z);
            }
            SearchPlayerCore a3 = com.ss.android.ugc.aweme.discover.b.d.a(this.f81980a);
            if (a3 != null) {
                a3.b();
            }
            this.f81980a.M();
            this.f81980a.L();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<AnchorCommonStruct, com.ss.android.ugc.aweme.search.ecom.video.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f81986a = new l();

        static {
            Covode.recordClassIndex(51025);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.search.ecom.video.a invoke(AnchorCommonStruct anchorCommonStruct) {
            JSONArray a2;
            List<com.ss.android.ugc.aweme.search.ecom.a.a> list;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (!(anchorCommonStruct2 == null || (a2 = du.a(anchorCommonStruct2.getExtra())) == null)) {
                ArrayList arrayList = new ArrayList();
                int length = a2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = a2.get(i2);
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    Object a3 = du.a((com.google.gson.f) com.ss.android.ugc.aweme.search.ecom.b.f121051a.getValue(), jSONObject != null ? jSONObject.optString("extra") : null, com.ss.android.ugc.aweme.search.ecom.a.a.class);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                com.ss.android.ugc.aweme.search.ecom.video.a aVar = new com.ss.android.ugc.aweme.search.ecom.video.a(anchorCommonStruct2.getIcon(), arrayList);
                if (aVar == null || (list = aVar.f121113b) == null || !(!list.isEmpty())) {
                    return null;
                }
                return aVar;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f81989a = new o();

        static {
            Covode.recordClassIndex(51029);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_playlist_fill;
            aVar2.f44753e = Integer.valueOf((int) R.attr.aa);
            Resources system = Resources.getSystem();
            h.f.b.l.b(system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.b(system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics()));
            if (ag.c()) {
                aVar2.f44754f = true;
            }
            return z.f158842a;
        }
    }

    private final SpannableStringBuilder a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(o.f81989a);
        View view = this.itemView;
        h.f.b.l.b(view, "");
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        com.bytedance.tux.f.a.c b2 = a2.b(context);
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        Context context2 = view2.getContext();
        h.f.b.l.b(context2, "");
        boolean a3 = com.bytedance.tux.h.i.a(context2);
        Resources system = Resources.getSystem();
        h.f.b.l.b(system, "");
        b2.a(a3, h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
        spannableStringBuilder.append((CharSequence) "0");
        spannableStringBuilder.setSpan(b2, 0, 1, 17);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private final void b(Aweme aweme) {
        int i2;
        h.l.h f2;
        List<com.ss.android.ugc.aweme.search.ecom.a.a> list;
        if (com.ss.android.ugc.aweme.search.ecom.video.c.a()) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                com.ss.android.ugc.aweme.search.ecom.a.a aVar = null;
                if ((!anchors.isEmpty()) && (f2 = h.l.k.f(h.a.n.t(anchors), l.f81986a)) != null) {
                    com.ss.android.ugc.aweme.search.ecom.video.a aVar2 = (com.ss.android.ugc.aweme.search.ecom.video.a) h.l.k.d(f2);
                    this.ae = aVar2;
                    if (!(aVar2 == null || (list = aVar2.f121113b) == null)) {
                        aVar = (com.ss.android.ugc.aweme.search.ecom.a.a) h.a.n.h((List) list);
                    }
                    this.af = aVar;
                    i2 = h.l.k.j(h.l.k.c(f2, m.f81987a));
                    aweme.setTotalProductAnchors(i2);
                }
            }
            i2 = 0;
            aweme.setTotalProductAnchors(i2);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f81978a;

        static {
            Covode.recordClassIndex(51021);
        }

        h(c cVar) {
            this.f81978a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f81978a.f81963g == 1) {
                this.f81978a.a(0);
                com.ss.android.ugc.aweme.metrics.y a2 = new com.ss.android.ugc.aweme.metrics.y("like_cancel").a(this.f81978a.F().f121272g);
                a2.Z = this.f81978a.F().f121269d;
                com.ss.android.ugc.aweme.metrics.h l2 = a2.l(this.f81978a.F().f121274i);
                Aweme aweme = (Aweme) this.f81978a.f76353m;
                h.f.b.l.b(aweme, "");
                com.ss.android.ugc.aweme.metrics.y yVar = (com.ss.android.ugc.aweme.metrics.y) l2.f(aweme.getAid());
                yVar.Y = this.f81978a.F().f121271f;
                yVar.aa = "0";
                yVar.g((Aweme) this.f81978a.f76353m).f();
                return;
            }
            this.f81978a.a(1);
            com.ss.android.ugc.aweme.metrics.y a3 = new com.ss.android.ugc.aweme.metrics.y().a(this.f81978a.F().f121272g);
            a3.Z = this.f81978a.F().f121269d;
            com.ss.android.ugc.aweme.metrics.h l3 = a3.l(this.f81978a.F().f121274i);
            Aweme aweme2 = (Aweme) this.f81978a.f76353m;
            h.f.b.l.b(aweme2, "");
            com.ss.android.ugc.aweme.metrics.y yVar2 = (com.ss.android.ugc.aweme.metrics.y) l3.f(aweme2.getAid());
            yVar2.Y = this.f81978a.F().f121271f;
            yVar2.aa = "0";
            yVar2.g((Aweme) this.f81978a.f76353m).f();
        }
    }

    private final void a(SearchVideoView searchVideoView) {
        hashCode();
        if (searchVideoView != null) {
            Integer.valueOf(searchVideoView.hashCode());
            searchVideoView.setEnableLifecycleObserver(true);
            searchVideoView.setEnableHideCoverAnim(true);
            searchVideoView.setMCoverView(this.n);
            com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f81962f;
            if (aVar != null) {
                SearchPlayerCore core = searchVideoView.getCore();
                if (core != null) {
                    core.setContainerStatusProvider(aVar);
                }
                SearchPlayerCore core2 = searchVideoView.getCore();
                if (core2 != null) {
                    core2.setVideoUiListener(R());
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                searchVideoView.setOutlineProvider(new gp((int) by.a(2)));
                searchVideoView.setClipToOutline(true);
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider = searchVideoView.getDataProvider();
            if (dataProvider != null) {
                dataProvider.f67587m = new g(this, searchVideoView);
            }
            com.ss.android.ugc.aweme.discover.mixfeed.cs.a aVar2 = this.f81966j;
            if (aVar2 != null) {
                aVar2.a(this.n, searchVideoView);
            }
        }
    }

    private final void c(Aweme aweme) {
        com.ss.android.ugc.aweme.search.ecom.a.a aVar;
        String str;
        Fragment g2;
        VideoAnchorView videoAnchorView = this.f81958b;
        if (videoAnchorView != null) {
            com.bytedance.android.livesdk.utils.p.a(videoAnchorView);
        }
        if (com.ss.android.ugc.aweme.search.ecom.video.c.a() && !com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && (aVar = this.af) != null) {
            Integer num = null;
            if (hk.a(aVar.f121033a) && (str = aVar.f121033a) != null) {
                TuxTextView tuxTextView = this.M;
                if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
                    VideoAnchorView videoAnchorView2 = this.f81958b;
                    if (videoAnchorView2 != null && videoAnchorView2.a(aweme, this.ae)) {
                        TextView textView = this.D;
                        if (textView != null) {
                            ix.a(textView, e.f81974a);
                        }
                        View view = this.I;
                        if (view != null) {
                            ix.a(view, Integer.valueOf((int) by.a(80)));
                        }
                        com.ss.android.ugc.aweme.flowfeed.a.a aVar2 = this.f81962f;
                        if (!(aVar2 == null || (g2 = aVar2.g()) == null)) {
                            num = Integer.valueOf(g2.hashCode());
                        }
                        String aid = aweme.getAid();
                        h.f.b.l.b(aid, "");
                        if (!com.ss.android.ugc.aweme.search.ecom.video.b.a(num, aid, str)) {
                            Map<String, String> a2 = com.ss.android.ugc.aweme.search.ecom.b.c.a(aweme, this.af, this.t);
                            aweme.getAid();
                            new com.ss.android.ugc.aweme.search.ecom.b.e().b(a2).f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                ix.a(this.D, d.f81973a);
            }
        }
    }

    private final void a(Aweme aweme) {
        IAdSceneService f2;
        ViewGroup viewGroup = this.f81959c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f81960d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        AwemeRawAd awemeRawAd = null;
        this.u = null;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && (f2 = AdSceneServiceImpl.f()) != null) {
            this.u = f2.d();
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c cVar = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c();
            TextView textView = this.D;
            if (textView != null) {
                textView.setVisibility(8);
            }
            cVar.f34651b = new f(this);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            cVar.f34654a = awemeRawAd;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = this.u;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }
    }

    private final void a(PlayListInfo playListInfo) {
        int i2;
        long j2;
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View Q2 = Q();
        if (Q2 != null) {
            Q2.setVisibility(0);
        }
        TuxTextView tuxTextView = this.W;
        if (tuxTextView != null) {
            Context context = this.f81957a;
            Long updateTime = playListInfo.getUpdateTime();
            if (updateTime != null) {
                j2 = updateTime.longValue();
            } else {
                j2 = 0;
            }
            tuxTextView.setText(ib.e(context, j2 * 1000));
        }
        TuxTextView tuxTextView2 = this.W;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(72);
        }
        String a2 = com.a.a(this.f81957a.getText(R.string.fiw).toString(), Arrays.copyOf(new Object[]{playListInfo.getItemTotal()}, 1));
        h.f.b.l.b(a2, "");
        TuxTextView tuxTextView3 = this.V;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(a((CharSequence) a2));
        }
        TuxTextView tuxTextView4 = this.V;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(52);
        }
        a.C0730a aVar = new a.C0730a();
        String mixName = playListInfo.getMixName();
        if (mixName == null) {
            mixName = "";
        }
        com.bytedance.tux.f.d dVar = new com.bytedance.tux.f.d(aVar.b(mixName).f33382a);
        dVar.a(42);
        TextView textView2 = this.x;
        if (textView2 == null) {
            h.f.b.l.a("txtDesc");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) dVar);
        View view = this.itemView;
        h.f.b.l.b(view, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.bx));
        String mixName2 = playListInfo.getMixName();
        if (mixName2 != null) {
            i2 = mixName2.length();
        } else {
            i2 = 0;
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, i2, 33);
        textView2.setText(spannableStringBuilder);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
        // Method dump skipped, instructions count: 777
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.n.c.onClick(android.view.View):void");
    }

    public final void a(int i2) {
        String str;
        Long l2;
        AwemeStatistics statistics;
        TextView textView = this.y;
        if (textView == null) {
            h.f.b.l.a("txtLikeCount");
        }
        Context context = textView.getContext();
        h.f.b.l.b(context, "");
        if (fe.a(context)) {
            b(i2);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                Aweme aweme = (Aweme) this.f76353m;
                if (!(aweme == null || (statistics = aweme.getStatistics()) == null)) {
                    statistics.setDiggCount(this.R);
                }
                Aweme aweme2 = (Aweme) this.f76353m;
                if (aweme2 != null) {
                    aweme2.setUserDigg(this.f81963g);
                    return;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            Object obj = this.f76353m;
            h.f.b.l.b(obj, "");
            String aid = ((Aweme) obj).getAid();
            h.f.b.l.b(aid, "");
            hashMap.put("aweme_id", aid);
            hashMap.put(StringSet.type, String.valueOf(i2));
            hashMap.put("channel_id", String.valueOf(com.ss.android.ugc.aweme.app.c.c.a("search_result")));
            Long l3 = null;
            if (this.f76353m == null || !((Aweme) this.f76353m).isAd()) {
                com.ss.android.ugc.aweme.feed.x.d.a("search_result", null, hashMap);
            } else {
                Context context2 = this.f81957a;
                h.f.b.l.b(context2, "");
                AwemeRawAd awemeRawAd = ((Aweme) this.f76353m).getAwemeRawAd();
                if (awemeRawAd != null) {
                    str = awemeRawAd.getLogExtra();
                } else {
                    str = null;
                }
                AwemeRawAd awemeRawAd2 = ((Aweme) this.f76353m).getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l2 = awemeRawAd2.getAdId();
                } else {
                    l2 = null;
                }
                String valueOf = String.valueOf(l2);
                AwemeRawAd awemeRawAd3 = ((Aweme) this.f76353m).getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    l3 = awemeRawAd3.getCreativeId();
                }
                com.ss.android.ugc.aweme.feed.x.d.a(context2, str, valueOf, String.valueOf(l3), hashMap);
            }
            com.ss.android.ugc.aweme.feed.u.ac acVar = this.Q;
            if (acVar == null) {
                h.f.b.l.b();
            }
            acVar.a(hashMap);
        }
    }

    public final void a(Aweme aweme, int i2, boolean z2) {
        a(aweme, i2, i2, z2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(View view, String str, com.ss.android.ugc.aweme.search.d.c cVar) {
        this(view, str, cVar, null);
        h.f.b.l.d(view, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(final View view, String str, com.ss.android.ugc.aweme.search.d.c cVar, ClickSearchViewModel clickSearchViewModel) {
        this(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        h.f.b.l.d(view, "");
        MethodCollector.i(2305);
        View findViewById = view.findViewById(R.id.ak7);
        h.f.b.l.b(findViewById, "");
        this.x = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.c_s);
        h.f.b.l.b(findViewById2, "");
        this.y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.nu);
        h.f.b.l.b(findViewById3, "");
        this.z = (SmartCircleImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.nw);
        h.f.b.l.b(findViewById4, "");
        this.A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ehz);
        h.f.b.l.b(findViewById5, "");
        this.B = (TagLayout) findViewById5;
        this.D = (TextView) view.findViewById(R.id.fgc);
        this.E = (LinearLayout) view.findViewById(R.id.cef);
        this.F = (ViewStub) view.findViewById(R.id.dio);
        this.G = (ViewStub) view.findViewById(R.id.fg8);
        this.J = (ViewStub) view.findViewById(R.id.fge);
        this.K = (TextView) view.findViewById(R.id.fgb);
        this.L = (ImageView) view.findViewById(R.id.fg9);
        this.n = (SmartImageView) view.findViewById(R.id.agf);
        this.f81959c = (ViewGroup) view.findViewById(R.id.dty);
        this.f81960d = (ViewGroup) view.findViewById(R.id.du3);
        this.M = (TuxTextView) view.findViewById(R.id.fg_);
        this.N = view.findViewById(R.id.d6c);
        this.I = view.findViewById(R.id.fgd);
        this.O = (TuxIconView) view.findViewById(R.id.e7g);
        this.P = (FrameLayout) view.findViewById(R.id.e7h);
        this.S = (LinearLayout) view.findViewById(R.id.ake);
        this.T = (ConstraintLayout) view.findViewById(R.id.nv);
        this.f81958b = (VideoAnchorView) view.findViewById(R.id.fg7);
        this.H = (ViewStub) view.findViewById(R.id.fga);
        Fragment fragment = null;
        if (com.ss.android.ugc.aweme.discover.b.h.c() && com.ss.android.ugc.aweme.discover.b.j.b() && J() == null && (viewStub = this.J) != null && viewStub.getParent() != null && (viewStub2 = this.J) != null) {
            viewStub2.setLayoutResource(R.layout.ax0);
            View inflate = viewStub2.inflate();
            this.f81965i = (SearchVideoView) (!(inflate instanceof SearchVideoView) ? null : inflate);
            a(J());
        }
        TextView textView = this.x;
        if (textView == null) {
            h.f.b.l.a("txtDesc");
        }
        textView.setOnClickListener(this);
        SmartCircleImageView smartCircleImageView = this.z;
        if (smartCircleImageView == null) {
            h.f.b.l.a("authorAvatar");
        }
        smartCircleImageView.setOnClickListener(this);
        TextView textView2 = this.A;
        if (textView2 == null) {
            h.f.b.l.a("txtAuthorName");
        }
        textView2.setOnClickListener(this);
        VideoAnchorView videoAnchorView = this.f81958b;
        if (videoAnchorView != null) {
            videoAnchorView.setOnClickListener(this);
        }
        view.setOnClickListener(this);
        if (((Number) af.f80141a.getValue()).intValue() == 1) {
            TextView textView3 = this.y;
            if (textView3 == null) {
                h.f.b.l.a("txtLikeCount");
            }
            textView3.setOnClickListener(new h(this));
        }
        TuxIconView tuxIconView = this.O;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(com.bytedance.tux.c.c.a(i.f81979a));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new j(this));
        }
        if (!at.a()) {
            LinearLayout linearLayout = this.S;
            if (linearLayout != null) {
                Resources system = Resources.getSystem();
                h.f.b.l.b(system, "");
                int a2 = h.g.a.a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                h.f.b.l.b(system2, "");
                linearLayout.setPadding(a2, 0, h.g.a.a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics())), 0);
            }
            LinearLayout linearLayout2 = this.S;
            if (linearLayout2 != null) {
                Resources system3 = Resources.getSystem();
                h.f.b.l.b(system3, "");
                com.bytedance.android.livesdk.utils.p.a(linearLayout2, h.g.a.a(TypedValue.applyDimension(1, 10.0f, system3.getDisplayMetrics())));
            }
            TextView textView4 = this.x;
            if (textView4 == null) {
                h.f.b.l.a("txtDesc");
            } else {
                Resources system4 = Resources.getSystem();
                h.f.b.l.b(system4, "");
                com.bytedance.tux.h.i.b(textView4, 0, 0, 0, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics()))), false, 16);
            }
            ConstraintLayout constraintLayout = this.T;
            if (constraintLayout != null) {
                Resources system5 = Resources.getSystem();
                h.f.b.l.b(system5, "");
                com.bytedance.android.livesdk.utils.p.b(constraintLayout, h.g.a.a(TypedValue.applyDimension(1, 10.0f, system5.getDisplayMetrics())));
            }
            ImageView imageView = this.L;
            if (imageView != null) {
                Resources system6 = Resources.getSystem();
                h.f.b.l.b(system6, "");
                com.bytedance.tux.h.i.b(imageView, 0, 0, 0, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 5.0f, system6.getDisplayMetrics()))), false, 16);
            }
            SmartCircleImageView smartCircleImageView2 = this.z;
            if (smartCircleImageView2 == null) {
                h.f.b.l.a("authorAvatar");
            }
            ViewGroup.LayoutParams layoutParams = smartCircleImageView2.getLayoutParams();
            Resources system7 = Resources.getSystem();
            h.f.b.l.b(system7, "");
            layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system7.getDisplayMetrics()));
            Resources system8 = Resources.getSystem();
            h.f.b.l.b(system8, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system8.getDisplayMetrics()));
            SmartCircleImageView smartCircleImageView3 = this.z;
            if (smartCircleImageView3 == null) {
                h.f.b.l.a("authorAvatar");
            } else {
                smartCircleImageView3.setLayoutParams(layoutParams);
            }
        }
        this.aa = str;
        this.ac = cVar;
        K();
        this.C = new com.ss.android.ugc.aweme.discover.helper.f(new f.c(this) {
            /* class com.ss.android.ugc.aweme.discover.n.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f81967a;

            static {
                Covode.recordClassIndex(51011);
            }

            @Override // com.ss.android.ugc.aweme.discover.helper.f.c
            public final List<com.ss.android.ugc.aweme.search.d> a() {
                Aweme aweme = (Aweme) this.f81967a.f76353m;
                if (aweme != null) {
                    return aweme.getHighlightInfoList();
                }
                return null;
            }

            {
                this.f81967a = r1;
            }

            @Override // com.ss.android.ugc.aweme.discover.helper.f.c
            public final List<Object> a(String str, String str2, Position position) {
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                h.f.b.l.d(position, "");
                if (str2.hashCode() != -539714872 || !str2.equals("search_desc")) {
                    return null;
                }
                return h.a.n.d(new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.bx)), new com.ss.android.ugc.aweme.discover.m.a(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)));
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.discover.n.c.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f81969a;

            static {
                Covode.recordClassIndex(51012);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f81969a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                String aid;
                String str = "";
                h.f.b.l.d(view, str);
                c cVar = this.f81969a;
                com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a aVar = cVar.u;
                if (aVar != null) {
                    aVar.a();
                }
                cVar.q = true;
                com.ss.android.ugc.aweme.autoplay.e.a.a(cVar);
                ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
                Aweme aweme = (Aweme) ((com.ss.android.ugc.aweme.common.a.a) cVar).f76353m;
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                concurrentHashMap.put(str, new WeakReference<>(cVar.F()));
            }

            public final void onViewDetachedFromWindow(View view) {
                String aid;
                String str = "";
                h.f.b.l.d(view, str);
                c cVar = this.f81969a;
                cVar.q = false;
                cVar.r = false;
                com.ss.android.ugc.aweme.autoplay.e.a.b(cVar);
                ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
                Aweme aweme = (Aweme) ((com.ss.android.ugc.aweme.common.a.a) cVar).f76353m;
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                concurrentHashMap.remove(str);
                cVar.y();
            }
        });
        TextView textView5 = this.A;
        if (textView5 == null) {
            h.f.b.l.a("txtAuthorName");
        }
        textView5.setTextDirection(5);
        ViewStub viewStub3 = this.F;
        if (!(clickSearchViewModel == null || viewStub3 == null)) {
            a aVar = new a(this);
            h.f.b.l.d(aVar, "");
            NextLiveData<Integer> c2 = clickSearchViewModel.c();
            WeakReference<Fragment> weakReference = clickSearchViewModel.f81683a;
            ef.a(c2, weakReference != null ? weakReference.get() : fragment, aVar);
            this.Y = clickSearchViewModel;
            com.ss.android.ugc.aweme.discover.mixfeed.cs.a aVar2 = new com.ss.android.ugc.aweme.discover.mixfeed.cs.a(clickSearchViewModel, this, viewStub3);
            aVar2.a(this.n);
            this.f81966j = aVar2;
        }
        com.ss.android.ugc.aweme.feed.u.ac acVar = new com.ss.android.ugc.aweme.feed.u.ac();
        this.Q = acVar;
        acVar.a(new aa());
        com.ss.android.ugc.aweme.feed.u.ac acVar2 = this.Q;
        if (acVar2 != null) {
            acVar2.a_(this);
            MethodCollector.o(2305);
            return;
        }
        MethodCollector.o(2305);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            super.a(r4, r5)
            if (r4 != 0) goto L_0x0006
            return
        L_0x0006:
            r3.a(r4)
            r0 = 1
            r3.r = r0
            r3.f76353m = r4
            r3.ab = r7
            r3.s = r6
            java.lang.Object r1 = r3.f76353m
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            r3.b(r1)
            com.ss.android.ugc.aweme.search.k.r r2 = r3.F()
            h.f.a.b r0 = r3.S()
            r2.a(r0)
            h.f.a.b r1 = r3.S()
            java.lang.Object r0 = r3.f76353m
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.b(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.n
            a(r0)
            boolean r0 = r3.ab
            if (r0 == 0) goto L_0x0044
            r3.E()
        L_0x0044:
            r3.K()
            com.ss.android.ugc.aweme.discover.mixfeed.cs.a r0 = r3.f81966j
            if (r0 == 0) goto L_0x004e
            r0.c()
        L_0x004e:
            r3.N()
            r0 = 0
            r3.v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.n.c.a(com.ss.android.ugc.aweme.feed.model.Aweme, int, int, boolean):void");
    }
}

package com.ss.android.ugc.aweme.commercialize.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.ies.ugc.aweme.rich.ui.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.c.p;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.a.b;
import com.ss.android.ugc.aweme.ad.feed.card.a;
import com.ss.android.ugc.aweme.ad.feed.e;
import com.ss.android.ugc.aweme.ad.feed.mask.g;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bullet.module.ad.k;
import com.ss.android.ugc.aweme.commerce.a.j;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.commercialize.ad.AdRatingView;
import com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup;
import com.ss.android.ugc.aweme.commercialize.ad.DescTextView;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.o;
import com.ss.android.ugc.aweme.commercialize.feed.c;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.ss.android.ugc.aweme.commercialize.log.ah;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.commercialize.o.b;
import com.ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.utils.ad;
import com.ss.android.ugc.aweme.commercialize.utils.al;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.ss.android.ugc.aweme.commercialize.views.cards.af;
import com.ss.android.ugc.aweme.commercialize.views.cards.e;
import com.ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.a;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.z;
import com.ss.android.ugc.aweme.experiment.cp;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ae;
import com.ss.android.ugc.aweme.feed.adapter.am;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.report.f;
import com.ss.android.ugc.aweme.shortvideo.util.bu;
import com.ss.android.ugc.aweme.sticker.k.d;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class h extends com.ss.android.ugc.aweme.commercialize.a.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, bd {
    private static final int aO = R.id.ee;

    /* renamed from: c  reason: collision with root package name */
    public static final String f74208c = h.class.getSimpleName();
    View A;
    TextView B;
    LinearLayout C;
    AdTagGroup D;
    DescTextView E;
    RemoteImageView F;
    RemoteImageView G;
    RemoteImageView H;
    TextView I;
    TextView J;
    LinearLayout K;
    TextView L;
    TextView M;
    CommerceTagLayout N;
    DouPlusTagLayout O;
    AnimationImageView P;
    CommerceMicroTagLayout Q;
    ViewGroup R;
    RemoteImageView S;
    TextView T;
    LinearLayout U;
    TextView V;
    public com.ss.android.ugc.aweme.ad.feed.card.a W;
    e X;
    public RelativeLayout Y;
    AbsAdPlayFunWidget Z;

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f74209a;
    private com.ss.android.ugc.aweme.ad.feed.mask.h aA;
    private e aB;
    private FrameLayout aC;
    private View aD;
    private View aE;
    private View aF;
    private View aG;
    private FrameLayout aH;
    private TagLayout aI;
    private MicroAppVideoCardView aJ;
    private com.ss.android.ugc.aweme.ad.feed.e.b aK;
    private com.ss.android.ugc.aweme.commercialize.egg.e.a aL;
    private com.ss.android.ugc.aweme.commercialize.feed.b.a aM;
    private ICommerceEggService aN;
    private com.ss.android.ugc.aweme.arch.widgets.base.e aP;
    private com.ss.android.ugc.aweme.commercialize.utils.c.b aQ = new com.ss.android.ugc.aweme.commercialize.utils.c.b();
    private com.ss.android.ugc.aweme.commercialize.utils.c.b aR;
    private ITcmService aS;
    private com.ss.android.ugc.aweme.tcm.api.service.b aT;
    private s<ag> aU;
    private JSONObject aV;
    private final b aW = new b(this, (byte) 0);
    private c aX = null;
    private com.ss.android.ugc.aweme.commercialize.feed.a.a aY;
    private String aZ;
    boolean aa;
    public final VideoBaseCell ab;
    public DataCenter ac;
    String ad;
    public Context ae;
    public IAdSceneService af;
    public Fragment ag;
    public boolean ah = false;
    public boolean ai = false;
    public boolean aj = false;
    public boolean ak = false;
    public boolean al = false;
    boolean am = false;
    com.ss.android.ugc.aweme.ad.feed.g.b an;
    public com.ss.android.ugc.aweme.ad.feed.a.b ao;
    public com.ss.android.ugc.aweme.commercialize.j.b ap = new com.ss.android.ugc.aweme.commercialize.j.b() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass11 */

        static {
            Covode.recordClassIndex(45803);
        }
    };
    private int aq = 4;
    private a ar;
    private boolean as;
    private int at;
    private View au;
    private LinearLayout av;
    private RichTagView aw;
    private TuxTextView ax;
    private TuxTextView ay;
    private com.ss.android.ugc.aweme.ad.feed.survey.c az;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74210b;
    private String ba;
    private String bb;
    private g bc;
    private boolean bd = false;
    private boolean be = true;
    private boolean bf = false;
    private IFeedAdService bg = FeedAdServiceImpl.c();
    private IAdCardService bh = AdCardServiceImpl.c();
    private ICommercializeAdService bi = CommercializeAdServiceImpl.a();
    private long bj;
    private g bk;
    private FeedAdViewModel bl;
    private VideoPlayViewModel bm;
    private com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> bn;
    private com.ss.android.ugc.aweme.ad.feed.b bo = new com.ss.android.ugc.aweme.ad.feed.b() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(45801);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final void d() {
            h.this.W.d();
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final boolean e() {
            return h.this.W.f65793g;
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final String a() {
            return h.this.W.f();
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final void b() {
            h.this.W.a(0, true);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final long f() {
            return h.this.L().longValue();
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.b
        public final void c() {
            com.ss.android.ugc.aweme.ad.feed.card.a aVar = h.this.W;
            if (!aVar.f65793g) {
                aVar.f65794h = true;
                DataCenter dataCenter = aVar.f65790d;
                if (dataCenter != null) {
                    dataCenter.a("ad_feed_card_show_state", (Object) true);
                }
                DataCenter dataCenter2 = aVar.f65790d;
                if (dataCenter2 != null) {
                    dataCenter2.a("AD_ACTION_MOVE_OUT_DESC", (Object) true);
                }
                aVar.f65791e.postDelayed(new a.e(aVar), 200);
            }
        }
    };
    private ArrayList<String> bp = new ArrayList<>();
    private Boolean bq = null;
    private af br;

    /* renamed from: d  reason: collision with root package name */
    CircleWaveLayout f74211d;

    /* renamed from: e  reason: collision with root package name */
    ButtonAdBottomLabelView f74212e;

    /* renamed from: f  reason: collision with root package name */
    AdHalfWebPageContainer f74213f;

    /* renamed from: g  reason: collision with root package name */
    AdHalfWebPageMaskLayer f74214g;

    /* renamed from: h  reason: collision with root package name */
    ViewStub f74215h;

    /* renamed from: i  reason: collision with root package name */
    ViewStub f74216i;

    /* renamed from: j  reason: collision with root package name */
    ViewStub f74217j;

    /* renamed from: k  reason: collision with root package name */
    ViewStub f74218k;

    /* renamed from: l  reason: collision with root package name */
    ViewStub f74219l;

    /* renamed from: m  reason: collision with root package name */
    ViewStub f74220m;
    public int n;
    public Aweme o;
    public View p;
    int q = 4;
    RemoteImageView r;
    FrameLayout s;
    LinearLayout t;
    TextView u;
    View v;
    LinearLayout w;
    FrameLayout x;
    TextView y;
    AdRatingView z;

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final com.ss.android.ugc.aweme.ad.feed.a.b N() {
        return this.ao;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final int R() {
        return this.aq;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final com.ss.android.ugc.aweme.ad.feed.survey.c b() {
        return this.az;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final com.ss.android.ugc.aweme.commercialize.j.b j() {
        return this.ap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final af o() {
        return this.br;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(Aweme aweme) {
        if (aweme != null) {
            aweme.setActivityId(this.aZ);
            aweme.setNewSourceType(this.ba);
            aweme.setNewSourceId(this.bb);
            this.o = aweme;
            String str = this.ad;
            if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
                aweme.getAwemeRawAd().setPageFrom(str);
            }
            am();
            if (c() != null) {
                com.ss.android.ugc.aweme.commerce.a.a d2 = com.ss.android.ugc.aweme.commerce.a.a.d();
                Aweme aweme2 = this.o;
                Context context = this.ae;
                String ah2 = ah();
                if (aweme2 != null && bs.c(aweme2) && aweme2.getAwemeRawAd().getOmVast().isEnableContentUrl) {
                    d2.f73302b.put(j.d(aweme2), ah2);
                }
                d2.a(aweme2, context);
            }
            l.d(this.o, "");
            this.W.a(this.o);
            com.ss.android.ugc.aweme.ad.feed.survey.c cVar = this.az;
            if (cVar != null) {
                cVar.a(this.o, this.at);
            }
            com.ss.android.ugc.aweme.ad.feed.mask.h hVar = this.aA;
            if (hVar != null) {
                hVar.a(this.o);
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aI(this.o)) {
                    this.aA.a();
                }
            }
            e eVar = this.X;
            if (eVar != null) {
                eVar.a(this.o);
                this.X.a();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.R(this.o) == null || com.ss.android.ugc.aweme.commercialize.e.a.b.R(this.o).getShowSeconds() != 0) {
                    this.X.b();
                } else {
                    com.ss.android.ugc.aweme.feed.helper.c cVar2 = new com.ss.android.ugc.aweme.feed.helper.c();
                    Context context2 = this.ae;
                    Video video = this.o.getVideo();
                    this.o.getOcrLocation();
                    d.a a2 = cVar2.a(context2, video);
                    ao aoVar = new ao(a2.f134941a, a2.f134942b);
                    this.ac.a("ad_feed_bind_texture_size", aoVar);
                    this.bl.a(aoVar);
                    this.X.a((long) com.ss.android.ugc.aweme.ad.feed.sticker.b.a());
                }
            }
            com.ss.android.ugc.aweme.ad.feed.g.b bVar = this.an;
            if (bVar != null) {
                bVar.a(aweme);
            }
            e eVar2 = this.aB;
            if (eVar2 != null) {
                eVar2.a(this.o);
                this.aB.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(DataCenter dataCenter) {
        this.ac = dataCenter;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.e eVar) {
        this.aP = eVar;
        if (eVar != null) {
            eVar.a((View) null, new AdLightWebPageWidget());
            if (!com.ss.android.ugc.aweme.commercialize.feed.assem.b.f74088a) {
                this.aP.a((View) null, new AdPopUpWebPageWidget(this.bl));
            }
            this.aP.a((View) null, new CommonWebPageWidget());
            this.aP.a((View) null, new AdProfilePopUpWebPageWidget());
            Widget b2 = CommercializeAdServiceImpl.a().b(this.ae, new com.ss.android.ugc.aweme.commercialize.playfun.h());
            if (b2 instanceof AbsAdPlayFunWidget) {
                this.Z = (AbsAdPlayFunWidget) b2;
            }
            this.aP.b(R.id.g0, this.Z);
            if (this.bi != null && !o.f74116a) {
                this.aP.b(R.id.ey, this.bi.b(this.ae, new com.ss.android.ugc.aweme.ad.feed.interactive.b()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(boolean z2) {
        DataCenter dataCenter = this.ac;
        if (dataCenter != null) {
            if (z2) {
                dataCenter.a("on_ad_pop_up_web_page_show", (Object) null);
            } else {
                dataCenter.a("on_ad_pop_up_web_page_hide", (Object) null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final boolean a(i iVar) {
        CardStruct b2;
        String cardUrl;
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o) || ((TextUtils.isEmpty(this.o.getAwemeRawAd().getWebUrl()) && !com.ss.android.ugc.aweme.commercialize.e.a.b.x(this.o)) || ((TextUtils.isEmpty(this.o.getAwemeRawAd().getWebUrl()) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aE(this.o)) || !this.bp.isEmpty() || this.aB.c()))) {
            return false;
        }
        Aweme aweme = this.o;
        if (com.ss.android.ugc.aweme.commercialize.utils.i.c(aweme) || com.ss.android.ugc.aweme.commercialize.utils.i.d(aweme)) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f74213f;
            Aweme aweme2 = this.o;
            if (adHalfWebPageContainer != null && com.ss.android.ugc.aweme.base.utils.o.b(adHalfWebPageContainer) && ((com.ss.android.ugc.aweme.commercialize.utils.i.c(aweme2) && com.ss.android.ugc.aweme.commercialize.utils.i.e(aweme2) == 0) || com.ss.android.ugc.aweme.commercialize.utils.i.d(aweme2))) {
                return false;
            }
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aI(this.o)) {
                Aweme aweme3 = this.o;
                CardStruct b3 = com.ss.android.ugc.aweme.commercialize.utils.i.b(aweme3);
                if (b3 == null || b3.getCardType() != 1 || (b2 = com.ss.android.ugc.aweme.commercialize.utils.i.b(aweme3)) == null || (cardUrl = b2.getCardUrl()) == null || cardUrl.length() <= 0) {
                    return f();
                }
                return c(iVar);
            } else if (ab()) {
                return true;
            } else {
                return f();
            }
        } else {
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = aa();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                return f();
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aI(this.o)) {
                if (ab()) {
                    return true;
                }
                return f();
            } else if (TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.e.a.b.a(this.o))) {
                return f();
            } else {
                if (!com.ss.android.newmedia.d.a(com.ss.android.ugc.aweme.commercialize.e.a.b.a(this.o))) {
                    return f();
                }
                if (ad.a(this.o)) {
                    return c(iVar);
                }
                return f();
            }
        }
    }

    public final void a(boolean z2, final boolean z3) {
        g gVar;
        g gVar2;
        if (!b.a.a(this.o) || this.ah || this.ai) {
            if (!ae() || (gVar2 = this.bc) == null) {
                if (this.t.getVisibility() == 8 && !ad()) {
                    return;
                }
            } else if (!gVar2.b() && !ad()) {
                return;
            }
            j(false);
            this.ab.b(false);
            this.f74213f.setInCleanMode(false);
            this.W.a(false);
            com.ss.android.ugc.aweme.feed.helper.h.a().f93341d = false;
            this.ah = false;
            this.ai = false;
            if (ad()) {
                k(z2);
                return;
            }
            if (!ae() || (gVar = this.bc) == null) {
                b(z2, z3);
            } else {
                gVar.a(z2, new com.ss.android.ugc.aweme.ad.feed.mask.a.b() {
                    /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(45802);
                    }

                    @Override // com.ss.android.ugc.aweme.ad.feed.mask.a.b
                    public final boolean b() {
                        if (!(h.this.ae instanceof MainActivity) || !com.ss.android.ugc.aweme.main.c.a().f109217a) {
                            return false;
                        }
                        h.this.Y.setVisibility(4);
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.ad.feed.mask.a.b
                    public final void a() {
                        h.this.I();
                        if (h.this.af != null && z3) {
                            h.this.af.c().a(h.this.o, h.this.ae, 2, h.this.n + 1);
                        }
                    }
                });
            }
            this.ac.a("ON_AD_COMMON_MASK_HIDE", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(Integer num) {
        int c2 = com.ss.android.ugc.aweme.ad.feed.g.c();
        if (c2 >= 0) {
            this.W.a(num.intValue(), c2, 1);
            this.ac.a("SET_HALF_WEB_PAGE_REAL_SHOW", new com.ss.android.ugc.aweme.commercialize.model.g(num.intValue(), c2, 1));
        } else if (c2 != -100) {
            this.W.a(num.intValue(), num.intValue(), 0);
            this.ac.a("SET_HALF_WEB_PAGE_REAL_SHOW", new com.ss.android.ugc.aweme.commercialize.model.g(num.intValue(), num.intValue(), 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(i iVar, boolean z2) {
        if (this.aj) {
            this.aj = false;
            al.a(iVar, this.s, aO, z2);
            this.ac.a("ON_AD_FORM_MASK_HIDE", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(JSONObject jSONObject) {
        this.aV = jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        this.aZ = bVar.getActivityId();
        this.ba = bVar.getNewSourceType();
        this.bb = bVar.getNewSourceId();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(com.ss.android.ugc.aweme.commercialize.event.g gVar) {
        this.ac.a("ad_on_receive_js_bridge_event", gVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(String str) {
        this.ac.a("AD_ON_PROFILE_WEB_PAGE_SHOW", str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(com.ss.android.ugc.aweme.commercialize.event.b bVar) {
        this.ac.a("ON_RECEIVE_AD_WEB_PAGE_EVENT", bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(p pVar) {
        com.ss.android.ugc.aweme.commercialize.utils.c.b bVar = this.aR;
        if (bVar != null) {
            bVar.a();
        } else {
            this.aR = new com.ss.android.ugc.aweme.commercialize.utils.c.b();
        }
        this.aR.a(100);
        JSONArray jSONArray = pVar.f65605a;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.aR.a(new b.a().a(this.bj).a(jSONArray.optInt(i2)).a(new an(this, pVar)).a(true).a());
        }
        a(this.aR);
        this.aR.b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(k kVar) {
        if (kVar.f69377a) {
            this.bf = !this.bd;
            H();
        } else if (this.bf) {
            I();
        }
    }

    private void U() {
        this.aB.a(0);
    }

    private void ag() {
        this.aY.b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void B() {
        this.f74212e.g();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void F() {
        com.ss.android.ugc.aweme.commercialize.n.b.a(this.aW);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void P() {
        b(1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void Q() {
        b(4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void S() {
        this.f74212e.b(true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void g() {
        a(false, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void q() {
        this.W.b();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void r() {
        com.ss.android.ugc.aweme.ad.feed.survey.c cVar = this.az;
        if (cVar != null) {
            cVar.a();
        }
    }

    class b implements com.ss.android.ugc.aweme.commercialize.n.a {

        /* renamed from: a  reason: collision with root package name */
        boolean f74248a;

        static {
            Covode.recordClassIndex(45815);
        }

        private boolean c() {
            return com.ss.android.ugc.aweme.feed.x.e.a(h.this.o);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.n.a
        public final void a() {
            if (!this.f74248a) {
                this.f74248a = true;
                if (!h.this.ah && !h.this.ai && !h.this.aj && c() && h.this.c() != null) {
                    if (h.this.ao.a(h.this.o)) {
                        com.ss.android.ugc.aweme.commerce.a.a.d().f73308h = h.this.ao.a();
                        l.d("PlayerLog.toPlay, mPausePosition: " + com.ss.android.ugc.aweme.commerce.a.a.d().f73308h, "");
                    } else {
                        com.ss.android.ugc.aweme.commerce.a.a.d().f73308h = -1;
                    }
                    com.ss.android.ugc.aweme.commerce.a.a.d().e(h.this.o, h.this.ae, h.this.c(), h.this.n);
                    h.this.o.getDesc();
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.n.a
        public final void b() {
            if (this.f74248a) {
                this.f74248a = false;
                if (!h.this.ah && !h.this.ai && ((!h.this.aj) && c()) && h.this.c() != null) {
                    com.ss.android.ugc.aweme.commerce.a.a d2 = com.ss.android.ugc.aweme.commerce.a.a.d();
                    Aweme aweme = h.this.o;
                    Context context = h.this.ae;
                    View c2 = h.this.c();
                    int i2 = h.this.n;
                    if (aweme != null) {
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AdOM onPlayPause ");
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.commerce.a.b.a.a("pause");
                            com.d.a.a.a.b.a.b a2 = d2.a(context, aweme, c2);
                            if (a2 != null) {
                                a2.e();
                            }
                            com.ss.android.ugc.aweme.commerce.a.a.a.d b2 = d2.b(context, aweme, c2);
                            if (b2 != null) {
                                com.ss.android.ugc.aweme.commerce.a.a.d.a.a(b2.f73331a);
                                b2.f73331a.e();
                                com.ss.android.ugc.aweme.commerce.a.a.e.b.f73363a.b();
                            }
                        }
                        bs.a("pause", aweme, "play_pause");
                        com.ss.android.ugc.aweme.commercialize.log.j.b(context, "pause", aweme, com.ss.android.ugc.aweme.commercialize.log.j.a(context, aweme, false, com.ss.android.ugc.aweme.commercialize.log.j.a(d2.f73306f + 1)));
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "pause", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(d2.f73306f + 1)).c();
                    }
                    h.this.o.getDesc();
                }
            }
        }

        private b() {
        }

        /* synthetic */ b(h hVar, byte b2) {
            this();
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Handler f74250a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<h> f74251b;

        static {
            Covode.recordClassIndex(45816);
        }

        public final void a() {
            this.f74250a.removeCallbacks(this);
            this.f74250a.postDelayed(this, 200);
        }

        public final void run() {
            h hVar = this.f74251b.get();
            if (hVar != null) {
                Aweme aweme = hVar.o;
                long n = v.O().n();
                if (aweme != null && com.ss.android.ugc.aweme.commercialize.util.g.e(aweme) && n >= com.ss.android.ugc.aweme.commercialize.util.g.f(aweme) && !com.ss.android.ugc.aweme.commercialize.util.g.f75480a.b(aweme)) {
                    aweme.getDesc();
                    com.ss.android.ugc.aweme.commercialize.util.g.a(aweme, "play");
                    com.ss.android.ugc.aweme.commercialize.util.g.f75480a.c(aweme);
                }
                a();
            }
        }

        c(h hVar) {
            this.f74251b = new WeakReference<>(hVar);
        }
    }

    private boolean Z() {
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.g(this.o) || this.Z == null) {
            return false;
        }
        return true;
    }

    private static boolean aa() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean ad() {
        com.ss.android.ugc.aweme.ad.feed.mask.h hVar = this.aA;
        if (hVar == null) {
            return false;
        }
        return hVar.d();
    }

    private String ah() {
        com.ss.android.ugc.aweme.feed.q.a ai2 = ai();
        if (ai2 != null) {
            return ai2.h(this.o);
        }
        return null;
    }

    private com.ss.android.ugc.aweme.feed.q.a ai() {
        Fragment fragment = this.ag;
        if (fragment instanceof com.ss.android.ugc.aweme.feed.ui.af) {
            return ((com.ss.android.ugc.aweme.feed.ui.af) fragment).n;
        }
        return null;
    }

    private void am() {
        if (this.o != null) {
            ak();
            al();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void E() {
        this.aQ.c();
        com.ss.android.ugc.aweme.commercialize.utils.c.b bVar = this.aR;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void J() {
        this.ac.a("video_stop_dou_plus_guide_animation", (Object) null);
    }

    public final Long L() {
        return Long.valueOf(this.aQ.d());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void T() {
        this.f74212e.h();
        a(X());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a() {
        this.W.a(0, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final boolean e() {
        if (this.ah || this.aj || this.ai) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void i() {
        IAdSceneService iAdSceneService = this.af;
        if (iAdSceneService != null) {
            iAdSceneService.c().b(this.o, this.ae);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void p() {
        af afVar = this.br;
        if (afVar != null) {
            afVar.c();
        }
        this.br = null;
        this.f74213f.d();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void s() {
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.S(this.o)) {
            this.f74212e.a(0);
        }
    }

    static {
        Covode.recordClassIndex(45800);
    }

    private boolean ae() {
        if (this.bq == null) {
            this.bq = Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "use_new_mask", false));
        }
        return this.bq.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void A() {
        this.ac.a("ad_video_on_pause_play", (Object) null);
        this.bl.a(FeedAdViewModel.b.f74083a);
        this.ac.a("ad_feed_video_playing_state", (Object) false);
        this.bd = true;
    }

    public final boolean C() {
        Fragment fragment = this.ag;
        if (fragment == null || !(fragment instanceof am)) {
            return false;
        }
        return ((am) fragment).o();
    }

    public final boolean G() {
        Context context = this.ae;
        if (!(context instanceof androidx.fragment.app.e) || !ad.a(((androidx.fragment.app.e) context).getSupportFragmentManager())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        VideoBaseCell videoBaseCell = this.ab;
        if (videoBaseCell instanceof ae) {
            ((ae) videoBaseCell).G();
        } else {
            v.O().B();
        }
    }

    public final void I() {
        VideoBaseCell videoBaseCell = this.ab;
        if (videoBaseCell instanceof ae) {
            ((ae) videoBaseCell).F();
        } else {
            v.O().y();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void K() {
        ButtonAdBottomLabelView buttonAdBottomLabelView = this.f74212e;
        if (buttonAdBottomLabelView != null) {
            com.ss.android.ugc.aweme.commercialize.g.d().a(buttonAdBottomLabelView, buttonAdBottomLabelView.getResources().getDimensionPixelOffset(R.dimen.g3), 300, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final Long M() {
        return Long.valueOf((this.bj * ((long) this.aQ.f75748b)) + this.aQ.d());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void m() {
        if (this.Y != null) {
            com.ss.android.ugc.aweme.commercialize.utils.i.a(this.ae, this.o, this.f74213f);
            this.W.c();
            this.aY.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void y() {
        this.ac.a("ad_on_fragment_pause", (Object) null);
        this.f74212e.b(false);
        this.f74212e.a((Boolean) false);
    }

    private void V() {
        MethodCollector.i(3257);
        if (!(this.au == null || X() == null)) {
            View view = this.au;
            if (view instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) {
                ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) view).a();
            }
            X().removeView(this.au);
            this.au = null;
        }
        MethodCollector.o(3257);
    }

    private boolean W() {
        MethodCollector.i(3691);
        if (this.p == null || X() == null) {
            MethodCollector.o(3691);
            return false;
        }
        View view = this.p;
        if (view instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) {
            ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) view).a();
        }
        X().removeView(this.p);
        this.p = null;
        ALog.d("AwesomeSplash", "onAwesomeSplashEvent AwesomeSplashEvent.GONE && mAwesomeSplashMask != null");
        Aweme aweme = this.o;
        if (aweme != null) {
            com.ss.android.ugc.aweme.commercialize.e.a.b.aj(aweme);
        }
        MethodCollector.o(3691);
        return true;
    }

    private ViewGroup X() {
        VideoBaseCell videoBaseCell = this.ab;
        if (videoBaseCell == null || videoBaseCell.v() == null || this.ab.v().ad() == null) {
            return null;
        }
        return (ViewGroup) this.ab.v().ad();
    }

    private void af() {
        CircleWaveLayout circleWaveLayout = this.f74211d;
        if (circleWaveLayout.f75865e && circleWaveLayout.f75866f) {
            com.ss.android.ugc.aweme.commercialize.g.a().i(circleWaveLayout.getContext(), circleWaveLayout.f75864d);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "logo_show", circleWaveLayout.f75864d.getAwemeRawAd()).c();
        }
    }

    private void aj() {
        FrameLayout frameLayout = this.aC;
        if (frameLayout != null && frameLayout.findViewById(R.id.title) != null) {
            this.w.setTranslationX(0.0f);
            this.w.setTranslationY(0.0f);
            this.w.setAlpha(1.0f);
            this.w.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void O() {
        if (com.ss.android.ugc.aweme.feed.helper.h.a().f93345h == 53) {
            w.a(this.ae, this.o, 53, this.ap);
            com.ss.android.ugc.aweme.feed.helper.h.a().f93345h = -1;
        } else if (com.ss.android.ugc.aweme.feed.helper.h.a().f93345h == 54) {
            w.a(this.ae, this.o, 54, this.ap);
            com.ss.android.ugc.aweme.feed.helper.h.a().f93345h = -1;
        }
    }

    public final boolean f() {
        boolean ac2;
        g gVar;
        if (G() || C()) {
            return false;
        }
        this.ah = true;
        j(true);
        this.f74213f.setInCleanMode(true);
        this.W.a(true);
        if (!ae() || (gVar = this.bc) == null) {
            ac2 = ac();
        } else {
            ac2 = gVar.a(new t(this));
        }
        this.ac.a("ON_AD_COMMON_MASK_SHOW", (Object) null);
        return ac2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final boolean h() {
        boolean E2 = com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.o);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o) || !E2) {
            return false;
        }
        new com.bytedance.tux.g.b(this.Y).e(R.string.of).b();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void n() {
        Aweme aweme = this.o;
        if (aweme != null && aweme.getUserDigg() != 0 && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            com.ss.android.ugc.aweme.commercialize.egg.e.a aVar = this.aL;
            if (aVar != null) {
                aVar.a(new com.ss.android.ugc.aweme.commercialize.egg.d.d("like", "", "", this.o.getAid(), (byte) 0));
            }
            if (this.aB != null && this.o.isAd()) {
                U();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void v() {
        this.ac.a("ad_on_fragment_pager_pause", (Object) null);
        this.bl.a(FeedAdViewModel.e.f74085a);
        Aweme aweme = this.o;
        if (aweme != null && aweme.isAd()) {
            this.aQ.f75749c.b();
            com.ss.android.ugc.aweme.commerce.a.a.d().e();
            com.ss.android.ugc.aweme.commercialize.utils.c.b bVar = this.aR;
            if (bVar != null) {
                bVar.f75749c.b();
            }
        }
        this.ao.a(this.o, e());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void w() {
        this.ac.a("ad_on_holder_pause", (Object) null);
        Aweme aweme = this.o;
        if (aweme != null && aweme.isAd()) {
            this.aQ.f75749c.b();
            com.ss.android.ugc.aweme.commerce.a.a.d().e();
            com.ss.android.ugc.aweme.commercialize.utils.c.b bVar = this.aR;
            if (bVar != null) {
                bVar.f75749c.b();
            }
        }
        af afVar = this.br;
        if (afVar != null) {
            afVar.g();
        }
        this.ao.a(this.o, e());
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f74245a;

        /* renamed from: c  reason: collision with root package name */
        private final Aweme f74247c;

        static {
            Covode.recordClassIndex(45814);
        }

        public final void run() {
            if (!this.f74245a && TextUtils.equals(this.f74247c.getAid(), h.this.o.getAid()) && h.this.f74210b) {
                com.ss.android.ugc.aweme.commercialize.e.a.b.aj(this.f74247c);
                h.this.b(3);
                h.this.f74212e.b(true);
                h.this.ab.b(false);
                h.this.Y.setAlpha(0.0f);
                h.this.f74209a.start();
            }
        }

        a(Aweme aweme) {
            this.f74247c = aweme;
        }
    }

    private boolean ab() {
        if (G() || C() || this.aA == null) {
            return false;
        }
        this.ab.b(true);
        boolean b2 = this.aA.b();
        this.ai = b2;
        if (b2) {
            H();
            this.Y.setVisibility(4);
            this.ac.a("ON_AD_LYNX_MASK_SHOW", (Object) null);
            Aweme aweme = this.o;
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "othershow", this.o.getAwemeRawAd()).a("background_type", String.valueOf(this.o.getAwemeRawAd().getNativeCardType())).b();
            }
        } else {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "othershow_fail", this.o.getAwemeRawAd()).b();
        }
        return this.ai;
    }

    private boolean ac() {
        Aweme aweme = this.o;
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("background_type", String.valueOf(this.o.getAwemeRawAd().getNativeCardType()));
            com.ss.android.ugc.aweme.commercialize.log.j.a(this.ae, this.o, hashMap);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "othershow", this.o.getAwemeRawAd()).a("background_type", String.valueOf(this.o.getAwemeRawAd().getNativeCardType())).c();
        }
        this.t.setAlpha(0.0f);
        this.Y.setAlpha(1.0f);
        this.Y.animate().alpha(0.0f).setDuration(150).withEndAction(new v(this)).start();
        return true;
    }

    private void ak() {
        CommerceTagLayout commerceTagLayout;
        Aweme aweme = this.o;
        if (aweme != null && (commerceTagLayout = this.N) != null) {
            if (a(commerceTagLayout, aweme)) {
                final ac a2 = bh.a(this.o);
                if (a2 != null) {
                    c.a.f109704a.a().preloadMiniApp(a2.mpUrl);
                }
                CommerceTagLayout commerceTagLayout2 = this.N;
                AnonymousClass2 r2 = new com.ss.android.ugc.aweme.commercialize.link.video.g() {
                    /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    long f74230a;

                    /* renamed from: d  reason: collision with root package name */
                    private Runnable f74233d = new av(this);

                    static {
                        Covode.recordClassIndex(45806);
                    }

                    /* access modifiers changed from: package-private */
                    public final a.C1683a e() {
                        return new a.C1683a().a(a2).a(h.this.o).a(false);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void c() {
                        com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, e().a("close").a(0).a());
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.X(h.this.o)) {
                            com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, a2, h.this.o, false);
                        }
                        d();
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.g
                    public final void d() {
                        if (this.f74230a != 0) {
                            com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, e().a("show_over").a(0).a(System.currentTimeMillis() - this.f74230a).a());
                            this.f74230a = 0;
                            if (h.this.N != null) {
                                h.this.N.removeCallbacks(this.f74233d);
                            }
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void a() {
                        com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, e().a("show").a(100).a());
                        this.f74230a = System.currentTimeMillis();
                        if (h.this.N != null) {
                            h.this.N.postDelayed(this.f74233d, 1000);
                        }
                        com.ss.android.ugc.aweme.commercialize.service.a.f75270a.a().a(h.this.o, a2);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void b() {
                        com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, e().a("click").a(100).a());
                        w.a(h.this.ae, a2, h.this.o, false);
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.X(h.this.o)) {
                            com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, a2, h.this.o, false);
                        }
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.Z(h.this.o)) {
                            com.ss.android.ugc.aweme.commercialize.log.j.b(h.this.ae, h.this.o, "common_link");
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", h.this.o.getAwemeRawAd()).b("refer", "common_link").c();
                        }
                    }
                };
                commerceTagLayout2.f74517a = new com.ss.android.ugc.aweme.commercialize.link.video.c(commerceTagLayout2.getContext());
                commerceTagLayout2.f74517a.a(r2);
                commerceTagLayout2.f74517a.a(a2, r2, commerceTagLayout2);
                commerceTagLayout2.removeAllViews();
                commerceTagLayout2.addView(commerceTagLayout2.f74517a.c());
                this.N.setVisibility(0);
                return;
            }
            CommerceTagLayout commerceTagLayout3 = this.N;
            commerceTagLayout3.removeAllViews();
            commerceTagLayout3.f74517a = null;
            this.N.setVisibility(8);
        }
    }

    public final View c() {
        VideoBaseCell videoBaseCell = this.ab;
        if (videoBaseCell == null || videoBaseCell.v() == null || this.ab.v().ad() == null) {
            return null;
        }
        return this.ab.v().ad();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.k() != false) goto L_0x0015;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.h.t():void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void u() {
        this.ac.a("ad_on_fragment_pager_resume", (Object) null);
        this.bl.a(FeedAdViewModel.f.f74086a);
        Aweme aweme = this.o;
        if (aweme != null && aweme.isAd()) {
            this.aQ.f75749c.a();
            com.ss.android.ugc.aweme.commerce.a.a.d().d(this.o);
            com.ss.android.ugc.aweme.commercialize.utils.c.b bVar = this.aR;
            if (bVar != null) {
                bVar.f75749c.a();
            }
        }
        if (Z()) {
            this.Z.f();
        }
        Aweme aweme2 = this.o;
        if (aweme2 == null || !bs.c(aweme2)) {
            com.ss.android.ugc.aweme.commerce.a.a.d().a((View) null, (Aweme) null);
        } else {
            com.ss.android.ugc.aweme.commerce.a.a.d().a(c(), this.o);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void x() {
        IAdSceneService iAdSceneService;
        this.ac.a("ad_on_fragment_resume", (Object) null);
        Aweme aweme = this.o;
        if (aweme != null && aweme.isAppAd()) {
            this.f74212e.f();
        }
        if (Z()) {
            this.Z.f();
        }
        if (this.as && (iAdSceneService = this.af) != null) {
            iAdSceneService.c().a(this.o, this.ae, 2, this.n + 1);
            this.as = false;
        }
        Context context = this.ae;
        FrameLayout frameLayout = this.x;
        l.d(context, "");
        l.d(frameLayout, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void z() {
        this.ac.a("ad_video_on_resume_play", (Object) null);
        this.bl.a(FeedAdViewModel.c.f74084a);
        this.ac.a("ad_feed_video_playing_state", (Object) true);
        this.bd = false;
        af afVar = this.br;
        if (afVar != null) {
            afVar.e();
        }
        a(this.ag.getChildFragmentManager(), false);
        if (!b.a.a(this.o) || this.ah) {
            this.t.setAlpha(1.0f);
            this.t.animate().alpha(0.0f).setDuration(150).withEndAction(new ad(this)).start();
        }
        this.f74212e.b(true ^ com.ss.android.ugc.aweme.commercialize.e.a.b.af(this.o));
        this.f74212e.a((Boolean) false);
    }

    private void al() {
        Aweme aweme = this.o;
        if (aweme != null && this.O != null) {
            if (com.ss.android.ugc.aweme.commercialize.link.b.a("dou+", aweme, false)) {
                final com.ss.android.ugc.aweme.commercialize.model.w j2 = com.ss.android.ugc.aweme.commercialize.e.a.b.j(this.o);
                DouPlusTagLayout douPlusTagLayout = this.O;
                AnonymousClass3 r7 = new com.ss.android.ugc.aweme.commercialize.link.video.a() {
                    /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(45807);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void c() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.link.video.a
                    public final void b() {
                        w.a(h.this.ae, h.this.o, 18, h.this.ap);
                        Context context = h.this.ae;
                        com.ss.android.ugc.aweme.commercialize.model.w wVar = j2;
                        Aweme aweme = h.this.o;
                        if (!(context == null || wVar == null || aweme == null || aweme.getAwemeRawAd() == null)) {
                            com.ss.android.ugc.aweme.commercialize.log.j.a(context, "draw_ad", "click", com.ss.android.ugc.aweme.commercialize.log.j.a(context, aweme, "douplus link", "link"), com.ss.android.ugc.aweme.commercialize.log.j.b(aweme.getAwemeRawAd()), com.ss.android.ugc.aweme.commercialize.log.j.d(aweme));
                            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new com.ss.android.ugc.aweme.commercialize.log.s(aweme));
                            }
                        }
                        com.ss.android.ugc.aweme.web.jsbridge.a.f144959g = h.this.o;
                    }
                };
                l.d(j2, "");
                l.d(r7, "");
                douPlusTagLayout.f74518a = new com.ss.android.ugc.aweme.commercialize.link.video.b(douPlusTagLayout.getContext(), (byte) 0);
                com.ss.android.ugc.aweme.commercialize.link.video.b bVar = douPlusTagLayout.f74518a;
                if (bVar == null) {
                    l.b();
                }
                l.d(r7, "");
                bVar.f74522d = r7;
                if (j2 == null) {
                    bVar.f74519a.setImageResource(R.color.c9);
                    bVar.f74520b.setText("");
                } else {
                    ((com.facebook.drawee.f.a) bVar.f74519a.getHierarchy()).d(R.color.f159926j);
                    UrlModel urlModel = j2.avatarIcon;
                    if (urlModel == null || com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList())) {
                        bVar.f74519a.setImageResource(R.color.c9);
                    } else {
                        com.ss.android.ugc.aweme.base.e.a(bVar.f74519a, j2.avatarIcon);
                    }
                    bVar.f74521c.setVisibility(8);
                    bVar.f74520b.setText(j2.title);
                }
                douPlusTagLayout.removeAllViews();
                com.ss.android.ugc.aweme.commercialize.link.video.b bVar2 = douPlusTagLayout.f74518a;
                if (bVar2 == null) {
                    l.b();
                }
                douPlusTagLayout.addView(bVar2);
                this.O.setVisibility(0);
                return;
            }
            DouPlusTagLayout douPlusTagLayout2 = this.O;
            douPlusTagLayout2.removeAllViews();
            douPlusTagLayout2.f74518a = null;
            this.O.setVisibility(8);
        }
    }

    private void Y() {
        this.G.setVisibility(8);
        this.J.setVisibility(8);
        this.I.setVisibility(8);
        this.K.setVisibility(8);
        if (!TextUtils.isEmpty(this.o.getDesc())) {
            this.E.setText(this.o.getDesc());
            if (this.o.getAwemeRawAd() != null && !TextUtils.isEmpty(this.o.getAwemeRawAd().getAdMoreTextual())) {
                this.E.setMoreString(this.o.getAwemeRawAd().getAdMoreTextual());
            }
            this.E.setViewLineHeight((int) n.b(this.ae, 20.0f));
            this.E.setImageSpanXAxisAdjust((int) n.b(this.ae, 4.0f));
        } else {
            this.E.setVisibility(8);
        }
        if (this.o.getAuthor() == null || this.o.getAuthor().getAvatarMedium() == null) {
            com.ss.android.ugc.aweme.base.e.a(this.F, com.ss.android.ugc.aweme.base.model.a.a(2131232324));
        } else {
            com.ss.android.ugc.aweme.base.e.a(this.F, this.o.getAuthor().getAvatarMedium());
        }
        if (this.o.getAwemeRawAd() != null) {
            String str = "";
            if (br.a(this.o, 3)) {
                TextView textView = this.y;
                if (this.o.getAwemeRawAd().getOmVast().vast.adTitle != null) {
                    str = this.o.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                textView.setText(str);
            } else {
                TextView textView2 = this.y;
                if (this.o.getAuthor() != null) {
                    str = this.o.getAuthor().getNickname();
                }
                textView2.setText(str);
            }
            if (TextUtils.isEmpty(this.o.getAwemeRawAd().getAppInstall()) && this.o.getAwemeRawAd().getAppLike() < 4.0f) {
                this.C.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.o.getAwemeRawAd().getAppInstall())) {
                this.B.setVisibility(8);
                this.A.setVisibility(8);
            } else {
                this.B.setText(this.o.getAwemeRawAd().getAppInstall());
            }
            this.z.setRatingProgress(this.o.getAwemeRawAd().getAppLike());
            if (this.o.getAwemeRawAd().getAppLike() < 4.0f) {
                this.z.setVisibility(8);
                this.A.setVisibility(8);
            }
            if (this.o.getAwemeRawAd().getAppCategory() == null || this.o.getAwemeRawAd().getAppCategory().length == 0) {
                this.D.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] appCategory = this.o.getAwemeRawAd().getAppCategory();
            for (String str2 : appCategory) {
                if (str2.length() <= 6) {
                    arrayList.add(str2);
                }
            }
            this.D.setTagList((String[]) arrayList.toArray(new String[0]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.M(r7.o) != false) goto L_0x003f;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.h.l():void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void d() {
        boolean z2;
        g gVar;
        String a2;
        Drawable bVar;
        DataCenter dataCenter;
        if (this.o != null) {
            com.ss.android.ugc.aweme.utils.j.a(this.u);
            com.ss.android.ugc.aweme.utils.j.a(this.v);
            com.ss.android.ugc.aweme.utils.j.a(this.x);
            com.ss.android.ugc.aweme.utils.j.a(this.E);
            com.ss.android.ugc.aweme.utils.j.a(this.F);
            com.ss.android.ugc.aweme.utils.j.a(this.C);
            com.ss.android.ugc.aweme.utils.j.a(this.y);
            com.ss.android.ugc.aweme.utils.j.a(this.D);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o) && (dataCenter = this.ac) != null) {
                dataCenter.a("update_ad_user_follow_ui", (Object) true);
            }
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o)) {
            TextView textView = this.u;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.x(this.o)) {
                a2 = com.ss.android.ugc.aweme.commercialize.e.a.b.ac(this.o);
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aE(this.o)) {
                a2 = com.ss.android.ugc.aweme.commercialize.e.a.b.aR(this.o);
            } else {
                a2 = ad.a(this.ae, this.o, true);
            }
            textView.setText(a2);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.x(this.o)) {
                bVar = new com.ss.android.ugc.aweme.commercialize.ad.b((float) com.ss.android.ugc.aweme.base.utils.n.a(2.0d), androidx.core.content.b.c(this.ae, R.color.bh));
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aE(this.o)) {
                bVar = new com.ss.android.ugc.aweme.commercialize.ad.b((float) com.ss.android.ugc.aweme.base.utils.n.a(2.0d), Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.aS(this.o)));
            } else {
                bVar = new com.ss.android.ugc.aweme.commercialize.ad.b((float) com.ss.android.ugc.aweme.base.utils.n.a(2.0d), androidx.core.content.b.c(this.ae, R.color.av));
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.al(this.o)) {
                bVar = com.ss.android.ugc.aweme.utils.j.a(bVar.mutate(), androidx.core.content.b.c(this.ae, R.color.f159926j));
            }
            this.u.setBackground(bVar);
        }
        this.f74212e.a(this.o, this.ac);
        Aweme aweme = this.o;
        if (!aweme.isAd() || !aweme.getAwemeRawAd().isRightStyle()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.aw.a(a.C0795a.C0796a.a().a(this.o.getAwemeRawAd().getLabel().getLabelName()).b(92).a(this.aw.getResources().getColor(R.color.a9)).f35183a);
            if (!this.o.isAd() || TextUtils.isEmpty(this.o.getAwemeRawAd().getLabel().byText)) {
                this.ax.setVisibility(8);
            } else {
                this.ax.setVisibility(0);
                this.ax.setText(this.o.getAwemeRawAd().getLabel().byText + " ");
            }
            if (!this.o.isAd() || TextUtils.isEmpty(this.o.getAwemeRawAd().getLabel().bySource)) {
                this.ay.setVisibility(8);
            } else {
                this.ay.setVisibility(0);
                this.ay.setText("@" + this.o.getAwemeRawAd().getLabel().bySource);
                this.ay.setOnClickListener(new p(this));
            }
            if (TextUtils.isEmpty(this.o.getDesc())) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.av.getLayoutParams();
                marginLayoutParams.topMargin = (int) n.b(this.ae, 4.5f);
                this.av.setLayoutParams(marginLayoutParams);
            }
            this.av.setVisibility(0);
            this.aw.setOnClickListener(new q(this));
        } else {
            this.av.setVisibility(8);
        }
        this.f74213f.d();
        this.f74214g.setVisibility(8);
        g(false);
        h(false);
        if (br.a(this.o, 3)) {
            bs.d(this.o);
        }
        this.aJ.setVisibility(8);
        if (!cp.f89712c || com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o)) {
            this.ac.a("ad_feed_video_params", (Object) new a.C1739a().a(new r(this)).f75479a);
        }
        Aweme aweme2 = this.o;
        if (ae() && (gVar = this.bc) != null) {
            com.ss.android.ugc.aweme.ad.feed.mask.c cVar = new com.ss.android.ugc.aweme.ad.feed.mask.c();
            Context context = this.ae;
            RelativeLayout relativeLayout = this.Y;
            String str = this.ad;
            AnonymousClass8 r1 = new com.ss.android.ugc.aweme.ad.feed.mask.a.a() {
                /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(45812);
                }

                @Override // com.ss.android.ugc.aweme.ad.feed.mask.a.a
                public final void a() {
                    com.ss.android.ugc.aweme.commerce.a.a.d();
                    com.ss.android.ugc.aweme.commerce.a.a.c(h.this.o);
                }

                @Override // com.ss.android.ugc.aweme.ad.feed.mask.a.a
                public final void a(int i2) {
                    w.a(h.this.ae, h.this.o, i2, h.this.ap);
                }

                @Override // com.ss.android.ugc.aweme.ad.feed.mask.a.a
                public final void a(boolean z, boolean z2) {
                    h.this.a(z, z2);
                }
            };
            l.d(context, "");
            l.d(aweme2, "");
            l.d(relativeLayout, "");
            l.d(str, "");
            l.d(r1, "");
            cVar.f65970a = context;
            cVar.f65971b = aweme2;
            cVar.f65973d = str;
            cVar.f65972c = r1;
            cVar.f65974e = relativeLayout;
            gVar.a(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void D() {
        long j2;
        Video video;
        int D2;
        int colorDelay;
        int buttonShow;
        this.ac.a("ad_video_on_render_ready", (Object) null);
        this.ac.a("ad_feed_video_playing_state", (Object) true);
        this.bd = false;
        this.aQ.a();
        Aweme aweme = this.o;
        if (aweme != null && aweme.isAd()) {
            com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
            az a3 = c.a.a();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(this.o) && a2 != null) {
                j2 = a2.g();
            } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aw(this.o) || a3 == null) {
                Aweme aweme2 = this.o;
                com.ss.android.ugc.aweme.video.i O2 = v.O();
                l.b(O2, "");
                j2 = O2.j();
                if (j2 <= 0) {
                    if (!(aweme2 == null || (video = aweme2.getVideo()) == null || Integer.valueOf(video.getDuration()) == null)) {
                        Video video2 = aweme2.getVideo();
                        l.b(video2, "");
                        if (video2.getDuration() > 0) {
                            Video video3 = aweme2.getVideo();
                            l.b(video3, "");
                            j2 = (long) video3.getDuration();
                        }
                    }
                    j2 = 1;
                }
            } else {
                j2 = a3.c();
            }
            this.bj = j2;
            a(this.aQ);
            long j3 = this.bj;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.S(this.o)) {
                this.aQ.a(350);
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.al(this.o)) {
                    int D3 = com.ss.android.ugc.aweme.commercialize.e.a.b.D(this.o);
                    CommerceSmartUITasks b2 = com.ss.android.ugc.aweme.ad.feed.g.b();
                    if (b2 == null || (buttonShow = b2.getButtonShow()) < 0) {
                        if (!(this.an == null || com.ss.android.ugc.aweme.ad.feed.g.a() == null)) {
                            int i2 = D3 / 1000;
                            this.an.a(i2, i2, 0);
                        }
                        this.aQ.a(new b.a().a(j3).a(D3).a(new aa(this)).a(false).a());
                    } else {
                        com.ss.android.ugc.aweme.ad.feed.g.b bVar = this.an;
                        if (bVar != null) {
                            bVar.a(D3 / 1000, buttonShow, 1);
                        }
                        this.aQ.a(new b.a().a(j3).a(buttonShow).a(new z(this)).a(false).a());
                    }
                }
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.am(this.o)) {
                    Aweme aweme3 = this.o;
                    if (aweme3 == null || !aweme3.isAd() || aweme3.getAwemeRawAd().getAnimationType() != 3) {
                        D2 = com.ss.android.ugc.aweme.commercialize.e.a.b.D(aweme3);
                    } else {
                        D2 = Math.max(com.ss.android.ugc.aweme.commercialize.e.a.b.D(aweme3), aweme3.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
                    }
                    CommerceSmartUITasks b3 = com.ss.android.ugc.aweme.ad.feed.g.b();
                    if (b3 == null || (colorDelay = b3.getColorDelay()) <= 0 || D2 == 0) {
                        if (!(this.an == null || com.ss.android.ugc.aweme.ad.feed.g.a() == null)) {
                            int i3 = D2 / 1000;
                            this.an.b(i3, i3, 0);
                        }
                        this.aQ.a(new b.a().a(j3).a(D2).a(new ac(this)).a(false).a());
                    } else {
                        com.ss.android.ugc.aweme.ad.feed.g.b bVar2 = this.an;
                        if (bVar2 != null) {
                            bVar2.b(D2 / 1000, colorDelay, 1);
                        }
                        this.aQ.a(new b.a().a(j3).a(colorDelay).a(new ab(this)).a(false).a());
                    }
                }
            }
            long j4 = this.bj;
            boolean a4 = this.ao.a(this.o);
            if (j4 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT && (!a4 || this.aQ.d() < InteractFirstFrameTimeOutDurationSetting.DEFAULT)) {
                this.aQ.a(new b.a().a(j4).a(LiveNetAdaptiveHurryTimeSetting.DEFAULT).a(new ah(this)).a(true).a());
            }
            if (j4 >= 6000 && (!a4 || this.aQ.d() < 6000)) {
                this.aQ.a(new b.a().a(j4).a(6000).a(new ai(this)).a(true).a());
            }
            if (j4 >= 15000 && (!a4 || this.aQ.d() < 15000)) {
                this.aQ.a(new b.a().a(j4).a(15000).a(new aj(this)).a(true).a());
            }
            Aweme aweme4 = this.o;
            if (aweme4 != null && aweme4.isAd() && !com.bytedance.common.utility.collection.b.a((Collection) aweme4.getAwemeRawAd().getPlaybackSecondsTrackList())) {
                for (com.ss.android.ugc.aweme.commercialize.model.am amVar : this.o.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                    this.aQ.a(new b.a().a(j4).a((int) Math.min((long) (amVar.f74866a * 1000), j4)).a(new ak(this, amVar)).a(true).a());
                }
            }
            long j5 = this.bj;
            if (Z() && !this.aa) {
                float showTime = this.o.getAwemeRawAd().getPlayFunModel().getShowTime();
                if (showTime < 0.0f) {
                    showTime = 0.0f;
                }
                this.aQ.a(350);
                this.aQ.a(new b.a().a(j5).a((int) (showTime * 1000.0f)).a(new s(this)).a(false).a());
            }
            long j6 = this.bj;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.C(this.o)) {
                float showTime2 = this.o.getAwemeRawAd().getAdInteractionData().getGestureGuidance().getShowTime();
                if (showTime2 < 0.0f) {
                    showTime2 = 0.0f;
                }
                this.aQ.a(100);
                this.aQ.a(new b.a().a(j6).a(((int) (showTime2 * 1000.0f)) - com.ss.android.ugc.aweme.ad.feed.c.c.a()).a(new al(this)).a(true).a());
            }
            long j7 = this.bj;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.Q(this.o)) {
                float showSeconds = (float) com.ss.android.ugc.aweme.commercialize.e.a.b.R(this.o).getShowSeconds();
                if (showSeconds > 0.0f) {
                    this.aQ.a(100);
                    this.aQ.a(new b.a().a(j7).a((int) (showSeconds * 1000.0f)).a(new am(this)).a(false).a());
                }
            }
            this.aQ.b();
        }
        this.aW.f74248a = true;
        VideoBaseCell videoBaseCell = this.ab;
        if (!(videoBaseCell == null || videoBaseCell.p().y() == null)) {
            View y2 = this.ab.p().y();
            ao aoVar = new ao(y2.getWidth(), y2.getHeight());
            this.ac.a("ad_feed_bind_texture_size", aoVar);
            this.bl.a(aoVar);
        }
        if (!b.a.a(com.ss.android.ugc.aweme.commerce.a.a.d().f73309i) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aW(com.ss.android.ugc.aweme.commerce.a.a.d().f73309i) && !(this.ag instanceof com.ss.android.ugc.aweme.feed.ui.af) && com.ss.android.ugc.aweme.commerce.a.a.d().f73309i != null && com.ss.android.ugc.aweme.commerce.a.a.d().a() != null) {
            com.ss.android.ugc.aweme.commerce.a.a.d().f73307g = false;
            com.ss.android.ugc.aweme.commerce.a.a.d().a(this.ae, com.ss.android.ugc.aweme.commerce.a.a.d().f73309i, com.ss.android.ugc.aweme.commerce.a.a.d().a(), false);
        }
        Aweme aweme5 = this.o;
        if (aweme5 == null || !bs.c(aweme5) || c() == null) {
            com.ss.android.ugc.aweme.commerce.a.a.d().a((View) null, (Aweme) null);
        } else {
            com.ss.android.ugc.aweme.commerce.a.a.d().a(c(), this.o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c6  */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
        // Method dump skipped, instructions count: 1847
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.h.k():void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(int i2) {
        this.n = i2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(long j2) {
        this.W.a(j2, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void b(String str) {
        this.ac.a("AD_ON_PROFILE_WEB_PAGE_HIDE", str);
    }

    private void j(boolean z2) {
        if (Z()) {
            this.Z.a(z2);
        }
    }

    private void a(ViewGroup viewGroup) {
        a aVar = this.ar;
        if (aVar != null) {
            aVar.f74245a = true;
            if (viewGroup != null) {
                viewGroup.removeCallbacks(this.ar);
            }
            this.ar = null;
        }
        AnimatorSet animatorSet = this.f74209a;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f74209a = null;
        }
    }

    private void h(boolean z2) {
        if (this.o != null) {
            if (Z()) {
                this.r.setVisibility(8);
            } else {
                i(z2);
            }
        }
    }

    private void k(boolean z2) {
        if (this.aA != null) {
            this.ab.b(false);
            this.aA.a(z2);
            this.Y.setVisibility(0);
        }
        this.ac.a("ON_AD_LYNX_MASK_HIDE", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void b(Aweme aweme) {
        if (!h() && aweme != null) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o)) {
                com.ss.android.ugc.aweme.commerce.a.a.d();
                com.ss.android.ugc.aweme.commerce.a.a.c(aweme);
            }
            a(true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void e(boolean z2) {
        this.ac.a("ad_comment_dialog_visible", Boolean.valueOf(z2));
        this.ak = z2;
        if (z2) {
            this.bp.add("comment_block");
        } else {
            this.bp.remove("comment_block");
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void f(boolean z2) {
        this.ac.a("ad_share_dialog_visible", Boolean.valueOf(z2));
        this.al = z2;
        if (z2) {
            this.bp.add("share_block");
        } else {
            this.bp.remove("share_block");
        }
    }

    private void a(com.ss.android.ugc.aweme.commercialize.utils.c.b bVar) {
        com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
        final az a3 = c.a.a();
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(this.o) && a2 != null) {
            a2.getClass();
            bVar.a(ag.a(a2));
        } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aw(this.o) || a3 == null) {
            bVar.a(com.ss.android.ugc.aweme.commercialize.utils.c.a.f75746a);
        } else {
            bVar.a(new com.ss.android.ugc.aweme.commercialize.o.a() {
                /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(45805);
                }

                @Override // com.ss.android.ugc.aweme.commercialize.o.a
                public final long a() {
                    return a3.d();
                }
            });
        }
    }

    private boolean c(i iVar) {
        if (G() || C()) {
            return false;
        }
        this.aj = true;
        this.s.setAlpha(0.0f);
        CardStruct h2 = com.ss.android.ugc.aweme.commercialize.e.a.b.h(this.o);
        if (h2 != null) {
            com.ss.android.ugc.aweme.web.jsbridge.a.f144955c = h2;
            com.ss.android.ugc.aweme.web.jsbridge.a.f144959g = this.o;
            com.ss.android.ugc.aweme.web.jsbridge.a.f144958f = 2;
        }
        al.a(this.o, new com.ss.android.ugc.aweme.commercialize.views.form.b(iVar, null) {
            /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass9 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f74242a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.playerkit.videoview.h f74243b = null;

            static {
                Covode.recordClassIndex(45813);
            }

            @Override // com.ss.android.ugc.aweme.commercialize.views.form.b
            public final void c() {
                h.this.a(this.f74242a, true);
                h.this.ab.b(false);
            }

            @Override // com.ss.android.ugc.aweme.commercialize.views.form.b
            public final void b() {
                AwemeRawAd awemeRawAd;
                h.this.a(this.f74242a, false);
                h.this.f();
                com.ss.android.ugc.aweme.commercialize.log.j.y(h.this.ae, h.this.o);
                if (h.this.o != null) {
                    awemeRawAd = h.this.o.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "load_fail", awemeRawAd).c();
                h.this.s.setAlpha(1.0f);
            }

            @Override // com.ss.android.ugc.aweme.commercialize.views.form.b
            public final void a() {
                h.this.s.animate().alpha(1.0f).setDuration(200).start();
                h.this.ab.b(true);
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", "-1");
                if (h.this.o != null) {
                    com.ss.android.ugc.aweme.commercialize.log.j.a(h.this.ae, h.this.o, hashMap);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "othershow", h.this.o.getAwemeRawAd()).a("background_type", "-1").c();
                }
                h.this.ac.a("ON_AD_FORM_MASK_SHOW", (Object) null);
            }

            @Override // com.ss.android.ugc.aweme.commercialize.views.form.b
            public final void a(boolean z) {
                AwemeRawAd awemeRawAd;
                if (!z) {
                    com.ss.android.ugc.aweme.commercialize.log.j.x(h.this.ae, h.this.o);
                    if (h.this.o != null) {
                        awemeRawAd = h.this.o.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_form", "click_cancel", awemeRawAd).c();
                }
            }

            {
                this.f74242a = r3;
            }
        }, iVar, this.s, aO);
        return true;
    }

    private void i(boolean z2) {
        ICommercializeAdService iCommercializeAdService;
        if (!(this.aK != null || (iCommercializeAdService = this.bi) == null || this.r == null)) {
            this.aK = (com.ss.android.ugc.aweme.ad.feed.e.b) iCommercializeAdService.c(this.ae, new com.ss.android.ugc.aweme.ad.feed.e.d(this.r));
        }
        com.ss.android.ugc.aweme.ad.feed.e.b bVar = this.aK;
        if (bVar != null) {
            bVar.a(z2, this.o, this.ad);
        }
    }

    public final void b(int i2) {
        int i3 = this.aq;
        if (i3 == 4 || i3 < i2) {
            this.aq = i2;
            if (this.o != null) {
                a(new com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a(i2, this.o));
                com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.a(i2, this.o);
                com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(i2, this.aF, this.aH, this.aG);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void d(boolean z2) {
        if (z2 && this.o != null) {
            com.ss.android.ugc.aweme.commercialize.egg.e.a aVar = this.aL;
            if (aVar != null) {
                aVar.a(new com.ss.android.ugc.aweme.commercialize.egg.d.d("like", "", "", this.o.getAid(), (byte) 0));
            }
            if (this.aB != null && this.o.isAd()) {
                U();
            }
        }
        IAdSceneService iAdSceneService = this.af;
        if (iAdSceneService != null) {
            iAdSceneService.c().a(this.o, this.ae, z2);
        }
    }

    private void a(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        int i2;
        AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(aVar.f34875b);
        if (m2 != null) {
            i2 = m2.getSwipeUpType();
        } else {
            i2 = 0;
        }
        if (SplashSettingServiceImpl.g().d() && (i2 == 2 || i2 == 6 || i2 == 7)) {
            this.q = aVar.f34874a;
            if (aVar.f34874a == 4) {
                ALog.d("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
                W();
            } else {
                if (aVar.f34874a == 1) {
                    this.am = false;
                }
                if (this.p == null && X() != null) {
                    ViewGroup X2 = X();
                    ALog.d("AwesomeSplash", "onAwesomeSplashEvent awesome_splash_mask inflate");
                    View a2 = SplashAdServiceImpl.h().a(this.ag, X2);
                    this.p = a2;
                    if (a2 != null) {
                        View a3 = SplashAdServiceImpl.h().a(this.p);
                        if (a3 != null) {
                            a3.setOnTouchListener(new View.OnTouchListener() {
                                /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(45810);
                                }

                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    com.ss.android.ugc.aweme.feed.ui.af afVar;
                                    long j2;
                                    float rawX;
                                    com.ss.android.ugc.aweme.feed.ui.af afVar2;
                                    if (motionEvent.getAction() == 1) {
                                        VideoBaseCell videoBaseCell = h.this.ab;
                                        long j3 = 0;
                                        if (com.ss.android.ugc.aweme.feed.x.g.e(videoBaseCell) && com.ss.android.ugc.aweme.commercialize.e.a.b.B(videoBaseCell.b())) {
                                            if (!(h.this.ag instanceof com.ss.android.ugc.aweme.feed.ui.af) || (afVar2 = (com.ss.android.ugc.aweme.feed.ui.af) h.this.ag) == null) {
                                                j2 = 0;
                                            } else {
                                                j2 = afVar2.n.aK.H();
                                            }
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("duration", String.valueOf(j2));
                                            HashMap hashMap2 = new HashMap();
                                            if (gb.a(h.this.ae)) {
                                                hashMap2.put("click_x", String.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(h.this.ae)) - motionEvent.getRawX()));
                                            } else {
                                                hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                                            }
                                            hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                                            hashMap.put("ad_extra_data", new com.google.gson.f().b(hashMap2));
                                            Context context = com.ttnet.org.chromium.base.c.f155223a;
                                            Aweme b2 = videoBaseCell.b();
                                            com.ss.android.ugc.aweme.commercialize.log.j.b(context, "skip", b2, com.ss.android.ugc.aweme.commercialize.log.j.a(context, b2, false, (Map<String, String>) hashMap));
                                            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "skip", videoBaseCell.b().getAwemeRawAd());
                                            if (gb.a(h.this.ae)) {
                                                rawX = ((float) com.ss.android.ugc.aweme.base.utils.i.b(h.this.ae)) - motionEvent.getRawX();
                                            } else {
                                                rawX = motionEvent.getRawX();
                                            }
                                            a2.a("click_x", Float.valueOf(rawX)).a("click_y", Float.valueOf(motionEvent.getRawY())).c();
                                            if (!(videoBaseCell.v() == null || videoBaseCell.v().ad() == null)) {
                                                com.ss.android.ugc.aweme.commerce.a.a.d().a(videoBaseCell.b(), com.ttnet.org.chromium.base.c.f155223a, videoBaseCell.v().ad());
                                            }
                                        }
                                        h hVar = h.this;
                                        if (hVar.q == 2) {
                                            if (hVar.p instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) {
                                                ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) hVar.p).b();
                                            }
                                            VideoBaseCell videoBaseCell2 = hVar.ab;
                                            if (com.ss.android.ugc.aweme.feed.x.g.e(videoBaseCell2) && com.ss.android.ugc.aweme.commercialize.e.a.b.B(videoBaseCell2.b())) {
                                                hVar.am = true;
                                                if ((hVar.ag instanceof com.ss.android.ugc.aweme.feed.ui.af) && (afVar = (com.ss.android.ugc.aweme.feed.ui.af) hVar.ag) != null) {
                                                    j3 = afVar.n.aK.H();
                                                }
                                                new HashMap().put("duration", String.valueOf(j3));
                                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.e(videoBaseCell2.b()));
                                            }
                                        }
                                    }
                                    return false;
                                }
                            });
                        }
                        this.p.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass7 */

                            static {
                                Covode.recordClassIndex(45811);
                            }

                            public final boolean onPreDraw() {
                                com.ss.android.ugc.aweme.commercialize.splash.d.f75284b = System.currentTimeMillis();
                                if (h.this.p == null || h.this.p.getViewTreeObserver() == null) {
                                    return true;
                                }
                                h.this.p.getViewTreeObserver().removeOnPreDrawListener(this);
                                return true;
                            }
                        });
                    } else {
                        return;
                    }
                }
            }
            View view = this.p;
            if (view instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) {
                ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) view).onEvent(aVar);
            }
        } else if (i2 != 5) {
        } else {
            if (aVar.f34874a == 4) {
                V();
            } else if (this.au == null && X() != null) {
                View b2 = SplashAdServiceImpl.h().b(this.ag, X());
                this.au = b2;
                if (b2 != null) {
                    ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) b2).onEvent(aVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void b(i iVar) {
        if (com.ss.android.ugc.aweme.utils.v.b(this.o) && this.br == null) {
            if (com.bytedance.ies.abmock.b.a().a(true, "use_new_ad_card_version", false)) {
                this.br = AdCardServiceImpl.c().a().a(this.ae).a(this.o).a(this.f74213f).a(this.f74214g).a(iVar).a(this.ac).a(this.ab).a();
            } else {
                e.a aVar = new e.a();
                aVar.f76088a.f76066a = this.ae;
                aVar.f76088a.f76067b = this.o;
                AdHalfWebPageContainer adHalfWebPageContainer = this.f74213f;
                adHalfWebPageContainer.setUseZOrder(co.a());
                aVar.f76088a.f76068c = adHalfWebPageContainer;
                aVar.f76088a.f76069d = this.f74214g;
                aVar.f76088a.f76070e = iVar;
                aVar.f76088a.f76078m = this.ac;
                aVar.f76088a.r = this.ab;
                this.br = aVar.f76088a;
            }
            this.br.a();
            com.ss.android.ugc.aweme.commercialize.service.a.f75270a.a().a(this.o);
            IAdCardService iAdCardService = this.bh;
            if (iAdCardService != null) {
                iAdCardService.b().c(this.o);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void c(boolean z2) {
        if (z2) {
            FrameLayout frameLayout = this.x;
            com.bytedance.ies.dmt.ui.f.d.a(frameLayout, frameLayout.getAlpha(), 0.0f);
        } else {
            FrameLayout frameLayout2 = this.x;
            com.bytedance.ies.dmt.ui.f.d.a(frameLayout2, frameLayout2.getAlpha(), 1.0f);
        }
        this.f74213f.setInCleanMode(z2);
        this.W.a(z2);
        this.aJ.a(z2);
        j(z2);
        this.ac.a("ON_DISLIKE_MODE_CHANGE", Boolean.valueOf(z2));
    }

    private void g(boolean z2) {
        if (br.a(this.o, 3)) {
            boolean z3 = false;
            com.ss.android.ugc.aweme.base.utils.o.a(this.R, 0);
            com.bytedance.x.b.c a2 = br.a(this.o, "AdChoices");
            if (a2 != null && !com.bytedance.common.utility.collection.b.a((Collection) a2.staticResource)) {
                Iterator<String> it = a2.staticResource.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next)) {
                        com.ss.android.ugc.aweme.base.utils.o.a(this.S, 0);
                        com.ss.android.ugc.aweme.base.e.b(this.S, next, -1, -1);
                        ViewGroup viewGroup = this.R;
                        if (viewGroup != null) {
                            viewGroup.setClickable(true);
                        }
                        z3 = true;
                    }
                }
            } else {
                com.ss.android.ugc.aweme.base.utils.o.a(this.S, 8);
                ViewGroup viewGroup2 = this.R;
                if (viewGroup2 != null) {
                    viewGroup2.setClickable(false);
                }
            }
            if (z2 && z3 && !com.bytedance.common.utility.collection.b.a((Collection) a2.viewTracking) && bs.b(this.o)) {
                Set<String> set = a2.viewTracking;
                if (set != null) {
                    bs.a(h.l.k.b(h.a.n.t(set), bs.w.f75740a), (ah) null);
                }
                f.b a3 = com.ss.android.ugc.aweme.commercialize.log.f.a();
                a3.f74804a = "draw_ad";
                a3.f74805b = "ad_choice_view";
                a3.c("video").b(this.o).a(this.ae);
                Aweme aweme = this.o;
                if (aweme != null) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "ad_choice_view", aweme.getAwemeRawAd()).b("refer", "video").c();
                }
            }
            if (this.T != null) {
                if (this.o.getAwemeRawAd() == null || this.o.getAwemeRawAd().getLabel() == null || TextUtils.isEmpty(this.o.getAwemeRawAd().getLabel().getLabelName())) {
                    this.T.setText(R.string.ot);
                } else {
                    this.T.setText(this.o.getAwemeRawAd().getLabel().getLabelName());
                }
            }
            com.ss.android.ugc.aweme.base.utils.o.a(this.aI, 8);
            return;
        }
        com.ss.android.ugc.aweme.base.utils.o.a(this.R, 8);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void b(DataCenter dataCenter) {
        this.ac = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("on_ad_light_web_page_show", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("on_ad_light_web_page_hide", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("AD_ACTION_MOVE_IN_DESC", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("AD_ACTION_MOVE_OUT_DESC", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("on_ad_pop_up_web_page_show", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("on_ad_pop_up_web_page_hide", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("action_ad_pop_up_web_pause_video", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("action_ad_pop_up_web_resume_video", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("new_clean_mode", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("AD_ACTION_REPLAY_VIDEO", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("action_ad_hide_lynx_mask", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("action_ad_swipe_up_video", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("ad_feed_pause_video", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.ac.a("ad_feed_resume_video", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
        com.ss.android.ugc.aweme.ad.feed.card.a aVar = this.W;
        aVar.f65790d = dataCenter;
        DataCenter dataCenter2 = aVar.f65790d;
        if (dataCenter2 != null) {
            dataCenter2.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) aVar);
            dataCenter2.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) aVar);
            dataCenter2.a("ad_comment_dialog_visible", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) aVar);
            dataCenter2.a("ad_share_dialog_visible", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) aVar);
            dataCenter2.a("ad_video_on_resume_play", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) aVar);
        }
        com.ss.android.ugc.aweme.ad.feed.survey.c cVar = this.az;
        if (cVar != null) {
            cVar.a(dataCenter);
        }
        com.ss.android.ugc.aweme.ad.feed.mask.h hVar = this.aA;
        if (hVar != null) {
            hVar.a(dataCenter);
        }
        com.ss.android.ugc.aweme.ad.feed.e eVar = this.X;
        if (eVar != null) {
            eVar.a(dataCenter);
        }
        com.ss.android.ugc.aweme.ad.feed.e eVar2 = this.aB;
        if (eVar2 != null) {
            eVar2.a(dataCenter);
        }
        com.ss.android.ugc.aweme.ad.feed.g.b bVar = this.an;
        if (bVar != null) {
            bVar.a(dataCenter);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void c(Aweme aweme) {
        com.ss.android.ugc.aweme.commercialize.model.a disclaimer;
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aU(aweme)) {
            this.U.setVisibility(8);
            return;
        }
        this.U.setVisibility(0);
        this.U.setOnClickListener(null);
        Fragment fragment = this.ag;
        if (!(fragment == null || fragment.getActivity() == null)) {
            androidx.fragment.app.e activity = this.ag.getActivity();
            LinearLayout linearLayout = this.U;
            l.d(aweme, "");
            l.d(activity, "");
            l.d(linearLayout, "");
            TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.b0l);
            TuxIconView tuxIconView = (TuxIconView) linearLayout.findViewById(R.id.b0m);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!(awemeRawAd == null || (disclaimer = awemeRawAd.getDisclaimer()) == null)) {
                l.b(tuxTextView, "");
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                l.b(tuxIconView, "");
                ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                int i2 = 1;
                if (disclaimer.getType() == 1) {
                    tuxTextView.setText(disclaimer.getPureText());
                    linearLayout.setBackgroundColor(0);
                    tuxIconView.setTintColorRes(R.attr.ab);
                    layoutParams2.topMargin = (int) n.b(activity, 0.0f);
                    layoutParams4.topMargin = (int) n.b(activity, 0.0f);
                } else if (disclaimer.getType() == 2) {
                    layoutParams2.topMargin = (int) n.b(activity, 12.0f);
                    layoutParams4.topMargin = (int) n.b(activity, 12.0f);
                    linearLayout.setBackgroundColor(androidx.core.content.b.c(activity, R.color.a4));
                    tuxTextView.setTuxFont(62);
                    tuxIconView.setTintColorRes(R.attr.f159902m);
                    List<com.ss.android.ugc.aweme.commercialize.model.v> textList = disclaimer.getTextList();
                    if (textList != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (com.ss.android.ugc.aweme.commercialize.model.v vVar : textList) {
                            String text = vVar.getText();
                            if (vVar.getType() == 0) {
                                spannableStringBuilder.append((CharSequence) text);
                            } else {
                                if (vVar.getType() == i2) {
                                    f.a aVar = new f.a(vVar, aweme, activity, linearLayout, tuxTextView);
                                    Context context = linearLayout.getContext();
                                    l.b(context, "");
                                    com.ss.android.ugc.aweme.report.a aVar2 = new com.ss.android.ugc.aweme.report.a(aVar, context);
                                    int length = spannableStringBuilder.length();
                                    spannableStringBuilder.append((CharSequence) text);
                                    spannableStringBuilder.setSpan(aVar2, length, text.length() + length, 17);
                                }
                                i2 = 1;
                            }
                        }
                        tuxTextView.setText(spannableStringBuilder);
                        tuxTextView.setOnTouchListener(new f.b(spannableStringBuilder, aweme, activity, linearLayout, tuxTextView));
                    }
                }
                tuxTextView.setLayoutParams(layoutParams2);
                tuxIconView.setLayoutParams(layoutParams4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void b(boolean z2) {
        int i2;
        if (!TextUtils.equals(this.ad, "homepage_follow")) {
            FrameLayout frameLayout = this.x;
            if (z2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            frameLayout.setVisibility(i2);
            if (!z2) {
                frameLayout.setAlpha(1.0f);
            }
        }
        this.f74213f.setInCleanMode(z2);
        this.W.a(z2);
        this.aJ.a(z2);
        j(z2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        boolean z2;
        int a2;
        boolean z3;
        VerticalViewPager verticalViewPager;
        VerticalViewPager verticalViewPager2;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f67014a;
            str.hashCode();
            char c2 = 65535;
            int i2 = 0;
            switch (str.hashCode()) {
                case -2106631497:
                    if (str.equals("action_ad_pop_up_web_resume_video")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1842619453:
                    if (str.equals("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -992914323:
                    if (str.equals("ad_feed_pause_video")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -924046888:
                    if (str.equals("new_clean_mode")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -835841586:
                    if (str.equals("ad_feed_resume_video")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1044302436:
                    if (str.equals("action_ad_pop_up_web_pause_video")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 1133065514:
                    if (str.equals("action_ad_hide_lynx_mask")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 1481889616:
                    if (str.equals("AD_ACTION_REPLAY_VIDEO")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 1655117583:
                    if (str.equals("action_ad_swipe_up_video")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 1676264963:
                    if (str.equals("AD_ACTION_MOVE_OUT_DESC")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 1881011274:
                    if (str.equals("AD_ACTION_MOVE_IN_DESC")) {
                        c2 = 14;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    if (this.be) {
                        I();
                        this.be = false;
                        return;
                    }
                    return;
                case 1:
                    aj();
                    return;
                case 2:
                    this.bp.remove("lightpage_block");
                    return;
                case 3:
                    a(true, true);
                    this.bp.add("lightpage_block");
                    return;
                case 4:
                    H();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.aJ.a(false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    I();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.bp.remove("popup_page_block");
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.bp.add("popup_page_block");
                    a(false, true);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (!this.bd) {
                        this.be = true;
                    }
                    if (bVar2.a() != null) {
                        i2 = ((Integer) bVar2.a()).intValue();
                    }
                    if (w.a(i2) || i2 == 48 || i2 == 3) {
                        this.be = true;
                    }
                    H();
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (bVar2.a() instanceof Boolean) {
                        k(((Boolean) bVar2.a()).booleanValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    I();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    Object a3 = bVar2.a();
                    if (a3 == null) {
                        Fragment fragment = this.ag;
                        if (fragment instanceof com.ss.android.ugc.aweme.feed.ui.af) {
                            VerticalViewPager verticalViewPager3 = ((com.ss.android.ugc.aweme.feed.ui.af) fragment).n.N;
                            if (verticalViewPager3 != null) {
                                verticalViewPager3.a(verticalViewPager3.getCurrentItem() + 1, verticalViewPager3.getCurrentItem(), 8000);
                                return;
                            }
                            return;
                        } else if ((fragment instanceof z) && (verticalViewPager2 = ((z) fragment).f79992k.N) != null) {
                            verticalViewPager2.a(verticalViewPager2.getCurrentItem() + 1, verticalViewPager2.getCurrentItem(), 8000);
                            return;
                        } else {
                            return;
                        }
                    } else if (a3 instanceof com.ss.android.ugc.aweme.ad.feed.survey.b) {
                        com.ss.android.ugc.aweme.ad.feed.survey.b bVar3 = (com.ss.android.ugc.aweme.ad.feed.survey.b) a3;
                        int i3 = bVar3.f66099a;
                        int i4 = bVar3.f66100b;
                        int i5 = bVar3.f66101c;
                        Fragment fragment2 = this.ag;
                        if ((fragment2 instanceof com.ss.android.ugc.aweme.feed.ui.af) && (verticalViewPager = ((com.ss.android.ugc.aweme.feed.ui.af) fragment2).n.N) != null) {
                            verticalViewPager.a(i3, i4, i5);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (bVar2.a() != null) {
                        z2 = ((Boolean) bVar2.a()).booleanValue();
                    } else {
                        z2 = false;
                    }
                    LinearLayout linearLayout = this.w;
                    if (linearLayout == null) {
                        return;
                    }
                    if (z2) {
                        linearLayout.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).withEndAction(new ae(this)).start();
                        return;
                    }
                    if (gb.a(this.ae)) {
                        a2 = -bu.a(this.w);
                    } else {
                        a2 = bu.a(this.w);
                    }
                    LinearLayout linearLayout2 = this.w;
                    linearLayout2.setAlpha(linearLayout2.getAlpha());
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout2, "alpha", linearLayout2.getAlpha(), 0.0f);
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.start();
                    LinearLayout linearLayout3 = this.w;
                    bu.a(linearLayout3, linearLayout3.getTranslationX(), (float) a2);
                    return;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (bVar2.a() != null) {
                        z3 = ((Boolean) bVar2.a()).booleanValue();
                    } else {
                        z3 = false;
                    }
                    LinearLayout linearLayout4 = this.w;
                    if (linearLayout4 == null) {
                        return;
                    }
                    if (linearLayout4.getVisibility() != 0 || this.w.getAlpha() != 1.0f) {
                        if (z3) {
                            this.w.setVisibility(0);
                            this.w.setTranslationY((float) com.ss.android.ugc.aweme.base.utils.n.a(17.0d));
                            this.w.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).start();
                            return;
                        }
                        LinearLayout linearLayout5 = this.w;
                        com.bytedance.ies.dmt.ui.f.d.a(linearLayout5, linearLayout5.getAlpha(), 1.0f);
                        LinearLayout linearLayout6 = this.w;
                        bu.a(linearLayout6, linearLayout6.getTranslationX(), 0.0f);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void a(View view) {
        int id = view.getId();
        if (id != R.id.csj) {
            boolean z2 = false;
            if (id == R.id.b0p) {
                if (!h()) {
                    w.a(this.ae, this.o, 3, this.ap);
                    this.as = true;
                    Aweme aweme = this.o;
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.k(aweme)) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (!com.ss.android.common.util.f.b(com.bytedance.ies.ugc.appcontext.d.a(), awemeRawAd.getPackageName()) && TextUtils.isEmpty(awemeRawAd.getQuickAppUrl()) && awemeRawAd.getDownloadMode() == 0 && TextUtils.isEmpty(awemeRawAd.getPackageName())) {
                            z2 = true;
                        }
                    }
                    a(z2, true);
                }
            } else if (id == R.id.eo) {
                if (!h()) {
                    w.a(this.ae, this.o, 11, this.ap);
                }
            } else if (id == R.id.fg) {
                if (!h()) {
                    w.a(this.ae, this.o, 14, this.ap);
                }
            } else if (id == R.id.ds) {
                if (!h()) {
                    w.a(this.ae, this.o, 12, this.ap);
                }
            } else if (id == R.id.fe) {
                if (!h()) {
                    w.a(this.ae, this.o, 13, this.ap);
                }
            } else if (id == R.id.gq) {
                if (!h()) {
                    w.a(this.ae, this.o, 15, this.ap);
                }
            } else if (id == R.id.eq || id == R.id.gz) {
                if (!h()) {
                    w.a(this.ae, this.o, 19, this.ap);
                }
            } else if (id == R.id.gs) {
                if (!h()) {
                    w.a(this.ae, this.o, 20, this.ap);
                }
            } else if (id == R.id.g5) {
                if (!h()) {
                    w.a(this.ae, this.o, 21, this.ap);
                }
            } else if ((id == R.id.b0r || id == R.id.b0u) && !h()) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o)) {
                    com.ss.android.ugc.aweme.commercialize.log.j.l(this.ae, this.o);
                    com.ss.android.ugc.aweme.commerce.a.a.d();
                    com.ss.android.ugc.aweme.commerce.a.a.c(this.o);
                }
                a(true, false);
            }
        } else if (!h()) {
            w.a(this.ae, this.o, 2, this.ap);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(FrameLayout frameLayout) {
        float splashShowTime;
        b(2);
        AnimatorSet animatorSet = this.f74209a;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f74209a = animatorSet2;
            animatorSet2.play(ObjectAnimator.ofFloat(this.aF, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.aG, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.Y, "alpha", 0.0f, 1.0f));
            this.f74209a.setStartDelay(260);
            this.f74209a.setDuration(430L);
            this.f74209a.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.commercialize.feed.h.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(45809);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (h.this.f74210b) {
                        h.this.b(4);
                    }
                }
            });
        }
        a aVar = this.ar;
        if (aVar == null || aVar.f74245a) {
            this.ar = new a(this.o);
            AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(this.o);
            if (m2 == null) {
                splashShowTime = 0.0f;
            } else {
                splashShowTime = m2.getSplashShowTime();
            }
            frameLayout.postDelayed(this.ar, (long) splashShowTime);
        }
    }

    private static boolean a(CommerceTagLayout commerceTagLayout, Aweme aweme) {
        if (commerceTagLayout != null && !com.ss.android.ugc.aweme.commercialize.e.a.b.ae(aweme) && com.ss.android.ugc.aweme.commercialize.link.b.a("company_link", aweme, false)) {
            return true;
        }
        return false;
    }

    private void b(boolean z2, boolean z3) {
        this.t.setAlpha(1.0f);
        this.t.animate().alpha(0.0f).setDuration(150).withEndAction(new w(this, z2, z3)).start();
        if (!(this.ae instanceof MainActivity) || !com.ss.android.ugc.aweme.main.c.a().f109217a) {
            this.Y.setAlpha(0.0f);
            this.Y.setVisibility(0);
            this.Y.animate().alpha(1.0f).setDuration(150).start();
            return;
        }
        this.Y.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(int i2, int i3) {
        n.a(this.aD, 4);
        n.a(this.aE, 8);
        com.ss.android.ugc.aweme.ad.feed.card.a aVar = this.W;
        FrameLayout frameLayout = aVar.f65787a;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(14, -1);
            layoutParams2.bottomMargin = 7;
            frameLayout.setLayoutParams(layoutParams2);
        }
        com.ss.android.ugc.aweme.ad.feed.card.d dVar = aVar.f65789c;
        if (dVar != null) {
            dVar.h();
        }
        com.ss.android.ugc.aweme.ad.feed.card.d dVar2 = aVar.f65789c;
        if (dVar2 != null) {
            dVar2.a(i2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bd
    public final void a(int i2, String str) {
        this.ac.a("ACTION_HALF_WEB_PAGE_SHOW", new com.ss.android.ugc.aweme.commercialize.model.h(i2, str));
    }

    public h(VideoBaseCell videoBaseCell, View view, int i2, String str, s<ag> sVar, Fragment fragment) {
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        this.ab = videoBaseCell;
        l.d(videoBaseCell, "");
        h.k.c a2 = ab.a(FeedAdViewModel.class);
        this.bl = (FeedAdViewModel) new com.bytedance.ext_power_list.f(a2, new FeedAdViewModel.a.b(videoBaseCell, a2), FeedAdViewModel.a.c.INSTANCE, new FeedAdViewModel.a.d(videoBaseCell), videoBaseCell, FeedAdViewModel.a.e.INSTANCE, FeedAdViewModel.a.C1672a.INSTANCE).getValue();
        VideoPlayViewModel a3 = VideoPlayViewModel.a.a(videoBaseCell);
        this.bm = a3;
        if (videoBaseCell instanceof ae) {
            a3.f91533j = (com.ss.android.ugc.aweme.feed.adapter.ad) videoBaseCell;
        }
        this.at = i2;
        this.ad = str;
        this.ae = view.getContext();
        this.aU = sVar;
        this.ag = fragment;
        this.aY = new com.ss.android.ugc.aweme.miniapp.card.a(view, str);
        this.af = AdSceneServiceImpl.f();
        this.aS = TcmServiceImpl.j();
        this.ao = this.bg.a();
        this.f74211d = (CircleWaveLayout) view.findViewById(R.id.f363do);
        this.f74212e = (ButtonAdBottomLabelView) view.findViewById(R.id.csj);
        this.f74213f = (AdHalfWebPageContainer) view.findViewById(R.id.ek);
        this.f74214g = (AdHalfWebPageMaskLayer) view.findViewById(R.id.to);
        this.f74215h = (ViewStub) view.findViewById(R.id.ab8);
        this.f74220m = (ViewStub) view.findViewById(R.id.b25);
        this.r = (RemoteImageView) view.findViewById(R.id.g_);
        this.s = (FrameLayout) view.findViewById(R.id.ej);
        this.t = (LinearLayout) view.findViewById(R.id.b0r);
        this.u = (TextView) view.findViewById(R.id.b0p);
        this.v = view.findViewById(R.id.b0u);
        this.w = (LinearLayout) view.findViewById(R.id.q0);
        this.x = (FrameLayout) view.findViewById(R.id.uw);
        this.y = (TextView) view.findViewById(R.id.fg);
        this.z = (AdRatingView) view.findViewById(R.id.g9);
        this.A = view.findViewById(R.id.fd);
        this.B = (TextView) view.findViewById(R.id.d5);
        this.C = (LinearLayout) view.findViewById(R.id.fe);
        this.D = (AdTagGroup) view.findViewById(R.id.gq);
        this.E = (DescTextView) view.findViewById(R.id.ds);
        this.F = (RemoteImageView) view.findViewById(R.id.eo);
        this.G = (RemoteImageView) view.findViewById(R.id.eq);
        this.H = (RemoteImageView) view.findViewById(R.id.gz);
        this.I = (TextView) view.findViewById(R.id.ez);
        this.J = (TextView) view.findViewById(R.id.gr);
        this.K = (LinearLayout) view.findViewById(R.id.g5);
        this.L = (TextView) view.findViewById(R.id.g4);
        this.M = (TextView) view.findViewById(R.id.gb);
        this.N = (CommerceTagLayout) view.findViewById(R.id.caz);
        this.O = (DouPlusTagLayout) view.findViewById(R.id.aoq);
        this.P = (AnimationImageView) view.findViewById(R.id.fh0);
        this.Q = (CommerceMicroTagLayout) view.findViewById(R.id.cm9);
        this.R = (ViewGroup) view.findViewById(R.id.fet);
        this.S = (RemoteImageView) view.findViewById(R.id.feu);
        this.T = (TextView) view.findViewById(R.id.fev);
        this.U = (LinearLayout) view.findViewById(R.id.eb);
        this.V = (TextView) view.findViewById(R.id.b0l);
        View findViewById = view.findViewById(R.id.uw);
        if (findViewById != null) {
            findViewById.setOnClickListener(new i(this));
        }
        View findViewById2 = view.findViewById(R.id.b0p);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new j(this));
        }
        View findViewById3 = view.findViewById(R.id.b0r);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new u(this));
        }
        View findViewById4 = view.findViewById(R.id.b0u);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new af(this));
        }
        View findViewById5 = view.findViewById(R.id.csj);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new ap(this));
        }
        View findViewById6 = view.findViewById(R.id.eo);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new aq(this));
        }
        View findViewById7 = view.findViewById(R.id.ds);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new ar(this));
        }
        View findViewById8 = view.findViewById(R.id.fg);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new as(this));
        }
        View findViewById9 = view.findViewById(R.id.fe);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new at(this));
        }
        View findViewById10 = view.findViewById(R.id.gq);
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(new au(this));
        }
        View findViewById11 = view.findViewById(R.id.eq);
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(new k(this));
        }
        View findViewById12 = view.findViewById(R.id.gz);
        if (findViewById12 != null) {
            findViewById12.setOnClickListener(new l(this));
        }
        View findViewById13 = view.findViewById(R.id.gs);
        if (findViewById13 != null) {
            findViewById13.setOnClickListener(new m(this));
        }
        View findViewById14 = view.findViewById(R.id.g5);
        if (findViewById14 != null) {
            findViewById14.setOnClickListener(new n(this));
        }
        this.Y = (RelativeLayout) view.findViewById(R.id.fmg);
        this.aD = view.findViewById(R.id.epk);
        this.aE = view.findViewById(R.id.a_6);
        this.aF = view.findViewById(R.id.bct);
        this.aG = view.findViewById(R.id.bcv);
        this.aH = (FrameLayout) view.findViewById(R.id.bqg);
        this.aC = (FrameLayout) view.findViewById(R.id.c4q);
        this.P = (AnimationImageView) view.findViewById(R.id.fh0);
        this.aI = (TagLayout) view.findViewById(R.id.fhk);
        this.aJ = (MicroAppVideoCardView) view.findViewById(R.id.cm8);
        if (ae() && (viewStub3 = (ViewStub) view.findViewById(R.id.fjn)) != null) {
            com.ss.android.ugc.aweme.ad.feed.mask.c cVar = new com.ss.android.ugc.aweme.ad.feed.mask.c();
            cVar.f65975f = viewStub3;
            com.ss.android.ugc.aweme.commercialize_ad_api.b.a c2 = CommercializeAdServiceImpl.a().c(this.ae, cVar);
            if (c2 instanceof g) {
                this.bc = (g) c2;
            }
        }
        this.av = (LinearLayout) view.findViewById(R.id.du);
        this.aw = (RichTagView) view.findViewById(R.id.dt);
        this.ax = (TuxTextView) view.findViewById(R.id.cmp);
        this.ay = (TuxTextView) view.findViewById(R.id.cmo);
        ICommerceEggService c3 = CommerceEggServiceImpl.c();
        this.aN = c3;
        if (!(c3 == null || (viewStub2 = this.f74215h) == null)) {
            this.aL = c3.a(viewStub2);
        }
        ITcmService iTcmService = this.aS;
        if (!(iTcmService == null || (viewStub = this.f74220m) == null)) {
            this.aT = iTcmService.a(viewStub);
        }
        this.aM = new com.ss.android.ugc.aweme.commercialize.feed.b.a(view, this.ae, videoBaseCell);
        this.f74216i = (ViewStub) view.findViewById(R.id.b22);
        this.f74218k = (ViewStub) view.findViewById(R.id.b21);
        this.f74219l = (ViewStub) view.findViewById(R.id.b0v);
        this.W = new com.ss.android.ugc.aweme.ad.feed.card.a(view);
        this.f74217j = (ViewStub) view.findViewById(R.id.fjn);
        IFeedAdService iFeedAdService = this.bg;
        if (iFeedAdService != null) {
            this.az = iFeedAdService.a(this.f74216i);
            this.aA = this.bg.b(this.f74217j);
            this.X = this.bg.c(this.f74218k);
            this.aB = this.bg.d(this.f74219l);
            com.ss.android.ugc.aweme.ad.feed.g.b a4 = this.bg.a(view);
            this.an = a4;
            a4.a(this.bo);
        }
        ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new o(this));
        }
        g gVar = new g(this, this.ae);
        this.bk = gVar;
        videoBaseCell.a(gVar);
    }
}

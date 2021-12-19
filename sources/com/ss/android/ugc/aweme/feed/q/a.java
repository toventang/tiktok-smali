package com.ss.android.ugc.aweme.feed.q;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.b.b;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.c.p;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bullet.module.ad.k;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.comment.i.c;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.ss.android.ugc.aweme.commercialize.utils.bk;
import com.ss.android.ugc.aweme.commercialize.utils.bq;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.al;
import com.ss.android.ugc.aweme.detail.ui.am;
import com.ss.android.ugc.aweme.experiment.Cdo;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.experiment.ev;
import com.ss.android.ugc.aweme.experiment.fe;
import com.ss.android.ugc.aweme.experiment.fh;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.e;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.e.o;
import com.ss.android.ugc.aweme.feed.experiment.ah;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.helper.u;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.h;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.i.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.n.f;
import com.ss.android.ugc.aweme.feed.u.af;
import com.ss.android.ugc.aweme.feed.u.v;
import com.ss.android.ugc.aweme.feed.u.y;
import com.ss.android.ugc.aweme.feed.u.z;
import com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar;
import com.ss.android.ugc.aweme.feed.ui.bh;
import com.ss.android.ugc.aweme.feed.ui.bn;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.feed.x.ad;
import com.ss.android.ugc.aweme.feed.x.q;
import com.ss.android.ugc.aweme.feed.x.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.service.model.n;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.ax;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.preload.a.e;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.preload.b.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.setting.bg;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.share.af;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.aweme.ug.guide.b;
import com.ss.android.ugc.aweme.ug.guide.d;
import com.ss.android.ugc.aweme.ug.guide.j;
import com.ss.android.ugc.aweme.ug.guide.l;
import com.ss.android.ugc.aweme.ug.guide.m;
import com.ss.android.ugc.aweme.utils.cv;
import com.ss.android.ugc.aweme.utils.ej;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a extends v implements WeakHandler.IHandler, c.e, d<Aweme>, l, s<ag>, al, v, VideoDownloadStatusBar.c, r, bg, bg, i, j {
    protected static final String J = a.class.getSimpleName();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f93691k = false;
    private b A;
    private int B;
    public long K;
    protected boolean L;
    public LoadMoreFrameLayout M;
    public VerticalViewPager N;
    protected View O;
    protected View P;
    protected VideoDownloadStatusBar Q;
    protected ViewStub R;
    protected NewUserFeedProgressBar S;
    protected ViewStub T;
    protected FeedSwipeRefreshLayout U;
    protected DiggLayout V;
    public com.ss.android.ugc.aweme.feed.adapter.b W;
    protected boolean X;
    public int Y;
    protected WeakHandler Z;

    /* renamed from: a  reason: collision with root package name */
    private final float f93692a;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    Runnable aD;
    protected String aE;
    protected com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b aF;
    public boolean aG;
    protected final e aH;
    protected Boolean aI;
    public com.ss.android.ugc.aweme.feed.param.b aJ;
    public o aK;
    protected final com.ss.android.ugc.aweme.feed.e.e aL;
    public boolean aM;
    public int aN;
    protected com.ss.android.ugc.aweme.feed.guide.a.a aO;
    protected boolean aP;
    protected boolean aQ;
    protected boolean aR;
    protected boolean aS;
    protected boolean aT;
    public boolean aU;
    protected com.ss.android.ugc.aweme.share.viewmodel.a aV;
    protected boolean aW;
    public String aX;
    protected aj aY;
    protected int aZ;
    protected String aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public Set<String> ae;
    final ArrayList<String> af;
    protected boolean ag;
    public String ah;
    public String ai;
    com.bytedance.tux.tooltip.a aj;
    public boolean ak;
    public boolean al;
    protected boolean am;
    View an;
    View ao;
    ViewGroup ap;
    ViewGroup aq;
    protected com.ss.android.ugc.aweme.feed.n.c ar;
    public com.ss.android.ugc.aweme.feed.n.d as;
    public f at;
    ImageView au;
    protected w av;
    protected com.bytedance.ies.dmt.ui.b.b aw;
    protected boolean ax;
    protected boolean ay;
    public boolean az;

    /* renamed from: b  reason: collision with root package name */
    private z f93693b;
    protected boolean ba;
    protected boolean bb;
    public boolean bc;
    public boolean bd;
    public Object be;
    boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    public boolean bj;
    protected boolean bk;
    int bl;
    public boolean bm;
    public int bn;
    public final VerticalViewPager.f bo;
    public String bp;
    public boolean bq;
    protected com.ss.android.ugc.aweme.feed.t.a br;
    protected com.ss.android.ugc.aweme.ug.guide.d bs;
    protected com.ss.android.ugc.aweme.ug.guide.l bt;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.d.a f93694c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.u.ag f93695d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f93696e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f93697f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.commercialize.b f93698g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f93699h;

    /* renamed from: i  reason: collision with root package name */
    private bn f93700i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f93701j;

    /* renamed from: l  reason: collision with root package name */
    private int f93702l;

    /* renamed from: m  reason: collision with root package name */
    private an f93703m;
    private com.ss.android.ugc.aweme.video.i n;
    private String o;
    private final aw p;
    private long q;
    private final IAccountService.b r;
    private final long s;
    private final com.ss.android.ugc.aweme.feed.x.a t;
    private Aweme u;
    private final List<Callable> v;
    private Boolean w;
    private boolean x;
    private final String y;
    private final String z;

    public void A() {
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public boolean E() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public abstract boolean F();

    /* access modifiers changed from: protected */
    public ViewGroup N() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean Q() {
        return true;
    }

    public boolean S() {
        return false;
    }

    public abstract com.ss.android.ugc.aweme.feed.adapter.b a(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, l lVar);

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z2) {
    }

    public void a(long j2, long j3) {
    }

    /* access modifiers changed from: protected */
    public void aP() {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public boolean ac() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ap() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String aq() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ar() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v
    public final boolean aw_() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public void ax_() {
    }

    /* access modifiers changed from: protected */
    public void bE() {
    }

    @Override // com.ss.android.ugc.aweme.setting.bg
    public final void bH() {
        f93691k = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final void bJ() {
        this.bq = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bQ() {
        this.ba = false;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.e
    public void bm_() {
    }

    public abstract void c(int i2);

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public void d(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v
    public void d(Exception exc) {
    }

    public void e(int i2) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(92, new g(a.class, "onDeleteAwemeEventOnBase", com.ss.android.ugc.aweme.feed.i.e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(93, new g(a.class, "onCleanModeChangedEvent", com.ss.android.ugc.aweme.main.c.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(94, new g(a.class, "onDismissEnterMusicGuideEvent", com.ss.android.ugc.aweme.main.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(95, new g(a.class, "onShareFinished", com.ss.android.ugc.aweme.share.e.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(96, new g(a.class, "onCommentBubbleItemClicked", com.ss.android.ugc.aweme.comment.c.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(97, new g(a.class, "onFakeSwipeEvent", com.ss.android.ugc.aweme.ug.guide.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new g(a.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(98, new g(a.class, "onEvent", com.ss.android.ugc.aweme.ad.feed.button.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(99, new g(a.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(100, new g(a.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new g(a.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(101, new g(a.class, "onDismissInteractStickerPop", h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(102, new g(a.class, "onLandPagePopupWebShowEvent", k.class, ThreadMode.POSTING, 0, false));
        hashMap.put(103, new g(a.class, "onPrivateModelEvent", com.ss.android.ugc.aweme.feed.i.w.class, ThreadMode.POSTING, 0, false));
        hashMap.put(104, new g(a.class, "onTabSwitched", com.ss.android.ugc.aweme.share.model.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(105, new g(a.class, "onAdFeedRefreshEvent", com.ss.android.ugc.aweme.ad.feed.c.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(106, new g(a.class, "onAddVideoToMixEvent", com.ss.android.ugc.aweme.mix.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(107, new g(a.class, "onEvent", com.ss.android.ugc.aweme.al.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(108, new g(a.class, "initTopPageEvent", com.ss.android.ugc.aweme.feed.i.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(109, new g(a.class, "onEvent", n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(110, new g(a.class, "onCommentListPageDialogEvent", com.ss.android.ugc.aweme.comment.c.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(111, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.views.cards.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(112, new g(a.class, "onLoginPageCloseEvent", com.ss.android.ugc.aweme.login.a.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(113, new g(a.class, "onBottomTabClicked", com.ss.android.ugc.aweme.share.h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(114, new g(a.class, "onCreateMixListSuccess", com.ss.android.ugc.aweme.mix.b.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(115, new g(a.class, "onFeedDislikeEventEvent", com.ss.android.ugc.aweme.feed.i.l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(116, new g(a.class, "onFakeLabelEvent", com.ss.android.ugc.aweme.comment.c.g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(117, new g(a.class, "onEvent", x.class, ThreadMode.POSTING, 0, false));
        hashMap.put(118, new g(a.class, "onPopUpShowEvent", com.ss.android.ugc.aweme.ug.guide.i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(119, new g(a.class, "onEvent", ae.class, ThreadMode.POSTING, 0, false));
        hashMap.put(120, new g(a.class, "onEvent", com.ss.android.ugc.aweme.feed.i.n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(61, new g(a.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(121, new g(a.class, "onDismissEnterMusicGuideEvent", com.ss.android.ugc.aweme.feed.i.g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(44, new g(a.class, "onTabChangeEvent", m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(122, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.event.g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(51, new g(a.class, "onPublishStatus", com.ss.android.ugc.aweme.shortvideo.j.f.class, ThreadMode.POSTING, -1, true));
        hashMap.put(123, new g(a.class, "onTopViewLiveEnd", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new g(a.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(124, new g(a.class, "onUpdateMixVideoDesc", com.ss.android.ugc.aweme.mix.b.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(125, new g(a.class, "onRestrictEvent", com.ss.android.ugc.aweme.setting.d.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(126, new g(a.class, "onReceiveDislikeAwemeEvent", com.ss.android.ugc.aweme.feed.i.f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(6, new g(a.class, "onVideoPlayerEvent", com.ss.android.ugc.aweme.shortvideo.j.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(127, new g(a.class, "onFeedAdClickCouponEvent", com.ss.android.ugc.aweme.commercialize.event.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(128, new g(a.class, "onScrolledToProfileTab", com.ss.android.ugc.aweme.share.model.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(129, new g(a.class, "onNetStateChangeEvent", com.ss.android.ugc.aweme.common.net.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(130, new g(a.class, "onFeedAdClickFormEvent", com.ss.android.ugc.aweme.commercialize.event.e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(131, new g(a.class, "onRegisterProgressEvent", p.class, ThreadMode.MAIN, 0, false));
        hashMap.put(132, new g(a.class, "onReplayEvent", com.ss.android.ugc.aweme.commercialize.views.cards.aj.class, ThreadMode.POSTING, 0, false));
        hashMap.put(133, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.event.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(134, new g(a.class, "onLoginPageShowEvent", com.ss.android.ugc.aweme.login.a.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(135, new g(a.class, "onChangePlayListNameEvent", com.ss.android.ugc.aweme.mix.b.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(136, new g(a.class, "onPushNotificationDialogShowed", com.ss.android.ugc.aweme.ug.guide.f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(87, new g(a.class, "onEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(137, new g(a.class, "onRemoveVideoToMixEvent", com.ss.android.ugc.aweme.mix.b.i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(138, new g(a.class, "onPollEvent", com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(30, new g(a.class, "onEvent", com.ss.android.ugc.aweme.commercialize.views.cards.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @org.greenrobot.eventbus.r
    public void onBottomTabClicked(com.ss.android.ugc.aweme.share.h hVar) {
    }

    public void p() {
    }

    public void s() {
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    public boolean z() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public String M() {
        return this.aE;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final VerticalViewPager aQ() {
        return this.N;
    }

    public final void aW() {
        bz();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final com.ss.android.ugc.aweme.feed.param.b as() {
        return this.aJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void az() {
        bE();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final boolean bI() {
        return this.aG;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final boolean bK() {
        return this.ad;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final boolean bb() {
        return this.bi;
    }

    public a a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        this.aJ = bVar;
        if (bVar.getFrom() != null) {
            this.bk = bVar.getFrom().equals("from_publish_add_video");
        }
        com.ss.android.ugc.aweme.feed.e.e eVar = this.aL;
        String from = bVar.getFrom();
        for (com.ss.android.ugc.aweme.feed.e.d dVar : eVar.f92906a) {
            dVar.b(from);
        }
        com.ss.android.ugc.aweme.feed.e.e eVar2 = this.aL;
        String enterMethodValue = bVar.getEnterMethodValue();
        for (com.ss.android.ugc.aweme.feed.e.d dVar2 : eVar2.f92906a) {
            dVar2.f92902g = enterMethodValue;
        }
        this.aK.y = bVar.getReactSessionId();
        com.ss.android.ugc.aweme.feed.e.e eVar3 = this.aL;
        String eventType = bVar.getEventType();
        for (com.ss.android.ugc.aweme.feed.e.d dVar3 : eVar3.f92906a) {
            dVar3.f92899d = eventType;
        }
        com.ss.android.ugc.aweme.feed.e.e eVar4 = this.aL;
        int pageType = bVar.getPageType();
        for (com.ss.android.ugc.aweme.feed.e.d dVar4 : eVar4.f92906a) {
            dVar4.f92900e = pageType;
        }
        com.ss.android.ugc.aweme.feed.e.e eVar5 = this.aL;
        String previousPage = bVar.getPreviousPage();
        for (com.ss.android.ugc.aweme.feed.e.d dVar5 : eVar5.f92906a) {
            dVar5.f92904i = previousPage;
        }
        com.ss.android.ugc.aweme.feed.e.e eVar6 = this.aL;
        String fromGroupId = bVar.getFromGroupId();
        for (com.ss.android.ugc.aweme.feed.e.d dVar6 : eVar6.f92906a) {
            dVar6.f92905j = fromGroupId;
        }
        this.aH.a(bVar.getCreationId());
        return this;
    }

    public void a(com.ss.android.ugc.aweme.feed.n.c cVar) {
        this.ar = cVar;
    }

    public final void a(ViewPager.e eVar) {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager != null) {
            verticalViewPager.a(eVar);
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.i iVar) {
        this.n = iVar;
        this.aK.O = iVar;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z2, boolean z3) {
        r(z2);
        if (!z3 || ad.a(this.aJ.getEventType())) {
            aj bf2 = bf();
            if (bf2 != null) {
                bf2.c(z2);
            }
            SharePrefCache.inst().getHasLongPressDislike().b(true);
            boolean z4 = !z2;
            this.U.setCanTouch(z4);
            this.N.setCanTouch(z4);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(jVar);
        }
        m();
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.l lVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(lVar);
        }
        m();
    }

    @org.greenrobot.eventbus.r
    public void onEvent(n nVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(nVar);
        }
        aK();
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public final void a(Activity activity, Fragment fragment) {
        super.a(activity, fragment);
        for (com.ss.android.ugc.aweme.feed.e.d dVar : this.aL.f92906a) {
            dVar.a(activity, fragment);
        }
        try {
            for (Callable callable : this.v) {
                callable.call();
            }
            this.v.clear();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z2) {
        this.aK.a(str, z2, (aj) null);
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) j2;
            HomePageDataViewModel.a.a(eVar).f99126i.observe(eVar, new c(this));
        }
        this.M = (LoadMoreFrameLayout) view.findViewById(R.id.cic);
        this.N = (VerticalViewPager) view.findViewById(R.id.fk_);
        this.O = view.findViewById(R.id.ep9);
        this.P = view.findViewById(R.id.w9);
        if (com.ss.android.ugc.aweme.s.e.d()) {
            this.R = (ViewStub) view.findViewById(R.id.ap_);
            this.T = (ViewStub) view.findViewById(R.id.cuv);
        }
        if (this.R == null) {
            VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) view.findViewById(R.id.ap9);
            this.Q = videoDownloadStatusBar;
            videoDownloadStatusBar.setVideoDownloadClickListener(this);
        }
        if (this.T == null) {
            this.S = (NewUserFeedProgressBar) view.findViewById(R.id.cuu);
        }
        VideoDownloadStatusBar.f94169h.add(this);
        this.U = (FeedSwipeRefreshLayout) view.findViewById(R.id.dk8);
        this.V = (DiggLayout) view.findViewById(R.id.am5);
        this.an = view.findViewById(R.id.eob);
        this.ao = view.findViewById(R.id.vj);
        this.ap = (ViewGroup) view.findViewById(R.id.eoc);
        this.aq = (ViewGroup) view.findViewById(R.id.vk);
        this.L = true;
        try {
            androidx.fragment.app.i bW = bW();
            Fragment a2 = bW.a(UGCMonitor.EVENT_COMMENT);
            if (a2 != null) {
                androidx.fragment.app.n a3 = bW.a();
                a3.a(a2);
                a3.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (bA()) {
            this.aa = com.ss.android.ugc.aweme.player.e.a("scene_feed" + getClass().getSimpleName() + hashCode());
        } else {
            this.aa = com.ss.android.ugc.aweme.player.e.a("scene_home_page" + getClass().getSimpleName() + hashCode());
        }
        this.U.setViewPager(this.N);
        this.Z = new WeakHandler(this);
        com.ss.android.ugc.aweme.feed.adapter.b a4 = a(this.bv, LayoutInflater.from(this.bv), this, az_(), com.ss.android.ugc.aweme.feed.x.r.a(this.bv, this.Z, this.ag, new r.a() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass11 */

            static {
                Covode.recordClassIndex(59623);
            }

            @Override // com.ss.android.ugc.aweme.feed.x.r.a
            public final void a(int i2) {
                a.this.c(i2);
            }

            @Override // com.ss.android.ugc.aweme.feed.x.r.a
            public final void a(MotionEvent motionEvent) {
                Aweme aD = a.this.aD();
                if ((!com.ss.android.ugc.aweme.story.c.b.b() || !com.ss.android.ugc.aweme.story.d.a.c(aD)) && !com.ss.android.ugc.aweme.story.d.a.f(com.ss.android.ugc.aweme.story.d.a.i(aD))) {
                    a.this.a(motionEvent);
                }
            }
        }), BaseFeedPageParams.newBuilder().setAwemeFromPage(L()).setEventType(this.aJ.getEventType()).setParam(this.aJ).setMyProfile(TextUtils.equals("from_profile_self", this.aJ.getFrom())).setFromPostList(this.aJ.isFromPostList()).setPageType(this.aJ.getPageType()).setShowVote(this.aJ.isShowPoll()).setCid(this.aJ.getCid()).setChallengeId(this.aJ.getChallengeId()), this);
        this.W = a4;
        a4.f91655e = t();
        this.N.setAdapter(this.W);
        if (w()) {
            this.N.setOnGenericMotionListener(new View.OnGenericMotionListener() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass20 */

                static {
                    Covode.recordClassIndex(59633);
                }

                public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                    if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || a.this.N == null || a.this.N.getScrollState() != 0 || a.this.aP) {
                        return false;
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a(3, a.J, "onGenericMotionEvent action scroll");
                    if (motionEvent.getAxisValue(9) < 0.0f) {
                        if (a.this.N.canScrollVertically(1)) {
                            a.this.N.setCurrentItem(a.this.N.getCurrentItem() + 1);
                            return true;
                        }
                    } else if (a.this.N.canScrollVertically(-1)) {
                        a.this.N.setCurrentItem(a.this.N.getCurrentItem() - 1);
                        return true;
                    }
                    return false;
                }
            });
        }
        final Activity activity = this.bv;
        if (activity != null && (activity instanceof com.ss.android.ugc.aweme.main.j)) {
            this.az = ((com.ss.android.ugc.aweme.main.j) activity).hasRegistedResumeAction();
        }
        this.N.a(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass14 */

            /* renamed from: a  reason: collision with root package name */
            int f93714a = -1;

            /* renamed from: b  reason: collision with root package name */
            int f93715b = -1;

            /* renamed from: c  reason: collision with root package name */
            int f93716c = -1;

            /* renamed from: d  reason: collision with root package name */
            boolean f93717d;

            /* renamed from: e  reason: collision with root package name */
            float f93718e;

            /* renamed from: f  reason: collision with root package name */
            boolean f93719f;

            /* renamed from: g  reason: collision with root package name */
            boolean f93720g;

            /* renamed from: h  reason: collision with root package name */
            int f93721h = -1;

            static {
                Covode.recordClassIndex(59626);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(int i2) {
                b(i2);
                com.ss.android.ugc.aweme.ca.h.f69606a = true;
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                if (com.ss.android.ugc.aweme.ca.h.a()) {
                    com.ss.android.ugc.aweme.db.a.a(new s(this, i2));
                } else {
                    b(i2);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
                boolean z;
                this.f93721h = i2;
                a aVar = a.this;
                if (i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.bi = z;
                aj bf = a.this.bf();
                if (bf != null) {
                    bf.b_(a.this.Y, i2);
                }
                if (i2 == 1) {
                    Cdo.f89814d = System.currentTimeMillis();
                    a.this.bB();
                    if (bf != null) {
                        bf.k();
                    }
                } else if (i2 == 0) {
                    a.this.bj = false;
                    if (!this.f93719f) {
                        this.f93720g = false;
                        Cdo.f89813c = System.currentTimeMillis() - Cdo.f89814d;
                        if (bf != null) {
                            bf.h();
                            if (ah.a(a.this.aJ.getEventType()) && !a.b(bf)) {
                                com.ss.android.ugc.aweme.video.k.a().b();
                            }
                        }
                    }
                } else if (i2 == 2) {
                    a.this.aK.L();
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.c(a.this.aD(), i2, a.this.aJ.getEventType()));
                a.this.e(i2);
            }

            /* JADX WARNING: Removed duplicated region for block: B:135:0x02f0  */
            /* JADX WARNING: Removed duplicated region for block: B:138:0x0304  */
            /* JADX WARNING: Removed duplicated region for block: B:177:0x0421  */
            /* JADX WARNING: Removed duplicated region for block: B:180:0x0448  */
            /* JADX WARNING: Removed duplicated region for block: B:187:0x04a8  */
            /* JADX WARNING: Removed duplicated region for block: B:190:0x04c8  */
            /* JADX WARNING: Removed duplicated region for block: B:193:0x04d5  */
            /* JADX WARNING: Removed duplicated region for block: B:196:0x0520  */
            /* JADX WARNING: Removed duplicated region for block: B:199:0x0543  */
            /* JADX WARNING: Removed duplicated region for block: B:237:0x05ed  */
            /* JADX WARNING: Removed duplicated region for block: B:239:0x05f4  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void b(int r20) {
                /*
                // Method dump skipped, instructions count: 1590
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.a.AnonymousClass14.b(int):void");
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                boolean z;
                boolean z2;
                if (a.this.bw.getActivity() != null) {
                    if (!a.this.bj) {
                        a.this.bj = true;
                        a.this.p(false);
                    }
                    if (this.f93721h == 1) {
                        if (i2 == a.this.Y && f2 > 0.0f) {
                            a.this.aK.a(i2, true);
                        } else if (i2 < a.this.Y && (!com.ss.android.ugc.aweme.player.a.f114913a ? com.bytedance.ies.abmock.b.a().a(true, "player_prerender_prev_enable", 1) == 1 : ((Boolean) com.ss.android.ugc.aweme.player.c.f115055d.getValue()).booleanValue())) {
                            a.this.aK.a(i2, false);
                        }
                    }
                    if (i2 != a.this.Y) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f93719f = z;
                    boolean z3 = a.this.aM;
                    if (a.this.aM && f2 == 0.0f && i3 == 0) {
                        onPageSelected(i2);
                        a.this.aM = false;
                    }
                    if (((float) i3) != 0.0f) {
                        this.f93717d = true;
                    }
                    if (a.this.ax) {
                        a.this.ax = false;
                        return;
                    }
                    this.f93718e = f2;
                    if (i2 == this.f93714a && f2 < 1.0E-10f) {
                        a.this.Y = i2;
                        this.f93714a = -1;
                        a.this.s();
                        a.this.u();
                        a.this.aP();
                        View l2 = a.this.l(false);
                        if (l2 != null) {
                            l2.setAlpha(0.0f);
                        }
                        if (!z3) {
                            a.this.ad = true;
                        }
                        Aweme c2 = a.this.W.c(i2);
                        if (c2 == null || c2.isLive() || c2.isCanPlay()) {
                            ServiceManager.get().getService(IFeedDebugService.class);
                            if (!MainPageExperimentServiceImpl.b().a() || a.this.bu) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (a.this.bl() && !com.ss.android.ugc.aweme.feed.x.m.e(c2) && a.this.bq && !z2 && !com.ss.android.ugc.aweme.commercialize.e.a.b.aW(c2)) {
                                if (com.ss.android.ugc.aweme.utils.z.a(c2)) {
                                    new com.ss.android.ugc.aweme.tux.a.i.a(a.this.bv).a(R.string.hfj).a();
                                } else if (c2.isLive()) {
                                    com.ss.android.ugc.aweme.video.k.a();
                                    if (com.ss.android.ugc.aweme.video.local.f.f143475a && a.this.bf() != null) {
                                        a.this.bf().r();
                                    }
                                } else {
                                    a.this.aN().a(a.this.aK.K());
                                    if (com.ss.android.ugc.aweme.video.local.f.f143475a && a.this.bf() != null) {
                                        a.this.bf().C();
                                        a.this.aN().x();
                                    }
                                    if (!com.ss.android.ugc.aweme.story.d.a.e(a.this.bL())) {
                                        a.this.bd();
                                    }
                                }
                            }
                            a.this.bw();
                        } else {
                            return;
                        }
                    }
                    if (i2 == a.this.Y) {
                        float f3 = (float) (-i3);
                        a.this.l(true).setTranslationY(f3);
                        a.this.V.setTranslationY(f3);
                        if (a.this.aw != null && a.this.aB) {
                            a.this.bz();
                        }
                    } else {
                        int measuredHeight = a.this.M.getMeasuredHeight();
                        if (measuredHeight == 0) {
                            measuredHeight = com.bytedance.common.utility.n.b(a.this.bv);
                        }
                        if (c.b.f66221a.q) {
                            measuredHeight = c.b.f66221a.f66201j;
                        }
                        float f4 = (float) (measuredHeight - i3);
                        a.this.l(true).setTranslationY(f4);
                        a.this.V.setTranslationY(f4);
                        if (a.this.aw != null && a.this.aB) {
                            a.this.bz();
                        }
                    }
                    Aweme c3 = a.this.W.c(a.this.Y);
                    if (ah.a(a.this.aJ.getEventType()) && c3 != null && !c3.isLive() && !this.f93720g && this.f93721h == 1) {
                        if (f2 > 0.5f) {
                            Aweme c4 = a.this.W.c(i2);
                            if (c4 != null && c4.isLive()) {
                                a.this.a(c4, false, a.this.bh());
                                this.f93720g = true;
                            }
                        } else {
                            Aweme c5 = a.this.W.c(i2 + 1);
                            if (c5 != null && c5.isLive()) {
                                a.this.a(c5, false, a.this.bg());
                                this.f93720g = true;
                            }
                        }
                    }
                    a.this.bm = true;
                }
            }
        });
        this.N.setOnUserSwipeUpListener(this.bo);
        z zVar = new z();
        this.f93693b = zVar;
        zVar.a(new y());
        this.f93693b.a_(this);
        w i2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
        this.av = i2;
        i2.a(this);
        com.ss.android.ugc.aweme.feed.u.ag agVar = new com.ss.android.ugc.aweme.feed.u.ag();
        this.f93695d = agVar;
        agVar.a(new af());
        this.f93695d.a_(this);
        this.aH.a();
        this.M.setOnScrolledListener(new LoadMoreFrameLayout.c() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass15 */

            static {
                Covode.recordClassIndex(59627);
            }

            @Override // com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.c
            public final void a(int i2) {
                View l2 = a.this.l(true);
                if (l2 != null) {
                    l2.setTranslationY((float) i2);
                }
                if (a.this.V != null) {
                    a.this.V.setTranslationY((float) i2);
                }
                a.this.bz();
            }
        });
        this.M.setOnGestureTriggerExit(new LoadMoreFrameLayout.a() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass16 */

            static {
                Covode.recordClassIndex(59628);
            }

            @Override // com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.a
            public final void a() {
                Activity activity = activity;
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        this.ac = true;
        com.ss.android.ugc.aweme.feed.d.a aVar = new com.ss.android.ugc.aweme.feed.d.a();
        this.f93694c = aVar;
        this.aK.o = aVar;
        if (!com.ss.android.ugc.aweme.s.d.k()) {
            G();
        }
        TextUtils.equals(this.aJ.getEventType(), "homepage_hot");
        this.aF = this.U;
        this.N.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass17 */

            static {
                Covode.recordClassIndex(59629);
            }

            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (i2 != i6 || i3 != i7 || i5 != i9 || i4 != i8) {
                    a.this.aU();
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            this.N.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass18 */

                static {
                    Covode.recordClassIndex(59630);
                }

                public final void run() {
                    WindowInsets rootWindowInsets;
                    if (a.this.N != null && (rootWindowInsets = a.this.N.getRootWindowInsets()) != null) {
                        boolean z = true;
                        Object a2 = com.bytedance.common.utility.reflect.c.a(WindowInsets.class, "getDisplayCutout", rootWindowInsets);
                        c cVar = c.b.f66221a;
                        if (a2 == null) {
                            z = false;
                        }
                        cVar.r = z;
                    }
                }
            }, 200);
        }
        this.aV = a.C3244a.a(this.bv);
        com.ss.android.ugc.aweme.ug.guide.l lVar = new com.ss.android.ugc.aweme.ug.guide.l(this, this.aV);
        this.bt = lVar;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar2 = lVar.f141937b;
        l.b bVar = new l.b(lVar);
        h.f.b.l.d(bVar, "");
        aVar2.a("comment_panel", bVar);
        com.ss.android.ugc.aweme.ug.guide.l lVar2 = this.bt;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar3 = lVar2.f141937b;
        l.c cVar = new l.c(lVar2);
        h.f.b.l.d(cVar, "");
        aVar3.a("login_panel", cVar);
        com.ss.android.ugc.aweme.ug.guide.l lVar3 = this.bt;
        com.ss.android.ugc.aweme.share.viewmodel.a aVar4 = lVar3.f141937b;
        l.d dVar = new l.d(lVar3);
        h.f.b.l.d(dVar, "");
        aVar4.a("share_panel", dVar);
        if (az_() != null) {
            a.C1541a.f68149a.a("video_download_status").observe(az_(), new b(this));
        }
        j(aD());
    }

    public final void a(int i2, aj ajVar) {
        Runnable runnable = this.aD;
        if (runnable != null) {
            runnable.run();
            this.aD = null;
        }
        this.aD = new m(this, ajVar, i2);
        if (fe.b()) {
            if (com.ss.android.ugc.aweme.db.a.a(this.aD)) {
                return;
            }
        } else if (fe.f90030a == 2) {
            if (this.f93696e == null) {
                this.f93696e = new Handler(Looper.getMainLooper());
            }
            Message obtain = Message.obtain(this.f93696e, this.aD);
            if (Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
            }
            this.f93696e.sendMessageAtFrontOfQueue(obtain);
            return;
        } else if (fe.f90030a == 3) {
            this.N.postOnAnimation(this.aD);
            return;
        } else if (fe.f90030a == 4) {
            this.N.postOnAnimation(new n(this));
            return;
        }
        this.aD.run();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(aj ajVar, int i2) {
        if (this.N != null) {
            a(ajVar);
            g(i2);
            this.aD = null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(aj ajVar) {
        if (ajVar != null) {
            ajVar.g();
            if (com.ss.android.ugc.aweme.story.d.a.e(bL())) {
                aw awVar = this.p;
                Aweme b2 = ajVar.b();
                h.f.b.l.d(b2, "");
                if (com.ss.android.ugc.aweme.story.d.a.c(b2)) {
                    awVar.f93778a.F();
                }
            }
            ajVar.b(System.currentTimeMillis());
        }
        aj ajVar2 = null;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager != null) {
            int childCount = verticalViewPager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                aj ajVar3 = (aj) this.N.getChildAt(i2).getTag(R.id.b1q);
                if (b(this.N.getCurrentItem(), ajVar3)) {
                    ajVar2 = ajVar3;
                }
            }
        }
        this.aY = ajVar2;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, Aweme aweme) {
        this.W.f(i2);
    }

    public final void a(MotionEvent motionEvent) {
        aj bj2;
        if (!this.aI.booleanValue() && !this.bk && (bj2 = bj()) != null) {
            Aweme b2 = bj2.b();
            if (com.ss.android.ugc.aweme.story.d.a.c(b2)) {
                b2 = com.ss.android.ugc.aweme.story.d.a.i(b2);
            }
            a(motionEvent, bj2, b2);
        }
    }

    /* access modifiers changed from: protected */
    public final String a(Aweme aweme, boolean z2, aj ajVar) {
        if (this.az && aweme != null) {
            this.bp = aweme.getAid();
        }
        if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
            return this.p.a();
        }
        return this.aK.a(aweme, z2, ajVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.ss.android.ugc.aweme.feed.q.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.ss.android.ugc.aweme.feed.i.ag r16) {
        /*
        // Method dump skipped, instructions count: 1914
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.a.a(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, String str, int i2, ag agVar, String str2, int i3) {
        HashMap<String, String> a2;
        w wVar = this.av;
        if (wVar != null && wVar.i()) {
            a(aweme, str, true, i2, agVar);
            w wVar2 = this.av;
            n.a d2 = new n.a().a(str).b(str2).a(aweme.getAuthor().isSecret() || aweme.getAuthor().isPrivateAccount()).a(1).c(this.aJ.getEventType()).d(com.ss.android.ugc.aweme.feed.x.m.f(com.ss.android.ugc.aweme.feed.x.g.b(bf()))).a(aweme).e(agVar.f93454e).c(cv.a.a(this.aJ.getEventType())).b(cv.a.a(this.aJ.getEventType(), aweme.getRelationLabel())).d(i3);
            if (aweme.isAd()) {
                a2 = com.ss.android.ugc.aweme.feed.x.d.a(this.bv, aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getAdId()), String.valueOf(aweme.getAwemeRawAd().getCreativeId()), new HashMap());
            } else {
                a2 = com.ss.android.ugc.aweme.feed.x.d.a(this.aJ.getEventType(), null, new HashMap());
            }
            wVar2.a(d2.a(a2).a());
        }
    }

    private void a(boolean z2, k.b bVar) {
        DataCenter D;
        if (!hh.b() && TextUtils.equals(this.aJ.getEventType(), "homepage_hot") && (D = D()) != null) {
            if (z2) {
                D.a("follow_button_interaction", (Object) 0);
            } else if (bVar != null) {
                D.a("follow_button_interaction", bVar);
            }
        }
    }

    private static boolean a(Aweme aweme, aj ajVar) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.ah(aweme) && ajVar.t() != null && com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme) != null && ajVar.t().M().longValue() >= ((long) (com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme).getShowSeconds() * 1000));
    }

    public final void a(final Aweme aweme, final String str) {
        com.ss.android.b.a.a.a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59632);
            }

            public final void run() {
                String str;
                if (a.this.bv != null && !a.this.bv.isFinishing()) {
                    Aweme aweme = aweme;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = "";
                    }
                    Aweme aweme2 = aweme;
                    if (aweme2 != null && "1".equals(aweme2.isFromTrendingCard())) {
                        str = a.this.aJ.getSearchResultId();
                    }
                    af.a b2 = new af.a().a(a.this.aJ.getTabName()).b(a.this.aJ.getmImprId());
                    b2.f123338a.f123334e = a.this.aJ.getSearchId();
                    b2.f123338a.f123335f = str;
                    b2.f123338a.f123336g = a.this.aJ.getChallengeId();
                    b2.f123338a.f123337h = a.this.aJ.getParentTagId();
                    a.this.aH.a(a.this.bv, aweme, b2.f123338a);
                }
            }
        });
    }

    public final void a(Aweme aweme, String str, boolean z2, boolean z3, boolean z4, int i2) {
        if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("AWEME == NULL");
            return;
        }
        if (this.aH.c() == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ACTIVITY == NULL");
        } else if (this.aH.c().isFinishing()) {
            return;
        }
        bf();
        c.a a2 = new c.a(aweme).a(str);
        a2.f72001b = true;
        int i3 = 0;
        a2.f72004e = false;
        a2.f72002c = z2;
        a2.f72008i = this.aJ.isFromPostList();
        a2.f72009j = false;
        a2.f72010k = null;
        a2.q = z3;
        a2.r = z4;
        a2.f72006g = this.aJ.getPreviousPage();
        a2.f72011l = 0;
        String str2 = com.ss.android.ugc.aweme.story.d.a.g(aweme) ? "story" : UGCMonitor.TYPE_POST;
        if (aweme.getAuthor() != null) {
            i3 = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
        }
        com.ss.android.ugc.aweme.common.r.a("enter_comment_list", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.aJ.getEventType()).a("enter_method", "comment_reply").a("group_id", aweme.getAid()).a("trigger_comment_id", str).a("follow_status", i3).a("story_type", str2).a("follow_status_to_user", i2).f66730a);
        e eVar = this.aH;
        if (eVar instanceof com.ss.android.ugc.aweme.comment.f.b) {
            ((com.ss.android.ugc.aweme.comment.f.b) eVar).a(a2.a());
        }
    }

    public final void b(Aweme aweme, String str) {
        if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("AWEME == NULL");
            return;
        }
        if (this.aH.c() == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ACTIVITY == NULL");
        } else if (this.aH.c().isFinishing()) {
            return;
        }
        c.a aVar = new c.a(aweme);
        h.f.b.l.d(str, "");
        aVar.s = str;
        aVar.f72006g = this.aJ.getPreviousPage();
        aVar.f72011l = 3;
        e eVar = this.aH;
        if (eVar instanceof com.ss.android.ugc.aweme.comment.f.b) {
            ((com.ss.android.ugc.aweme.comment.f.b) eVar).a(aVar.a());
        }
    }

    public final void b(Aweme aweme, String str, int i2) {
        if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("AWEME == NULL");
            return;
        }
        if (this.aH.c() == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ACTIVITY == NULL");
        } else if (this.aH.c().isFinishing()) {
            return;
        }
        c.a aVar = new c.a(aweme);
        aVar.f72012m = str;
        aVar.n = i2;
        aVar.f72006g = this.aJ.getPreviousPage();
        aVar.f72011l = 1;
        e eVar = this.aH;
        if (eVar instanceof com.ss.android.ugc.aweme.comment.f.b) {
            ((com.ss.android.ugc.aweme.comment.f.b) eVar).a(aVar.a());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Aweme aweme, String str, boolean z2, String str2) {
        a(aweme, str, z2, str2, 0, false);
    }

    /* access modifiers changed from: protected */
    public final void a(Aweme aweme, int i2, String str) {
        a(aweme, (String) null, this.f93699h, str, i2, false);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus = followStatusEvent.status;
        if (super.bD()) {
            com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
            h.f.b.l.d(followStatus, "");
            if (bVar.getCount() != 0) {
                List<Aweme> e2 = bVar.e();
                ArrayList<Aweme> arrayList = new ArrayList();
                for (T t2 : e2) {
                    User author = t2.getAuthor();
                    if (com.bytedance.common.utility.m.a(author != null ? author.getUid() : null, followStatus.userId)) {
                        arrayList.add(t2);
                    }
                }
                for (Aweme aweme : arrayList) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        author2.setFollowStatus(followStatus.followStatus);
                    }
                }
            }
        }
        if ((!this.bb || !super.aO()) && followStatusEvent.status != null) {
            a.C2958a.a();
            com.ss.android.ugc.aweme.preload.b.a.a(followStatusEvent.status.secUserId, followStatusEvent.status.userId);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.l
    public final void a(Aweme aweme, boolean z2, boolean z3) {
        if (com.ss.android.ugc.aweme.utils.z.a(aweme)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.hfj).a();
        } else if ((!this.bq || !super.bD()) && !com.ss.android.ugc.aweme.feed.background.c.a()) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "BaseListFragmentPanel", "try to handlePlay,but can't meet the conditions,pageResume:" + this.bq + ",isViewValid:" + super.bD() + "BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():" + com.ss.android.ugc.aweme.feed.background.c.a());
            com.ss.android.ugc.aweme.framework.a.a.b(4, "BaseListFragmentPanel", "the stacktrace:" + Log.getStackTraceString(new Throwable()));
        } else {
            this.aK.a(aweme, z2, z3);
        }
    }

    public final void a(int i2, String str) {
        aj n2 = n(this.W.c(i2).getAid());
        if (n2 != null) {
            n2.d(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public void a(List<Aweme> list, int i2) {
        com.ss.android.ugc.aweme.framework.a.a.b(5, "BaseListFragmentPanel", "insert called,but not response for position:" + i2 + ",eventType:" + this.aJ.getEventType());
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(com.ss.android.ugc.aweme.common.e.i<Aweme> iVar) {
        List<T> list = iVar.f76414e;
        int i2 = iVar.f76411b;
        boolean z2 = iVar.f76413d;
        int i3 = iVar.f76412c;
        if (list == null || list.size() < i2) {
            return true;
        }
        if (this.W.getCount() == 0) {
            this.W.a(list);
            return true;
        } else if (!z2) {
            return true;
        } else {
            this.W.a(list, i2, i3);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final boolean a(Runnable runnable, long j2) {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager != null) {
            return verticalViewPager.postDelayed(runnable, j2);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.f
    public final void a(String str, long j2, long j3) {
        if (Q()) {
            if (this.br == null) {
                this.br = new com.ss.android.ugc.aweme.feed.t.a(this.aK, R());
            }
            if (!o(aG()) || aF() > 1) {
                this.br.a(false, str, j2, j3, this.W, aE(), this.ac);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final void b(String str, boolean z2) {
        if (z2 && Q()) {
            if (this.br == null) {
                this.br = new com.ss.android.ugc.aweme.feed.t.a(this.aK, R());
            }
            this.br.a(z2, str, 0, 0, this.W, aE(), this.ac);
        }
    }

    public final void b(List<Aweme> list, int i2) {
        try {
            f fVar = this.at;
            if (fVar != null) {
                fVar.a(com.ss.android.ugc.aweme.common.e.h.a(list, i2, list.size()));
            } else {
                c(list, i2);
            }
        } catch (com.ss.android.ugc.aweme.common.e.g e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            c(list, i2);
        }
    }

    private static boolean a(com.ss.android.ugc.aweme.fe.method.j jVar) {
        try {
            JSONObject jSONObject = jVar.f91311b.getJSONObject("data");
            boolean z2 = jSONObject != null && TextUtils.equals("landing_page", jSONObject.getString("report_from"));
            if (!TextUtils.equals("adVideoReportSuccess", jVar.f91311b.getString("eventName")) || z2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(x xVar) {
        aj bf2;
        bd t2;
        if (xVar != null) {
            Activity activity = this.bv;
            if (xVar.f93503a == (activity != null ? activity.hashCode() : 0) && (bf2 = bf()) != null && xVar.f93505c == bf2.b() && (t2 = bf2.t()) != null) {
                int i2 = xVar.f93504b;
                if (i2 == 1) {
                    t2.a(xVar.f93506d);
                } else if (i2 == 2) {
                    t2.b(xVar.f93506d);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r5 != 0) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a2, code lost:
        if (com.ss.android.ugc.aweme.feed.al.b() >= r5) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.MotionEvent r10, com.ss.android.ugc.aweme.feed.adapter.aj r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
        // Method dump skipped, instructions count: 553
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.a.a(android.view.MotionEvent, com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public void a(boolean z2, Aweme aweme, Aweme aweme2) {
        if (aweme != null && aweme2 != null) {
            com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
            boolean z3 = !z2;
            boolean equals = TextUtils.equals(bVar.getEventType(), "homepage_hot");
            String br2 = br();
            if (equals) {
                b.i.b(new q(z3, br2, aweme.getAuthorUid(), aweme.getAid(), aweme2.getAid(), bVar), com.ss.android.ugc.aweme.common.r.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public void b(FollowStatus followStatus) {
        User author;
        Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
        if (b2 != null && (author = b2.getAuthor()) != null && author.getUid() != null) {
            if (author.getUid().equals(followStatus.userId)) {
                author.setFollowStatus(followStatus.followStatus);
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.challenge.d.c(followStatus.followStatus, author));
            if (be()) {
                a.C2958a.a().a(4);
                int i2 = this.aZ;
                if (i2 >= 0 && i2 < 5) {
                    com.ss.android.ugc.aweme.preload.b.b a2 = b.a.a();
                    if (SmartPreloadCommentV2Experiment.a.b() || SmartPreloadProfileV2Experiment.a.b()) {
                        a2.f115792a++;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public String O() {
        return this.aJ.getTracker();
    }

    public void P() {
        this.aK.J();
    }

    /* access modifiers changed from: protected */
    public PreloadStrategyConfig R() {
        return com.ss.android.ugc.aweme.feed.experiment.s.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final aj aC() {
        return bf();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar.c
    public final void aM() {
        b(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am, com.ss.android.ugc.aweme.feed.q.v
    public final boolean aO() {
        return super.aO();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ag() {
        return this.aJ.getEnterFromRequestId();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ah() {
        return this.aJ.getPreviousPage();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ai() {
        return this.aJ.getSearchKeyword();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String aj() {
        return this.aJ.getContentSource();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String ak() {
        return this.aJ.getLikeEnterMethod();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v
    public final boolean bD() {
        return super.bD();
    }

    /* access modifiers changed from: protected */
    public final void bn() {
        aN().B();
    }

    public final View bu() {
        return l(true);
    }

    public final void bv() {
        com.bytedance.tux.tooltip.a aVar = this.aj;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String i() {
        return this.aJ.getEventType();
    }

    private static boolean w() {
        try {
            return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeedHandleGenericMotion().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    private void y() {
        aN().c(this.aK.K());
    }

    public void B() {
        Aweme bL = bL();
        if (bL != null) {
            m(bL);
        }
    }

    public void H() {
        com.ss.android.ugc.aweme.ca.h.a(new p(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void aA() {
        com.ss.android.ugc.aweme.ug.guide.l lVar = this.bt;
        if (lVar != null) {
            lVar.a(com.ss.android.ugc.aweme.ug.guide.k.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final Aweme aD() {
        return com.ss.android.ugc.aweme.feed.x.g.b(bf());
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final int aE() {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return this.Y;
        }
        return verticalViewPager.getCurrentItem();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final int aF() {
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar == null) {
            return 0;
        }
        return bVar.getCount();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.l
    public final com.ss.android.ugc.aweme.ad.feed.b.c aH() {
        o oVar = this.aK;
        if (oVar.H == null) {
            oVar.H = new com.ss.android.ugc.aweme.ad.feed.b.c(oVar);
        }
        return oVar.H;
    }

    /* access modifiers changed from: protected */
    public final boolean aI() {
        if (!TextUtils.isEmpty(this.aX)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar.c
    public final void aL() {
        a.C1541a.f68149a.a("video_click_retry").postValue(com.ss.android.ugc.aweme.share.d.c.f123453e);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final com.ss.android.ugc.aweme.video.i aN() {
        if (this.n == null) {
            this.n = com.ss.android.ugc.aweme.video.v.O();
        }
        return this.n;
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public final void aS() {
        super.aS();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(this.r);
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public final void aT() {
        super.aT();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.b(this.r);
    }

    /* access modifiers changed from: protected */
    public final void aX() {
        aN().z();
        com.ss.android.ugc.aweme.video.k.a().b();
    }

    /* access modifiers changed from: protected */
    public final void aY() {
        this.aK.a((String) null, System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String al() {
        return an().optString("request_id");
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void at() {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.d(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void av() {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.d(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final boolean ax() {
        View l2 = l(false);
        if (l2 == null || l2.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean bA() {
        if (L() == 1) {
            return true;
        }
        return false;
    }

    public final void bB() {
        ai bi2 = bi();
        if (bi2 != null) {
            bi2.aa();
        }
    }

    public final int bC() {
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar != null) {
            return bVar.getCount() - (this.Y + 1);
        }
        return 0;
    }

    public final void bF() {
        b(new e(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bS() {
        View view = this.P;
        if (view != null && view.getVisibility() == 8) {
            aU();
        }
    }

    public final boolean be() {
        return TextUtils.equals(this.aJ.getEventType(), "homepage_hot");
    }

    /* access modifiers changed from: protected */
    public final ai bi() {
        aj bf2 = bf();
        if (bf2 == null) {
            return null;
        }
        return bf2.v();
    }

    public final aj bj() {
        aj bf2 = bf();
        if (bf2 != null && !b(bf2)) {
            return bf2;
        }
        return null;
    }

    public final void bm() {
        y();
        com.ss.android.ugc.aweme.video.k.a().b();
    }

    public final boolean bo() {
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.aV;
        if (aVar != null) {
            return aVar.a("share_panel");
        }
        return this.aQ;
    }

    public final void bp() {
        if (bo()) {
            this.aH.g();
        }
    }

    public void bx() {
        au();
        this.bq = true;
        bF();
    }

    static {
        Covode.recordClassIndex(59619);
    }

    private DataCenter D() {
        aj bf2 = bf();
        if (bf2 instanceof ce) {
            return ((ce) bf2).at();
        }
        return null;
    }

    private void K() {
        if (this.aw != null && SharePrefCache.inst().getFollowGuideShown().c().booleanValue()) {
            bz();
        }
    }

    private int L() {
        Activity activity = this.bv;
        if (activity == null) {
            return -1;
        }
        if (activity instanceof com.ss.android.ugc.aweme.main.j) {
            return 1;
        }
        if (activity instanceof al) {
            return 2;
        }
        return -1;
    }

    private void T() {
        if (this.A == null) {
            this.A = new com.ss.android.ugc.aweme.ug.guide.b(this.N, this.M);
        }
        this.A.a();
    }

    private void U() {
        if (this.Q == null && this.R != null) {
            com.ss.android.ugc.aweme.s.b.a(new j(this));
        }
    }

    private long t() {
        if (this.q == 0) {
            this.q = System.currentTimeMillis();
        }
        return this.q;
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public void I() {
        super.I();
        for (com.ss.android.ugc.aweme.feed.e.d dVar : this.aL.f92906a) {
            dVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.l
    public final String aG() {
        return com.ss.android.ugc.aweme.feed.x.m.f(this.W.c(this.N.getCurrentItem()));
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final void am() {
        JSONObject an2 = an();
        if (an2 != null) {
            try {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.q(an2.getString("request_id")));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void bM() {
        aj bf2;
        com.ss.android.ugc.aweme.feed.adapter.a.a Q2;
        if (com.ss.android.ugc.aweme.story.d.a.d(bL()) && (bf2 = bf()) != null && (Q2 = bf2.Q()) != null) {
            Q2.a(com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_VIDEO);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bO() {
        VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) this.R.inflate();
        this.Q = videoDownloadStatusBar;
        videoDownloadStatusBar.setVideoDownloadClickListener(this);
        this.R = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bR() {
        ai bi2 = bi();
        if (bi2 != null) {
            bi2.ac();
        }
        a(bL(), true, true);
    }

    public final void ba() {
        aj j2 = j(this.ac);
        if (j2 != null && (j2 instanceof com.ss.android.ugc.aweme.feed.adapter.af) && j2.a() == 101) {
            ((com.ss.android.ugc.aweme.feed.adapter.af) j2).G();
        }
    }

    public final Boolean bc() {
        if (!this.al || this.ak) {
            return false;
        }
        return true;
    }

    public final void bd() {
        if (!u.b(this.bv) || this.bm) {
            aN().x();
        }
    }

    public void bk() {
        a(this.W.c(this.N.getCurrentItem()), true, (aj) null);
    }

    public final boolean bl() {
        aj bf2 = bf();
        if (com.ss.android.ugc.aweme.feed.x.g.e(bf2) || (bf2 != null && bf2.p().s() == 2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String br() {
        return ac.a(this.W.c(this.N.getCurrentItem()), this.aJ.getPageType());
    }

    /* access modifiers changed from: protected */
    public final void bw() {
        if (this.aw != null && SharePrefCache.inst().getFollowGuideShown().c().booleanValue()) {
            bz();
        }
    }

    public final void by() {
        if (this.aw != null) {
            bz();
            VerticalViewPager verticalViewPager = this.N;
            if (verticalViewPager != null) {
                verticalViewPager.removeCallbacks(this.f93697f);
            }
        }
    }

    public final void bz() {
        com.bytedance.ies.dmt.ui.b.b bVar = this.aw;
        if (bVar != null) {
            bVar.e();
            this.aU = false;
            this.aV.a("follow_guide_popup", false);
        }
    }

    private void G() {
        boolean booleanValue = SharePrefCache.inst().getFollowGuideShown().c().booleanValue();
        this.aB = booleanValue;
        if (!booleanValue) {
            b.a aVar = new b.a(this.bv);
            aVar.r = R.string.bzb;
            aVar.f33321e = false;
            aVar.A = false;
            aVar.f33328l = 5000;
            this.aw = aVar.a(new b.e() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(59638);
                }

                @Override // com.bytedance.ies.dmt.ui.b.b.e
                public final void a() {
                    a.this.aB = true;
                    SharePrefCache.inst().getFollowGuideShown().b(true);
                    ax.a().edit().putBoolean("hasFollowGuideShown", true).apply();
                }
            }).a();
        }
    }

    private void m() {
        NewUserFeedProgressBar newUserFeedProgressBar = this.S;
        if (newUserFeedProgressBar != null) {
            newUserFeedProgressBar.a();
            aj bf2 = bf();
            if (bf2 instanceof ce) {
                ((ce) bf2).a(false, this.S.getHeight());
            } else if (bf2 instanceof com.ss.android.ugc.aweme.feed.adapter.af) {
                this.S.getHeight();
                ((com.ss.android.ugc.aweme.feed.adapter.af) bf2).H();
            }
        }
    }

    private static void o() {
        Aweme aweme = com.ss.android.ugc.aweme.share.d.c.f123453e;
        if (aweme != null) {
            com.ss.android.ugc.aweme.common.r.a("download_failure_window_show", new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f66730a);
        }
    }

    private boolean v() {
        if (Objects.equals(this.aJ.getEventType(), "compilation_detail") || Objects.equals(this.aJ.getEventType(), "others_homepage") || Objects.equals(this.aJ.getEventType(), "personal_homepage")) {
            return true;
        }
        return false;
    }

    private boolean x() {
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        if (bVar == null || !bVar.isMyProfile()) {
            return false;
        }
        if ((this.aJ.getPageType() == 1000 || this.aJ.getPageType() == 1014) && com.ss.android.ugc.aweme.experiment.f.c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String aJ() {
        String str = this.aa;
        if (str == null) {
            return getClass().getSimpleName() + hashCode();
        }
        return str;
    }

    public final void aK() {
        if (!(this instanceof w) || this.S == null) {
            m();
            return;
        }
        com.ss.android.ugc.aweme.feed.x.g.b(bf());
        h.f.b.l.d(this.aJ.getEventType(), "");
        m();
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public final void aR() {
        super.aR();
        WeakHandler weakHandler = this.Z;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        this.aK = null;
        an anVar = this.f93703m;
        if (anVar != null) {
            anVar.c();
        }
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.aV;
        if (aVar != null && aVar.a("swipe_up_guide")) {
            this.aV.a("swipe_up_guide", false);
        }
        com.ss.android.ugc.aweme.ad.feed.a.b.f65741a = true;
    }

    /* access modifiers changed from: protected */
    public final void aU() {
        if (bf() != null) {
            com.ss.android.ugc.aweme.commercialize.e.a.b.B(com.ss.android.ugc.aweme.feed.x.g.b(j(true)));
        }
        aV();
        VerticalViewPager verticalViewPager = this.N;
        View view = this.O;
        View view2 = this.P;
        Activity activity = this.bv;
        k kVar = new k(this);
        if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
            com.ss.android.b.a.a.a.a(new com.ss.android.ugc.aweme.adaptation.e(activity, com.ss.android.ugc.aweme.adaptation.c.f66193c, verticalViewPager, view2, view, kVar));
        } else {
            com.ss.android.b.a.a.a.a(new com.ss.android.ugc.aweme.adaptation.d(activity, verticalViewPager, view2, kVar));
        }
    }

    /* access modifiers changed from: protected */
    public void aV() {
        if (this.bl != 4) {
            this.O.setVisibility(8);
            this.P.setVisibility(8);
            return;
        }
        this.O.setVisibility(0);
        this.O.setBackgroundResource(R.color.a2);
        this.P.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final boolean aZ() {
        int aE2 = aE() - 1;
        Aweme f2 = f(aE2);
        while (f2 != null && com.ss.android.ugc.aweme.feed.background.a.b(f2)) {
            aE2--;
            f2 = f(aE2);
        }
        if (aE2 >= 0) {
            return k(aE2);
        }
        if (v()) {
            return k(aF() - 1);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final JSONObject an() {
        return com.ss.android.ugc.aweme.feed.x.i.a(this.W.c(this.N.getCurrentItem()), this.aJ.getPageType(), this.aJ.getEnterMethodValue(), this.aJ.getEventType());
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final void ao() {
        Aweme b2;
        if (this.bu) {
            aj bf2 = bf();
            if (com.ss.android.ugc.aweme.feed.x.g.e(bf2) && (b2 = bf2.b()) != null && b2 != this.u) {
                this.u = b2;
                com.ss.android.ugc.aweme.feed.x.n.a(this.bv, b2, an(), this.aJ, a_(true));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void au() {
        final View l2 = l(false);
        if (l2 != null) {
            l2.setVisibility(0);
            l2.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(59624);
                }

                public final void run() {
                    View view = l2;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }).start();
        }
        Activity activity = this.bv;
        if (activity != null) {
            com.ss.android.ugc.aweme.feed.x.a.a(activity, activity.getString(R.string.kz));
        }
        bv();
    }

    public final boolean bG() {
        try {
            if (!cn.f89703a) {
                return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableOnPageSelectPauseCheck().booleanValue();
            }
            Boolean bool = this.w;
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean enableOnPageSelectPauseCheck = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableOnPageSelectPauseCheck();
            this.w = enableOnPageSelectPauseCheck;
            return enableOnPageSelectPauseCheck.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void bN() {
        aj bf2;
        com.ss.android.ugc.aweme.feed.adapter.a.a Q2;
        if (com.ss.android.ugc.aweme.story.d.a.d(bL()) && (bf2 = bf()) != null && (Q2 = bf2.Q()) != null) {
            Q2.a(com.ss.android.ugc.aweme.story.g.f137757a.a(this.aJ.getEventType(), this.aJ.getFrom()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bP() {
        if (this.bv != null && !this.bv.isFinishing() && super.bD()) {
            try {
                this.f93700i.showAtLocation(this.V, 17, 0, 0);
                com.ss.android.ugc.aweme.feed.al.a().edit().putBoolean("hasShowUnloginDiggToast", true).apply();
                return;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
        this.ba = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final aj bf() {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return null;
        }
        if (b(verticalViewPager.getCurrentItem(), this.aY)) {
            return this.aY;
        }
        for (int childCount = this.N.getChildCount() - 1; childCount >= 0; childCount--) {
            aj ajVar = (aj) this.N.getChildAt(childCount).getTag(R.id.b1q);
            if (b(this.N.getCurrentItem(), ajVar)) {
                return ajVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final aj bg() {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return null;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
            aj ajVar = (aj) this.N.getChildAt(childCount).getTag(R.id.b1q);
            if (b(this.N.getCurrentItem() + 1, ajVar)) {
                return ajVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final aj bh() {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null || verticalViewPager.getCurrentItem() <= 0) {
            return null;
        }
        for (int childCount = this.N.getChildCount() - 1; childCount >= 0; childCount--) {
            aj ajVar = (aj) this.N.getChildAt(childCount).getTag(R.id.b1q);
            if (b(this.N.getCurrentItem() - 1, ajVar)) {
                return ajVar;
            }
        }
        return null;
    }

    public final void bq() {
        aj bf2 = bf();
        aj bh2 = bh();
        aj bg2 = bg();
        if (bf2 instanceof ce) {
            bf2.q();
        }
        if (bh2 instanceof ce) {
            bh2.q();
        }
        if (bg2 instanceof ce) {
            bg2.q();
        }
    }

    /* access modifiers changed from: protected */
    public final void bs() {
        if (this.W.getCount() == 0) {
            DmtStatusView n2 = n(true);
            if (n2 != null) {
                n2.setVisibility(0);
                n2.g();
            }
            bm();
            if (bA()) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.u(null));
            }
        }
    }

    private void C() {
        Aweme b2;
        aj bf2 = bf();
        if (bf2 != null && (b2 = bf2.b()) != null) {
            if (com.ss.android.ugc.aweme.utils.v.a(b2) && com.ss.android.ugc.aweme.commercialize.g.b().isShowCommerceAfterInteraction() && bf2.t() != null) {
                bf2.t().a(com.ss.android.ugc.aweme.commercialize.g.b().getDelayTimeAfterInteraction() * 1000, "passive_show");
            } else if (a(b2, bf2)) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(b2)) {
                    bf2.t().a((long) (com.ss.android.ugc.aweme.commercialize.e.a.b.ai(b2) * 1000));
                } else {
                    bf2.t().a(com.ss.android.ugc.aweme.commercialize.e.a.b.ai(b2) * 1000, "passive_show");
                }
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.M(b2) && !com.ss.android.ugc.aweme.commercialize.e.a.b.O(b2)) {
                bf2.t().a(0L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void aw() {
        View l2 = l(true);
        if (l2 != null) {
            l2.setVisibility(0);
            l2.setScaleX(2.5f);
            l2.setScaleY(2.5f);
            l2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(59640);
                }

                public final void run() {
                    String str;
                    if (dq.a()) {
                        a aVar = a.this;
                        int b2 = com.ss.android.ugc.aweme.base.utils.i.b(aVar.bv);
                        int a2 = com.ss.android.ugc.aweme.base.utils.i.a(aVar.bv);
                        int b3 = (int) com.bytedance.common.utility.n.b(aVar.bv, -30.0f);
                        int[] iArr = new int[2];
                        StringBuilder sb = new StringBuilder();
                        Aweme aD = aVar.aD();
                        int p = aVar.p(aD);
                        if (aD != null && p != -1) {
                            GreenScreenMaterial greenScreenMaterial = aD.getGreenScreenMaterials().get(p);
                            aVar.ah = greenScreenMaterial.getStickerId();
                            Iterator<String> it = aVar.af.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                if (sb.length() == 0) {
                                    str = "";
                                } else {
                                    str = ",";
                                }
                                sb.append(str).append(next);
                            }
                            aVar.ai = sb.toString();
                            aVar.aj = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b(aVar.bv).a(com.bytedance.tux.tooltip.h.TOP).a(-1001L).b(aVar.au).a(com.bytedance.android.live.core.f.y.b((int) R.color.c7)).b(b3).a().b().a(true)).a(new h.f.a.b<com.bytedance.tux.tooltip.a.a.d, h.z>(greenScreenMaterial, aD) {
                                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass10 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ GreenScreenMaterial f93705a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ Aweme f93706b;

                                static {
                                    Covode.recordClassIndex(59621);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ h.z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
                                    String authorName;
                                    com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
                                    d.a aVar = new d.a();
                                    Activity activity = a.this.bv;
                                    Object[] objArr = new Object[1];
                                    if (TextUtils.isEmpty(this.f93705a.getAuthorName())) {
                                        authorName = "GIPHY";
                                    } else {
                                        authorName = this.f93705a.getAuthorName();
                                    }
                                    objArr[0] = authorName;
                                    aVar.a(activity.getString(R.string.c51, objArr));
                                    aVar.f45494f = new View.OnClickListener() {
                                        /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass10.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(59622);
                                        }

                                        public final void onClick(View view) {
                                            int i2;
                                            ClickAgent.onClick(view);
                                            a aVar = a.this;
                                            String str = a.this.ah;
                                            String str2 = a.this.ai;
                                            Aweme aD = aVar.aD();
                                            if (aD.getVideo() != null) {
                                                i2 = aD.getVideo().getVideoLength();
                                            } else {
                                                i2 = 0;
                                            }
                                            PropReuseServiceImpl.c().a(aVar.bv, aD, str, str2, "Feed", aD.getGroupId(), i2);
                                            a.this.bv();
                                            com.ss.android.ugc.aweme.common.r.a("click_media_tooltip", new com.ss.android.ugc.aweme.app.f.d().a("group_id", AnonymousClass10.this.f93706b.getGroupId()).a("giphy_id", a.this.ai).a("prop_id", a.this.ah).a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[AnonymousClass10.this.f93705a.getType()]).f66730a);
                                        }
                                    };
                                    dVar2.a(aVar);
                                    return h.z.f158842a;
                                }

                                {
                                    this.f93705a = r2;
                                    this.f93706b = r3;
                                }
                            }).d();
                            if (!aVar.aj.isShowing()) {
                                aVar.au.getLocationOnScreen(iArr);
                                if (iArr[0] >= 0 && iArr[0] <= b2 && iArr[1] >= 0 && iArr[1] <= a2) {
                                    aVar.aj.a();
                                    com.ss.android.ugc.aweme.common.r.a("show_media_tooltip", new com.ss.android.ugc.aweme.app.f.d().a("group_id", aD.getGroupId()).a("giphy_id", aVar.af.get(0)).a("prop_id", aVar.ah).a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[greenScreenMaterial.getType()]).f66730a);
                                }
                            }
                        }
                    }
                }
            }).start();
            l2.setSelected(false);
        }
        com.ss.android.ugc.aweme.feed.x.a.a(this.bv, this.bv.getString(R.string.kz), false, 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void ay() {
        User currentUser;
        if (!ax.a().getBoolean("hasFollowGuideShown", false) && !this.aR && !this.aP && !this.aU) {
            aj bf2 = bf();
            if (bf2 == null || bf2.b() == null || !bf2.b().isAd()) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                if ((createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getFollowingCount() <= 0) && !this.aV.a("gif_download_dialog") && !this.aV.a("swipe_up_guide") && this.aw != null && com.ss.android.ugc.aweme.feed.guide.i.d()) {
                    com.ss.android.ugc.aweme.feed.guide.i.b();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final Aweme bL() {
        com.ss.android.ugc.aweme.feed.adapter.b bVar;
        aj U2;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null || (bVar = this.W) == null) {
            return null;
        }
        Aweme c2 = bVar.c(verticalViewPager.getCurrentItem());
        if (!com.ss.android.ugc.aweme.story.d.a.c(c2)) {
            return c2;
        }
        aj bf2 = bf();
        if (bf2 != null && (U2 = bf2.U()) != null) {
            return U2.b();
        }
        UserStory userStory = c2.getUserStory();
        if (UserStoryKt.currentStory(userStory) != null) {
            return UserStoryKt.currentStory(userStory);
        }
        if (userStory.getStories().size() == 0) {
            return null;
        }
        if (UserStoryKt.currentStory(userStory) == null) {
            return userStory.getStories().get(0);
        }
        return UserStoryKt.currentStory(userStory);
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    public void q() {
        super.q();
        com.ss.android.ugc.aweme.video.k.f143431c = t();
        String sb = new StringBuilder().append(aN().L().hashCode()).toString();
        h.f.b.l.d(this, "");
        h.f.b.l.d(sb, "");
        if (!aq.a().containsKey(String.valueOf(hashCode()))) {
            aq.a().put(String.valueOf(hashCode()), sb);
        }
        this.aK.D();
        this.aK.b(false);
        if (com.bytedance.ies.abmock.b.a().a(true, "gather_mode", 0) != 0) {
            com.ss.android.ugc.aweme.video.l a2 = com.ss.android.ugc.aweme.video.l.a(this.bv);
            if (a2.f143438b != null) {
                if (a2.f143439c == null) {
                    a2.f143439c = new PhoneStateListener() {
                        /* class com.ss.android.ugc.aweme.video.l.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(93863);
                        }

                        public final void onCellLocationChanged(CellLocation cellLocation) {
                            if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{cellLocation}, 100911, "void", false, null).first).booleanValue()) {
                                com.bytedance.helios.sdk.a.a(this, new Object[]{cellLocation}, 100911, "onCellLocationChanged(Landroid/telephony/CellLocation;)V");
                            }
                        }

                        public final void onServiceStateChanged(ServiceState serviceState) {
                        }

                        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                            int i2;
                            try {
                                int parseInt = Integer.parseInt(signalStrength.toString().split(" ")[9]);
                                int gsmSignalStrength = (signalStrength.getGsmSignalStrength() * 2) - 113;
                                TelephonyManager telephonyManager = l.this.f143438b;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                                        com.ss.android.ugc.aweme.lancet.d.a.a().a();
                                    }
                                    i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                                    if (!com.ss.android.ugc.aweme.lancet.d.a.f107200c && i2 == -1) {
                                        l.this.f143437a = gsmSignalStrength;
                                    }
                                } else {
                                    i2 = telephonyManager.getNetworkType();
                                }
                                if (i2 == 13) {
                                    l.this.f143437a = parseInt;
                                    return;
                                }
                                l.this.f143437a = gsmSignalStrength;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    };
                }
                a2.f143438b.listen(a2.f143439c, 256);
            }
        }
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.l();
            bf2.c(2);
        }
        if (this.bt != null) {
            int i2 = this.f93702l;
            this.f93702l = i2 + 1;
            if (!(i2 == 0 || !this.bb || this.N.getChildCount() == 0)) {
                this.bt.a(com.ss.android.ugc.aweme.ug.guide.k.a());
            }
        }
        this.bd = false;
        com.ss.android.ugc.aweme.feed.helper.k.a(true);
        j(aD());
        aK();
        if (this.x) {
            this.x = false;
            SettingServiceImpl.v().a(false, az_().getFragmentManager());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.feed.q.v
    public void r() {
        h.f.b.l.d(this, "");
        aq.a().remove(String.valueOf(hashCode()));
        this.aK.N();
        this.aK.G();
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.j();
        }
        ArrayList<aj> arrayList = new ArrayList();
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager != null) {
            for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
                Object tag = this.N.getChildAt(childCount).getTag(R.id.b1q);
                if (tag != null) {
                    arrayList.add(tag);
                }
            }
        }
        for (aj ajVar : arrayList) {
            ajVar.c();
        }
        Runnable runnable = this.aD;
        if (runnable != null) {
            VerticalViewPager verticalViewPager2 = this.N;
            if (verticalViewPager2 != null) {
                verticalViewPager2.removeCallbacks(runnable);
            }
            Handler handler = this.f93696e;
            if (handler != null) {
                handler.removeCallbacks(this.aD);
            }
            this.aD = null;
        }
        VerticalViewPager verticalViewPager3 = this.N;
        if (!(verticalViewPager3 == null || verticalViewPager3.f76531e == null)) {
            verticalViewPager3.f76531e.clear();
        }
        super.r();
        z zVar = this.f93693b;
        if (zVar != null) {
            zVar.cd_();
        }
        com.ss.android.ugc.aweme.feed.u.ag agVar = this.f93695d;
        if (agVar != null) {
            agVar.cd_();
        }
        w wVar = this.av;
        if (wVar != null) {
            wVar.cd_();
        }
        if (aN().b(this.aK.K())) {
            aN().a((OnUIPlayListener) null);
        }
        com.ss.android.ugc.aweme.video.k.a();
        bn bnVar = this.f93700i;
        if (bnVar != null) {
            bnVar.a();
            this.f93700i = null;
        }
        VideoDownloadStatusBar.f94169h.remove(this);
        bk a2 = bk.a();
        a2.f75677e = null;
        a2.f75674b = null;
        a2.f75673a.removeCallbacks(a2.f75678f);
        a.C2958a.a().b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if ("general_search".equalsIgnoreCase(r1) == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015a, code lost:
        if (r4 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    @Override // com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.b.a.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J() {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.a.J():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void aB() {
        View a2;
        TuxTextView tuxTextView;
        CharSequence text;
        Integer valueOf;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager != null && verticalViewPager.getChildCount() != 0) {
            if (this.bs == null && N() != null) {
                this.bs = new com.ss.android.ugc.aweme.ug.guide.d(N(), this.N, "home_swipe_up_lottie_android.json", j.a.a(), TextUtils.equals(this.aJ.getEventType(), "homepage_hot"));
            }
            com.ss.android.ugc.aweme.ug.guide.d dVar = this.bs;
            if (dVar != null) {
                if (dVar.f141899e == null) {
                    if (ev.a()) {
                        Context context = dVar.f141903i.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        a2 = com.a.b.c.a((Activity) context, (int) R.layout.th);
                    } else {
                        a2 = com.a.a(LayoutInflater.from(dVar.f109239a.getContext()), R.layout.th, dVar.f141903i, false);
                    }
                    dVar.f141899e = a2;
                    View view = dVar.f141899e;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout");
                    dVar.f141902h = (SwipeUpGuideStrengthenLayout) view;
                    SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = dVar.f141902h;
                    if (swipeUpGuideStrengthenLayout != null) {
                        swipeUpGuideStrengthenLayout.setViewPager(dVar.f141904j);
                        swipeUpGuideStrengthenLayout.setFallBackRunnable(new d.c(dVar));
                    }
                    View view2 = dVar.f141899e;
                    if (!(view2 == null || (tuxTextView = (TuxTextView) view2.findViewById(R.id.f89)) == null || (text = tuxTextView.getText()) == null || (valueOf = Integer.valueOf(text.length())) == null)) {
                        int intValue = valueOf.intValue();
                        if (intValue > 0) {
                            if (20 < intValue) {
                                if (20 <= intValue && 40 >= intValue) {
                                    tuxTextView.setTextSize(25.0f);
                                }
                            }
                        }
                        tuxTextView.setTextSize(20.0f);
                    }
                }
                View view3 = dVar.f141899e;
                if (view3 == null || view3.getParent() == null) {
                    dVar.f141903i.addView(dVar.f141899e);
                }
                View view4 = dVar.f141899e;
                if (view4 != null) {
                    view4.setVisibility(0);
                    view4.setAlpha(0.0f);
                    view4.animate().alpha(1.0f).setDuration(300).withEndAction(new d.RunnableC3778d(view4, dVar)).start();
                    if (h.f.b.l.a((Object) dVar.f141905k, (Object) "home_swipe_up_lottie_android.json")) {
                        com.ss.android.ugc.aweme.common.r.a("new_user_guide_show", new com.ss.android.ugc.aweme.app.f.d().a("guide_type", "slide").f66730a);
                    }
                    dVar.f141896b.a("swipe_up_guide", true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void bT() {
        boolean z2;
        boolean z3;
        if (com.ss.android.ugc.aweme.s.e.d()) {
            U();
        }
        if (com.ss.android.ugc.aweme.feed.x.g.b(bf()) == null || !k(com.ss.android.ugc.aweme.feed.x.g.b(bf()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || com.ss.android.ugc.aweme.share.d.a.f123437a == 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        b(z3);
        int i2 = com.ss.android.ugc.aweme.share.d.a.f123437a;
        if (i2 == 1) {
            bM();
            if (!z2) {
                VideoDownloadStatusBar videoDownloadStatusBar = this.Q;
                VideoDownloadStatusBar.d();
                videoDownloadStatusBar.a();
                VideoDownloadStatusBar.f94171j = 0;
                ImageView imageView = videoDownloadStatusBar.f94174b;
                if (imageView == null) {
                    h.f.b.l.a("mDownloadSuccessImageView");
                }
                imageView.setVisibility(8);
                TextView textView = videoDownloadStatusBar.f94175c;
                if (textView == null) {
                    h.f.b.l.a("mDownloadSuccessTextView");
                }
                textView.setVisibility(8);
                TextView textView2 = videoDownloadStatusBar.f94178f;
                if (textView2 == null) {
                    h.f.b.l.a("mDownloadFailedTextView");
                }
                textView2.setVisibility(8);
                RelativeLayout relativeLayout = videoDownloadStatusBar.f94173a;
                if (relativeLayout == null) {
                    h.f.b.l.a("mDownloadProgressViewRoot");
                }
                relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
                RelativeLayout relativeLayout2 = videoDownloadStatusBar.f94173a;
                if (relativeLayout2 == null) {
                    h.f.b.l.a("mDownloadProgressViewRoot");
                }
                relativeLayout2.setVisibility(0);
                TextView textView3 = videoDownloadStatusBar.f94176d;
                if (textView3 == null) {
                    h.f.b.l.a("mDownloadProgressView");
                }
                textView3.setVisibility(0);
                TextView textView4 = videoDownloadStatusBar.f94177e;
                if (textView4 == null) {
                    h.f.b.l.a("mDownloadingStatusTextView");
                }
                textView4.setVisibility(0);
                TextView textView5 = videoDownloadStatusBar.f94179g;
                if (textView5 == null) {
                    h.f.b.l.a("mDownloadVideoCancelView");
                }
                textView5.setVisibility(0);
                RelativeLayout relativeLayout3 = videoDownloadStatusBar.f94173a;
                if (relativeLayout3 == null) {
                    h.f.b.l.a("mDownloadProgressViewRoot");
                }
                relativeLayout3.requestLayout();
                b(true);
            } else if (com.ss.android.ugc.aweme.share.d.c.c() && !com.ss.android.ugc.aweme.share.d.c.d()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.fgh).a();
            }
        } else if (i2 == 2) {
            bM();
            if (!z2) {
                this.Q.a(com.ss.android.ugc.aweme.share.d.a.f123438b);
            }
        } else if (i2 == 3) {
            bN();
        } else if (i2 == 4) {
            bN();
            if (VideoDownloadStatusBar.f94170i.hasMessages(1) && !z2) {
                this.Q.b();
                b(true);
            } else if (!com.ss.android.ugc.aweme.share.d.c.c() || com.ss.android.ugc.aweme.share.d.c.d()) {
                b(false);
            } else if (!z2) {
                this.Q.b();
                b(true);
            } else {
                b(false);
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.h_w).a();
            }
        } else if (i2 != 5) {
            bN();
        } else {
            bN();
            if (VideoDownloadStatusBar.f94170i.hasMessages(2) && !z2) {
                this.Q.c();
                b(true);
                o();
            } else if (!com.ss.android.ugc.aweme.share.d.c.c() || com.ss.android.ugc.aweme.share.d.c.d()) {
                b(false);
            } else if (!z2) {
                this.Q.c();
                b(true);
                o();
            } else {
                VideoDownloadStatusBar.a(2, 20000);
                b(false);
            }
        }
    }

    public final void bt() {
        aj bf2;
        ai bi2;
        int[] Z2;
        if (!super.bD() || !this.bb || !be() || this.aV.a("download_dialog")) {
            return;
        }
        if (com.ss.android.ugc.aweme.feed.x.g.b(bf()) == null || !com.ss.android.ugc.aweme.feed.x.g.b(bf()).isLive()) {
            BusinessComponentServiceUtils.getBusinessBridgeService().b();
            if (com.ss.android.ugc.aweme.s.d.k()) {
                G();
            }
            if (this.aw != null && !SharePrefCache.inst().getFollowGuideShown().c().booleanValue() && (bf2 = bf()) != null && !com.ss.android.ugc.aweme.feed.x.m.a(bf2.b()) && (bi2 = bi()) != null && (Z2 = bi2.Z()) != null) {
                if (gb.a(this.bv)) {
                    this.aw.a(this.V, 5, Z2[0] + ((int) com.bytedance.common.utility.n.b(this.bv, 40.0f)), Z2[1] - ((int) com.bytedance.common.utility.n.b(this.bv, 45.0f)), (float) ((this.aw.c() / 2) + ((int) com.bytedance.common.utility.n.b(this.bv, 4.0f))));
                } else {
                    com.bytedance.ies.dmt.ui.b.b bVar = this.aw;
                    bVar.a(this.V, 3, (Z2[0] - bVar.d()) - ((int) com.bytedance.common.utility.n.b(this.bv, 10.0f)), (Z2[1] - (this.aw.c() / 2)) - ((int) com.bytedance.common.utility.n.b(this.bv, 12.0f)), (float) ((this.aw.c() / 2) + ((int) com.bytedance.common.utility.n.b(this.bv, 4.0f))));
                }
                this.aw.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(59639);
                    }

                    public final void onDismiss() {
                        a.this.aU = false;
                        a.this.aV.a("follow_guide_popup", a.this.aU);
                    }
                });
                this.aU = true;
                this.aV.a("follow_guide_popup", true);
                com.ss.android.ugc.aweme.common.r.a("follow_hint_guide_show ", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                com.ss.android.ugc.aweme.common.r.a("new_user_guide_show", new com.ss.android.ugc.aweme.app.f.d().a("guide_type", "follow").f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final void b(long j2) {
        this.K = j2;
    }

    @org.greenrobot.eventbus.r
    public void onDismissEnterMusicGuideEvent(com.ss.android.ugc.aweme.feed.i.g gVar) {
        bB();
    }

    @org.greenrobot.eventbus.r
    public void onEvent(ae aeVar) {
        aK();
    }

    public a(String str) {
        this(str, 0);
    }

    private void q(boolean z2) {
        a(bL(), z2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(f.a.d.f fVar) {
        b(fVar);
        return null;
    }

    public String e(Aweme aweme) {
        return a(aweme, true, (aj) null);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final Aweme f(int i2) {
        return this.W.c(i2);
    }

    public void m(Aweme aweme) {
        b(aweme);
        ao();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final void o(Aweme aweme) {
        a(aweme, true, false);
    }

    @org.greenrobot.eventbus.r
    public void onDismissEnterMusicGuideEvent(com.ss.android.ugc.aweme.main.b.a aVar) {
        bB();
    }

    @org.greenrobot.eventbus.r
    public void onLoginPageCloseEvent(com.ss.android.ugc.aweme.login.a.a aVar) {
        d(false);
    }

    @org.greenrobot.eventbus.r
    public void onLoginPageShowEvent(com.ss.android.ugc.aweme.login.a.b bVar) {
        d(bVar.f109020a);
    }

    public final a p(String str) {
        this.aJ.setEnterMethodValue(str);
        return this;
    }

    public static boolean b(aj ajVar) {
        if (ajVar.a() == 101) {
            return true;
        }
        return false;
    }

    private void d(boolean z2) {
        this.aR = z2;
        this.aV.a("login_panel", z2);
        if (z2) {
            K();
        }
    }

    public static boolean k(Aweme aweme) {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean l(Aweme aweme) {
        if (aweme == null || br.a(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v
    public void e(boolean z2) {
        super.e(z2);
        p(true);
        if (z2) {
            bF();
        }
    }

    /* access modifiers changed from: protected */
    public final void h(boolean z2) {
        if (z2) {
            K();
        } else {
            C();
        }
    }

    /* access modifiers changed from: protected */
    public final aj j(int i2) {
        return (aj) this.N.getChildAt(i2).getTag(R.id.b1q);
    }

    /* access modifiers changed from: protected */
    public final void n(Aweme aweme) {
        a(aweme, (String) null, this.f93699h, "");
    }

    @org.greenrobot.eventbus.r
    public void onDismissInteractStickerPop(h hVar) {
        ai bi2 = bi();
        if (bi2 != null) {
            bi2.ac();
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.d dVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(dVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onFakeLabelEvent(com.ss.android.ugc.aweme.comment.c.g gVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(gVar.f71756a, gVar.f71757b);
        }
    }

    @org.greenrobot.eventbus.r
    public void onFakeSwipeEvent(com.ss.android.ugc.aweme.ug.guide.a aVar) {
        if (super.aO()) {
            T();
        }
    }

    @org.greenrobot.eventbus.r
    public void onPopUpShowEvent(com.ss.android.ugc.aweme.ug.guide.i iVar) {
        UgAllServiceImpl.c().a(this.bv);
    }

    @org.greenrobot.eventbus.r
    public void onPrivateModelEvent(com.ss.android.ugc.aweme.feed.i.w wVar) {
        aj bf2 = bf();
        if (bf2 != null) {
            bf2.a(wVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onPushNotificationDialogShowed(com.ss.android.ugc.aweme.ug.guide.f fVar) {
        com.ss.android.ugc.aweme.ug.guide.l lVar;
        if (!fVar.f141918a && (lVar = this.bt) != null) {
            lVar.a(0);
        }
    }

    @org.greenrobot.eventbus.r
    public void onRestrictEvent(com.ss.android.ugc.aweme.setting.d.c cVar) {
        ai bi2 = bi();
        if (bi2 != null) {
            bi2.Y();
        }
    }

    /* access modifiers changed from: protected */
    public final void q(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            this.aG = false;
        }
        this.f93699h = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final Aweme r(Aweme aweme) {
        int currentItem;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            currentItem = this.Y;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        return a(aweme, currentItem);
    }

    private void f(boolean z2) {
        r(z2);
        this.aQ = z2;
        this.aV.a("share_panel", z2);
        aj bf2 = bf();
        if (bf2 != null && bf2.t() != null) {
            bf2.t().f(z2);
        }
    }

    private boolean k(int i2) {
        if (i2 < 0 || i2 > this.W.getCount() - 1) {
            return false;
        }
        if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
            this.N.a(i2, false);
        } else {
            this.N.setCurrentItemWithDefaultVelocity(i2);
        }
        return true;
    }

    protected static boolean o(String str) {
        if (com.ss.android.ugc.aweme.video.preload.b.b(com.ss.android.ugc.aweme.video.preload.b.a(str)) || com.ss.android.ugc.aweme.feed.cache.i.a(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final String a_(boolean z2) {
        return com.ss.android.ugc.aweme.feed.helper.e.a(this.aJ.getPageType(), this.aJ.getEventType(), z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        if (super.bD()) {
            CaptchaHelperServiceImpl.a();
            com.ss.android.ugc.aweme.common.l.a(com.ss.android.ugc.aweme.base.utils.o.a((Context) this.bv), exc);
        }
    }

    /* access modifiers changed from: protected */
    public final void g(boolean z2) {
        this.aP = z2;
        this.aV.a("comment_panel", z2);
        aj bf2 = bf();
        if (bf2 != null && bf2.t() != null) {
            bf2.t().e(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v
    public void h(String str) {
        com.ss.android.ugc.d.a.c.a(new ag(2, str));
        if (ax()) {
            au();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final void l(final String str) {
        WeakHandler weakHandler = this.Z;
        if (weakHandler != null) {
            Message obtain = Message.obtain(weakHandler, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(59625);
                }

                public final void run() {
                    if (a.this.Z != null) {
                        a.this.Z.removeMessages(10);
                    }
                    aj aC = a.this.aC();
                    if (aC != null && aC.b() != null && TextUtils.equals(aC.b().getAid(), str) && aC.b().isLive() && a.this.bD()) {
                        Aweme b2 = aC.b();
                        com.ss.android.ugc.aweme.story.live.d.a(1, b2.getAuthor().getUid(), b2.getAuthor().roomId, com.ss.android.ugc.aweme.story.live.d.a("homepage_follow", "live", a.this.an().optString("request_id")));
                    }
                }
            });
            obtain.what = 10;
            this.Z.sendMessageDelayed(obtain, 60000);
        }
    }

    public void m(boolean z2) {
        int i2;
        this.bq = false;
        aj bf2 = bf();
        if (bf2 != null) {
            if (z2) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            bf2.b(i2);
        }
    }

    @org.greenrobot.eventbus.r
    public void onAdFeedRefreshEvent(com.ss.android.ugc.aweme.ad.feed.c.a aVar) {
        Aweme b2;
        aj bf2 = bf();
        if (com.ss.android.ugc.aweme.feed.x.g.e(bf2) && (b2 = bf2.b()) != null && b2.isAd()) {
            this.aG = true;
        }
    }

    @org.greenrobot.eventbus.r
    public void onCleanModeChangedEvent(com.ss.android.ugc.aweme.main.c.a aVar) {
        boolean z2 = com.ss.android.ugc.aweme.main.c.a().f109217a;
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            aj j2 = j(i2);
            if (j2 != null) {
                j2.b(z2);
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onCommentBubbleItemClicked(com.ss.android.ugc.aweme.comment.c.b bVar) {
        if (bVar != null && !this.bd) {
            c(com.ss.android.ugc.aweme.feed.x.g.b(bf()), bVar.f71744a, bVar.f71745b, "bullet");
        }
    }

    @org.greenrobot.eventbus.r
    public void onDeleteAwemeEventOnBase(com.ss.android.ugc.aweme.feed.i.e eVar) {
        if (com.ss.android.ugc.aweme.feed.experiment.ad.a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "BaseListFragmentPanel", "BaseListFragmentPanel onDeleteAweme");
        }
        this.N.post(new q(this));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.al.d dVar) {
        if (dVar.f66365b) {
            r(dVar.f66364a);
        } else if (dVar.f66364a) {
            bM();
        } else {
            bN();
        }
    }

    @org.greenrobot.eventbus.r
    public void onLandPagePopupWebShowEvent(com.ss.android.ugc.aweme.bullet.module.ad.k kVar) {
        aj bf2 = bf();
        if (bf2 != null && bf2.t() != null) {
            bf2.t().a(kVar);
        }
    }

    @org.greenrobot.eventbus.r(b = true, c = -1)
    public void onPublishStatus(com.ss.android.ugc.aweme.shortvideo.j.f fVar) {
        if (fVar.f128578b == 10) {
            bh.f94358b = false;
            if (bf() instanceof VideoViewCell) {
                ((VideoViewCell) bf()).g(true);
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onRegisterProgressEvent(p pVar) {
        aj bf2;
        if (pVar != null && (bf2 = bf()) != null && bf2.t() != null) {
            bf2.t().a(pVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onTabSwitched(com.ss.android.ugc.aweme.share.model.d dVar) {
        com.ss.android.ugc.aweme.ug.guide.l lVar;
        com.ss.android.ugc.aweme.ug.guide.l lVar2;
        boolean z2 = dVar.f124110a;
        this.bb = z2;
        if (!z2 && (lVar2 = this.bt) != null) {
            lVar2.c();
        }
        if (this.bb && (lVar = this.bt) != null) {
            lVar.a(com.ss.android.ugc.aweme.ug.guide.k.a());
        }
    }

    private void b(Aweme aweme) {
        if (!com.ss.android.ugc.aweme.utils.z.a(aweme) && !com.ss.android.ugc.aweme.feed.service.a.a(this.bv).booleanValue() && this.bv != null) {
            aj bf2 = bf();
            if (com.ss.android.ugc.aweme.video.local.f.f143475a && bf2 != null) {
                bf2.c(1);
            }
            if (AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv) != aweme) {
                AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv, aweme);
            }
            this.aK.a(aweme, 0);
        }
    }

    private void c(Aweme aweme) {
        if (!TextUtils.isEmpty(this.aJ.getEventType()) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            com.ss.android.ugc.aweme.feed.helper.o oVar = new com.ss.android.ugc.aweme.feed.helper.o(aweme.getAid(), 4, System.currentTimeMillis(), this.aJ.getEventType());
            oVar.f93410a = aweme.getAuthorUid();
            t.a(oVar);
        }
    }

    private void r(boolean z2) {
        if (com.ss.android.ugc.aweme.story.d.a.d(bL())) {
            if (z2) {
                this.B++;
            } else {
                this.B--;
            }
            if (this.B > 0) {
                bM();
            } else {
                bN();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final int g(Aweme aweme) {
        List<Aweme> e2 = this.W.e();
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (!(aweme == null || e2.get(i2) == null || !e2.get(i2).getAid().equals(aweme.getAid()))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final String h(Aweme aweme) {
        Aweme aweme2;
        Aweme aweme3 = null;
        if (!com.ss.android.ugc.aweme.commercialize.g.h().b(aweme)) {
            return null;
        }
        List<Aweme> e2 = this.W.e();
        int indexOf = e2.indexOf(aweme);
        if (indexOf > 0) {
            aweme2 = this.W.d(indexOf - 1);
        } else {
            aweme2 = null;
        }
        if (indexOf < e2.size() - 1) {
            aweme3 = this.W.d(indexOf + 1);
        }
        return com.ss.android.ugc.aweme.commercialize.e.a.b.a(aweme2, aweme3);
    }

    public final void i(int i2) {
        Aweme c2 = this.W.c(i2);
        if (!l(c2)) {
            a(i2, c2);
            com.ss.android.ugc.aweme.commercialize.g.h().c(c2);
        }
        FeedAdServiceImpl.c().b().a(c2, new o(this));
    }

    @org.greenrobot.eventbus.r
    public void initTopPageEvent(com.ss.android.ugc.aweme.feed.i.c cVar) {
        aj bf2 = bf();
        if (bf2 != null && bf2.t() != null && bf2.t().o() != null) {
            bf2.t().o().b();
        }
    }

    /* access modifiers changed from: protected */
    public final aj j(boolean z2) {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            aj j2 = j(i2);
            int currentItem = this.N.getCurrentItem();
            int i3 = z2 ? currentItem - 1 : currentItem + 1;
            if (i3 < 0) {
                return null;
            }
            if (b(i3, j2)) {
                return j2;
            }
        }
        return null;
    }

    public void k(boolean z2) {
        q(z2);
        View l2 = l(false);
        if (l2 != null) {
            l2.setAlpha(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final DmtStatusView n(boolean z2) {
        if (az_() == null) {
            return null;
        }
        Fragment az_ = az_();
        if (az_ instanceof com.ss.android.ugc.aweme.feed.ui.f) {
            return ((com.ss.android.ugc.aweme.feed.ui.f) az_).b(z2);
        }
        if (az_ instanceof am) {
            return ((am) az_).p();
        }
        return null;
    }

    @org.greenrobot.eventbus.r
    public void onAddVideoToMixEvent(com.ss.android.ugc.aweme.mix.b.a aVar) {
        if (aVar.f109807a != null) {
            DmtStatusView n2 = n(true);
            if (n2 != null) {
                n2.f();
            }
            this.N.setDisableScroll(true);
            if (com.ss.android.ugc.aweme.feed.x.g.b(bf()) == aVar.f109807a) {
                c(aVar.f109807a, "long_press");
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onCommentListPageDialogEvent(com.ss.android.ugc.aweme.comment.c.e eVar) {
        Activity activity = this.bv;
        if (activity != null && !activity.isFinishing() && eVar.f71753b == activity.hashCode()) {
            if (eVar.f71752a == 1) {
                bM();
                return;
            }
            a(false, k.b.POST);
            bN();
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.ad.feed.button.c cVar) {
        aj bf2;
        bd t2;
        if (cVar != null && (bf2 = bf()) != null && TextUtils.equals(cVar.f65756a, bf2.b().getAid()) && (t2 = bf2.t()) != null) {
            t2.K();
        }
    }

    @org.greenrobot.eventbus.r
    public void onFeedDislikeEventEvent(com.ss.android.ugc.aweme.feed.i.l lVar) {
        if (!this.aI.booleanValue()) {
            Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
            if (be() && b2 != null && !this.bh && !b2.isAd() && com.ss.android.ugc.aweme.feed.helper.k.a(b2.getAid(), b2.getAuthorUid(), b2.isWithSurvey(), this.ae.size())) {
                com.ss.android.ugc.aweme.feed.helper.k.q = true;
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onNetStateChangeEvent(com.ss.android.ugc.aweme.common.net.c cVar) {
        if (f.a.f68431a.c()) {
            String str = J;
            com.ss.android.ugc.aweme.framework.a.a.c(3, str, "onNetStateChangeEvent, Network available");
            com.ss.android.ugc.aweme.feed.d.a aVar = this.f93694c;
            if (aVar == null || aVar.f92885a != 3) {
                com.ss.android.ugc.aweme.framework.a.a.c(3, str, "tryResumePlay from onNetStateChangeEvent");
                if (!fh.a() || !aN().o()) {
                    B();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.c(3, str, "do not resumePlay when paused");
        }
    }

    @org.greenrobot.eventbus.r
    public void onReceiveDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.i.f fVar) {
        if (!this.aI.booleanValue()) {
            this.f93701j = fVar.f93475a;
            if (fVar.f93480f == 2 && fVar.f93475a) {
                au();
            }
            if (!fVar.f93475a && !fVar.f93481g) {
                a(false, k.b.SHARE);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onReplayEvent(com.ss.android.ugc.aweme.commercialize.views.cards.aj ajVar) {
        aj bf2;
        Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
        if (ajVar.f76053a && TextUtils.equals(ajVar.f76054b, b2.getAid()) && (bf2 = bf()) != null && bf2.t() != null) {
            bf2.t().b(b2);
        }
    }

    @org.greenrobot.eventbus.r
    public void onScrolledToProfileTab(com.ss.android.ugc.aweme.share.model.a aVar) {
        this.bb = false;
        K();
        ax.a().edit().putBoolean("hasVisitedProfilePage", true).apply();
        if (be()) {
            b.a.a().f115794c = true;
        }
    }

    @org.greenrobot.eventbus.r
    public void onShareFinished(com.ss.android.ugc.aweme.share.e.a aVar) {
        if (this.aQ && !k(com.ss.android.ugc.aweme.feed.x.g.b(bf()))) {
            int i2 = aVar.f123474a;
            if (i2 == 1) {
                SettingServiceImpl.v().a(false, az_().getChildFragmentManager());
            } else if (i2 == 2) {
                this.x = true;
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onTabChangeEvent(m mVar) {
        if (mVar.f141945b.equals("HOME")) {
            VerticalViewPager verticalViewPager = this.N;
            if (verticalViewPager != null && verticalViewPager.getChildCount() != 0) {
                this.bt.a(com.ss.android.ugc.aweme.ug.guide.k.a());
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.ug.guide.l lVar = this.bt;
        if (lVar != null) {
            lVar.c();
        }
    }

    public final void p(boolean z2) {
        Activity activity = this.bv;
        if (activity != null && !activity.isFinishing()) {
            if (z2 || activity.getWindow().getDecorView().getBackground() == null) {
                activity.getWindow().getDecorView().setBackgroundColor(androidx.core.content.b.c(activity, R.color.a2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(String str) {
        if (!"on_ear_phone_unplug".equals(str)) {
            return;
        }
        if (aN().o()) {
            aw();
            bm();
            com.ss.android.ugc.aweme.main.g.a("play", this.aJ.getEventType(), com.ss.android.ugc.aweme.feed.x.g.b(bf()));
            return;
        }
        com.ss.android.ugc.aweme.main.g.a("pause", this.aJ.getEventType(), com.ss.android.ugc.aweme.feed.x.g.b(bf()));
    }

    /* access modifiers changed from: protected */
    public final void s(Aweme aweme) {
        if (aweme != null) {
            com.ss.android.ugc.aweme.common.r.a("share_highlight", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.aJ.getEventType()).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("show_content", "house").f66730a);
        }
    }

    private void b(f.a.d.f<ScrollSwitchStateManager> fVar) {
        Activity activity = this.bv;
        if (activity == null) {
            this.v.add(new f(this, fVar));
        } else if (activity instanceof androidx.fragment.app.e) {
            try {
                fVar.accept(ScrollSwitchStateManager.a.a((androidx.fragment.app.e) activity));
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public void g(String str) {
        if (be() && aG() != null && aG().equals(str) && o(str) && !com.ss.android.ugc.aweme.feed.cache.d.f92686b) {
            com.ss.android.ugc.aweme.feed.cache.d.f92686b = true;
            if (com.ss.android.ugc.aweme.feed.cache.d.f92685a) {
                com.ss.android.ugc.aweme.feed.cache.d.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i2) {
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar != null && i2 >= 0) {
            int i3 = i2 - 1;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(bVar.c(i3)) && !com.ss.android.ugc.aweme.commercialize.e.a.b.as(this.W.c(i3))) {
                l(i3);
            }
            if (i2 == 0 && this.W.c(1) != null) {
                l(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am
    public final Aweme i(Aweme aweme) {
        int currentItem;
        com.ss.android.ugc.aweme.feed.adapter.b bVar;
        aj bh2;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            currentItem = this.Y;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        if (currentItem <= 0 || (bVar = this.W) == null) {
            return null;
        }
        Aweme c2 = bVar.c(currentItem);
        if (c2 != aweme && bL() != aweme) {
            return c2;
        }
        Aweme c3 = this.W.c(currentItem - 1);
        if (!com.ss.android.ugc.aweme.story.d.a.c(c3) || (bh2 = bh()) == null || bh2.U() == null) {
            return c3;
        }
        return bh2.U().b();
    }

    public final void j(Aweme aweme) {
        if (aweme == null || !k(aweme)) {
            if (com.ss.android.ugc.aweme.share.d.c.b()) {
                b(true);
                VideoDownloadStatusBar videoDownloadStatusBar = this.Q;
                if (videoDownloadStatusBar != null) {
                    videoDownloadStatusBar.a((VideoDownloadStatusBar) VideoDownloadStatusBar.f94171j);
                    return;
                }
                return;
            } else if (this.Q != null && VideoDownloadStatusBar.f94170i.hasMessages(1)) {
                b(true);
                this.Q.b();
                return;
            } else if (this.Q != null && VideoDownloadStatusBar.f94170i.hasMessages(2)) {
                b(true);
                this.Q.c();
                o();
                return;
            }
        }
        b(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.k
    public final aj k(String str) {
        aj c2;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            aj ajVar = (aj) this.N.getChildAt(i2).getTag(R.id.b1q);
            if (!(ajVar == null || ajVar.P() == null)) {
                if (com.bytedance.common.utility.m.a(ajVar.P().getAid(), str) && !com.ss.android.ugc.aweme.story.d.a.c(ajVar.P())) {
                    return ajVar;
                }
                if (com.ss.android.ugc.aweme.story.d.a.c(ajVar.P()) && (c2 = ajVar.c(str)) != null) {
                    return c2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final View l(boolean z2) {
        if (this.au == null && z2 && this.L) {
            ImageView imageView = new ImageView(this.bv);
            this.au = imageView;
            imageView.setImageResource(2131233121);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.M.addView(this.au, layoutParams);
            this.au.setScaleX(2.5f);
            this.au.setScaleY(2.5f);
            this.au.setVisibility(8);
            this.au.setAlpha(0.0f);
            this.au.setOnClickListener(new d(this));
        }
        return this.au;
    }

    public final void m(String str) {
        Video video;
        String str2 = str;
        Aweme c2 = this.W.c(aE());
        if (c2 != null && c2.getVideo() != null && (video = c2.getVideo()) != null && video.getPlayAddr() != null) {
            boolean z2 = !TextUtils.isEmpty(video.getVideoModelStr());
            if (this.br == null) {
                this.br = new com.ss.android.ugc.aweme.feed.t.a(R());
            }
            if (!z2) {
                str2 = video.getPlayAddr().getBitRatedRatioUri();
            }
            this.br.a(z2, str2, 0, 0, this.W, aE(), this.ac);
        }
    }

    public final aj n(String str) {
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            aj ajVar = (aj) this.N.getChildAt(i2).getTag(R.id.b1q);
            if (!(ajVar == null || ajVar.P() == null || !com.bytedance.common.utility.m.a(ajVar.P().getAid(), str))) {
                return ajVar;
            }
        }
        return null;
    }

    public final void o(boolean z2) {
        DataCenter at2;
        aj bf2 = bf();
        if ((bf2 instanceof ce) && (at2 = ((ce) bf2).at()) != null && z2) {
            at2.a("video_share_click", (Object) true);
        }
        a(0, 0);
    }

    @org.greenrobot.eventbus.r
    public void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        DmtStatusView n2;
        aj bf2;
        ai v2;
        Aweme b2;
        int i2 = aVar.f34874a;
        this.bl = i2;
        if (!(i2 != 1 || (bf2 = bf()) == null || (v2 = bf2.v()) == null || (b2 = bf2.b()) == null)) {
            b.i.b(new g(b2, v2), b.i.f4824a);
        }
        if (this.bl < 4 && (n2 = n(false)) != null && n2.j()) {
            n2.d();
        }
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(aVar.f34874a, this.ap, this.aq);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onChangePlayListNameEvent(com.ss.android.ugc.aweme.mix.b.c cVar) {
        Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
        if (b2 != null && b2.playlist_info != null) {
            PlayListInfo playListInfo = b2.playlist_info;
            if (playListInfo.getMixId().equals(cVar.f109810b)) {
                playListInfo.setMixName(cVar.f109809a);
                playListInfo.setShowRenameTooltip(false);
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.gj0).a();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.j(true, b2));
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onCreateMixListSuccess(com.ss.android.ugc.aweme.mix.b.d dVar) {
        String str;
        if (dVar.f109815e && dVar.f109811a && !TextUtils.isEmpty(dVar.f109813c) && !TextUtils.isEmpty(dVar.f109812b)) {
            final String str2 = "";
            if (com.ss.android.ugc.aweme.feed.x.g.b(bf()) != null) {
                str = com.ss.android.ugc.aweme.feed.x.g.b(bf()).getAid();
            } else {
                str = str2;
            }
            VerticalViewPager verticalViewPager = this.N;
            if (verticalViewPager != null) {
                verticalViewPager.setDisableScroll(true);
            }
            if (dVar.f109814d != null && dVar.f109814d.getAid().equals(str)) {
                final Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
                final String str3 = dVar.f109813c;
                final String str4 = dVar.f109812b;
                if (dVar.f109816f != null) {
                    str2 = dVar.f109816f;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(59637);
                    }

                    public final void run() {
                        if (a.this.bv != null && b2 != null && str3 != null && str4 != null) {
                            if (a.this.N != null) {
                                a.this.N.setDisableScroll(false);
                            }
                            ((com.ss.android.ugc.aweme.mix.api.f) a.this.aH).a(a.this.bv, b2, str3, str4, a.this.a_(true), str2);
                        }
                    }
                }, 1000);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.commercialize.event.b bVar) {
        aj bf2;
        bd t2;
        if (bVar != null && (bf2 = bf()) != null && TextUtils.equals(bVar.f74043c, bf2.b().getAid()) && (t2 = bf2.t()) != null) {
            t2.a(bVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onFeedAdClickCouponEvent(com.ss.android.ugc.aweme.commercialize.event.d dVar) {
        aj bf2;
        Aweme aweme = dVar.f74044a;
        int i2 = dVar.f74045b;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.ar(aweme) != null) {
            if (Arrays.asList(2, 6, 3, 17, 25, 8).contains(Integer.valueOf(i2)) && (bf2 = bf()) != null && bf2.t() != null && bf2.t().o() != null) {
                bf2.t().o().a(i2);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onFeedAdClickFormEvent(com.ss.android.ugc.aweme.commercialize.event.e eVar) {
        aj bf2;
        Aweme aweme = eVar.f74046a;
        int i2 = eVar.f74047b;
        CardStruct e2 = com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme);
        if (e2 == null || e2.getCardType() != 1) {
            ba c2 = com.ss.android.ugc.aweme.commercialize.g.c();
            Activity activity = this.bv;
            bW();
            c2.a(activity, aweme, i2);
        } else if (i2 == 2 && (bf2 = bf()) != null && bf2.t() != null && bf2.t().o() != null) {
            bf2.t().o().d();
        }
    }

    @org.greenrobot.eventbus.r
    public void onPollEvent(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a aVar) {
        aj bf2;
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (!(bVar == null || com.bytedance.common.utility.collection.b.a((Collection) bVar.e()) || (bf2 = bf()) == null || bf2.b() == null || !TextUtils.equals(bf2.b().getAid(), aVar.f130313a) || bf2.b().getInteractStickerStructs() == null)) {
            for (InteractStickerStruct interactStickerStruct : bf2.b().getInteractStickerStructs()) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!(pollStruct == null || pollStruct.getOptions() == null)) {
                    for (PollStruct.OptionsBean optionsBean : pollStruct.getOptions()) {
                        if (optionsBean.getOptionId() == aVar.f130314b) {
                            pollStruct.setSelectOptionId(aVar.f130314b);
                        }
                    }
                }
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onRemoveVideoToMixEvent(com.ss.android.ugc.aweme.mix.b.i iVar) {
        if (iVar.f109820a != null) {
            DmtStatusView n2 = n(true);
            if (n2 != null) {
                n2.f();
            }
            this.N.setDisableScroll(true);
            if (com.ss.android.ugc.aweme.feed.x.g.b(bf()) != iVar.f109820a || !a_(true).equals(iVar.f109821b)) {
                this.N.setDisableScroll(false);
                if (n2 != null) {
                    n2.setVisibility(8);
                    return;
                }
                return;
            }
            d(iVar.f109820a, "long_press");
        }
    }

    @org.greenrobot.eventbus.r
    public void onTopViewLiveEnd(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
        aj bf2;
        o oVar;
        if (gVar != null) {
            String str = gVar.f34887a;
            int i2 = gVar.f34888b;
            if ((i2 == 3 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 19 || i2 == 20 || i2 == 21) && (bf2 = bf()) != null) {
                Aweme b2 = bf2.b();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(b2) && TextUtils.equals(b2.getAid(), str) && !com.ss.android.ugc.aweme.commercialize.e.a.b.x(b2) && TextUtils.isEmpty(b2.getAwemeRawAd().getWebUrl()) && (oVar = this.aK) != null) {
                    oVar.a(b2, 0);
                }
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onVideoPlayerEvent(com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
        Long l2;
        if (jVar.f128596c == 4) {
            if (!TextUtils.isEmpty(this.o)) {
                String str = this.o;
                this.o = "";
                aj bf2 = bf();
                if (!(bf2 == null || bf2.b() == null || !TextUtils.equals(bf2.b().getAid(), str))) {
                    au();
                    bz();
                    aN().n();
                    bf2.E();
                }
            }
            Long l3 = com.ss.android.ugc.aweme.ug.guide.g.f141920b;
            if (l3 != null) {
                long longValue = l3.longValue();
                com.ss.android.ugc.aweme.ug.guide.g.f141921c.removeCallbacks(com.ss.android.ugc.aweme.ug.guide.g.f141923e);
                Long l4 = com.ss.android.ugc.aweme.ug.guide.g.f141919a;
                if (l4 != null) {
                    l2 = Long.valueOf(l4.longValue() - (System.currentTimeMillis() - longValue));
                } else {
                    l2 = null;
                }
                com.ss.android.ugc.aweme.ug.guide.g.f141919a = l2;
            }
        }
    }

    private void b(boolean z2) {
        if (com.ss.android.ugc.aweme.s.e.d() && z2) {
            U();
        }
        VideoDownloadStatusBar videoDownloadStatusBar = this.Q;
        if (videoDownloadStatusBar == null) {
            return;
        }
        if (z2) {
            videoDownloadStatusBar.setVisibility(0);
            VideoDownloadStatusBar videoDownloadStatusBar2 = this.Q;
            videoDownloadStatusBar2.measure(0, 0);
            int measuredHeight = videoDownloadStatusBar2.getMeasuredHeight();
            int a2 = com.ss.android.ugc.aweme.adaptation.c.a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, (((ViewGroup) videoDownloadStatusBar2.getParent()).getHeight() - measuredHeight) - a2, 0, a2);
            videoDownloadStatusBar2.setLayoutParams(layoutParams);
            videoDownloadStatusBar2.requestLayout();
            aj bf2 = bf();
            if (bf2 instanceof ce) {
                ((ce) bf2).a(true, measuredHeight);
                return;
            }
            return;
        }
        videoDownloadStatusBar.setVisibility(8);
        com.ss.android.ugc.aweme.feed.x.g.b(bf());
        h.f.b.l.d(this.aJ.getEventType(), "");
        aj bf3 = bf();
        if (bf3 instanceof ce) {
            ((ce) bf3).a(false, this.Q.getHeight());
        }
    }

    private void l(int i2) {
        String shareUrl;
        String shareUrl2;
        String encode;
        String encode2;
        String str;
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar != null) {
            Aweme c2 = bVar.c(i2);
            if (!(!com.ss.android.ugc.aweme.commercialize.e.a.b.s(c2) || c2.getAwemeRawAd().getContextTrack() == null || com.bytedance.common.utility.collection.b.a((Collection) c2.getAwemeRawAd().getContextTrack().getUrlList()))) {
                c2.getAwemeRawAd().setContextTrackSent(true);
                Aweme c3 = this.W.c(i2 - 1);
                Aweme c4 = this.W.c(i2 + 1);
                if (c3 == null) {
                    shareUrl = "";
                } else {
                    shareUrl = c3.getShareUrl();
                }
                if (c4 == null) {
                    shareUrl2 = "";
                } else {
                    shareUrl2 = c4.getShareUrl();
                }
                if (TextUtils.isEmpty(shareUrl)) {
                    encode = "";
                } else {
                    encode = URLEncoder.encode(shareUrl);
                }
                if (TextUtils.isEmpty(shareUrl2)) {
                    encode2 = "";
                } else {
                    encode2 = URLEncoder.encode(shareUrl2);
                }
                LinkedList linkedList = new LinkedList();
                for (String str2 : c2.getAwemeRawAd().getContextTrack().getUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("__PCONTENT__", encode).replace("__NCONTENT__", encode2);
                        try {
                            str = al();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            str = "";
                        }
                        linkedList.add(Uri.parse(replace).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("req_id", str).toString());
                    }
                }
                com.ss.android.ugc.aweme.commercialize.g.a().a(linkedList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.i
    public final com.ss.android.ugc.aweme.app.f.c f(Aweme aweme) {
        int currentItem;
        String str;
        VerticalViewPager verticalViewPager = this.N;
        if (verticalViewPager == null) {
            currentItem = 0;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("author_id", ac.a(aweme)).a("request_id", ac.a(aweme, bVar.getPageType())).a("detail", Integer.valueOf(F() ? 1 : 0)).a("order", Integer.valueOf(currentItem)).a("is_photo", ac.f(aweme)).a("enter_method", bVar.getEnterMethodValue()).a("enter_from", bVar.getEventType());
        if (aweme.getAllowGift()) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.aweme.app.f.c a3 = a2.a("is_giftable", str);
        if (!TextUtils.isEmpty(bVar.getShareUserId())) {
            a3.a("share_mode", "token").a("uid", bVar.getShareUserId());
        }
        return a3;
    }

    /* access modifiers changed from: protected */
    public void g(int i2) {
        Long creativeId;
        aj bf2 = bf();
        if (bf2 != null) {
            Aweme b2 = bf2.b();
            if (!(b2 == null || b2.getAid() == null)) {
                AwemeRawAd awemeRawAd = b2.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isHardAd()) {
                    com.ss.android.ugc.aweme.commercialize.utils.e.f75758c = System.currentTimeMillis();
                }
                com.ss.android.ugc.aweme.commercialize.utils.e.f75756a.remove(b2.getAid());
                if (b2.isAd()) {
                    try {
                        AwemeRawAd awemeRawAd2 = b2.getAwemeRawAd();
                        if (!(awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null)) {
                            com.ss.android.ugc.aweme.commercialize.utils.e.f75757b.remove(Long.valueOf(creativeId.longValue()));
                        }
                    } catch (Exception unused) {
                    }
                    bq.a(com.ss.android.ugc.aweme.commercialize.utils.e.f75757b);
                }
            }
            bf2.a(i2);
            bf2.a(System.currentTimeMillis());
        }
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar != null) {
            Aweme c2 = bVar.c(i2);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(c2)) {
                c2.getAwemeRawAd().setContextTrackSent(false);
            }
        }
        h(i2);
        this.aZ = i2;
        if (i2 == 0) {
            com.ss.android.ugc.aweme.preload.b.b a2 = b.a.a();
            if (SmartPreloadCommentV2Experiment.a.b() || SmartPreloadProfileV2Experiment.a.b()) {
                a2.f115792a = 0;
                a2.f115793b = false;
            }
            com.ss.android.ugc.aweme.preload.b.a a3 = a.C2958a.a();
            if (SmartPreloadCommentV2Experiment.a.b() && !a3.f115771e) {
                com.ss.android.ugc.aweme.preload.a.a.a("check_comment_evaluator_available_task", e.b.a("check_comment_evaluator_available_task"), new a.c(a3));
            }
            if (SmartPreloadProfileV2Experiment.a.b() && !a3.f115772f) {
                com.ss.android.ugc.aweme.preload.a.a.a("check_profile_evaluator_available_task", e.b.a("check_profile_evaluator_available_task"), new a.d(a3));
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String str;
        int i2;
        if (message.what == 0) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, "BaseListFragmentPanel", "try resume play or try pause play for tap");
            if (this.W == null || this.N == null) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("adapter or viewpager is null,maybe is bug,please contact liuyiming.777"));
                return;
            }
            Aweme b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
            if (com.ss.android.ugc.aweme.story.d.a.c(b2)) {
                if (com.ss.android.ugc.aweme.story.g.f137757a.a(this.aJ.getEventType())) {
                    b2 = com.ss.android.ugc.aweme.story.d.a.i(b2);
                } else if (b2 != null) {
                    try {
                        if (b2.getAid() != null) {
                            float floatValue = ((androidx.core.g.e) message.obj).f2397a.floatValue();
                            Activity activity = this.bv;
                            h.f.b.l.c(activity, "");
                            Resources resources = activity.getResources();
                            h.f.b.l.a((Object) resources, "");
                            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                            if (displayMetrics != null) {
                                i2 = displayMetrics.widthPixels;
                            } else {
                                i2 = 0;
                            }
                            if (floatValue <= ((float) i2) / 3.0f) {
                                bf().Q().g();
                                return;
                            } else {
                                bf().Q().f();
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (com.ss.android.ugc.aweme.feed.x.m.d(b2)) {
                com.ss.android.ugc.aweme.framework.a.a.a(3, "BaseListFragmentPanel", "tap for image aweme!");
                z();
            } else {
                com.ss.android.ugc.aweme.framework.a.a.a(3, "BaseListFragmentPanel", "tap for video aweme!");
                if (b2 != null && !TextUtils.isEmpty(b2.getAid())) {
                    com.ss.android.ugc.aweme.common.r.a("click", "video", b2.getAid(), 0);
                    bf();
                    if (!com.ss.android.ugc.aweme.story.d.a.g(b2) || com.ss.android.ugc.aweme.story.g.f137757a.a(this.aJ.getEventType())) {
                        a(b2, true, true);
                    }
                } else if (!com.ss.android.ugc.aweme.story.d.a.g(b2)) {
                    if (b2 == null || (str = b2.toString()) == null) {
                        str = "null aweme";
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a(3, "Aweme", str);
                }
            }
            ai bi2 = bi();
            if (bi2 != null) {
                bi2.ac();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al
    public final boolean i(boolean z2) {
        int aE2 = aE() + 1;
        Aweme f2 = f(aE2);
        if (z2) {
            while (f2 != null && com.ss.android.ugc.aweme.feed.background.a.b(f2)) {
                aE2++;
                f2 = f(aE2);
            }
        }
        if (aE2 < aF()) {
            return k(aE2);
        }
        if (!v() || aE2 != aF()) {
            return false;
        }
        return k(0);
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.commercialize.event.g gVar) {
        aj bf2;
        if (gVar != null && (bf2 = bf()) != null && bf2.t() != null) {
            bf2.t().a(gVar);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        try {
            if (TextUtils.equals("videoReportSuccess", jVar.f91311b.getString("eventName")) || a(jVar)) {
                String string = jVar.f91311b.getJSONObject("data").getString("object_id");
                Aweme bL = bL();
                if (bL != null && TextUtils.equals(bL.getAid(), string)) {
                    bL.setReportMaskInfo(new VideoMaskInfo(true, 1, 1, this.bv.getString(R.string.fcz), this.bv.getString(R.string.fcx), this.bv.getString(R.string.fcy)));
                    AwemeService.b().a(bL);
                    if (this.W.getCount() <= this.Y + 1) {
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.commercialize.e.a.b.f(bL.getAwemeRawAd()) || this.bb) {
                        T();
                    }
                }
            } else if (com.ss.android.ugc.aweme.feed.adapter.d.f91797a && TextUtils.equals(com.ss.android.ugc.aweme.feed.x.t.f95364a, jVar.f91311b.getString("eventName"))) {
                com.ss.android.ugc.aweme.experiment.n.f90266a = true;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onUpdateMixVideoDesc(com.ss.android.ugc.aweme.mix.b.j jVar) {
        String str;
        String str2;
        Aweme b2;
        if (jVar != null) {
            Aweme aweme = jVar.f109823b;
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    String str3 = "";
                    if (!TextUtils.isEmpty(aG())) {
                        str = aG();
                    } else {
                        str = str3;
                    }
                    Aweme i2 = i(com.ss.android.ugc.aweme.feed.x.g.b(bf()));
                    if (i2 != null) {
                        str2 = i2.getAid();
                    } else {
                        str2 = str3;
                    }
                    Aweme r2 = r(com.ss.android.ugc.aweme.feed.x.g.b(bf()));
                    if (r2 != null) {
                        str3 = r2.getAid();
                    }
                    if (!aid.equals(str) && !aid.equals(str3) && !aid.equals(str2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (jVar.f109822a) {
                Boolean.valueOf(true);
                bq();
                return;
            }
            if (!(jVar.f109823b == null || jVar.f109823b.getAid() == null)) {
                String aid2 = jVar.f109823b.getAid();
                Aweme b3 = com.ss.android.ugc.aweme.feed.x.g.b(bf());
                Aweme i3 = i(b3);
                Aweme r3 = r(b3);
                if (b3 == null || !b3.getAid().equals(aid2)) {
                    if (i3 != null && i3.getAid().equals(aid2)) {
                        b3 = i3;
                    } else if (r3 != null && r3.getAid().equals(aid2)) {
                        b3 = r3;
                    }
                }
                if (b3.playlist_info != null) {
                    b3.playlist_info = null;
                }
            }
            if (!(jVar.f109823b != null || (b2 = com.ss.android.ugc.aweme.feed.x.g.b(bf())) == null || b2.playlist_info == null)) {
                b2.playlist_info = null;
            }
            Boolean.valueOf(false);
            bq();
        }
    }

    @org.greenrobot.eventbus.r
    public void onVideoEvent(ag agVar) {
        Aweme b2;
        boolean z2;
        com.ss.android.ugc.aweme.feed.n.d dVar;
        if (super.bD() && agVar != null) {
            if (agVar.f93450a == 36) {
                this.aK.J();
            } else if (agVar.f93450a == 14 || agVar.f93450a == 13 || agVar.f93450a == 2) {
                String str = (String) agVar.f93451b;
                if (agVar.f93450a == 2 && (dVar = this.as) != null) {
                    dVar.a(str);
                }
                int childCount = this.N.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    aj ajVar = (aj) this.N.getChildAt(i2).getTag(R.id.b1q);
                    if (ajVar != null && !b(ajVar) && ajVar.b() != null && com.bytedance.common.utility.m.a(ajVar.b().getAid(), str) && agVar.f93450a == 13 && (b2 = AwemeService.b().b(str)) != null) {
                        if (b2.getUserDigg() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (b2.isAd() && b2.getActivityPendant() == null) {
                            h.f.b.l.d(this.aJ.getEventType(), "");
                            Aweme aweme = new Aweme();
                            aweme.update(b2);
                            aweme.setAd(false);
                            AwemeService.b().a(aweme);
                        }
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.r(z2, b2.getAid()));
                        if (ajVar.t() != null) {
                            ajVar.t().d(z2);
                        }
                        if (be()) {
                            a.C2958a.a().a(5);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int p(Aweme aweme) {
        if (aweme == null || !Aweme.containsGreenScreenGiphyAnchor(aweme.getAnchors()) || ej.a(aweme.getGreenScreenMaterials())) {
            return -1;
        }
        this.af.clear();
        int i2 = -1;
        for (int i3 = 0; i3 < aweme.getGreenScreenMaterials().size(); i3++) {
            GreenScreenMaterial greenScreenMaterial = aweme.getGreenScreenMaterials().get(i3);
            greenScreenMaterial.getStartTime();
            this.n.n();
            greenScreenMaterial.getEndTime();
            int n2 = ((int) this.n.n()) - 300;
            if (greenScreenMaterial.getType() == 3) {
                long j2 = (long) n2;
                if (greenScreenMaterial.getStartTime() <= j2 && j2 < greenScreenMaterial.getEndTime()) {
                    int indexOf = this.af.indexOf(greenScreenMaterial.getResId());
                    if (indexOf != -1) {
                        this.af.remove(indexOf);
                    }
                    this.af.add(0, greenScreenMaterial.getResId());
                    i2 = i3;
                } else if (!this.af.contains(greenScreenMaterial.getResId())) {
                    this.af.add(greenScreenMaterial.getResId());
                }
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
        if (followStatus.followStatus == 0) {
            com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.aJ.getEventType()).a("to_user_id", followStatus.userId).f66730a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.aJ.getEventType()).a("to_user_id", followStatus.userId).f66730a);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.c cVar) {
        Activity activity;
        aj bf2;
        if (cVar != null && (activity = this.bv) != null && cVar.f76060e == activity.hashCode() && (bf2 = bf()) != null && bf2.t() != null && bf2.t().o() != null) {
            int i2 = cVar.f76058c;
            if (i2 == 1) {
                bf2.t().o().a(cVar.f76057b, cVar.f76056a);
            } else if (i2 == 2) {
                bf2.t().o().b(cVar.f76057b, cVar.f76056a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
        Aweme d2 = this.W.d(i2);
        if (!AdShowTimeGapManager.q) {
            if (AdShowTimeGapManager.a()) {
                AdShowTimeGapManager.n = null;
                AdShowTimeGapManager.f74425i = -1;
                AdShowTimeGapManager.f74426j = -1;
                AdShowTimeGapManager.f74429m = -1;
                if (AdShowTimeGapManager.f74424h >= 0 && AdShowTimeGapManager.f74424h < AdShowTimeGapManager.f74422f.size()) {
                    AdShowTimeGapManager.f74422f.remove(AdShowTimeGapManager.f74424h);
                }
                AdShowTimeGapManager.o = true;
            }
            a(this.aY);
            this.W.f(i2);
        }
        bs();
        if (!AdShowTimeGapManager.q) {
            g(this.N.getCurrentItem());
        }
        FeedAdServiceImpl.c().b().a(d2, i2, this.W.e());
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.d dVar) {
        Activity activity;
        if (dVar != null && (activity = this.bv) != null && dVar.f76065e == activity.hashCode() && this.n == null) {
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.feed.i.n nVar) {
        int currentItem = this.N.getCurrentItem() + 1;
        if (currentItem < this.W.getCount()) {
            this.N.setCurrentItemWithDefaultVelocity(currentItem);
        }
    }

    public final void b(int i2, boolean z2) {
        this.N.a(i2, z2);
    }

    private void a(Aweme aweme, boolean z2) {
        if (z2) {
            ao();
        }
        b(aweme);
    }

    private void c(Aweme aweme, int i2) {
        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException("insertItemList fall to downgrade logic"));
        this.W.a(aweme, i2);
    }

    public static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != i2) {
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    private void c(final Aweme aweme, final String str) {
        MixFeedService.k().a(new com.ss.android.ugc.aweme.mix.api.d() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(59635);
            }

            @Override // com.ss.android.ugc.aweme.mix.api.d
            public final void a(boolean z, int i2) {
                if (z) {
                    DmtStatusView n = a.this.n(true);
                    if (n != null) {
                        n.setVisibility(8);
                    }
                    if (i2 == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("key_mix_add_aweme_info", aweme);
                        MixFeedService.k().a(a.this.bv, bundle, 3, a.this.a_(true), str);
                    } else if (a.this.aH instanceof com.ss.android.ugc.aweme.mix.api.f) {
                        ((com.ss.android.ugc.aweme.mix.api.f) a.this.aH).a(a.this.bv, aweme, "", "", a.this.a_(true), str);
                    }
                    a.this.N.setDisableScroll(false);
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(a.this.bv).a(R.string.bp9).a();
            }
        });
    }

    private void d(Aweme aweme, String str) {
        com.ss.android.ugc.aweme.feed.e eVar = this.aH;
        if (eVar instanceof com.ss.android.ugc.aweme.mix.api.f) {
            ((com.ss.android.ugc.aweme.mix.api.f) eVar).a(this.bv, aweme, new com.ss.android.ugc.aweme.mix.api.a() {
                /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(59636);
                }

                @Override // com.ss.android.ugc.aweme.mix.api.a
                public final void a(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.mix.api.a
                public final void b(boolean z) {
                    if (z) {
                        Aweme aD = a.this.aD();
                        if (aD != null) {
                            aD.playlist_info = null;
                        }
                        a aVar = a.this;
                        Boolean.valueOf(false);
                        aVar.bq();
                    }
                    DmtStatusView n = a.this.n(true);
                    if (n != null) {
                        n.setVisibility(8);
                    }
                    a.this.N.setDisableScroll(false);
                }
            }, a_(true), str);
        }
    }

    private Aweme a(Aweme aweme, int i2) {
        aj bg2;
        com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
        if (bVar == null) {
            return null;
        }
        Aweme c2 = bVar.c(i2);
        if (c2 != aweme && bL() != aweme) {
            return c2;
        }
        Aweme c3 = this.W.c(i2 + 1);
        if (!com.ss.android.ugc.aweme.story.d.a.c(c3) || (bg2 = bg()) == null || bg2.U() == null) {
            return c3;
        }
        return bg2.U().b();
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    static final /* synthetic */ Object a(Aweme aweme, ai aiVar) {
        try {
            Aweme a2 = com.ss.android.ugc.aweme.ba.a().a(aweme.getAid(), "");
            if (a2 == null) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "topview_detail_update_fail", aweme.getAwemeRawAd()).b();
                }
                return null;
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "topview_detail_update_success", aweme.getAwemeRawAd()).b();
            }
            aiVar.f(a2);
            return null;
        } catch (Exception e2) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "topview_detail_update_fail", aweme.getAwemeRawAd()).b();
            }
            e2.printStackTrace();
        }
    }

    private void c(List<Aweme> list, int i2) {
        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException("insertItemList fall to downgrade logic"));
        this.W.a(list, i2);
    }

    public a(String str, int i2) {
        this.f93692a = 1.0E-10f;
        this.ae = new HashSet();
        this.af = new ArrayList<>();
        this.ag = false;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = null;
        this.f93696e = null;
        this.aE = "";
        this.f93697f = new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59620);
            }

            public final void run() {
                a.this.bt();
            }
        };
        this.aG = false;
        this.aI = false;
        this.aJ = new com.ss.android.ugc.aweme.feed.param.b();
        this.aM = true;
        this.aO = com.ss.android.ugc.aweme.feed.guide.a.a.f93243a;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        this.aS = false;
        this.aT = false;
        this.aU = false;
        this.aW = false;
        this.aX = null;
        this.aY = null;
        this.aZ = -1;
        this.ba = false;
        this.f93701j = false;
        this.bb = true;
        this.f93702l = 0;
        this.bc = false;
        this.bd = false;
        this.bf = false;
        this.bg = false;
        this.bh = false;
        this.bi = false;
        this.bj = true;
        this.bk = false;
        this.bl = 4;
        this.bm = false;
        this.o = "";
        this.q = 0;
        this.r = new com.ss.android.ugc.aweme.feed.n.i();
        this.bn = 0;
        this.bo = new VerticalViewPager.f() {
            /* class com.ss.android.ugc.aweme.feed.q.a.AnonymousClass19 */

            static {
                Covode.recordClassIndex(59631);
            }

            @Override // com.ss.android.ugc.aweme.common.widget.VerticalViewPager.f
            public final boolean b() {
                return com.ss.android.ugc.aweme.commercialize.e.a.b.aH(a.this.aD());
            }

            @Override // com.ss.android.ugc.aweme.common.widget.VerticalViewPager.f
            public final void a() {
                if (!cn.f89704b) {
                    ax.b();
                    com.ss.android.ugc.aweme.feed.guide.i.e();
                } else if (!a.this.aC) {
                    ax.b();
                    com.ss.android.ugc.aweme.feed.guide.i.e();
                    a.this.aC = true;
                }
            }

            @Override // com.ss.android.ugc.aweme.common.widget.VerticalViewPager.f
            public final boolean a(boolean z) {
                if (a.this.be() && com.ss.android.ugc.aweme.commercialize.e.a.b.B(a.this.aD()) && com.ss.android.ugc.aweme.commercialize.e.a.b.m(a.this.aD()).getSwipeUpType() == 5 && (a.this.bv instanceof androidx.fragment.app.e) && AdHomePageDataVM.a.a((androidx.fragment.app.e) a.this.bv).a()) {
                    if (!z) {
                        return true;
                    }
                    if (AdHomePageDataVM.a.a((androidx.fragment.app.e) a.this.bv).f34659c.getValue() == null || AdHomePageDataVM.a.a((androidx.fragment.app.e) a.this.bv).f34659c.getValue().floatValue() < com.bytedance.common.utility.n.b(a.this.bv, 54.0f)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.common.widget.VerticalViewPager.f
            public final int a(int i2, int i3, int i4) {
                if (a.this.bf() == null || a.this.bf().t() == null || a.this.bf().t().b() == null || !a.this.bf().t().b().a(i2, i3, i4)) {
                    return i2;
                }
                a.this.au();
                return i3;
            }

            /* JADX WARNING: Removed duplicated region for block: B:72:0x01c9  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0219  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x0240  */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x0278  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x02b4  */
            @Override // com.ss.android.ugc.aweme.common.widget.VerticalViewPager.f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int a(int r20, int r21, int r22, int r23) {
                /*
                // Method dump skipped, instructions count: 710
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.a.AnonymousClass19.a(int, int, int, int):int");
            }
        };
        this.s = 29000;
        this.t = new com.ss.android.ugc.aweme.feed.x.a();
        this.bq = true;
        this.br = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = false;
        this.y = "home_swipe_up_lottie_android.json";
        this.bs = null;
        this.z = "dialog_opt";
        this.B = 0;
        this.aJ.setEventType(str);
        this.aJ.setPageType(i2);
        com.ss.android.ugc.aweme.feed.e a2 = com.ss.android.ugc.aweme.feed.service.a.a(str, i2, this, this);
        this.aH = a2;
        com.ss.android.ugc.aweme.commercialize.b bVar = new com.ss.android.ugc.aweme.commercialize.b(str, i2);
        this.f93698g = bVar;
        this.aK = new com.ss.android.ugc.aweme.feed.e.f(str, i2, this);
        com.ss.android.ugc.aweme.feed.e.e eVar = new com.ss.android.ugc.aweme.feed.e.e();
        this.aL = eVar;
        eVar.a(a2);
        eVar.a(bVar);
        eVar.a(this.aK);
        this.p = new aw(this.aK, this);
        p(true);
        com.ss.android.ugc.aweme.video.k.f143431c = t();
        AbTestManagerImpl.b().a(this);
        try {
            int intValue = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getBackgroundPausePlayerSetting().intValue();
            if (intValue != 0) {
                this.f93703m = new as(this, intValue);
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }

    private boolean b(int i2, aj ajVar) {
        if (ajVar == null) {
            return false;
        }
        Aweme d2 = this.W.d(i2);
        Aweme P2 = ajVar.P();
        if (com.ss.android.ugc.aweme.story.d.a.c(d2) && d2 != null && P2 != null) {
            return TextUtils.equals(d2.getAid(), P2.getAid());
        }
        if (!x() || d2 == null) {
            if (d2 == P2) {
                return true;
            }
        } else if (P2 != null) {
            return TextUtils.equals(d2.getAid(), P2.getAid());
        }
        return false;
    }

    public final void b(Aweme aweme, int i2) {
        try {
            com.ss.android.ugc.aweme.feed.n.f fVar = this.at;
            if (fVar != null) {
                fVar.a(com.ss.android.ugc.aweme.common.e.h.a(aweme, i2));
            } else {
                c(aweme, i2);
            }
        } catch (com.ss.android.ugc.aweme.common.e.g e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            c(aweme, i2);
        }
    }

    private void b(Aweme aweme, String str, boolean z2, String str2) {
        if (aweme != null) {
            if (!this.aH.f92903h || !com.ss.android.ugc.aweme.experiment.f.c()) {
                a(aweme, str, z2, str2);
            } else {
                c(aweme, str, z2, str2);
            }
        }
    }

    private void c(Aweme aweme, String str, boolean z2, String str2) {
        a(aweme, str, z2, str2, 0, true);
    }

    private void a(Aweme aweme, String str, int i2, String str2) {
        String str3;
        String str4;
        String previousPage;
        String previousPagePosition;
        String searchResultId = this.aJ.getSearchResultId();
        User user = null;
        if (aweme != null) {
            user = aweme.getAuthor();
        }
        if (TextUtils.isEmpty(searchResultId)) {
            if (aweme != null) {
                searchResultId = aweme.getAid();
            } else {
                searchResultId = "";
            }
        }
        com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().a("homepage_hot");
        a2.f109596a = u.c.ITEM;
        a2.f109597b = u.a.FOLLOW;
        a2.o(str2).g(aweme).a(user).b();
        boolean z2 = false;
        if (!(aweme == null || aweme.getBottomBarModel() == null)) {
            z2 = true;
        }
        if (user == null || user.getFollowerStatus() != 1) {
            str3 = "single";
        } else {
            str3 = "mutual";
        }
        if (com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        com.ss.android.ugc.aweme.metrics.v a3 = new com.ss.android.ugc.aweme.metrics.v().a(a_(true));
        if (TextUtils.isEmpty(this.aJ.getPreviousPage())) {
            previousPage = this.aJ.getEventType();
        } else {
            previousPage = this.aJ.getPreviousPage();
        }
        a3.f109605b = previousPage;
        if (TextUtils.isEmpty(this.aJ.getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            previousPagePosition = this.aJ.getPreviousPagePosition();
        }
        a3.f109606c = previousPagePosition;
        a3.f109607d = z2;
        a3.s = str2;
        a3.f109608e = str;
        com.ss.android.ugc.aweme.metrics.v vVar = (com.ss.android.ugc.aweme.metrics.v) a3.c(aweme, this.aJ.getPageType()).l(this.aJ.getSearchId()).f(searchResultId);
        vVar.aa = i2;
        vVar.X = this.aJ.getChallengeId();
        vVar.Y = this.aJ.getParentTagId();
        vVar.ad = aweme.isHighlighted();
        vVar.ae = aweme.getOriginalPos();
        vVar.af = this.aJ.getCategoryName();
        com.ss.android.ugc.aweme.metrics.v a4 = vVar.a(aweme.getAuthor());
        a4.V = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
        a4.v = str3;
        a4.W = str4;
        com.ss.android.ugc.aweme.metrics.c a5 = a4.b_(com.ss.android.ugc.aweme.story.d.a.b(aweme)).n(com.ss.android.ugc.aweme.feed.x.y.a(this.aJ.getPreviousPage(), this.aJ.getFromGroupId())).a(com.ss.android.ugc.aweme.utils.w.a(aweme, "follow", this.aJ.getEventType()));
        com.ss.android.ugc.aweme.upvote.event.c.a(a5, aweme, a_(true));
        a5.f();
    }

    private void a(Aweme aweme, String str, boolean z2, int i2, ag agVar) {
        String previousPage;
        String previousPagePosition;
        String str2;
        if (z2) {
            c(aweme);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", this.aJ.getEventType());
            jSONObject.put("impr_type", ac.j(aweme));
            jSONObject.put("compilation_id", aweme.getMixId());
            jSONObject.put("request_id", an().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            if (!"homepage_hot".equals(this.aJ.getEventType())) {
                jSONObject.put("previous_page", this.aJ.getEnterMethodValue());
            }
            jSONObject.put("request_id", ac.a(aweme, this.aJ.getPageType()));
            jSONObject.put("is_photo", ac.f(aweme));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.common.r.a("follow", this.aJ.getEventType(), str, ac.e(aweme), jSONObject);
        if (z2) {
            if (agVar == null || TextUtils.isEmpty(agVar.n) || (!"card_button".equals(agVar.n) && !"expand_card".equals(agVar.n) && !"small_card".equals(agVar.n))) {
                str2 = "main_head";
            } else {
                str2 = agVar.n;
            }
            a(aweme, str, i2, str2);
            if (TextUtils.equals(this.aJ.getEventType(), "search_result")) {
                SearchResultStatisticsImpl.a().a(new com.ss.android.ugc.aweme.discover.mob.f("search_follow", str, "search_video", true, "", "", ""));
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.metrics.w a2 = new com.ss.android.ugc.aweme.metrics.w().a(a_(true));
        if (TextUtils.isEmpty(this.aJ.getPreviousPage())) {
            previousPage = this.aJ.getEventType();
        } else {
            previousPage = this.aJ.getPreviousPage();
        }
        a2.f109609a = previousPage;
        if (TextUtils.isEmpty(this.aJ.getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            previousPagePosition = this.aJ.getPreviousPagePosition();
        }
        a2.f109610b = previousPagePosition;
        a2.f109612d = "follow_button";
        a2.f109611c = str;
        a2.c(aweme, this.aJ.getPageType()).f();
    }

    private void a(Aweme aweme, String str, boolean z2, String str2, int i2, boolean z3) {
        if (aweme == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("AWEME == NULL");
            return;
        }
        if (this.aH.c() == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ACTIVITY == NULL");
        } else if (this.aH.c().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!RelationLabelHelper.hasDuoShanLabel(aweme) && RelationLabelHelper.hasCommentId(aweme)) {
            arrayList.add(aweme.getFeedRelationLabel().getExtra().getCid());
        } else if (aweme.getOriginCommentIds() != null) {
            arrayList.addAll(aweme.getOriginCommentIds());
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        aC();
        c.a a2 = new c.a(com.ss.android.ugc.aweme.feed.x.m.c(aweme)).a(arrayList);
        a2.f72007h = this.aJ.getCreationId();
        a2.f72004e = z2;
        a2.f72008i = this.aJ.isFromPostList();
        a2.f72005f = str2;
        a2.f72006g = this.aJ.getPreviousPage();
        a2.o = this.aJ.getChallengeId();
        a2.p = this.aJ.getParentTagId();
        a2.f72003d = z3;
        a2.f72011l = i2;
        if (TextUtils.equals(str2, "bubble")) {
            a2.f72001b = true;
        }
        com.ss.android.ugc.aweme.feed.e eVar = this.aH;
        if (eVar instanceof com.ss.android.ugc.aweme.comment.f.b) {
            ((com.ss.android.ugc.aweme.comment.f.b) eVar).a(a2.a());
        }
        this.f93699h = false;
    }
}

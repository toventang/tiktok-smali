package com.ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.q;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.e;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.ch.a;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize.utils.af;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.experiment.BatteryTask;
import com.ss.android.ugc.aweme.experiment.bu;
import com.ss.android.ugc.aweme.experiment.dd;
import com.ss.android.ugc.aweme.experiment.de;
import com.ss.android.ugc.aweme.experiment.dl;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.ab.BottomGradualOptimizeConfig;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.assem.f;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.feedwidget.GeneralVideoMaskWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.PhotosensitiveVideoMaskWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.ReportVideoMaskWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoCaptionWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoRelationBtnWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoReviewStatusWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoTopCautionWidgetV1;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.i.w;
import com.ss.android.ugc.aweme.feed.l.a.a;
import com.ss.android.ugc.aweme.feed.l.a.b;
import com.ss.android.ugc.aweme.feed.l.b.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.share.a;
import com.ss.android.ugc.aweme.feed.ui.DebugInfoView;
import com.ss.android.ugc.aweme.feed.ui.FeedInterceptTouchLayout;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.aw;
import com.ss.android.ugc.aweme.feed.ui.bh;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.feed.x.aa;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgFeedBottomNoticeBar;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.report.d;
import com.ss.android.ugc.aweme.report.f;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.setting.ui.RestrictTextView;
import com.ss.android.ugc.aweme.share.y;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.z;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.l.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoViewCell extends VideoBaseCell implements aw, i, j {
    TagLayout A;
    AnimationImageView B;
    ConstraintLayout C;
    LinearLayout D;
    LinearLayout E;
    LinearLayout F;
    protected ViewGroup G;
    LongPressLayout H;
    protected FrameLayout I;
    protected FrameLayout J;
    protected FrameLayout K;
    public FrameLayout L;
    protected FrameLayout M;
    protected FrameLayout N;
    protected RelativeLayout O;
    ViewGroup P;
    ViewGroup Q;
    TextView R;
    View S;
    ImageView T;
    public View U;
    TuxIconView V;
    TuxIconView W;
    TextView X;
    View Y;
    TuxTextView Z;

    /* renamed from: a  reason: collision with root package name */
    private boolean f91539a;
    protected DataCenter aA;
    protected e aB;
    public com.ss.android.ugc.aweme.feed.assem.b aC;
    protected Handler aD = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass1 */

        static {
            Covode.recordClassIndex(57627);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            long j2 = 5000;
            if (message.what == 20) {
                com.ss.android.ugc.aweme.im.service.model.j jVar = (com.ss.android.ugc.aweme.im.service.model.j) message.obj;
                com.ss.android.ugc.aweme.feed.share.a.a(jVar, VideoViewCell.this.aw);
                if (!jVar.f103923k) {
                    if (!TextUtils.isEmpty(jVar.f103921i)) {
                        j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                    VideoViewCell.this.aD.sendEmptyMessageDelayed(21, j2);
                }
            } else if (message.what == 21) {
                com.ss.android.ugc.aweme.feed.share.a.c(VideoViewCell.this.aw);
            } else if (message.what == 23) {
                com.ss.android.ugc.aweme.feed.share.a.a(VideoViewCell.this.aw);
            } else if (message.what == 25) {
                com.ss.android.ugc.aweme.feed.share.a.b(VideoViewCell.this.aw);
            } else if (message.what == 31) {
                be beVar = VideoViewCell.this.aw;
                l.d(beVar, "");
                TuxIconView tuxIconView = beVar.f91699d;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                }
                TextView textView = beVar.f91700e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TuxTextView tuxTextView = beVar.f91696a;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                TuxTextView tuxTextView2 = beVar.f91696a;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(d.a().getResources().getString(R.string.g_i));
                }
                TuxIconView tuxIconView2 = beVar.f91698c;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
                float b2 = n.b(d.a(), 32.0f);
                View view = beVar.f91697b;
                if (view != null) {
                    view.getLayoutParams().height = 0;
                    view.requestLayout();
                    view.setVisibility(0);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b2);
                    ofFloat.addUpdateListener(new a.i(view));
                    l.b(ofFloat, "");
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                sendEmptyMessageDelayed(32, 5000);
            } else if (message.what == 32) {
                be beVar2 = VideoViewCell.this.aw;
                l.d(beVar2, "");
                if (beVar2.f91697b != null && beVar2.f91697b.getVisibility() != 8) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat((float) beVar2.f91697b.getHeight(), 0.0f);
                    com.ss.android.ugc.aweme.feed.share.a.f93868a = ofFloat2;
                    if (ofFloat2 != null) {
                        ofFloat2.addUpdateListener(new a.C2276a(beVar2));
                    }
                    ValueAnimator valueAnimator = com.ss.android.ugc.aweme.feed.share.a.f93868a;
                    if (valueAnimator != null) {
                        valueAnimator.setDuration(300L);
                    }
                    ValueAnimator valueAnimator2 = com.ss.android.ugc.aweme.feed.share.a.f93868a;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    };
    public float aE;
    protected com.ss.android.ugc.aweme.feed.e.l aF;
    protected e aG;
    protected BaseFeedPageParams aH;
    boolean aI = false;
    final f.a.b.a aJ = new f.a.b.a();
    private com.ss.android.ugc.aweme.video.f.a aL;
    private boolean aM = false;
    private View.OnTouchListener aN;
    private LongPressLayout.a aO;
    private int aP = -1;
    private long aQ;
    private long aR;
    private boolean aS = false;
    private boolean aT = false;
    private boolean aU = false;
    private ScrollSwitchStateManager aV;
    private String aW;
    private long aX = -1;
    private boolean aY;
    private VideoViewModel aZ;
    View aa;
    FrameLayout ab;
    ImageView ac;
    ImageView ad;
    ImageView ae;
    ImageView af;
    DebugInfoView ag;
    FrameLayout ah;
    ViewGroup ai;
    public Space aj;
    ViewGroup ak;
    ConstraintLayout al;
    ConstraintLayout am;
    LinearLayout an;
    protected long ao;
    protected Context ap;
    protected s<ag> aq;
    public JSONObject ar;
    public bd as;
    protected com.ss.android.ugc.aweme.feed.helper.c at = new com.ss.android.ugc.aweme.feed.helper.c();
    public com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a au;
    boolean av = false;
    public be aw;
    IVideoGiftService ax = VideoGiftService.l();
    protected boolean ay = true;
    public String az = "click";

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.tux.tooltip.a f91540b;
    private VideoPlayViewModel ba;
    private VideoPlaySearchViewModel bb;
    private VideoEventDispatchViewModel bc;
    private com.ss.android.ugc.aweme.o.c bd;
    private FrameLayout be;
    private ViewTreeObserver.OnGlobalLayoutListener bf = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass10 */

        static {
            Covode.recordClassIndex(57628);
        }

        public final void onGlobalLayout() {
            if (VideoViewCell.this.ax() != VideoViewCell.this.aE && VideoViewCell.this.au != null) {
                VideoViewCell.this.au.a((int) VideoViewCell.this.ax(), VideoViewCell.this.I.getHeight());
                VideoViewCell videoViewCell = VideoViewCell.this;
                videoViewCell.aE = videoViewCell.ax();
            }
        }
    };
    private int bg;
    private boolean bh = true;
    private boolean bi = false;
    private double bj = -1.0d;
    private Widget bk;
    private Widget bl;
    private boolean bm = false;
    private final String bn = "click_video_duet_button";
    private SparseBooleanArray bo = new SparseBooleanArray();
    private u<FollowStatus> bp = new u<FollowStatus>() {
        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass9 */

        static {
            Covode.recordClassIndex(57643);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(FollowStatus followStatus) {
        }
    };
    private final Set<f> bq = new ConcurrentHashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f91541c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.helper.d f91542d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f91543e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f91544f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f91545g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f91546h;
    protected RelativeLayout q;
    protected com.ss.android.ugc.aweme.feed.adapter.a.a r;
    protected SmartImageView s;
    FrameLayout t;
    ViewGroup u;
    FrameLayout v;
    View w;
    protected View x;
    RestrictTextView y;
    View z;

    static {
        Covode.recordClassIndex(57626);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.k, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void b(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(int i2) {
    }

    /* access modifiers changed from: protected */
    public void e(Aweme aweme) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(VideoViewCell.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onDecoderBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final ah p() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final int s() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final ai v() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final com.ss.android.ugc.aweme.video.f.a O() {
        return this.aL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final com.ss.android.ugc.aweme.feed.adapter.a.a Q() {
        return this.r;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final boolean R() {
        return this.f91541c;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final com.ss.android.ugc.aweme.feed.helper.d S() {
        return this.f91542d;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final boolean T() {
        return this.ay;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final boolean X() {
        return this.bi;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final View ad() {
        return this.I;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce
    public final View al() {
        return this.I;
    }

    public final Context an() {
        return this.ap;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce
    public final JSONObject ap() {
        return this.ar;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce
    public final double ar() {
        return this.bj;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce
    public final DataCenter at() {
        return this.aA;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public Aweme b() {
        return this.f91515j;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final bd t() {
        return this.as;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce
    public final void a(View.OnTouchListener onTouchListener) {
        this.aA.a("bind_title_touch_listener", onTouchListener);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void a(Aweme aweme, int i2) {
        this.f91516k = i2;
        if (K() && bu.h() && com.ss.android.ugc.aweme.ca.j.f69613b == 0) {
            Iterator<T> it = com.ss.android.ugc.aweme.ca.j.f69612a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            com.ss.android.ugc.aweme.ca.j.f69612a.clear();
        }
        a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public void a(Aweme aweme) {
        if (aweme != null) {
            this.f91515j = aweme;
            H();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj
    public final void a(w wVar) {
        if (this.f91515j.getAid().equals(wVar.f93499b.getAid())) {
            UrlModel urlModel = wVar.f93498a.labelPrivate;
            this.f91515j.setLabelPrivate(urlModel);
            this.f91515j.setHybridLabels(wVar.f93498a.hybridLabels);
            AwemeLabelModel awemeLabelModel = null;
            if (urlModel != null) {
                awemeLabelModel = new AwemeLabelModel();
                awemeLabelModel.setLabelType(1);
                awemeLabelModel.setUrlModels(urlModel);
            }
            if (!(this.f91515j == null || this.f91515j.videoLabels == null)) {
                if (this.f91515j.videoLabels.size() == 0) {
                    this.f91515j.videoLabels.add(0, awemeLabelModel);
                } else {
                    this.f91515j.videoLabels.set(0, awemeLabelModel);
                }
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f91515j.getHybridLabels()) || (SharePrefCache.inst().getIsPrivateAvailable().c().booleanValue() && urlModel != null && !com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList()))) {
                this.A.b(this.f91515j, this.f91515j.getVideoLabels(), TagLayout.f68328f);
                return;
            }
            TagLayout tagLayout = this.A;
            View a2 = tagLayout.a(1);
            if (!(a2 == null && (a2 = tagLayout.a(11)) == null)) {
                int indexOfChild = tagLayout.indexOfChild(a2);
                ArrayList arrayList = new ArrayList();
                if (indexOfChild != -1) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < tagLayout.getChildCount(); i2++) {
                        if (i2 > indexOfChild) {
                            arrayList.add(tagLayout.getChildAt(i2));
                            arrayList2.add(ObjectAnimator.ofFloat(tagLayout.getChildAt(i2), "translationX", 0.0f, (float) ((int) (((float) (-a2.getWidth())) - n.b(tagLayout.f68330b, 7.0f)))));
                        }
                    }
                    animatorSet.setDuration(200L);
                    animatorSet.playSequentially(arrayList2);
                    animatorSet.start();
                }
                a2.animate().alpha(0.0f).setDuration(150).withEndAction(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0111: INVOKE  
                      (wrap: android.view.ViewPropertyAnimator : 0x0108: INVOKE  (r1v3 android.view.ViewPropertyAnimator) = 
                      (wrap: android.view.ViewPropertyAnimator : 0x0102: INVOKE  (r2v4 android.view.ViewPropertyAnimator) = 
                      (wrap: android.view.ViewPropertyAnimator : 0x00fe: INVOKE  (r0v20 android.view.ViewPropertyAnimator) = (r4v1 'a2' android.view.View) type: VIRTUAL call: android.view.View.animate():android.view.ViewPropertyAnimator)
                      (0.0f float)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.alpha(float):android.view.ViewPropertyAnimator)
                      (150 long)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.setDuration(long):android.view.ViewPropertyAnimator)
                      (wrap: com.ss.android.ugc.aweme.base.ui.TagLayout$2 : 0x010e: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.base.ui.TagLayout$2) = 
                      (r5v0 'tagLayout' com.ss.android.ugc.aweme.base.ui.TagLayout)
                      (r4v1 'a2' android.view.View)
                      (r3v1 'arrayList' java.util.ArrayList)
                     call: com.ss.android.ugc.aweme.base.ui.TagLayout.2.<init>(com.ss.android.ugc.aweme.base.ui.TagLayout, android.view.View, java.util.List):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.withEndAction(java.lang.Runnable):android.view.ViewPropertyAnimator in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(com.ss.android.ugc.aweme.feed.i.w):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x010e: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.base.ui.TagLayout$2) = 
                      (r5v0 'tagLayout' com.ss.android.ugc.aweme.base.ui.TagLayout)
                      (r4v1 'a2' android.view.View)
                      (r3v1 'arrayList' java.util.ArrayList)
                     call: com.ss.android.ugc.aweme.base.ui.TagLayout.2.<init>(com.ss.android.ugc.aweme.base.ui.TagLayout, android.view.View, java.util.List):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(com.ss.android.ugc.aweme.feed.i.w):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 32 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.base.ui.TagLayout, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 38 more
                    */
                /*
                // Method dump skipped, instructions count: 277
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(com.ss.android.ugc.aweme.feed.i.w):void");
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(String str, String str2) {
                if (this.f91515j != null && TextUtils.equals(this.f91515j.getAid(), str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if ((TextUtils.equals(ao(), "homepage_hot") || TextUtils.equals(ao(), "personal_homepage") || TextUtils.equals(ao(), "others_homepage") || TextUtils.equals(ao(), "challenge")) && this.A != null) {
                        this.f91515j.setFeedRelationLabel(RelationLabelHelper.mockStarCommentLabel(this.f91515j.getAuthor()));
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(com.ss.android.ugc.aweme.im.service.model.l lVar) {
                com.ss.android.ugc.aweme.framework.a.a.b(3, "VideoViewCell", "shareSending" + lVar.f103925b + " enter from: " + lVar.f103930g);
                if (this.f91515j == null) {
                    return;
                }
                if ((TextUtils.equals(lVar.f103924a, this.f91515j.getAid()) || "publish_share_panel".equals(lVar.f103930g)) && !CommentServiceImpl.e().a(this.ap) && !aT()) {
                    au();
                    this.aW = lVar.f103925b;
                    TextView textView = this.X;
                    if (textView != null) {
                        textView.setOnClickListener(new bk(this, lVar));
                    }
                    com.ss.android.ugc.aweme.feed.share.a.f93870c.a(lVar, this.aw);
                    this.aD.sendEmptyMessageDelayed(23, lVar.f103926c);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(com.ss.android.ugc.aweme.im.service.model.n nVar) {
                if (TextUtils.isEmpty(this.aW) || this.aW == nVar.f103934b) {
                    com.ss.android.ugc.aweme.framework.a.a.b("VideoViewCell", "shareUndo" + nVar.f103934b);
                    au();
                    com.ss.android.ugc.aweme.feed.share.a.a(nVar, this.aw);
                    this.aD.sendEmptyMessageDelayed(25, nVar.f103935c);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(com.ss.android.ugc.aweme.im.service.model.j jVar) {
                com.ss.android.ugc.aweme.framework.a.a.b(3, "VideoViewCell", "shareComplete" + jVar.f103919g + " enter from: " + jVar.f103917e);
                if (this.f91515j == null) {
                    return;
                }
                if ((!TextUtils.equals(jVar.f103919g, this.f91515j.getAid()) && !jVar.f103917e.equals("publish_share_panel")) || CommentServiceImpl.e().a(this.ap)) {
                    return;
                }
                if (aT()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ci6).a();
                } else if ((TextUtils.isEmpty(this.aW) || TextUtils.isEmpty(jVar.f103921i) || this.aW == jVar.f103921i) && this.aD != null) {
                    au();
                    Message obtainMessage = this.aD.obtainMessage(20);
                    obtainMessage.what = 20;
                    obtainMessage.obj = jVar;
                    if (TextUtils.isEmpty(jVar.f103921i)) {
                        this.aD.sendMessage(obtainMessage);
                    } else {
                        this.aD.sendMessageDelayed(obtainMessage, 500);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void a(com.ss.android.ugc.aweme.im.service.model.d dVar) {
                if (dVar.f103895a <= 0) {
                    this.aD.sendEmptyMessage(21);
                } else {
                    this.aD.sendEmptyMessageDelayed(21, dVar.f103895a);
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(Context context) {
                com.ss.android.ugc.aweme.story.g.f137757a.a((androidx.fragment.app.e) context, ao(), this.f91515j);
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(final String str) {
                this.az = str;
                if (this.bm) {
                    p.f93149a.a(new r(true, new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass15 */

                        static {
                            Covode.recordClassIndex(57633);
                        }

                        public final void run() {
                            VideoViewCell.this.f91514i.setEnterMethodValue(str);
                        }
                    }));
                } else {
                    this.f91514i.setEnterMethodValue(str);
                }
                aS();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ce
            public void a(Video video) {
                this.ay = true;
                this.f91542d = new com.ss.android.ugc.aweme.feed.helper.d();
                Aweme aweme = this.f91515j;
                com.ss.android.ugc.aweme.feed.helper.c cVar = this.at;
                Context context = this.ap;
                View y2 = this.r.y();
                SmartImageView smartImageView = this.s;
                if (aweme == null) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) new NullPointerException("aweme is null"));
                } else if (aweme.isVr()) {
                    com.ss.android.ugc.aweme.feed.helper.c.a(y2);
                    com.ss.android.ugc.aweme.feed.helper.c.a(smartImageView);
                } else if (aweme.getVideo() != null) {
                    cVar.a(context, aweme.getVideo(), y2, smartImageView, aweme.getOcrLocation());
                }
                this.at.a(this.ap, aweme.getVideo(), this.ab, aweme.getOcrLocation());
                e("bindCoverImage");
                if (br.a(this.f91515j, 3)) {
                    if (video == null || !a(video.getOriginCover())) {
                        ci.a(this.s);
                        this.s.setImageURI(Uri.parse("res://" + this.ap.getPackageName() + "/2131099659"));
                        return;
                    }
                    v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(video.getOriginCover()));
                    a2.A = q.HIGH;
                    v a3 = a2.a("VideoViewCell");
                    a3.E = this.s;
                    a3.a(new com.ss.android.ugc.aweme.feed.n.j(this, this.f91542d));
                } else if (video == null || video.getPlayAddr() == null || com.bytedance.common.utility.collection.b.a((Collection) video.getPlayAddr().getUrlList()) || !a(video.getOriginCover())) {
                    ci.a(this.s, this.ap);
                } else if (com.ss.android.ugc.aweme.feed.x.g.d(this)) {
                    v a4 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(video.getOriginCover())).a("VideoViewCell");
                    a4.E = this.s;
                    a4.a(new com.ss.android.ugc.aweme.feed.n.j(this, this.f91542d));
                } else {
                    if (!com.ss.android.ugc.aweme.player.a.f114913a ? com.bytedance.ies.abmock.b.a().a(true, "player_prerender_cover_need", 1) != 1 : !((Boolean) com.ss.android.ugc.aweme.player.c.f115052a.getValue()).booleanValue()) {
                        if (!aweme.isAd()) {
                            this.s.setVisibility(8);
                            this.ay = false;
                            return;
                        }
                    }
                    if (m.a(aweme) && aweme.isProhibited()) {
                        ci.a(this.s, this.ap);
                    } else if (!com.bytedance.ies.abmock.b.a().a(true, "enable_reuse_external_image", false) || this.aH.awemeFromPage != 2 || video.getCachedOuterCoverUrl() == null || video.getCachedOuterCoverUrl().getUrlList().isEmpty()) {
                        v a5 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(video.getOriginCover()));
                        a5.A = q.HIGH;
                        v a6 = a5.a("VideoViewCell");
                        a6.E = this.s;
                        a6.a(new com.ss.android.ugc.aweme.feed.n.j(this, this.f91542d));
                    } else {
                        v a7 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(video.getCachedOuterCoverUrl()));
                        if (video.getCachedOuterCoverSize() != null) {
                            a7.b(video.getCachedOuterCoverSize());
                        }
                        v a8 = a7.a("VideoViewCell");
                        a8.E = this.s;
                        a8.f39907c = false;
                        a8.a(new com.ss.android.ugc.aweme.feed.n.j(this, this.f91542d));
                    }
                    this.ay = true;
                }
            }

            public void a(View view, boolean z2) {
                int i2;
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
                if (!z2) {
                    view.setAlpha(1.0f);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ce
            public final void a(boolean z2, int i2) {
                View view = this.Y;
                if (view != null) {
                    if (z2) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = i2;
                        this.Y.setLayoutParams(layoutParams);
                        this.Y.requestLayout();
                    }
                    this.Y.setVisibility(z2 ? 0 : 8);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(boolean z2, boolean z3) {
                this.as.c(z2);
                if (z2) {
                    cl.f91792b = true;
                    final ViewPropertyAnimator duration = this.q.animate().alpha(0.0f).setDuration(200);
                    if (z3) {
                        duration.setListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass17 */

                            static {
                                Covode.recordClassIndex(57635);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                VideoViewCell.this.q.setVisibility(8);
                                duration.setListener(null);
                            }
                        });
                    }
                    duration.start();
                    this.f91541c = true;
                    return;
                }
                cl.f91792b = false;
                this.q.setVisibility(0);
                this.q.animate().alpha(1.0f).setDuration(200).start();
                if (this.f91541c) {
                    this.f91541c = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void a(long j2) {
                if (!br.a(this.f91515j, 3)) {
                    RelativeLayout relativeLayout = this.q;
                    TagLayout tagLayout = this.A;
                    if (tagLayout != null) {
                        Iterator a2 = k.e(af.b(tagLayout)).a();
                        while (a2.hasNext()) {
                            View view = (View) a2.next();
                            Object tag = view.getTag(af.f75562a);
                            if (!(tag instanceof Long)) {
                                tag = null;
                            }
                            Long l2 = (Long) tag;
                            if (l2 != null) {
                                long longValue = l2.longValue();
                                if (longValue > 0) {
                                    view.postDelayed(new af.b(view, relativeLayout, tagLayout), longValue);
                                }
                            }
                            af.a(relativeLayout, tagLayout, view);
                        }
                    }
                }
                if (!this.f91539a && this.ag != null) {
                    if (TextUtils.isEmpty(this.f91515j.getExtra())) {
                        o.a(this.ag, 8);
                    } else {
                        o.a(this.ag, 0);
                        this.ag.setContent(this.f91515j.getExtra());
                    }
                }
                TagLayout tagLayout2 = this.A;
                if (!(tagLayout2 == null || tagLayout2.f68332d == null)) {
                    if ((TextUtils.equals(tagLayout2.f68331c, "homepage_hot") || TextUtils.equals(tagLayout2.f68331c, "homepage_follow")) && tagLayout2.f68332d.getRelationRecommendInfo() != null) {
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", tagLayout2.f68331c).a("group_id", tagLayout2.f68332d.getAid()).a("author_id", tagLayout2.f68332d.getAuthorUid()).a("rec_type", tagLayout2.f68332d.getRelationRecommendInfo().getRecommendType()).a("label_text", tagLayout2.f68332d.getRelationRecommendInfo().getRelationTextKey());
                        if (tagLayout2.f68332d.getMutualRelation() != null && com.ss.android.ugc.aweme.friends.e.b()) {
                            a3.a("is_avatar", com.ss.android.ugc.aweme.friends.e.c());
                            a3.a("maf_num", tagLayout2.f68332d.getMutualRelation().getTotal());
                        }
                        com.ss.android.ugc.aweme.common.r.a("show_label", a3.f66730a);
                    } else if (!(tagLayout2.f68332d.getRelationLabel() == null || !tagLayout2.f68332d.getRelationLabel().isValid() || tagLayout2.f68333e == null)) {
                        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("show").setLabelName("like_banner").setValue(tagLayout2.f68332d.getAid()).setExtValueString(com.ss.android.ugc.aweme.account.b.g().getCurUserId()));
                    }
                }
                if (this.f91515j != null && this.f91515j.isAd()) {
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("ad_show").setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("request_id", RequestIdService.a().a(this.f91515j, this.aH.pageType)).a()).setExtValueString(this.f91515j.getAid()));
                }
                if (TextUtils.equals(ao(), "homepage_hot")) {
                    com.ss.android.ugc.aweme.commercialize.g.g().a(this.ap, this.f91515j, j2);
                    com.ss.android.ugc.aweme.commercialize.g.g().b(this.ap, this.f91515j, j2);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void a(String str, int i2, int i3, String str2) {
                VideoCaptionUpdateParams videoCaptionUpdateParams = new VideoCaptionUpdateParams.Builder().setAwemeId(str).setCode(i2).setTimestamp(i3).setCaptionText(str2).mParams;
                this.aA.a("update_caption_text", videoCaptionUpdateParams);
                VideoViewModel videoViewModel = this.aZ;
                l.d(videoCaptionUpdateParams, "");
                videoViewModel.a(new VideoViewModel.c(videoCaptionUpdateParams));
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void a(String str, int i2, int i3, int i4, long j2) {
                this.aA.a("update_audio_state", (Object) true);
                com.ss.android.ugc.aweme.common.r.a("tts_switch_play_quality", new com.ss.android.ugc.aweme.app.f.d().a("duration", j2).a("tts_pre_cache_size", i3).a("tts_bitrate", i4).a("is_success", i2).a("group_id", str).a("author_id", str).f66730a);
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ce
            public final void a(LongPressLayout.a aVar) {
                LongPressLayout longPressLayout = this.H;
                if (longPressLayout != null) {
                    longPressLayout.setListener(aVar);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: com.ss.android.ugc.aweme.feed.i.s<com.ss.android.ugc.aweme.feed.i.ag> */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x0249  */
            /* JADX WARNING: Removed duplicated region for block: B:116:0x030f  */
            /* JADX WARNING: Removed duplicated region for block: B:119:0x0351  */
            /* JADX WARNING: Removed duplicated region for block: B:121:0x0369  */
            /* JADX WARNING: Removed duplicated region for block: B:122:0x036b  */
            /* JADX WARNING: Removed duplicated region for block: B:123:0x036e  */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x03a1  */
            /* JADX WARNING: Removed duplicated region for block: B:135:0x03a7  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x03aa  */
            /* JADX WARNING: Removed duplicated region for block: B:139:0x03b3  */
            /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x016c  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x0174  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0186  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
            /* JADX WARNING: Removed duplicated region for block: B:81:0x01af  */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x01da  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b r7) {
                /*
                // Method dump skipped, instructions count: 1052
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void a(Map<String, AwemeStatisticsBackup> map) {
                if (this.f91515j == null || map == null || map.size() == 0) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalArgumentException("list is empty,should never happen!"));
                    return;
                }
                for (int i2 = 0; i2 < map.size(); i2++) {
                    String aid = this.f91515j.getAid();
                    if (!(map.get(aid) == null || this.aA == null)) {
                        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedBackupHelper", "aid:" + aid + ".start to update statistics!");
                        this.aA.a("awesome_update_backup_data", this.f91514i);
                        VideoViewModel videoViewModel = this.aZ;
                        if (videoViewModel != null) {
                            videoViewModel.a(new VideoViewModel.m(this.f91514i));
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void a(f fVar) {
                this.bq.add(fVar);
            }

            private void aM() {
                this.au = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a(this);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aA() {
                i(0);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aD() {
                this.as.a(this.aB);
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ce
            public final boolean aq() {
                return this.f91517l.getUserVisibleHint();
            }

            @Override // com.ss.android.ugc.aweme.feed.ui.aw
            public final int aw() {
                return this.be.getHeight();
            }

            /* access modifiers changed from: protected */
            public float ax() {
                return this.aj.getY();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public void l() {
                this.as.x();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void r() {
                B();
                C();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ah
            public final boolean w() {
                return this.r.w();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ah
            public final Surface x() {
                return this.r.x();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ah
            public final View y() {
                return this.r.y();
            }

            /* access modifiers changed from: package-private */
            public class b implements com.ss.android.ugc.aweme.sticker.k.c {

                /* renamed from: b  reason: collision with root package name */
                private boolean f91572b;

                static {
                    Covode.recordClassIndex(57645);
                }

                @Override // com.ss.android.ugc.aweme.sticker.k.c
                public final void b() {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(false, false));
                }

                @Override // com.ss.android.ugc.aweme.sticker.k.c
                public final void c() {
                    this.f91572b = false;
                    if (VideoViewCell.ai() && VideoViewCell.this.aF != null) {
                        this.f91572b = true;
                        VideoViewCell.this.aF.a(VideoViewCell.this.f91515j, false, false);
                    }
                }

                @Override // com.ss.android.ugc.aweme.sticker.k.c
                public final void d() {
                    if (this.f91572b && VideoViewCell.this.aF != null) {
                        VideoViewCell.this.aF.a(VideoViewCell.this.f91515j, false, false);
                    }
                }

                @Override // com.ss.android.ugc.aweme.sticker.k.c
                public final void a() {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(true, false));
                    if (!VideoViewCell.ai() && VideoViewCell.this.aF != null) {
                        VideoViewCell.this.aF.a(VideoViewCell.this.f91515j, true, false);
                    }
                }

                private b() {
                }

                /* synthetic */ b(VideoViewCell videoViewCell, byte b2) {
                    this();
                }
            }

            private boolean aT() {
                if (this.f91515j == null || !this.f91515j.isAd()) {
                    return false;
                }
                return true;
            }

            private String aZ() {
                String str = this.aH.challengeId;
                if (str == null) {
                    return "";
                }
                return str;
            }

            public static boolean ai() {
                return com.ss.android.ugc.aweme.video.v.O().o();
            }

            private boolean ba() {
                if (!gg.f90139a || !this.aU) {
                    return false;
                }
                return true;
            }

            private boolean bf() {
                if (!K() || !com.ss.android.ugc.aweme.feed.experiment.w.b()) {
                    return false;
                }
                return true;
            }

            private boolean bg() {
                if (!K() || !com.ss.android.ugc.aweme.feed.experiment.w.c()) {
                    return false;
                }
                return true;
            }

            private boolean bh() {
                if (!K() || !com.ss.android.ugc.aweme.feed.experiment.w.d()) {
                    return false;
                }
                return true;
            }

            private boolean bi() {
                if (!K() || !com.ss.android.ugc.aweme.feed.experiment.w.e()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ah
            public final void A() {
                if (!ba()) {
                    am();
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void D() {
                SmartImageView smartImageView = this.s;
                if (smartImageView != null) {
                    smartImageView.setVisibility(8);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final aj U() {
                com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                if (aVar != null) {
                    return aVar.d();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai
            public final void Y() {
                if (this.f91515j != null) {
                    this.y.a(this.f91515j.getAid());
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aC() {
                h(this.f91515j);
                g(this.f91515j);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ Long aE() {
                return Long.valueOf(System.currentTimeMillis() - this.ao);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aG() {
                this.aB.a(this.v, com.ss.android.ugc.aweme.feed.ui.c.d());
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai
            public final void ab() {
                DataCenter dataCenter = this.aA;
                if (dataCenter != null) {
                    dataCenter.a("show_festival_activity_icon", (Object) null);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai
            public void ac() {
                AbsInteractStickerWidget absInteractStickerWidget;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                if (aVar != null && (absInteractStickerWidget = aVar.o) != null) {
                    absInteractStickerWidget.f();
                }
            }

            public final String ao() {
                if (this.aH.eventType == null) {
                    return "";
                }
                return this.aH.eventType;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g
            public final long av() {
                return com.ss.android.ugc.aweme.video.v.O().n();
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ Long ay() {
                return Long.valueOf(System.currentTimeMillis() - this.ao);
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ah
            public final void z() {
                am();
                this.as.z();
            }

            /* access modifiers changed from: package-private */
            public class a implements com.ss.android.ugc.aweme.sticker.k.b {
                static {
                    Covode.recordClassIndex(57644);
                }

                @Override // com.ss.android.ugc.aweme.sticker.k.b
                public final void a() {
                    if (VideoViewCell.this.aF != null) {
                        VideoViewCell.this.aF.a(VideoViewCell.this.f91515j, false, false);
                    }
                }

                private a() {
                }

                /* synthetic */ a(VideoViewCell videoViewCell, byte b2) {
                    this();
                }
            }

            private boolean J() {
                if (!this.aH.isMyProfile) {
                    return false;
                }
                if ((this.aH.pageType == 1000 || this.aH.pageType == 1014) && com.ss.android.ugc.aweme.experiment.f.c()) {
                    return true;
                }
                return false;
            }

            private void aN() {
                if (!bi() && !J()) {
                    this.aB.b(R.id.c4q, com.ss.android.ugc.aweme.feed.ui.c.a(this.aN, ao()));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: aP */
            public void aK() {
                if (!hh.b() && TextUtils.equals(ao(), "homepage_hot")) {
                    this.aB.b(R.id.fg4, new VideoRelationBtnWidget());
                }
            }

            private static Boolean aQ() {
                boolean z2;
                boolean c2 = com.ss.android.ugc.aweme.compliance.api.a.o().c();
                if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || c2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            private void aU() {
                DataCenter dataCenter = this.aA;
                if (dataCenter != null) {
                    dataCenter.a("stopPlayAnimation", (Object) true);
                }
                VideoPlayViewModel videoPlayViewModel = this.ba;
                if (videoPlayViewModel != null) {
                    videoPlayViewModel.i();
                }
                this.aU = false;
            }

            private String aV() {
                if (this.aH.getPreviousPage() == null) {
                    return "";
                }
                return this.aH.getPreviousPage();
            }

            private String aW() {
                if (this.aH.getFromGroupId() == null) {
                    return "";
                }
                return this.aH.getFromGroupId();
            }

            private String aX() {
                if (aV().equals("") || this.aH.getPreviousPagePosition() == null) {
                    return "";
                }
                return this.aH.getPreviousPagePosition();
            }

            private String aY() {
                if (this.aH.param.getCreationId() == null) {
                    return "";
                }
                return this.aH.param.getCreationId();
            }

            private boolean bc() {
                if (com.ss.android.ugc.aweme.main.c.a().f109217a) {
                    return true;
                }
                if (!TextUtils.equals(ao(), "homepage_follow") || !com.ss.android.ugc.aweme.main.c.a().f109218b) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void B() {
                if (this.r.b()) {
                    View y2 = this.r.y();
                    if (y2.getVisibility() != 0) {
                        o.a(y2, 0);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void E() {
                BusinessComponentServiceUtils.getBusinessBridgeService().b();
                this.r.y();
                b();
                ao();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void M() {
                this.aA.a("video_show_share_stay_home_animation", (Object) null);
                VideoShareViewModel a2 = com.ss.android.ugc.aweme.feed.assem.a.a.a(this);
                if (a2 != null) {
                    a2.a(VideoShareViewModel.k.f92439a);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void N() {
                this.aA.a("video_hide_share_stay_home_animation", (Object) null);
                VideoShareViewModel a2 = com.ss.android.ugc.aweme.feed.assem.a.a.a(this);
                if (a2 != null) {
                    a2.a(VideoShareViewModel.d.f92436a);
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b
            public final AbsInteractStickerWidget aA_() {
                AbsInteractStickerWidget a2 = StickerServiceImpl.c().a();
                a2.a(this);
                this.aG.a(R.id.bqg, a2);
                return a2;
            }

            @Override // com.ss.android.ugc.playerkit.videoview.k
            public final void aB_() {
                if (this.aM) {
                    this.aM = false;
                    if (this.r.b() && this.aI) {
                        com.ss.android.ugc.aweme.video.v.O().D();
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aF() {
                View findViewById = this.I.findViewById(R.id.az0);
                if (findViewById != null) {
                    this.aB.a(findViewById, com.ss.android.ugc.aweme.feed.ui.c.i());
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai
            public void aa() {
                ac();
                com.bytedance.tux.tooltip.a aVar = this.f91540b;
                if (aVar != null) {
                    aVar.dismiss();
                    this.f91540b = null;
                }
                y.f124429b = false;
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final com.ss.android.ugc.aweme.feed.assem.b ae() {
                com.ss.android.ugc.aweme.feed.assem.b bVar = this.aC;
                if (bVar != null) {
                    return bVar;
                }
                com.ss.android.ugc.aweme.feed.assem.b bVar2 = new com.ss.android.ugc.aweme.feed.assem.b(this.aH, new br(this), K(), this.bq);
                this.aC = bVar2;
                return bVar2;
            }

            /* access modifiers changed from: protected */
            public void ah() {
                if (!bg()) {
                    this.aB.a(this.I, new VideoTopCautionWidgetV1());
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public void m() {
                ac();
                this.aA.a("video_on_pause", (Object) null);
                this.as.y();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final void u() {
                if (this.r.b()) {
                    this.r.y().setVisibility(8);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: I */
            public void aL() {
                Bundle bundle = new Bundle();
                if (this.aH.param != null) {
                    bundle.putBoolean("isDuetChain", this.aH.param.isFromDuetChain());
                } else {
                    bundle.putBoolean("isDuetChain", false);
                }
                this.aB.b(R.id.aqa, com.ss.android.ugc.aweme.feed.ui.c.a(bundle));
            }

            private void aS() {
                JSONObject a2 = a(this.f91515j, this.aH, this.az);
                this.ar = a2;
                this.as.a(a2);
                if (this.bm) {
                    p.f93149a.a(new r(true, new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass16 */

                        static {
                            Covode.recordClassIndex(57634);
                        }

                        public final void run() {
                            VideoViewCell.this.f91514i.setRequestId(VideoViewCell.this.ar);
                        }
                    }));
                } else {
                    this.f91514i.setRequestId(this.ar);
                }
            }

            private void bb() {
                Rect rect = new Rect();
                this.w.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.aa.getGlobalVisibleRect(rect2);
                int b2 = (rect.bottom - rect2.bottom) + ((int) n.b(this.ap, 72.0f));
                if (b2 != this.w.getLayoutParams().height) {
                    this.w.getLayoutParams().height = b2;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: be */
            public void aB() {
                if (this.f91515j == null || bf()) {
                    return;
                }
                if (this.f91515j.shouldShowReviewStatus() || com.ss.android.ugc.aweme.utils.y.a(this.f91515j)) {
                    this.aB.a(this.v, new VideoReviewStatusWidget());
                }
            }

            private void o() {
                this.aA = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.d.a(this.f91517l, this), this.f91517l);
                e a2 = e.a(this.f91517l, this.I);
                this.aB = a2;
                a2.a(this.aA);
                n();
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.ai
            public final int[] Z() {
                if (this.f91515j == null || this.f91515j.getAuthor() == null || this.f91515j.getAuthor().getFollowStatus() != 0) {
                    return null;
                }
                int[] iArr = new int[2];
                View findViewById = this.S.findViewById(R.id.b7a);
                if (findViewById == null) {
                    return null;
                }
                findViewById.getLocationOnScreen(iArr);
                return iArr;
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj
            public final int a() {
                if (this.f91515j != null) {
                    return this.f91515j.getAwemeType();
                }
                return 0;
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void aI() {
                if (!bi() || !com.ss.android.ugc.aweme.feed.experiment.u.f93089a) {
                    this.aA.a("on_bottom_layer_clicked", (Object) 1);
                } else {
                    this.aZ.a(new VideoViewModel.b());
                }
            }

            /* access modifiers changed from: protected */
            public void ag() {
                if (!K() || !com.ss.android.ugc.aweme.feed.experiment.w.a()) {
                    this.aB.b(R.id.ffo, new VideoCaptionWidget());
                }
                if (!d.f91797a && !EventBus.a().a(this)) {
                    EventBus.a(EventBus.a(), this);
                }
            }

            /* access modifiers changed from: protected */
            public final void au() {
                Handler handler = this.aD;
                if (handler != null) {
                    handler.removeMessages(20);
                    this.aD.removeMessages(21);
                    this.aD.removeMessages(23);
                    this.aD.removeMessages(25);
                    this.aD.removeMessages(31);
                    this.aD.removeMessages(32);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            public final void h() {
                fr.f142950d = false;
                com.bytedance.monitor.collector.d.f41460d = false;
                if (dd.f89765a) {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(57642);
                        }

                        public final void run() {
                            if (!com.ss.android.ugc.aweme.ca.e.f69601a) {
                                if (com.ss.android.ugc.aweme.ca.e.f69602b == 0) {
                                    Jato.preloadCpusetInfo();
                                } else if (com.ss.android.ugc.aweme.ca.e.f69602b == 2) {
                                    com.ss.android.ugc.aweme.ca.e.f69601a = true;
                                }
                                com.ss.android.ugc.aweme.ca.e.f69602b++;
                                Jato.getInnerExecutorService().execute(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE  
                                      (wrap: java.util.concurrent.ExecutorService : 0x0011: INVOKE  (r1v1 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.Jato.getInnerExecutorService():java.util.concurrent.ExecutorService)
                                      (wrap: com.ss.android.ugc.aweme.ca.e$1 : 0x0017: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.ca.e$1) =  call: com.ss.android.ugc.aweme.ca.e.1.<init>():void type: CONSTRUCTOR)
                                     type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.8.run():void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.ca.e$1) =  call: com.ss.android.ugc.aweme.ca.e.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.8.run():void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 21 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ca.e, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 27 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = com.ss.android.ugc.aweme.ca.e.f69601a
                                    if (r0 != 0) goto L_0x001d
                                    int r0 = com.ss.android.ugc.aweme.ca.e.f69602b
                                    r2 = 1
                                    if (r0 != 0) goto L_0x001e
                                    com.bytedance.common.jato.Jato.preloadCpusetInfo()
                                L_0x000c:
                                    int r0 = com.ss.android.ugc.aweme.ca.e.f69602b
                                    int r0 = r0 + r2
                                    com.ss.android.ugc.aweme.ca.e.f69602b = r0
                                    java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.Jato.getInnerExecutorService()
                                    com.ss.android.ugc.aweme.ca.e$1 r0 = new com.ss.android.ugc.aweme.ca.e$1
                                    r0.<init>()
                                    r1.execute(r0)
                                L_0x001d:
                                    return
                                L_0x001e:
                                    int r1 = com.ss.android.ugc.aweme.ca.e.f69602b
                                    r0 = 2
                                    if (r1 != r0) goto L_0x000c
                                    com.ss.android.ugc.aweme.ca.e.f69601a = r2
                                    goto L_0x000c
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass8.run():void");
                            }
                        }, 500);
                    }
                    if (!ba() && com.ss.android.ugc.aweme.video.v.O().o()) {
                        am();
                    }
                    d.a.f120589a.b();
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void k() {
                    fr.f142950d = true;
                    com.ss.android.ugc.aweme.lego.p.f107614a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(57641);
                        }

                        public final void run() {
                            fr.f142950d = false;
                        }
                    }, 600);
                    fr.c(1000);
                    fr.b(1500);
                    fr.a(1000);
                    if (com.ss.android.ugc.aweme.video.v.O().o()) {
                        aU();
                    }
                    d.a.f120589a.a();
                }

                private void bd() {
                    int i2;
                    if (!c.b.f66221a.q || (com.ss.android.ugc.aweme.commercialize.e.a.b.B(this.f91515j) && !com.ss.android.ugc.aweme.commercialize.e.a.b.af(this.f91515j) && !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34785a)) {
                        i2 = 0;
                    } else {
                        i2 = -com.ss.android.ugc.aweme.adaptation.c.a();
                    }
                    com.ss.android.ugc.aweme.commercialize.e.a.b.af(this.f91515j);
                    if (com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                        i2 += com.ss.android.ugc.aweme.adaptation.c.f66195e;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.q.getLayoutParams();
                    layoutParams.bottomMargin = i2;
                    this.q.setLayoutParams(layoutParams);
                    b(c.b.f66221a.s, c.b.f66221a.t);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void C() {
                    if (this.r.b()) {
                        View y2 = this.r.y();
                        com.bytedance.common.utility.collection.d<SurfaceView> dVar = ce.a.f91760a.get(this.ap);
                        if (dVar != null) {
                            Iterator<SurfaceView> it = dVar.iterator();
                            while (it.hasNext()) {
                                SurfaceView next = it.next();
                                if (next != y2) {
                                    o.a(next, 8);
                                }
                            }
                        }
                        com.bytedance.common.utility.collection.d<ce> dVar2 = ce.a.f91761b.get(this.ap);
                        if (dVar2 != null) {
                            Iterator<ce> it2 = dVar2.iterator();
                            while (it2.hasNext()) {
                                ce next2 = it2.next();
                                if (next2 != this) {
                                    VideoViewCell videoViewCell = (VideoViewCell) next2;
                                    if ((videoViewCell.f91516k == this.f91516k - 1 || videoViewCell.f91516k == this.f91516k + 1) && videoViewCell.f91515j != null) {
                                        videoViewCell.a(videoViewCell.f91515j.getVideo());
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void L() {
                    Aweme aweme = null;
                    this.aA.a("video_show_share_guide_animation", (Object) null);
                    VideoShareViewModel a2 = com.ss.android.ugc.aweme.feed.assem.a.a.a(this);
                    if (a2 != null && !a2.f92434m && com.bytedance.ies.abmock.b.a().a(true, "interction_share_button_style", 0) == 0 && VideoShareViewModel.k() == 0) {
                        VideoItemParams videoItemParams = (VideoItemParams) a2.g();
                        if (videoItemParams != null) {
                            aweme = videoItemParams.mAweme;
                        }
                        if (!z.d(aweme) && !z.c(aweme) && !com.ss.android.ugc.aweme.feed.helper.w.a(a2.h())) {
                            h.a.f93250a.b(ac.e(aweme));
                            ai.b();
                            a2.n = true;
                            a2.a(new VideoShareViewModel.j(a2));
                        }
                    }
                }

                public void af() {
                    this.aA.a("feed_internal_event", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("to_profile", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("update_diig_view", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_comment_list", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_gift_stripe_show_comment_list_gift_panel", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_share_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("on_render_ready", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_more_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_digg", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("title_view_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("video_duet_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("use_translated_caption", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                    if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                        com.ss.android.ugc.aweme.common.f.c.a(this.F);
                    }
                    if (dl.d()) {
                        com.ss.android.ugc.aweme.lego.p.f107614a.post(new bx(this));
                    } else {
                        aH();
                    }
                }

                /* access modifiers changed from: protected */
                public void aj() {
                    this.au.a(this.f91515j);
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                    Aweme aweme = aVar.f130288a;
                    if (aweme != null && aweme.getInteractStickerStructs() != null) {
                        Aweme aweme2 = aVar.f130288a;
                        if (aweme2 == null) {
                            l.b();
                        }
                        ArrayList<InteractStickerStruct> arrayList = new ArrayList<>(aweme2.getInteractStickerStructs());
                        Aweme aweme3 = aVar.f130288a;
                        if (aweme3 != null && aweme3.isProhibited()) {
                            arrayList = new ArrayList<>();
                        }
                        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                            if (aVar.o == null) {
                                aVar.c();
                            }
                            aVar.a(arrayList);
                        } else if (aVar.o != null) {
                            aVar.a(new ArrayList<>());
                        }
                    } else if (aVar.o != null) {
                        aVar.a(new ArrayList<>());
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: ak */
                public void az() {
                    InteractStickerViewModel interactStickerViewModel;
                    if (!gg.f90139a || !this.aT) {
                        this.aT = true;
                        com.ss.android.ugc.aweme.video.i O2 = com.ss.android.ugc.aweme.video.v.O();
                        this.au.a(this.f91515j);
                        this.au.f130293f = O2;
                        this.au.f130294g = null;
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                        Aweme aweme = aVar.f130288a;
                        if (aweme == null || !aweme.isProhibited()) {
                            b.i.b(new a.b(aVar), b.i.f4824a).a(new a.c(aVar), b.i.f4826c, null);
                        } else if (aVar.f130289b != null) {
                            DataCenter dataCenter = aVar.f130289b;
                            if (dataCenter != null) {
                                dataCenter.a("interact_sticker_video_data", new ArrayList());
                            }
                        } else if (aVar.f130297j != null && (interactStickerViewModel = aVar.f130297j) != null) {
                            interactStickerViewModel.a("interact_sticker_video_data", new ArrayList());
                        }
                    }
                }

                public void am() {
                    this.aU = true;
                    if (this.aA != null && !com.ss.android.ugc.aweme.power.c.a().b()) {
                        this.aA.a("startPlayAnimation", (Object) true);
                        VideoPlayViewModel videoPlayViewModel = this.ba;
                        if (videoPlayViewModel != null) {
                            videoPlayViewModel.a(new VideoPlayViewModel.j());
                        }
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(this.f91515j) && !com.ss.android.ugc.aweme.commercialize.e.a.b.af(this.f91515j)) {
                        this.as.a(this.I);
                    } else if (com.ss.android.ugc.aweme.feed.z.a(this.bg) && !this.f91541c) {
                        a(this.q, bc());
                    }
                }

                public final void as() {
                    View findViewById;
                    Aweme b2 = b();
                    if (y.a(b2) && this.f91517l.getActivity() != null) {
                        if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                            findViewById = this.I.findViewById(R.id.ac7);
                        } else {
                            findViewById = this.I.findViewById(R.id.e0s);
                        }
                        if (findViewById != null) {
                            com.bytedance.tux.tooltip.a d2 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(this.ap).a(3000L).a(androidx.core.content.b.c(this.ap, R.color.bn))).a(b2.getBubbleInfo().getText()).a(com.bytedance.tux.tooltip.h.END).b(findViewById).a(false).a(new bm(this, b2)).a(false, (View.OnClickListener) null).d();
                            this.f91540b = d2;
                            d2.a();
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void c() {
                    super.c();
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("stopPlayAnimation", (Object) true);
                    }
                    e(false);
                    this.au.a(this.f91515j);
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                    if (aVar.o != null) {
                        if (aVar.f130289b != null) {
                            DataCenter dataCenter2 = aVar.f130289b;
                            if (dataCenter2 != null) {
                                dataCenter2.a("interact_sticker_clear_data", (Object) null);
                            }
                            DataCenter dataCenter3 = aVar.f130289b;
                            if (dataCenter3 != null) {
                                dataCenter3.a("interact_sticker_aweme_data", (Object) null);
                            }
                            DataCenter dataCenter4 = aVar.f130289b;
                            if (dataCenter4 != null) {
                                dataCenter4.a("interact_sticker_video_data", (Object) null);
                            }
                        } else {
                            InteractStickerViewModel interactStickerViewModel = aVar.f130297j;
                            if (interactStickerViewModel != null) {
                                interactStickerViewModel.a("interact_sticker_clear_data", (Object) null);
                            }
                            InteractStickerViewModel interactStickerViewModel2 = aVar.f130297j;
                            if (interactStickerViewModel2 != null) {
                                interactStickerViewModel2.a("interact_sticker_aweme_data", (Object) null);
                            }
                            InteractStickerViewModel interactStickerViewModel3 = aVar.f130297j;
                            if (interactStickerViewModel3 != null) {
                                interactStickerViewModel3.a("interact_sticker_video_data", (Object) null);
                            }
                        }
                    }
                    UserService.d().b().removeObserver(this.bp);
                    i(false);
                    com.ss.android.ugc.aweme.o.c cVar = this.bd;
                    if (cVar != null) {
                        cVar.c();
                    }
                }

                @Override // com.ss.android.ugc.aweme.adaptation.c.AbstractC1481c
                public final void d() {
                    if (this.q != null) {
                        bd();
                        this.at.a(this.ap, this.f91515j.getVideo(), this.r.y(), this.s, this.f91515j.getOcrLocation());
                        if (this.f91515j.getVideo() != null) {
                            this.at.a(this.ap, this.f91515j.getVideo(), this.ab, this.f91515j.getOcrLocation());
                        }
                        this.as.m();
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public void j() {
                    AbsInteractStickerWidget absInteractStickerWidget;
                    if (!d.f91797a && EventBus.a().a(this)) {
                        EventBus.a().b(this);
                    }
                    com.ss.android.ugc.aweme.feed.l.a.b.a();
                    if (com.ss.android.ugc.aweme.feed.x.e.a(this.f91515j)) {
                        com.ss.android.ugc.aweme.commercialize.g.e().a(this.f91515j);
                    }
                    this.as.T();
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                    if (!(aVar == null || (absInteractStickerWidget = aVar.o) == null)) {
                        absInteractStickerWidget.g();
                    }
                    Handler handler = this.aD;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    this.bj = -1.0d;
                    this.aJ.dispose();
                    this.r.i();
                }

                public void n() {
                    af();
                    if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                        com.ss.android.ugc.aweme.common.f.c.a(this.F);
                    }
                    this.bm = true;
                    this.as.b(this.aA);
                    if (((Boolean) dl.f89794e.getValue()).booleanValue()) {
                        com.ss.android.ugc.aweme.lego.p.f107614a.post(new bh(this));
                    } else {
                        this.as.a(this.aB);
                    }
                    this.aG = e.a(this.f91517l, this.I);
                    aM();
                    ah();
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void q() {
                    String str;
                    if (this.aA != null) {
                        b(this.f91515j, this.f91516k);
                        if (this.f91515j != null && !aQ().booleanValue()) {
                            int i2 = 8;
                            if (this.f91515j.getPlaylist_info() != null) {
                                ConstraintLayout constraintLayout = this.C;
                                if (!com.ss.android.ugc.aweme.feed.x.g.a(this.f91515j)) {
                                    i2 = 0;
                                }
                                constraintLayout.setVisibility(i2);
                                if (this.aH.eventType != null) {
                                    str = this.aH.eventType;
                                } else {
                                    str = "";
                                }
                                com.ss.android.ugc.aweme.report.f.a(this.f91515j, this.v, this.C, str);
                                return;
                            }
                            this.C.setVisibility(8);
                        }
                    }
                }

                private void aO() {
                    ViewGroup viewGroup;
                    if (this.bk == null && !FeedParamProvider.a.a(this.ap).isHideMusicText() && !bi()) {
                        Widget e2 = com.ss.android.ugc.aweme.feed.ui.c.e();
                        this.bk = e2;
                        this.aB.b(R.id.fhx, e2);
                    }
                    if (!com.ss.android.ugc.aweme.feed.experiment.ac.a() && (viewGroup = this.P) != null) {
                        viewGroup.getLayoutParams().width = this.P.getContext().getResources().getDimensionPixelSize(R.dimen.g0);
                    }
                    if (FeedParamProvider.a.a(this.ap).isHideMusicText()) {
                        com.ss.android.ugc.aweme.lego.p.a().post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass11 */

                            static {
                                Covode.recordClassIndex(57629);
                            }

                            public final void run() {
                                VideoViewCell.this.P.setPadding(VideoViewCell.this.P.getLeft(), 0, VideoViewCell.this.P.getRight(), 0);
                                ViewGroup.LayoutParams layoutParams = VideoViewCell.this.P.getLayoutParams();
                                if (layoutParams instanceof FrameLayout.LayoutParams) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    layoutParams2.topMargin = 0;
                                    layoutParams2.bottomMargin = 0;
                                }
                            }
                        });
                    }
                    if (this.bl == null && !bi() && !this.f91545g) {
                        Widget f2 = com.ss.android.ugc.aweme.feed.ui.c.f();
                        this.bl = f2;
                        this.aB.b(R.id.fhw, f2);
                    }
                    if (com.bytedance.ies.abmock.b.a().a(true, "marquee_title_opt", false) || com.ss.android.ugc.aweme.power.c.a().f115706a == 2) {
                        com.ss.android.ugc.aweme.lego.p.a().post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass12 */

                            static {
                                Covode.recordClassIndex(57630);
                            }

                            public final void run() {
                                ViewGroup.LayoutParams layoutParams = VideoViewCell.this.P.getLayoutParams();
                                layoutParams.width = com.ss.android.ugc.aweme.base.utils.n.a(250.0d);
                                VideoViewCell.this.P.setLayoutParams(layoutParams);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: aR */
                public void aJ() {
                    AwemeTextLabelModel label;
                    com.ss.android.ugc.aweme.feed.x.g.c(this.f91515j);
                    List<AwemeLabelModel> videoLabels = this.f91515j.getVideoLabels();
                    if (this.f91515j.isAd() && !this.f91515j.getAwemeRawAd().isRightStyle() && (label = this.f91515j.getAwemeRawAd().getLabel()) != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(label);
                        this.f91515j.setTextVideoLabels(arrayList);
                    }
                    if (aT() && com.ss.android.ugc.aweme.commercialize.e.a.b.ag(this.f91515j)) {
                        this.A.setVisibility(8);
                    } else if ((!com.bytedance.common.utility.m.a(ao(), "homepage_hot") || aT()) && !TextUtils.equals(ao(), "homepage_familiar") && !com.ss.android.ugc.aweme.commercialize.e.a.b.X(this.f91515j) && !TextUtils.equals(ao(), "challenge")) {
                        this.A.b(this.f91515j, videoLabels, TagLayout.f68328f);
                    } else {
                        if (this.f91515j.getRelationLabel() != null && this.f91515j.getRelationLabel().getType() == 0 && TextUtils.equals(ao(), "homepage_familiar")) {
                            this.f91515j.setRelationLabel(null);
                        }
                        this.A.c(this.f91515j, videoLabels, TagLayout.f68328f);
                    }
                    af.a(this.A);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public void g() {
                    String str;
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34785a = true;
                    this.as.l();
                    if (com.ss.android.ugc.aweme.feed.x.e.a(this.f91515j) && this.I != null) {
                        com.ss.android.ugc.aweme.commercialize.g.e().a(this.ap, this.f91515j, (View) this.I, false);
                    }
                    this.aA.a("on_page_unselected", (Object) true);
                    VideoViewModel videoViewModel = this.aZ;
                    if (videoViewModel != null) {
                        videoViewModel.a(VideoViewModel.j.f91578a);
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.d(this.f91515j.getAid()));
                    this.aZ.a(new VideoViewModel.h(this.f91515j.getAid()));
                    com.ss.android.ugc.aweme.commercialize.g.g().a();
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a aVar = this.au;
                    if (aVar != null) {
                        String str2 = null;
                        if (this.f91515j != null) {
                            str = this.f91515j.getAid();
                        } else {
                            str = null;
                        }
                        Aweme aweme = aVar.f130288a;
                        if (aweme != null) {
                            str2 = aweme.getAid();
                        }
                        if (l.a((Object) str, (Object) str2)) {
                            if (aVar.f130289b != null) {
                                DataCenter dataCenter = aVar.f130289b;
                                if (dataCenter != null) {
                                    dataCenter.a("viewholder_select_status_changed", (Object) false);
                                }
                            } else {
                                InteractStickerViewModel interactStickerViewModel = aVar.f130297j;
                                if (interactStickerViewModel != null) {
                                    interactStickerViewModel.a("viewholder_select_status_changed", (Object) false);
                                }
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.o.c cVar = this.bd;
                    if (cVar != null) {
                        cVar.b();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: G */
                public void aH() {
                    if (K() && com.ss.android.ugc.aweme.ca.j.a()) {
                        com.ss.android.ugc.aweme.ca.j.c();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("eventType", ao());
                    bundle.putString("previousPage", aV());
                    bundle.putString("from_group_id", aW());
                    bundle.putString("previousPagePosition", aX());
                    bundle.putString("creationId", aY());
                    bundle.putString("challengeId", aZ());
                    bundle.putString("extra_parent_tag_id", this.aH.param.getParentTagId());
                    if (!bg() && !this.f91545g && !J()) {
                        this.aB.b(R.id.b23, new VideoFeedTagWidget());
                    }
                    if (!bf()) {
                        if (!K() || !bu.b()) {
                            this.aB.a(this.v, com.ss.android.ugc.aweme.feed.ui.c.d());
                        } else {
                            com.ss.android.ugc.aweme.ca.j.a(new by(this));
                        }
                        com.ss.android.ugc.aweme.language.d.a();
                        if (com.ss.android.ugc.aweme.feed.assem.report.b.a() && TextUtils.equals(ao(), "homepage_hot")) {
                            this.aB.b(R.id.dls, com.ss.android.ugc.aweme.feed.ui.c.c());
                        }
                        if (!K() || !bu.c()) {
                            View findViewById = this.I.findViewById(R.id.az0);
                            if (findViewById != null) {
                                this.aB.a(findViewById, com.ss.android.ugc.aweme.feed.ui.c.i());
                            }
                        } else {
                            com.ss.android.ugc.aweme.ca.j.a(new bz(this));
                        }
                    }
                    if (!bh()) {
                        this.aB.b(R.id.am5, com.ss.android.ugc.aweme.feed.ui.c.a(bundle, new ca(this)));
                        this.aB.b(R.id.e11, com.ss.android.ugc.aweme.feed.ui.c.a());
                        this.aB.b(R.id.co7, com.ss.android.ugc.aweme.feed.ui.c.b());
                        this.aB.b(R.id.a_k, com.ss.android.ugc.aweme.feed.ui.c.h());
                        this.aB.b(R.id.pg, com.ss.android.ugc.aweme.feed.ui.c.j());
                    }
                    if (!bi()) {
                        this.aB.b(R.id.dka, com.ss.android.ugc.aweme.feed.ui.c.g());
                        if (!bi() || !com.ss.android.ugc.aweme.feed.experiment.u.f93089a) {
                            this.aB.b(R.id.fhu, com.ss.android.ugc.aweme.common.widget.a.a());
                        }
                    }
                    if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                        com.ss.android.ugc.aweme.common.f.c.a(this.F);
                    }
                    if (!K() || !bu.d()) {
                        ag();
                    } else {
                        com.ss.android.ugc.aweme.ca.j.a(new cb(this));
                    }
                    aN();
                    aO();
                    if (!K() || !bu.f()) {
                        aL();
                    } else {
                        com.ss.android.ugc.aweme.ca.j.a(new cc(this));
                    }
                    if (!K() || !bu.e()) {
                        aK();
                    } else {
                        com.ss.android.ugc.aweme.ca.j.a(new cd(this));
                    }
                    f(this.f91545g);
                }

                /* JADX WARNING: Removed duplicated region for block: B:42:0x01d9  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x020c  */
                /* JADX WARNING: Removed duplicated region for block: B:66:0x026c  */
                /* JADX WARNING: Removed duplicated region for block: B:69:0x0279  */
                /* JADX WARNING: Removed duplicated region for block: B:80:0x02bf  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void H() {
                    /*
                    // Method dump skipped, instructions count: 707
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.H():void");
                }

                public void bj_() {
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    int i2;
                    String uniqueId;
                    String str;
                    String str2;
                    String str3;
                    int i3;
                    boolean z10;
                    FeedInterceptTouchLayout feedInterceptTouchLayout;
                    TextView textView;
                    String str4;
                    Resources resources;
                    MethodCollector.i(12122);
                    ViewGroup viewGroup = this.G;
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                    }
                    ImageView imageView = this.T;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    Video video = this.f91515j.getVideo();
                    bd();
                    Context context = this.ap;
                    Aweme aweme = this.f91515j;
                    String ao2 = ao();
                    Boolean valueOf = Boolean.valueOf(in.a(aweme.getAuthorUid()));
                    if (!"homepage_hot".equals(ao2) || valueOf.booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    Boolean valueOf3 = Boolean.valueOf("homepage_follow".equals(ao2));
                    if (!"chat_list".equals(ao2) || valueOf.booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    Boolean valueOf4 = Boolean.valueOf(z3);
                    if (!"notification_page".equals(ao2) || valueOf.booleanValue()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    Boolean valueOf5 = Boolean.valueOf(z4);
                    if (!com.ss.android.ugc.aweme.story.c.b.f() || valueOf.booleanValue() || (!"personal_homepage".equals(ao()) && !"others_homepage".equals(ao()))) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    Boolean valueOf6 = Boolean.valueOf(z5);
                    if (valueOf.booleanValue() || (!"following".equals(ao2) && !"other_following".equals(ao2))) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    Boolean valueOf7 = Boolean.valueOf(z6);
                    if (valueOf.booleanValue() || (!"fans".equals(ao2) && !"other_fans".equals(ao2))) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    Boolean valueOf8 = Boolean.valueOf(z7);
                    if (!(context instanceof androidx.fragment.app.e) || !com.ss.android.ugc.aweme.story.d.a.d(aweme) || (!valueOf2.booleanValue() && !valueOf3.booleanValue() && !valueOf4.booleanValue() && !valueOf5.booleanValue() && !valueOf6.booleanValue() && !valueOf7.booleanValue() && !valueOf8.booleanValue())) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (Boolean.valueOf(z8).booleanValue()) {
                        this.z.setVisibility(0);
                        this.z.setOnClickListener(new bl(this, context));
                    } else {
                        this.z.setVisibility(8);
                    }
                    aJ();
                    if (this.f91515j.isRelieve()) {
                        this.B.setAnimation("anti_addiction_tag.json");
                        this.B.a();
                        this.B.b(true);
                        this.B.setVisibility(0);
                    } else {
                        AnimationImageView animationImageView = this.B;
                        if (animationImageView != null) {
                            try {
                                animationImageView.d();
                            } catch (NullPointerException e2) {
                                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                            }
                            this.B.setVisibility(8);
                        }
                    }
                    if (SharePrefCache.inst().isOb().c().booleanValue()) {
                        this.y.setVisibility(0);
                        this.y.a(this.f91515j.getAid());
                    } else {
                        this.y.setVisibility(8);
                    }
                    if (this.f91515j == null || this.f91515j.getCommerceVideoAuthInfo() == null || this.f91515j.getCommerceVideoAuthInfo().getDarkPostStatus() != 1) {
                        this.E.setVisibility(8);
                    } else {
                        this.E.setVisibility(0);
                    }
                    if (aT()) {
                        this.C.setVisibility(8);
                        this.al.setVisibility(8);
                        ConstraintLayout constraintLayout = this.am;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                        this.as.c(this.f91515j);
                    } else {
                        this.D.setVisibility(8);
                        this.al.setVisibility(8);
                        ConstraintLayout constraintLayout2 = this.am;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        }
                        this.ak.setVisibility(8);
                        if (!m.g(this.f91515j) || this.f91515j.isProhibitedAndShouldTell() || com.ss.android.ugc.aweme.utils.y.a(this.f91515j) || com.ss.android.ugc.aweme.feed.x.g.a(this.f91515j)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        ConstraintLayout constraintLayout3 = this.C;
                        if (z9) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        constraintLayout3.setVisibility(i2);
                        if (m.g(this.f91515j)) {
                            Aweme aweme2 = this.f91515j;
                            ConstraintLayout constraintLayout4 = this.C;
                            l.d(aweme2, "");
                            l.d(constraintLayout4, "");
                            TextView textView2 = (TextView) constraintLayout4.findViewById(R.id.f6b);
                            ImageView imageView2 = (ImageView) constraintLayout4.findViewById(R.id.lk);
                            a.C0730a aVar = new a.C0730a();
                            AwemeRiskModel awemeRiskModel = aweme2.getAwemeRiskModel();
                            l.b(awemeRiskModel, "");
                            String content = awemeRiskModel.getContent();
                            l.b(content, "");
                            com.bytedance.ies.dmt.ui.d.a aVar2 = aVar.a(content).f33382a;
                            l.b(textView2, "");
                            textView2.setText(aVar2);
                            v a2 = com.bytedance.lighten.a.r.a(2131231740);
                            a2.E = (SmartImageView) constraintLayout4.findViewById(R.id.bi7);
                            a2.c();
                            AwemeRiskModel awemeRiskModel2 = aweme2.getAwemeRiskModel();
                            l.b(awemeRiskModel2, "");
                            if (!TextUtils.isEmpty(awemeRiskModel2.getUrl())) {
                                l.b(imageView2, "");
                                imageView2.setVisibility(0);
                                constraintLayout4.setOnClickListener(new f.d(aweme2, constraintLayout4));
                                i3 = 1;
                            } else {
                                l.b(imageView2, "");
                                imageView2.setVisibility(8);
                                constraintLayout4.setOnClickListener(f.e.f120610a);
                                i3 = 0;
                            }
                            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme2.getAid());
                            AwemeRiskModel awemeRiskModel3 = aweme2.getAwemeRiskModel();
                            l.b(awemeRiskModel3, "");
                            com.ss.android.ugc.aweme.common.r.a("info_bar_show", a3.a("content", awemeRiskModel3.getContent()).a("is_clickable", i3).f66730a);
                        } else if (TextUtils.isEmpty(com.ss.android.ugc.aweme.compliance.api.a.b().a()) && !this.f91515j.isProhibitedAndShouldTell() && !com.ss.android.ugc.aweme.utils.y.a(this.f91515j) && !com.ss.android.ugc.aweme.feed.x.g.a(this.f91515j)) {
                            if (!aQ().booleanValue() && this.aH.pageType != 30 && (this.f91515j.hasTrendingBar() || this.f91515j.hasTrendingBarFYP())) {
                                ViewGroup viewGroup2 = this.ak;
                                Aweme aweme3 = this.f91515j;
                                String ao3 = ao();
                                com.ss.android.ugc.aweme.feed.param.b bVar = this.aH.param;
                                l.d(viewGroup2, "");
                                l.d(aweme3, "");
                                l.d(ao3, "");
                                com.ss.android.ugc.aweme.feed.l.a.b.a();
                                viewGroup2.setVisibility(0);
                                viewGroup2.removeAllViews();
                                b.a aVar3 = new b.a();
                                l.d(viewGroup2, "");
                                l.d(aweme3, "");
                                l.d(ao3, "");
                                b.a a4 = aVar3.a(new com.ss.android.ugc.aweme.feed.l.b.c(10, new a.C2266a(viewGroup2, aweme3, ao3, bVar)));
                                l.d(viewGroup2, "");
                                l.d(aweme3, "");
                                l.d(ao3, "");
                                b.a a5 = a4.a(new com.ss.android.ugc.aweme.feed.l.b.c(9, new a.b(viewGroup2, aweme3, ao3, bVar)));
                                b.a aVar4 = new b.a(viewGroup2);
                                l.d(aVar4, "");
                                a5.f93582b = aVar4;
                                com.ss.android.ugc.aweme.feed.l.b.b bVar2 = new com.ss.android.ugc.aweme.feed.l.b.b(a5.f93581a);
                                bVar2.f93579c = a5.f93582b;
                                com.ss.android.ugc.aweme.feed.l.a.b.f93573a = bVar2;
                                if (!bVar2.f93578b) {
                                    int keyAt = bVar2.f93580d.keyAt(0);
                                    if (!bVar2.f93578b && bVar2.f93580d.indexOfKey(keyAt) >= 0 && bVar2.f93580d.size() != 0) {
                                        bVar2.b();
                                        int indexOfKey = bVar2.f93580d.indexOfKey(keyAt);
                                        com.ss.android.ugc.aweme.feed.l.b.c valueAt = bVar2.f93580d.valueAt(indexOfKey);
                                        l.b(valueAt, "");
                                        com.ss.android.ugc.aweme.feed.l.b.c cVar = valueAt;
                                        bVar2.f93577a = cVar;
                                        cVar.a(new b.e(bVar2, indexOfKey));
                                        if (bVar2.f93579c != null && bVar2.f93579c == null) {
                                            l.b();
                                        }
                                    }
                                }
                            } else if (this.am != null && com.ss.android.ugc.aweme.ch.a.a(this.f91515j)) {
                                Aweme aweme4 = this.f91515j;
                                ConstraintLayout constraintLayout5 = this.am;
                                l.d(aweme4, "");
                                l.d(constraintLayout5, "");
                                try {
                                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                    l.b(iESSettingsProxy, "");
                                    UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                                    if (awemeActivitySetting != null) {
                                        constraintLayout5.setVisibility(0);
                                        TuxTextView tuxTextView = (TuxTextView) constraintLayout5.findViewById(R.id.dk4);
                                        SmartImageView smartImageView = (SmartImageView) constraintLayout5.findViewById(R.id.dk3);
                                        l.b(tuxTextView, "");
                                        UgFeedBottomNoticeBar ugFeedBottomNoticeBar = awemeActivitySetting.getUgFeedBottomNoticeBar();
                                        if (ugFeedBottomNoticeBar == null || (str2 = ugFeedBottomNoticeBar.getText()) == null) {
                                            str2 = "";
                                        }
                                        tuxTextView.setText(str2);
                                        UgFeedBottomNoticeBar ugFeedBottomNoticeBar2 = awemeActivitySetting.getUgFeedBottomNoticeBar();
                                        if (ugFeedBottomNoticeBar2 == null || (str3 = ugFeedBottomNoticeBar2.getIcon()) == null) {
                                            str3 = "";
                                        }
                                        v a6 = com.bytedance.lighten.a.r.a(str3);
                                        a6.E = smartImageView;
                                        a6.v = com.bytedance.lighten.a.w.CENTER_INSIDE;
                                        a6.c();
                                        constraintLayout5.setOnClickListener(new a.View$OnClickListenerC1581a(constraintLayout5, awemeActivitySetting, aweme4));
                                        com.ss.android.ugc.aweme.common.r.a("text_link_show", new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme4.getAid()).f66730a);
                                    }
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            } else if (!aQ().booleanValue() && this.f91515j.getPlaylist_info() != null) {
                                this.C.setVisibility(0);
                                if (this.aH.eventType != null) {
                                    str = this.aH.eventType;
                                } else {
                                    str = "";
                                }
                                com.ss.android.ugc.aweme.report.f.a(this.f91515j, this.v, this.C, str);
                            } else if (!aQ().booleanValue() && this.ax.a(this.f91515j) && this.ax.c().size() < 3 && !this.ax.d() && b() != null && b().getAuthor() != null) {
                                this.al.setVisibility(0);
                                TuxTextView tuxTextView2 = (TuxTextView) this.al.findViewById(R.id.bbl);
                                User author = b().getAuthor();
                                if (TextUtils.isEmpty(author.getUniqueId())) {
                                    uniqueId = author.getShortId();
                                } else {
                                    uniqueId = author.getUniqueId();
                                }
                                tuxTextView2.setText(this.ap.getResources().getString(R.string.hb0, uniqueId));
                                this.al.setOnClickListener(new View.OnClickListener() {
                                    /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass13 */

                                    static {
                                        Covode.recordClassIndex(57631);
                                    }

                                    public final void onClick(View view) {
                                        ClickAgent.onClick(view);
                                        if (VideoViewCell.this.f91515j != null && VideoViewCell.this.f91515j.getStatus() != null && VideoViewCell.this.f91515j.getStatus().isAllowComment()) {
                                            VideoViewCell.this.aA.a("video_gift_stripe_show_comment_list_gift_panel", (Object) 58);
                                        }
                                    }
                                });
                            }
                        }
                        g(false);
                    }
                    if (this.al.getVisibility() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f91544f = z10;
                    if (!ac.h(this.f91515j) || !this.f91515j.isProhibited()) {
                        this.R.setVisibility(8);
                    } else {
                        this.R.setVisibility(0);
                        TextView textView3 = this.R;
                        double a7 = (double) n.a(this.ap);
                        Double.isNaN(a7);
                        textView3.setWidth((int) (a7 * 0.56d));
                        if (!TextUtils.isEmpty(this.f91515j.getVideoDetailNotice())) {
                            this.R.setText(this.f91515j.getVideoDetailNotice());
                        } else {
                            this.R.setText(R.string.har);
                            com.ss.android.ugc.aweme.app.n.a("notice_content_empty", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "video_detail_notice_bottom").a("log_id", this.f91515j.getRequestId()).a("item_id", this.f91515j.getAid()).a());
                        }
                    }
                    Integer num = (Integer) this.I.getTag(R.id.b1r);
                    if (num != null) {
                        this.aP = num.intValue();
                    }
                    a(video);
                    if (!(this.f91515j == null || this.I == null || this.ai == null)) {
                        Aweme aweme5 = this.f91515j;
                        FrameLayout frameLayout = this.I;
                        ViewGroup viewGroup3 = this.ai;
                        l.d(aweme5, "");
                        l.d(frameLayout, "");
                        if (viewGroup3 != null) {
                            if (aweme5.isScheduleVideo()) {
                                l.d(aweme5, "");
                                if (aweme5.isScheduleVideo() && (textView = (TextView) viewGroup3.findViewById(R.id.f6f)) != null) {
                                    Context context2 = viewGroup3.getContext();
                                    if (context2 == null || (resources = context2.getResources()) == null) {
                                        str4 = null;
                                    } else {
                                        str4 = resources.getString(R.string.fgw, com.ss.android.ugc.aweme.cl.a.f71185a.format(Long.valueOf(aweme5.getScheduleTime() * 1000)));
                                    }
                                    textView.setText(str4);
                                }
                                viewGroup3.setVisibility(0);
                                View findViewById = frameLayout.findViewById(R.id.f6g);
                                if (findViewById != null) {
                                    findViewById.setVisibility(0);
                                }
                                com.ss.android.ugc.aweme.cl.a.a(frameLayout, false);
                                if (com.ss.android.ugc.aweme.im.service.c.k.c()) {
                                    FeedInterceptTouchLayout feedInterceptTouchLayout2 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.e11);
                                    if (feedInterceptTouchLayout2 != null) {
                                        feedInterceptTouchLayout2.setGroupClickable(false);
                                    }
                                    FeedInterceptTouchLayout feedInterceptTouchLayout3 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.e11);
                                    if (feedInterceptTouchLayout3 != null) {
                                        feedInterceptTouchLayout3.setHintTextRes(R.string.fh2);
                                    }
                                }
                                l.d(frameLayout, "");
                                FeedInterceptTouchLayout feedInterceptTouchLayout4 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.b23);
                                if (feedInterceptTouchLayout4 != null) {
                                    feedInterceptTouchLayout4.setHintTextRes(R.string.fh1);
                                }
                                FeedInterceptTouchLayout feedInterceptTouchLayout5 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.am5);
                                if (feedInterceptTouchLayout5 != null) {
                                    feedInterceptTouchLayout5.setHintTextRes(R.string.fh0);
                                }
                                FeedInterceptTouchLayout feedInterceptTouchLayout6 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.a_k);
                                if (feedInterceptTouchLayout6 != null) {
                                    feedInterceptTouchLayout6.setHintTextRes(R.string.fgz);
                                }
                            } else {
                                viewGroup3.setVisibility(8);
                                View findViewById2 = frameLayout.findViewById(R.id.f6g);
                                if (findViewById2 != null) {
                                    findViewById2.setVisibility(8);
                                }
                                com.ss.android.ugc.aweme.cl.a.a(frameLayout, true);
                                if (com.ss.android.ugc.aweme.im.service.c.k.c() && (feedInterceptTouchLayout = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.e11)) != null) {
                                    feedInterceptTouchLayout.setGroupClickable(true);
                                }
                            }
                        }
                    }
                    if (this.H != null) {
                        if ((this.f91515j == null || !this.f91515j.isScheduleVideo()) && !com.ss.android.ugc.aweme.story.d.a.j(this.f91515j) && ((!com.ss.android.ugc.aweme.story.c.b.b() || !this.aH.param.isStoryPage()) && (!com.ss.android.ugc.aweme.story.d.a.g(this.f91515j) || !this.f91515j.isProhibited()))) {
                            this.H.setListener(this.aO);
                        } else {
                            this.H.setListener(null);
                        }
                    }
                    if (this.aP == 4) {
                        com.ss.android.ugc.aweme.lego.f.e().a(new BatteryTask()).a();
                    }
                    MethodCollector.o(12122);
                }

                /* access modifiers changed from: package-private */
                public class c implements com.ss.android.ugc.aweme.sticker.k.a {
                    static {
                        Covode.recordClassIndex(57646);
                    }

                    private c() {
                    }

                    @Override // com.ss.android.ugc.aweme.sticker.k.a
                    public final void a(boolean z) {
                        if (z) {
                            if (!VideoViewCell.ai()) {
                                return;
                            }
                        } else if (VideoViewCell.ai()) {
                            return;
                        }
                        if (VideoViewCell.this.aF != null) {
                            VideoViewCell.this.aF.a(VideoViewCell.this.f91515j, false, false);
                        }
                    }

                    /* synthetic */ c(VideoViewCell videoViewCell, byte b2) {
                        this();
                    }
                }

                private boolean g(int i2) {
                    return this.bo.get(i2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
                    h(3);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void b(String str) {
                    if (this.f91514i != null) {
                        this.f91514i.adapterType = str;
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final aj c(String str) {
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        return aVar.a(str);
                    }
                    return null;
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ h.z i(Aweme aweme) {
                    this.aA.a("social_video_tag_info", aweme);
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPlayCompleted(String str) {
                    this.as.E();
                    this.r.onPlayCompleted(str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPreparePlay(String str) {
                    e("onPreparePlay");
                    this.f91543e = false;
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        aVar.onPreparePlay(str);
                    }
                }

                private static boolean a(UrlModel urlModel) {
                    if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                        return false;
                    }
                    return true;
                }

                private void c(long j2) {
                    long j3 = this.aR;
                    if (j3 > 0) {
                        this.aQ += j2 - j3;
                        b().getAid();
                        this.aR = 0;
                    }
                }

                private void h(int i2) {
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("pausePlayAnimation", Integer.valueOf(i2));
                    }
                    VideoPlayViewModel videoPlayViewModel = this.ba;
                    if (videoPlayViewModel != null) {
                        videoPlayViewModel.a(i2);
                    }
                    this.aU = false;
                }

                private void j(boolean z2) {
                    if (this.aL != null) {
                        if (z2) {
                            this.t.setVisibility(0);
                        } else {
                            this.t.setVisibility(8);
                        }
                        this.aL.a(z2);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.ah
                public final void b(Aweme aweme) {
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("video_resume_play", aweme);
                    }
                    VideoPlayViewModel videoPlayViewModel = this.ba;
                    if (videoPlayViewModel != null) {
                        videoPlayViewModel.a(new VideoPlayViewModel.i(aweme));
                    }
                    SmartImageView smartImageView = this.s;
                    if (smartImageView != null) {
                        ci.a(smartImageView);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void d(Aweme aweme) {
                    if (aweme != null) {
                        this.f91515j = aweme;
                        if (!this.r.b()) {
                            this.r.a((com.ss.android.ugc.playerkit.videoview.k) this);
                        }
                    }
                }

                public Aweme f(int i2) {
                    if (!com.ss.android.ugc.aweme.story.d.a.c(this.f91515j)) {
                        return this.f91515j;
                    }
                    if (U() == null) {
                        return null;
                    }
                    return U().b();
                }

                public final void g(boolean z2) {
                    if (QnaService.a().enablePublicQna() && this.f91517l.getActivity() != null) {
                        bh.a(this.f91517l, this.f91515j, this.an, this.aH.eventType, z2);
                    }
                }

                @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
                public void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
                    if (!d.f91797a && jVar.f91311b.optString("eventName") == t.f95364a) {
                        com.ss.android.ugc.aweme.experiment.n.f90266a = true;
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPlayCompletedFirstTime(String str) {
                    this.aA.a("play_complete_first_time", (Object) null);
                    this.aA.a("follow_button_interaction", k.b.FINISH);
                    this.ba.a(VideoPlayViewModel.d.f91535a);
                }

                private void f(String str) {
                    String f2 = m.f(this.f91515j);
                    l.d(str, "");
                    aa.c("hideCover " + f2 + ", source " + str);
                    SmartImageView smartImageView = this.s;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(8);
                    }
                }

                private void i(boolean z2) {
                    this.aj.getViewTreeObserver().removeOnGlobalLayoutListener(this.bf);
                    if (com.ss.android.ugc.aweme.feed.x.g.d(this.f91515j) && z2) {
                        this.aj.getViewTreeObserver().addOnGlobalLayoutListener(this.bf);
                        if (this.au != null) {
                            float ax2 = ax();
                            this.aE = ax2;
                            this.au.a((int) ax2, this.I.getHeight());
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void c(Aweme aweme) {
                    if (this.ap != null && aweme != null) {
                        DataCenter dataCenter = this.aA;
                        if (dataCenter != null) {
                            dataCenter.a("handle_double_click", aweme);
                        }
                        VideoViewModel videoViewModel = this.aZ;
                        if (videoViewModel != null) {
                            videoViewModel.a(new VideoViewModel.d(aweme));
                        }
                        if (this.aH.isPlayListCleanMode().booleanValue()) {
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void d(boolean z2) {
                    this.aA.a("load_progress_bar", Boolean.valueOf(z2));
                    VideoViewModel videoViewModel = this.aZ;
                    if (videoViewModel != null) {
                        videoViewModel.a(new VideoViewModel.k(z2));
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.ah
                public final void e(boolean z2) {
                    this.f91546h = z2;
                    if (z2) {
                        if (this.r.c() != null) {
                            this.r.c().g();
                        }
                    } else if (this.r.c() != null) {
                        this.r.c().h();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPausePlay(String str) {
                    h(2);
                    this.as.A();
                    c(System.currentTimeMillis());
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        aVar.onPausePlay(str);
                    }
                    VideoPlaySearchViewModel videoPlaySearchViewModel = this.bb;
                    if (videoPlaySearchViewModel != null) {
                        videoPlaySearchViewModel.a(VideoPlaySearchViewModel.b.f91531a);
                    }
                }

                private void f(boolean z2) {
                    if (z2) {
                        this.F.setVisibility(8);
                        ((FeedInterceptTouchLayout) this.I.findViewById(R.id.fhu)).setGroupClickable(false);
                        ((FeedInterceptTouchLayout) this.I.findViewById(R.id.c4q)).setGroupClickable(false);
                        ((FeedInterceptTouchLayout) this.I.findViewById(R.id.fhx)).setGroupClickable(false);
                    }
                }

                private void g(String str) {
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedAvatarView", "VideoViewCell rev liveData!");
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("dismiss_dou_pop", (Object) true);
                    }
                    ad adVar = new ad(this.ap.hashCode(), this.bg);
                    if (!TextUtils.isEmpty(str)) {
                        adVar.f93449c = str;
                    }
                    com.ss.android.ugc.aweme.feed.i.ac acVar = new com.ss.android.ugc.aweme.feed.i.ac(ao(), com.ss.android.ugc.aweme.feed.z.a(this.bg));
                    ao();
                    at.a(acVar, adVar);
                }

                private void i(int i2) {
                    String str;
                    JSONObject jSONObject = this.ar;
                    if (jSONObject != null) {
                        try {
                            str = jSONObject.getString("request_id");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f91515j.setRequestId(str);
                        }
                    }
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    if (createIIMServicebyMonsterPlugin != null && createIIMServicebyMonsterPlugin.isNeedToContinuePlayInAct()) {
                        createIIMServicebyMonsterPlugin.setNeedToContinuePlayInAct(false);
                    }
                    if (this.aq != null && this.f91515j != null) {
                        this.aq.a(new ag(i2, f(i2)));
                    }
                }

                public void e(String str) {
                    boolean z2;
                    SmartImageView smartImageView;
                    SmartImageView smartImageView2;
                    String f2 = m.f(this.f91515j);
                    l.d(str, "");
                    aa.c("showCover " + f2 + ", source " + str);
                    com.ss.android.ugc.aweme.ad.feed.a.b N2 = this.as.N();
                    if (N2 == null || !N2.a(this.f91515j)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if ((!this.ay || z2) && (smartImageView2 = this.s) != null) {
                        smartImageView2.setVisibility(8);
                    } else if ((!this.f91543e || (!ao().equals("playlist") && !ao().equals("chat"))) && (smartImageView = this.s) != null) {
                        smartImageView.setVisibility(0);
                    }
                }

                /* access modifiers changed from: protected */
                public void h(Aweme aweme) {
                    if (!bf() && com.ss.android.ugc.aweme.feed.x.g.a(aweme)) {
                        if (!g(0)) {
                            this.bo.put(0, true);
                            this.aB.a(this.v, new VPAInfoBarWidget());
                        }
                        if (!g(1) && com.ss.android.ugc.aweme.compliance.api.a.e().c() == 3) {
                            this.bo.put(1, true);
                            this.aB.a(this.I, new VPAOptedOutMaskWidget());
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayProgressChange(float f2) {
                    if (!(this.f91515j == null || this.f91515j.getVideo() == null)) {
                        double duration = (double) ((((float) this.f91515j.getVideo().getDuration()) * (f2 / 100.0f)) / 1000.0f);
                        if (this.bj < Math.floor(duration)) {
                            this.aA.a("action_video_on_play_progress_change", new androidx.core.g.e(Float.valueOf(f2), Double.valueOf(duration)));
                            this.ba.a(new VideoPlayViewModel.c(f2));
                            this.ba.a(new VideoPlayViewModel.b(duration));
                        }
                        this.bj = duration;
                    }
                    this.r.onPlayProgressChange(f2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onResumePlay(String str) {
                    this.as.z();
                    if (this.bg == 2 || this.f91543e) {
                        f("onResumePlay");
                    } else if (com.ss.android.ugc.aweme.feed.experiment.ad.b()) {
                        com.ss.android.ugc.aweme.framework.a.a.b(4, "VideoViewCell", "onResumePlay without calling hideCover in " + ao() + ", sourceId is " + str);
                    }
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("in_video_view_holder", (Object) true);
                    }
                    this.ba.a(VideoPlayViewModel.g.f91538a);
                    this.aR = System.currentTimeMillis();
                    b().getAid();
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        aVar.onResumePlay(str);
                    }
                }

                public VideoViewCell(cf cfVar) {
                    super(cfVar);
                    View view = cfVar.f91766a;
                    this.N = (FrameLayout) view.findViewById(R.id.d6_);
                    this.J = (FrameLayout) view.findViewById(R.id.ec4);
                    this.K = (FrameLayout) view.findViewById(R.id.eci);
                    this.L = (FrameLayout) view.findViewById(R.id.ecr);
                    this.aj = (Space) view.findViewById(R.id.d58);
                    this.ba = VideoPlayViewModel.a.a(this);
                    this.aZ = VideoViewModel.a.a(this);
                    this.r = a(cfVar);
                    this.f91517l = cfVar.f91768c;
                    this.aA = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.d.a(this.f91517l, this), this.f91517l);
                    this.aq = cfVar.f91767b;
                    this.aH = cfVar.f91770e;
                    bd a2 = a(cfVar.f91766a, cfVar.f91767b, this.f91517l);
                    this.as = a2;
                    a2.a(this.aH.param);
                    this.as.a(this.aA);
                    this.r.f91581a = this.aA;
                    aM();
                    com.ss.android.ugc.aweme.ca.h.a(new bg(this, cfVar));
                }

                /* access modifiers changed from: protected */
                public com.ss.android.ugc.aweme.feed.adapter.a.a a(cf cfVar) {
                    FrameLayout frameLayout = this.N;
                    l.d(frameLayout, "");
                    l.d(this, "");
                    l.d(cfVar, "");
                    if (cfVar.f91778m != 16) {
                        return new com.ss.android.ugc.aweme.feed.adapter.a.c(frameLayout, this);
                    }
                    Context context = frameLayout.getContext();
                    l.b(context, "");
                    return new com.ss.android.ugc.aweme.feed.adapter.a.b(context);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void b(int i2) {
                    DataCenter dataCenter;
                    this.aI = true;
                    if (this.r.b()) {
                        View y2 = this.r.y();
                        if (y2.getVisibility() != 8) {
                            o.a(y2, 8);
                        }
                    }
                    if (!(i2 == 4 || i2 == 5)) {
                        this.as.w();
                    }
                    com.ss.android.ugc.aweme.o.c cVar = this.bd;
                    if (cVar != null) {
                        cVar.d();
                    }
                    if (i2 == 1) {
                        if (com.bytedance.ies.abmock.b.a().a(true, "stop_main_anim_when_invisible", false) && (dataCenter = this.aA) != null) {
                            dataCenter.a("pause_share_guide_animation", (Object) true);
                        }
                    } else if (i2 != 6) {
                        if (i2 == 5) {
                            aU();
                        } else {
                            h(1);
                        }
                        DataCenter dataCenter2 = this.aA;
                        if (dataCenter2 != null) {
                            dataCenter2.a("holder_on_pause", (Object) true);
                            this.aA.a("in_video_view_holder", (Object) false);
                        }
                        this.aZ.a(VideoViewModel.e.f91576a);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void c(int i2) {
                    DataCenter dataCenter;
                    this.aI = false;
                    B();
                    DataCenter dataCenter2 = this.aA;
                    if (dataCenter2 != null) {
                        dataCenter2.a("holder_on_resume", Integer.valueOf(i2));
                    }
                    com.ss.android.ugc.aweme.o.c cVar = this.bd;
                    if (cVar != null) {
                        cVar.e();
                    }
                    if (i2 == 2 || i2 == 1) {
                        this.as.t();
                        this.aZ.a(VideoViewModel.f.f91577a);
                    } else if (com.bytedance.ies.abmock.b.a().a(true, "stop_main_anim_when_invisible", false) && (dataCenter = this.aA) != null) {
                        dataCenter.a("recover_share_guide_animation", (Object) true);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void d(int i2) {
                    h(this.f91515j);
                    g(this.f91515j);
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("on_viewpager_page_selected", (Object) null);
                        VideoViewModel videoViewModel = this.aZ;
                        if (videoViewModel != null) {
                            videoViewModel.a(new VideoViewModel.i(i2));
                        }
                    }
                    if (this.f91544f) {
                        Set<String> c2 = this.ax.c();
                        boolean d2 = this.ax.d();
                        if (c2 == null || c2.size() >= 3 || d2) {
                            ConstraintLayout constraintLayout = this.al;
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(8);
                            }
                        } else {
                            c2.add(this.f91515j.getAid());
                            this.ax.a(c2);
                            if (this.f91515j != null) {
                                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", ao()).a("group_id", ac.e(this.f91515j)).a("author_id", ac.a(this.f91515j)).a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                                int i3 = 1;
                                if (this.f91515j.getFollowStatus() != 1) {
                                    i3 = 0;
                                }
                                com.ss.android.ugc.aweme.common.r.a("show_video_gift_stripe", a2.a("is_follow", i3).a("is_like", this.f91515j.isLike() ? 1 : 0).f66730a);
                            }
                        }
                    }
                    this.bi = ah.a(this.f91515j);
                }

                @Override // com.ss.android.ugc.aweme.feed.ui.aw
                public final Void h(boolean z2) {
                    ValueAnimator ofFloat;
                    if (com.ss.android.ugc.aweme.feed.experiment.q.b()) {
                        if (com.ss.android.ugc.aweme.feed.ab.b.b() == 0) {
                            this.w.setBackgroundResource(R.drawable.a0q);
                            if (z2) {
                                int b2 = n.b(this.ap);
                                this.w.getLayoutParams().height = (b2 * 3) / 5;
                                return null;
                            }
                            this.w.getLayoutParams().height = (int) n.b(this.ap, 356.0f);
                            return null;
                        }
                        bb();
                        return null;
                    } else if (com.ss.android.ugc.aweme.feed.experiment.q.c()) {
                        if (z2) {
                            this.w.setBackgroundResource(R.drawable.a0m);
                        } else {
                            this.w.setBackgroundResource(R.drawable.a0q);
                        }
                        bb();
                        return null;
                    } else if (!com.ss.android.ugc.aweme.feed.experiment.q.d()) {
                        return null;
                    } else {
                        final Boolean valueOf = Boolean.valueOf(z2);
                        if (valueOf.booleanValue()) {
                            ofFloat = ValueAnimator.ofFloat(0.18f, com.ss.android.ugc.aweme.feed.experiment.q.a());
                        } else {
                            ofFloat = ValueAnimator.ofFloat(com.ss.android.ugc.aweme.feed.experiment.q.a(), 0.18f);
                        }
                        ofFloat.addUpdateListener(new bp(this));
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(57639);
                            }

                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                if (valueOf.booleanValue()) {
                                    VideoViewCell.this.w.setBackgroundResource(R.drawable.tm);
                                    VideoViewCell.this.w.getLayoutParams().height = n.b(VideoViewCell.this.ap);
                                    return;
                                }
                                VideoViewCell.this.w.setBackgroundResource(R.drawable.a0q);
                                VideoViewCell.this.w.getLayoutParams().height = (int) n.b(VideoViewCell.this.ap, 356.0f);
                            }
                        });
                        ofFloat.start();
                        return null;
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
                    if (((com.ss.android.ugc.aweme.main.CleanModeManager2) r0).f109055c != false) goto L_0x01a8;
                 */
                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(int r10) {
                    /*
                    // Method dump skipped, instructions count: 453
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(int):void");
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public void b(long j2) {
                    this.aA.a("hide_commerce_second_info", (Object) null);
                    j(false);
                    af.a(this.A);
                    c(j2);
                    long j3 = this.aQ;
                    this.aQ = 0;
                    if (j3 > 0 && j3 < InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.bh && !TextUtils.isEmpty(ao()) && this.f91515j != null && !TextUtils.isEmpty(this.f91515j.getAid())) {
                        com.ss.android.ugc.aweme.feed.helper.t.a(new com.ss.android.ugc.aweme.feed.helper.o(this.f91515j.getAid(), 2, j2, ao()));
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public final void c(boolean z2) {
                    this.as.c(z2);
                    if (z2) {
                        cl.f91791a = true;
                        this.w.animate().alpha(0.0f).setDuration(200).start();
                        this.x.animate().alpha(0.0f).setDuration(200).start();
                        this.q.animate().alpha(0.0f).setDuration(200).start();
                        this.f91541c = true;
                        return;
                    }
                    cl.f91791a = false;
                    this.w.animate().alpha(1.0f).setDuration(200).start();
                    this.x.animate().alpha(1.0f).setDuration(200).start();
                    this.q.setVisibility(0);
                    this.q.animate().alpha(1.0f).setDuration(200).start();
                    if (this.f91541c) {
                        this.f91541c = false;
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.ai
                public final void f(Aweme aweme) {
                    boolean z2;
                    if (this.f91515j != null && aweme != null && TextUtils.equals(this.f91515j.getAid(), aweme.getAid()) && this.aA != null) {
                        this.f91515j.setCmtSwt(aweme.isCmtSwt());
                        this.f91515j.setAwemeACLShareInfo(aweme.getAwemeACLShareInfo());
                        if (aweme.getStatus() != null) {
                            AwemeStatus status = this.f91515j.getStatus();
                            if (status == null) {
                                status = new AwemeStatus();
                            }
                            status.setDownloadStatus(aweme.getStatus().getDownloadStatus());
                            status.setAllowShare(aweme.getStatus().isAllowShare());
                            this.f91515j.setStatus(status);
                        }
                        if (aweme.getCommerceVideoAuthInfo() != null) {
                            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = this.f91515j.getCommerceVideoAuthInfo();
                            if (commerceVideoAuthInfo == null) {
                                commerceVideoAuthInfo = new com.ss.android.ugc.aweme.commerce.a();
                            }
                            commerceVideoAuthInfo.setPreventShare(aweme.getCommerceVideoAuthInfo().isPreventShare());
                            this.f91515j.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
                        }
                        if (!(!com.ss.android.ugc.aweme.commercialize.e.a.b.w(this.f91515j) || aweme.getAuthor() == null || this.f91515j.getAuthor() == null || this.as.R() == 4)) {
                            this.f91515j.getAuthor().roomId = aweme.getAuthor().roomId;
                            com.ss.android.ugc.aweme.commercialize.e.a.b.ad(this.f91515j);
                            try {
                                final com.bytedance.android.live.base.a.a aVar = new com.bytedance.android.live.base.a.a();
                                aVar.f7363b = Long.parseLong(aweme.getAuthor().getUid());
                                aVar.f7362a = aweme.getAuthor().roomId;
                                if (!aweme.getAuthor().isLive()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                aVar.f7364c = z2;
                                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable() {
                                    /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass6 */

                                    static {
                                        Covode.recordClassIndex(57640);
                                    }

                                    public final void run() {
                                        com.ss.android.ugc.d.a.c.a(aVar);
                                        VideoViewCell.this.as.S();
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        }
                        this.f91515j.setDuetSetting(aweme.getDuetSetting());
                        this.f91515j.setStitchSetting(aweme.getStitchSetting());
                        this.f91515j.setWithPromotionalMusic(aweme.isWithPromotionalMusic());
                        this.f91515j.setStatistics(aweme.getStatistics());
                        this.aA.a("awesome_update_data", this.f91514i);
                        VideoViewModel videoViewModel = this.aZ;
                        if (videoViewModel != null) {
                            videoViewModel.a(new VideoViewModel.l(this.f91514i));
                        }
                    }
                }

                /* access modifiers changed from: protected */
                public void g(Aweme aweme) {
                    if (!g(2) && com.ss.android.ugc.aweme.utils.y.g(aweme)) {
                        this.bo.put(2, true);
                        if (!bg()) {
                            this.aB.a(this.I, new ReportVideoMaskWidget());
                        }
                    }
                    if (!g(4) && com.ss.android.ugc.aweme.utils.y.h(aweme)) {
                        this.bo.put(4, true);
                        if (!bg()) {
                            this.aB.a(this.I, new GeneralVideoMaskWidget());
                        }
                    }
                    if (!bg() && !g(5) && com.ss.android.ugc.aweme.utils.y.i(aweme)) {
                        this.bo.put(5, true);
                        this.aB.a(this.I, new PhotosensitiveVideoMaskWidget());
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
                    int i2;
                    String str;
                    this.ao = System.currentTimeMillis();
                    f("onRenderFirstFrame");
                    this.f91543e = true;
                    final Aweme aweme = this.f91515j;
                    if (de.f89777c) {
                        com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(57636);
                            }

                            public final void run() {
                                VideoViewCell.this.e(aweme);
                            }
                        }, 300);
                        com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(57637);
                            }

                            public final void run() {
                                VideoViewCell.this.as();
                            }
                        }, 500);
                    } else {
                        e(this.f91515j);
                        as();
                    }
                    j(true);
                    DataCenter dataCenter = this.aA;
                    if (dataCenter != null) {
                        dataCenter.a("in_video_view_holder", (Object) true);
                    }
                    this.ba.a(VideoPlayViewModel.e.f91536a);
                    if (this.f91517l.getActivity() != null && this.f91516k == 0) {
                        MainPageExperimentServiceImpl.b();
                        if (TextUtils.equals(ao(), "homepage_follow")) {
                            FollowPageFirstFrameViewModel.a(this.f91517l.getActivity());
                        }
                    }
                    if (!(this.f91515j == null || this.f91515j.getVideo() == null)) {
                        int l2 = com.ss.android.ugc.aweme.video.v.O().l();
                        int m2 = com.ss.android.ugc.aweme.video.v.O().m();
                        if (l2 <= 0 || m2 <= 0) {
                            com.ss.android.ugc.aweme.framework.a.a.b(5, "VideoViewCell", "video Player size is wrong, aid is " + m.f(this.f91515j));
                        } else {
                            int width = this.f91515j.getVideo().getWidth();
                            int height = this.f91515j.getVideo().getHeight();
                            if (width <= 0 || height <= 0) {
                                i2 = 1;
                            } else if ((width > height && l2 < m2) || (width < height && l2 > m2)) {
                                i2 = 2;
                            } else if (cj.a(width, height, l2, m2)) {
                                i2 = 3;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("aweme_id", m.f(this.f91515j));
                                jSONObject.put("aweme_position", this.f91516k);
                                jSONObject.put("video_server_width", width);
                                jSONObject.put("video_server_height", height);
                                jSONObject.put("video_player_width", l2);
                                jSONObject.put("video_player_height", m2);
                                jSONObject.put("event_type", ao());
                                JSONObject jSONObject2 = this.ar;
                                if (jSONObject2 == null) {
                                    str = "";
                                } else {
                                    str = jSONObject2.optString("request_id");
                                }
                                jSONObject.put("request_id", str);
                                com.ss.android.ugc.aweme.framework.a.a.b(4, "VideoViewCell", "video_view_size_mismatch ".concat(String.valueOf(jSONObject)));
                                com.bytedance.apm.b.a("video_view_size_mismatch", i2, jSONObject);
                            } catch (Exception e2) {
                                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                            }
                            if (i2 > 1) {
                                com.ss.android.ugc.aweme.framework.a.a.b(5, "VideoViewCell", "video_view_size_mismatch, but current strategy does not handle it");
                            } else if (!(this.f91515j == null || this.f91515j.getVideo() == null)) {
                                this.f91515j.getVideo().setWidth(l2);
                                this.f91515j.getVideo().setHeight(m2);
                                UrlModel originCover = this.f91515j.getVideo().getOriginCover();
                                if (originCover != null) {
                                    originCover.setWidth(l2);
                                    originCover.setHeight(m2);
                                }
                                try {
                                    this.at.a(this.ap, this.f91515j.getVideo(), this.r.y(), this.s, this.f91515j.getOcrLocation());
                                } catch (Exception e3) {
                                    com.ss.android.ugc.aweme.framework.a.a.a("", e3);
                                }
                            }
                        }
                    }
                    View view = this.aa;
                    LinearLayout linearLayout = this.F;
                    if (com.ss.android.ugc.aweme.feed.x.z.f95371a && linearLayout != null) {
                        linearLayout.getLocationOnScreen(com.ss.android.ugc.aweme.feed.x.z.f95374d);
                    }
                    if (com.ss.android.ugc.aweme.feed.x.z.f95372b && view != null) {
                        view.getLocationOnScreen(com.ss.android.ugc.aweme.feed.x.z.f95373c);
                    }
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        aVar.onRenderFirstFrame(oVar);
                    }
                    ((com.ss.android.ugc.aweme.service.c) ServiceManager.get().getService(com.ss.android.ugc.aweme.service.c.class)).a(oVar.getId());
                    int i3 = com.ss.android.ugc.aweme.feed.assem.a.f91967b ^ 1;
                    com.ss.android.ugc.aweme.feed.assem.a.f91967b = i3;
                    if (i3 == 3) {
                        SystemClock.uptimeMillis();
                        com.ss.android.ugc.aweme.feed.assem.a.b();
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj
                public void b(boolean z2) {
                    DataCenter dataCenter;
                    this.aY = z2;
                    a(this.q, z2);
                    this.as.b(z2);
                    if (z2 && (dataCenter = this.aA) != null) {
                        dataCenter.a("dismiss_dou_pop", (Object) true);
                    }
                    if (TextUtils.equals(ao(), "homepage_follow")) {
                        com.ss.android.ugc.aweme.framework.a.a.b(3, "VideoViewCell", "openCleanMode in position " + this.f91516k + ", clean is" + z2);
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a1, code lost:
                    if (r2 == null) goto L_0x02a3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:186:0x02d0, code lost:
                    if (r2 == null) goto L_0x02d2;
                 */
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onRenderReady(com.ss.android.ugc.playerkit.model.n r21) {
                    /*
                    // Method dump skipped, instructions count: 836
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.onRenderReady(com.ss.android.ugc.playerkit.model.n):void");
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void b(cf cfVar) {
                    boolean z2;
                    View view;
                    com.bytedance.assem.arch.viewModel.b bVar;
                    MethodCollector.i(8994);
                    if (this.ba == null) {
                        this.ba = VideoPlayViewModel.a.a(this);
                    }
                    if (this.aZ == null) {
                        this.aZ = VideoViewModel.a.a(this);
                    }
                    l.d(this, "");
                    h.k.c a2 = ab.a(VideoEventDispatchViewModel.class);
                    this.bc = (VideoEventDispatchViewModel) new com.bytedance.ext_power_list.f(a2, new VideoEventDispatchViewModel.a.b(this, a2), VideoEventDispatchViewModel.a.c.INSTANCE, new VideoEventDispatchViewModel.a.d(this), this, VideoEventDispatchViewModel.a.e.INSTANCE, VideoEventDispatchViewModel.a.C2207a.INSTANCE).getValue();
                    if (cfVar.f91768c != null) {
                        Fragment fragment = cfVar.f91768c;
                        l.d(fragment, "");
                        i.a aVar = i.a.f25718a;
                        h.k.c a3 = ab.a(VideoPlaySearchViewModel.class);
                        VideoPlaySearchViewModel.a.C2208a aVar2 = new VideoPlaySearchViewModel.a.C2208a(a3);
                        VideoPlaySearchViewModel.a.b bVar2 = VideoPlaySearchViewModel.a.b.INSTANCE;
                        if (l.a(aVar, i.a.f25718a)) {
                            bVar = new com.bytedance.assem.arch.viewModel.b(a3, aVar2, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) fragment, true), com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.ag) fragment, true), u.c.f25670a, bVar2, com.bytedance.assem.arch.extensions.u.a(fragment, true), com.bytedance.assem.arch.extensions.u.b(fragment, true));
                        } else if (aVar == null || l.a(aVar, i.d.f25721a)) {
                            bVar = new com.bytedance.assem.arch.viewModel.b(a3, aVar2, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) fragment, false), com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.ag) fragment, false), u.c.f25670a, bVar2, com.bytedance.assem.arch.extensions.u.a(fragment, false), com.bytedance.assem.arch.extensions.u.b(fragment, false));
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Do not support this scope here.");
                            MethodCollector.o(8994);
                            throw illegalArgumentException;
                        }
                        this.bb = (VideoPlaySearchViewModel) bVar.getValue();
                    }
                    View view2 = cfVar.f91766a;
                    this.ap = view2.getContext();
                    s<ag> sVar = cfVar.f91767b;
                    View.OnTouchListener onTouchListener = cfVar.f91769d;
                    Fragment fragment2 = cfVar.f91768c;
                    BaseFeedPageParams baseFeedPageParams = cfVar.f91770e;
                    if (TextUtils.equals("from_publish_add_video", baseFeedPageParams.param.getFrom())) {
                        this.f91545g = true;
                    }
                    com.ss.android.ugc.aweme.feed.e.l lVar = cfVar.f91771f;
                    com.ss.android.ugc.aweme.feed.helper.c cVar = cfVar.f91772g;
                    View.OnTouchListener onTouchListener2 = cfVar.f91773h;
                    if (onTouchListener2 != null) {
                        this.aN = onTouchListener2;
                    } else {
                        this.aN = new com.bytedance.ies.dmt.ui.widget.b();
                    }
                    LongPressLayout.a aVar3 = cfVar.f91774i;
                    if (aVar3 == null) {
                        aVar3 = new bf(baseFeedPageParams, this.ap);
                    }
                    this.aO = aVar3;
                    this.aH = baseFeedPageParams;
                    this.bg = baseFeedPageParams.awemeFromPage;
                    this.aF = lVar;
                    if (cVar == null) {
                        this.at = new com.ss.android.ugc.aweme.feed.helper.c();
                        int i2 = Build.VERSION.SDK_INT;
                        com.ss.android.ugc.aweme.feed.helper.c.a(this.ap);
                    }
                    try {
                        this.q = (RelativeLayout) view2.findViewById(R.id.fmg);
                        this.s = (SmartImageView) view2.findViewById(R.id.agf);
                        this.u = (ViewGroup) view2.findViewById(R.id.fhb);
                        this.v = (FrameLayout) view2.findViewById(R.id.uw);
                        this.w = view2.findViewById(R.id.bct);
                        this.x = view2.findViewById(R.id.bcv);
                        this.y = (RestrictTextView) view2.findViewById(R.id.f60);
                        this.z = view2.findViewById(R.id.ec8);
                        this.A = (TagLayout) view2.findViewById(R.id.fhk);
                        this.B = (AnimationImageView) view2.findViewById(R.id.fh0);
                        this.C = (ConstraintLayout) view2.findViewById(R.id.b1v);
                        this.D = (LinearLayout) view2.findViewById(R.id.eb);
                        this.E = (LinearLayout) view2.findViewById(R.id.akv);
                        this.F = (LinearLayout) view2.findViewById(R.id.dnh);
                        this.G = (ViewGroup) view2.findViewById(R.id.q0);
                        this.H = (LongPressLayout) view2.findViewById(R.id.cja);
                        this.I = (FrameLayout) view2.findViewById(R.id.fjk);
                        if (this.J == null) {
                            this.J = (FrameLayout) view2.findViewById(R.id.ec4);
                        }
                        if (this.K == null) {
                            this.K = (FrameLayout) view2.findViewById(R.id.eci);
                        }
                        if (this.L == null) {
                            this.L = (FrameLayout) view2.findViewById(R.id.ecr);
                        }
                        this.M = (FrameLayout) view2.findViewById(R.id.dbm);
                        this.N = (FrameLayout) view2.findViewById(R.id.d6_);
                        this.O = (RelativeLayout) view2.findViewById(R.id.epk);
                        this.P = (ViewGroup) view2.findViewById(R.id.fhx);
                        this.Q = (ViewGroup) view2.findViewById(R.id.aqa);
                        this.R = (TextView) view2.findViewById(R.id.faw);
                        this.S = view2.findViewById(R.id.pg);
                        this.T = (ImageView) view2.findViewById(R.id.bwy);
                        this.U = view2.findViewById(R.id.e0p);
                        this.V = (TuxIconView) view2.findViewById(R.id.e0z);
                        this.W = (TuxIconView) view2.findViewById(R.id.awu);
                        this.X = (TextView) view2.findViewById(R.id.fbl);
                        this.Y = view2.findViewById(R.id.ffz);
                        this.Z = (TuxTextView) view2.findViewById(R.id.e0q);
                        this.aa = view2.findViewById(R.id.c4q);
                        this.ab = (FrameLayout) view2.findViewById(R.id.bqg);
                        this.ac = (ImageView) view2.findViewById(R.id.afg);
                        this.ad = (ImageView) view2.findViewById(R.id.afh);
                        this.ae = (ImageView) view2.findViewById(R.id.afc);
                        this.af = (ImageView) view2.findViewById(R.id.afd);
                        this.ag = (DebugInfoView) view2.findViewById(R.id.aii);
                        this.ah = (FrameLayout) view2.findViewById(R.id.aba);
                        this.ai = (ViewGroup) view2.findViewById(R.id.b1y);
                        if (this.aj == null) {
                            this.aj = (Space) view2.findViewById(R.id.d58);
                        }
                        this.ak = (ViewGroup) view2.findViewById(R.id.vu);
                        this.an = (LinearLayout) view2.findViewById(R.id.de9);
                        this.al = (ConstraintLayout) view2.findViewById(R.id.bbk);
                        this.am = (ConstraintLayout) view2.findViewById(R.id.dk2);
                        this.an = (LinearLayout) view2.findViewById(R.id.de9);
                        this.be = (FrameLayout) view2.findViewById(R.id.ffo);
                        View findViewById = view2.findViewById(R.id.title);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new bs(this));
                        }
                    } catch (IllegalStateException unused) {
                        com.ss.android.ugc.aweme.legoImp.inflate.e.a(getClass().getName(), view2, this.ap, 0);
                    }
                    this.aw = new be(this.Z, this.U, this.V, this.W, this.X, this.v, new SparseArray());
                    LongPressLayout longPressLayout = this.H;
                    if (longPressLayout != null) {
                        longPressLayout.setListener(this.aO);
                    }
                    if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || !com.bytedance.common.utility.m.a(com.bytedance.ies.ugc.appcontext.d.s, "lark_inhouse")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f91539a = z2;
                    bd a4 = a(view2, sVar, fragment2);
                    this.as = a4;
                    a4.a(this.aH.param);
                    if (this.r == null) {
                        this.r = a(cfVar);
                    }
                    int b2 = com.ss.android.ugc.aweme.feed.ab.b.b();
                    if (b2 == 0) {
                        this.w.setBackgroundResource(R.drawable.a0q);
                        this.w.getLayoutParams().height = (int) n.b(this.ap, 356.0f);
                    } else if (b2 != 1) {
                        float f2 = 0.18f;
                        if (b2 == 2) {
                            view = this.w;
                        } else if (b2 == 3) {
                            view = this.w;
                            BottomGradualOptimizeConfig a5 = com.ss.android.ugc.aweme.feed.ab.b.a();
                            if (a5 != null) {
                                float opacity = a5.getOpacity();
                                if (opacity >= 0.18f && opacity <= 0.24f) {
                                    f2 = a5.getOpacity();
                                }
                            }
                        }
                        view.setBackgroundDrawable(com.ss.android.ugc.aweme.feed.ui.b.a.a(((int) Math.ceil((double) (f2 * 255.0f))) << 24));
                    } else {
                        this.w.setBackgroundResource(R.drawable.a0q);
                    }
                    if (com.ss.android.ugc.aweme.feed.experiment.q.d()) {
                        this.w.setOnClickListener(new bq(this));
                    }
                    this.x.setBackgroundResource(R.drawable.a0r);
                    this.x.getLayoutParams().height = (int) n.b(this.ap, 136.0f);
                    this.f91517l = fragment2;
                    if (SharePrefCache.inst().getShowPlayerInfoUI().c().booleanValue()) {
                        if (this.t == null) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) n.b(this.ap, 300.0f), (int) n.b(this.ap, 500.0f));
                            layoutParams.topMargin = (int) n.b(this.ap, 80.0f);
                            this.t = new FrameLayout(this.ap);
                            int b3 = (int) n.b(this.ap, 8.0f);
                            this.t.setPadding(b3, b3, b3, b3);
                            this.I.addView(this.t, layoutParams);
                        }
                        this.aL = new com.ss.android.ugc.aweme.video.f.b(this.ap, this.t);
                    }
                    this.aq = sVar;
                    if (TextUtils.equals("upload", ao())) {
                        this.aH.setEventType(null);
                    }
                    this.H.setTapListener(onTouchListener);
                    o();
                    this.bc.f91527j = new bt(this);
                    this.bc.f91528k = new bu(this);
                    this.r.f91581a = this.aA;
                    if (ce.a.f91761b.get(this.ap) == null) {
                        ce.a.f91761b.put(this.ap, new com.bytedance.common.utility.collection.d<>());
                    }
                    ce.a.f91761b.get(this.ap).a(this);
                    this.f91514i = VideoItemParams.newBuilder(baseFeedPageParams, this.as, fragment2, this.az, this.aA, this);
                    this.A.setEventType(ao());
                    this.A.setFeedFromPage(this.bg);
                    this.A.setFromPostPage(this.aH.isFromPostList);
                    this.aV = ScrollSwitchStateManager.a.a(fragment2.getActivity());
                    fragment2.getActivity().getClass().getName();
                    fragment2.getClass().getName();
                    this.aV.g(fragment2, new bv(this));
                    MethodCollector.o(8994);
                }

                private static String a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void b_(int i2, int i3) {
                    com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
                    if (aVar != null) {
                        aVar.a(i2, i3);
                    }
                }

                private void b(Aweme aweme, int i2) {
                    this.aA.a("video_params", this.f91514i);
                    a(i2, aweme);
                    if (K()) {
                        SystemClock.uptimeMillis();
                        int i3 = com.ss.android.ugc.aweme.feed.assem.a.f91967b ^ 2;
                        com.ss.android.ugc.aweme.feed.assem.a.f91967b = i3;
                        if (i3 == 3) {
                            com.ss.android.ugc.aweme.feed.assem.a.b();
                        }
                    }
                }

                private void b(boolean z2, boolean z3) {
                    if (AVExternalServiceImpl.a().configService().avsettingsConfig().enableStudioScreenRightCorner()) {
                        o.b(false, this.ac, this.ae, this.ad, this.af);
                        return;
                    }
                    o.b(z2, this.ac, this.ad);
                    o.b(z3, this.ae, this.af);
                }

                @Override // com.ss.android.ugc.playerkit.videoview.k
                public final void a(int i2, int i3) {
                    this.aM = true;
                    if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d) {
                        return;
                    }
                    if (com.ss.android.ugc.aweme.feed.assem.a.f91966a) {
                        com.ss.android.ugc.aweme.lego.p.a().post(new bn(this));
                        com.ss.android.ugc.aweme.lego.p.a().post(new bo(this));
                        return;
                    }
                    i(0);
                    az();
                }

                private static JSONObject a(Aweme aweme, BaseFeedPageParams baseFeedPageParams, String str) {
                    return com.ss.android.ugc.aweme.feed.x.i.a(aweme, baseFeedPageParams.pageType, str, baseFeedPageParams.eventType);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayProgressChange(String str, long j2, long j3) {
                    this.r.onPlayProgressChange(str, j2, j3);
                }

                public bd a(View view, s<ag> sVar, Fragment fragment) {
                    return com.ss.android.ugc.aweme.feed.service.a.a().a().a(this, view, this.aH.pageType, ao(), sVar, fragment);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void a(int i2, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
                    com.ss.android.ugc.aweme.common.r.a("cla_caption_switch_language_success", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", ao()).a("group_id", ac.e(this.f91515j)).a("author_id", ac.a(this.f91515j)).a("is_success", i2).a("enable_experiment", com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1)).a("duration", j2).a("load_duration", j3).a("is_display_ontime", i3).a("fst_display_position", j4).a("fst_line_position", j5).a("position_lag", j6).a("cla_pre_cache_size", i4).f66730a);
                }

                @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public final void a(int i2, String str, long j2, long j3, int i3, long j4, long j5, long j6, int i4) {
                    if (this.aX != -1) {
                        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.aX);
                        this.aX = -1;
                        com.ss.android.ugc.aweme.common.r.a("cla_caption_load_time", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", ao()).a("group_id", ac.e(this.f91515j)).a("author_id", ac.a(this.f91515j)).a("load_duration", valueOf).a("enable_experiment", com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1)).a("play_sess", str).a("duration", j2).a("load_duration", j3).a("is_display_ontime", i3).a("fst_display_position", j4).a("fst_line_position", j5).a("position_lag", j6).a("cla_pre_cache_size", i4).f66730a);
                    }
                    com.ss.android.ugc.aweme.common.r.a("cla_caption_load_success", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", ao()).a("group_id", ac.e(this.f91515j)).a("author_id", ac.a(this.f91515j)).a("is_success", i2).a("enable_experiment", com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1)).f66730a);
                }
            }

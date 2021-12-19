package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.challenge.widget.MonitorSizeChangedLinearLayout;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

public class j extends b implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final d u = new d((byte) 0);
    private final h.h N = h.i.a(h.m.NONE, new l(this));
    private final h.h O = h.i.a(h.m.NONE, new r(this));
    private final h.h P = h.i.a(h.m.NONE, new u(this));
    private final h.h Q = h.i.a(h.m.NONE, new n(this));
    private final h.h R = h.i.a(h.m.NONE, new o(this));
    private final h.h S = h.i.a(h.m.NONE, new p(this));
    private final h.h T = h.i.a(h.m.NONE, new s(this));
    private final h.h U = h.i.a(h.m.NONE, new q(this));
    private final h.h V = h.i.a(h.m.NONE, new m(this));
    private com.ss.android.ugc.aweme.challenge.ui.a.a W;
    private com.ss.android.ugc.aweme.challenge.ui.a.g X;
    private ChallengeDetail Y;
    private int Z = -1;
    private boolean aa = true;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private final lifecycleAwareLazy ae;
    private final h.h af;
    private final h.h ag;
    private com.ss.android.ugc.aweme.v.a.a ah;
    private boolean ai;
    private float aj;
    private float ak;
    private int al;
    private SparseArray am;

    /* renamed from: d  reason: collision with root package name */
    final h.h f70152d = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.challenge.service.d f70153e;

    /* renamed from: j  reason: collision with root package name */
    public s f70154j;

    /* renamed from: k  reason: collision with root package name */
    public String f70155k;

    /* renamed from: l  reason: collision with root package name */
    public Challenge f70156l;

    /* renamed from: m  reason: collision with root package name */
    boolean f70157m;
    public int n;
    public String o;
    public String p = "";
    public String q = "";
    public h.f.a.a<h.p<Long, String>> r;
    public com.ss.android.ugc.aweme.base.arch.i s = new com.ss.android.ugc.aweme.base.arch.i();
    public final String t;

    /* access modifiers changed from: package-private */
    public static final class aa extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f70158a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecordConfig.Builder f70159b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Challenge f70160c;

            static {
                Covode.recordClassIndex(43261);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                h.f.b.l.d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f70158a, this.f70159b.build(), this.f70160c);
            }

            a(Activity activity, RecordConfig.Builder builder, Challenge challenge) {
                this.f70158a = activity;
                this.f70159b = builder;
                this.f70160c = challenge;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            String str;
            Challenge challenge;
            Intent intent;
            String str2;
            Music music;
            String str3;
            String str4 = "";
            h.f.b.l.d(view, str4);
            if (this.this$0.getActivity() == null || !MSAdaptionService.c().b((Context) this.this$0.getActivity())) {
                this.this$0.o = UUID.randomUUID().toString();
                j jVar = this.this$0;
                if (TextUtils.equals(jVar.b().getEnterFrom(), "from_message")) {
                    str = "click_join_button";
                } else {
                    str = "click_tag_publish";
                }
                ah.f109485c = str;
                ah.f109483a = "challenge";
                Challenge challenge2 = jVar.f70156l;
                if (challenge2 != null && challenge2.isCommerce()) {
                    List<Music> connectMusics = challenge2.getConnectMusics();
                    if (connectMusics != null) {
                        music = (Music) h.a.n.h((List) connectMusics);
                    } else {
                        music = null;
                    }
                    com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("shoot_way", "challenge");
                    String cid = challenge2.getCid();
                    if (cid == null) {
                        cid = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.c a3 = a2.a("challenge_id", cid);
                    String challengeName = challenge2.getChallengeName();
                    if (challengeName == null) {
                        challengeName = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.c a4 = a3.a("challenge_name", challengeName);
                    if (music == null || (str3 = music.getMid()) == null) {
                        str3 = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.c a5 = a4.a("music_id_to_bind", str3);
                    String stickerId = challenge2.getStickerId();
                    if (stickerId == null) {
                        stickerId = str4;
                    }
                    com.ss.android.ugc.aweme.app.f.c a6 = a5.a("sticker_id_to_bind", stickerId);
                    String mvId = challenge2.getMvId();
                    if (mvId != null) {
                        str4 = mvId;
                    }
                    com.bytedance.apm.b.a("shoot_monitor", 0, a6.a("mv_id_to_bind", str4).a());
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", "1");
                    jSONObject.put("group_id", jVar.b().getAwemeId());
                    jSONObject.put("impr_type", com.ss.android.ugc.aweme.metrics.ac.j(AwemeService.b().b(jVar.b().getAwemeId())));
                    if (!TextUtils.isEmpty(jVar.b().getEnterFrom())) {
                        jSONObject.put("challenge_from", jVar.b().getEnterFrom());
                    }
                    if (!TextUtils.isEmpty(jVar.b().getEnterpriseUid())) {
                        jSONObject.put("page_uid", jVar.b().getEnterpriseUid());
                    }
                    jSONObject.put("impr_type", com.ss.android.ugc.aweme.metrics.ac.j(AwemeService.b().b(jVar.b().getAwemeId())));
                    MobClick labelName = new MobClick().setEventName("shoot").setLabelName("challenge");
                    String str5 = jVar.f70155k;
                    if (str5 == null) {
                        h.f.b.l.a("mChallengeId");
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(labelName.setValue(str5).setJsonObject(jSONObject));
                    com.ss.android.ugc.aweme.app.f.d a7 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", jVar.o).a("shoot_way", "challenge");
                    String str6 = jVar.f70155k;
                    if (str6 == null) {
                        h.f.b.l.a("mChallengeId");
                    }
                    com.ss.android.ugc.aweme.app.f.d a8 = a7.a("tag_id", str6).a("parent_tag_id", jVar.b().getParentTagId()).a("impr_type", com.ss.android.ugc.aweme.metrics.ac.j(AwemeService.b().b(jVar.b().getAwemeId()))).a("group_id", jVar.b().getAwemeId()).a("enter_from", "challenge").a("enter_method", "click_mv_publish").a("shoot_enter_from", jVar.b().getShootEnterFrom()).a("is_bundled", jVar.b().isBundled());
                    if (!TextUtils.isEmpty(jVar.b().getBannerId())) {
                        a8.a("from_banner_id", jVar.b().getBannerId());
                    }
                    if ("homepage_hot".equals(jVar.b().getEnterFrom())) {
                        a8.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(jVar.b().getAwemeId(), 0)));
                    }
                    a8.a("process_id", jVar.p);
                    com.ss.android.ugc.aweme.common.r.a("shoot", a8.f66730a);
                    boolean equals = TextUtils.equals("general_search", jVar.b().getEnterFrom());
                    String str7 = "search_result";
                    boolean equals2 = TextUtils.equals(str7, jVar.b().getEnterFrom());
                    boolean equals3 = TextUtils.equals("search_for_you_list", jVar.b().getEnterFrom());
                    if (equals || equals2 || equals3) {
                        com.ss.android.ugc.aweme.app.f.d a9 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", jVar.o).a("shoot_way", "challenge");
                        String str8 = jVar.f70155k;
                        if (str8 == null) {
                            h.f.b.l.a("mChallengeId");
                        }
                        com.ss.android.ugc.aweme.app.f.d a10 = a9.a("tag_id", str8);
                        if (equals) {
                            str2 = "general";
                        } else {
                            str2 = "tag";
                        }
                        com.ss.android.ugc.aweme.app.f.d a11 = a10.a("search_type", str2);
                        if (!equals) {
                            str7 = jVar.b().getEnterFrom();
                        }
                        com.ss.android.ugc.aweme.common.r.a("search_shoot", a11.a("previous_page", str7).f66730a);
                    }
                    androidx.fragment.app.e activity = jVar.getActivity();
                    if (!(activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("from_notification", false))) {
                        String a12 = j.a(intent, "rule_id");
                        if (!TextUtils.isEmpty(a12)) {
                            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                            String str9 = jVar.f70155k;
                            if (str9 == null) {
                                h.f.b.l.a("mChallengeId");
                            }
                            com.ss.android.ugc.aweme.common.r.a("shoot_from_push", dVar.a("tag_id", str9).a("route", "1").a("group_id", jVar.b().getAwemeId()).a("rule_id", a12).f66730a);
                        }
                    }
                } catch (JSONException unused) {
                }
                if (AVExternalServiceImpl.a().publishService().checkIsAlreadyPublished(this.this$0.getContext()) && (challenge = this.this$0.f70156l) != null) {
                    RecordConfig.Builder shootWay = new RecordConfig.Builder().shootWay("challenge");
                    String str10 = this.this$0.o;
                    if (str10 == null) {
                        h.f.b.l.b();
                    }
                    RecordConfig.Builder shootExtraData = shootWay.creationId(str10).challenge(challenge).translationType(3).musicType(1).shootExtraData(new ShootExtraData(this.this$0.b().getShootEnterFrom(), this.this$0.b().getBannerId(), this.this$0.b().isBundled()));
                    boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                    boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
                    androidx.fragment.app.e activity2 = this.this$0.getActivity();
                    if (downloadEffectOrMusicAfterEnterCamera && (!isRecording || activity2 == null)) {
                        shootExtraData.recordPresetResource(new RecordPresetResource(challenge.getStickerId(), null, null, null));
                    }
                    if (activity2 != null) {
                        AVExternalServiceImpl.a().asyncService("ChallengeDetail", new a(activity2, shootExtraData, challenge));
                    }
                }
            } else {
                Toast makeText = Toast.makeText(this.this$0.getActivity(), this.this$0.getString(R.string.bey), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }
            return h.z.f158842a;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.m<ChallengeDetailState, Bundle, ChallengeDetailState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(43265);
        }

        public b() {
            super(2);
        }

        public final ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, Bundle bundle) {
            h.f.b.l.c(challengeDetailState, "");
            return challengeDetailState;
        }
    }

    static {
        Covode.recordClassIndex(43258);
    }

    private final View q() {
        return (View) this.O.getValue();
    }

    private final View r() {
        return (View) this.P.getValue();
    }

    private final RelativeLayout s() {
        return (RelativeLayout) this.Q.getValue();
    }

    private final View t() {
        return (View) this.R.getValue();
    }

    private final ImageView u() {
        return (ImageView) this.U.getValue();
    }

    private final MonitorSizeChangedLinearLayout v() {
        return (MonitorSizeChangedLinearLayout) this.V.getValue();
    }

    private final ChallengeDetailJediViewModel w() {
        return (ChallengeDetailJediViewModel) this.ae.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.detail.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return i2 != 0 ? i2 != 1 ? "" : "challenge_fresh" : "challenge";
    }

    public final View b(int i2) {
        if (this.am == null) {
            this.am = new SparseArray();
        }
        View view = (View) this.am.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.am.put(i2, findViewById);
        return findViewById;
    }

    public final ChallengeDetailParam b() {
        return (ChallengeDetailParam) this.N.getValue();
    }

    public final SpringLayout c() {
        return (SpringLayout) this.S.getValue();
    }

    /* access modifiers changed from: package-private */
    public final DmtStatusView e() {
        return (DmtStatusView) this.T.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(j.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new org.greenrobot.eventbus.g(j.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(52, new org.greenrobot.eventbus.g(j.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.mx;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(43268);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class f implements SpannedGridLayoutManager.b {
        static {
            Covode.recordClassIndex(43270);
        }

        @Override // com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.b
        public final boolean a() {
            return true;
        }

        f() {
        }

        @Override // com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.b
        public final SpannedGridLayoutManager.d a(int i2) {
            if (i2 == 0) {
                return new SpannedGridLayoutManager.d(2, 2);
            }
            return new SpannedGridLayoutManager.d(1, 1);
        }
    }

    public static final class g implements SpannedGridLayoutManager.b {
        static {
            Covode.recordClassIndex(43271);
        }

        @Override // com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.b
        public final boolean a() {
            return false;
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.views.SpannedGridLayoutManager.b
        public final SpannedGridLayoutManager.d a(int i2) {
            if (i2 == 0) {
                return new SpannedGridLayoutManager.d(2, 2);
            }
            return new SpannedGridLayoutManager.d(1, 1);
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.s;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public final void a(boolean z2, boolean z3) {
        getContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = x();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            e().h();
            c().setRefreshing(false);
        } else {
            e().f();
            com.bytedance.ies.watcher.c.b("cd_start_activity_to_request_net_duration");
            w().a(b().getCid(), b().getClickReason(), b().isHashTag(), z3, b().getPreviewToken());
            List<com.ss.android.ugc.aweme.detail.h> list = this.I;
            if (z2 && list != null) {
                for (com.ss.android.ugc.aweme.detail.h hVar : list) {
                    hVar.a(false, true);
                }
            }
        }
        if (z3) {
            e().d();
            a(0.0f, -60.0f);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<HashMap<Integer, View>> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f70167a = new t();

        static {
            Covode.recordClassIndex(43284);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<Integer, View> invoke() {
            return new HashMap();
        }
    }

    public final List<com.ss.android.ugc.aweme.detail.h> g() {
        List<com.ss.android.ugc.aweme.detail.h> list = this.I;
        h.f.b.l.b(list, "");
        return list;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(43259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f70161a;

        static {
            Covode.recordClassIndex(43263);
        }

        ac(j jVar) {
            this.f70161a = jVar;
        }

        public final void run() {
            ScrollableLayout scrollableLayout = this.f70161a.y;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollHeight(Integer.MAX_VALUE);
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<MonitorSizeChangedLinearLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MonitorSizeChangedLinearLayout invoke() {
            return this.this$0.b(R.id.bf9);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.b(R.id.e9y);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.b(R.id.e9v);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<TuxRefreshLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxRefreshLayout invoke() {
            return this.this$0.b(R.id.c7d);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.b(R.id.e0k);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.b(R.id.e_f);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.b(R.id.e_o);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.b(R.id.emo);
        }
    }

    private static boolean x() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        String str = this.f70155k;
        if (str == null) {
            h.f.b.l.a("mChallengeId");
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void k() {
        super.k();
        DmtTabLayout dmtTabLayout = this.C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.f159928l);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.a(true, true);
            com.ss.android.ugc.aweme.common.r.a("refresh_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "challenge").f66730a);
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<ChallengeDetailViewModel> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChallengeDetailViewModel invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            return ChallengeDetailViewModel.a.a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        FrameLayout frameLayout = (FrameLayout) b(R.id.st);
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(2131231567);
        }
        this.ab = true;
    }

    public static final class c extends h.f.b.m implements h.f.a.a<ChallengeDetailJediViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(43266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_challenge_ui_ChallengeDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel> r0 = com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.challenge.ui.j$c$1 r0 = new com.ss.android.ugc.aweme.challenge.ui.j$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.j.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_challenge_ui_ChallengeDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<ChallengeDetailParam> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChallengeDetailParam invoke() {
            Object value = this.this$0.f70152d.getValue();
            if (value == null) {
                return new ChallengeDetailParam(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
            }
            return value;
        }
    }

    public final List<Aweme> j() {
        List<Aweme> p2;
        if (this.I == null || !(this.I.get(this.G) instanceof s)) {
            return h.a.z.INSTANCE;
        }
        Object obj = this.I.get(this.G);
        if (!(obj instanceof s)) {
            obj = null;
        }
        s sVar = (s) obj;
        if (sVar == null || (p2 = sVar.p()) == null) {
            return h.a.z.INSTANCE;
        }
        return p2;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ChallengeDetail challengeDetail = this.Y;
        if (challengeDetail != null && challengeDetail.previewStatus == 1) {
            IAdsPreviewService a2 = AdsPreviewServiceImpl.a();
            RelativeLayout relativeLayout = (RelativeLayout) b(R.id.dnx);
            h.f.b.l.b(relativeLayout, "");
            a2.b(relativeLayout);
        }
        super.onDestroyView();
        SparseArray sparseArray = this.am;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f70162a;

        static {
            Covode.recordClassIndex(43264);
        }

        ad(j jVar) {
            this.f70162a = jVar;
        }

        public final void run() {
            User author;
            j jVar = this.f70162a;
            if (jVar.b(R.id.sr) != null) {
                SpringLayout springLayout = (SpringLayout) jVar.b(R.id.c7d);
                if (springLayout != null) {
                    springLayout.setOnScrollChangeListener(new ab(jVar));
                }
                Challenge challenge = jVar.f70156l;
                if (challenge != null) {
                    String challengeBgUrl = challenge.getChallengeBgUrl();
                    UrlModel backgroundImageUrl = challenge.getBackgroundImageUrl();
                    if (!(!com.ss.android.ugc.aweme.challenge.ui.a.b.a(challengeBgUrl) && backgroundImageUrl == null && (challenge.getSubType() != 1 || (author = challenge.getAuthor()) == null || author.getAvatarLarger() == null))) {
                        jVar.f70157m = true;
                    }
                    if (!TextUtils.isEmpty(challengeBgUrl)) {
                        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(challengeBgUrl).a(jVar.getTag());
                        a2.E = (SmartImageView) jVar.b(R.id.sr);
                        a2.c();
                        jVar.m();
                    } else if (backgroundImageUrl != null) {
                        com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(backgroundImageUrl)).a(jVar.getTag());
                        a3.E = (SmartImageView) jVar.b(R.id.sr);
                        a3.c();
                        jVar.m();
                    } else {
                        User author2 = challenge.getAuthor();
                        if (author2 != null && challenge.getSubType() == 1) {
                            com.bytedance.lighten.a.v a4 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(author2.getAvatarLarger())).a(jVar.getTag());
                            a4.E = (SmartImageView) jVar.b(R.id.sr);
                            a4.c();
                            jVar.m();
                        }
                    }
                }
            }
        }
    }

    public j() {
        h.k.c a2 = h.f.b.ab.a(ChallengeDetailJediViewModel.class);
        a aVar = new a(a2);
        this.ae = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.af = h.i.a(h.m.NONE, new v(this));
        this.ag = h.i.a(h.m.NONE, t.f70167a);
        this.t = "msadapt";
        this.al = -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final androidx.fragment.app.l l() {
        int a2;
        SpannedGridLayoutManager.b fVar;
        String str;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.f70119a = new ArrayList();
        boolean z2 = false;
        Fragment a3 = getChildFragmentManager().a(com.ss.android.ugc.aweme.detail.a.v + 0);
        boolean z3 = a3 instanceof s;
        s sVar = a3;
        if (!z3) {
            if (b().getChallengeType() == Math.abs(2) || (a2 = com.bytedance.ies.abmock.b.a().a(true, "[Discover] Hashtag - Instagram layout", 1)) == 1) {
                fVar = null;
            } else if (a2 != 3) {
                fVar = new g();
            } else {
                fVar = new f();
            }
            r rVar = new r(b().getParentTagId());
            String str2 = this.f70155k;
            if (str2 == null) {
                h.f.b.l.a("mChallengeId");
            }
            boolean isHashTag = b().isHashTag();
            if (b().isHashTag()) {
                str = this.f70155k;
                if (str == null) {
                    h.f.b.l.a("mChallengeId");
                }
            } else {
                str = "";
            }
            String enterFrom = b().getEnterFrom();
            String str3 = this.p;
            String awemeId = b().getAwemeId();
            h hVar = new h(null, 1, null);
            hVar.setPreloadInfoInvoke(this.r);
            s sVar2 = new s();
            Bundle bundle = new Bundle();
            bundle.putSerializable("detail_config", rVar);
            bundle.putInt("detail_aweme_list_type", 2);
            bundle.putString("event_label", "challenge");
            bundle.putString("detail_id", str2);
            bundle.putBoolean("extra_challenge_is_hashtag", isHashTag);
            bundle.putString("extra_challenge_hashtag_name", str);
            bundle.putString("detail_aweme_from", enterFrom);
            bundle.putString("detail_aweme_from_aid", awemeId);
            bundle.putString("process_id", str3);
            bundle.putString("group_id", awemeId);
            sVar2.setArguments(bundle);
            sVar2.G = hVar;
            sVar2.H = fVar;
            s sVar3 = sVar2;
            sVar3.u = new e(this);
            if (this.G == 0) {
                z2 = true;
            }
            sVar3.z = z2;
            sVar3.q = e();
            sVar3.A = true;
            sVar = sVar2;
        }
        Objects.requireNonNull(sVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
        s sVar4 = (s) sVar;
        this.f70154j = sVar4;
        if (sVar4 == null) {
            h.f.b.l.a("mHotFragment");
        }
        sVar4.q = e();
        List list = this.I;
        s sVar5 = this.f70154j;
        if (sVar5 == null) {
            h.f.b.l.a("mHotFragment");
        }
        list.add(sVar5);
        List list2 = this.J;
        s sVar6 = this.f70154j;
        if (sVar6 == null) {
            h.f.b.l.a("mHotFragment");
        }
        list2.add(sVar6);
        this.f70119a.add(2);
        return new cr(getChildFragmentManager(), this.J, this.f70119a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f70166a;

        static {
            Covode.recordClassIndex(43275);
        }

        k(j jVar) {
            this.f70166a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f70166a.a((j) true, false);
        }
    }

    public static final /* synthetic */ String a(j jVar) {
        String str = jVar.f70155k;
        if (str == null) {
            h.f.b.l.a("mChallengeId");
        }
        return str;
    }

    public static final /* synthetic */ s b(j jVar) {
        s sVar = jVar.f70154j;
        if (sVar == null) {
            h.f.b.l.a("mHotFragment");
        }
        return sVar;
    }

    private final void b(View view) {
        a(view, new aa(this));
    }

    @org.greenrobot.eventbus.r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/challenge/detail/?", false)) {
            EventBus.a().d(aVar);
            a(true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f70164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f70165b;

        static {
            Covode.recordClassIndex(43272);
        }

        h(j jVar, h.f.a.b bVar) {
            this.f70164a = jVar;
            this.f70165b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                com.ss.android.ugc.aweme.challenge.service.d dVar = this.f70164a.f70153e;
                if (dVar == null) {
                    h.f.b.l.a("mCommerceDelegate");
                }
                h.f.b.l.b(view, "");
                if (!dVar.a(view.getId())) {
                    this.f70165b.invoke(view);
                }
            }
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            h.f.b.l.d(view, "");
            if (MSAdaptionService.c().c(this.this$0.getContext())) {
                SmartRouter.buildRoute(this.this$0.getContext(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class e implements com.ss.android.ugc.aweme.detail.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f70163a;

        static {
            Covode.recordClassIndex(43269);
        }

        e(j jVar) {
            this.f70163a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.detail.k
        public final void a(boolean z) {
            if (z) {
                if (TextUtils.equals(this.f70163a.b().getEnterFrom(), "from_related_tag")) {
                    com.ss.android.ugc.aweme.metrics.r rVar = new com.ss.android.ugc.aweme.metrics.r();
                    rVar.q = j.a(this.f70163a);
                    com.ss.android.ugc.aweme.metrics.r p = rVar.p(j.b(this.f70163a).b());
                    String enterFrom = this.f70163a.b().getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    com.ss.android.ugc.aweme.metrics.r o = p.o(enterFrom);
                    o.aa = this.f70163a.b().getParentTagId();
                    o.f();
                    j jVar = this.f70163a;
                    String jSONObject = j.b(jVar).a().toString();
                    h.f.b.l.b(jSONObject, "");
                    jVar.q = jSONObject;
                }
            } else if (this.f70163a.c().f45677g) {
                this.f70163a.c().setRefreshing(false);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        MusicModel musicModel;
        Music music;
        T t2;
        h.f.b.l.d(bVar, "");
        if (ab_() && (musicModel = bVar.f111484b) != null && (music = musicModel.getMusic()) != null) {
            int i2 = bVar.f111483a;
            music.setCollectStatus(i2);
            Challenge challenge = this.f70156l;
            if (challenge != null && challenge.getConnectMusics() != null) {
                Challenge challenge2 = this.f70156l;
                if (challenge2 == null) {
                    h.f.b.l.b();
                }
                List<Music> connectMusics = challenge2.getConnectMusics();
                h.f.b.l.b(connectMusics, "");
                Iterator<T> it = connectMusics.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    T t3 = t2;
                    h.f.b.l.b(t3, "");
                    if (h.f.b.l.a((Object) t3.getMid(), (Object) music.getMid())) {
                        break;
                    }
                }
                T t4 = t2;
                if (t4 != null) {
                    t4.setCollectStatus(i2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.j$j  reason: collision with other inner class name */
    static final class C1589j extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1589j(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            h.f.b.l.d(view, "");
            if (this.this$0.f70156l != null) {
                j jVar = this.this$0;
                jVar.getContext();
                Challenge challenge = jVar.f70156l;
                if (challenge == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.common.r.a("click_share_button", "challenge_hot", challenge.getCid(), 0);
                com.ss.android.ugc.aweme.metrics.f a2 = new com.ss.android.ugc.aweme.metrics.f().a("challenge_hot");
                String awemeId = this.this$0.b().getAwemeId();
                if (awemeId == null) {
                    awemeId = "";
                }
                a2.f109568a = awemeId;
                a2.f();
                com.ss.android.ugc.aweme.common.r.a("share_challenge", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "challenge").a("group_id", this.this$0.b().getAwemeId()).a("challenge_id", j.a(this.this$0)).a("process_id", this.this$0.p).f66730a);
                ShareService shareService = com.ss.android.ugc.aweme.share.ah.f123352a;
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                shareService.a(activity, this.this$0.f70156l, this.this$0.j(), j.a(this.this$0), this.this$0.b().isHashTag(), this.this$0.q, this.this$0.p, this.this$0.b().getParentTagId());
            }
            return h.z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onVideoEvent(ag agVar) {
        Aweme b2;
        List<Challenge> challengeList;
        h.f.b.l.d(agVar, "");
        if (agVar.f93450a == 2 && ab_() && this.f70156l != null) {
            Object obj = agVar.f93451b;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (!(TextUtils.isEmpty(str) || (b2 = AwemeService.b().b(str)) == null || (challengeList = b2.getChallengeList()) == null)) {
                for (T t2 : challengeList) {
                    h.f.b.l.b(t2, "");
                    String cid = t2.getCid();
                    Challenge challenge = this.f70156l;
                    if (challenge == null) {
                        h.f.b.l.b();
                    }
                    if (com.bytedance.common.utility.m.a(cid, challenge.getCid())) {
                        Challenge challenge2 = this.f70156l;
                        if (challenge2 == null) {
                            h.f.b.l.b();
                        }
                        if (challenge2.getUserCount() > 0) {
                            Challenge challenge3 = this.f70156l;
                            if (challenge3 == null) {
                                h.f.b.l.b();
                            }
                            Challenge challenge4 = this.f70156l;
                            if (challenge4 == null) {
                                h.f.b.l.b();
                            }
                            challenge3.setUserCount(challenge4.getUserCount() - 1);
                            a(this.Y);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        String cid = b().getCid();
        String str = "";
        if (cid == null) {
            cid = str;
        }
        this.f70155k = cid;
        this.Z = b().getShowTabIndex();
        String processId = b().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.p = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r22) {
        /*
        // Method dump skipped, instructions count: 965
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.j.a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class y extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, ChallengeDetail, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, ChallengeDetail challengeDetail) {
            ChallengeDetail challengeDetail2 = challengeDetail;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(challengeDetail2, "");
            this.this$0.a(challengeDetail2);
            return h.z.f158842a;
        }
    }

    private final void a(View view, h.f.a.b<? super View, h.z> bVar) {
        view.setOnClickListener(new h(this, bVar));
    }

    static final class z extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th2, "");
            j jVar = this.this$0;
            if (jVar.ab_()) {
                com.ss.android.ugc.aweme.cc.c.a("challenge_detail", com.ss.android.ugc.aweme.cc.b.FAIL, 4);
                jVar.c().setRefreshing(false);
                new com.bytedance.tux.g.b(jVar).e(R.string.de8).b();
                jVar.e().h();
                androidx.fragment.app.e activity = jVar.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.app.api.b.a.a(activity, th2, (int) R.string.g4j);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void a(float f2, float f3) {
        if (CommerceChallengeServiceImpl.e().c(this.f70156l)) {
            super.a(f2, f3);
        } else {
            this.ac = com.ss.android.ugc.aweme.detail.m.a(f2, f3, this.ac, this);
        }
        com.ss.android.ugc.aweme.challenge.service.d dVar = this.f70153e;
        if (dVar == null) {
            h.f.b.l.a("mCommerceDelegate");
        }
        dVar.a(f3);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void b(int i2, int i3) {
        int i4;
        super.b(i2, i3);
        com.ss.android.ugc.aweme.challenge.service.d dVar = this.f70153e;
        if (dVar == null) {
            h.f.b.l.a("mCommerceDelegate");
        }
        dVar.b(i2);
        if (this.W != null) {
            float f2 = 0.0f;
            if (this.al != v().getBottom()) {
                int bottom = v().getBottom();
                View view = this.A;
                h.f.b.l.b(view, "");
                float bottom2 = (float) ((bottom - view.getBottom()) - q().getHeight());
                this.aj = bottom2;
                float b2 = bottom2 - com.bytedance.common.utility.n.b(getContext(), 20.0f);
                this.ak = b2;
                if (b2 < 0.0f) {
                    this.ak = 0.0f;
                }
                this.al = v().getBottom();
            }
            if (i2 == 0) {
                r().setBackground(new ColorDrawable(androidx.core.content.b.c(r().getContext(), R.color.c9)));
            } else {
                r().setBackground(new ColorDrawable(androidx.core.content.b.c(r().getContext(), R.color.f159928l)));
            }
            com.ss.android.ugc.aweme.challenge.ui.a.a aVar = this.W;
            if (aVar != null) {
                i4 = aVar.getAvatarContainerHight();
            } else {
                i4 = 1;
            }
            float f3 = ((float) i2) / ((float) i4);
            if (f3 >= 0.0f) {
                if (f3 > 1.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
            }
            TextView textView = this.z;
            h.f.b.l.b(textView, "");
            textView.setAlpha(f2);
            if (!CommerceChallengeServiceImpl.e().c(this.f70156l)) {
                this.ac = com.ss.android.ugc.aweme.detail.m.a(f2, this.ac, this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(int i2, int i3) {
        boolean z2;
        super.a(i2, i3);
        Set<Map.Entry> entrySet = ((HashMap) this.ag.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                h.f.b.l.b(value, "");
                View view = (View) value;
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view.setSelected(z2);
            }
        }
        if (this.I != null) {
            Object obj = this.I.get(i2);
            com.ss.android.ugc.aweme.detail.h hVar = (com.ss.android.ugc.aweme.detail.h) obj;
            h.f.b.l.b(hVar, "");
            if (!hVar.d()) {
                obj = null;
            }
            com.ss.android.ugc.aweme.detail.h hVar2 = (com.ss.android.ugc.aweme.detail.h) obj;
            if (hVar2 != null) {
                hVar2.j();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        int identifier;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(b().getCid())) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        DmtTabLayout dmtTabLayout = this.C;
        h.f.b.l.b(dmtTabLayout, "");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.z;
        h.f.b.l.b(textView, "");
        textView.setVisibility(0);
        if (MSAdaptionService.c().c(getContext())) {
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) b(R.id.qb);
            h.f.b.l.b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(8);
        }
        AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) b(R.id.qb);
        h.f.b.l.b(autoRTLImageView2, "");
        a(autoRTLImageView2, new w(this));
        int i3 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i2 = 0;
        } else {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        }
        float dimension = getResources().getDimension(R.dimen.a0s);
        q().getLayoutParams().height = i2;
        q().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = e().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) i2) + dimension);
        a(u(), new C1589j(this));
        ChallengeDetailLegacyServiceImpl.a().a(u());
        e().setBuilder(DmtStatusView.a.a(getContext()).b(com.ss.android.ugc.aweme.views.h.a(getContext(), new k(this))));
        getResources().getDimensionPixelSize(R.dimen.ea);
        c().setScrollMode(com.bytedance.tux.widget.spring.g.NONE);
        c().setOnRefreshListener(new i(this));
        v().setOnSizeChangedListener(new x(this));
        Context context2 = getContext();
        if (context2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context2, "");
        h.f.b.l.d(context2, "");
        this.X = new com.ss.android.ugc.aweme.challenge.ui.a.g(context2);
        com.ss.android.ugc.aweme.challenge.service.d a2 = ChallengeDetailProvicer.b().a(view, this);
        h.f.b.l.b(a2, "");
        this.f70153e = a2;
        h.a.a(this, w(), k.f70168a, (com.bytedance.jedi.arch.ah) null, new z(this), (h.f.a.b) null, new y(this), 10);
        a((j) false, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class ab extends h.f.b.m implements h.f.a.q<Integer, Integer, Boolean, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(j jVar) {
            super(3);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(Integer num, Integer num2, Boolean bool) {
            int intValue = num.intValue();
            num2.intValue();
            bool.booleanValue();
            int i2 = this.this$0.n;
            View b2 = this.this$0.b(R.id.e_f);
            h.f.b.l.b(b2, "");
            int height = i2 + b2.getHeight();
            LinearLayout linearLayout = (LinearLayout) this.this$0.b(R.id.emo);
            h.f.b.l.b(linearLayout, "");
            float height2 = (float) ((height + linearLayout.getHeight()) - intValue);
            int i3 = this.this$0.n;
            View b3 = this.this$0.b(R.id.e_f);
            h.f.b.l.b(b3, "");
            int height3 = i3 + b3.getHeight();
            LinearLayout linearLayout2 = (LinearLayout) this.this$0.b(R.id.emo);
            h.f.b.l.b(linearLayout2, "");
            float height4 = height2 / ((float) (height3 + linearLayout2.getHeight()));
            SmartImageView smartImageView = (SmartImageView) this.this$0.b(R.id.sr);
            if (smartImageView != null) {
                smartImageView.setScaleY(height4);
            }
            SmartImageView smartImageView2 = (SmartImageView) this.this$0.b(R.id.sr);
            if (smartImageView2 != null) {
                smartImageView2.setScaleX(height4);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    static final class x extends h.f.b.m implements h.f.a.r<Integer, Integer, Integer, Integer, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(43288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(j jVar) {
            super(4);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Integer num, Integer num2, Integer num3, Integer num4) {
            ViewGroup.LayoutParams layoutParams;
            num.intValue();
            int intValue = num2.intValue();
            num3.intValue();
            num4.intValue();
            this.this$0.n = intValue;
            SmartImageView smartImageView = (SmartImageView) this.this$0.b(R.id.sr);
            if (!(smartImageView == null || (layoutParams = smartImageView.getLayoutParams()) == null)) {
                int i2 = this.this$0.n;
                View b2 = this.this$0.b(R.id.e_f);
                h.f.b.l.b(b2, "");
                int height = i2 + b2.getHeight();
                LinearLayout linearLayout = (LinearLayout) this.this$0.b(R.id.emo);
                h.f.b.l.b(linearLayout, "");
                layoutParams.height = height + linearLayout.getHeight();
            }
            SmartImageView smartImageView2 = (SmartImageView) this.this$0.b(R.id.sr);
            if (smartImageView2 != null) {
                smartImageView2.requestLayout();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

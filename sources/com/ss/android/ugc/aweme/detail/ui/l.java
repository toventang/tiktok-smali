package com.ss.android.ugc.aweme.detail.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.k;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.cm.a;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.c;
import com.ss.android.ugc.aweme.detail.d.b;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.am;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.b;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class l extends a implements i, j {
    public static final Map<String, String> w;
    private AnalysisStayTimeFragmentComponent A;
    private com.ss.android.ugc.aweme.detail.d.a B;
    private b C;
    private String D = "";
    private String E = "DetailFragment";

    /* renamed from: a  reason: collision with root package name */
    protected ScrollableViewPager f79953a;

    /* renamed from: b  reason: collision with root package name */
    public o f79954b;

    /* renamed from: c  reason: collision with root package name */
    protected ScrollSwitchStateManager f79955c;

    /* renamed from: d  reason: collision with root package name */
    protected HomePageDataViewModel f79956d;

    /* renamed from: e  reason: collision with root package name */
    protected p f79957e;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.feed.param.b f79958j = new com.ss.android.ugc.aweme.feed.param.b();

    /* renamed from: k  reason: collision with root package name */
    protected boolean f79959k = false;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f79960l;

    /* renamed from: m  reason: collision with root package name */
    protected DataCenter f79961m;
    protected String n;
    protected Aweme o;
    protected Aweme p;
    String q = "";
    public IAdSceneService r;
    boolean s = false;
    String t = "";
    String u = "";
    public boolean v = true;
    private int y = -1;
    private boolean z = false;

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new g(l.class, "onScrollToProfileEvent", ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(380, new g(l.class, "onTalentProfileAdEvent", c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(173, new g(l.class, "receiveJumpToRecord", com.ss.android.ugc.aweme.sticker.types.unlock.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final Aweme h() {
        return this.o;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    private static boolean m() {
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
        if (e2 != null) {
            return e2.c();
        }
        return false;
    }

    private boolean u() {
        return this.f79958j.getEventType().equals("playlist");
    }

    private boolean v() {
        return this.f79958j.getEventType().equals("westwindow");
    }

    public final void i() {
        this.f79961m.a("onBack", (Object) null);
    }

    static {
        Covode.recordClassIndex(49750);
        AnonymousClass9 r1 = new HashMap<String, String>() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass9 */

            static {
                Covode.recordClassIndex(49760);
            }

            public final boolean containsKey(Object obj) {
                if (obj == null) {
                    return false;
                }
                return super.containsKey(obj);
            }
        };
        w = r1;
        r1.put("westwindow", "westwindow");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        if (s()) {
            return new Analysis().setLabelName("others_homepage");
        }
        return super.F();
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aq(this.o)) {
            this.f79953a.setOnFlingEndListener(new k() {
                /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(49758);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.k
                public final void a() {
                    l.this.f79955c.a(com.ss.android.ugc.aweme.homepage.api.interaction.c.INSTANCE);
                }
            });
        }
    }

    public final boolean d() {
        if (this.f79954b == null || !this.f79955c.b("page_profile")) {
            return false;
        }
        this.f79954b.a();
        return true;
    }

    public final z g() {
        if (this.f79957e == null) {
            return null;
        }
        e d2 = this.f79955c.d("page_feed");
        if (d2 instanceof z) {
            return (z) d2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aq(this.o)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.of).a();
        }
    }

    private boolean n() {
        if (in.d() || o() || com.ss.android.ugc.aweme.commercialize.e.a.b.aq(this.o) || TextUtils.equals("new_ad_fake_user", this.f79958j.getEventType()) || "from_publish_add_video".equals(this.f79958j.getFrom())) {
            return true;
        }
        return false;
    }

    private boolean o() {
        boolean z2;
        int videoType = this.f79958j.getVideoType();
        if (videoType == 0 || videoType == 15) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean equals = "from_profile_self".equals(this.f79958j.getFrom());
        boolean equals2 = "from_profile_other".equals(this.f79958j.getFrom());
        if ((equals || equals2) && z2) {
            return true;
        }
        return false;
    }

    private boolean q() {
        Aweme aweme;
        if (this.f79958j.getVideoType() == 14 || !r() || (aweme = this.o) == null || aweme.getAuthor() == null || !TextUtils.equals(this.o.getAuthor().getUid(), this.f79958j.getUid())) {
            return false;
        }
        return true;
    }

    private boolean s() {
        if (t() || w.containsKey(this.f79958j.getEventType()) || u() || v()) {
            return true;
        }
        return false;
    }

    private boolean t() {
        if (TextUtils.isEmpty(this.f79958j.getFeedsAwemeId())) {
            return false;
        }
        if (TextUtils.equals(this.f79958j.getPreviousPage(), "homepage_follow") || TextUtils.equals(this.f79958j.getPreviousPage(), "homepage_hot")) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (com.ss.android.ugc.aweme.detail.g.a(this.f79958j.getFrom()) && getActivity() != null) {
            h.a().f93338a = FeedSharePlayerViewModel.getPlayerManager(getActivity());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        Aweme aweme;
        IAdSceneService iAdSceneService;
        if (this.f79955c.b("page_feed") && g() != null && (aweme = this.o) != null && aweme.isAd() && (iAdSceneService = this.r) != null) {
            iAdSceneService.c().a(getContext());
        }
    }

    private boolean p() {
        if (("from_nearby".equals(this.f79958j.getFrom()) || "from_search_mix".equals(this.f79958j.getFrom()) || "from_search_live".equals(this.f79958j.getFrom()) || "trending_page".equals(this.f79958j.getFrom())) && this.o.isLive()) {
            return true;
        }
        return q();
    }

    private boolean r() {
        if ("from_profile_self".equals(this.f79958j.getFrom()) || "from_profile_other".equals(this.f79958j.getFrom()) || "STORY_ENTRANCE_OTHER".equals(this.f79958j.getFrom()) || "STORY_ENTRANCE_MINE".equals(this.f79958j.getFrom()) || "from_ad_new_fake_user".equals(this.f79958j.getFrom())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            if (com.ss.android.ugc.aweme.login.b.a.a(this.o)) {
                String a2 = com.ss.android.ugc.aweme.login.b.a.a(this.o, R.string.har);
                if (a2 != null) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(a2).a();
                }
            } else if (this.o.isImage()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.cjs).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.har).a();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (TextUtils.equals(this.f79958j.getEnterPlayMethod(), "click_avatar_dot")) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.story.b.b());
        }
        if (!TextUtils.isEmpty(this.f79958j.getReactSessionId()) && this.o != null) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.fe.method.o(this.f79958j.getReactSessionId(), 2, v.O().n(), this.o.getAid()));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.z) {
            com.ss.android.ugc.aweme.shortvideo.sticker.e.a.f130267a = "prop_reuse";
            new Intent();
            ArrayList<String> arrayList = new ArrayList<>();
            String[] split = this.o.getStickerIDs().split(",");
            for (String str : split) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            final RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).stickers(arrayList).autoUseSticker(arrayList.get(0)).stickerMusic(this.o.getMusic()).translationType(3);
            AVExternalServiceImpl.a().asyncService("DetailFeed", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(49751);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(l.this.getActivity(), translationType.build());
                }
            });
            this.z = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.aweme.base.ui.p.a b() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.l.b():com.ss.android.ugc.aweme.base.ui.p$a");
    }

    public final void c() {
        Aweme aweme = this.o;
        if (aweme != null) {
            if (!aweme.isCanPlay() || this.o.isDelete()) {
                this.f79955c.a(this.C);
                com.ss.android.ugc.aweme.framework.a.a.b(4, this.E, "aweme id:" + this.o.getAid() + "can play: " + this.o.isCanPlay() + "  is delete:" + this.o.isDelete());
                if (!this.o.isCanPlay()) {
                    this.f79953a.post(new w(this));
                }
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aq(this.o)) {
                this.f79955c.a(this.C);
            } else {
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.o) || !com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.o)) {
                    if (!com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.o)) {
                        this.f79955c.a(this.B);
                    } else {
                        this.f79955c.a(this.C);
                    }
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.F(this.o)) {
                    this.f79955c.a(this.B);
                    return;
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.au(this.o).booleanValue()) {
                    this.f79955c.a(this.C);
                    return;
                } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aO(this.o) || com.ss.android.ugc.aweme.commercialize.e.a.b.r(this.o) || com.ss.android.ugc.aweme.commercialize.e.a.b.d(this.o.getAwemeRawAd())) {
                    this.f79955c.a(this.C);
                } else {
                    this.f79955c.a(this.B);
                }
                if (in.d() || p()) {
                    this.f79955c.a(this.C);
                }
            }
        }
    }

    @r
    public void receiveJumpToRecord(com.ss.android.ugc.aweme.sticker.types.unlock.b bVar) {
        this.z = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(String str) {
        this.f79957e.a(str);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Boolean bool) {
        this.f79953a.f68310b = bool.booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.A;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.b(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        androidx.fragment.app.i iVar = this.f79957e.f68398g;
        if ((iVar instanceof androidx.fragment.app.j) && ((androidx.fragment.app.j) iVar).f2935c) {
            b.i.b(new p(this, str), b.i.f4826c);
        } else {
            this.f79957e.a(str);
        }
    }

    @r(a = ThreadMode.MAIN)
    public void onTalentProfileAdEvent(c cVar) {
        List<Aweme> list;
        z g2;
        if (cVar != null && (list = cVar.f75269a) != null && (g2 = g()) != null && g2.f79992k != null) {
            g2.f79992k.c(list);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ScrollableViewPager.a aVar) {
        if (this.f79958j.isPlaylistCleanMode()) {
            this.f79953a.f68314f = new ScrollableViewPager.a() {
                /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(49754);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
                public final boolean a(float f2, float f3) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
                public final boolean a(int i2) {
                    return false;
                }
            };
            return;
        }
        this.f79953a.f68314f = aVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ am a(am amVar) {
        amVar.f109501d = this.f79958j.getPreviousPage();
        amVar.f109502e = this.f79958j.getUid();
        amVar.f109500c = this.f79958j.getFeedsAwemeId();
        String str = w.get(this.f79958j.getEventType());
        if (!TextUtils.isEmpty(str)) {
            amVar.a(str);
        }
        if (u()) {
            amVar.a("playlist");
            amVar.r = this.f79958j.getPlayListId();
            amVar.f109499b = this.f79958j.getEnterPlaylistGroupId();
        }
        return amVar;
    }

    public final void b(Aweme aweme) {
        String authorUid = aweme.getAuthorUid();
        if ((!aweme.isAd() || !com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) && aweme.isAd() && aweme.getAwemeRawAd() != null) {
            aweme.getAwemeRawAd().setPageFrom(this.f79958j.getEventType());
        }
        this.q = authorUid;
        String eventType = this.f79958j.getEventType();
        int i2 = this.y;
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(eventType, "");
        ag agVar = new ag(21, aweme);
        agVar.f93455f = eventType;
        agVar.f93458i = i2;
        com.ss.android.ugc.d.a.c.a(agVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        this.f79953a.setPagingMainValve(bool.booleanValue());
    }

    public final void a(Aweme aweme) {
        if (!this.s) {
            if (TextUtils.equals(this.t, aweme.getAid())) {
                this.s = true;
            } else {
                return;
            }
        }
        if (!TextUtils.equals(this.u, aweme.getAid())) {
            this.u = aweme.getAid();
            if (TextUtils.equals(this.f79958j.getFrom(), "from_challenge") && TextUtils.equals(this.f79958j.getEventType(), "challenge") && TextUtils.equals(this.f79958j.getPreviousPage(), "discovery")) {
                com.ss.android.ugc.aweme.common.r.a("discovery_video_play", new d().a("enter_from", "challenge").a("tag_id", this.f79958j.getChallengeId()).a("group_id", aweme.getAid()).a("process_id", this.f79958j.getProcessId()).a("log_pb", ac.a.f91473a.a(RequestIdService.a().a(aweme, this.f79958j.getVideoType() + 3000))).a("tag_line", this.D).f66730a);
            } else if (TextUtils.equals(this.f79958j.getFrom(), "from_music") && TextUtils.equals(this.f79958j.getEventType(), "single_song") && TextUtils.equals(this.f79958j.getPreviousPage(), "discovery")) {
                com.ss.android.ugc.aweme.common.r.a("discovery_video_play", new d().a("enter_from", "single_song").a("music_id", this.f79958j.getMusicId()).a("group_id", aweme.getAid()).a("log_pb", ac.a.f91473a.a(RequestIdService.a().a(aweme, this.f79958j.getVideoType() + 4000))).a("tag_line", this.D).f66730a);
            }
            if (TextUtils.equals(this.f79958j.getFrom(), "from_discovery_challenge") && TextUtils.equals(this.f79958j.getEventType(), "discovery")) {
                com.ss.android.ugc.aweme.common.r.a("discovery_video_play", new d().a("enter_from", "discovery").a("tag_id", this.f79958j.getChallengeId()).a("group_id", aweme.getAid()).a("log_pb", ac.a.f91473a.a(RequestIdService.a().a(aweme, this.f79958j.getVideoType() + 3000))).a("tag_line", this.D).f66730a);
            } else if (TextUtils.equals(this.f79958j.getFrom(), "from_music") && TextUtils.equals(this.f79958j.getEventType(), "discovery")) {
                com.ss.android.ugc.aweme.common.r.a("discovery_video_play", new d().a("enter_from", "discovery").a("music_id", this.f79958j.getMusicId()).a("group_id", aweme.getAid()).a("log_pb", ac.a.f91473a.a(RequestIdService.a().a(aweme, this.f79958j.getVideoType() + 4000))).a("tag_line", this.D).f66730a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    @org.greenrobot.eventbus.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollToProfileEvent(com.ss.android.ugc.aweme.feed.i.ad r6) {
        /*
        // Method dump skipped, instructions count: 477
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.l.onScrollToProfileEvent(com.ss.android.ugc.aweme.feed.i.ad):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Integer num) {
        IAdSceneService iAdSceneService;
        com.ss.android.ugc.aweme.detail.h.b bVar;
        aj aC;
        String aid;
        String a2 = this.f79955c.a(num.intValue());
        if ("page_profile".equals(a2)) {
            String str = this.f79956d.f99123f;
            if (this.f79956d.f99124g == null) {
                aid = "";
            } else {
                aid = this.f79956d.f99124g.getAid();
            }
            b.C2974b.a(str, aid);
        }
        String a3 = this.f79955c.a(num.intValue());
        if ("page_feed".equals(a3) || "page_profile".equals(a3)) {
            if (num.intValue() == 0) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.music.f.e());
                if (this.A != null && s()) {
                    this.A.onResume();
                }
            } else if (num.intValue() == 1) {
                if (this.A != null && s()) {
                    this.A.onPause();
                }
                a.C1605a.f71196d = String.valueOf(num);
                z g2 = g();
                if (!(g2 == null || (bVar = g2.f79992k) == null || (aC = bVar.aC()) == null)) {
                    aC.b(6);
                }
            }
        }
        if (!this.f79956d.f99129l && this.f79953a != null && TextUtils.equals(a2, "page_profile") && this.o != null && (iAdSceneService = this.r) != null) {
            iAdSceneService.c().c(this.o, getContext());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        if (!"on_ear_phone_unplug".equals(str)) {
            return;
        }
        if (v.O().o()) {
            v.O().B();
            com.ss.android.ugc.aweme.main.g.a("play", this.f79958j.getFrom(), this.o);
            return;
        }
        com.ss.android.ugc.aweme.main.g.a("pause", this.f79958j.getFrom(), this.o);
    }

    public static l a(com.ss.android.ugc.aweme.feed.param.b bVar, Bundle bundle) {
        bundle.putSerializable("feed_param", bVar);
        l lVar = new l();
        lVar.setArguments(bundle);
        return lVar;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f79961m = DataCenter.a(ae.a(getActivity(), (ad.b) null), this);
        this.f79953a = (ScrollableViewPager) view.findViewById(R.id.fk_);
        this.r = AdSceneServiceImpl.f();
        Bundle arguments = getArguments();
        this.f79958j = (com.ss.android.ugc.aweme.feed.param.b) arguments.getSerializable("feed_param");
        this.f79959k = arguments.getBoolean("extra_challenge_is_hashtag", false);
        this.y = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        this.D = arguments.getString("extra_hashtag_tagline", "");
        if (TextUtils.equals("", this.t) && this.f79958j.getAid() != null) {
            this.t = this.f79958j.getAid();
        }
        String from = this.f79958j.getFrom();
        if (h.f.b.l.a((Object) "from_profile_self", (Object) from) || h.f.b.l.a((Object) "from_profile_other", (Object) from) || h.f.b.l.a((Object) "from_roaming", (Object) from)) {
            this.f79960l = true;
        }
        String string = arguments.getString("auto_route_schema", "");
        if (!TextUtils.isEmpty(string)) {
            SmartRouter.buildRoute(this, string).open();
        }
        this.f79955c = ScrollSwitchStateManager.a.a(getActivity());
        this.f79956d = HomePageDataViewModel.a.a(getActivity());
        p.a b2 = b();
        b2.f68403b = new p.b() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass8 */

            static {
                Covode.recordClassIndex(49759);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.p.b
            public final void a(HashMap<Integer, e> hashMap) {
                l.this.f79955c.a(hashMap);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.p.b
            public final void a(List<com.ss.android.ugc.aweme.base.ui.j> list) {
                l.this.f79955c.a(list);
            }
        };
        if (this.f79958j.isHotSpot() || MSAdaptionService.c().c(getContext())) {
            this.f79957e = b2.a(getChildFragmentManager());
        } else {
            this.f79957e = b2.a(getFragmentManager());
        }
        this.f79953a.setAdapter(this.f79957e);
        this.f79953a.a(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass2 */

            static {
                Covode.recordClassIndex(49752);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
                l.this.f79955c.d(i2);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                l.this.f79955c.c(i2);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                l.this.f79955c.a(i2, f2, i3);
            }
        });
        this.f79955c.a(new com.ss.android.ugc.aweme.homepage.api.interaction.b() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass3 */

            static {
                Covode.recordClassIndex(49753);
            }

            @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
            public final int a() {
                return l.this.f79953a.getCurrentItem();
            }

            @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
            public final void a(int i2) {
                l.this.f79953a.setCurrentItem(i2);
            }

            @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
            public final void a(int i2, boolean z) {
                l.this.f79953a.a(i2, z);
            }
        });
        this.f79953a.setOnFlingEndListener(new k() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass6 */

            static {
                Covode.recordClassIndex(49757);
            }

            @Override // com.ss.android.ugc.aweme.base.ui.k
            public final void a() {
                l.this.f79955c.a(com.ss.android.ugc.aweme.homepage.api.interaction.c.INSTANCE);
            }
        });
        this.f79955c.d(getActivity(), new v(this));
        this.f79955c.d(getActivity(), new m(this));
        this.f79955c.a(getActivity(), new n(this));
        ScrollSwitchStateManager scrollSwitchStateManager = this.f79955c;
        androidx.fragment.app.e activity = getActivity();
        q qVar = new q(this);
        h.f.b.l.d(activity, "");
        h.f.b.l.d(qVar, "");
        scrollSwitchStateManager.f99141c.observe(activity, qVar);
        this.f79955c.b(this, new r(this));
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.f79955c;
        androidx.fragment.app.e activity2 = getActivity();
        s sVar = new s(this);
        h.f.b.l.d(activity2, "");
        h.f.b.l.d(sVar, "");
        scrollSwitchStateManager2.f99142d.observe(activity2, sVar);
        this.f79955c.e(getActivity(), new t(this));
        this.f79954b = BusinessComponentServiceUtils.newScrollSwitchHelper(getActivity(), this.f79953a, this.f79957e);
        this.B = new com.ss.android.ugc.aweme.detail.d.a(getActivity());
        this.C = new com.ss.android.ugc.aweme.detail.d.b(getActivity(), this.B);
        this.f79957e.notifyDataSetChanged();
        HomePageDataViewModel.a.a(getActivity()).a(this.f79958j.getEventType());
        this.f79955c.a("page_feed", false);
        if (this.f79958j.isChain()) {
            this.f79957e.f68400i = u.f79981a;
        }
        AwemeChangeCallBack.a(getActivity(), this, new AwemeChangeCallBack.a() {
            /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass5 */

            static {
                Covode.recordClassIndex(49755);
            }

            @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
            public final void a(Aweme aweme) {
                boolean z;
                l.this.v = false;
                if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null)) {
                    aweme.getAwemeRawAd().setPageFrom(l.this.f79958j.getEventType());
                }
                if (!(l.this.p == aweme || l.this.r == null)) {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2 = l.this.r.c();
                    Context context = l.this.getContext();
                    if (!TextUtils.equals(l.this.f79958j.getEventType(), "general_search") || l.this.p != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c2.a(aweme, context, false, z);
                }
                l.this.p = aweme;
                if (aweme != null && aweme.getAuthor() != null) {
                    l.this.o = aweme;
                    l.this.a(aweme);
                    l.this.c();
                    l.this.a();
                    l.this.n = aweme.getAuthorUid();
                    com.ss.android.b.a.a.a.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.detail.ui.l.AnonymousClass5.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(49756);
                        }

                        public final void run() {
                            if (l.this.isAdded() && !l.this.getActivity().isFinishing() && l.this.o != null) {
                                l.this.b(l.this.o);
                            }
                        }
                    }, 300);
                }
            }
        });
        this.f79955c.a(this.B);
        this.f79956d.f99126i.observe(getActivity(), new o(this));
        if (s()) {
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, true);
            this.A = analysisStayTimeFragmentComponent;
            analysisStayTimeFragmentComponent.f68047b = new x(this);
        }
    }

    public final void a(boolean z2, int i2) {
        Aweme aweme;
        long j2;
        com.ss.android.ugc.aweme.detail.e.a aVar = com.ss.android.ugc.aweme.detail.e.a.f79626a;
        z g2 = g();
        if (g2 != null) {
            aweme = g2.f79992k.x();
        } else {
            aweme = null;
        }
        String from = this.f79958j.getFrom();
        int videoType = this.f79958j.getVideoType();
        String eventType = this.f79958j.getEventType();
        z g3 = g();
        if (g3 != null) {
            j2 = g3.f79992k.K();
        } else {
            j2 = -1;
        }
        aVar.a(aweme, from, videoType, eventType, j2, z2, i2, this.f79958j);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.wk, viewGroup, false);
    }
}

package com.ss.android.ugc.aweme.main.bottomobserver;

import android.content.Context;
import android.ss.com.vboost.d;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.logger.c;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.ak;
import com.ss.android.ugc.aweme.util.r;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.gf;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class BottomPublishObserver implements View.OnClickListener, au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final e f109196a;

    /* renamed from: b  reason: collision with root package name */
    public final TabChangeManager f109197b;

    /* renamed from: c  reason: collision with root package name */
    public final ScrollSwitchStateManager f109198c;

    /* renamed from: d  reason: collision with root package name */
    public final HomePageDataViewModel f109199d;

    /* renamed from: e  reason: collision with root package name */
    public long f109200e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.main.e f109201f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f109202g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f109203h;

    /* renamed from: i  reason: collision with root package name */
    private long f109204i = -1;

    static {
        Covode.recordClassIndex(69930);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(6, new g(BottomPublishObserver.class, "onVideoPlayerEvent", com.ss.android.ugc.aweme.shortvideo.j.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory() {
        com.ss.android.ugc.aweme.main.e eVar = this.f109201f;
        if (eVar != null) {
            eVar.a();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.f109200e = System.currentTimeMillis();
    }

    private final boolean b() {
        if (this.f109199d.f99128k == null) {
            return false;
        }
        Aweme aweme = this.f109199d.f99128k;
        if (aweme == null) {
            l.b();
        }
        if (!aweme.hasStickerID() || !l.a((Object) "HOME", (Object) this.f109197b.f109107d)) {
            return false;
        }
        return true;
    }

    public static final class a extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BottomPublishObserver f109205a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f109206b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f109207c;

        static {
            Covode.recordClassIndex(69931);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.by] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onOK() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r0 = r5.f109205a
                com.ss.android.ugc.aweme.main.e r0 = r0.f109201f
                if (r0 != 0) goto L_0x000f
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r1 = r5.f109205a
                com.ss.android.ugc.aweme.main.e r0 = new com.ss.android.ugc.aweme.main.e
                r0.<init>()
                r1.f109201f = r0
            L_0x000f:
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r0 = r5.f109205a
                com.ss.android.ugc.aweme.main.e r3 = r0.f109201f
                if (r3 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r4 = r5.f109205a
                com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = r4.f109198c
                java.lang.String r0 = "page_feed"
                com.ss.android.ugc.aweme.base.ui.e r0 = r1.d(r0)
                boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainPageFragment
                r2 = 0
                if (r0 == 0) goto L_0x0038
                androidx.fragment.app.e r0 = r4.f109196a
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel r1 = com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel.a.a(r0)
                java.lang.String r0 = "PUBLISH"
                com.ss.android.ugc.aweme.by r1 = r1.a(r0)
                boolean r0 = r1 instanceof com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b
                if (r0 != 0) goto L_0x004e
            L_0x0036:
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b r2 = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b) r2
            L_0x0038:
                boolean r0 = r3.f109238b
                if (r0 != 0) goto L_0x004d
                r3.f109237a = r2
                r0 = 1
                r3.f109238b = r0
                com.ss.android.ugc.aweme.main.IMainPageFragment r1 = com.bytedance.tiktok.homepage.services.MainPageFragmentImpl.i()
                com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1 r0 = new com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1
                r0.<init>(r3)
                r1.a(r0)
            L_0x004d:
                return
            L_0x004e:
                r2 = r1
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver.a.onOK():void");
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            b bVar = this.f109206b;
            if (bVar == null || !bVar.k()) {
                asyncAVService.uiService().recordService().startRecord(this.f109205a.f109196a, this.f109207c.build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance(this.f109205a.f109196a, this.f109207c.build());
                b bVar2 = this.f109206b;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            com.ss.android.ugc.aweme.t.b.a(this.f109205a.f109196a, "PUBLISH");
            com.ss.android.ugc.aweme.turbo.api.b.a().openCamera();
        }

        a(BottomPublishObserver bottomPublishObserver, b bVar, RecordConfig.Builder builder) {
            this.f109205a = bottomPublishObserver;
            this.f109206b = bVar;
            this.f109207c = builder;
        }
    }

    private final void a() {
        String str;
        Fragment b2;
        android.ss.com.vboost.a.a(d.COMMON_TAB_SWITCH, 3000);
        com.ss.android.ugc.aweme.notice.api.b.a(false);
        c.f109013a = false;
        a.b.f109011a.f109002c = false;
        a.b.f109011a.f109006g = false;
        z zVar = null;
        com.ss.android.ugc.aweme.share.d.c.f123452d = null;
        MainPageFragmentImpl.i().c();
        String uuid = UUID.randomUUID().toString();
        String str2 = "";
        l.b(uuid, str2);
        String e2 = MainPageFragmentImpl.i().e();
        if (MainPageFragmentImpl.i().b()) {
            str = "click_intro";
        } else {
            str = "click_plus";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", "direct_shoot").a("enter_from", e2).a("enter_method", str).a("creation_id", uuid).a("group_id", ah.f109484b).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(uuid)).a("is_ui_shoot", (Object) true);
        l.b(a2, str2);
        AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a2.f66730a);
        long currentTimeMillis = System.currentTimeMillis();
        gf.a();
        AVExternalServiceImpl.a().provideAVPerformance().start("av_video_record_init", "clickRecordBtn");
        if (System.currentTimeMillis() - this.f109200e >= 500) {
            IExternalService a3 = AVExternalServiceImpl.a();
            IAVPublishService publishService = a3.publishService();
            if (publishService.isParallelPublishEnabled()) {
                if (!publishService.isPublishable()) {
                    AVExternalServiceImpl.a().storyService().showPublishingToast(this.f109202g);
                    return;
                }
            } else if (a3.publishService().isPublishing() && a3.publishService().isPublishServiceRunning(this.f109196a)) {
                new com.bytedance.tux.g.b(this.f109196a).e(R.string.fal).b();
                return;
            }
            com.ss.android.common.c.c.a(this.f109196a, "record", "click", new s().a("record_mode", "direct").a());
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, str2);
            if (g2.isLogin() || com.bytedance.ies.abmock.b.a().a(true, "un_logined_click_ask_login", 0) != 1) {
                if (l.a((Object) "HOME", (Object) this.f109197b.f109107d) && (b2 = this.f109197b.b()) != null) {
                    if (!(b2 instanceof ae)) {
                        b2 = null;
                    }
                    ae aeVar = (ae) b2;
                    if (aeVar != null) {
                        zVar = aeVar.l();
                    }
                    if (zVar instanceof af) {
                        String a4 = ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(ak.INSTANCE.getVideoId(), 0));
                        l.b(a4, str2);
                        str2 = a4;
                    }
                }
                a(uuid, str2, e2, str);
                b bVar = (b) HomeTabViewModel.a.a(this.f109196a).a("PUBLISH");
                if (bVar != null && bVar.k()) {
                    a(e2);
                }
                com.ss.android.ugc.aweme.feed.s.a(com.ss.android.ugc.aweme.feed.af.MUSICAL);
                RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(uuid).shootWay("direct_shoot").groupId(ah.f109484b).enterFrom(e2).enterMethod(str).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(com.ss.android.ugc.aweme.setting.i.c.a());
                if (b() && this.f109199d.f99128k != null) {
                    Aweme aweme = this.f109199d.f99128k;
                    if (aweme == null) {
                        l.b();
                    }
                    translationType.stickers(r.a(aweme.getStickerIDs()));
                }
                AVExternalServiceImpl.a().asyncServiceForMainRecordService(this.f109196a, "direct_shoot", new a(this, bVar, translationType));
                this.f109200e = System.currentTimeMillis();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.g());
                return;
            }
            String c2 = this.f109199d.c();
            if (c2 != null) {
                com.ss.android.ugc.aweme.login.c.a(this.f109196a, c2, "click_shoot");
            }
        }
    }

    public BottomPublishObserver(Context context) {
        l.d(context, "");
        this.f109202g = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        e eVar = (e) context;
        this.f109196a = eVar;
        this.f109197b = TabChangeManager.a.a(eVar);
        this.f109198c = ScrollSwitchStateManager.a.a(eVar);
        this.f109199d = HomePageDataViewModel.a.a(eVar);
        MainPageFragmentImpl.i().a(this);
        if (com.ss.android.ugc.aweme.setting.i.e.a()) {
            cg.a(this);
        }
    }

    private static void a(String str) {
        com.ss.android.ugc.aweme.common.r.a("special_icon_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("prop_id", AVExternalServiceImpl.a().specialPlusService().getEffectId()).f66730a);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (com.ss.android.ugc.aweme.setting.i.e.a()) {
            com.ss.android.ugc.aweme.video.i O = com.ss.android.ugc.aweme.video.v.O();
            l.b(O, "");
            f L = O.L();
            l.b(L, "");
            f.c j2 = L.j();
            l.b(j2, "");
            if (j2.a()) {
                this.f109203h = true;
                this.f109204i = System.currentTimeMillis();
                com.ss.android.ugc.aweme.video.v.O().B();
                return;
            }
        }
        a();
    }

    @org.greenrobot.eventbus.r
    public final void onVideoPlayerEvent(com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
        l.d(jVar, "");
        if (jVar.f128596c == 4 && this.f109203h) {
            String.valueOf(System.currentTimeMillis() - this.f109204i);
            AVExternalServiceImpl.a().getAVMobService().onEventV3("tool_performance_operation_cost_time", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "tool_performance_pause_feed_video_player").a("totaltime", System.currentTimeMillis() - this.f109204i).f66730a);
            this.f109203h = false;
            a();
        }
    }

    private final void a(String str, String str2, String str3, String str4) {
        int i2;
        int i3 = 0;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", str).a("shoot_way", "direct_shoot").a("enter_from", str3).a("enter_method", str4).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(str)).a("group_id", ah.f109484b).a("is_ui_shoot", (Object) false);
        l.b(a2, "");
        if (com.ss.android.ugc.aweme.push.g.a().a(ah.f109484b)) {
            a2.a("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.a("log_pb", str2);
        }
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        if (publishService.isParallelPublishEnabled()) {
            i2 = publishService.getParallelPublishTaskSize();
        } else {
            i2 = 0;
        }
        a2.a("publish_cnt", i2);
        if ((o.f116433c || o.f116434d) && str3.equals("personal_homepage")) {
            i3 = 1;
        }
        a2.a("with_guidence", i3);
        a2.a("tab_name", o.f116431a);
        b bVar = (b) HomeTabViewModel.a.a(this.f109196a).a("PUBLISH");
        if (bVar != null && bVar.k()) {
            a2.a("is_special_icon", 1);
            String effectId = AVExternalServiceImpl.a().specialPlusService().getEffectId();
            if (!TextUtils.isEmpty(effectId)) {
                a2.a("prop_id", effectId);
            }
        }
        AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a2.f66730a);
    }
}

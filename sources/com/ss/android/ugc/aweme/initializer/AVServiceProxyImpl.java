package com.ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.di;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.experiment.gc;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.metrics.aj;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.opensdk.a.a.a;
import com.ss.android.ugc.aweme.openshare.Share;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.ac;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.port.in.al;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.port.in.as;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.av;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.ay;
import com.ss.android.ugc.aweme.port.in.az;
import com.ss.android.ugc.aweme.port.in.ba;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.bc;
import com.ss.android.ugc.aweme.port.in.bd;
import com.ss.android.ugc.aweme.port.in.be;
import com.ss.android.ugc.aweme.port.in.bf;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.port.in.bi;
import com.ss.android.ugc.aweme.port.in.bj;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.port.in.bn;
import com.ss.android.ugc.aweme.port.in.bo;
import com.ss.android.ugc.aweme.port.in.bp;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IToolsProfileService;
import com.ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;
import com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;
import com.ss.android.ugc.aweme.shortvideo.util.y;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.ah;
import com.ss.android.ugc.aweme.utils.ha;
import com.ss.android.ugc.aweme.utils.id;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public class AVServiceProxyImpl implements IAVServiceProxy {
    private com.ss.android.ugc.aweme.port.in.n abTestService;
    private z accountService;
    private ab applicationService;
    private com.ss.android.ugc.aweme.port.in.t avConverter;
    private ac bridgeService;
    private ad busiStickerService;
    private ae businessGoodsService;
    private af captchaService;
    private ak challengeService;
    private ai commerceService;
    private IHashTagService hashTagService;
    private am liveService;
    private an localHashTagService;
    private ao miniAppService;
    private as musicService;
    private au networkService;
    private av openSDKShareService;
    private IToolsProfileService profileService;
    private ax publishService;
    private ay regionService;
    private ISchedulerService schedulerService;
    private az sharePrefService;
    private ba shareService;
    private bb shortVideoPluginService;
    private bc stickerPropService;
    private bd stickerShareService;
    private be storyService;
    private bf summonFriendService;
    private bg syncShareService;
    private bi toolsComponentService;
    private bj uiService;
    private bk unlockStickerService;
    private bn videoCacheService;
    private bp wikiService;

    public static class k implements an {
        static {
            Covode.recordClassIndex(67115);
        }
    }

    static {
        Covode.recordClassIndex(67096);
    }

    static final /* synthetic */ boolean lambda$superEntrancePrivacyService$2$AVServiceProxyImpl(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IConnectionEntranceService getXsEntranceService() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class a implements com.ss.android.ugc.aweme.port.in.n {
        static {
            Covode.recordClassIndex(67099);
        }

        private a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.n
        public final boolean b() {
            return com.ss.android.ugc.aweme.share.h.b.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.n
        public final boolean c() {
            return dq.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.n
        public final boolean d() {
            return gc.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.n
        public final int a() {
            return com.bytedance.ies.abmock.b.a().a(true, "ins_share_type", 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements ab {
        static {
            Covode.recordClassIndex(67100);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void l() {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34768c = true;
        }

        private b() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final int b() {
            return com.bytedance.ies.ugc.appcontext.d.n;
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final Class<? extends androidx.fragment.app.e> d() {
            return SplashActivity.class;
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final Class<? extends androidx.fragment.app.e> e() {
            return SplashActivity.class;
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final String j() {
            return com.bytedance.ies.ugc.appcontext.d.s;
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final boolean m() {
            return com.bytedance.ies.ugc.appcontext.f.f34637l;
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final String a() {
            return AppLog.getServerDeviceId();
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final Application c() {
            return com.bytedance.ies.ugc.appcontext.g.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final int h() {
            return (int) com.bytedance.ies.ugc.appcontext.d.d();
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final String i() {
            return com.bytedance.ies.ugc.appcontext.d.f();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void k() {
            id.a(10);
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final boolean n() {
            return ah.a().f142630a;
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final androidx.fragment.app.e f() {
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 != null && (j2 instanceof androidx.fragment.app.e)) {
                return (androidx.fragment.app.e) j2;
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final boolean g() {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (activity instanceof MainActivity) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void b(androidx.fragment.app.e eVar) {
            new MainActivityCallback(eVar, null);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(final ab.a aVar) {
            new com.ss.android.ugc.aweme.p.a() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67101);
                }

                @Override // com.ss.android.ugc.aweme.p.a
                public final void a() {
                    aVar.a(false);
                }
            }.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.q
        public final boolean b(String str) {
            return com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(androidx.fragment.app.e eVar) {
            Bundle bundle = new Bundle();
            bundle.putString(com.ss.android.ugc.aweme.be.f68530b, com.ss.android.ugc.aweme.be.f68533e);
            Hox.a.a(eVar).b("Following", bundle);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(String str) {
            com.ss.android.ugc.aweme.feed.s.a(com.ss.android.ugc.aweme.feed.af.valueOf(str));
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final boolean a(long j2) {
            LocalVideoPlayerManager a2 = LocalVideoPlayerManager.a();
            a2.c();
            return a2.f143443a.a(j2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(androidx.fragment.app.e eVar, String str) {
            h.f.b.l.d(eVar, "");
            if (str != null) {
                com.ss.android.ugc.aweme.discover.hitrank.c cVar = (com.ss.android.ugc.aweme.discover.hitrank.c) com.ss.android.ugc.aweme.base.b.a.a.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.discover.hitrank.c.class);
                if ((h.m.p.a((CharSequence) str, (CharSequence) "153070", false) || h.m.p.a((CharSequence) str, (CharSequence) "153071", false)) && com.ss.android.ugc.aweme.discover.hitrank.b.f81199a) {
                    if (!cVar.a()) {
                        cVar.b();
                        com.ss.android.ugc.aweme.discover.hitrank.b.f81199a = false;
                        new com.bytedance.tux.g.b(eVar).e(R.string.cal).b();
                    }
                    com.ss.android.ugc.aweme.discover.hitrank.d.a(com.ss.android.ugc.aweme.discover.hitrank.b.f81200b, com.ss.android.ugc.aweme.discover.hitrank.b.f81201c, 7, null);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(String str, String str2) {
            aj ajVar = new aj();
            ajVar.a("shoot_way", str, c.a.f109562a);
            ajVar.a("shoot_type", str2, c.a.f109562a);
            ajVar.f();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ab
        public final void a(String str, String str2, String str3) {
            com.ss.android.ugc.aweme.metrics.e eVar = new com.ss.android.ugc.aweme.metrics.e();
            eVar.f109565a = str;
            eVar.f109566b = str2;
            eVar.f109567c = str3;
            eVar.f();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements ac {
        static {
            Covode.recordClassIndex(67102);
        }

        private c() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final void c() {
            AnchorListManager.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final AVAnchorPublishStruct b() {
            List<AnchorPublishStruct> f2 = AnchorListManager.f67941f.f();
            if (com.bytedance.common.utility.collection.b.a((Collection) f2)) {
                return null;
            }
            AnchorPublishStruct anchorPublishStruct = null;
            for (int i2 = 0; i2 < f2.size(); i2++) {
                if (f2.get(i2).type == 40) {
                    anchorPublishStruct = f2.get(i2);
                }
            }
            String str = anchorPublishStruct.title;
            List<String> urlList = anchorPublishStruct.icon.getUrlList();
            if (com.bytedance.common.utility.collection.b.a((Collection) urlList)) {
                return null;
            }
            String str2 = urlList.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            return new AVAnchorPublishStruct(str2, "", str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final boolean a() {
            return com.ss.android.ugc.aweme.t.b.a();
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final com.ss.android.ugc.aweme.common.ad a(BaseShortVideoContext baseShortVideoContext) {
            return ha.a(baseShortVideoContext);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final boolean b(Context context) {
            return com.ss.android.ugc.aweme.m.a.c(context);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final String a(Context context) {
            return PropReuseServiceImpl.c().a(context);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final void a(Activity activity) {
            if (activity instanceof MainActivity) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                if (Hox.a.a(eVar).b("HOME")) {
                    Bundle bundle = new Bundle();
                    bundle.putString(com.ss.android.ugc.aweme.be.f68530b, com.ss.android.ugc.aweme.be.f68532d);
                    Hox.a.a(eVar).a("HOME", bundle);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final void b(BaseShortVideoContext baseShortVideoContext) {
            Activity b2;
            String str;
            com.ss.android.ugc.aweme.common.ad a2 = ha.a(baseShortVideoContext);
            if (a2 != null && !a2.mIsFromDraft && ha.a(a2) && (b2 = com.bytedance.ies.ugc.appcontext.g.b()) != null) {
                if (TextUtils.isEmpty(a2.mAppName)) {
                    str = b2.getString(R.string.gf2);
                } else {
                    str = a2.mAppName;
                }
                new com.ss.android.ugc.aweme.opensdk.a.a.a(b2, str, "share success", new a.AbstractC2932a(b2, a2) {
                    /* class com.ss.android.ugc.aweme.t.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Activity f138541a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.aweme.common.ad f138542b;

                    static {
                        Covode.recordClassIndex(90629);
                    }

                    @Override // com.ss.android.ugc.aweme.opensdk.a.a.a.AbstractC2932a
                    public final void a() {
                        com.ss.android.ugc.aweme.share.aj ajVar = new com.ss.android.ugc.aweme.share.aj(this.f138541a, this.f138542b);
                        if (ajVar.f123355a != null) {
                            Share.Response response = new Share.Response();
                            response.errorCode = 0;
                            response.state = ajVar.f123355a.mState;
                            response.subErrorCode = 0;
                            ajVar.a(ajVar.f123355a, response);
                        }
                        d a2 = new d().a("launch_from", this.f138542b.mClientKey);
                        String str = "";
                        if (!(this.f138542b.getShareRequestBundle() == null || this.f138542b.getShareRequestBundle().getBundle("_bytedance_params_extra") == null)) {
                            str = this.f138542b.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", str);
                        }
                        r.a("return_to_origin_app", a2.a("style_id", str).f66730a);
                    }

                    @Override // com.ss.android.ugc.aweme.opensdk.a.a.a.AbstractC2932a
                    public final void b() {
                        d a2 = new d().a("launch_from", this.f138542b.mClientKey);
                        String str = "";
                        if (!(this.f138542b.getShareRequestBundle() == null || this.f138542b.getShareRequestBundle().getBundle("_bytedance_params_extra") == null)) {
                            str = this.f138542b.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", str);
                        }
                        r.a("stay_in_tt", a2.a("style_id", str).f66730a);
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        this.f138541a.sendBroadcast(intent);
                    }

                    {
                        this.f138541a = r1;
                        this.f138542b = r2;
                    }
                }).show();
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final void a(String str) {
            com.ss.android.ugc.aweme.t.b.a(str, (String) null);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final boolean a(com.ss.android.ugc.aweme.common.ad adVar) {
            return ha.a(adVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ac
        public final void a(Activity activity, com.ss.android.ugc.aweme.common.ad adVar, String str, int i2) {
            if (activity == null) {
                activity = com.bytedance.ies.ugc.appcontext.f.j();
            }
            new com.ss.android.ugc.aweme.share.aj(activity, adVar).a(str, i2);
        }
    }

    static class e implements af {
        static {
            Covode.recordClassIndex(67104);
        }

        private e() {
        }

        /* synthetic */ e(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements ak {
        static {
            Covode.recordClassIndex(67105);
        }

        private f() {
        }

        /* synthetic */ f(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ag
        public final AVChallenge a(String str) {
            return com.ss.android.ugc.aweme.shortvideo.ae.a.a(ChallengeApi.a(str, 0, false, null).challenge);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ak
        public final ak.b a(final ak.a<AVChallenge> aVar) {
            com.ss.android.ugc.aweme.common.e.b bVar = new com.ss.android.ugc.aweme.common.e.b();
            bVar.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.challenge.g.d());
            bVar.a_(new com.ss.android.ugc.aweme.common.e.c() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.f.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(67109);
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void a(Exception exc) {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void aO_() {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void b(Exception exc) {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void bh_() {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void c(Exception exc) {
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void f() {
                    aVar.a();
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void c(List list, boolean z) {
                    com.ss.android.ugc.aweme.shortvideo.ae.a.a((List<Challenge>) list);
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void a(List list, boolean z) {
                    aVar.a(com.ss.android.ugc.aweme.shortvideo.ae.a.a((List<Challenge>) list));
                }

                @Override // com.ss.android.ugc.aweme.common.e.c
                public final void b(List list, boolean z) {
                    com.ss.android.ugc.aweme.shortvideo.ae.a.a((List<Challenge>) list);
                }
            });
            return new i(bVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ak
        public final ak.c a(final ak.e eVar) {
            com.ss.android.ugc.aweme.challenge.g.g gVar = new com.ss.android.ugc.aweme.challenge.g.g();
            gVar.a(new com.ss.android.ugc.aweme.challenge.g.f());
            gVar.a_(new com.ss.android.ugc.aweme.challenge.g.i() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(67108);
                }

                @Override // com.ss.android.ugc.aweme.challenge.g.i
                public final void a() {
                    eVar.b();
                }

                @Override // com.ss.android.ugc.aweme.challenge.g.i
                public final void b() {
                    eVar.c();
                }

                @Override // com.ss.android.ugc.aweme.challenge.g.i
                public final void a(SearchSugChallengeList searchSugChallengeList) {
                    eVar.a(com.ss.android.ugc.aweme.shortvideo.ae.d.a(searchSugChallengeList));
                }
            });
            return new h(gVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ak
        public final ak.d a(Fragment fragment) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) androidx.lifecycle.ae.a(fragment, (ad.b) null).a(RecommendHashTagViewModel.class);
            return new ak.d() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67106);
                }

                @Override // com.ss.android.ugc.aweme.port.in.ak.d
                public final com.ss.android.ugc.aweme.shortvideo.f a() {
                    return com.ss.android.ugc.aweme.shortvideo.ae.c.a(recommendHashTagViewModel.a().getValue());
                }

                @Override // com.ss.android.ugc.aweme.port.in.ak.d
                public final void a(ak.f fVar) {
                    recommendHashTagViewModel.a(fVar);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.ak
        public final ak.d a(androidx.fragment.app.e eVar) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) androidx.lifecycle.ae.a(eVar, (ad.b) null).a(RecommendHashTagViewModel.class);
            recommendHashTagViewModel.a().observe(eVar, new g(eVar));
            return new ak.d() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(67107);
                }

                @Override // com.ss.android.ugc.aweme.port.in.ak.d
                public final com.ss.android.ugc.aweme.shortvideo.f a() {
                    return com.ss.android.ugc.aweme.shortvideo.ae.c.a(recommendHashTagViewModel.a().getValue());
                }

                @Override // com.ss.android.ugc.aweme.port.in.ak.d
                public final void a(ak.f fVar) {
                    recommendHashTagViewModel.a(fVar);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.ag
        public final void a(String str, androidx.core.g.a<AVChallenge> aVar) {
            ChallengeModule challengeModule = new ChallengeModule();
            ChallengeModule.AnonymousClass1 r3 = new com.google.c.h.a.k<ChallengeDetail>(new j(aVar)) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.ss.android.ugc.aweme.base.e.a.a f130205a;

                static {
                    Covode.recordClassIndex(85406);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    this.f130205a.a(null);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(ChallengeDetail challengeDetail) {
                    this.f130205a.a(challengeDetail);
                }

                {
                    this.f130205a = r2;
                }
            };
            if (!CommerceChallengeServiceImpl.e().b(str) && !CommerceChallengeServiceImpl.e().b((String) null)) {
                com.google.c.h.a.l.a(challengeModule.f130204a.fetchChallengeDetail(str, null, 0, 0), r3, com.ss.android.ugc.aweme.base.m.f68150a);
            } else if (!in.d()) {
                com.google.c.h.a.l.a(challengeModule.f130204a.fetchCommerceChallengeDetail(str, null, 0, 0), r3, com.ss.android.ugc.aweme.base.m.f68150a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements ai {

        /* renamed from: a  reason: collision with root package name */
        boolean f104710a;

        static {
            Covode.recordClassIndex(67110);
        }

        private g() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.s
        public final boolean i() {
            return this.f104710a;
        }

        @Override // com.ss.android.ugc.aweme.port.in.s
        public final boolean a(Context context, String str) {
            return w.a(context, str, false);
        }

        @Override // com.ss.android.ugc.aweme.port.in.s
        public final boolean a(Context context, String str, String str2) {
            return w.a(context, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final void a(ViewStub viewStub, ax.a aVar) {
            TcmServiceImpl.j().a(viewStub, aVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final ai.a a() {
            return new ai.a() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67111);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final void f() {
            TcmServiceImpl.j().h();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final Boolean b() {
            return Boolean.valueOf(TcmServiceImpl.j().a());
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final BcAdModel c() {
            return TcmServiceImpl.j().f();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String d() {
            return TcmServiceImpl.j().b();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final boolean e() {
            return TcmServiceImpl.j().g();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String h() {
            return TcmServiceImpl.j().c();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final int g() {
            com.ss.android.ugc.aweme.account.model.a aVar = (com.ss.android.ugc.aweme.account.model.a) ServiceManager.get().getService(com.ss.android.ugc.aweme.account.model.a.class);
            if (aVar == null) {
                return 0;
            }
            return aVar.m();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final boolean j() {
            TcmConfig i2 = TcmServiceImpl.j().i();
            if (i2 == null) {
                return false;
            }
            return i2.isTcmCreator();
        }

        @Override // com.ss.android.ugc.aweme.port.in.s
        public final void a(boolean z) {
            this.f104710a = z;
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final Mission a(String str) {
            return PublishExtensionModel.fromString(str).mission;
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String a(com.ss.android.ugc.aweme.draft.model.c cVar) {
            String str = cVar.W.q;
            PublishExtensionModel fromString = PublishExtensionModel.fromString("");
            fromString.shopOrderShareStructInfo = PublishExtensionModel.fromString(str).shopOrderShareStructInfo;
            return PublishExtensionModel.toString(fromString);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String a(String str, Mission mission) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.mission = mission;
            return new com.google.gson.f().b(fromString);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String a(String str, String str2) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.outerStarAtlas = str2;
            return new com.google.gson.f().b(fromString);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final String a(String str, boolean z) {
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            fromString.fromCommercialSoundPage = z;
            return new com.google.gson.f().b(fromString);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final void a(Activity activity, boolean z) {
            TcmServiceImpl.j().a(activity, z);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final int a(Context context, Activity activity, Boolean bool, Boolean bool2, Boolean bool3, List<AVTextExtraStruct> list) {
            return TcmServiceImpl.j().a(context, activity, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), list);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ai
        public final Boolean a(Activity activity, Context context, Boolean bool, List<AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA) {
            return Boolean.valueOf(TcmServiceImpl.j().a(activity, context, bool.booleanValue(), list, checkBAShowLoading, checkBAHideLoading, checkBAToPublish, checkBADetagBA));
        }
    }

    static class h implements IHashTagService {
        static {
            Covode.recordClassIndex(67112);
        }

        private h() {
        }

        /* synthetic */ h(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.IHashTagService
        public final void saveLocalHashTag(boolean z, String str) {
            com.ss.android.ugc.aweme.challenge.data.d a2 = com.ss.android.ugc.aweme.challenge.data.d.a();
            com.ss.android.ugc.aweme.challenge.data.a aVar = new com.ss.android.ugc.aweme.challenge.data.a(str, true);
            a2.f69936b.remove(aVar);
            a2.f69936b.add(0, aVar);
            if (a2.f69935a > 0 && a2.f69936b.size() > a2.f69935a) {
                a2.f69936b.remove(a2.f69936b.size() - 1);
            }
            a2.b();
        }
    }

    static class i implements al {
        static {
            Covode.recordClassIndex(67113);
        }

        private i() {
        }

        /* synthetic */ i(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class m implements ay {
        static {
            Covode.recordClassIndex(67117);
        }

        private m() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.x
        public final String c() {
            return com.ss.android.ugc.aweme.language.d.h();
        }

        @Override // com.ss.android.ugc.aweme.port.in.x, com.ss.android.ugc.aweme.port.in.ay
        public final String a() {
            IRegionService b2 = RegionService.b();
            if (b2 != null) {
                return b2.a();
            }
            return "";
        }

        @Override // com.ss.android.ugc.aweme.port.in.x
        public final Boolean b() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.language.d.c());
        }

        /* synthetic */ m(byte b2) {
            this();
        }
    }

    static class n implements az {
        static {
            Covode.recordClassIndex(67118);
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final String a() {
            return "guide";
        }

        private n() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final az.a<Boolean> b() {
            return new az.a<Boolean>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.n.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67119);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ Boolean a() {
                    return SharePrefCache.inst().getIsAwemePrivate().c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ void a(Boolean bool) {
                    SharePrefCache.inst().getIsAwemePrivate().b(bool);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final az.a<Boolean> c() {
            return new az.a<Boolean>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.n.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(67121);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ Boolean a() {
                    return SharePrefCache.inst().getAutoSaveVideo().c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ void a(Boolean bool) {
                    SharePrefCache.inst().getAutoSaveVideo().b(bool);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final az.a<Boolean> d() {
            return new az.a<Boolean>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.n.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(67122);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ Boolean a() {
                    return SharePrefCache.inst().hasShowHighQualityVideoTips().c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ void a(Boolean bool) {
                    SharePrefCache.inst().hasShowHighQualityVideoTips().b(bool);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final az.a<Integer> e() {
            return new az.a<Integer>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.n.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(67123);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ Integer a() {
                    return SharePrefCache.inst().getStoryInfoStickerMaxCount().c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ void a(Integer num) {
                    SharePrefCache.inst().getStoryInfoStickerMaxCount().b(num);
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final az.a<Integer> f() {
            return new az.a<Integer>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.n.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(67120);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ Integer a() {
                    return SharePrefCache.inst().getStoryTextStickerMaxCount().c();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.port.in.az.a
                public final /* synthetic */ void a(Integer num) {
                    SharePrefCache.inst().getStoryTextStickerMaxCount().b(num);
                }
            };
        }

        /* synthetic */ n(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final int a(String str, int i2) {
            return com.ss.android.ugc.aweme.base.h.d.a().a(str, i2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final void b(String str, int i2) {
            com.ss.android.ugc.aweme.base.h.d.a().b(str, i2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final boolean a(String str, boolean z) {
            return com.ss.android.ugc.aweme.base.h.d.a().a(str, z);
        }

        @Override // com.ss.android.ugc.aweme.port.in.az
        public final void b(String str, boolean z) {
            com.ss.android.ugc.aweme.base.h.d.a().b(str, z);
        }
    }

    static class o implements ba {
        static {
            Covode.recordClassIndex(67124);
        }

        private o() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.ba
        public final boolean a() {
            return com.ss.android.ugc.aweme.share.ah.f123352a.a();
        }

        /* synthetic */ o(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ba
        public final boolean a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            return com.ss.android.ugc.aweme.share.ah.f123352a.a(cVar, str);
        }
    }

    static class p implements bd {
        static {
            Covode.recordClassIndex(67125);
        }

        private p() {
        }

        /* synthetic */ p(byte b2) {
            this();
        }
    }

    static class r implements bf {
        static {
            Covode.recordClassIndex(67128);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final boolean a(int i2) {
            return i2 == 2;
        }

        private r() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final List<com.ss.android.ugc.aweme.bq.a.e> b() {
            return a(IMService.createIIMServicebyMonsterPlugin(false).getRecentIMUsers());
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final List<com.ss.android.ugc.aweme.bq.a.e> a() {
            return a(IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers());
        }

        /* synthetic */ r(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final void a(Fragment fragment) {
            SummonFriendActivity.a(fragment, "", 0);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final User a(Intent intent) {
            if (intent != null) {
                return (User) intent.getSerializableExtra("extra_data");
            }
            return null;
        }

        private static List<User> b(List<IMUser> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (IMUser iMUser : list) {
                    arrayList.add(IMUser.toUser(iMUser));
                }
            }
            return arrayList;
        }

        private static List<com.ss.android.ugc.aweme.bq.a.e> a(List<IMUser> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (IMUser iMUser : list) {
                    arrayList.add(new com.ss.android.ugc.aweme.bq.a.e(IMUser.toUser(iMUser), iMUser.isMentionEnabled()));
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final List<com.ss.android.ugc.aweme.bq.a.e> a(long j2) {
            com.ss.android.ugc.aweme.bq.a.d a2 = SummonFriendApi.a(j2);
            ArrayList arrayList = new ArrayList();
            for (User user : a2.f68761a) {
                for (com.ss.android.ugc.aweme.bq.a.a aVar : a2.f68762b) {
                    if (aVar.f68756a.equals(user.getUid())) {
                        boolean z = false;
                        if (aVar.f68757b.get(0).f68759b == 0) {
                            z = true;
                        }
                        arrayList.add(new com.ss.android.ugc.aweme.bq.a.e(user, z));
                    }
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final List<User> a(List<User> list, String str) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (User user : list) {
                    arrayList.add(IMUser.fromUser(user));
                }
            }
            return b(createIIMServicebyMonsterPlugin.searchFollowIMUser(arrayList, str));
        }

        @Override // com.ss.android.ugc.aweme.port.in.bf
        public final void a(Fragment fragment, String str, int i2) {
            SummonFriendActivity.a(fragment, str, i2);
        }
    }

    static class s implements bj {
        static {
            Covode.recordClassIndex(67129);
        }

        private s() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.bj
        public final int a() {
            return b.a.f33348a.f33347a;
        }

        /* synthetic */ s(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.bj
        public final Drawable a(Context context) {
            return context.getResources().getDrawable(2131232324);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bj
        public final com.ss.android.ugc.tools.view.a.c a(Activity activity) {
            if (activity instanceof com.ss.android.ugc.aweme.base.a.h) {
                return com.ss.android.ugc.aweme.utils.bi.a((com.ss.android.ugc.tools.view.a.c) activity);
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.port.in.bj
        public final boolean a(String str) {
            return com.bytedance.ies.dmt.ui.e.c.a().a(str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bj
        public final Dialog a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
            a.C0731a aVar = new a.C0731a(context);
            aVar.b(R.string.bbc);
            return aVar.b(R.string.a9e, (DialogInterface.OnClickListener) new l(onClickListener), false).a(R.string.bbb, (DialogInterface.OnClickListener) new m(onClickListener2), false).a().c();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ISuperEntrancePrivacyService superEntrancePrivacyService() {
        return e.f104734a;
    }

    public static class d implements com.ss.android.ugc.aweme.port.in.ad {
        static {
            Covode.recordClassIndex(67103);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ad
        public final void a() {
            CommerceStickerServiceImpl.c().a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.ad
        public final void b(String str) {
            CommerceStickerServiceImpl.c().b(str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ad
        public final void a(String str) {
            CommerceStickerServiceImpl.c().a(str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ad
        public final void a(Boolean bool, String str, String str2, String str3, Boolean bool2) {
            CommerceStickerServiceImpl.c().a(bool.booleanValue(), str, str2, str3, bool2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ad
        public final void a(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4) {
            CommerceStickerServiceImpl.c().a(str, bool.booleanValue(), bool2.booleanValue(), str2, str3, str4);
        }
    }

    static class j implements am {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class, Object> f104712a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<am.a, com.bytedance.android.livesdkapi.depend.model.a.g> f104713b;

        static {
            Covode.recordClassIndex(67114);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final boolean a() {
            return com.ss.android.ugc.aweme.t.b.a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void c() {
            LiveOuterService.s().c().b();
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final com.ss.android.ugc.aweme.port.internal.g d() {
            return LiveOuterService.s().g();
        }

        private j() {
            HashMap hashMap = new HashMap();
            this.f104712a = hashMap;
            this.f104713b = new HashMap();
            hashMap.put(al.class, new i((byte) 0));
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final boolean b() {
            if (!LiveOuterService.s().c().a() || LiveOuterService.s().d() == null) {
                return false;
            }
            return true;
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(Context context) {
            LiveOuterService.s().c().a(context);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void b(boolean z) {
            LiveOuterService.s().c().b(z);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(cg cgVar) {
            LiveOuterService.s().c().a(cgVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void b(am.a aVar) {
            com.bytedance.android.livesdkapi.depend.model.a.g gVar = this.f104713b.get(aVar);
            if (gVar != null) {
                this.f104713b.remove(aVar);
                LiveOuterService.s().h().b(gVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(ch chVar) {
            LiveOuterService.s().c().a(chVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(am.a aVar) {
            com.bytedance.android.livesdkapi.depend.model.a.g gVar = this.f104713b.get(aVar);
            if (gVar == null) {
                aVar.getClass();
                gVar = new k(aVar);
                this.f104713b.put(aVar, gVar);
            }
            LiveOuterService.s().h().a(gVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(boolean z) {
            LiveOuterService.s().c().a(z);
        }

        @Override // com.ss.android.ugc.aweme.port.in.am
        public final void a(FilterBean filterBean, int i2) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.live.model.a(filterBean, i2));
        }
    }

    static class q implements be {

        /* renamed from: a  reason: collision with root package name */
        private com.google.c.a.q<IStoryService> f104719a;

        static {
            Covode.recordClassIndex(67126);
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final boolean a() {
            return com.ss.android.ugc.aweme.story.c.b.b();
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final boolean b() {
            return com.ss.android.ugc.aweme.story.c.b.f();
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final boolean c() {
            return com.ss.android.ugc.aweme.story.c.b.g();
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final boolean d() {
            return com.ss.android.ugc.aweme.story.c.b.h();
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final boolean e() {
            return com.ss.android.ugc.aweme.story.c.b.i();
        }

        private q() {
            this.f104719a = new com.google.c.a.q<IStoryService>() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.q.AnonymousClass1 */

                /* renamed from: b  reason: collision with root package name */
                private IStoryService f104721b;

                static {
                    Covode.recordClassIndex(67127);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.c.a.q
                public final /* synthetic */ IStoryService b() {
                    if (this.f104721b == null) {
                        this.f104721b = StoryServiceImpl.l();
                    }
                    return this.f104721b;
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final int[] f() {
            return this.f104719a.b().h();
        }

        /* synthetic */ q(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final void a(androidx.fragment.app.e eVar) {
            this.f104719a.b().a(eVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final void a(String str) {
            com.ss.android.ugc.aweme.story.g.f137757a.f().a(str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.be
        public final void a(Activity activity, Aweme aweme) {
            AwemeService.b().a(aweme);
            SmartRoute withParam = SmartRouter.buildRoute(activity, "aweme://story/detail").withParam("query_mine_story_from_cache", true).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("video_from", "STORY_ENTRANCE_PREVIEW");
            com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
            if (d2 != null && (activity instanceof androidx.appcompat.app.d)) {
                d2.a(com.ss.android.ugc.aweme.story.g.f137757a.e().a(), (androidx.appcompat.app.d) activity, withParam);
            }
            AVExternalServiceImpl.a().publishService().setPublishStatus(11);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public IAVAppContextManager getAVAppContextManager() {
        return new IAVAppContextManager() {
            /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67097);
            }

            @Override // com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getUpdateVersionCode() {
                return com.bytedance.ies.ugc.appcontext.d.d();
            }

            @Override // com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager
            public final long getVersionCode() {
                return com.bytedance.ies.ugc.appcontext.d.h();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public ag getChallengeService() {
        return getChallengeServiceInternal();
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ak getDmtChallengeService() {
        return getChallengeServiceInternal();
    }

    public static class t implements bp, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

        /* renamed from: b  reason: collision with root package name */
        private List<bo> f104722b = new ArrayList();

        static {
            Covode.recordClassIndex(67130);
        }

        @Override // org.greenrobot.eventbus.i
        public Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(162, new org.greenrobot.eventbus.g(t.class, "onWikiActivityClose", com.ss.android.ugc.aweme.commercialize.b.e.class, ThreadMode.MAIN, 0, false));
            hashMap.put(163, new org.greenrobot.eventbus.g(t.class, "onAsyncAnchor", com.ss.android.ugc.aweme.commercialize.b.a.class, ThreadMode.MAIN, 0, false));
            return hashMap;
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final boolean b() {
            return AnchorListManager.b();
        }

        t() {
            EventBus.a(EventBus.a(), this);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final boolean a() {
            List<AnchorPublishStruct> f2 = AnchorListManager.f67941f.f();
            if (f2 != null && !f2.isEmpty()) {
                for (int i2 = 0; i2 < f2.size(); i2++) {
                    if (f2.get(i2).type == com.ss.android.ugc.aweme.ab.WIKIPEDIA.getTYPE()) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final String c() {
            StringBuilder sb = new StringBuilder();
            if (AnchorListManager.d() != null) {
                for (AnchorPublishStruct anchorPublishStruct : AnchorListManager.f67941f.f()) {
                    sb.append(AnchorListManager.a(anchorPublishStruct));
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final String d() {
            StringBuilder sb = new StringBuilder();
            if (AnchorListManager.d() != null) {
                for (AnchorPublishStruct anchorPublishStruct : AnchorListManager.f67941f.f()) {
                    if (anchorPublishStruct.hadNew) {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final void a(bo boVar) {
            this.f104722b.add(boVar);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final void b(bo boVar) {
            this.f104722b.remove(boVar);
        }

        @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
        public void onAsyncAnchor(com.ss.android.ugc.aweme.commercialize.b.a aVar) {
            for (bo boVar : this.f104722b) {
                boVar.a(aVar.f73700a);
            }
        }

        @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
        public void onWikiActivityClose(com.ss.android.ugc.aweme.commercialize.b.e eVar) {
            for (bo boVar : this.f104722b) {
                boVar.a(null);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.bp
        public final void a(Context context, Map<String, String> map) {
            String str;
            List<AnchorPublishStruct> f2 = AnchorListManager.f67941f.f();
            if (f2 != null) {
                for (int i2 = 0; i2 < f2.size(); i2++) {
                    AnchorPublishStruct anchorPublishStruct = f2.get(i2);
                    if (anchorPublishStruct.type == com.ss.android.ugc.aweme.ab.WIKIPEDIA.getTYPE()) {
                        if (anchorPublishStruct.webUrl != null) {
                            str = anchorPublishStruct.webUrl;
                        } else {
                            str = "";
                        }
                        AddWikiActivity.a.a(context, str, map);
                        return;
                    }
                }
            }
        }
    }

    private ak getChallengeServiceInternal() {
        if (this.challengeService == null) {
            this.challengeService = new f((byte) 0);
        }
        return this.challengeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public com.ss.android.ugc.aweme.port.in.n getABService() {
        if (this.abTestService == null) {
            this.abTestService = new a((byte) 0);
        }
        return this.abTestService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public com.ss.android.ugc.aweme.port.in.t getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = d.f104733a;
        }
        return this.avConverter;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public z getAccountService() {
        if (this.accountService == null) {
            this.accountService = new a();
        }
        return this.accountService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public ab getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new b((byte) 0);
        }
        return this.applicationService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public ac getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new c((byte) 0);
        }
        return this.bridgeService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public com.ss.android.ugc.aweme.port.in.ad getBusiStickerService() {
        if (this.busiStickerService == null) {
            this.busiStickerService = new d();
        }
        return this.busiStickerService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ae getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new ae() {
                /* class com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(67098);
                }

                @Override // com.ss.android.ugc.aweme.port.in.ae
                public final void a(String str) {
                    y.a(str);
                }
            };
        }
        return this.businessGoodsService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public af getCaptureService() {
        if (this.captchaService == null) {
            this.captchaService = new e((byte) 0);
        }
        return this.captchaService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public ai getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new g((byte) 0);
        }
        return this.commerceService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IHashTagService getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new h((byte) 0);
        }
        return this.hashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public bc getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new com.ss.android.ugc.aweme.sticker.o.a.a();
        }
        return this.stickerPropService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public am getLiveService() {
        if (this.liveService == null) {
            this.liveService = new j((byte) 0);
        }
        return this.liveService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public an getLocalHashTagService() {
        if (this.localHashTagService == null) {
            this.localHashTagService = new k();
        }
        return this.localHashTagService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ao getMiniAppService() {
        if (this.miniAppService == null) {
            this.miniAppService = new l();
        }
        return this.miniAppService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public as getMusicService() {
        if (this.musicService == null) {
            this.musicService = new o();
        }
        return this.musicService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public au getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public IToolsProfileService getProfileService() {
        if (this.profileService == null) {
            this.profileService = new di();
        }
        return this.profileService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ax getPublishService() {
        if (this.publishService == null) {
            this.publishService = new p();
        }
        return this.publishService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public ay getRegionService() {
        if (this.regionService == null) {
            this.regionService = new m((byte) 0);
        }
        return this.regionService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ISchedulerService getSchedulerService() {
        if (this.schedulerService == null) {
            this.schedulerService = c.f104732a;
        }
        return this.schedulerService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public ba getShareService() {
        if (this.shareService == null) {
            this.shareService = new o((byte) 0);
        }
        return this.shareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public bb getShortVideoPluginService() {
        if (this.shortVideoPluginService == null) {
            this.shortVideoPluginService = new com.ss.android.ugc.aweme.shortvideo.t.a();
        }
        return this.shortVideoPluginService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public az getSpService() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new n((byte) 0);
        }
        return this.sharePrefService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bd getStickerShareService() {
        if (this.stickerShareService == null) {
            this.stickerShareService = new p((byte) 0);
        }
        return this.stickerShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public be getStoryService() {
        if (this.storyService == null) {
            this.storyService = new q((byte) 0);
        }
        return this.storyService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bf getSummonFriendService() {
        if (this.summonFriendService == null) {
            this.summonFriendService = new r((byte) 0);
        }
        return this.summonFriendService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bg getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = com.ss.android.ugc.aweme.share.ah.f123352a.b();
        }
        return this.syncShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bi getToolsComponentService() {
        if (this.toolsComponentService == null) {
            this.toolsComponentService = new q();
        }
        return this.toolsComponentService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public bj getUiService() {
        if (this.uiService == null) {
            this.uiService = new s((byte) 0);
        }
        return this.uiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bn getVideoCacheService() {
        if (this.videoCacheService == null) {
            this.videoCacheService = f.f104735a;
        }
        return this.videoCacheService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public bp getWikiService() {
        if (this.wikiService == null) {
            this.wikiService = new t();
        }
        return this.wikiService;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVServiceProxy
    public av openSDKService() {
        if (this.openSDKShareService == null) {
            this.openSDKShareService = new com.ss.android.ugc.aweme.opensdk.a.a();
        }
        return this.openSDKShareService;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public bk unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new com.ss.android.ugc.aweme.shortvideo.sticker.e.c();
        }
        return this.unlockStickerService;
    }

    public static class l implements ao {
        static {
            Covode.recordClassIndex(67116);
        }

        @Override // com.ss.android.ugc.aweme.port.in.ao
        public final void a(String str) {
            c.a.f109704a.a().tryMoveMiniAppActivityToFront(str);
        }
    }

    public static IAVServiceProxy createIAVServiceProxybyMonsterPlugin(boolean z) {
        MethodCollector.i(2424);
        Object a2 = com.ss.android.ugc.b.a(IAVServiceProxy.class, z);
        if (a2 != null) {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) a2;
            MethodCollector.o(2424);
            return iAVServiceProxy;
        }
        if (com.ss.android.ugc.b.bH == null) {
            synchronized (IAVServiceProxy.class) {
                try {
                    if (com.ss.android.ugc.b.bH == null) {
                        com.ss.android.ugc.b.bH = new AVServiceProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2424);
                    throw th;
                }
            }
        }
        AVServiceProxyImpl aVServiceProxyImpl = (AVServiceProxyImpl) com.ss.android.ugc.b.bH;
        MethodCollector.o(2424);
        return aVServiceProxyImpl;
    }

    static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.a lambda$getAVConverter$1$AVServiceProxyImpl(com.ss.android.ugc.aweme.shortvideo.ai aiVar) {
        if (!(aiVar instanceof CreateAwemeResponse)) {
            return null;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) aiVar;
        if (createAwemeResponse.aweme == null) {
            return null;
        }
        com.ss.android.ugc.aweme.shortvideo.a aVar = new com.ss.android.ugc.aweme.shortvideo.a();
        aVar.aid = createAwemeResponse.aweme.getAid();
        aVar.captionStruct = com.ss.android.ugc.aweme.feed.x.g.e(createAwemeResponse.aweme);
        return aVar;
    }

    static final /* synthetic */ void lambda$getVideoCacheService$3$AVServiceProxyImpl(String str, com.ss.android.ugc.aweme.shortvideo.ai aiVar) {
        if (aiVar instanceof CreateAwemeResponse) {
            LocalVideoPlayerManager.a().a(str, ((CreateAwemeResponse) aiVar).aweme);
        }
    }
}

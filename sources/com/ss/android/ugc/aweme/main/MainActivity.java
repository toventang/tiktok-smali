package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.Toast;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ad;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.io.prefetcher.IoPrefetcher;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver;
import com.bytedance.tiktok.homepage.mainactivity.PreloadActicityTask;
import com.bytedance.tiktok.homepage.mainactivity.e;
import com.bytedance.tiktok.homepage.mainactivity.g;
import com.bytedance.tiktok.homepage.mainactivity.n;
import com.bytedance.tiktok.homepage.mainactivity.o;
import com.bytedance.tiktok.homepage.mainactivity.r;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.account.login.twostep.g;
import com.ss.android.ugc.aweme.activity.processor.t;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.activity.processor.y;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.at;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.bp;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.d.c;
import com.ss.android.ugc.aweme.d.d;
import com.ss.android.ugc.aweme.experiment.au;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.experiment.dl;
import com.ss.android.ugc.aweme.experiment.dv;
import com.ss.android.ugc.aweme.experiment.er;
import com.ss.android.ugc.aweme.experiment.eu;
import com.ss.android.ugc.aweme.experiment.fu;
import com.ss.android.ugc.aweme.experiment.k;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.q;
import com.ss.android.ugc.aweme.feed.i.ac;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.feed.i.p;
import com.ss.android.ugc.aweme.feed.i.q;
import com.ss.android.ugc.aweme.feed.i.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.q.ap;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.business.HomeToastTask;
import com.ss.android.ugc.aweme.homepage.business.a;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.logger.c;
import com.ss.android.ugc.aweme.m.a;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.a.a;
import com.ss.android.ugc.aweme.main.d;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.player.f;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.push.d;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.shortvideo.cb;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.ss.android.ugc.aweme.shortvideo.ui.ag;
import com.ss.android.ugc.aweme.t.b;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.JacocoUtils;
import com.ss.android.ugc.aweme.utils.aw;
import com.ss.android.ugc.aweme.utils.cm;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.utils.fc;
import com.ss.android.ugc.aweme.utils.ft;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.video.w;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends h implements f.c, com.ss.android.ugc.aweme.base.a.f, d, ap, a.AbstractC2797a, j, k, i, j {
    private static final String TAG = MainActivity.class.getSimpleName();
    private AdHomePageDataVM adHomePageDataVM;
    boolean allowWhenPush = true;
    private c asyncInflater;
    public d.a contextInfo;
    private final Object decorViewLock;
    private boolean firstCreated;
    public HomePageDataViewModel homeViewModel;
    private volatile Hox hoxInstance;
    private boolean isFirstLaunch = false;
    private volatile boolean isInited;
    private boolean isPaused = true;
    private AtomicBoolean lazyDoItCalled = new AtomicBoolean(false);
    private com.bytedance.tiktok.homepage.mainactivity.a mAccountObserver;
    private List<com.ss.android.ugc.aweme.base.a.a> mActivityOnKeyDownListeners;
    com.ss.android.ugc.aweme.homepage.a mActivityProxy = new com.ss.android.ugc.aweme.homepage.a();
    private b mActivityResultListener;
    private h mBinder;
    private final com.bytedance.tiktok.homepage.mainactivity.c mCommerceActivityObserver;
    private final com.bytedance.tiktok.homepage.mainactivity.d mCommonFeedActivityObserver;
    private final com.ss.android.ugc.aweme.compliance.api.c.c mComplianceBusinessActivityObserver;
    protected DataCenter mDataCenter;
    private final com.bytedance.tiktok.homepage.a mDialogRefactorContainer;
    private boolean mHasShownMandatoryLoginFromColdStart;
    private com.ss.android.ugc.aweme.friends.invite.b mInvitationReflowHelper;
    private boolean mIsFirstVisible = true;
    private final e mLegacyPlayerActivityObserver;
    private final com.bytedance.tiktok.homepage.mainactivity.f mLocalTestActivityObserver;
    private final g mLoginAndConsentObserver;
    private aq mMainHelper;
    private final com.bytedance.tiktok.homepage.mainactivity.h mMiniAppActivityObserver;
    private final com.bytedance.tiktok.homepage.mainactivity.i mNewUserGuideObserver;
    private final PerformanceActivityObserver mPerformanceActivityObserver;
    private boolean mRestartFromLogout = false;
    private bb mScrollSwitchHelper;
    private final bp mSocialActivityObserver;
    private SocialRecFriendsConditionViewModel mSocialRecFriendsConditionVM;
    private final o mToolsActivityObserver;
    private IUgCommonService mUgCommonService;
    private final r mUserGrowthActivityObserver;
    private com.ss.android.ugc.aweme.ca.i mViewInflaterOpt;
    private final as mainLifecycleRegistryWrapper;
    private int pageType;
    private IAVPublishService.OnPublishCallback processedCallback;
    private Resources resource;
    private final com.ss.android.ugc.aweme.homepage.ui.a.b scrollBasicChecker;
    private final com.ss.android.ugc.aweme.homepage.ui.a.c scrollFullChecker;
    private boolean showToast = false;
    private ScrollSwitchStateManager stateManager;
    private n tikTokToolsObserver = new n(this);

    public static int com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    private static Object com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private androidx.fragment.app.e getActivity() {
        return this;
    }

    static final /* synthetic */ com.bytedance.ies.foundation.base.a lambda$null$4$MainActivity(x xVar) {
        return xVar;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(15, new org.greenrobot.eventbus.g(MainActivity.class, "onSettingsDoneEvent", com.ss.android.ugc.aweme.compliance.api.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(16, new org.greenrobot.eventbus.g(MainActivity.class, "onScrollToProfileEvent", ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(17, new org.greenrobot.eventbus.g(MainActivity.class, "onHideLivePopupWindowEvent", com.ss.android.ugc.aweme.push.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(18, new org.greenrobot.eventbus.g(MainActivity.class, "onVideoPageChangeEvent", u.class, ThreadMode.POSTING, 0, false));
        hashMap.put(19, new org.greenrobot.eventbus.g(MainActivity.class, "onScrollToDetailEvent", ac.class, ThreadMode.POSTING, 0, false));
        hashMap.put(20, new org.greenrobot.eventbus.g(MainActivity.class, "onPublishMessage", com.ss.android.ugc.aweme.story.model.b.class, ThreadMode.MAIN, -1, true));
        hashMap.put(21, new org.greenrobot.eventbus.g(MainActivity.class, "onMobEnterFromEvent", p.class, ThreadMode.POSTING, 0, false));
        hashMap.put(22, new org.greenrobot.eventbus.g(MainActivity.class, "onMobRequestIdEvent", q.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public View getVisionSearchRect() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public boolean hasRegistedResumeAction() {
        return false;
    }

    public boolean isDuoDevice() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public boolean isDuoDualMode() {
        return false;
    }

    public boolean isSwipeUpGuideShowing() {
        return false;
    }

    public boolean isUnderFamiliarTab() {
        return false;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public h getBinder() {
        return this.mBinder;
    }

    @Override // com.ss.android.ugc.aweme.main.a.a.AbstractC2797a
    public o getHelper() {
        return this.mScrollSwitchHelper;
    }

    @Override // com.ss.android.ugc.aweme.main.k
    public boolean getIsFirstLaunch() {
        return this.isFirstLaunch;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return this.mainLifecycleRegistryWrapper;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public aq getMainHelper() {
        return this.mMainHelper;
    }

    public IAVPublishService.OnPublishCallback getProcessedCallback() {
        return this.processedCallback;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.ap
    public boolean isPaused() {
        return this.isPaused;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$2$MainActivity() {
        com.ss.android.ugc.aweme.utils.p.a(this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$8$MainActivity() {
        g.a.a(this);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onPostResume() {
        super.onPostResume();
    }

    static final /* synthetic */ com.bytedance.ies.foundation.base.a lambda$null$3$MainActivity() {
        return new t();
    }

    static final /* synthetic */ com.bytedance.ies.foundation.base.a lambda$null$5$MainActivity() {
        return new y(false, false);
    }

    static final /* synthetic */ void lambda$onCreate$1$MainActivity() {
        com.bytedance.tiktok.homepage.mainpagefragment.notification.b.b();
        com.bytedance.tiktok.homepage.mainpagefragment.notification.b.a();
    }

    public Resources getOriginResources() {
        return super.getResources();
    }

    public boolean isInDiscoveryPage() {
        return isUnderSecondTab();
    }

    public void setAdScrollRightControl() {
        this.mCommerceActivityObserver.c();
    }

    static {
        Covode.recordClassIndex(69841);
    }

    private void createMainHelper() {
        aq aqVar = new aq(this);
        this.mMainHelper = aqVar;
        aqVar.c();
    }

    private void ensureLazyDoItFinallyCalled() {
        com.ss.android.b.a.a.a.a(new ac(this), 10000);
    }

    @Override // com.ss.android.ugc.aweme.d.d
    public c getInflater() {
        if (this.asyncInflater == null) {
            this.asyncInflater = new com.ss.android.ugc.aweme.profile.a(this);
        }
        return this.asyncInflater;
    }

    public TabChangeManager getTabChangeManager() {
        return TabChangeManager.a.a(getActivity());
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public boolean isUnderMainTab() {
        return "HOME".equals(getTabChangeManager().f109107d);
    }

    public boolean isUnderNearbyTab() {
        return "NEARBY".equals(getTabChangeManager().f109107d);
    }

    public boolean isUnderProfileTab() {
        return "USER".equals(getTabChangeManager().f109107d);
    }

    public boolean isUnderSecondTab() {
        return "DISCOVER".equals(getTabChangeManager().f109107d);
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public boolean isUnderThirdTab() {
        return "NOTIFICATION".equals(getTabChangeManager().f109107d);
    }

    @Override // com.ss.android.ugc.aweme.main.k
    public boolean mainPageOnFeed() {
        return this.stateManager.b("page_feed");
    }

    @Override // com.ss.android.ugc.aweme.main.k
    public void splashOverShowMandatoryLoginPage() {
        this.mLoginAndConsentObserver.a(false, this.pageType);
    }

    /* access modifiers changed from: private */
    /* renamed from: callLazyDoIt */
    public void bridge$lambda$0$MainActivity() {
        if (this.lazyDoItCalled.compareAndSet(false, true)) {
            b.i.a(1800).b(new r(this), com.ss.android.ugc.aweme.cw.g.c());
            lazyDoItMainThread();
        }
    }

    private void doFeedCachePre() {
        if (SettingsRequestServiceImpl.i().e() == 0) {
            com.ss.android.ugc.aweme.feed.cache.e.j();
        }
        if (SettingsRequestServiceImpl.i().f() == 2) {
            com.ss.android.ugc.aweme.feed.cache.e.b(true);
        }
    }

    private void doHoxInit() {
        a.b.f109011a.a("main_act_node_init_duration", false);
        this.hoxInstance = Hox.a.a(this);
        this.hoxInstance.a(this, new com.ss.android.ugc.aweme.node.a(this));
        a.b.f109011a.b("main_act_node_init_duration", false);
    }

    private String handleIntent() {
        String com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (TextUtils.isEmpty(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            return "HOME";
        }
        return com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    private boolean needHook() {
        if (Looper.getMainLooper() == Looper.myLooper() || !k.f90254c) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public Fragment getCurFragment() {
        if (getTabChangeManager() == null) {
            return null;
        }
        return getTabChangeManager().b();
    }

    public af getCurrentFeedRecommendFragment() {
        Fragment curFragment = getCurFragment();
        if (!(curFragment instanceof ae)) {
            return null;
        }
        z s = ((ae) curFragment).l();
        if (s instanceof af) {
            return (af) s;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public boolean isMainTabVisible() {
        if (!isUnderMainTab() || this.mScrollSwitchHelper == null || !this.stateManager.b("page_feed")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public void onFeedRecommendFragmentReady() {
        new f.c().b((w) new ReleaseWindowBackgroundTask(this)).a();
    }

    private void refreshWhenBack() {
        aj<Boolean> isUseBackRefresh = SharePrefCache.inst().getIsUseBackRefresh();
        if (isUseBackRefresh != null && isUseBackRefresh.c().booleanValue() && getTabChangeManager().b() != null && (getTabChangeManager().b() instanceof ae)) {
            ((ae) getTabChangeManager().b()).r();
        }
    }

    private void setAllowPrepareVideo() {
        if (SettingsRequestServiceImpl.i().f() != 0) {
            com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "MainActivity->setAllowPrepareVideo->return");
            return;
        }
        Intent intent = getIntent();
        boolean z = true;
        if (intent != null) {
            this.allowWhenPush = !intent.getBooleanExtra("from_notification", false);
        }
        if (this.adHomePageDataVM.f34657a || !this.allowWhenPush) {
            z = false;
        }
        com.ss.android.ugc.aweme.feed.cache.e.b(z);
    }

    public AssetManager getAssets() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            d.a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f109222a == null || this.contextInfo.a(this))) {
                return this.contextInfo.f109222a.getAssets();
            }
        }
        return super.getAssets();
    }

    public Resources.Theme getTheme() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            d.a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f109223b == null || this.contextInfo.a(this))) {
                return this.contextInfo.f109223b.getTheme();
            }
        }
        return super.getTheme();
    }

    @Override // com.ss.android.ugc.aweme.main.k
    public boolean isADShowing() {
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d || com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.e() || com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.homeViewModel.f99128k) || com.ss.android.ugc.aweme.commercialize.e.a.b.B(this.homeViewModel.f99128k)) {
            return true;
        }
        return false;
    }

    public Boolean isFollowFeed() {
        z s;
        Fragment curFragment = getCurFragment();
        if (curFragment == null || !(curFragment instanceof ae) || (s = ((ae) curFragment).l()) == null || !(s instanceof com.ss.android.ugc.aweme.feed.ui.p)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void lazyDoItMainThread() {
        if (!isDestroyed() && this.showToast && !this.adHomePageDataVM.a()) {
            l.d(this, "");
            new HomeToastTask().a(this);
            this.showToast = false;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        com.ss.android.ugc.aweme.homepage.story.container.c cVar;
        aq aqVar = this.mMainHelper;
        if (aqVar.b() || ((!com.ss.android.ugc.aweme.homepage.story.container.h.f99315c || com.ss.android.ugc.aweme.homepage.story.container.h.f99313a == null || (cVar = com.ss.android.ugc.aweme.homepage.story.container.h.f99313a) == null || !cVar.a()) && !aqVar.d())) {
            backRefreshStrategy();
        }
        this.mDataCenter.a("exitGuideView", (Object) false);
    }

    @Override // com.ss.android.ugc.aweme.main.j
    public void onKeyBack() {
        if (!this.mScrollSwitchHelper.b()) {
            if (getTabChangeManager().b() != null && (getTabChangeManager().b() instanceof com.ss.android.ugc.aweme.profile.ui.d.b)) {
                refreshWhenBack();
            }
            refreshWhenBack();
        }
    }

    private void feedOVVMainActivityCreate() {
        if (s.a().booleanValue()) {
            com.ss.android.ugc.aweme.feed.k.f93531e = SystemClock.elapsedRealtime();
            long j2 = 8000;
            if (er.a()) {
                Boolean value = er.f89960e.getValue();
                l.b(value, "");
                if (value.booleanValue()) {
                    int intValue = er.f89959d.getValue().intValue();
                    if (intValue == er.f89957b) {
                        j2 = 5000;
                    } else if (intValue == er.f89958c) {
                        j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                }
                m.a(com.ss.android.ugc.aweme.feed.l.f93555a, j2);
            }
        }
    }

    private void initContextInfo() {
        MethodCollector.i(2751);
        super.getAssets();
        super.getTheme();
        super.getResources();
        d.f109221c = true;
        synchronized (d.f109220b) {
            try {
                d.a aVar = d.f109220b.get(this);
                if (aVar == null) {
                    aVar = new d.a();
                    aVar.f109224c = getOriginResources().getConfiguration();
                    aVar.f109222a = d.a(this);
                    d.f109220b.put(this, aVar);
                }
                try {
                    Method declaredMethod = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]);
                    declaredMethod.setAccessible(true);
                    aVar.f109223b = new ContextThemeWrapper(this, ((Integer) declaredMethod.invoke(this, new Object[0])).intValue());
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    e2.printStackTrace();
                }
                this.contextInfo = aVar;
            } finally {
                MethodCollector.o(2751);
            }
        }
    }

    private void setStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024 | 256);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            getWindow().addFlags(67108864);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public Resources getResources() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            d.a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f109222a == null || this.contextInfo.a(this))) {
                return this.contextInfo.f109222a.getResources();
            }
        }
        if (!((Boolean) com.ss.android.ugc.aweme.lego.b.b.f107420e.getValue()).booleanValue()) {
            return super.getResources();
        }
        if (this.resource == null) {
            this.resource = super.getResources();
        }
        return this.resource;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        overridePendingTransition(0, 0);
        this.isPaused = true;
        a.b.f109011a.f109002c = false;
        com.ss.android.ugc.aweme.logger.c.f109013a = false;
        if (!c.a.f109017b) {
            c.a.f109017b = true;
            com.bytedance.ies.ugc.appcontext.f.g().d(com.ss.android.ugc.aweme.logger.d.f109019a);
        }
        super.onPause();
        if (com.bytedance.ies.abmock.b.a().a(true, "is_record_last_network_speed_enabled", true)) {
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            inst.getLastUsableNetworkSpeed().b(Integer.valueOf((int) com.ss.android.ugc.h.g.e().d()));
        }
        this.mComplianceBusinessActivityObserver.c();
        this.mCommerceActivityObserver.f44147e.onPause();
        com.ss.android.ugc.aweme.feed.cache.e.f92700l.getValue();
        try {
            if (dv.f89848a > 0) {
                dv.a(dv.f89849b, System.currentTimeMillis() - dv.f89848a, "background");
            }
        } catch (Throwable unused) {
        }
        JacocoUtils.uploadCoverageFileNow();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        a.b.f109011a.f109002c = false;
        com.ss.android.ugc.aweme.logger.c.f109013a = false;
        LocalVideoPlayerManager.a().b();
        g.a.f99786a.f99780b = false;
        if (!com.aweme.storage.c.f5954a) {
            b.i.b(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE  
                  (wrap: com.aweme.storage.c$1 : 0x0022: CONSTRUCTOR  (r1v3 com.aweme.storage.c$1) = 
                  (wrap: android.content.Context : 0x001c: INVOKE  (r0v9 android.content.Context) = (r3v0 'this' com.ss.android.ugc.aweme.main.MainActivity A[IMMUTABLE_TYPE, THIS]) type: STATIC call: com.aweme.storage.c.a(android.content.Context):android.content.Context)
                 call: com.aweme.storage.c.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                  (wrap: java.util.concurrent.ExecutorService : 0x0025: INVOKE  (r0v10 java.util.concurrent.ExecutorService) =  type: STATIC call: com.ss.android.ugc.aweme.cw.g.a():java.util.concurrent.ExecutorService)
                 type: STATIC call: b.i.b(java.util.concurrent.Callable, java.util.concurrent.Executor):b.i in method: com.ss.android.ugc.aweme.main.MainActivity.onStop():void, file: classes8.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r1v3 com.aweme.storage.c$1) = 
                  (wrap: android.content.Context : 0x001c: INVOKE  (r0v9 android.content.Context) = (r3v0 'this' com.ss.android.ugc.aweme.main.MainActivity A[IMMUTABLE_TYPE, THIS]) type: STATIC call: com.aweme.storage.c.a(android.content.Context):android.content.Context)
                 call: com.aweme.storage.c.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.main.MainActivity.onStop():void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.aweme.storage.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.bytedance.helios.sdk.utils.a.d(r3)
                super.onStop()
                com.ss.android.ugc.aweme.logger.a r0 = com.ss.android.ugc.aweme.logger.a.b.f109011a
                r1 = 0
                r0.f109002c = r1
                com.ss.android.ugc.aweme.logger.c.f109013a = r1
                com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager r0 = com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.a()
                r0.b()
                com.ss.android.ugc.aweme.i18n.language.a.g r0 = com.ss.android.ugc.aweme.i18n.language.a.g.a.f99786a
                r0.f99780b = r1
                boolean r0 = com.aweme.storage.c.f5954a
                if (r0 != 0) goto L_0x002c
                android.content.Context r0 = com.aweme.storage.c.a(r3)
                com.aweme.storage.c$1 r1 = new com.aweme.storage.c$1
                r1.<init>(r0)
                java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.cw.g.a()
                b.i.b(r1, r0)
            L_0x002c:
                com.bytedance.tiktok.homepage.mainactivity.o r0 = r3.mToolsActivityObserver
                androidx.fragment.app.e r2 = r0.f44178a
                if (r2 == 0) goto L_0x0036
                boolean r0 = com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask.f107753a
                if (r0 == 0) goto L_0x0043
            L_0x0036:
                com.ss.android.ugc.aweme.requesttask.idle.a.a()
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.service.c> r0 = com.ss.android.ugc.aweme.service.c.class
                r1.getService(r0)
                return
            L_0x0043:
                android.app.Activity r0 = com.bytedance.ies.ugc.appcontext.f.j()
                if (r0 != 0) goto L_0x0036
                com.ss.android.ugc.aweme.legoImp.task.c r1 = new com.ss.android.ugc.aweme.legoImp.task.c
                r1.<init>(r2)
                java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.cw.g.c()
                b.i.b(r1, r0)
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.onStop():void");
        }

        public void refreshSlideSwitchCanScrollRight() {
            if (this.mScrollSwitchHelper != null) {
                Fragment b2 = getTabChangeManager().b();
                if (b2 == null || !(b2 instanceof ae)) {
                    this.stateManager.a(this.scrollFullChecker);
                    return;
                }
                z zVar = (z) this.stateManager.c();
                if (zVar instanceof i) {
                    i iVar = (i) zVar;
                    if ("FeedFollowFragment".equals(iVar.w()) || "FeedLearnFragment".equals(iVar.w()) || "FeedRecommendFragment".equals(iVar.w())) {
                        setAdScrollRightControl();
                        return;
                    }
                }
                this.stateManager.a(this.scrollFullChecker);
            }
        }

        public MainActivity() {
            com.ss.android.ugc.aweme.homepage.ui.a.b bVar = new com.ss.android.ugc.aweme.homepage.ui.a.b(this);
            this.scrollBasicChecker = bVar;
            this.scrollFullChecker = new com.ss.android.ugc.aweme.homepage.ui.a.c(this, bVar);
            com.bytedance.tiktok.homepage.a aVar = new com.bytedance.tiktok.homepage.a(this);
            this.mDialogRefactorContainer = aVar;
            com.bytedance.tiktok.homepage.mainactivity.i iVar = new com.bytedance.tiktok.homepage.mainactivity.i(this);
            this.mNewUserGuideObserver = iVar;
            this.mUserGrowthActivityObserver = new r(this);
            this.mMiniAppActivityObserver = new com.bytedance.tiktok.homepage.mainactivity.h(this);
            this.mLegacyPlayerActivityObserver = new e(this);
            this.mComplianceBusinessActivityObserver = ComplianceBusinessServiceImpl.k().a(this);
            this.mSocialActivityObserver = ProfileServiceImpl.g().a((Activity) this);
            this.mCommonFeedActivityObserver = new com.bytedance.tiktok.homepage.mainactivity.d(this);
            this.mToolsActivityObserver = new o(this, aVar);
            this.mPerformanceActivityObserver = new PerformanceActivityObserver();
            this.mLocalTestActivityObserver = new com.bytedance.tiktok.homepage.mainactivity.f(this);
            this.mCommerceActivityObserver = new com.bytedance.tiktok.homepage.mainactivity.c(this, iVar);
            this.mLoginAndConsentObserver = new com.bytedance.tiktok.homepage.mainactivity.g(this);
            this.mInvitationReflowHelper = com.ss.android.ugc.aweme.friends.service.a.f97047a.a((androidx.fragment.app.e) this);
            this.mActivityResultListener = null;
            this.mViewInflaterOpt = new com.ss.android.ugc.aweme.ca.i();
            this.decorViewLock = new Object();
            this.mUgCommonService = UgCommonServiceImpl.j();
            this.isInited = false;
            this.contextInfo = null;
            this.resource = null;
            this.processedCallback = new IAVPublishService.OnPublishCallback() {
                /* class com.ss.android.ugc.aweme.main.MainActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69842);
                }

                @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback
                public final void onStopPublish() {
                }

                @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback
                public final void onStartPublish(h hVar) {
                    MainActivity mainActivity;
                    com.ss.android.ugc.aweme.promote.b a2 = com.ss.android.ugc.aweme.promote.b.a();
                    MainActivity mainActivity2 = MainActivity.this;
                    int c2 = hVar.c();
                    if (mainActivity2 != null && !mainActivity2.isFinishing() && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                        if (com.ss.android.ugc.aweme.promote.b.f118128a != null) {
                            com.ss.android.ugc.aweme.promote.b.f118128a.dismiss();
                            com.ss.android.ugc.aweme.promote.b.f118128a = null;
                        }
                        if (a2.f118132c == null || mainActivity2 != a2.f118132c.get()) {
                            a2.f118132c = new WeakReference<>(mainActivity2);
                        }
                        WeakHandler weakHandler = a2.f118131b;
                        if (DateUtils.isToday(com.ss.android.ugc.aweme.promote.b.b().getLong("last_pop_time_".concat(String.valueOf(com.ss.android.ugc.aweme.account.b.g().getCurUserId())), 0))) {
                            a2.c();
                        } else {
                            PopupSettingManager.a.f123158a.a(weakHandler, 2, c2);
                        }
                    }
                    MainActivity mainActivity3 = MainActivity.this;
                    int c3 = hVar.c();
                    l.d(mainActivity3, "");
                    if (!mainActivity3.isFinishing()) {
                        com.ss.android.ugc.aweme.ug.amplify.a.f141714a = new WeakReference<>(mainActivity3);
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g2, "");
                        if (g2.isLogin() && com.ss.android.ugc.aweme.ug.h.b.a()) {
                            PopupSettingManager.a.f123158a.a(com.ss.android.ugc.aweme.ug.amplify.a.f141715b, 3, c3);
                        }
                    }
                    if (!com.ss.android.ugc.aweme.aq.a.a.a() && (mainActivity = MainActivity.this) != null && !mainActivity.isFinishing() && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                        if (com.ss.android.ugc.aweme.promote.g.f118163a != null) {
                            com.ss.android.ugc.aweme.promote.g.f118163a.dismiss();
                            com.ss.android.ugc.aweme.promote.g.f118163a = null;
                        }
                        Boolean c4 = SharePrefCache.inst().getPromoteDialogShouldShow().c();
                        if (c4 != null && c4.booleanValue()) {
                            String string = com.ss.android.ugc.aweme.promote.g.a().getString("uid", "");
                            String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                            if (TextUtils.isEmpty(string)) {
                                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.promote.g.a().edit();
                                edit.putString("uid", curUserId);
                                edit.apply();
                                string = curUserId;
                            }
                            if (!string.equals(curUserId)) {
                                SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.promote.g.a().edit();
                                edit2.putBoolean("joined", false);
                                edit2.putString("uid", curUserId);
                                edit2.putInt("popup_times", 0);
                                edit2.putLong("popup_last_time", 0);
                                edit2.apply();
                            }
                            if (!com.ss.android.ugc.aweme.promote.g.a().getBoolean("joined", false)) {
                                int i2 = com.ss.android.ugc.aweme.promote.g.a().getInt("popup_times", 0);
                                long j2 = com.ss.android.ugc.aweme.promote.g.a().getLong("popup_last_time", 0);
                                Integer c5 = SharePrefCache.inst().getPromoteDialogPopupPopupInterval().c();
                                if (i2 < SharePrefCache.inst().getPromoteDialogPopupTimesLimit().c().intValue() && System.currentTimeMillis() - j2 > ((long) (c5.intValue() * 1000 * 3600 * 24))) {
                                    SharedPreferences.Editor edit3 = com.ss.android.ugc.aweme.promote.g.a().edit();
                                    edit3.putInt("popup_times", i2 + 1);
                                    edit3.putLong("popup_last_time", System.currentTimeMillis());
                                    edit3.apply();
                                    com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 52.0f);
                                    com.ss.android.ugc.aweme.promote.e eVar = new com.ss.android.ugc.aweme.promote.e(mainActivity, "");
                                    com.ss.android.ugc.aweme.promote.g.f118163a = eVar;
                                    eVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                        /* class com.ss.android.ugc.aweme.promote.g.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(76738);
                                        }

                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            SharePrefCache.inst().getShowPromoteLicense().b(0);
                                            g.f118163a = null;
                                        }
                                    });
                                    com.ss.android.ugc.aweme.common.r.a("creative_permission_show", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                                    com.ss.android.ugc.aweme.promote.g.f118163a.show();
                                }
                            }
                        }
                    }
                }
            };
            this.mainLifecycleRegistryWrapper = new as(this);
        }

        private void backRefreshStrategy() {
            com.ss.android.ugc.aweme.common.r.a("press_back", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", getTabChangeManager().f109107d).f66730a);
            int a2 = com.bytedance.ies.abmock.b.a().a(false, "back_refresh_strategy", 0);
            if (a2 != 0) {
                if (this.mMainHelper.f109165a) {
                    this.mMainHelper.f109165a = false;
                } else if (!this.mDialogRefactorContainer.f44111b.a("swipe_up_guide")) {
                    if (!isUnderMainTab()) {
                        this.mDataCenter.a("performClickTab", "HOME");
                        Fragment b2 = getTabChangeManager().b();
                        if (b2 != null && (b2 instanceof ae)) {
                            ae aeVar = (ae) b2;
                            if (!aeVar.m()) {
                                aeVar.d(1);
                            }
                            if (a2 == 1) {
                                aeVar.r();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Fragment b3 = getTabChangeManager().b();
                    if (b3 != null && (b3 instanceof ae)) {
                        ae aeVar2 = (ae) b3;
                        if (!aeVar2.m()) {
                            aeVar2.d(1);
                        }
                        if (a2 == 1) {
                            aeVar2.r();
                        }
                    }
                }
            }
        }

        private void onStartUp() {
            HomePageDataViewModel homePageDataViewModel;
            MethodCollector.i(3062);
            if (com.ss.android.ugc.aweme.s.f.a() && (homePageDataViewModel = this.homeViewModel) != null) {
                Message message = homePageDataViewModel.f99122e;
                Bundle data = message.getData();
                if (data.getBoolean("is_from_feed_cache", false) && (message.obj instanceof FeedItemList)) {
                    com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "cache feed message's bundle on focus change:" + data + ",@" + data.hashCode());
                    Handler target = message.getTarget();
                    if (target != null) {
                        if (com.ss.android.ugc.aweme.s.f.c() && !data.getBoolean("has_used_feed_cache", false)) {
                            com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "cache feed message was send on focus change in animation experiment");
                            synchronized (data) {
                                try {
                                    data.putBoolean("has_used_feed_cache", true);
                                } catch (Throwable th) {
                                    MethodCollector.o(3062);
                                    throw th;
                                }
                            }
                            v.a(getWindow().getDecorView(), new s(target, message));
                        }
                        if (com.ss.android.ugc.aweme.s.f.b()) {
                            com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "cache feed message was send on focus change in async message experiment");
                            target.sendMessageAtFrontOfQueue(message);
                        }
                    }
                }
            }
            if (this.homeViewModel != null) {
                com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("FeedCacheLoader", "notifyCallback");
                com.ss.android.ugc.aweme.feed.cache.c.c(this.homeViewModel.f99121d);
            }
            MethodCollector.o(3062);
        }

        @Override // com.ss.android.ugc.aweme.main.j
        public String getEnterFrom() {
            String e2;
            ae aeVar;
            z s;
            com.bytedance.hox.d a2 = Hox.a.a(this).a();
            String str = "";
            if (!(a2 == null || (e2 = a2.e()) == null)) {
                str = e2;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (getTabChangeManager() != null && !TextUtils.isEmpty(getTabChangeManager().f109107d)) {
                String str2 = getTabChangeManager().f109107d;
                if (TextUtils.equals(str2, "HOME")) {
                    Fragment b2 = getTabChangeManager().b();
                    if (!(!(b2 instanceof ae) || (aeVar = (ae) b2) == null || (s = aeVar.l()) == null)) {
                        if (s instanceof com.ss.android.ugc.aweme.feed.ui.p) {
                            return "homepage_follow";
                        }
                        if (s instanceof af) {
                            return "homepage_hot";
                        }
                    }
                } else if (TextUtils.equals(str2, "DISCOVER")) {
                    return "discovery";
                } else {
                    if (TextUtils.equals(str2, "NOTIFICATION")) {
                        return "notification_page";
                    }
                    if (TextUtils.equals(str2, "USER")) {
                        if (getTabChangeManager().b() instanceof com.ss.android.ugc.aweme.profile.ui.v2.i) {
                            return "others_homepage";
                        }
                        if (getTabChangeManager().b() instanceof com.ss.android.ugc.aweme.metrics.s) {
                            return ((com.ss.android.ugc.aweme.metrics.s) getTabChangeManager().b()).f();
                        }
                        return "personal_homepage";
                    }
                }
            }
            return "homepage_hot";
        }

        /* access modifiers changed from: protected */
        public void lazyDoIt() {
            int i2;
            this.mCommonFeedActivityObserver.a();
            this.mSocialActivityObserver.b();
            o oVar = this.mToolsActivityObserver;
            com.ss.android.ugc.aweme.shortvideo.festival.n.a().b();
            AVExternalServiceImpl.a().abnormalExitLogService().logAppAbnormalExit();
            if (!oVar.f44180c) {
                AVExternalServiceImpl.a().publishService().tryRestorePublish(oVar.f44178a, new com.bytedance.tiktok.homepage.mainactivity.q(oVar));
            }
            int i3 = 0;
            if (SharePrefCache.inst().getLastPublishFailed() != null && SharePrefCache.inst().getLastPublishFailed().c().booleanValue()) {
                new com.bytedance.tux.g.b(oVar.f44178a).e(R.string.cv2).b();
                SharePrefCache.inst().getLastPublishFailed().b(false);
            }
            this.mCommonFeedActivityObserver.a();
            this.mUgCommonService.d(this);
            r rVar = this.mUserGrowthActivityObserver;
            if (v.y(rVar.f44187a.getWindow().getDecorView()) && com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                com.bytedance.ies.foundation.activity.a aVar = rVar.f44187a;
                l.d(aVar, "");
                Window window = aVar.getWindow();
                l.b(window, "");
                View decorView = window.getDecorView();
                l.b(decorView, "");
                if (fc.a(decorView) != fc.a(decorView.findViewById(16908290))) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("virtual_bar_status", i2);
                com.bytedance.ies.foundation.activity.a aVar2 = rVar.f44187a;
                l.d(aVar2, "");
                boolean hasPermanentMenuKey = ViewConfiguration.get(aVar2).hasPermanentMenuKey();
                boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
                boolean deviceHasKey2 = KeyCharacterMap.deviceHasKey(3);
                if (hasPermanentMenuKey || (deviceHasKey && deviceHasKey2)) {
                    i3 = 1;
                }
                com.ss.android.ugc.aweme.common.r.a("system_navigation_bar_status", a2.a("physical_bar_status", i3).a("tappable_element_insets", fc.c(rVar.f44187a)).f66730a);
            }
            RuntimeBehaviorServiceImpl.c().a(rVar.f44187a);
            if (!rVar.f44187a.isDestroyed()) {
                rVar.f44188b = new com.ss.android.ugc.trill.g.a();
                r.a(rVar.f44187a, rVar.f44188b, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                rVar.f44190d = true;
            }
            rVar.f44189c = new at();
            if (rVar.f44187a.getApplication() != null) {
                rVar.f44189c.a(rVar.f44187a.getApplication());
            }
        }

        @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
        public void onDestroy() {
            com.bytedance.helios.sdk.utils.a.e(this);
            if (au.a()) {
                this.mViewInflaterOpt.a();
            }
            if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                com.ss.android.ugc.aweme.logger.c.f109013a = true;
                com.ss.android.ugc.aweme.logger.c.f109014b = 0;
            }
            if (com.ss.android.ugc.aweme.story.c.b.c() && com.ss.android.ugc.aweme.story.g.f137757a.k() == hashCode()) {
                com.ss.android.ugc.aweme.story.g.f137757a.j();
                com.ss.android.ugc.aweme.story.userstory.mine.a.f138515a = null;
            }
            r rVar = this.mUserGrowthActivityObserver;
            if (rVar.f44190d) {
                rVar.f44187a.unregisterReceiver(rVar.f44188b);
            }
            if (!(rVar.f44189c == null || rVar.f44187a.getApplication() == null)) {
                rVar.f44189c.b(rVar.f44187a.getApplication());
            }
            n nVar = this.tikTokToolsObserver;
            if (EventBus.a().a(nVar.f44176a)) {
                EventBus.a().b(nVar.f44176a);
            }
            com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("winter", "onDestroy start");
            super.onDestroy();
            l.d(this, "");
            com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("winter", "onDestroy end");
            if (com.ss.android.ugc.aweme.experiment.e.f89880b) {
                X2CAdWebPage x2CAdWebPage = (X2CAdWebPage) com.ss.android.ugc.aweme.lego.f.b(X2CAdWebPage.class);
                com.ss.android.ugc.aweme.crossplatform.activity.v.a().f78578b.clear();
                x2CAdWebPage.f76028d.clear();
                x2CAdWebPage.f76025a = null;
                x2CAdWebPage.f76026b = null;
            }
            da.f142806a.clear();
            com.ss.android.ugc.aweme.ca.c.b();
            com.a.b.c.a("profile_fragment_user_mt");
            com.a.b.c.a("profile_fragment_aweme_list_mus");
            com.a.b.c.a("aweme_comment_fragment_comment_list");
            com.a.b.c.a("detail_feed_activity_video_detail");
            com.a.b.c.a("detail_feed_fragment_detail_page");
            com.a.b.c.a("detail_feed_insights_bottom");
            com.a.b.c.a("detail_feed_video_seek_bar");
            com.a.b.c.a("aweme_comment_fragment_input_detail");
            if (k.f90253b) {
                com.a.b.c.a((Context) null);
            }
            com.ss.android.ugc.aweme.cc.d.f69804c = true;
            com.ss.android.ugc.aweme.report.d.f120585f = true;
            this.mCommerceActivityObserver.f44147e.onDestroy();
            FeedAdServiceImpl.c().b().c();
            androidx.fragment.app.e eVar = this.mLegacyPlayerActivityObserver.f44150a;
            if (com.ss.android.ugc.aweme.m.a.f109044c) {
                try {
                    eVar.unregisterReceiver(com.ss.android.ugc.aweme.m.a.f109045d);
                    com.ss.android.ugc.aweme.m.a.f109045d = null;
                    com.ss.android.ugc.aweme.m.a.f109044c = false;
                } catch (Exception unused) {
                }
            }
            com.ss.android.ugc.aweme.player.f.f115097a.a();
            if (com.ss.android.ugc.aweme.player.f.f115100d != null) {
                f.a.g.b<Long> bVar = com.ss.android.ugc.aweme.player.f.f115100d;
                if (bVar == null) {
                    l.b();
                }
                bVar.dispose();
                com.ss.android.ugc.aweme.player.f.f115100d = null;
            }
            com.ss.android.ugc.aweme.video.v.O().C();
            com.ss.ttvideoengine.aj.a();
            com.ss.android.ugc.aweme.player.f.f115098b = false;
            w.a.f144009a.f144008a.size();
            com.bytedance.tiktok.homepage.a aVar = this.mDialogRefactorContainer;
            EventBus.a().b(aVar);
            aVar.f44110a = null;
            if (aVar.f44112c != null) {
                aVar.f44112c.removeCallbacksAndMessages(null);
            }
            com.ss.android.ugc.aweme.feed.adapter.b.f91650m = 0;
            MLCommonService.instance().runInMainActivityOnDestroy();
            this.mComplianceBusinessActivityObserver.d();
            com.bytedance.tiktok.homepage.mainactivity.a aVar2 = this.mAccountObserver;
            EventBus.a().b(aVar2);
            com.ss.android.ugc.aweme.account.b.a();
            com.ss.android.ugc.aweme.account.b.f62864a.b(aVar2.f44135b);
            com.ss.android.ugc.aweme.account.login.twostep.g gVar = com.ss.android.ugc.aweme.account.login.twostep.g.f63916e;
            if (gVar != null) {
                gVar.dismiss();
            }
            com.ss.android.ugc.aweme.account.login.twostep.g.f63916e = null;
            androidx.lifecycle.af viewModelStore = getViewModelStore();
            if (viewModelStore != null) {
                viewModelStore.a();
            }
            if (bv.a() != 0) {
                com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(true, q.a.f93156a));
            }
            com.ss.android.ugc.aweme.ca.g.f69604a.clear();
        }

        @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
        public void onResume() {
            com.ss.android.ugc.aweme.account.login.twostep.g gVar;
            com.bytedance.helios.sdk.utils.a.b(this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
            if (c.a.f109018c) {
                c.a.f109018c = false;
                c.a.a(3);
            }
            a.b.f109011a.b("cold_boot_main_create_to_resume", true);
            aw.b("cold_boot_main_create_to_resume");
            a.b.f109011a.a("cold_boot_main_resume_duration", true);
            aw.a("cold_boot_main_resume_duration");
            this.isPaused = false;
            super.onResume();
            if (com.ss.android.ugc.aweme.feed.k.f93531e != -1) {
                com.ss.android.ugc.aweme.feed.k.f93532f = SystemClock.elapsedRealtime() - com.ss.android.ugc.aweme.feed.k.f93531e;
                com.ss.android.ugc.aweme.feed.k.f93531e = -1;
                if (com.ss.android.ugc.aweme.feed.k.f93537k != null) {
                    for (Runnable runnable : com.ss.android.ugc.aweme.feed.k.f93537k) {
                        com.ss.android.b.a.a.a.a(runnable);
                    }
                    com.ss.android.ugc.aweme.feed.k.f93537k.clear();
                    com.ss.android.ugc.aweme.feed.k.f93537k = null;
                }
            }
            com.ss.android.ugc.aweme.framework.a.a.a("ProcessPublish tryProcessPublish onResume");
            this.mComplianceBusinessActivityObserver.b();
            com.bytedance.tiktok.homepage.mainactivity.c cVar = this.mCommerceActivityObserver;
            AVExternalServiceImpl.a().publishService().resetNewCreateWay();
            cVar.f44147e.onResume();
            MainLooperOptService.b(MainLooperOptService.a.WATCH_ON_MEASURE);
            if (!isADShowing()) {
                this.mUgCommonService.b().a(this, false, "");
            }
            this.firstCreated = false;
            this.mUgCommonService.b((com.bytedance.ies.foundation.activity.a) this);
            com.ss.android.ugc.aweme.account.login.twostep.g gVar2 = com.ss.android.ugc.aweme.account.login.twostep.g.f63916e;
            if (gVar2 != null && gVar2.f63919c && cj.f71084b.m().getTwoStepVerificationStatusFromLocal() == 1 && (gVar = com.ss.android.ugc.aweme.account.login.twostep.g.f63916e) != null) {
                gVar.dismiss();
            }
            this.mInvitationReflowHelper.a();
            n nVar = this.tikTokToolsObserver;
            IReplaceMusicService a2 = ReplaceMusicServiceImpl.a();
            if (a2.getClickPost()) {
                if (!EventBus.a().a(nVar.f44176a)) {
                    EventBus.a(EventBus.a(), nVar.f44176a);
                }
                a2.setClickPost(false);
                new com.bytedance.tux.g.b(nVar.f44177b).e(R.string.fdd).b();
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getApplicationService().a(nVar.f44177b);
                a2.doRequest(a2.getCover(), a2.getReplaceMusicRequest(), nVar.f44177b);
            }
            com.ss.android.ugc.aweme.bp.e.a();
            com.ss.android.ugc.aweme.bp.e.f68748c = false;
            ServiceManager.get().getService(com.ss.android.ugc.aweme.service.c.class);
            ServiceManager.get().getService(com.ss.android.ugc.aweme.service.c.class);
            a.b.f109011a.b("cold_boot_main_resume_duration", true);
            aw.b("cold_boot_main_resume_duration");
            a.b.f109011a.a("cold_boot_main_resume_to_measure", false);
            aw.a("cold_boot_main_resume_to_measure");
            a.b.f109011a.a("cold_boot_main_resume_to_focus", true);
            aw.a("cold_boot_main_resume_to_focus");
            a.b.f109011a.a("cold_boot_resume_to_mainpage_create_view", false);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
        }

        @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
        public void onSettingsDoneEvent(com.ss.android.ugc.aweme.compliance.api.b.b bVar) {
            com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g = false;
        }

        @Override // com.ss.android.ugc.aweme.base.a.f
        public void setActivityResultListener(b bVar) {
            this.mActivityResultListener = bVar;
        }

        public static Bundle com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ b.i lambda$callLazyDoIt$9$MainActivity(b.i iVar) {
            lazyDoIt();
            return null;
        }

        @org.greenrobot.eventbus.r
        public void onMobEnterFromEvent(p pVar) {
            this.homeViewModel.a(pVar.f93488a);
        }

        @org.greenrobot.eventbus.r
        public void onMobRequestIdEvent(com.ss.android.ugc.aweme.feed.i.q qVar) {
            this.homeViewModel.f99127j = qVar.f93489a;
        }

        @Override // com.ss.android.ugc.aweme.base.a.g
        public void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
            List<com.ss.android.ugc.aweme.base.a.a> list = this.mActivityOnKeyDownListeners;
            if (list != null) {
                list.remove(aVar);
            }
        }

        public static Context com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public static Intent getMainActivityIntent(Context context) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            return intent;
        }

        private void setupSlideSwitchLayout(String str) {
            if ("DISCOVER".equals(str)) {
                this.stateManager.a(false);
            }
        }

        public void changeTabAfterPublish(int i2) {
            this.mDataCenter.a("changeTabAfterPublish", Integer.valueOf(i2));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onCreate$7$MainActivity(Bundle bundle) {
            this.mToolsActivityObserver.a(bundle, this.mDataCenter, this.mNewUserGuideObserver);
        }

        @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            this.mUgCommonService.c(this);
        }

        @org.greenrobot.eventbus.r
        public void onScrollToDetailEvent(ac acVar) {
            if (acVar != null && this.mScrollSwitchHelper != null) {
                this.homeViewModel.a(acVar.f93445a);
            }
        }

        @Override // com.ss.android.ugc.aweme.main.j
        public void setTabBackground(boolean z) {
            this.mDataCenter.a("setTabBackground", Boolean.valueOf(z));
        }

        @Override // com.ss.android.ugc.aweme.main.k
        public void setVpEnableDispatchTouchEventCheck(boolean z) {
            ScrollableViewPager scrollableViewPager = this.mActivityProxy.f99103d;
            if (scrollableViewPager != null) {
                scrollableViewPager.setEnableDispatchTouchEventCheck(z);
            }
        }

        private void changeTag(String str) {
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68532d);
            Hox.a.a(this).b(str, bundle);
        }

        @Override // com.ss.android.ugc.aweme.base.a.g
        public void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
            if (this.mActivityOnKeyDownListeners == null) {
                this.mActivityOnKeyDownListeners = new ArrayList();
            }
            if (!this.mActivityOnKeyDownListeners.contains(aVar)) {
                this.mActivityOnKeyDownListeners.add(aVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.main.k
        public void allowSwipeLeft(boolean z) {
            if (!z) {
                this.stateManager.a(this.scrollFullChecker);
            } else if (Hox.a.a(this).b("HOME")) {
                this.stateManager.a(this.scrollBasicChecker);
            } else {
                this.stateManager.a(this.scrollFullChecker);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.framework.a.a.a(th);
                com.ss.android.ugc.aweme.app.n.a("main_activity_dispatch_error", "", new com.ss.android.ugc.aweme.app.f.c().a("message", th.getMessage()).a());
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
            if (r4.f138039e != false) goto L_0x0027;
         */
        @org.greenrobot.eventbus.r(a = org.greenrobot.eventbus.ThreadMode.MAIN, b = true, c = -1)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPublishMessage(com.ss.android.ugc.aweme.story.model.b r4) {
            /*
                r3 = this;
                int r1 = r4.f138035a
                r0 = -1
                if (r1 == r0) goto L_0x0027
                r0 = 1
                if (r1 == r0) goto L_0x0023
                r0 = 2
                if (r1 == r0) goto L_0x0013
            L_0x000b:
                org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.a()
                r0.f(r4)
                return
            L_0x0013:
                com.ss.android.ugc.aweme.ug.IUgCommonService r0 = r3.mUgCommonService
                com.ss.android.ugc.aweme.ug.c r1 = r0.a()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f138038d
                java.lang.String r0 = r0.getAid()
                r1.b(r0)
                goto L_0x000b
            L_0x0023:
                boolean r0 = r4.f138039e
                if (r0 == 0) goto L_0x000b
            L_0x0027:
                com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r2 = r3.stateManager
                r1 = 0
                java.lang.String r0 = "page_feed"
                r2.a(r0, r1)
                com.ss.android.ugc.aweme.ug.IUgCommonService r0 = r3.mUgCommonService
                com.ss.android.ugc.aweme.ug.c r2 = r0.a()
                r1 = 0
                java.lang.String r0 = "start_upload"
                r2.a(r0, r1)
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.onPublishMessage(com.ss.android.ugc.aweme.story.model.b):void");
        }

        public void onVideoPageChangeEventDelay(u uVar) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(uVar.f93493a) || !com.ss.android.ugc.aweme.commercialize.e.a.b.E(uVar.f93493a)) {
                com.ss.android.b.a.a.a.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.main.MainActivity.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(69843);
                    }

                    public final void run() {
                        Aweme aweme;
                        if (!MainActivity.this.isFinishing() && MainActivity.this.homeViewModel != null) {
                            HomePageDataViewModel homePageDataViewModel = MainActivity.this.homeViewModel;
                            Aweme aweme2 = MainActivity.this.homeViewModel.f99128k;
                            homePageDataViewModel.f99124g = aweme2;
                            if (aweme2 != null && (aweme = homePageDataViewModel.f99124g) != null) {
                                aweme.setIsPreloadScroll(false);
                            }
                        }
                    }
                }, 300);
            }
            setAdScrollRightControl();
            j.a.a().b(getActivity());
        }

        private void suitRouter(Intent intent) {
            Uri data;
            if (intent != null && (data = intent.getData()) != null) {
                String host = data.getHost();
                String path = data.getPath();
                if (("mine".equals(host) || "user/homepage".equals(host + path)) && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                    intent.putExtra("profile_from_scene", data.getQueryParameter("from_scene"));
                }
            }
        }

        @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.app.Activity
        public Object getSystemService(String str) {
            if (!au.a() || !TextUtils.equals("layout_inflater", str)) {
                return com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this, str);
            }
            if (getBaseContext() != null) {
                com.ss.android.ugc.aweme.ca.i iVar = this.mViewInflaterOpt;
                if (iVar.f69611b != null) {
                    String name = Thread.currentThread().getName();
                    LayoutInflater layoutInflater = iVar.f69610a.get(name);
                    if (layoutInflater == null) {
                        layoutInflater = iVar.a(this);
                        iVar.f69610a.put(name, layoutInflater);
                    }
                    if (layoutInflater != null) {
                        return layoutInflater;
                    }
                }
                return com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this, str);
            }
            throw new IllegalStateException("System services not available to Activities before onCreate()");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onCreate$0$MainActivity(androidx.appcompat.app.f fVar) {
            MethodCollector.i(3196);
            com.bytedance.common.jato.boost.g.a((int) Thread.currentThread().getId(), -20);
            synchronized (this.decorViewLock) {
                try {
                    a.b.f109011a.a("method_main_decorview_async_duration", false);
                    try {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(com.bytedance.monitor.collector.a.a.b(fVar.getClass(), "ensureSubDecor", new Class[0]), fVar, new Object[0]);
                    } catch (Exception e2) {
                        cm.a(e2, "ensureSubDecor", "MainActivity", "onCreate", "");
                        e2.printStackTrace();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3196);
                    throw th;
                }
            }
            a.b.f109011a.b("method_main_decorview_async_duration", false);
            MethodCollector.o(3196);
        }

        @org.greenrobot.eventbus.r
        public void onHideLivePopupWindowEvent(com.ss.android.ugc.aweme.push.b bVar) {
            com.ss.android.ugc.aweme.push.d a2 = d.a.a();
            if (a2.a() != null && a2.a().isShowing()) {
                com.ss.android.ugc.aweme.push.e a3 = a2.a();
                com.ss.android.ugc.aweme.push.f.a(a3.f118904m.booleanValue(), a3.f118899h, a3.f118901j, "ad", a3.f118902k, a3.f118903l, a3.f118900i);
                com.ss.android.ugc.aweme.push.f.a(a3.f118899h, a3.f118901j, a3.f118903l, "Android", a3.f118898g, a3.n, a3.o, new StringBuilder().append(a3.f118892a).toString(), a3.p);
                a3.d();
            }
        }

        @org.greenrobot.eventbus.r
        public void onVideoPageChangeEvent(u uVar) {
            String str;
            if (uVar.f93493a != null) {
                String authorUid = uVar.f93493a.getAuthorUid();
                this.homeViewModel.f99128k = uVar.f93493a;
                String str2 = "";
                if (this.homeViewModel.f99128k != null) {
                    str = this.homeViewModel.f99128k.getAid();
                } else {
                    str = str2;
                }
                ah.f109484b = str;
                com.ss.android.ugc.aweme.metrics.b.f109530b = authorUid;
                if (this.homeViewModel.f99128k != null) {
                    str2 = this.homeViewModel.f99128k.getAid();
                }
                com.ss.android.ugc.aweme.metrics.b.f109529a = str2;
                if (!TextUtils.equals(this.homeViewModel.f99123f, authorUid)) {
                    this.homeViewModel.f99123f = authorUid;
                    com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("winter", "on video page change id = " + uVar.f93493a.getAid());
                    com.bytedance.tiktok.homepage.mainactivity.c cVar = this.mCommerceActivityObserver;
                    cVar.f44147e.onVideoPageChangeEvent(uVar.f93493a, uVar.f93494b);
                    onVideoPageChangeEventDelay(uVar);
                }
            }
        }

        @Override // com.bytedance.ies.foundation.activity.a
        public void attachBaseContext(Context context) {
            MethodCollector.i(2765);
            a.b.f109011a.a("main_act_attach_base_context", false);
            Context com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
            if (Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("prefetcher_cold_start", 0) == 1 && com.ss.android.common.util.f.a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext)) {
                String b2 = dc.b(com.ss.android.ugc.aweme.web.k.f145061a.c(), "prefetcher");
                long j2 = Keva.getRepoSync("ab_repo_cold_boot", 1).getLong("prefetcher_step_size", 524288);
                long j3 = Keva.getRepoSync("ab_repo_cold_boot", 1).getLong("prefetcher_step_sleep_duration", 15000);
                IoPrefetcher.q = IoPrefetcher.p;
                IoPrefetcher.r = j2;
                IoPrefetcher.s = j3;
                HandlerThread handlerThread = new HandlerThread("io_prefetcher");
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                IoPrefetcher.f38915b = handler;
                handler.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: INVOKE  
                      (r1v4 'handler' android.os.Handler)
                      (wrap: com.bytedance.io.prefetcher.IoPrefetcher$1 : 0x006e: CONSTRUCTOR  (r0v17 com.bytedance.io.prefetcher.IoPrefetcher$1) = 
                      (r5v0 'com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext' android.content.Context)
                      (r4v0 'b2' java.lang.String)
                     call: com.bytedance.io.prefetcher.IoPrefetcher.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void, file: classes8.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: CONSTRUCTOR  (r0v17 com.bytedance.io.prefetcher.IoPrefetcher$1) = 
                      (r5v0 'com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext' android.content.Context)
                      (r4v0 'b2' java.lang.String)
                     call: com.bytedance.io.prefetcher.IoPrefetcher.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 19 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.io.prefetcher.IoPrefetcher, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 25 more
                    */
                /*
                // Method dump skipped, instructions count: 148
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void");
            }

            @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
            public void onNewIntent(Intent intent) {
                com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("optimizeFirstInstall", "Main onNewIntent:" + System.currentTimeMillis());
                super.onNewIntent(intent);
                if (intent == null || !intent.getBooleanExtra("from_new_user_journey", false)) {
                    intent.putExtra("onNewIntent", true);
                    setIntent(intent);
                    IUgCommonService iUgCommonService = this.mUgCommonService;
                    if (iUgCommonService != null) {
                        iUgCommonService.a(intent);
                    }
                    bp bpVar = this.mSocialActivityObserver;
                    if (bpVar != null) {
                        bpVar.a(intent);
                    }
                    com.ss.android.ugc.aweme.base.ui.e d2 = this.stateManager.d("page_feed");
                    if (d2 instanceof MainPageFragment) {
                        MainPageFragment mainPageFragment = (MainPageFragment) d2;
                        if (mainPageFragment.n != null) {
                            DataCenter dataCenter = mainPageFragment.n;
                            if (dataCenter == null) {
                                l.b();
                            }
                            dataCenter.a("lastTryShowGuideViewResult", (Object) false);
                        }
                    }
                    this.mDialogRefactorContainer.a(getIntent());
                    if (!this.mToolsActivityObserver.a(intent, false)) {
                        this.mDataCenter.a("onNewIntent", intent);
                        if (!TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
                            this.stateManager.a("page_feed", false);
                        }
                        this.mToolsActivityObserver.b(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
                        this.mAccountObserver.a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
                        this.mInvitationReflowHelper.b(intent);
                    }
                }
            }

            @Override // com.bytedance.ies.foundation.activity.a
            public void onRestoreInstanceState(Bundle bundle) {
                Bundle bundle2;
                l.d(this, "");
                try {
                    if (Build.VERSION.SDK_INT == 28 && bundle != null && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                        bundle2.setClassLoader(getClassLoader());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                super.onRestoreInstanceState(bundle);
                bundle.getString("previousTag");
                boolean z = bundle.getBoolean("slide_switch_scanScroll");
                TabChangeManager tabChangeManager = getTabChangeManager();
                if (tabChangeManager.f109107d == null) {
                    tabChangeManager.f109107d = bundle.getString("cur_fragment");
                    if (tabChangeManager.f109110g != null) {
                        TabChangeManager.b bVar = tabChangeManager.f109110g;
                        if (bVar == null) {
                            l.b();
                        }
                        bVar.a(tabChangeManager.f109107d);
                    }
                }
                if (tabChangeManager.f109105b == null) {
                    tabChangeManager.f109105b = bundle.getString("last_fragment");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean(be.f68529a, true);
                bundle3.putString(be.f68530b, be.f68532d);
                Hox.a.a(this).b("HOME", bundle3);
                this.stateManager.a(z);
            }

            @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
            public void onSaveInstanceState(Bundle bundle) {
                int size;
                boolean z;
                String str;
                com.ss.android.ugc.aweme.base.ui.j jVar;
                super.onSaveInstanceState(bundle);
                TabChangeManager tabChangeManager = getTabChangeManager();
                l.d(bundle, "");
                bundle.putString("cur_fragment", tabChangeManager.f109107d);
                bundle.putString("last_fragment", tabChangeManager.f109105b);
                bundle.putString("previousTag", getTabChangeManager().f109107d);
                bundle.putBoolean("slide_switch_scanScroll", this.stateManager.a());
                ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                l.d("page_setting", "");
                if (scrollSwitchStateManager.f99140b.getValue() == null) {
                    size = 0;
                } else {
                    List<com.ss.android.ugc.aweme.base.ui.j> value = scrollSwitchStateManager.f99140b.getValue();
                    if (value == null) {
                        l.b();
                    }
                    size = value.size();
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    List<com.ss.android.ugc.aweme.base.ui.j> value2 = scrollSwitchStateManager.f99140b.getValue();
                    if (value2 == null || (jVar = value2.get(i2)) == null) {
                        str = null;
                    } else {
                        str = jVar.f68370b;
                    }
                    if (TextUtils.equals("page_setting", str)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                bundle.putBoolean("should_show_slide_setting", z);
                if (!com.bytedance.ies.abmock.b.a().a(true, "enable_main_use_fragments_cache", false)) {
                    bundle.putParcelable("android:support:fragments", null);
                }
            }

            @org.greenrobot.eventbus.r
            public void onScrollToProfileEvent(ad adVar) {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                AwemeRawAd awemeRawAd2;
                if (adVar != null && this.mScrollSwitchHelper != null && adVar.f93447a == hashCode()) {
                    com.bytedance.tiktok.homepage.mainactivity.c cVar = this.mCommerceActivityObserver;
                    if (!(cVar.f44145c == null || (aweme = cVar.f44145c.f99128k) == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.r(aweme)) {
                            com.ss.android.ugc.aweme.commercialize.utils.w.b(cVar.f44143a, aweme);
                            return;
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && com.ss.android.ugc.aweme.commercialize.e.a.b.z(aweme)) {
                            com.ss.android.ugc.aweme.commercialize.utils.w.e(cVar.f44143a, aweme);
                            return;
                        } else if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme) && (((br.a(aweme, 3) && !TextUtils.isEmpty(awemeRawAd2.getWebUrl())) || ((com.ss.android.ugc.aweme.feed.service.a.a().a(aweme) && awemeRawAd2.getNonNativeClick() == 0) || com.ss.android.ugc.aweme.commercialize.e.a.b.c(awemeRawAd2.getOpenUrl()))) && !com.ss.android.ugc.aweme.commercialize.e.a.b.J(aweme))) {
                            if (com.ss.android.ugc.aweme.commercialize.e.a.b.p(aweme)) {
                                com.ss.android.ugc.aweme.commercialize.utils.w.a(cVar.f44143a, aweme, "slide");
                                return;
                            } else if (!com.ss.android.ugc.aweme.commercialize.utils.n.a(cVar.f44143a, aweme) && !com.ss.android.ugc.aweme.miniapp.utils.a.a(cVar.f44143a, aweme)) {
                                com.ss.android.ugc.aweme.commercialize.utils.n.a(cVar.f44143a, aweme, (String) null, (String) null);
                                return;
                            } else {
                                return;
                            }
                        } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.d(awemeRawAd) && TextUtils.isEmpty(awemeRawAd.getWebUrl()) && com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
                            com.bytedance.tiktok.homepage.mainactivity.c.a(Toast.makeText(cVar.f44143a, (int) R.string.oe, 0));
                            return;
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.d(awemeRawAd) && com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.J(aweme)) {
                            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.d(awemeRawAd) || !com.ss.android.ugc.aweme.commercialize.utils.w.d(cVar.f44143a, aweme)) {
                                com.bytedance.tiktok.homepage.mainactivity.c.a(Toast.makeText(cVar.f44143a, (int) R.string.oe, 0));
                                return;
                            }
                            return;
                        }
                    }
                    this.mScrollSwitchHelper.a(this.homeViewModel.f99128k, "");
                }
            }

            @Override // com.bytedance.ies.foundation.activity.a
            public void onWindowFocusChanged(boolean z) {
                boolean z2;
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
                if (z) {
                    a.b.f109011a.b("cold_boot_main_measure_to_focus", false);
                    a.b.f109011a.b("cold_boot_main_resume_to_focus", true);
                    aw.b("cold_boot_main_resume_to_focus");
                    a.b.f109011a.a("cold_boot_main_focus_duration", true);
                    a.b.f109011a.b("feed_get_cache_to_focus", false);
                    a.b.f109011a.b("feed_load_cache_completed_to_focus", false);
                    a.b.f109011a.b("feed_render_to_focus", false);
                    a.b.f109011a.b("player_prerender_to_focus", false);
                }
                super.onWindowFocusChanged(z);
                this.isFirstLaunch = false;
                if (!com.ss.android.ugc.aweme.experiment.aw.b()) {
                    z2 = false;
                } else if (z) {
                    com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("coldboot", "cold boot: " + (System.currentTimeMillis() - a.b.f109011a.f109007h));
                    a.b.f109011a.b("app_start_to_main_focus", true);
                    a.b.f109011a.b("app_start_to_main_focus_v2", true);
                    a.b.f109011a.b("cold_boot_main_focus_duration", true);
                    z2 = false;
                    a.b.f109011a.b("cold_boot_feed_view_created_to_focus", false);
                    a.b.f109011a.b("cold_boot_feed_recommend_onresume_to_focus", false);
                    a.b.f109011a.a("cold_boot_focus_end_to_post_cache_message", false);
                    a.b.f109011a.a("cold_boot_main_focus_to_feed_success", false);
                } else {
                    z2 = false;
                    a.b.f109011a.f109002c = false;
                    com.ss.android.ugc.aweme.logger.c.f109013a = false;
                }
                com.bytedance.tiktok.homepage.mainactivity.a aVar = this.mAccountObserver;
                if (z && aVar.f44134a) {
                    aVar.f44134a = z2;
                    com.ss.android.ugc.aweme.account.b.b().toRecoverDeletedAccount(null);
                }
                this.mComplianceBusinessActivityObserver.a(z);
                if (z && this.mIsFirstVisible) {
                    if (!((Boolean) com.ss.android.ugc.aweme.s.f.f120814a.getValue()).booleanValue()) {
                        MainLooperOptService.b(MainLooperOptService.a.WATCH_ON_DRAW);
                    }
                    this.mIsFirstVisible = false;
                    o oVar = this.mToolsActivityObserver;
                    if (oVar.f44178a.getIntent().getBooleanExtra("enter_record_from_other_platform", false) && !oVar.f44180c) {
                        AVExternalServiceImpl.a().publishService().tryRestorePublish(oVar.f44178a, new com.bytedance.tiktok.homepage.mainactivity.p(oVar));
                    }
                    this.mUgCommonService.a(this, z);
                    r rVar = this.mUserGrowthActivityObserver;
                    if (rVar.f44187a.getIntent().getBooleanExtra("app_action_restricted", false)) {
                        new com.bytedance.tux.g.b(rVar.f44187a).e(R.string.buo).b();
                    }
                    com.ss.android.b.a.a.a.a(new ad(this), 300);
                    this.isFirstLaunch = true;
                    onStartUp();
                    if (dl.b()) {
                        com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i("DoFrameBooster", "FirstFrameDoFrameOptAB sucessful open");
                        com.bytedance.monitor.collector.d.f41460d = true;
                    }
                    if (com.ss.android.ugc.aweme.im.service.c.g.c()) {
                        IMService.createIIMServicebyMonsterPlugin(false).registerLifeCycle(com.bytedance.ies.ugc.appcontext.g.a());
                    }
                    com.ss.android.ugc.aweme.lego.f.a(ae.r());
                }
                this.mPerformanceActivityObserver.a(this, z);
                com.ss.android.ugc.aweme.lego.f.a(ab.ONWINDOWS_FOCUSCHANGE);
                if (com.ss.android.ugc.aweme.experiment.aw.b()) {
                    com.ss.android.ugc.aweme.ca.g.a();
                } else if (z) {
                    com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("coldboot", "cold boot: " + (System.currentTimeMillis() - a.b.f109011a.f109007h));
                    a.b.f109011a.b("app_start_to_main_focus", true);
                    a.b.f109011a.b("app_start_to_main_focus_v2", true);
                    a.b.f109011a.b("cold_boot_main_focus_duration", true);
                    a.b.f109011a.b("cold_boot_feed_view_created_to_focus", false);
                    a.b.f109011a.b("cold_boot_feed_recommend_onresume_to_focus", false);
                    a.b.f109011a.a("cold_boot_focus_end_to_post_cache_message", false);
                    a.b.f109011a.a("cold_boot_main_focus_to_feed_success", false);
                } else {
                    a.b.f109011a.f109002c = false;
                    com.ss.android.ugc.aweme.logger.c.f109013a = false;
                }
            }

            @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.main.h, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
            public void onCreate(Bundle bundle) {
                boolean z;
                int i2;
                String str;
                String str2;
                String str3;
                int i3;
                boolean z2;
                boolean z3;
                boolean z4;
                HomePageDataViewModel homePageDataViewModel;
                File file;
                MethodCollector.i(2843);
                com.bytedance.helios.sdk.utils.a.a(this, bundle);
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
                a.b.f109011a.b("cold_boot_application_to_main", true);
                aw.b("cold_boot_application_to_main");
                a.b.f109011a.a("method_main_create_begin_to_splash_ad", false);
                a.b.f109011a.a("cold_boot_main_create_duration", true);
                aw.a("cold_boot_main_create_duration");
                a.b.f109011a.a("main_act_create_to_node_init", false);
                if (bundle != null) {
                    z = true;
                } else {
                    z = false;
                }
                com.ss.android.ugc.aweme.logger.c.f109014b = SystemClock.uptimeMillis();
                c.a.f109018c = false;
                if (z) {
                    if (c.a.f109016a) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else if (c.a.f109016a) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                c.a.a(i2);
                c.a.f109016a = false;
                if (com.ss.android.ugc.aweme.s.d.b()) {
                    com.ss.android.ugc.aweme.homepage.ui.c.a(this);
                    com.ss.android.ugc.aweme.ca.c.a((Activity) this);
                }
                if (com.ss.android.ugc.aweme.s.a.o()) {
                    a.b.f109011a.a("method_main_get_delegate", false);
                    androidx.appcompat.app.f delegate = getDelegate();
                    a.b.f109011a.b("method_main_get_delegate", true);
                    com.ss.android.ugc.aweme.cw.g.c().execute(new p(this, delegate));
                }
                if (com.ss.android.ugc.aweme.experiment.aw.c()) {
                    doHoxInit();
                    com.ss.android.ugc.aweme.lego.f.e().a(new PreloadActicityTask()).a(com.ss.android.ugc.aweme.homepage.business.b.a(this.hoxInstance)).a();
                }
                if (eu.b()) {
                    com.ss.android.ugc.aweme.lego.component.c cVar = com.ss.android.ugc.aweme.lego.f.f107544i;
                    if (cVar == null) {
                        l.a("legoConfig");
                    }
                    if (cVar.d()) {
                        com.ss.android.ugc.aweme.lego.a.e.f107374b.a();
                    }
                }
                if (com.ss.android.ugc.aweme.story.c.b.c() && com.ss.android.ugc.aweme.story.g.f137757a.k() != hashCode()) {
                    com.ss.android.ugc.aweme.story.g.f137757a.a(hashCode());
                    com.ss.android.ugc.aweme.story.g.f137757a.j();
                    com.ss.android.ugc.aweme.story.userstory.mine.a.f138515a = null;
                }
                if (SettingsRequestServiceImpl.i().f() == 3) {
                    com.ss.android.ugc.aweme.feed.cache.e.b(true);
                }
                com.ss.android.ugc.aweme.turbo.api.b.a().mainOnCreate();
                if (com.ss.android.ugc.aweme.detail.transition.b.f79870a) {
                    com.ss.android.ugc.aweme.detail.transition.b.a(this);
                }
                com.bytedance.tiktok.homepage.mainactivity.i iVar = this.mNewUserGuideObserver;
                if (com.ss.android.ugc.aweme.s.a.m()) {
                    iVar.f44170c = com.ss.android.ugc.aweme.cw.g.c().submit(new com.bytedance.tiktok.homepage.mainactivity.j(iVar));
                }
                if (!com.ss.android.ugc.aweme.s.d.b()) {
                    com.ss.android.ugc.aweme.homepage.ui.c.a(this);
                    com.ss.android.ugc.aweme.ca.c.a((Activity) this);
                }
                if (((Boolean) com.ss.android.ugc.aweme.lego.e.p.getValue()).booleanValue()) {
                    com.ss.android.ugc.aweme.cw.g.b().execute(q.f109279a);
                }
                if (com.ss.android.ugc.aweme.experiment.i.b()) {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new w(this), ((Number) com.ss.android.ugc.aweme.experiment.i.f90233a.getValue()).longValue());
                } else {
                    com.ss.android.ugc.aweme.utils.p.a(this);
                }
                if (au.a()) {
                    this.mViewInflaterOpt.a(new x(this));
                }
                if (TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "local_test")) {
                    try {
                        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                        if (!TextUtils.isEmpty(null)) {
                            file = a2.getExternalFilesDir(null);
                        } else {
                            if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                                com.ss.android.ugc.aweme.lancet.d.f107196d = a2.getExternalFilesDir(null);
                            }
                            file = com.ss.android.ugc.aweme.lancet.d.f107196d;
                        }
                        File file2 = new File(file, "auto_sleep");
                        if (file2.exists()) {
                            Thread.sleep(Long.parseLong(h.e.j.c(file2)));
                        }
                    } catch (Exception e2) {
                        Arrays.toString(e2.getStackTrace());
                    }
                }
                a.b.f109011a.b("main_act_create_to_node_init", false);
                com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("optimizeFirstInstall", "onCreate:" + System.currentTimeMillis());
                if (!com.ss.android.ugc.aweme.experiment.aw.c()) {
                    doHoxInit();
                }
                a.b.f109011a.a("main_act_performance_observe", false);
                this.mPerformanceActivityObserver.a(this, this.hoxInstance);
                a.b.f109011a.b("main_act_performance_observe", false);
                if (!com.ss.android.ugc.aweme.s.a.m()) {
                    a.b.f109011a.a("main_act_user_guide_observe", false);
                    this.mNewUserGuideObserver.a();
                    a.b.f109011a.b("main_act_user_guide_observe", false);
                }
                a.b.f109011a.a("main_act_user_guide_to_super_create", false);
                a.b.f109011a.a("main_act_user_guide_to_immersive_config", false);
                this.mUgCommonService.a((com.bytedance.ies.foundation.activity.a) this);
                com.ss.android.ugc.aweme.homepage.a aVar = this.mActivityProxy;
                l.d(this, "");
                if (com.ss.android.ugc.aweme.lego.a.b.f107371a != com.ss.android.ugc.aweme.lego.a.a.COLD_BOOT_BEGIN) {
                    com.ss.android.ugc.aweme.lego.a.b.f107371a = com.ss.android.ugc.aweme.lego.a.a.HOT_BOOT_BEGIN;
                }
                aVar.f99100a = HomePageDataViewModel.a.a(this);
                aVar.f99101b = DataCenter.a(androidx.lifecycle.ae.a(this, (ad.b) null), this);
                aVar.f99102c = ScrollSwitchStateManager.a.a(this);
                Intent intent = getIntent();
                try {
                    str = com.ss.android.ugc.aweme.homepage.a.a(intent, "id");
                } catch (Throwable unused) {
                    str = null;
                }
                try {
                    str2 = com.ss.android.ugc.aweme.homepage.a.a(intent, "ids");
                } catch (Throwable unused2) {
                    str2 = null;
                }
                try {
                    str3 = com.ss.android.ugc.aweme.homepage.a.a(intent, "push_params");
                } catch (Throwable unused3) {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.homepage.api.data.a aVar2 = HomePageDataViewModel.a.a(this).f99120c;
                if (aVar2 != null) {
                    aVar2.f99136a = str;
                    aVar2.f99137b = str2;
                    aVar2.f99138c = str3;
                }
                String string = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "applog_stats", 0).getString("app_track", "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), this, new JSONObject(string).optString("openurl"));
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                if (!(bundle == null || (homePageDataViewModel = aVar.f99100a) == null)) {
                    homePageDataViewModel.f99119b = bundle.getBoolean("should_show_slide_setting");
                }
                androidx.fragment.app.e eVar = this.mLegacyPlayerActivityObserver.f44150a;
                if (!com.ss.android.ugc.aweme.m.a.f109044c) {
                    try {
                        if (!com.ss.android.ugc.aweme.m.a.d(eVar)) {
                            com.ss.android.ugc.aweme.m.a.f109045d = new a.C2795a(com.ss.android.ugc.aweme.m.a.f109042a);
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                            com.ss.android.ugc.aweme.m.a.a(eVar, com.ss.android.ugc.aweme.m.a.f109045d, intentFilter);
                            com.ss.android.ugc.aweme.m.a.f109044c = true;
                        }
                    } catch (Exception unused4) {
                    }
                }
                com.ss.android.ugc.aweme.video.q.b();
                this.stateManager = ScrollSwitchStateManager.a.a(this);
                this.homeViewModel = this.mActivityProxy.f99100a;
                this.adHomePageDataVM = AdHomePageDataVM.a.a(this);
                this.mSocialRecFriendsConditionVM = SocialRecFriendsConditionViewModel.a.a(this);
                this.mDataCenter = this.mActivityProxy.f99101b;
                this.mRestartFromLogout = getIntent().getBooleanExtra("restart_from_logout", false);
                this.pageType = getIntent().getIntExtra("page_type", -1);
                if (!SplashSettingServiceImpl.g().a() && (!com.ss.android.ugc.aweme.lego.a.b.a() || !cx.a())) {
                    new f.b().b((com.ss.android.ugc.aweme.lego.r) new com.ss.android.ugc.aweme.requesttask.b.a()).a();
                }
                a.b.f109011a.a("feed_lego_add_to_request", false);
                if (!com.ss.android.ugc.aweme.s.a.m()) {
                    p.a.a().a(p.a.a(getIntent()));
                }
                long currentTimeMillis = System.currentTimeMillis() - a.b.f109011a.f109007h;
                if (((Boolean) com.ss.android.ugc.aweme.lego.e.f107509j.getValue()).booleanValue()) {
                    com.ss.android.ugc.aweme.cw.g.b().execute(new a.RunnableC2423a(currentTimeMillis));
                } else {
                    com.ss.android.ugc.aweme.homepage.business.a.a(currentTimeMillis);
                }
                suitRouter(getIntent());
                com.bytedance.tiktok.homepage.mainactivity.a aVar3 = new com.bytedance.tiktok.homepage.mainactivity.a(this, this.mDataCenter, this.mDialogRefactorContainer);
                this.mAccountObserver = aVar3;
                aVar3.a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(getIntent()));
                a.b.f109011a.b("main_act_user_guide_to_immersive_config", false);
                a.b.f109011a.a("main_act_immersive_config", false);
                x xVar = new x((byte) 0);
                xVar.f65563i = true;
                activityConfiguration(new y(xVar));
                a.b.f109011a.b("main_act_immersive_config", false);
                if (bundle != null) {
                    i3 = R.style.o1;
                } else {
                    i3 = R.style.o5;
                }
                setTheme(i3);
                a.b.f109011a.b("main_act_user_guide_to_super_create", false);
                a.b.f109011a.a("method_main_super_duration", false);
                super.onCreate(bundle);
                a.b.f109011a.b("method_main_super_duration", false);
                a.b.f109011a.a("main_act_commerce_observe", false);
                com.bytedance.tiktok.homepage.mainactivity.c cVar2 = this.mCommerceActivityObserver;
                cVar2.f44145c = HomePageDataViewModel.a.a(cVar2.f44143a);
                cVar2.f44146d = AdHomePageDataVM.a.a(cVar2.f44143a);
                cVar2.f44147e.onCreate();
                if (!com.ss.android.ugc.aweme.feed.r.a.f93853a) {
                    synchronized (com.ss.android.ugc.aweme.feed.r.a.f93854b) {
                        try {
                            com.ss.android.ugc.aweme.feed.r.a.f93853a = true;
                            com.ss.android.ugc.aweme.feed.r.a.f93854b.notifyAll();
                        } catch (Throwable th) {
                            MethodCollector.o(2843);
                            throw th;
                        }
                    }
                }
                a.b.f109011a.b("main_act_commerce_observe", false);
                a.b.f109011a.a("main_act_commerce_observe_to_content_view", false);
                setAllowPrepareVideo();
                com.bytedance.tiktok.homepage.mainactivity.g gVar = this.mLoginAndConsentObserver;
                boolean z5 = this.mRestartFromLogout;
                boolean z6 = this.adHomePageDataVM.f34657a;
                Intent intent2 = getIntent();
                if (intent2 == null || !intent2.getBooleanExtra("from_require_login", false)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i4 = this.pageType;
                z.e eVar2 = new z.e();
                eVar2.element = null;
                eVar2.element = (T) f.a.t.c(new g.c(gVar, z6, z2, z5, i4)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new g.d(eVar2));
                if (SplashSettingServiceImpl.g().a() && (!com.ss.android.ugc.aweme.lego.a.b.a() || !cx.a())) {
                    new f.b().b((com.ss.android.ugc.aweme.lego.r) new com.ss.android.ugc.aweme.requesttask.b.a()).a();
                }
                boolean booleanExtra = getIntent().getBooleanExtra("is_start_by_switch_account", false);
                boolean booleanExtra2 = getIntent().getBooleanExtra("from_new_user_journey", false);
                boolean booleanExtra3 = getIntent().getBooleanExtra("needCheckSocialRecDialog", false);
                com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d(TAG, "isStartBySwitchAccount == " + booleanExtra + ", isFromNewUserJourney == " + booleanExtra2 + ", isNeedCheckSocialRecDialog == " + booleanExtra3);
                this.mSocialRecFriendsConditionVM.f120376b.postValue(Boolean.valueOf(booleanExtra2));
                androidx.lifecycle.t<Boolean> tVar = this.mSocialRecFriendsConditionVM.f120375a;
                if (!booleanExtra || !booleanExtra3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                tVar.postValue(Boolean.valueOf(z3));
                DataCenter dataCenter = this.mDataCenter;
                if (getIntent().getBooleanExtra("restart_from_logout", false) || booleanExtra) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dataCenter.a("start_from_logout_or_switch", Boolean.valueOf(z4));
                a.b.f109011a.b("main_act_commerce_observe_to_content_view", false);
                a.b.f109011a.a("method_main_after_super_init_view", false);
                if (com.ss.android.ugc.aweme.s.a.o()) {
                    a.b.f109011a.a("method_main_wait_decorview_async_lock", false);
                    synchronized (this.decorViewLock) {
                        try {
                            a.b.f109011a.b("method_main_wait_decorview_async_lock", false);
                            this.mActivityProxy.a(this, this.hoxInstance);
                        } catch (Throwable th2) {
                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                            MethodCollector.o(2843);
                            throw th2;
                        }
                    }
                } else {
                    this.mActivityProxy.a(this, this.hoxInstance);
                }
                a.b.f109011a.a("main_act_set_statusbar", false);
                setStatusBarColor();
                a.b.f109011a.b("main_act_set_statusbar", false);
                a.b.f109011a.b("method_main_after_super_init_view", false);
                if (com.ss.android.ugc.aweme.s.a.m()) {
                    a.b.f109011a.a("main_act_user_guide_observe", false);
                    this.mNewUserGuideObserver.a();
                    p.a.a().a(p.a.a(getIntent()));
                    a.b.f109011a.b("main_act_user_guide_observe", false);
                }
                a.b.f109011a.a("main_act_content_view_to_create_end", false);
                this.mScrollSwitchHelper = new bb(this, this.mActivityProxy.f99103d, this.mActivityProxy.f99104e);
                if (com.ss.android.ugc.aweme.experiment.aw.b()) {
                    aq aqVar = new aq(this);
                    this.mMainHelper = aqVar;
                    com.ss.android.ugc.aweme.ca.g.a(new z(aqVar));
                } else {
                    createMainHelper();
                }
                getWindow().setSoftInputMode(32);
                String handleIntent = handleIntent();
                if (!"NOTIFICATION".equals(handleIntent) || com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    this.showToast = true;
                    feedOVVMainActivityCreate();
                    setupSlideSwitchLayout(handleIntent);
                    ensureLazyDoItFinallyCalled();
                    if (bundle == null) {
                        changeTag(handleIntent);
                    }
                    if (this.mNewUserGuideObserver.f44169b || !TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") || getIntent().getCategories() == null || getIntent().getCategories().size() <= 0 || !getIntent().getCategories().contains("android.intent.category.LAUNCHER") || isTaskRoot()) {
                        ft.f142953b = getClass();
                        com.bytedance.tiktok.homepage.a aVar4 = this.mDialogRefactorContainer;
                        EventBus.a(EventBus.a(), aVar4);
                        aVar4.f44111b = a.C3244a.a(aVar4.f44110a);
                        this.firstCreated = true;
                        com.bytedance.tiktok.homepage.mainactivity.h hVar = this.mMiniAppActivityObserver;
                        Intent intent3 = hVar.f44167a.getIntent();
                        if (intent3.getBooleanExtra("jumpToGame", false)) {
                            a.C2810a aVar5 = new a.C2810a();
                            aVar5.f109680b = "schema";
                            com.ss.android.ugc.aweme.miniapp_api.model.b.a a3 = aVar5.a();
                            com.bytedance.tiktok.homepage.mainactivity.h.a(intent3, "gameId");
                            c.a.f109704a.a().openMiniApp(hVar.f44167a, "", a3);
                        }
                        this.mDialogRefactorContainer.a(getIntent());
                        if (!com.ss.android.ugc.aweme.player.f.f115098b) {
                            com.ss.android.ugc.aweme.player.f.f115098b = true;
                            if (com.bytedance.ies.abmock.b.a().a(true, "player_background_release_codec_res", 0) == 1) {
                                com.ss.android.ugc.aweme.player.f.f115099c = com.bytedance.ies.abmock.b.a().a(true, "player_background_release_codec_res_countdown_duration", 30000L);
                                com.ss.android.ugc.aweme.player.f.f115097a.a(com.bytedance.ies.ugc.appcontext.f.g().d(f.b.f115102a));
                            }
                        }
                        if (com.ss.android.ugc.aweme.experiment.aw.b()) {
                            com.ss.android.ugc.aweme.ca.g.a(e.a.f44151a);
                        } else {
                            com.ss.android.ugc.aweme.bp.e.a().b();
                        }
                        this.mComplianceBusinessActivityObserver.a();
                        this.mSocialActivityObserver.a();
                        MLCommonService.instance().runInMainActivityOnCreate();
                        a.b.f109011a.a("main_act_tools_activity_observer_duration", false);
                        if (com.ss.android.ugc.aweme.experiment.aw.b()) {
                            com.ss.android.ugc.aweme.ca.g.a(new aa(this, bundle));
                        } else {
                            this.mToolsActivityObserver.a(bundle, this.mDataCenter, this.mNewUserGuideObserver);
                        }
                        a.b.f109011a.b("main_act_tools_activity_observer_duration", false);
                        a.b.f109011a.a("main_act_hpas2svdialog_on_create", false);
                        if (((Boolean) com.ss.android.ugc.aweme.s.a.f120734h.getValue()).booleanValue()) {
                            com.ss.android.ugc.aweme.cw.g.c().execute(new ab(this));
                        } else {
                            g.a.a(this);
                        }
                        a.b.f109011a.b("main_act_hpas2svdialog_on_create", false);
                        if (fu.c() && com.ss.android.ugc.aweme.s.a.d()) {
                            a.b.f109011a.a("method_init_push_early_ensure_duration", false);
                            com.ss.android.ugc.aweme.lego.f.a(ae.e());
                            a.b.f109011a.b("method_init_push_early_ensure_duration", false);
                        }
                        this.mInvitationReflowHelper.a(getIntent());
                        com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("optimizeFirstInstall", "onCreate end:" + System.currentTimeMillis());
                        a.b.f109011a.b("main_act_content_view_to_create_end", false);
                        a.b.f109011a.b("method_splash_ad_to_main_create_end", false);
                        a.b.f109011a.b("cold_boot_main_create_duration", true);
                        aw.b("cold_boot_main_create_duration");
                        a.b.f109011a.a("cold_boot_main_create_to_resume", true);
                        aw.a("cold_boot_main_create_to_resume");
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                        MethodCollector.o(2843);
                        return;
                    }
                    com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d("StartLaunchActivityLancet", "finishhhhhhh");
                    finish();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                    MethodCollector.o(2843);
                    return;
                }
                com.ss.android.ugc.aweme.login.c.a(this, getEnterFrom(), "click_message");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                MethodCollector.o(2843);
            }

            public static String com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            public void flingBackToFeedChange(Aweme aweme, Context context) {
                IAdSceneService f2 = AdSceneServiceImpl.f();
                if (f2 != null) {
                    f2.c().d(aweme, context);
                }
            }

            public void flingToIndexChange(Aweme aweme, Context context) {
                IAdSceneService f2 = AdSceneServiceImpl.f();
                if (f2 != null) {
                    f2.c().c(aweme, context);
                }
            }

            static final /* synthetic */ h.z lambda$onCreate$6$MainActivity(x xVar, BaseActivityViewModel baseActivityViewModel) {
                baseActivityViewModel.config(t.f109321a);
                baseActivityViewModel.config(new u(xVar));
                baseActivityViewModel.config(v.f109323a);
                return null;
            }

            @Override // com.bytedance.ies.foundation.activity.a
            public void onActivityReenter(int i2, Intent intent) {
                bb bbVar;
                com.ss.android.ugc.aweme.detail.transition.a.a(this, i2);
                if (-1 == i2 && intent != null) {
                    String com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "feed_share_element_aid");
                    if (getTabChangeManager().b() instanceof com.ss.android.ugc.aweme.profile.ui.d.b) {
                        ((com.ss.android.ugc.aweme.profile.ui.d.b) getTabChangeManager().b()).a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    } else if ((getTabChangeManager().b() instanceof ae) && (bbVar = this.mScrollSwitchHelper) != null) {
                        bbVar.a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    }
                }
                super.onActivityReenter(i2, intent);
            }

            public static Object com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(h hVar, String str) {
                Object obj;
                MethodCollector.i(3168);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                        try {
                            new com.bytedance.platform.godzilla.b.b.b().a();
                            com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                            obj = super.getSystemService((h) str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = super.getSystemService((h) str);
                } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = super.getSystemService((h) str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                } catch (Exception e2) {
                                    com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                        } finally {
                            MethodCollector.o(3168);
                        }
                    }
                } else {
                    obj = super.getSystemService((h) str);
                }
                return obj;
            }

            @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
            public boolean onKeyDown(int i2, KeyEvent keyEvent) {
                com.ss.android.ugc.aweme.discover.activity.a g2;
                List<com.ss.android.ugc.aweme.base.a.a> list = this.mActivityOnKeyDownListeners;
                if (list != null) {
                    for (com.ss.android.ugc.aweme.base.a.a aVar : list) {
                        if (aVar.onKeyDown(i2, keyEvent)) {
                            return true;
                        }
                    }
                }
                if (i2 == 4) {
                    if (this.stateManager.b("page_discover")) {
                        ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                        l.d("page_discover", "");
                        scrollSwitchStateManager.d("page_discover");
                    }
                    Fragment b2 = getTabChangeManager().b();
                    if ((b2 != null && (b2 instanceof com.ss.android.ugc.aweme.newfollow.ui.c) && (g2 = ((com.ss.android.ugc.aweme.newfollow.ui.c) b2).g()) != null && g2.a()) || this.mScrollSwitchHelper.b()) {
                        return true;
                    }
                    if (getTabChangeManager().b() == null || !(getTabChangeManager().b() instanceof com.ss.android.ugc.aweme.profile.ui.d.b)) {
                        refreshWhenBack();
                        return super.onKeyDown(i2, keyEvent);
                    }
                    refreshWhenBack();
                    return super.onKeyDown(i2, keyEvent);
                } else if (i2 != 67) {
                    return false;
                } else {
                    return super.onKeyDown(i2, keyEvent);
                }
            }

            @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
            public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
                super.onRequestPermissionsResult(i2, strArr, iArr);
            }

            @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
            public void onActivityResult(int i2, int i3, Intent intent) {
                ScrollSwitchStateManager scrollSwitchStateManager;
                this.mUgCommonService.a(this, i2, i3, intent);
                b bVar = this.mActivityResultListener;
                if (bVar != null) {
                    bVar.a(i2, i3, intent);
                }
                HomePageDataViewModel homePageDataViewModel = this.mActivityProxy.f99100a;
                if (homePageDataViewModel != null) {
                    homePageDataViewModel.b().setValue(new h.u<>(Integer.valueOf(i2), Integer.valueOf(i3), intent));
                }
                if (i2 == 1 && i3 == 2 && (scrollSwitchStateManager = this.mActivityProxy.f99102c) != null) {
                    scrollSwitchStateManager.a("page_profile", false);
                }
                if (!this.mComplianceBusinessActivityObserver.a(i2, i3, intent)) {
                    super.onActivityResult(i2, i3, intent);
                }
            }

            public void onPublishServiceConnected(h hVar, Object obj, String str, com.ss.android.ugc.aweme.shortvideo.publish.q qVar) {
                a.b.f109011a.f109002c = false;
                com.ss.android.ugc.aweme.logger.c.f109013a = false;
                com.ss.android.ugc.d.a.c.b(new com.ss.android.ugc.aweme.story.model.b(-1, null));
                IAVPublishService.OnPublishCallback onPublishCallback = this.processedCallback;
                if (onPublishCallback != null) {
                    onPublishCallback.onStartPublish(hVar);
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.d(true));
                if (!AVExternalServiceImpl.a().publishService().isParallelPublishEnabled() || qVar.f129883l) {
                    androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
                    com.ss.android.ugc.aweme.t.b.a(supportFragmentManager, b.a.ParallelPublishDialogFragmentType);
                    boolean isShoutoutPostDialog = AVExternalServiceImpl.a().shoutOutsService().isShoutoutPostDialog(obj);
                    ag agVar = new ag();
                    agVar.f125290e = isShoutoutPostDialog;
                    Bundle bundle = new Bundle();
                    if (obj != null) {
                        if (obj instanceof Serializable) {
                            bundle.putSerializable("args", (Serializable) obj);
                        } else if (obj instanceof Parcelable) {
                            bundle.putParcelable("args", (Parcelable) obj);
                        }
                    }
                    agVar.f125288c = hVar;
                    agVar.setArguments(bundle);
                    if (!agVar.f125290e || (AVExternalServiceImpl.a().shoutOutsService().getInMainTab() && AVExternalServiceImpl.a().shoutOutsService().getInFollowingTab())) {
                        supportFragmentManager.a().a(R.id.ed2, agVar, "publish").a(R.anim.ds, R.anim.dt).c();
                    } else {
                        if (agVar.f125289d != null) {
                            agVar.f125289d.setVisibility(4);
                        }
                        supportFragmentManager.a().a(R.id.ed2, agVar, "publish").a(R.anim.ds, R.anim.dt).c();
                        agVar.requireFragmentManager().a().b(agVar).c();
                        if (agVar.f125289d != null) {
                            agVar.f125289d.setVisibility(0);
                        }
                    }
                    getSupportFragmentManager().a((i.b) new com.ss.android.ugc.aweme.port.internal.m(this, hVar, this.processedCallback), false);
                    return;
                }
                androidx.fragment.app.i supportFragmentManager2 = getSupportFragmentManager();
                com.ss.android.ugc.aweme.t.b.a(supportFragmentManager2, b.a.PublishDialogFragmentType);
                cb cbVar = (cb) supportFragmentManager2.a("publish");
                if (cbVar == null) {
                    cbVar = new cb();
                    l.d(supportFragmentManager2, "");
                    supportFragmentManager2.a().a(R.id.ed2, cbVar, "publish").a(R.anim.ds, R.anim.dt).c();
                } else {
                    cbVar.a();
                }
                hVar.a(new com.ss.android.ugc.aweme.port.internal.l(cbVar, hVar, this.processedCallback, str, qVar));
            }
        }

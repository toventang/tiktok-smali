package com.ss.android.ugc.aweme.setting.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.a;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.d.c;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.dn;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.i;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.experiment.m;
import com.ss.android.ugc.aweme.profile.f.ag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.setting.api.DoBStatusApi;
import com.ss.android.ugc.aweme.setting.api.LiveReplayApi;
import com.ss.android.ugc.aweme.setting.bf;
import com.ss.android.ugc.aweme.setting.d.e;
import com.ss.android.ugc.aweme.setting.h;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.u;
import com.ss.android.ugc.aweme.setting.unit.a.a;
import com.ss.android.ugc.aweme.setting.unit.a.b;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.fy;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.utils.hp;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;

public class I18nSettingNewVersionActivity extends v implements WeakHandler.IHandler, com.ss.android.ugc.aweme.global.config.settings.a, j {

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f122761a;
    private List<String> am;
    private String an = "";
    private int ao;
    private boolean ap;
    private final f.a.b.a aq = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    b f122762b = null;

    static {
        Covode.recordClassIndex(80581);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final int f() {
        return R.layout.ayb;
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.setting.ui.v
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(53, new g(I18nSettingNewVersionActivity.class, "onEvent", com.ss.android.ugc.aweme.setting.d.b.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(54, new g(I18nSettingNewVersionActivity.class, "onEvent", c.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(55, new g(I18nSettingNewVersionActivity.class, "onSwitchBusinessAccountSuccessEvent", e.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(56, new g(I18nSettingNewVersionActivity.class, "onEvent", com.ss.android.ugc.aweme.al.e.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.setting.ui.v
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void u() {
        bf.a(this);
    }

    private boolean aa() {
        if (this.ao == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void C() {
        ah.f123352a.b(this);
    }

    private static boolean U() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean ab() {
        int i2 = this.ao;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    public static boolean B() {
        if (!ag.a() || com.ss.android.ugc.aweme.account.b.g().getCurUser().getAccountType() != 3) {
            return false;
        }
        return true;
    }

    private static boolean V() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean U = U();
        com.ss.android.ugc.aweme.lancet.j.f107229h = U;
        return U;
    }

    private void Y() {
        if (!B() || !m.f116369b) {
            this.M.a(false);
            return;
        }
        this.M.a(true);
        this.K.a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void e() {
        r.a("enter_kid_platform", new d().f66730a);
        com.ss.android.ugc.aweme.compliance.api.a.p().b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final x i() {
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        return xVar;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.setting.ui.v
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.aq.a();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.b(this);
        SettingsManagerProxy.inst().removeSettingsWatcher(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void s() {
        SmartRouter.buildRoute(this, "//live/container").withParam("fragment_type", "subscribe_info_list").open();
        r.onEventV3("live_subscription_entry_clicked");
    }

    private void S() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || com.ss.android.ugc.aweme.compliance.api.a.p().a() == IFamilyPairingService.a.CHILD) {
            this.f122937m.a(false);
        } else {
            this.f122937m.a(true);
        }
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            this.n.a(false);
        } else {
            this.n.a(true);
        }
    }

    private void X() {
        if (this.L == null) {
            return;
        }
        if (hp.a.h() || (aa() && hp.a.i())) {
            this.L.b(true);
        } else {
            this.L.b(false);
        }
    }

    private void Z() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return;
        }
        if (hp.a.i()) {
            ae.f115954a.a(new WeakHandler(this));
        } else if (hp.a.j()) {
            hp.a.k();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void A() {
        if (!V()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
        } else {
            UgCommonServiceImpl.j().b().a(this, true, "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void D() {
        AnonymousClass4 r2 = new u.b() {
            /* class com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity.AnonymousClass4 */

            static {
                Covode.recordClassIndex(80585);
            }

            @Override // com.ss.android.ugc.aweme.setting.ui.u.b
            public final void b() {
                I18nSettingNewVersionActivity.this.a(new com.ss.android.ugc.aweme.profile.e.a("settings_page", "log_out_switch_account"));
            }

            @Override // com.ss.android.ugc.aweme.setting.ui.u.b
            public final void a() {
                com.ss.android.ugc.aweme.account.b.a();
                bn k2 = com.ss.android.ugc.aweme.account.b.f62864a.k();
                if (!k2.isOneKeyLoginExprimentEnable() || k2.getSaveLoginStatus() || !k2.isCurrentMethodAvaliable()) {
                    I18nSettingNewVersionActivity.this.F();
                    return;
                }
                I18nSettingNewVersionActivity i18nSettingNewVersionActivity = I18nSettingNewVersionActivity.this;
                r.a("remember_login_info_notify", new d().a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("enter_from", "logout").f66730a);
                a.C0731a aVar = new a.C0731a(i18nSettingNewVersionActivity);
                SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(i18nSettingNewVersionActivity);
                v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(com.ss.android.ugc.aweme.account.b.g().getCurUser().getAvatarThumb()));
                a2.E = smartAvatarImageView;
                a2.c();
                aVar.a(smartAvatarImageView, 48, 48);
                aVar.M = false;
                aVar.a(R.string.c3).b(R.string.c0).b(R.string.c1, (DialogInterface.OnClickListener) new s(i18nSettingNewVersionActivity), false).a(R.string.c2, (DialogInterface.OnClickListener) new t(i18nSettingNewVersionActivity), false);
                aVar.a().c();
            }
        };
        l.d(r2, "");
        u uVar = new u();
        uVar.f122920a = r2;
        new a.C1112a().a(uVar).a(1).f45299a.show(getSupportFragmentManager(), "logout_dialog_with_switch_account");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void I() {
        r.a("enter_notification_setting", new d().a("previous_page", "settings_page").a("enter_method", "click_button").f66730a);
        r.onEvent(MobClick.obtain().setEventName("notification_setting").setLabelName("settings_page"));
        SmartRouter.buildRoute(this, "aweme://push_setting_manager").open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void J() {
        i k2 = LiveOuterService.s().k();
        if (k2 != null) {
            Bundle bundle = new Bundle();
            LiveOuterService.s().f().a((String) k2.a("live_replay_page_url", ""), bundle, this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void d() {
        r.a("click_settings_ads", new d().a("refer", "settings").a("user_id", in.c().getUid()).f66730a);
        Intent intent = new Intent(this, SettingAdsActivity.class);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void g() {
        boolean z;
        if (!ab() || !hp.a.i()) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        l.d("privacy_and_setting_page", "");
        Intent intent = new Intent(this, BusinessAccountActivity.class);
        intent.putExtra("enterFrom", "privacy_and_setting_page");
        if (valueOf != null) {
            valueOf.booleanValue();
            intent.putExtra("bundle_show_account_dialog_when_start", valueOf.booleanValue());
        }
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        startActivity(intent);
        r.onEventV3("ttelite_setting_business_entry_clicked");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void j() {
        super.j();
        o oVar = new o(this);
        oVar.show();
        DoBStatusApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new q(this, oVar), new r(this, oVar));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void k() {
        r.a("enter_content_preference", new d().a("enter_from", "settings_page").a("previous_page", "settings_page").a("enter_method", "click_button").f66730a);
        SmartRouter.buildRoute(this, "aweme://contentpreference").open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void m() {
        super.m();
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        com.ss.android.ugc.aweme.setting.utils.b.a(this, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=" + hh.c(), hashMap);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        this.ap = true;
        ValueAnimator valueAnimator = this.f122761a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f122761a.cancel();
        }
        this.f122762b = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), o.f122911a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new p(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.setting.ui.v
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void y() {
        l.d(this, "");
        if (!bf.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
        } else {
            SmartRouter.buildRoute(this, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/copyright-policy")).withParam("title", getString(R.string.aur)).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void z() {
        ab.a("enter_privacy_setting").b("enter_from", "settings_page").b("enter_method", "click_button").f();
        SmartRouter.buildRoute(this, "//privacy/setting").open();
        r.onEvent(MobClick.obtain().setEventName("privacy").setLabelName("settings"));
    }

    private void T() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || !m.f116369b) {
            this.L.a(false);
            return;
        }
        this.L.a(getResources().getString(R.string.b2o));
        this.L.a(true);
        this.K.a(false);
        this.an = UUID.randomUUID().toString();
        if (ag.a() && com.ss.android.ugc.aweme.account.b.g().getCurUser().getAccountType() == 2) {
            r.a("show_creator_account_cell", new d().a("enter_from", "settings_page").a("process_id", this.an).f66730a);
        }
    }

    private void W() {
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (!SharePrefCache.inst().getCanCreateInsights().c().booleanValue() || curUser == null || !curUser.getIsCreater()) {
            this.K.a(false);
        } else {
            this.K.a(true);
        }
        if (com.ss.android.ugc.aweme.base.h.d.h().a("show_insights_red", false)) {
            this.K.b(true);
        } else {
            this.K.b(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        a.C0731a aVar = new a.C0731a(this);
        aVar.a(R.string.asn).b(R.string.a9e, e.f122901a, false).a(R.string.czc, (DialogInterface.OnClickListener) new f(this), false);
        if (com.ss.android.ugc.aweme.account.b.b().isEnableMultiAccountLogin()) {
            aVar.f33402b = in.b(com.ss.android.ugc.aweme.account.b.g().getCurUser());
        }
        Dialog c2 = aVar.a().c();
        if (c2 != null) {
            View findViewById = c2.findViewById(16908299);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setGravity(8388611);
            }
        }
    }

    public final void F() {
        if (!V()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            return;
        }
        r.a("log_out", new d().a("enter_from", "settings_page").a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("f_mode", 0).f66730a);
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(this);
        runOnUiThread(new bn(this));
        com.ss.android.ugc.aweme.account.b.b().logout("user_logout", "user_logout");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void G() {
        super.G();
        if (com.ss.android.ugc.aweme.experiment.a.a.a()) {
            com.ss.android.ugc.aweme.setting.unit.a.a aVar = this.x;
            aVar.a(new a.e(aVar));
            this.x.a(getString(R.string.c18));
            return;
        }
        t.a(new g(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), new i(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void H() {
        boolean a2 = com.ss.android.ugc.aweme.experiment.a.a.a();
        com.ss.android.ugc.aweme.framework.a.a.a(3, "clear-cache", "enableSettingDiskManager: ".concat(String.valueOf(a2)));
        if (a2) {
            SmartRouter.buildRoute(this, "//setting/diskmanager").open();
            return;
        }
        ab.a("click_clean_cache_button").b("enter_from", "settings_page").f();
        b.i.b(new j(this), b.i.f4824a).a(new k(this), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final com.ss.android.ugc.aweme.dc.a[] b() {
        if (com.ss.android.ugc.aweme.ug.h.a.a()) {
            return new com.ss.android.ugc.aweme.dc.a[]{this.f122932h, this.E, this.f122934j, this.H, this.Q, this.C, this.I, this.D, this.S};
        }
        return new com.ss.android.ugc.aweme.dc.a[]{this.f122932h, this.E, this.f122934j, this.H, this.f122935k, this.Q, this.C, this.I, this.D, this.S};
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "settings_page");
        hashMap.put("scene_id", "1003");
        r.a("enter_wallet_page", hashMap);
        r.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
        r.a("wallet_click", new d().a("enter_from", "settings_page").f66730a);
        com.ss.android.ugc.aweme.dg.a.a(this, "page_index");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void l() {
        boolean z = true;
        SmartRoute withParam = SmartRouter.buildRoute(this, "aweme://creatortools").withParam("bundle_process_id", this.an).withParam("HAS_PRELOAD", true).withParam("PRO_ENTER_FROM", "creator_tools");
        if (!ab() || !hp.a.i()) {
            z = false;
        }
        withParam.withParam("bundle_show_account_dialog_when_start", z).open();
        r.a("enter_creator_account", new d().a("enter_from", "settings_page").a("process_id", this.an).f66730a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void p() {
        com.ss.android.ugc.aweme.setting.l.a.a().storeBoolean("referral_code_badge", true);
        this.P.b(false);
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> referralEntrance = inst.getReferralEntrance();
        l.b(referralEntrance, "");
        String c2 = referralEntrance.c();
        l.b(c2, "");
        SmartRouter.buildRoute(this, "aweme://webview").withParam("use_webview_title", true).withParam(Uri.parse(c2)).open();
        r.a("click_referral_invite_friends", com.facebook.common.d.f.of("enter_from", "settings_page"));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void q() {
        l.d(this, "");
        if (!bf.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://support.tiktok.com");
        gVar.a("lang", LocalServiceImpl.a().a(this));
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", gVar.a()).withParam("title", getString(R.string.bwa)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void t() {
        l.d(this, "");
        if (!bf.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        r.a("click_safety_center", new d().f66730a);
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", "https://www.tiktok.com/" + LocalServiceImpl.a().a(this) + "/safety/").withParam("title", getString(R.string.ffh)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void v() {
        if (!V()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        r.a("enter_imprint", new d().a("previous_page", "settings_page").a("enter_method", "click_button").f66730a);
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", com.ss.android.ugc.aweme.compliance.api.a.d().d()).withParam("title", getString(R.string.fm7)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void w() {
        l.d(this, "");
        if (!bf.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://www.tiktok.com/community-guidelines");
        gVar.a("lang", LocalServiceImpl.a().a(this));
        gVar.a("enter_from", "settings");
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", gVar.a()).withParam("title", getString(R.string.as3)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void x() {
        if (!V()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        String e2 = com.ss.android.ugc.aweme.compliance.api.a.d().e();
        if (TextUtils.isEmpty(e2)) {
            e2 = fy.a("privacy-policy");
        }
        SmartRouter.buildRoute(this, "aweme://webview").withParam(Uri.parse(e2)).withParam("hide_status_bar", true).withParam("title", getString(R.string.eub)).open();
        r.a("enter_privacy_policy_entrance", new d().a("enter_from", "settings_page").f66730a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void n() {
        if (!CrossLanguageUserExperiment.c().b()) {
            ab.a("enter_general_setting").b("previous_page", "settings_page").b("enter_method", "click_button").f();
            r.a("display_settings", new d().a("enter_from", "settings_page").f66730a);
            SmartRouter.buildRoute(this, "aweme://display/setting").open();
        } else if (getIntent() == null || ((!"translate_tts".equals(a(getIntent(), "enter_from")) && !"translate_subtitle".equals(a(getIntent(), "enter_from"))) || this.o == null)) {
            SmartRouter.buildRoute(this, "aweme://display/caption/setting").withParam("enter_method", "setting_page").open();
        } else {
            ValueAnimator valueAnimator = this.f122761a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f122761a.cancel();
            }
            r.a("enter_language_setting", new d().a("enter_from", "settings_page").a("enter_method", a(getIntent(), "enter_from")).f66730a);
            SmartRouter.buildRoute(this, "aweme://display/caption/setting").withParam("enter_method", a(getIntent(), "enter_from")).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void o() {
        if (!V()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        r.a("enter_feedback_page", new d().a("enter_from", "settings_page").f66730a);
        r.a("FAQ", new d().a("enter_from", "settings").f66730a);
        r.a("click_feedback_entrance", new d().a("enter_from", "settings").f66730a);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        try {
            com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeedbackConf().getNormalEntry());
        } catch (Exception unused) {
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
            gVar.a("locale", com.ss.android.ugc.aweme.i18n.language.i18n.c.a(this).getLanguage());
            if (com.bytedance.ies.ugc.appcontext.d.k()) {
                gVar.a("is_lite", 1);
            }
            gVar.a("enter_from", "settings");
            buildRoute.withParam(Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void r() {
        List<String> list;
        l.d(this, "");
        if (!bf.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        String h2 = SettingServiceImpl.v().h();
        Objects.requireNonNull(h2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = h2.toLowerCase();
        l.b(lowerCase, "");
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        String str = null;
        if (g2 != null) {
            Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
            str = g2.toLowerCase();
            l.b(str, "");
        }
        String str2 = "en-us";
        if (!TextUtils.isEmpty(lowerCase) && !TextUtils.isEmpty(str)) {
            String str3 = lowerCase + '-' + str;
            h a2 = com.ss.android.ugc.aweme.setting.i.a();
            if (!(a2 == null || (list = a2.f122199a) == null || !n.a((Iterable) list, (Object) str3))) {
                str2 = str3;
            }
        }
        SmartRouter.buildRoute(this, "aweme://webview").withParam("url", new com.ss.android.common.util.g("https://www.tiktok.com/creators/creator-portal/" + str2 + '/').a()).withParam("title", getString(R.string.b3y)).open();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void a() {
        super.a();
        String a2 = com.a.a(getString(R.string.fq5), new Object[]{com.bytedance.ies.ugc.appcontext.d.i(), Long.valueOf(com.bytedance.ies.ugc.appcontext.d.h())});
        com.ss.android.ugc.aweme.setting.unit.a.b bVar = this.ab;
        String str = a2 + "";
        l.d(str, "");
        bVar.a(new b.d(bVar, str));
        if (LiveHostOuterService.q() == null || TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "amazon")) {
            this.E.a(false);
        } else {
            this.E.a(true);
        }
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> referralEntrance = inst.getReferralEntrance();
        l.b(referralEntrance, "");
        if (!TextUtils.isEmpty(referralEntrance.c())) {
            this.P.a(true);
            if (!com.ss.android.ugc.aweme.setting.l.a.a().getBoolean("referral_code_badge", false)) {
                this.P.b(true);
            }
        }
        this.N.a(false);
        this.O.a(true);
        if (com.ss.android.ugc.aweme.account.b.b().isEnableMultiAccountLogin()) {
            this.I.a(true);
        }
        S();
        this.f122928d.setBackgroundColor(androidx.core.content.b.c(this.f122928d.getContext(), R.color.f159928l));
        this.f122929e.setBackgroundColor(androidx.core.content.b.c(this.f122928d.getContext(), R.color.f159928l));
        this.f122932h.a(false);
        this.y.a(false);
        K();
        if (getIntent() == null) {
            return;
        }
        if ("translate_tts".equals(a(getIntent(), "enter_from")) || "translate_subtitle".equals(a(getIntent(), "enter_from"))) {
            final ValueAnimator ofInt = ValueAnimator.ofInt(0, 300);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new d(this));
            ofInt.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(80582);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    I18nSettingNewVersionActivity.this.f122761a = ofInt;
                }

                public final void onAnimationCancel(Animator animator) {
                    I18nSettingNewVersionActivity.this.o.a(com.bytedance.ies.dmt.ui.common.c.c(I18nSettingNewVersionActivity.this));
                }

                public final void onAnimationEnd(Animator animator) {
                    I18nSettingNewVersionActivity.this.o.a(com.bytedance.ies.dmt.ui.common.c.c(I18nSettingNewVersionActivity.this));
                }
            });
            ofInt.setStartDelay(800);
            final ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 300);
            ofInt2.setDuration(300L);
            ofInt2.addUpdateListener(new m(this));
            ofInt2.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(80583);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    ofInt.start();
                }

                public final void onAnimationCancel(Animator animator) {
                    I18nSettingNewVersionActivity.this.o.a(com.bytedance.ies.dmt.ui.common.c.c(I18nSettingNewVersionActivity.this));
                }

                public final void onAnimationStart(Animator animator) {
                    I18nSettingNewVersionActivity.this.o.a(new ColorDrawable(androidx.core.content.b.c(I18nSettingNewVersionActivity.this, R.color.p3)));
                    I18nSettingNewVersionActivity.this.f122761a = ofInt2;
                }
            });
            ofInt2.setStartDelay(500);
            ofInt2.start();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", true);
        super.onResume();
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            if (PrivacyServiceImpl.d().b()) {
                this.f122936l.a(true);
            } else {
                this.f122936l.a(false);
            }
        } else if (!((com.ss.android.ugc.aweme.setting.ui.b.a) this.f122936l.f79368m).f122837g) {
            this.f122936l.a(true);
        }
        S();
        W();
        T();
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || !((Boolean) LiveOuterService.s().k().a("is_subscribe_region", false)).booleanValue()) {
            this.aa.a(false);
        } else {
            this.aa.a(true);
        }
        Y();
        X();
        if (this.am == null) {
            this.am = com.ss.android.ugc.aweme.setting.services.e.f122670a.b();
        }
        if (this.am != null) {
            com.ss.android.ugc.aweme.setting.utils.d.a(this.f122931g, this.am);
        }
        List<String> b2 = com.ss.android.ugc.aweme.compliance.api.a.d().b();
        if (!com.bytedance.common.utility.collection.b.a((Collection) b2)) {
            dm dmVar = this.f122931g;
            l.d(dmVar, "");
            l.d(b2, "");
            List<com.ss.android.ugc.aweme.dc.a<?>> a2 = dmVar.a();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.ss.android.ugc.aweme.dc.a<?> aVar = a2.get(i2);
                Object c2 = aVar.l().c();
                if ((c2 instanceof String) && !TextUtils.isEmpty((CharSequence) c2) && b2.contains(c2)) {
                    aVar.a(false);
                }
            }
        }
        if (CrossLanguageUserExperiment.c().b()) {
            this.o.a(getResources().getString(R.string.cuv));
        } else {
            this.o.a(getResources().getString(R.string.fr2));
            this.o.b(com.ss.android.ugc.aweme.i18n.language.a.b(this));
        }
        if (this.ap && aa()) {
            Z();
        }
        dn.a();
        this.ap = false;
        this.f122762b = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new n(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.global.config.settings.a
    public final void a(IESSettingsProxy iESSettingsProxy) {
        T();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(e eVar) {
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.setting.ui.v
    public final void a(com.ss.android.ugc.aweme.profile.e.a aVar) {
        ae.f115954a.a(getSupportFragmentManager(), aVar, "choose_account_dialog");
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(c cVar) {
        W();
        T();
        Y();
        X();
    }

    public static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.al.e eVar) {
        SmartRouter.buildRoute(this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(b.i iVar) {
        if (!iVar.a()) {
            return null;
        }
        this.x.b("0.0MB");
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.agm).a();
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        UserResponse userResponse;
        User user;
        Object obj = message.obj;
        if ((obj instanceof UserResponse) && (user = (userResponse = (UserResponse) obj).getUser()) != null && userResponse.status_code == 0) {
            int proAccountUpdateNotificationStatus = user.getProAccountUpdateNotificationStatus();
            this.ao = proAccountUpdateNotificationStatus;
            if (proAccountUpdateNotificationStatus < 0 || proAccountUpdateNotificationStatus > 2) {
                this.ao = 0;
            }
            X();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.setting.d.b bVar) {
        W();
        T();
        Y();
        X();
        dn.a();
    }

    public static boolean a(File file) {
        MethodCollector.i(6330);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(6330);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6330);
        return delete;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.setting.ui.v, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", true);
        com.ss.android.ugc.aweme.lego.f.a(com.ss.android.ugc.aweme.lego.ab.SETTING);
        activityConfiguration(c.f122880a);
        super.onCreate(bundle);
        this.p.a(0);
        this.q.a(0);
        if (!com.bytedance.ies.ugc.appcontext.d.k() && ((Integer) LiveOuterService.s().k().a("mt_anchor_center_type", 0)).intValue() == 0) {
            String str = Api.f66569d;
            l.b(str, "");
            com.google.c.h.a.l.a(((LiveReplayApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(LiveReplayApi.class)).getLiveReplayEntrance(), new k<com.ss.android.ugc.aweme.setting.model.j>() {
                /* class com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(80584);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    String str;
                    com.ss.android.ugc.aweme.live.j m2 = LiveOuterService.s().m();
                    if (m2 != null) {
                        HashMap hashMap = new HashMap();
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "";
                        }
                        hashMap.put("error_msg", str);
                        hashMap.put("error_code", -1);
                        m2.a("ttlive_live_replay_setting_entrance_show_all", 1, hashMap);
                        m2.a("ttlive_live_replay_setting_entrance_show_error", 1, hashMap);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.setting.model.j jVar) {
                    int i2;
                    com.ss.android.ugc.aweme.setting.model.j jVar2 = jVar;
                    if (jVar2 != null) {
                        if (jVar2.f122332a != 1 || com.bytedance.ies.ugc.appcontext.d.k()) {
                            I18nSettingNewVersionActivity.this.p.a(false);
                        } else {
                            I18nSettingNewVersionActivity.this.p.a(true);
                        }
                    }
                    com.ss.android.ugc.aweme.live.j m2 = LiveOuterService.s().m();
                    if (m2 != null) {
                        HashMap hashMap = new HashMap();
                        if (jVar2 != null) {
                            i2 = new StringBuilder().append(jVar2.f122332a).toString();
                        } else {
                            i2 = -1;
                        }
                        hashMap.put("live_replay_show", i2);
                        m2.a("ttlive_live_replay_setting_entrance_show_all", 0, hashMap);
                    }
                }
            }, com.ss.android.ugc.aweme.base.m.f68150a);
        }
        User c2 = in.c();
        if (!(c2 == null || c2.getCommerceUserInfo() == null)) {
            if (c2.getCommerceUserInfo().isHasAdExperienceEntry() || c2.getCommerceUserInfo().isHasAdFeedbackEntry()) {
                this.q.a(true);
                if (!TextUtils.isEmpty(c2.getCommerceUserInfo().getAdExperienceText())) {
                    this.q.a(c2.getCommerceUserInfo().getAdExperienceText());
                }
            } else {
                this.q.a(false);
            }
        }
        SettingsManagerProxy.inst().registerSettingsWatcher(this, false);
        Z();
        com.ss.android.ugc.aweme.creatortools.api.c.f78379a = null;
        com.ss.android.ugc.aweme.creatortools.api.c.a(true, this.aq, null);
        r.a("proaccount_enter_for_experiment", new d().a("verify_proaccount_server_exp", String.valueOf(com.bytedance.ies.abmock.b.a().a(true, "verify_proaccount_server_exp", false))).a("verify_proaccount_precise_exp", String.valueOf(com.bytedance.ies.abmock.b.a().a(true, "verify_proaccount_precise_exp", false))).a("verify_proaccount_precise_did_exp", String.valueOf(com.bytedance.ies.abmock.b.a().a(true, "verify_proaccount_precise_did_exp", false))).f66730a);
        if (com.ss.android.ugc.aweme.compliance.api.a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && !isFinishing()) {
            com.ss.android.ugc.aweme.compliance.api.a.r().a(this, "deeplink");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        ITpcConsentService f122770a;

        /* renamed from: b  reason: collision with root package name */
        boolean f122771b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<Activity> f122772c;

        static {
            Covode.recordClassIndex(80586);
        }

        public a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f122770a = iTpcConsentService;
            this.f122771b = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
            this.f122772c = new WeakReference<>(activity);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 19 && i3 == -1) {
            UgCommonServiceImpl.j().b().a("app_update_click");
        }
    }
}

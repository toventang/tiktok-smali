package com.ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.j;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.feed.i.ab;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.i;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.request_combine.request.a.e;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.settingsrequest.api.g;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.y;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collections;
import java.util.Objects;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109022a;

    static {
        Covode.recordClassIndex(69813);
    }

    private static void b() {
        new YoutubeRefreshTask().a(com.bytedance.ies.ugc.appcontext.d.a());
    }

    private static void c() {
        IWalletService iWalletService = (IWalletService) a.a(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.walletCenter().c();
        }
    }

    private static void d() {
        i k2 = LiveOuterService.s().k();
        if (k2 != null && k2.b() != null) {
            k2.b().a(com.bytedance.ies.ugc.appcontext.d.a());
        }
    }

    private static void a() {
        if (j.a().c()) {
            f.e().a(new e(1)).a();
        } else {
            by.f122128a.a((Context) null);
            com.ss.android.ugc.aweme.settingsrequest.a.b();
            com.ss.android.ugc.aweme.settingsrequest.api.a.a();
            c.b();
        }
        f.e().a(new g()).a();
    }

    public static void a(Bundle bundle) {
        Intent mainActivityIntent = MainActivity.getMainActivityIntent(com.bytedance.ies.ugc.appcontext.d.a());
        mainActivityIntent.putExtras(bundle);
        mainActivityIntent.setFlags(268468224);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 != null) {
            com.ss.android.ugc.tiktok.security.a.a.a(mainActivityIntent, j2);
            j2.startActivity(mainActivityIntent);
            if (j2.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                j2.finishAndRemoveTask();
            } else {
                j2.finish();
            }
        } else if (com.bytedance.ies.ugc.appcontext.d.a() != null) {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            com.ss.android.ugc.tiktok.security.a.a.a(mainActivityIntent, a2);
            a2.startActivity(mainActivityIntent);
        }
    }

    static final /* synthetic */ Bundle b(Bundle bundle) {
        a("Switch Account", b.g().getCurUserId());
        int i2 = 1;
        f109022a = true;
        bundle.putBoolean("is_start_by_switch_account", true);
        q.d(false);
        SharePrefCache.inst().clearCache();
        com.ss.android.ugc.aweme.notice.api.b.c();
        com.ss.android.ugc.aweme.notice.api.b.a(false, 5);
        com.bytedance.lobby.internal.d.a().a(Collections.singletonList("kakaotalk"), 3);
        b.i.b(com.ss.android.ugc.trill.c.a.b.f150474a, b.i.f4824a);
        com.ss.android.ugc.aweme.compliance.common.b.f77288b.a(0);
        if (com.ss.android.ugc.aweme.compliance.common.b.f77288b.d() != 0) {
            n.a("not_clear_old_settings", "", (JSONObject) null);
        }
        com.ss.android.ugc.aweme.settingsrequest.e.a.a(null, false);
        com.ss.android.ugc.aweme.im.a.a.c();
        h.f121133a.b();
        a();
        b.g().checkIn();
        User curUser = b.g().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (!TextUtils.isEmpty(accountRegion)) {
                com.ss.android.common.applog.q.a("account_region", accountRegion);
            }
        } else {
            b.b();
        }
        com.ss.android.ugc.aweme.shortcut.e.a(false);
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (!b.g().isChildrenMode() || b.g().allUidList().size() <= 1) {
            bundle.putString("switch_account_success_toast_text", a2.getString(R.string.hft, b.g().getCurUser().getNickname()));
        } else {
            b.g().logoutAllBackgroundUser();
            bundle.putString("switch_account_success_toast_text", a2.getString(R.string.bvz));
        }
        IMService.createIIMServicebyMonsterPlugin(false).resetLoginState();
        c();
        com.ss.android.ugc.aweme.compliance.api.a.o().e();
        com.ss.android.ugc.aweme.compliance.api.a.c().e();
        if (!in.d()) {
            com.ss.android.ugc.aweme.compliance.api.a.c().d();
            com.ss.android.ugc.aweme.compliance.api.a.o().a(null);
            com.ss.android.ugc.aweme.compliance.api.a.r().a(1);
        } else {
            com.ss.android.ugc.aweme.compliance.api.a.r().b(2);
        }
        y.f132385a = null;
        bundle.putBoolean("need_restart", true);
        LiveOuterService.s().d().z();
        b();
        AnchorListManager.a();
        d();
        in.a();
        b.c().saveSharedAccount(null);
        com.ss.android.ugc.aweme.money.growth.g.f110868b.f110870a.a();
        SpecActServiceImpl.i().d();
        com.ss.android.ugc.aweme.compliance.api.a.r().d();
        com.ss.android.ugc.aweme.music.i.d.f111507a.a();
        com.ss.android.ugc.aweme.music.i.d.f111508b.a();
        com.ss.android.ugc.aweme.challenge.b.a.f69908b.a();
        com.ss.android.ugc.aweme.challenge.b.a.f69909c.a();
        ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), in.e());
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h = curUserId;
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("progress_bar_data");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("response_caching_complete");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("response_received");
        a.C2284a.b();
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Object obj = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94988i = ((Integer) obj).intValue();
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.put(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h, 5);
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94988i = 5;
        }
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94982c.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Keva keva = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a;
            Object obj2 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94982c.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            keva.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeBoolean("progress_dismissed_by_user", false);
        }
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94983d.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Keva keva2 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a;
            Object obj3 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94983d.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            keva2.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeInt("milestone_progress_reported", -1);
        }
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeString("progress_map_key", new JSONObject(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b).toString());
        a.C2958a.a();
        com.ss.android.ugc.aweme.preload.b.a.c();
        com.ss.android.ugc.aweme.upvote.service.a.f142308a.c();
        if (!com.ss.android.ugc.aweme.user.f.a(com.ss.android.ugc.aweme.user.e.f142364k.a()) || !in.e()) {
            i2 = 2;
        }
        com.bytedance.ug.sdk.region.data.b.a.a(i2);
        return bundle;
    }

    static final /* synthetic */ Bundle c(Bundle bundle) {
        boolean z;
        a("Login", b.g().getCurUserId());
        AppLog.setUserId(Long.parseLong(b.g().getCurUserId()));
        AppLog.setSessionKey(b.g().getSessionKey());
        q.d(false);
        by.f122128a.a(k.f109031a);
        a();
        b.g().checkIn();
        com.ss.android.ugc.aweme.contentlanguage.j a2 = j.a.a();
        String b2 = a2.f78193a.b();
        int d2 = VPAServiceImpl.h().d();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(b2)) {
            jSONObject.put("content_language_not_login", b2);
        }
        if (d2 != 0) {
            jSONObject.put("vpa_content_choice_not_login", d2);
        }
        int i2 = 1;
        if (jSONObject.length() > 0) {
            ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(LanguageApi.class)).setUnloginContentPreference("settings_not_login", jSONObject.toString()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new j.g());
            z = true;
        } else {
            z = false;
        }
        a2.f78193a.a(false);
        a2.f78193a.a("");
        a2.f78194b = false;
        a2.d();
        if (!z) {
            com.ss.android.ugc.aweme.settingsrequest.e.a.a(null, false);
        }
        if (!in.d() && com.bytedance.ies.abmock.b.a().a(true, "inbox_has_top_msg", false)) {
            new f.b().b((r) new com.ss.android.ugc.aweme.requesttask.idle.f()).a();
        }
        com.ss.android.ugc.aweme.im.a.a.c();
        com.ss.android.ugc.d.a.c.a(new ab());
        User curUser = b.g().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (!TextUtils.isEmpty(accountRegion)) {
                com.ss.android.common.applog.q.a("account_region", accountRegion);
            }
        }
        IMService.createIIMServicebyMonsterPlugin(false).refreshLoginState();
        SharePrefCache.inst().getTodayVideoPlayTime().b(0L);
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a() && bundle != null) {
            bundle.putBoolean("need_restart", true);
        }
        if (SharePrefCache.inst().getIsFirstLaunch().c().booleanValue()) {
            SharePrefCache.inst().getIsFirstLaunch().b(false);
        }
        if (!in.d()) {
            com.ss.android.ugc.aweme.compliance.api.a.c().d();
            com.ss.android.ugc.aweme.compliance.api.a.o().a(null);
            com.ss.android.ugc.aweme.compliance.api.a.r().a(1);
        }
        com.ss.android.ugc.aweme.notice.api.b.a(false, 5);
        LiveOuterService.s().d().z();
        AnchorListManager.a();
        b();
        d();
        in.a();
        b.c().saveSharedAccount(null);
        bundle.putBoolean("is_start_by_login", true);
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b();
        com.ss.android.ugc.aweme.account.n.b.a(2);
        if (in.d()) {
            com.ss.android.ugc.aweme.compliance.api.a.r().b(2);
        }
        com.ss.android.ugc.aweme.compliance.api.a.r().d();
        com.ss.android.ugc.aweme.money.growth.g.f110868b.f110870a.a();
        SpecActServiceImpl.i();
        SecApiImpl.a().updateCollectMode(null);
        ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), in.e());
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h = curUserId;
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("progress_bar_data");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("response_caching_complete");
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.erase("response_received");
        a.C2284a.b();
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Object obj = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94988i = ((Integer) obj).intValue();
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b.put(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h, Integer.valueOf(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94988i));
        }
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94982c.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Keva keva = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a;
            Object obj2 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94982c.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            keva.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeBoolean("progress_dismissed_by_user", false);
        }
        if (com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94983d.containsKey(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h)) {
            Keva keva2 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a;
            Object obj3 = com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94983d.get(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94987h);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            keva2.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeInt("milestone_progress_reported", -1);
        }
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94980a.storeString("progress_map_key", new JSONObject(com.ss.android.ugc.aweme.feed.ui.progressguidance.a.f94981b).toString());
        com.ss.android.ugc.aweme.utils.r.a();
        a.C2958a.a();
        com.ss.android.ugc.aweme.preload.b.a.c();
        if (!com.ss.android.ugc.aweme.user.f.a(com.ss.android.ugc.aweme.user.e.f142364k.a()) || !in.e()) {
            i2 = 2;
        }
        com.bytedance.ug.sdk.region.data.b.a.a(i2);
        return bundle;
    }

    static final /* synthetic */ Bundle a(Bundle bundle, com.ss.android.ugc.aweme.ac.b bVar) {
        a("Logout", in.c().getUid());
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        q.d(true);
        SharePrefCache.inst().clearCache();
        b.i.b(com.ss.android.ugc.trill.c.a.b.f150474a, b.i.f4824a);
        com.ss.android.ugc.aweme.compliance.api.a.e().e();
        com.ss.android.ugc.aweme.im.a.a.d();
        a();
        com.ss.android.ugc.aweme.compliance.api.a.o().e();
        bundle.putBoolean("restart_from_logout", true);
        bundle.putBoolean("is_logout_from_ftc_user", bVar.f62561a);
        com.ss.android.ugc.aweme.compliance.api.a.m().c();
        com.ss.android.ugc.aweme.compliance.api.a.j().a();
        com.ss.android.ugc.aweme.compliance.api.a.m().b();
        new Handler().postDelayed(new i(j2), 500);
        AVExternalServiceImpl.a().configService().userAction(2);
        in.a();
        b.c().clearSharedAccount(null);
        b.a();
        com.ss.android.ugc.aweme.compliance.api.a.r().d();
        ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), in.e());
        com.ss.android.ugc.aweme.compliance.api.a.r().b(5);
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.a();
        a.C2958a.a();
        com.ss.android.ugc.aweme.preload.b.a.c();
        com.ss.android.ugc.aweme.upvote.service.a.f142308a.c();
        return bundle;
    }

    private static void a(String str, String str2) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("operation", str);
        aVar.put("uid", str2);
        aVar.put("region_source", com.bytedance.ttnet.b.b.f44542c);
        aVar.put("region_code", com.bytedance.ttnet.b.b.f44541b);
        aVar.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        com.bytedance.helios.api.a.get().recordRegionEvent(aVar);
    }

    static final /* synthetic */ Bundle b(Bundle bundle, com.ss.android.ugc.aweme.ac.b bVar) {
        a("Logout", in.c().getUid());
        q.d(true);
        SharePrefCache.inst().clearCache();
        com.ss.android.ugc.aweme.notice.api.b.c();
        com.bytedance.lobby.internal.d.a().a(Collections.singletonList("kakaotalk"), 2);
        b.i.b(com.ss.android.ugc.trill.c.a.b.f150474a, b.i.f4824a);
        com.ss.android.ugc.aweme.compliance.api.a.e().e();
        com.ss.android.ugc.aweme.im.a.a.d();
        e.a.f112592a.b();
        h.f121133a.b();
        a();
        c();
        com.ss.android.ugc.aweme.compliance.api.a.o().e();
        com.ss.android.ugc.aweme.compliance.api.a.c().e();
        com.ss.android.ugc.aweme.qrcode.e.d.d(0);
        com.ss.android.ugc.aweme.qrcode.e.d.d(1);
        y.f132385a = null;
        bundle.putBoolean("restart_from_logout", true);
        bundle.putBoolean("is_logout_from_ftc_user", bVar.f62561a);
        com.ss.android.ugc.aweme.compliance.api.a.j().a();
        com.ss.android.ugc.aweme.compliance.api.a.m().b();
        d();
        new Handler().postDelayed(new j(bundle), 500);
        IMService.createIIMServicebyMonsterPlugin(false).refreshLoginState();
        AVExternalServiceImpl.a().configService().userAction(2);
        com.ss.android.ugc.aweme.base.h.d.c().b("last_share_type", (String) null);
        LiveOuterService.s().d().z();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.g());
        in.a();
        b.c().clearSharedAccount(null);
        AnchorListManager.a();
        b.a();
        SpecActServiceImpl.i().c();
        com.ss.android.ugc.aweme.compliance.api.a.r().d();
        com.ss.android.ugc.aweme.compliance.api.a.r().a(4);
        SecApiImpl.a().updateCollectMode(null);
        ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), in.e());
        com.ss.android.ugc.aweme.feed.ui.progressguidance.a.a();
        a.C2958a.a();
        com.ss.android.ugc.aweme.preload.b.a.c();
        com.ss.android.ugc.aweme.upvote.service.a.f142308a.c();
        return bundle;
    }
}

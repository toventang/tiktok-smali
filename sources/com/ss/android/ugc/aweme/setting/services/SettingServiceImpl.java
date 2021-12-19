package com.ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.i;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.w;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.k;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.experiment.dn;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.profile.f.ag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.bf;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.b.g;
import com.ss.android.ugc.aweme.setting.serverpush.b.j;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity;
import com.ss.android.ugc.aweme.utils.ei;
import com.ss.android.ugc.aweme.utils.hp;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.playerkit.model.v;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public final class SettingServiceImpl extends BaseSettingServiceImpl {
    static {
        Covode.recordClassIndex(80512);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean d() {
        return hp.a.i();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean e() {
        return I18nSettingNewVersionActivity.B();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean s() {
        return ag.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> t() {
        return new g();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> u() {
        return new j();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Map<String, com.ss.android.ugc.aweme.language.b> j() {
        com.ss.android.ugc.aweme.i18n.language.i18n.b bVar = b.a.f99809a;
        l.b(bVar, "");
        Map<String, com.ss.android.ugc.aweme.language.b> map = bVar.f99801b;
        l.b(map, "");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String l() {
        l.b(b.a.f99809a, "");
        return com.ss.android.ugc.aweme.i18n.language.i18n.b.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean f() {
        if (((Number) dn.f89808a.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean g() {
        if (com.ss.android.ugc.aweme.setting.n.a.a().getBoolean("has_show_disk_manager_guide", false) || DiskManagerPage.a.c() < DiskManagerPage.a.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String h() {
        l.b(b.a.f99809a, "");
        String a2 = com.ss.android.ugc.aweme.i18n.language.i18n.b.a(com.ss.android.ugc.aweme.i18n.language.a.a());
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<com.ss.android.ugc.aweme.language.b> i() {
        com.ss.android.ugc.aweme.i18n.language.i18n.b bVar = b.a.f99809a;
        l.b(bVar, "");
        return new ArrayList(bVar.f99801b.values());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String k() {
        l.b(b.a.f99809a, "");
        String a2 = com.ss.android.ugc.aweme.i18n.language.i18n.b.a(Locale.getDefault());
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String n() {
        l.b(b.a.f99809a, "");
        return com.ss.android.ugc.aweme.i18n.language.a.b("key_current_region", com.ss.android.ugc.aweme.i18n.language.a.a().getCountry());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean p() {
        com.ss.android.ugc.aweme.i18n.language.i18n.b bVar = b.a.f99809a;
        l.b(bVar, "");
        d.a();
        return TextUtils.equals(bVar.b().c().getCountry(), "KR");
    }

    public static ISettingService v() {
        MethodCollector.i(6872);
        Object a2 = com.ss.android.ugc.b.a(ISettingService.class, false);
        if (a2 != null) {
            ISettingService iSettingService = (ISettingService) a2;
            MethodCollector.o(6872);
            return iSettingService;
        }
        if (com.ss.android.ugc.b.dQ == null) {
            synchronized (ISettingService.class) {
                try {
                    if (com.ss.android.ugc.b.dQ == null) {
                        com.ss.android.ugc.b.dQ = new SettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6872);
                    throw th;
                }
            }
        }
        BaseSettingServiceImpl baseSettingServiceImpl = (BaseSettingServiceImpl) com.ss.android.ugc.b.dQ;
        MethodCollector.o(6872);
        return baseSettingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<com.ss.android.ugc.aweme.setting.serverpush.a> a() {
        return n.b(new w(), com.ss.android.ugc.aweme.setting.page.privacy.a.f122527a, com.ss.android.ugc.aweme.setting.g.a.f122198b, com.ss.android.ugc.aweme.browserecord.a.f68794a);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean b() {
        if (!hp.a.d() || !hp.a.c() || !hp.a.a()) {
            return false;
        }
        if (hp.a.b()) {
            return true;
        }
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (curUser != null && curUser.getAccountType() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean c() {
        if (!hp.a.h()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            if (curUser.getProAccountUpdateNotificationStatus() != 1 || !hp.a.i()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String m() {
        l.b(b.a.f99809a, "");
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.i18n.language.a.b("key_current_region", com.ss.android.ugc.aweme.i18n.language.i18n.b.a()))) {
            return com.ss.android.ugc.aweme.i18n.language.a.b("key_current_region", com.ss.android.ugc.aweme.i18n.language.i18n.b.a());
        }
        return com.ss.android.ugc.aweme.i18n.language.i18n.b.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean o() {
        l.b(b.a.f99809a, "");
        String b2 = com.ss.android.ugc.aweme.i18n.a.c.f99766a.b();
        if (TextUtils.isEmpty(b2) || !b2.startsWith("510")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale q() {
        l.b(b.a.f99809a, "");
        com.ss.android.ugc.aweme.i18n.language.i18n.b bVar = b.a.f99809a;
        d.a();
        Locale locale = new Locale(bVar.b().b(), com.ss.android.ugc.aweme.language.d.g());
        l.b(locale, "");
        return locale;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void r() {
        String accountRegion;
        MethodCollector.i(6719);
        if (g.f122674a) {
            MethodCollector.o(6719);
            return;
        }
        synchronized (this) {
            try {
                if (!g.f122674a) {
                    a aVar = new a(this);
                    if (q.f59326d == null) {
                        q.f59326d = aVar;
                    }
                    q.a("mcc_mnc", k.a());
                    q.a("app_type", "normal");
                    TimeZone timeZone = TimeZone.getDefault();
                    l.b(timeZone, "");
                    q.a("timezone_name", timeZone.getID());
                    SharePrefCache inst = SharePrefCache.inst();
                    l.b(inst, "");
                    aj<String> userCurrentRegion = inst.getUserCurrentRegion();
                    l.b(userCurrentRegion, "");
                    q.a("current_region", userCurrentRegion.c());
                    SharePrefCache inst2 = SharePrefCache.inst();
                    l.b(inst2, "");
                    aj<String> userResidence = inst2.getUserResidence();
                    l.b(userResidence, "");
                    q.a("residence", userResidence.c());
                    q.a("carrier_region_v2", com.ss.android.ugc.trill.f.b.f150483a.b());
                    q.a("sys_region", l());
                    q.a("language", k());
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    User curUser = g2.getCurUser();
                    if (!(curUser == null || (accountRegion = curUser.getAccountRegion()) == null || accountRegion.length() == 0)) {
                        q.a("account_region", accountRegion);
                    }
                    g.f122674a = true;
                    MethodCollector.o(6719);
                }
            } finally {
                MethodCollector.o(6719);
            }
        }
    }

    static final class a implements q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingServiceImpl f122666a;

        static {
            Covode.recordClassIndex(80513);
        }

        a(SettingServiceImpl settingServiceImpl) {
            this.f122666a = settingServiceImpl;
        }

        @Override // com.ss.android.common.applog.q.b
        public final HashMap<String, String> a() {
            String str;
            String str2;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("app_language", this.f122666a.h());
            if (!in.d()) {
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                l.b(createIMainServicebyMonsterPlugin, "");
                hashMap.put("uoo", String.valueOf(createIMainServicebyMonsterPlugin.isLimitAdTrackingEnabled() ? 1 : 0));
            }
            hashMap.put("build_number", d.i());
            hashMap.put("locale", com.ss.android.ugc.aweme.i18n.language.a.b());
            TimeZone timeZone = TimeZone.getDefault();
            l.b(timeZone, "");
            hashMap.put("timezone_offset", String.valueOf(timeZone.getRawOffset() / 1000));
            hashMap.put("carrier_region", com.ss.android.ugc.aweme.language.d.h());
            hashMap.put("region", this.f122666a.m());
            hashMap.put("op_region", com.ss.android.ugc.aweme.language.d.a());
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                l.b(strArr, "");
                if (strArr.length == 0) {
                    str = null;
                } else {
                    str = strArr[0];
                }
            }
            hashMap.put("host_abi", str);
            hashMap.put("ts", String.valueOf(NetworkUtils.getServerTime()));
            if (TextUtils.equals(d.u, "lark_inhouse")) {
                hashMap.put("fake_region", com.ss.android.ugc.aweme.language.d.h());
            }
            Context a2 = d.a();
            if (a2 == null) {
                str2 = "";
            } else if (Build.VERSION.SDK_INT < 24) {
                if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107223b) || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107223b = com.bytedance.common.utility.l.e(a2);
                }
                str2 = com.ss.android.ugc.aweme.lancet.j.f107223b;
            } else {
                if (com.ss.android.common.util.d.f59382a == null) {
                    com.ss.android.common.util.d.f59382a = new com.bytedance.n.b(a2);
                }
                String d2 = com.ss.android.common.util.d.f59382a.f41596d.d();
                if ("WIFI".equals(d2)) {
                    if (com.bytedance.common.utility.l.a(com.ss.android.common.util.d.f59382a.f41596d.b())) {
                        str2 = "wifi5g";
                    } else {
                        str2 = "wifi";
                    }
                } else if ("MOBILE".equals(d2)) {
                    com.bytedance.n.a aVar = com.ss.android.common.util.d.f59382a.f41596d;
                    if (Build.VERSION.SDK_INT < 24 || (!aVar.f41584h && !"NR".equals(aVar.f41579c))) {
                        switch (com.ss.android.common.util.d.f59382a.f41596d.f41577a) {
                            case 1:
                                str2 = "gprs";
                                break;
                            case 2:
                                str2 = "edge";
                                break;
                            case 3:
                                str2 = "umts";
                                break;
                            case 4:
                                str2 = "cdma";
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                str2 = "evdo_0";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                str2 = "evdo_a";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                str2 = "1xrtt";
                                break;
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                str2 = "hsdpa";
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                str2 = "hsupa";
                                break;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                str2 = "hspa";
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                str2 = "iden";
                                break;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                str2 = "evdo_b";
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                str2 = "lte";
                                break;
                            case ABRConfig.ABR_SELECT_SCENE:
                                str2 = "ehrpd";
                                break;
                            case 15:
                                str2 = "hspap";
                                break;
                            case 16:
                                str2 = "gsm";
                                break;
                            case 17:
                                str2 = "td_scdma";
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT:
                            default:
                                str2 = com.ss.android.common.util.d.f59382a.f41596d.c();
                                break;
                            case 19:
                                str2 = "lte_ca";
                                break;
                            case v.U:
                                str2 = "nr";
                                break;
                        }
                    } else {
                        str2 = "5g";
                    }
                } else {
                    str2 = "unknown";
                }
            }
            hashMap.put("ac2", str2);
            IContentLanguageService f2 = ContentLanguageServiceImpl.f();
            l.b(f2, "");
            hashMap.put("content_language", f2.e());
            return hashMap;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String a(Locale locale) {
        return com.ss.android.ugc.aweme.i18n.language.i18n.b.a(locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final com.ss.android.ugc.aweme.language.b a(Context context) {
        l.d(context, "");
        com.ss.android.ugc.aweme.language.b b2 = b.a.f99809a.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean b(Context context) {
        String str = "";
        l.d(context, str);
        if (context != null) {
            str = com.ss.android.ugc.aweme.i18n.language.a.b(context, "pref_language_key", str);
        }
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getLanguage();
        }
        return com.bytedance.helios.sdk.d.f.f30878a.equals(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.language.b bVar = b.a.f99809a.f99801b.get(str);
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(Activity activity) {
        l.d(activity, "");
        bf.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse a(String str, int i2) {
        BaseResponse a2 = PushSettingsApiManager.a(str, i2);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String a(String str, Map<String, String> map) {
        int i2;
        l.d(str, "");
        l.d(map, "");
        l.d(str, "");
        l.d(map, "");
        HashMap hashMap = new HashMap();
        String queryParameter = Uri.parse(str).getQueryParameter("url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        l.b(queryParameter, "");
        int a2 = p.a((CharSequence) queryParameter, '?', 0, false, 6);
        if (a2 > 0 && queryParameter.length() > (i2 = a2 + 1)) {
            Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type java.lang.String");
            String substring = queryParameter.substring(i2);
            l.b(substring, "");
            com.ss.android.ugc.aweme.feedback.b.a(substring, hashMap);
        }
        hashMap.putAll(map);
        String b2 = com.ss.android.ugc.aweme.feedback.b.b(queryParameter, hashMap);
        String encode = URLEncoder.encode(queryParameter);
        l.b(encode, "");
        String encode2 = URLEncoder.encode(b2);
        l.b(encode2, "");
        return p.a(str, encode, encode2, true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(boolean z, i iVar) {
        l.d(iVar, "");
        if (com.bytedance.ies.abmock.b.a().a(true, "link_privacy_guide_dialog_enable", 0) == 1) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                String curUserId = g3.getCurUserId();
                l.b(curUserId, "");
                ei eiVar = new ei(curUserId, z, iVar);
                if (!eiVar.a().getBoolean(eiVar.f142851a, false)) {
                    eiVar.b().getLinkPrivacyPopupStatus().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ei.f(eiVar), ei.g.f142861a);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        b.a.f99809a.a(str, str2, context);
    }
}

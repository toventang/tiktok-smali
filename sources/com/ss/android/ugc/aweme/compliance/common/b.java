package com.ss.android.ugc.aweme.compliance.common;

import android.app.Activity;
import androidx.lifecycle.m;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.ss.android.ugc.aweme.compliance.api.model.Strategy;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.common.a;
import com.ss.android.ugc.aweme.compliance.common.b.a;
import com.ss.android.ugc.aweme.main.j;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.a.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.compliance.common.d.a f77287a = new com.ss.android.ugc.aweme.compliance.common.d.a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f77288b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static int f77289c = 3;

    /* renamed from: d  reason: collision with root package name */
    static boolean f77290d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f77291e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f77292f = am.a((Object[]) new String[]{"uoo", "idfa", "webcast_language", "webcast_locale", "content_language", "allow_sell_data", "longitude", "webcast_sdk_version", "gaid", "gps_access", "address_book_access", "city", "city_name", "latitude", "ad_personality_mode", "search_source", "show_location", "mac_address", "google_aid", "android_id", "bid_ad_params", "ad_user_agent", "ssid", "openudid", "idfv", "vid"});

    /* renamed from: g  reason: collision with root package name */
    public static volatile HashMap<String, Strategy> f77293g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f77294h = true;

    /* renamed from: i  reason: collision with root package name */
    public static volatile InterfaceControlSettings f77295i;

    /* renamed from: j  reason: collision with root package name */
    public static final List<com.ss.android.ugc.aweme.compliance.api.c.e> f77296j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public static final b f77297k = new b();

    /* renamed from: l  reason: collision with root package name */
    private static final Object f77298l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static final Object f77299m = new Object();

    private b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b$b  reason: collision with other inner class name */
    public static final class C1778b implements com.ss.android.ugc.aweme.compliance.common.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.services.agegate.b f77314a;

        static {
            Covode.recordClassIndex(47804);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.b
        public final void a() {
            com.ss.android.ugc.aweme.compliance.api.services.agegate.b bVar = this.f77314a;
            if (bVar != null) {
                bVar.a();
            }
        }

        C1778b(com.ss.android.ugc.aweme.compliance.api.services.agegate.b bVar) {
            this.f77314a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.b
        public final void a(ComplianceSetting complianceSetting) {
            l.d(complianceSetting, "");
            b.e();
            if (b.d()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            com.ss.android.ugc.aweme.compliance.api.services.agegate.b bVar = this.f77314a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public static int c() {
        Integer b2 = f77288b.b();
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public static boolean d() {
        Boolean e2 = f77288b.e();
        if (e2 != null) {
            return e2.booleanValue();
        }
        return false;
    }

    public static AdPersonalitySettings i() {
        ComplianceSetting c2 = f77288b.c();
        if (c2 != null) {
            return c2.getAdPersonalitySettings();
        }
        return null;
    }

    public static TermsConsentInfo o() {
        ComplianceSetting c2 = f77288b.c();
        if (c2 != null) {
            return c2.getTermsConsentInfo();
        }
        return null;
    }

    public static final class c implements com.ss.android.ugc.aweme.compliance.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f77315a;

        static {
            Covode.recordClassIndex(47805);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void b() {
            new com.ss.android.ugc.aweme.tux.a.i.a(f.j()).a(R.string.bre).a();
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void a() {
            ComplianceSetting complianceSetting;
            Boolean bool;
            Integer num;
            Boolean bool2;
            AdPersonalitySettings i2 = b.i();
            AdPersonalitySettings adPersonalitySettings = null;
            Integer num2 = null;
            if (i2 != null) {
                Integer valueOf = Integer.valueOf(this.f77315a);
                AdPersonalitySettings i3 = b.i();
                if (i3 != null) {
                    bool = i3.getShowThirdAd();
                } else {
                    bool = null;
                }
                if (l.a((Object) bool, (Object) true)) {
                    num = Integer.valueOf(this.f77315a);
                } else {
                    num = null;
                }
                AdPersonalitySettings i4 = b.i();
                if (i4 != null) {
                    bool2 = i4.getShowPartnerAd();
                } else {
                    bool2 = null;
                }
                if (l.a((Object) bool2, (Object) true)) {
                    num2 = Integer.valueOf(this.f77315a);
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i2, valueOf, null, null, null, null, null, null, num, num2, null, null, null, null, null, null, null, null, null, null, null, 1048190, null);
            }
            ComplianceSetting c2 = b.f77288b.c();
            if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            b.b(complianceSetting);
            if (f.j() instanceof j) {
                new com.ss.android.ugc.aweme.tux.a.i.a(f.j()).a(R.string.et_).a();
            }
        }

        c(int i2) {
            this.f77315a = i2;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.compliance.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f77316a;

        static {
            Covode.recordClassIndex(47806);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void b() {
            new com.ss.android.ugc.aweme.tux.a.i.a(f.j()).a(R.string.bre).a();
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void a() {
            NewPersAdSettings newPersAdSettings;
            ComplianceSetting complianceSetting;
            NewPersAdSettings g2 = b.g();
            NewPersAdSettings g3 = b.g();
            AdPersonalitySettings adPersonalitySettings = null;
            if (g3 != null) {
                newPersAdSettings = NewPersAdSettings.copy$default(g3, Integer.valueOf(this.f77316a), null, null, null, null, null, null, null, 254, null);
            } else {
                newPersAdSettings = null;
            }
            AdPersonalitySettings i2 = b.i();
            if (i2 != null) {
                if (newPersAdSettings != null) {
                    g2 = newPersAdSettings;
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g2, null, 786431, null);
            }
            ComplianceSetting c2 = b.f77288b.c();
            if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            b.b(complianceSetting);
            if (f.j() instanceof j) {
                new com.ss.android.ugc.aweme.tux.a.i.a(f.j()).a(R.string.et_).a();
            }
        }

        public d(int i2) {
            this.f77316a = i2;
        }
    }

    public static boolean b() {
        Boolean isFollowSystemConfig;
        AdPersonalitySettings i2 = i();
        if (i2 == null || (isFollowSystemConfig = i2.isFollowSystemConfig()) == null) {
            return false;
        }
        return isFollowSystemConfig.booleanValue();
    }

    public static int f() {
        AdPersonalitySettings adPersonalitySettings;
        Integer mode;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (mode = adPersonalitySettings.getMode()) == null) {
            return 0;
        }
        return mode.intValue();
    }

    public static NewPersAdSettings g() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null) {
            return null;
        }
        return adPersonalitySettings.getNewPersAdSettings();
    }

    public static int h() {
        AdPersonalitySettings adPersonalitySettings;
        Integer settingType;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (adPersonalitySettings = c2.getAdPersonalitySettings()) == null || (settingType = adPersonalitySettings.getSettingType()) == null) {
            return 0;
        }
        return settingType.intValue();
    }

    public static List<String> j() {
        List<String> blackSetting;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (blackSetting = c2.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    public static String k() {
        String impressumUrl;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (impressumUrl = c2.getImpressumUrl()) == null) {
            return "";
        }
        return impressumUrl;
    }

    public static boolean l() {
        Boolean enableTermsConsentPopup;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (enableTermsConsentPopup = c2.getEnableTermsConsentPopup()) == null) {
            return false;
        }
        return enableTermsConsentPopup.booleanValue();
    }

    public static String m() {
        TermsConsentInfo termsConsentInfo;
        String termsOfUseUrl;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (termsConsentInfo = c2.getTermsConsentInfo()) == null || (termsOfUseUrl = termsConsentInfo.getTermsOfUseUrl()) == null) {
            return "";
        }
        return termsOfUseUrl;
    }

    public static String n() {
        TermsConsentInfo termsConsentInfo;
        String privacyPolicyUrl;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (termsConsentInfo = c2.getTermsConsentInfo()) == null || (privacyPolicyUrl = termsConsentInfo.getPrivacyPolicyUrl()) == null) {
            return "";
        }
        return privacyPolicyUrl;
    }

    public static List<String> p() {
        List<String> kidsEvents;
        ComplianceSetting c2 = f77288b.c();
        if (c2 == null || (kidsEvents = c2.getKidsEvents()) == null) {
            return q();
        }
        return kidsEvents;
    }

    private static List<String> q() {
        String[] stringArray = com.bytedance.ies.ugc.appcontext.d.a().getResources().getStringArray(R.array.a3);
        l.b(stringArray, "");
        return i.j(stringArray);
    }

    public static void e() {
        if (b()) {
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            aj<Boolean> n = sVar.n();
            l.b(n, "");
            Boolean c2 = n.c();
            l.b(c2, "");
            if (c2.booleanValue() && f() == 1) {
                a(false, "", "");
            }
        }
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f77313a;

        static {
            Covode.recordClassIndex(47803);
        }

        public a(Activity activity) {
            this.f77313a = activity;
        }

        public final void run() {
            com.ss.android.ugc.aweme.compliance.api.a.g().a(this.f77313a, null);
            Activity activity = this.f77313a;
            l.d(activity, "");
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a((androidx.fragment.app.e) activity);
            aVar2.f33424a = b.a.AGE_GATE;
            aVar2.f33428e = b.d.AGE_GATE;
            aVar.a(aVar2.a(new a.C1775a(activity)));
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar3 = a.C0732a.f33434a;
            DialogContext.a aVar4 = new DialogContext.a((m) activity);
            aVar4.f33424a = b.a.POLICY_NOTICE;
            aVar4.f33428e = b.d.POLICY_NOTICE;
            aVar3.a(aVar4.a(new a.b()));
            com.ss.android.ugc.d.a.c.b(new com.ss.android.ugc.aweme.compliance.api.b.b());
        }
    }

    static {
        Covode.recordClassIndex(47802);
    }

    public static final class e implements com.ss.android.ugc.aweme.compliance.common.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f77317a;

        static {
            Covode.recordClassIndex(47807);
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.compliance.common.d.c
        public final void a() {
            AdPersonalitySettings adPersonalitySettings;
            ComplianceSetting complianceSetting;
            AdPersonalitySettings i2 = b.i();
            if (i2 != null) {
                adPersonalitySettings = AdPersonalitySettings.copy$default(i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f77317a), null, null, null, null, null, 1032191, null);
            } else {
                adPersonalitySettings = null;
            }
            ComplianceSetting c2 = b.f77288b.c();
            if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
            }
            b.b(complianceSetting);
        }

        public e(boolean z) {
            this.f77317a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings a() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.common.b.a():com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings");
    }

    public static void a(int i2) {
        f77288b.a(Integer.valueOf(i2));
    }

    public static void b(ComplianceSetting complianceSetting) {
        l.d(complianceSetting, "");
        f77288b.a(complianceSetting);
    }

    public static void a(com.ss.android.ugc.aweme.compliance.api.services.agegate.b bVar) {
        f77287a.a(new C1778b(bVar));
    }

    public static void a(ComplianceSetting complianceSetting) {
        int i2;
        l.d(complianceSetting, "");
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = f77288b;
        aVar.a(complianceSetting.getAfSharingBlock());
        aVar.a(complianceSetting.getDeviceLimitRegisterExpiredTime());
        AgeGateInfo ageGateInfo = complianceSetting.getAgeGateInfo();
        if (ageGateInfo != null) {
            i2 = ageGateInfo.getRegisterAgeGateAction();
        } else {
            i2 = 0;
        }
        aVar.b(Integer.valueOf(i2));
        aVar.a(complianceSetting);
        a(complianceSetting.getComplianceEncrypt());
    }

    public static void a(String str) {
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = f77288b;
        aVar.f77305e = str;
        aVar.f77301a.storeString("cmpl_enc", str);
    }

    public static void a(String str, com.ss.android.ugc.aweme.compliance.common.d.c cVar) {
        l.d(str, "");
        f77287a.a(str, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(boolean z, String str, String str2) {
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        l.d(str2, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", String.valueOf(z ? 1 : 0)));
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        String str8 = "on";
        if (z == 0) {
            str3 = str8;
        } else {
            str3 = "off";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("initial_status", str3);
        if (z != 0) {
            str4 = str8;
        } else {
            str4 = "off";
        }
        r.a("change_personalization_status", a2.a("final_status", str4).f66730a);
        AdPersonalitySettings i2 = i();
        Boolean bool2 = null;
        if (i2 != null) {
            bool = i2.getShowThirdAd();
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_third_party_networks_mode").put("value", String.valueOf((int) z)));
            com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
            if (z == 0) {
                str6 = str8;
            } else {
                str6 = "off";
            }
            com.ss.android.ugc.aweme.app.f.d a3 = dVar2.a("initial_status", str6);
            if (z != 0) {
                str7 = str8;
            } else {
                str7 = "off";
            }
            r.a("change_ad_third_party_network_status", a3.a("final_status", str7).f66730a);
        }
        AdPersonalitySettings i3 = i();
        if (i3 != null) {
            bool2 = i3.getShowPartnerAd();
        }
        if (l.a((Object) bool2, (Object) true)) {
            jSONArray.put(new JSONObject().put("field", "pers_ad_data_received_partner_mode").put("value", String.valueOf((int) z)));
            com.ss.android.ugc.aweme.app.f.d dVar3 = new com.ss.android.ugc.aweme.app.f.d();
            if (z == 0) {
                str5 = str8;
            } else {
                str5 = "off";
            }
            com.ss.android.ugc.aweme.app.f.d a4 = dVar3.a("initial_status", str5);
            if (z == 0) {
                str8 = "off";
            }
            r.a("change_ad_data_from_partner_status", a4.a("final_status", str8).f66730a);
        }
        if (!l.a((Object) str, (Object) "")) {
            jSONArray.put(new JSONObject().put("field", str).put("value", str2));
        }
        String jSONArray2 = jSONArray.toString();
        l.b(jSONArray2, "");
        a(jSONArray2, new c(z));
    }
}

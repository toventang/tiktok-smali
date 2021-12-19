package com.ss.android.ugc.aweme.i18n.language.i18n;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.i18n.language.a.i;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl;
import com.ss.android.ugc.aweme.video.preload.s;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f99800a = (Api.f66569d + "/aweme/v1/device/update/");

    /* renamed from: b  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.aweme.language.b> f99801b;

    /* renamed from: c  reason: collision with root package name */
    public CommonApi f99802c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f99809a = new b((byte) 0);

        static {
            Covode.recordClassIndex(63630);
        }
    }

    public static String a() {
        return Resources.getSystem().getConfiguration().locale.getCountry();
    }

    static {
        Covode.recordClassIndex(63627);
    }

    public final com.ss.android.ugc.aweme.language.b b() {
        com.ss.android.ugc.aweme.language.b bVar = this.f99801b.get(com.ss.android.ugc.aweme.i18n.language.a.b());
        if (bVar != null) {
            return bVar;
        }
        return this.f99801b.get("en");
    }

    private b() {
        this.f99801b = new LinkedHashMap();
        if ("local_test".equals(d.s) || "lark_inhouse".equals(d.s)) {
            this.f99801b.put("sq", new a("sq", "sq", "", "Translate To Key"));
        }
        this.f99801b.put("en", new a("en", "en", "", "English"));
        this.f99801b.put(f.f30878a, new a(f.f30878a, f.f30878a, "", "العربية"));
        this.f99801b.put("de-DE", new a("de-DE", "de", "DE", "Deutsch"));
        this.f99801b.put("es", new a("es", "es", "", "Español"));
        this.f99801b.put("fi-FI", new a("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f99801b.put("fr", new a("fr", "fr", "", "Français"));
        this.f99801b.put("fr-CA", new a("fr-CA", "fr", "CA", "Français (Canada)"));
        this.f99801b.put("id-ID", new a("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f99801b.put("ja-JP", new a("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f99801b.put("ko-KR", new a("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f99801b.put("ms-MY", new a("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f99801b.put("ru-RU", new a("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f99801b.put("th-TH", new a("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f99801b.put("tr-TR", new a("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f99801b.put("vi-VN", new a("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        this.f99801b.put("zh-Hant-TW", new a("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        this.f99801b.put("zh-Hans", new a("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
        this.f99801b.put("he-IL", new a("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f99801b.put("jv-ID", new a("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        this.f99801b.put("ceb-PH", new a("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f99801b.put("cs-CZ", new a("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f99801b.put("it-IT", new a("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f99801b.put("hu-HU", new a("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f99801b.put("nl-NL", new a("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f99801b.put("pl-PL", new a("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f99801b.put("pt-BR", new a("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f99801b.put("ro-RO", new a("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f99801b.put("sv-SE", new a("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f99801b.put("fil-PH", new a("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f99801b.put("el-GR", new a("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f99801b.put("uk-UA", new a("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f99801b.put("ur", new a("ur", "ur", "", "اردو"));
        this.f99801b.put("hi-IN", new a("hi-IN", "hi", "IN", "हिंदी"));
        this.f99801b.put("bn-IN", new a("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f99801b.put("my-MM", new a("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        this.f99801b.put("km-KH", new a("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static String a(Locale locale) {
        if (TextUtils.equals("zh", locale.getLanguage()) && TextUtils.equals("", locale.getCountry())) {
            return "zh-Hans";
        }
        if (locale.equals(Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (locale.equals(Locale.CHINESE) || locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(locale.getLanguage())) {
            return "he";
        }
        if ("in".equals(locale.getLanguage())) {
            return "id";
        }
        return locale.getLanguage();
    }

    public final void a(String str, String str2, Context context) {
        AnonymousClass1 r2 = new d(context, str2, str) {
            /* class com.ss.android.ugc.aweme.i18n.language.i18n.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            WeakReference<Context> f99803a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f99804b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f99805c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f99806d;

            static {
                Covode.recordClassIndex(63628);
            }

            @Override // com.ss.android.ugc.aweme.i18n.language.i18n.d
            public final void a() {
                com.ss.android.ugc.aweme.i18n.language.a.a("pref_language_key", this.f99805c);
                com.ss.android.ugc.aweme.i18n.language.a.a("key_current_locale", this.f99806d);
                Context context = this.f99803a.get();
                if (context != null) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                    g.a.f99786a.f99779a = false;
                    i.a(2);
                    if (d.f34605l == 5) {
                        SmartRouter.buildRoute(context, "aweme://main").addFlags(268468224).open();
                    } else {
                        Intent intent = new Intent();
                        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
                        intent.setFlags(268468224);
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                        context.startActivity(intent);
                    }
                    s.b().c();
                    Keva.getRepo("TTSettingData").erase("last_get_setting_time");
                    if (j.a().c()) {
                        SettingManagerServiceImpl.b().a(2);
                    } else {
                        SettingManagerServiceImpl.b().a(this.f99804b);
                    }
                    SettingManagerServiceImpl.b().a();
                    com.bytedance.ies.dmt.ui.common.rebranding.a.a();
                    n.a().a(null, new Callable() {
                        /* class com.ss.android.ugc.aweme.i18n.language.i18n.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(63629);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            if (b.this.f99802c == null) {
                                b.this.f99802c = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(CommonApi.class);
                            }
                            Api.a(b.this.f99802c.doGet(b.f99800a).execute().f42630b, b.f99800a);
                            return null;
                        }
                    }, 0);
                    BusinessComponentServiceUtils.getLiveAllService().b();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    if (g2.isLogin()) {
                        g2.updateLanguage(null, SettingServiceImpl.v().h(), 0);
                    }
                    c.a.f109704a.a().notifyLocaleChange(com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, context));
                    IMService.createIIMServicebyMonsterPlugin(false).switchLocale();
                    GeckoLocalServiceImpl.b().a();
                    d.a.a("appLanguage", SettingServiceImpl.v().h());
                    d.a.a("language", en.a().toString());
                    d.a.a("appLocale", com.ss.android.ugc.aweme.i18n.language.a.b());
                }
            }

            {
                this.f99804b = r3;
                this.f99805c = r4;
                this.f99806d = r5;
                this.f99803a = new WeakReference<>(r3);
            }
        };
        if (context == null) {
            context = com.bytedance.ies.ugc.appcontext.d.a();
        }
        c.a(context, com.ss.android.ugc.aweme.i18n.language.a.a(str, str2, context), true, r2);
    }
}

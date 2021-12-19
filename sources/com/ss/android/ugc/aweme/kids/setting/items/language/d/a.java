package com.ss.android.ugc.aweme.kids.setting.items.language.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.items.language.api.LanguageApi;
import f.a.z;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2749a f107062c = new C2749a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.aweme.language.b> f107063a;

    /* renamed from: b  reason: collision with root package name */
    public final LanguageApi f107064b;

    static {
        Covode.recordClassIndex(68476);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$a  reason: collision with other inner class name */
    public static final class C2749a {
        static {
            Covode.recordClassIndex(68477);
        }

        private C2749a() {
        }

        public /* synthetic */ C2749a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107065a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f107066b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(68478);
        }
    }

    public static String c() {
        return a(b.a((String) null, (String) null, d.a()));
    }

    public final List<com.ss.android.ugc.aweme.language.b> b() {
        return new ArrayList(this.f107063a.values());
    }

    public final com.ss.android.ugc.aweme.language.b a() {
        com.ss.android.ugc.aweme.language.b bVar = this.f107063a.get(b.a());
        if (bVar == null) {
            return this.f107063a.get("en");
        }
        return bVar;
    }

    public static final class c implements com.ss.android.ugc.aweme.kids.setting.items.language.b.a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f107067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f107068b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f107069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f107070d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f107071e;

        static {
            Covode.recordClassIndex(68479);
        }

        @Override // com.ss.android.ugc.aweme.kids.setting.items.language.b.a
        public final void a() {
            b.a("pref_language_key", this.f107069c);
            b.a("key_current_locale", this.f107070d);
            Context context = this.f107067a.get();
            if (context != null) {
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
                SmartRouter.buildRoute(context, "//kids/main").addFlags(268468224).open();
                Keva.getRepo("TTSettingData").erase("last_get_setting_time");
                com.bytedance.ies.dmt.ui.common.rebranding.a.a();
                if (KidsAccountServiceImpl.h().a()) {
                    String c2 = a.c();
                    long currentTimeMillis = System.currentTimeMillis();
                    LanguageApi languageApi = this.f107068b.f107064b;
                    if (c2 == null) {
                        l.b();
                    }
                    languageApi.editLanguageConfig(c2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C2750a(currentTimeMillis));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$c$a  reason: collision with other inner class name */
        public static final class C2750a implements z<com.ss.android.ugc.aweme.kids.setting.items.language.c.c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f107072a;

            static {
                Covode.recordClassIndex(68480);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onSubscribe(f.a.b.b bVar) {
                l.d(bVar, "");
            }

            C2750a(long j2) {
                this.f107072a = j2;
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                l.d(th, "");
                e.a("kids_api_language_edit", -1, -1, this.f107072a);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.kids.setting.items.language.c.c cVar) {
                l.d(cVar, "");
                e.a("kids_api_language_edit", -1, 0, this.f107072a);
            }
        }

        public c(a aVar, String str, String str2, Context context) {
            this.f107068b = aVar;
            this.f107069c = str;
            this.f107070d = str2;
            this.f107071e = context;
            this.f107067a = new WeakReference<>(context);
        }
    }

    private a() {
        Object a2 = RetrofitFactory.a().b(com.ss.android.ugc.aweme.kids.common.a.a.f105880a).d().a(LanguageApi.class);
        l.b(a2, "");
        this.f107064b = (LanguageApi) a2;
        this.f107063a = new LinkedHashMap();
        if (l.a((Object) "local_test", (Object) d.s) || l.a((Object) "lark_inhouse", (Object) d.s)) {
            this.f107063a.put("sq", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("sq", "sq", "", "Translate To Key"));
        }
        this.f107063a.put("en", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("en", "en", "", "English"));
        this.f107063a.put(f.f30878a, new com.ss.android.ugc.aweme.kids.setting.items.language.c.a(f.f30878a, f.f30878a, "", "العربية"));
        this.f107063a.put("de-DE", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("de-DE", "de", "DE", "Deutsch"));
        this.f107063a.put("es", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("es", "es", "", "Español"));
        this.f107063a.put("fi-FI", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f107063a.put("fr", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("fr", "fr", "", "Français"));
        this.f107063a.put("fr-CA", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("fr-CA", "fr", "CA", "Français (Canada)"));
        this.f107063a.put("id-ID", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f107063a.put("ja-JP", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f107063a.put("ko-KR", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f107063a.put("ms-MY", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f107063a.put("ru-RU", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f107063a.put("th-TH", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f107063a.put("tr-TR", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f107063a.put("vi-VN", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        this.f107063a.put("zh-Hant-TW", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        this.f107063a.put("zh-Hans", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
        this.f107063a.put("he-IL", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f107063a.put("jv-MY", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        this.f107063a.put("ceb-PH", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f107063a.put("cs-CZ", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f107063a.put("it-IT", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f107063a.put("hu-HU", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f107063a.put("nl-NL", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f107063a.put("pl-PL", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f107063a.put("pt-BR", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f107063a.put("ro-RO", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f107063a.put("sv-SE", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f107063a.put("fil-PH", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f107063a.put("el-GR", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f107063a.put("uk-UA", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f107063a.put("ur", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("ur", "ur", "", "اردو"));
        this.f107063a.put("hi-IN", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("hi-IN", "hi", "IN", "हिंदी"));
        this.f107063a.put("bn-IN", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f107063a.put("my-MM", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        this.f107063a.put("km-KH", new com.ss.android.ugc.aweme.kids.setting.items.language.c.a("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    private static String a(Locale locale) {
        l.d(locale, "");
        if (TextUtils.equals("zh", locale.getLanguage()) && TextUtils.equals("", locale.getCountry())) {
            return "zh-Hans";
        }
        Locale locale2 = Locale.TRADITIONAL_CHINESE;
        l.b(locale2, "");
        if (c.a(locale, locale2)) {
            return "zh-Hant";
        }
        Locale locale3 = Locale.CHINESE;
        l.b(locale3, "");
        if (!c.a(locale, locale3)) {
            Locale locale4 = Locale.SIMPLIFIED_CHINESE;
            l.b(locale4, "");
            if (!c.a(locale, locale4)) {
                if (l.a((Object) "iw", (Object) locale.getLanguage())) {
                    return "he";
                }
                if (l.a((Object) "in", (Object) locale.getLanguage())) {
                    return "id";
                }
                String language = locale.getLanguage();
                l.b(language, "");
                return language;
            }
        }
        return "zh-Hans";
    }
}

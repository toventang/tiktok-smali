package com.ss.android.ugc.aweme.kids.setting.items.language.d;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f107074a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(68482);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static Locale a(Context context) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        Locale locale = resources.getConfiguration().locale;
        l.b(locale, "");
        return locale;
    }

    private static void a(Configuration configuration, Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        configuration.setLocale(locale);
    }

    public static boolean a(Locale locale, Locale locale2) {
        l.d(locale, "");
        l.d(locale2, "");
        return l.a(locale, locale2);
    }

    public static final class a implements com.bytedance.ies.ugc.aweme.plugin.c.a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f107075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Locale f107076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.setting.items.language.b.a f107077c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f107078d;

        static {
            Covode.recordClassIndex(68483);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, int i2) {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
        public final void a(String str, boolean z) {
            Context context = this.f107075a.get();
            if (context != null) {
                l.b(context, "");
                if (!z) {
                    c.a(context, this.f107076b);
                    com.ss.android.ugc.aweme.kids.setting.items.language.b.a aVar = this.f107077c;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
        }

        public a(Locale locale, com.ss.android.ugc.aweme.kids.setting.items.language.b.a aVar, Context context) {
            this.f107076b = locale;
            this.f107077c = aVar;
            this.f107078d = context;
            this.f107075a = new WeakReference<>(context);
        }
    }

    private static void b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            l.b(resources, "");
            Configuration configuration = resources.getConfiguration();
            l.b(configuration, "");
            a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    public static void a(Context context, Locale locale) {
        b(context, locale);
        if (!(context instanceof Application)) {
            b(b(context), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            Resources system = Resources.getSystem();
            l.b(system, "");
            Locale locale2 = system.getConfiguration().locale;
            l.b(locale2, "");
            country = locale2.getCountry();
        }
        b.a(context, "key_current_region", country);
        b.a(context, "pref_language_key", locale.getLanguage());
    }
}

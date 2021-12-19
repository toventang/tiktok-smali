package com.ss.android.ugc.aweme.i18n.language.i18n;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.plugin.a.c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.ref.WeakReference;
import java.util.Locale;

public final class c {
    static {
        Covode.recordClassIndex(63631);
    }

    private static boolean a() {
        boolean z;
        IPluginService d2 = AabPluginServiceImpl.d();
        if (d2 != null) {
            z = d2.b();
        } else {
            z = false;
        }
        if (!d.f34606m || !z) {
            return false;
        }
        return true;
    }

    public static Locale a(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(context);
        }
        return context;
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static Context d(Context context) {
        Resources resources = context.getResources();
        Locale a2 = com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, context);
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(a2);
        configuration.setLocales(new LocaleList(a2));
        try {
            if (SettingServiceImpl.v().b(context)) {
                configuration.screenLayout = (configuration.screenLayout & -193) | 128;
            }
        } catch (Throwable unused) {
        }
        return context.createConfigurationContext(configuration);
    }

    private static void a(Configuration configuration, Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        configuration.setLocale(locale);
    }

    private static void b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    public static void a(Context context, Locale locale) {
        b(context, locale);
        if (!(context instanceof Application)) {
            b(c(context), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            country = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        com.ss.android.ugc.aweme.i18n.language.a.a(context, "key_current_region", country);
        com.ss.android.ugc.aweme.i18n.language.a.a(context, "pref_language_key", locale.getLanguage());
    }

    public static void a(Context context, Locale locale, boolean z, d dVar) {
        if (locale.equals(context.getResources().getConfiguration().locale)) {
            if (dVar != null) {
                dVar.a();
            }
        } else if (!z || !a()) {
            a(context, locale);
            if (dVar != null) {
                dVar.a();
            }
        } else {
            IPluginService d2 = AabPluginServiceImpl.d();
            if (d2 != null) {
                c.a aVar = new c.a();
                aVar.f35095g = new Locale(locale.getLanguage());
                aVar.f35092d = new com.bytedance.ies.ugc.aweme.plugin.c.a(context, locale, dVar) {
                    /* class com.ss.android.ugc.aweme.i18n.language.i18n.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    WeakReference<Context> f99810a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ Context f99811b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Locale f99812c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ d f99813d;

                    static {
                        Covode.recordClassIndex(63632);
                    }

                    @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
                    public final void a(String str, int i2) {
                    }

                    @Override // com.bytedance.ies.ugc.aweme.plugin.c.a
                    public final void a(String str, boolean z) {
                        Context context = this.f99810a.get();
                        if (context != null && !z) {
                            c.a(context, this.f99812c);
                            d dVar = this.f99813d;
                            if (dVar != null) {
                                dVar.a();
                            }
                        }
                    }

                    {
                        this.f99811b = r2;
                        this.f99812c = r3;
                        this.f99813d = r4;
                        this.f99810a = new WeakReference<>(r2);
                    }
                };
                d2.a(aVar.a());
            }
        }
    }
}

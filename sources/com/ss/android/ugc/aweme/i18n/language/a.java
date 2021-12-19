package com.ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.i18n.language.i18n.c;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;

public final class a {
    static {
        Covode.recordClassIndex(63611);
    }

    public static Locale a() {
        return a((String) null, (String) null, d.a());
    }

    public static String b() {
        String b2 = b("key_current_locale", "");
        if (TextUtils.isEmpty(b2)) {
            return "en";
        }
        return b2;
    }

    public static String b(Context context) {
        return SettingServiceImpl.v().a(context).e();
    }

    public static void a(Context context) {
        if (context == null) {
            context = d.a();
        }
        c.a(context, a((String) null, (String) null, context), false, null);
    }

    public static void a(String str, String str2) {
        com.ss.android.ugc.aweme.bf.d.a(d.a(), "key_language_sp_key", 0).edit().putString(str, str2).apply();
    }

    public static String b(String str, String str2) {
        return com.ss.android.ugc.aweme.bf.d.a(d.a(), "key_language_sp_key", 0).getString(str, str2);
    }

    public static void a(Context context, String str, String str2) {
        com.ss.android.ugc.aweme.bf.d.a(context, "key_language_sp_key", 0).edit().putString(str, str2).apply();
    }

    public static String b(Context context, String str, String str2) {
        return com.ss.android.ugc.aweme.bf.d.a(context, "key_language_sp_key", 0).getString(str, str2);
    }

    public static Locale a(String str, String str2, Context context) {
        boolean z;
        Locale locale = Locale.getDefault();
        String str3 = "";
        if (str2 == null) {
            if (context == null) {
                str2 = str3;
            } else {
                str2 = b(context, "pref_language_key", str3);
            }
        }
        if (str == null) {
            String b2 = b("key_current_locale", str3);
            str = "zh-Hant-TW";
            if (TextUtils.isEmpty(b2)) {
                String country = locale.getCountry();
                String language = locale.getLanguage();
                if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, language)) {
                    str3 = country;
                    str2 = language;
                } else if (TextUtils.equals(str2, "zh-Hant") || TextUtils.equals(str2, "zh")) {
                    a("key_current_locale", str);
                } else if (TextUtils.equals(str2, "in")) {
                    a("key_current_locale", "id-ID");
                    str = "id-ID";
                } else if (TextUtils.equals(str2, "iw")) {
                    a("key_current_locale", "he-IL");
                    str = "he-IL";
                }
                if (!locale.equals(Locale.SIMPLIFIED_CHINESE)) {
                    if (TextUtils.equals("in", str2)) {
                        a("key_current_locale", "id-ID");
                        str = "id-ID";
                    } else if (TextUtils.equals("iw", str2)) {
                        a("key_current_locale", "he-IL");
                        str = "he-IL";
                    } else {
                        for (b bVar : b.a.f99809a.f99801b.values()) {
                            if (!TextUtils.isEmpty(bVar.c().getCountry())) {
                                String language2 = locale.getLanguage();
                                if (TextUtils.equals("zh-Hans", language2) || (TextUtils.equals("zh", language2) && TextUtils.equals(locale.getCountry(), "CN"))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    if (TextUtils.equals("zh-Hant", str2) || TextUtils.equals("zh", str2) || TextUtils.equals("zh_TW", str2)) {
                                        a("key_current_locale", str);
                                        break;
                                    } else if (TextUtils.equals(str2, bVar.c().getLanguage()) && TextUtils.equals(str3, bVar.c().getCountry())) {
                                        a("key_current_locale", str2 + "-" + str3);
                                        str = str2 + "-" + str3;
                                        break;
                                    } else if (TextUtils.equals(str2, bVar.c().getLanguage())) {
                                        a("key_current_locale", bVar.a());
                                        str = bVar.a();
                                        break;
                                    }
                                } else {
                                    a("key_current_locale", "zh-Hans");
                                    str = "zh-Hans";
                                    break;
                                }
                            } else if (TextUtils.equals(str2, bVar.c().getLanguage())) {
                                a("key_current_locale", str2);
                                str = str2;
                                break;
                            }
                        }
                        a("key_current_locale", "en");
                    }
                }
                str = "en";
            } else {
                str = b2;
            }
        }
        try {
            Locale a2 = SettingServiceImpl.v().a(str);
            if (a2 != null) {
                return a2;
            }
            return locale;
        } catch (Throwable unused) {
        }
    }
}

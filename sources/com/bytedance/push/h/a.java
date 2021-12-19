package com.bytedance.push.h;

import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c;
import com.bytedance.push.k.d;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.aweme.lancet.I18nLancet;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f42186a;

    static {
        Covode.recordClassIndex(25780);
    }

    public final Map<String, String> a() {
        String a2;
        String str;
        Map<String, String> a3;
        HashMap hashMap = new HashMap();
        b.b();
        com.ss.android.pushmanager.setting.a.a().a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("push_sdk_version", "30203");
        hashMap2.put("push_sdk_version_name", "3.2.3-alpha.16-tiktok");
        String str2 = (String) hashMap.get("install_id");
        if (!m.a(str2)) {
            hashMap2.put("iid", str2);
        }
        String str3 = (String) hashMap.get("device_id");
        if (!m.a(str3)) {
            hashMap2.put("device_id", str3);
        }
        Application application = this.f42186a.f42057a;
        if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
            j.f107222a = l.a(l.a(application));
        }
        String str4 = j.f107222a;
        if (!m.a(str4)) {
            hashMap2.put("ac", str4);
        }
        String str5 = this.f42186a.f42063g;
        if (str5 != null) {
            hashMap2.put("channel", str5);
        }
        hashMap2.put("aid", String.valueOf(this.f42186a.f42058b));
        String str6 = this.f42186a.f42065i;
        if (str6 != null) {
            hashMap2.put("app_name", str6);
        }
        hashMap2.put("version_code", String.valueOf(this.f42186a.f42059c));
        hashMap2.put("version_name", this.f42186a.f42061e);
        hashMap2.put("update_version_code", String.valueOf(this.f42186a.f42060d));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str7 = Build.VERSION.RELEASE;
            if (str7 != null && str7.length() > 10) {
                str7 = str7.substring(0, 10);
            }
            hashMap2.put("os_version", str7);
        } catch (Exception unused) {
        }
        int d2 = n.d(this.f42186a.f42057a);
        if (d2 > 0) {
            hashMap2.put("dpi", String.valueOf(d2));
        }
        if (!TextUtils.isEmpty(I18nLancet.f107161a)) {
            a2 = I18nLancet.f107161a;
        } else {
            a2 = com.ss.android.message.a.a.a();
            I18nLancet.f107161a = a2;
        }
        hashMap2.put("rom", a2);
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f42186a.f42057a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!m.a(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!m.a(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        try {
            String country2 = Resources.getSystem().getConfiguration().locale.getCountry();
            if (!TextUtils.isEmpty(country2)) {
                str = country2.toUpperCase();
            } else {
                str = "";
            }
            hashMap2.put("country", str);
            if (!(this.f42186a.r == null || (a3 = this.f42186a.r.a()) == null)) {
                hashMap2.putAll(a3);
            }
            hashMap2.put("rom_version", d.f42234a);
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public a(c cVar) {
        this.f42186a = cVar;
    }
}

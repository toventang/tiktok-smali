package com.ss.android.ugc.trill.d;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cw.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f150475a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static String f150476b;

    /* renamed from: c  reason: collision with root package name */
    private static String f150477c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f150478d = false;

    /* renamed from: e  reason: collision with root package name */
    private static SharedPreferences f150479e = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "gaid_sp_name", 0);

    public static void a() {
        if (!f()) {
            g();
        }
    }

    private static boolean f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(98959);
    }

    public static String b() {
        if (f150476b == null) {
            if (f()) {
                return f150479e.getString("key_gaid", "");
            }
            g();
        }
        return f150476b;
    }

    /* access modifiers changed from: private */
    public static void g() {
        if (!f150478d) {
            try {
                h();
                AppLog.setGoogleAId(f150476b);
                f150478d = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String c() {
        String str = f150476b;
        if (str != null) {
            return str;
        }
        if (com.ss.android.ugc.aweme.lego.d.e()) {
            i.b(b.f150480a, g.a());
        } else {
            i.b(c.f150481a, i.f4824a);
        }
        return f150479e.getString("key_gaid", "");
    }

    private static void h() {
        SharedPreferences.Editor edit = f150479e.edit();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.ies.ugc.appcontext.d.a());
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.getId())) {
                advertisingIdInfo.getId();
                edit.putString("key_gaid", advertisingIdInfo.getId());
                f150476b = advertisingIdInfo.getId();
            }
        } catch (Exception unused) {
        }
        String str = null;
        try {
            str = a(com.bytedance.ies.ugc.appcontext.d.a().getContentResolver(), "android_id");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!TextUtils.isEmpty(str)) {
            edit.putString("key_android_id", str);
            f150477c = str;
        }
        edit.commit();
    }

    private static String a(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return Settings.System.getString(contentResolver, str);
        }
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.c.a.f107190a)) {
            com.ss.android.ugc.aweme.lancet.c.a.f107190a = Settings.System.getString(contentResolver, str);
        }
        return com.ss.android.ugc.aweme.lancet.c.a.f107190a;
    }
}

package com.bytedance.android.live.core.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.ies.f.b;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Locale f8923a = new Locale("hi", "IN");

    /* renamed from: b  reason: collision with root package name */
    private static Locale f8924b = new Locale("te", "IN");

    /* renamed from: c  reason: collision with root package name */
    private static Locale f8925c = new Locale("ta", "IN");

    /* renamed from: d  reason: collision with root package name */
    private static Locale f8926d = new Locale("mr", "IN");

    /* renamed from: e  reason: collision with root package name */
    private static Locale f8927e = new Locale("bn", "IN");

    /* renamed from: f  reason: collision with root package name */
    private static Locale f8928f = new Locale("gu", "IN");

    /* renamed from: g  reason: collision with root package name */
    private static Locale f8929g = new Locale("kn", "IN");

    /* renamed from: h  reason: collision with root package name */
    private static Locale f8930h = new Locale("ml", "IN");

    /* renamed from: i  reason: collision with root package name */
    private static Locale f8931i = new Locale("pa", "IN");

    /* renamed from: j  reason: collision with root package name */
    private static Locale f8932j = new Locale("or", "IN");

    /* renamed from: k  reason: collision with root package name */
    private static Locale f8933k = new Locale("in", "ID");

    /* renamed from: l  reason: collision with root package name */
    private static Locale f8934l = new Locale("vi", "VN");

    /* renamed from: m  reason: collision with root package name */
    private static Locale f8935m = Locale.JAPAN;
    private static Locale n = Locale.KOREA;
    private static Locale o = new Locale("th", "TH");
    private static Locale p = new Locale("pt", "PT");
    private static Locale q = new Locale("ms");
    private static Locale r = Locale.FRANCE;
    private static Locale s = new Locale("ru", "RU");
    private static Locale t = new Locale("es");
    private static Locale u = new Locale(f.f30878a);
    private static HashSet<String> v = new HashSet<>(Arrays.asList("en", "hi", "in", "vi", "ko", "ja", "th", "ta", "te", "mr", "ms", "pt", "bn", "fr", "ru", "es", f.f30878a));

    public static String a() {
        return a(y.e()).getLanguage();
    }

    public static String b() {
        String str;
        if (e.f13999c) {
            String string = d.a(y.e(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            str = ((TelephonyManager) a(y.e(), "phone")).getSimCountryIso();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.getDefault());
        }
        return str;
    }

    static {
        Covode.recordClassIndex(4559);
    }

    private static Locale a(Context context) {
        Locale b2 = b(context);
        if (b2 != null) {
            return a(b2);
        }
        return Locale.getDefault();
    }

    private static Locale a(Locale locale) {
        if (TextUtils.isEmpty(locale.getCountry())) {
            return new Locale(locale.getLanguage(), Locale.getDefault().getCountry(), locale.getVariant());
        }
        return locale;
    }

    private static Locale b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Locale locale = (Locale) e.a.f9628b.a(b.a(context, b.f33816b).a("sp_lanuage_last_select_tag", ""), Locale.class);
            if (!(locale instanceof Locale)) {
                return null;
            }
            return locale;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11864);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11864);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

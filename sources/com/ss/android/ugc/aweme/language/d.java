package com.ss.android.ugc.aweme.language;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.aa.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class d {

    /* renamed from: a  reason: collision with root package name */
    static List<String> f107279a = Arrays.asList("JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN");

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f107280b = "";

    /* renamed from: c  reason: collision with root package name */
    private static volatile List<String> f107281c;

    /* renamed from: d  reason: collision with root package name */
    private static HashSet<String> f107282d;

    /* renamed from: e  reason: collision with root package name */
    private static Resources f107283e = null;

    public static boolean c() {
        return k().contains(a());
    }

    public static String a() {
        if (!TextUtils.isEmpty(f107280b)) {
            return f107280b;
        }
        b();
        return f107280b;
    }

    public static boolean d() {
        if ("RU".equalsIgnoreCase(h()) || "RU".equalsIgnoreCase(g())) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (Locale.KOREA.getCountry() == null || !Locale.KOREA.getCountry().equalsIgnoreCase(g())) {
            return false;
        }
        return true;
    }

    public static final boolean i() {
        if (Locale.JAPAN.getCountry() == null || !Locale.JAPAN.getCountry().equalsIgnoreCase(g())) {
            return false;
        }
        return true;
    }

    static void b() {
        MethodCollector.i(11116);
        synchronized (d.class) {
            try {
                if (TextUtils.isEmpty(f107280b)) {
                    f107280b = SettingsManager.a().a("priority_region", "");
                }
                if (TextUtils.isEmpty(f107280b)) {
                    f107280b = j();
                }
            } finally {
                MethodCollector.o(11116);
            }
        }
    }

    public static boolean f() {
        if (Locale.US.getCountry() == null) {
            return false;
        }
        if (Locale.US.getCountry().equalsIgnoreCase(h()) || Locale.US.getCountry().equalsIgnoreCase(g())) {
            return true;
        }
        return false;
    }

    public static final String g() {
        String h2 = h();
        if (TextUtils.isEmpty(h2)) {
            h2 = SettingServiceImpl.v().l();
            if (TextUtils.isEmpty(h2)) {
                h2 = SettingServiceImpl.v().m();
            }
        }
        if (TextUtils.isEmpty(h2)) {
            h2 = "";
        }
        return h2.toUpperCase(Locale.US);
    }

    public static final String h() {
        String str;
        try {
            str = ((TelephonyManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "phone")).getSimCountryIso();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.US);
        }
        return str;
    }

    private static String j() {
        String h2 = h();
        if (TextUtils.isEmpty(h2)) {
            String networkOperatorCode = NetworkUtils.getNetworkOperatorCode(com.bytedance.ies.ugc.appcontext.d.a());
            try {
                if (!TextUtils.isEmpty(networkOperatorCode) && !networkOperatorCode.equals("unkown") && networkOperatorCode.length() >= 3) {
                    h2 = b.f62451a.get(Integer.valueOf(Integer.parseInt(networkOperatorCode.substring(0, 3))));
                }
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            if (TextUtils.isEmpty(h2)) {
                h2 = SettingServiceImpl.v().l();
                if (TextUtils.isEmpty(h2)) {
                    h2 = SettingServiceImpl.v().m();
                }
            }
        }
        if (TextUtils.isEmpty(h2)) {
            h2 = "";
        }
        return h2.toUpperCase(Locale.US);
    }

    private static List<String> k() {
        MethodCollector.i(11271);
        if (f107281c == null || f107281c.size() <= 0) {
            synchronized (d.class) {
                try {
                    if (f107281c == null || f107281c.size() <= 0) {
                        f107281c = new ArrayList();
                        if (!TextUtils.isEmpty(SettingsManager.a().a("tt_regions", ""))) {
                            f107281c.addAll(Arrays.asList(SettingsManager.a().a("tt_regions", "").split(",")));
                        } else {
                            f107281c.addAll(f107279a);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11271);
                    throw th;
                }
            }
            List<String> list = f107281c;
            MethodCollector.o(11271);
            return list;
        }
        List<String> list2 = f107281c;
        MethodCollector.o(11271);
        return list2;
    }

    static {
        Covode.recordClassIndex(68634);
        SettingsManager.a().a(e.f107284a);
        HashSet<String> hashSet = new HashSet<>();
        f107282d = hashSet;
        hashSet.add("EG");
        f107282d.add("SD");
        f107282d.add("DZ");
        f107282d.add("MA");
        f107282d.add("IQ");
        f107282d.add("SA");
        f107282d.add("YE");
        f107282d.add("SY");
        f107282d.add("TD");
        f107282d.add("TN");
        f107282d.add("SO");
        f107282d.add("LY");
        f107282d.add("JO");
        f107282d.add("ER");
        f107282d.add("AE");
        f107282d.add("LB");
        f107282d.add("MR");
        f107282d.add("KW");
        f107282d.add("OM");
        f107282d.add("QA");
        f107282d.add("DJ");
        f107282d.add("BH");
        f107282d.add("KM");
    }

    public static final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase(Locale.US));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11425);
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
                    MethodCollector.o(11425);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

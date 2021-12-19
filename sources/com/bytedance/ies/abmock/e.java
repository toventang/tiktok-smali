package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.l;
import com.google.gson.o;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f31839a;

    /* renamed from: b  reason: collision with root package name */
    private static final Float f31840b = Float.valueOf(0.74347335f);

    /* renamed from: c  reason: collision with root package name */
    private static final Double f31841c = Double.valueOf(0.7434733377752801d);

    /* renamed from: d  reason: collision with root package name */
    private static final Integer f31842d = 2690237;

    /* renamed from: e  reason: collision with root package name */
    private static final Long f31843e = 992354881878L;

    /* renamed from: f  reason: collision with root package name */
    private static final Boolean f31844f = false;

    private e() {
    }

    public static boolean a(String str, boolean z, boolean z2) {
        if (!j.a().c()) {
            return b.a().a(z2, str, z);
        }
        boolean a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, z, z2);
        j.a();
        Boolean.valueOf(a2);
        return a2;
    }

    public static String a(String str, String str2, boolean z) {
        if (!j.a().c()) {
            return b.a().a(z, str, str2);
        }
        String a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, str2, z);
        j.a();
        return a2;
    }

    static {
        Covode.recordClassIndex(18620);
    }

    /* renamed from: com.bytedance.ies.abmock.e$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31845a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.e.AnonymousClass1.<clinit>():void");
        }
    }

    public static e a() {
        MethodCollector.i(8672);
        if (f31839a == null) {
            synchronized (e.class) {
                try {
                    if (f31839a == null) {
                        f31839a = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8672);
                    throw th;
                }
            }
        }
        e eVar = f31839a;
        MethodCollector.o(8672);
        return eVar;
    }

    public static <T> T a(String str, boolean z) {
        if (!j.a().c()) {
            return (T) b.a().a(z, str);
        }
        T t = (T) com.bytedance.ies.abmock.datacenter.e.a().a(str, z);
        j.a();
        return t;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object b(String str, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        Object obj2;
        if (d.f31798a == null || d.f31798a.isEmpty()) {
            z2 = false;
        } else {
            z2 = d.f31798a.containsKey(str);
        }
        if (z2) {
            Object obj3 = d.f31798a.get(str);
            j.a();
            return obj3;
        }
        o a2 = com.bytedance.ies.abmock.datacenter.c.e.f31819a.a();
        if (a2 != null) {
            z3 = a2.b(str);
        } else {
            z3 = false;
        }
        if (z3) {
            Object a3 = com.bytedance.ies.abmock.datacenter.c.e.f31819a.a(str);
            if (z) {
                String b2 = m.a().b(a3);
                j.a();
                return b2;
            }
            j.a();
            return a3;
        }
        Map<String, ConfigItem> map = f.f31846a;
        if (map == null || map.isEmpty()) {
            j.a();
            return null;
        }
        j.a();
        ConfigItem configItem = map.get(str);
        if (configItem != null) {
            try {
                switch (AnonymousClass1.f31845a[configItem.type.ordinal()]) {
                    case 1:
                        int intValue = f31842d.intValue();
                        if (configItem.defaultValue != null) {
                            intValue = ((Integer) configItem.defaultValue).intValue();
                        }
                        if (j.a().c()) {
                            a();
                            return Integer.valueOf(a(str, intValue, false));
                        } else if (configItem.isAB) {
                            return Integer.valueOf(b.a().a(false, str, intValue));
                        } else {
                            return Integer.valueOf(SettingsManager.a().a(str, intValue));
                        }
                    case 2:
                        boolean booleanValue = f31844f.booleanValue();
                        if (configItem.defaultValue != null) {
                            booleanValue = ((Boolean) configItem.defaultValue).booleanValue();
                        }
                        if (j.a().c()) {
                            a();
                            return Boolean.valueOf(a(str, booleanValue, false));
                        } else if (configItem.isAB) {
                            return Boolean.valueOf(b.a().a(false, str, booleanValue));
                        } else {
                            return Boolean.valueOf(SettingsManager.a().a(str, booleanValue));
                        }
                    case 3:
                        long longValue = f31843e.longValue();
                        if (configItem.defaultValue != null) {
                            longValue = ((Long) configItem.defaultValue).longValue();
                        }
                        if (j.a().c()) {
                            a();
                            return Long.valueOf(a(str, longValue, false));
                        } else if (configItem.isAB) {
                            return Long.valueOf(b.a().a(false, str, longValue));
                        } else {
                            return Long.valueOf(SettingsManager.a().a(str, longValue));
                        }
                    case 4:
                        double doubleValue = f31841c.doubleValue();
                        if (configItem.defaultValue != null) {
                            doubleValue = ((Double) configItem.defaultValue).doubleValue();
                        }
                        if (j.a().c()) {
                            a();
                            return Double.valueOf(a(str, doubleValue, false));
                        } else if (configItem.isAB) {
                            return Double.valueOf(b.a().a(false, str, doubleValue));
                        } else {
                            return Double.valueOf(SettingsManager.a().a(str, doubleValue));
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        float floatValue = f31840b.floatValue();
                        if (configItem.defaultValue != null) {
                            floatValue = ((Float) configItem.defaultValue).floatValue();
                        }
                        if (j.a().c()) {
                            a();
                            return Float.valueOf(a(str, floatValue, false));
                        } else if (configItem.isAB) {
                            return Float.valueOf(b.a().a(false, str, floatValue));
                        } else {
                            return Float.valueOf(SettingsManager.a().a(str, floatValue));
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        if (j.a().c()) {
                            a();
                            return a(str, (String) configItem.defaultValue, false);
                        } else if (configItem.isAB) {
                            return b.a().a(false, str, (String) configItem.defaultValue);
                        } else {
                            return SettingsManager.a().a(str, (String) configItem.defaultValue);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        if (j.a().c()) {
                            a();
                            obj = a(str, false);
                        } else if (configItem.isAB) {
                            obj = b.a().a(false, str);
                        } else {
                            obj = SettingsManager.a().a(str, String[].class);
                        }
                        if (z) {
                            return m.a().b(obj);
                        }
                        return obj;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        if (j.a().c()) {
                            a();
                            obj2 = a(str, false, true, l.class);
                        } else if (configItem.isAB) {
                            obj2 = b.a().a(false, str, l.class);
                        } else {
                            obj2 = SettingsManager.a().a(str, l.class);
                        }
                        if (z) {
                            return m.a().b(obj2);
                        }
                        return obj2;
                }
            } catch (Throwable th) {
                j.a();
                th.getMessage();
            }
        }
        j.a();
        return null;
    }

    public static double a(String str, double d2, boolean z) {
        if (!j.a().c()) {
            return b.a().a(z, str, d2);
        }
        double a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, d2, z);
        j.a();
        Double.valueOf(a2);
        return a2;
    }

    public static float a(String str, float f2, boolean z) {
        if (!j.a().c()) {
            return b.a().a(z, str, f2);
        }
        float a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, f2, z);
        j.a();
        Float.valueOf(a2);
        return a2;
    }

    public static int a(String str, int i2, boolean z) {
        if (!j.a().c()) {
            return b.a().a(z, str, i2);
        }
        int a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, i2, z);
        j.a();
        Integer.valueOf(a2);
        return a2;
    }

    public static long a(String str, long j2, boolean z) {
        if (!j.a().c()) {
            return b.a().a(z, str, j2);
        }
        long a2 = com.bytedance.ies.abmock.datacenter.e.a().a(str, j2, z);
        j.a();
        Long.valueOf(a2);
        return a2;
    }

    static <T> T a(String str, boolean z, boolean z2, Class cls) {
        if (!j.a().c()) {
            return (T) b.a().a(z, str, cls);
        }
        T t = (T) com.bytedance.ies.abmock.datacenter.e.a().a(str, z, z2, cls);
        j.a();
        return t;
    }
}

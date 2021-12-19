package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.appsflyer.AFLogger;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: ı  reason: contains not printable characters */
    private static char[] f225 = {61163, 22514, 40130, 50618, 2749, 29581, 47210, 57662, 9806, 28457, 54330, 7453, 17394, 35068, 61905, 13998, 32659, 42194, 60754, 21069, 39774, 49185, 2334, 19992, 46325, 64962, 8911, 27541, 53379, 6554, 24191, 34631, 52271, 13614, 52353, 60956, 4935, 43601, 24939, 14341, 63307, 36381, 17911, 7305, 56298, 37532, 10685, 57476, 48766, 30029, 3175, 51975, 33325, 22802, 21602, 60791, 9806, 32551, 45113, 51467, 692, 23471, 40073, 54690, 28393, 42945, 63849, 12924, 19213, 35961, 50516, 7696, 22456, 59591, 8588, 31403, 46032, 62666, 3700, 18207, 38925, 53556, 27226, 41806, 58533, 15771, 47429, '\\', 52076, 37396, 23827, 9251, 61380, 46736, 29179, 14481, 33750, 19092, 5197, 57166, 42596, 24843, 10294, 62251, 47845, 1511, 52466, 38795, 24231, 6587, 58182, 30898, 49579, 2715, 21475, 40164, 58836, 11827, 30567, 45067, 63860, 17021, 35653, 54700, 7852, 26517, 41212, 59805, 13046, 31546, 50207, 3352, 22130, 40773, 42262, 7183, 55103, 36423, 16704, 14448, 62359, 43715, 28072, 9410, 40837, 22212, 2060, 49936, 47661, 32094, 13379, 61280, 42632, 6590, 'a', 47480, 29256, 11056, 58423, 40199, 22240, 4020, 51422, 33187, 15016, 62428, 44381, 26220, 8029, 49716, 45998, 2762, 64061, 17184, 34829, 53620, 7713, 26448, 44220, 62947, 12947, 31740, 49403, 2497, 22326, 39995, '/', 47477, 29261, 11041, 58416, 40203, 13489, 36259, 18076, 8065, 53428, 43483, 25139, 15147, 64517, 46448, 'C', 47486, 29257, 11041, 58419, 40221, 22257, 4087, 51445, 33214, 15039, 62359, 44408, 26218, 8029, 55333, 37134, 50529, 31824, 46946, 60937, 8474, 22573, 37763, 51913, 3576, 17601, 65436, 14000, 26715, 41753, 55920, 7436, 21540, 36665, 50894, 31141, 45295, 60296, 8887, 26037, 40727, 54902, 2418, 16385, 64295, 12921, 30166, 44277, 59268, 7828, 20923, 35665, 49750, 1382, 48141, 63303, 11895, 17313, 64181, 12702, 26829, 42992, 57051, 5430, 19517, 35610, 49772, 31103, 45136, 61071, 9640, 23682, 39904, 53967, 2515, 16427, 65296, 13847, 28007, 42060, 58191, 48803, 1950, 52393, 38337, 23251, 9213, 59409, 45335, 30210, 16195, 33882, 19838, 5005, 55453, 41376, 26351, 12280, 62709, 48393, 562, 52012, 36935, 22891, 7796, 48359, 1494, 52964, 38799, 22684, 8619, 59909, 45906, 29823, 15633, 34322, 20280, 4556, 55967, 41959, 25742, 11687, 63163, 48968, '`', 51565, 37386, 23329, 7291, 59100, 45026, 28905, 14747, 33446, 19387, 3093, 54652, 40456, 26371, 10277, 62083, 48092, 31991, 50566, 36510, 22433, 6227, 57684, 43644, 29447, 13381, 64885};

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int f226;

    /* renamed from: Ι  reason: contains not printable characters */
    private static long f227 = 5583085843407419670L;

    /* renamed from: ι  reason: contains not printable characters */
    private static int f228 = 1;

    public static class a extends HashMap<String, Object> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static long f229 = -8771784815112425056L;

        /* renamed from: Ι  reason: contains not printable characters */
        private static int f230;

        /* renamed from: ι  reason: contains not printable characters */
        private static char[] f231 = {'a', 61894, 58143, 54420, 50921, 47181, 43429, 39699, 36212, 32449, 28717, 24976, 'b', 61906, 58145, 54414, 50916, 'N', 61935, 58143, 54434, 50898, 47201, 43406, 39716, 'k', 61893, 58150, 'f', 61889, 58153, 54412, 50917, 47172, 43488, 39687, 36197, 32462, 28709, 24978, 21473, 17748, 13993, 10254, 6759, 2944, 64811, 61061, 57574, 53760, 50091, 46341, 42873, 39040, 35383, 31625, 28148, 24392, 20704, 16901, 13432, 9667, 5925, 2192, 64244, 60489, 56751, 53006, 49466, 45696, 14536, 51558, 56197, 60538, 65050, 32954, 37210, 'f', 61897, 58162, 54419, 50932, 47212, 43425, 39701, 36206, 32451, 28712, 24996, 21473, 17748, 13989, '5', 61838, 58228, 54478, 50865, 24553, 44566, 48359, 35594, 39278, 14334, 50777, 54449, 58132, 61821, 36828, 40568, 44191, 47869, 18774, 18365, 22026, 25721, 29388, 305, 8086, 11775, 15384, 51891, 55581, 55166, 58776, 62510, 33433, 37108, 44877, 48573, 19544, 23151, 26833, 26412, 30096, 952, 4701, 8352, 16155, 52605, 56264, 59948, 63633, 63223, 34134, 37858, 41560, 51824, 15315, 10544, 7831, 3315, 29271, 25570, 20807, 18214, 46210, 47670, 43979, 39331, 36692, 64736, 57922, 53283, 49546, 'a', 61902, 58148, 54418, 50927, 47177, 43428, 39758, 36201, 32462, 28724, 24965, 21486, 17748, 14062, 10241, 6755, 3028, 64809, 61071, 57582, 53774, 50050, 46369, 42836, 39156, 35333, 31666, 28121, 24447, 20611, 16936, 13377, 9710, 5895, 2213, 64196, 't', 61893, 58157, 54416, 50917, 47186, 43425, 39700, 36213, 32466, 28709, 64752, 3344, 8190, 26734, 39384, 35635, 48270, 44786, 53327, 24021, 33232, 28718, '&', 61907, '&', 61904, 'f', 61840, 58161, 54480, 50929, 47121, 43440, 39761, 36208, 32402, 28786, 24963, 21480, 17748, 13985, 10253};

        /* renamed from: І  reason: contains not printable characters */
        private static int f232 = 1;

        /* renamed from: ı  reason: contains not printable characters */
        private final Map<String, Object> f233;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Context f234;

        static {
            Covode.recordClassIndex(2729);
        }

        /* renamed from: com.appsflyer.internal.c$a$c  reason: collision with other inner class name */
        public static class C0078c {

            /* renamed from: ı  reason: contains not printable characters */
            private final Object f235;

            /* renamed from: ɩ  reason: contains not printable characters */
            public String f236;

            /* renamed from: Ι  reason: contains not printable characters */
            private long f237;

            static {
                Covode.recordClassIndex(2730);
            }

            C0078c() {
            }

            public final String toString() {
                return new StringBuilder().append(this.f237).append(",").append(this.f236).toString();
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            static byte[] m173(String str) {
                return str.getBytes();
            }

            /* renamed from: ι  reason: contains not printable characters */
            private boolean m177(long j2) {
                if (j2 - this.f237 > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    return true;
                }
                return false;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m178(C0078c cVar) {
                return m172(cVar.f237, cVar.f236);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            static byte[] m174(byte[] bArr) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = (byte) (bArr[i2] ^ ((i2 % 2) + 42));
                }
                return bArr;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public static C0078c m175(String str) {
                if (str == null) {
                    return new C0078c(0, "");
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new C0078c(0, "");
                }
                return new C0078c(Long.parseLong(split[0]), split[1]);
            }

            /* renamed from: ι  reason: contains not printable characters */
            static String m176(byte[] bArr) {
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArr) {
                    String hexString = Integer.toHexString(b2);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(String.valueOf(hexString));
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            public C0078c(long j2, String str) {
                this.f235 = new Object();
                this.f237 = 0;
                this.f236 = "";
                this.f237 = j2;
                this.f236 = str;
            }

            /* renamed from: ı  reason: contains not printable characters */
            private boolean m172(long j2, String str) {
                MethodCollector.i(1506);
                synchronized (this.f235) {
                    if (str != null) {
                        try {
                            if (!str.equals(this.f236) && m177(j2)) {
                                this.f237 = j2;
                                this.f236 = str;
                                return true;
                            }
                        } finally {
                            MethodCollector.o(1506);
                        }
                    }
                    MethodCollector.o(1506);
                    return false;
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private String m170() {
            boolean z;
            boolean z2;
            boolean z3;
            int i2 = f232 + 49;
            f230 = i2 % 128;
            int i3 = i2 % 2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.f233.get(m169(0, 0, 12).intern()).toString();
                String obj2 = this.f233.get(m169(12, 0, 5).intern()).toString();
                if (obj2 != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    obj2 = m169(17, 0, 8).intern();
                    int i4 = f232 + 117;
                    f230 = i4 % 128;
                    int i5 = i4 % 2;
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r5 = m171(num, obj2, sb.toString());
                int length = r5.length();
                if (length <= 4) {
                    while (true) {
                        if (length >= 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            break;
                        }
                        length++;
                        r5.append('1');
                        int i6 = f232 + 67;
                        f230 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } else {
                    int i8 = f232 + 73;
                    f230 = i8 % 128;
                    if (i8 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        r5.delete(3, length);
                    } else {
                        r5.delete(4, length);
                    }
                }
                r5.insert(0, m169(25, 0, 3).intern());
                return r5.toString();
            } catch (Exception e2) {
                AFLogger.afRDLog(new StringBuilder().append(m169(28, 0, 42).intern()).append(e2).toString());
                return m169(70, 14499, 7).intern();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private String m168() {
            String str;
            char c2;
            int i2;
            char c3;
            try {
                String obj = this.f233.get(m169(0, 0, 12).intern()).toString();
                String obj2 = this.f233.get(m169(77, 0, 15).intern()).toString();
                str = new StringBuilder().append("").append(z.m213(new StringBuilder().append(obj).append(obj2).append(m169(92, 0, 5).intern().replaceAll(m169(97, 24516, 5).intern(), "")).toString()).substring(0, 16)).toString();
            } catch (Exception e2) {
                AFLogger.afRDLog(new StringBuilder().append(m169(102, 14232, 44).intern()).append(e2).toString());
                str = new StringBuilder().append("").append(m169(146, 51730, 18).intern()).toString();
            }
            try {
                Intent com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(this.f234, null, new IntentFilter(m169(164, 0, 37).intern()));
                int i3 = -2700;
                if (com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver != null) {
                    int i4 = f232 + 51;
                    f230 = i4 % 128;
                    if (i4 % 2 != 0) {
                        i3 = com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra(m169(15579, 0, 109).intern(), 25996);
                    } else {
                        i3 = com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra(m169(201, 0, 11).intern(), -2700);
                    }
                }
                String str2 = this.f234.getApplicationInfo().nativeLibraryDir;
                if (str2 == null) {
                    c2 = 'V';
                } else {
                    c2 = '0';
                }
                if (c2 == '0') {
                    int i5 = f232 + 15;
                    f230 = i5 % 128;
                    int i6 = i5 % 2;
                    if (str2.contains(m169(212, 64648, 3).intern())) {
                        int i7 = f232 + 111;
                        f230 = i7 % 128;
                        if (i7 % 2 == 0) {
                            c3 = 'O';
                        } else {
                            c3 = '4';
                        }
                        if (c3 == 'O') {
                            i2 = 1;
                            String obj3 = new StringBuilder().append(str).append(C0078c.m176(C0078c.m174(C0078c.m173(new StringBuilder().append(m169(221, 23991, 1).intern()).append(i3).append(m169(222, 33270, 2).intern()).append(i2).append(m169(224, 0, 2).intern()).append(((SensorManager) com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.f234, m169(215, 26653, 6).intern())).getSensorList(-1).size()).append(m169(226, 0, 2).intern()).append(this.f233.size()).toString())))).toString();
                            int i8 = f232 + 13;
                            f230 = i8 % 128;
                            int i9 = i8 % 2;
                            return obj3;
                        }
                    }
                }
                i2 = 0;
                String obj32 = new StringBuilder().append(str).append(C0078c.m176(C0078c.m174(C0078c.m173(new StringBuilder().append(m169(221, 23991, 1).intern()).append(i3).append(m169(222, 33270, 2).intern()).append(i2).append(m169(224, 0, 2).intern()).append(((SensorManager) com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.f234, m169(215, 26653, 6).intern())).getSensorList(-1).size()).append(m169(226, 0, 2).intern()).append(this.f233.size()).toString())))).toString();
                int i82 = f232 + 13;
                f230 = i82 % 128;
                int i92 = i82 % 2;
                return obj32;
            } catch (Exception e3) {
                AFLogger.afRDLog(new StringBuilder().append(m169(102, 14232, 44).intern()).append(e3).toString());
                return new StringBuilder().append(str).append(m169(228, 0, 16).intern()).toString();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static StringBuilder m171(String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                arrayList.add(Integer.valueOf(strArr[i2].length()));
                i2++;
            } while (i2 < 3);
            Collections.sort(arrayList);
            int intValue = ((Number) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < intValue; i3++) {
                int i4 = f230 + 105;
                f232 = i4 % 128;
                int i5 = i4 % 2;
                Integer num = null;
                int i6 = 0;
                do {
                    int charAt = strArr[i6].charAt(i3);
                    if (num == null) {
                        int i7 = f230 + 95;
                        f232 = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i6++;
                    int i9 = f230 + 87;
                    f232 = i9 % 128;
                    int i10 = i9 % 2;
                } while (i6 < 3);
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        public a(Map<String, Object> map, Context context) {
            this.f233 = map;
            this.f234 = context;
            put(m170(), m168());
        }

        public static Object com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
            Object obj;
            MethodCollector.i(2391);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new b().a();
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
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(2391);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        public static Intent com_appsflyer_internal_c$a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = com_appsflyer_internal_c$a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.c.a.com_appsflyer_internal_c$a_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private static String m169(int i2, char c2, int i3) {
            int i4 = f230 + 19;
            f232 = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i6 < i3) {
                int i7 = f232 + 95;
                int i8 = i7 % 128;
                f230 = i8;
                int i9 = i7 % 2;
                cArr[i6] = (char) ((int) ((((long) f231[i2 + i6]) ^ (((long) i6) * f229)) ^ ((long) c2)));
                i6++;
                int i10 = i8 + 125;
                f232 = i10 % 128;
                int i11 = i10 % 2;
            }
            return new String(cArr);
        }
    }

    static {
        Covode.recordClassIndex(2728);
    }

    private static Object com_appsflyer_internal_c_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_appsflyer_internal_c_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_appsflyer_internal_c_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    c() {
    }

    public static File com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m162(String str) {
        int i2 = f226 + 89;
        f228 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class.forName(str);
            int i4 = f228 + 49;
            f226 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m163(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i2 = f226 + 83;
            int i3 = i2 % 128;
            f228 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            f226 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m165(String str) {
        int i2 = f228 + 65;
        f226 = i2 % 128;
        int i3 = i2 % 2;
        if (!str.contains(m166(169, 49690, 1).intern())) {
            return str;
        }
        String[] split = str.split(m166(170, 46066, 2).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i4 = length - 1;
        sb.append(split[i4]).append(m166(169, 49690, 1).intern());
        int i5 = f226 + 103;
        f228 = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 1; i7 < i4; i7++) {
            int i8 = f226 + 61;
            f228 = i8 % 128;
            int i9 = i8 % 2;
            sb.append(split[i7]).append(m166(169, 49690, 1).intern());
        }
        sb.append(split[0]);
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m160(Context context) {
        char c2;
        char c3;
        if (!System.getProperties().containsKey(m166(172, 64087, 14).intern())) {
            c2 = 'C';
        } else {
            c2 = '.';
        }
        if (c2 == 'C') {
            return null;
        }
        int i2 = f226 + 51;
        f228 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Matcher matcher = Pattern.compile(m166(192, 13471, 10).intern()).matcher(com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(context).getPath().replace(m166(186, 0, 6).intern(), ""));
            if (!matcher.find()) {
                c3 = 'c';
            } else {
                c3 = ')';
            }
            if (c3 != ')') {
                return null;
            }
            int i4 = f228 + 89;
            f226 = i4 % 128;
            if (i4 % 2 == 0) {
            }
            return matcher.group(1);
        } catch (Exception e2) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
                int i5 = f226 + 87;
                f228 = i5 % 128;
                int i6 = i5 % 2;
            }
            ai.f184.m144(null, m166(202, 0, 17).intern(), new StringBuilder().append(m166(219, 50471, 41).intern()).append(e2).toString());
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m167(String str, Long l2) {
        boolean z;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i2 = f228 + 125;
            int i3 = i2 % 128;
            f226 = i3;
            int i4 = i2 % 2;
            if (l2 != null) {
                int i5 = i3 + 59;
                f228 = i5 % 128;
                int i6 = i5 % 2;
                if (str.length() == 32) {
                    StringBuilder sb = new StringBuilder(str);
                    String obj = l2.toString();
                    long j2 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < obj.length(); i8++) {
                        i7 += Character.getNumericValue(obj.charAt(i8));
                    }
                    String hexString = Integer.toHexString(i7);
                    sb.replace(7, hexString.length() + 7, hexString);
                    for (int i9 = 0; i9 < sb.length(); i9++) {
                        j2 += (long) Character.getNumericValue(sb.charAt(i9));
                    }
                    while (j2 > 100) {
                        j2 %= 100;
                    }
                    sb.insert(23, (int) j2);
                    if (j2 < 10) {
                        sb.insert(23, m166(35, 60972, 1).intern());
                    }
                    return sb.toString();
                }
            }
        }
        return m166(54, 21504, 32).intern();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m164(Context context, String str) {
        char c2;
        boolean z;
        int i2 = f228 + 27;
        f226 = i2 % 128;
        int i3 = i2 % 2;
        PackageManager packageManager = context.getPackageManager();
        try {
            Iterator it = ((List) com_appsflyer_internal_c_java_lang_reflect_Method_invoke(PackageManager.class.getDeclaredMethod("inValid".intern(), Integer.TYPE), packageManager, new Object[]{0})).iterator();
            int i4 = f228 + 1;
            f226 = i4 % 128;
            int i5 = i4 % 2;
            do {
                if (!it.hasNext()) {
                    c2 = 7;
                } else {
                    c2 = '7';
                }
                if (c2 != '7') {
                    return Boolean.FALSE.toString();
                }
                if (!((PackageItemInfo) it.next()).packageName.equals(str)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            int i6 = f226 + 101;
            f228 = i6 % 128;
            if (i6 % 2 == 0) {
                return Boolean.TRUE.toString();
            }
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e2) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144(null, m166(284, 48864, 24).intern(), new StringBuilder().append(m166(308, 48289, 47).intern()).append(e2).toString());
        } catch (NoSuchMethodException e3) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
                int i7 = f226 + 25;
                f228 = i7 % 128;
                int i8 = i7 % 2;
            }
            ai.f184.m144(null, m166(284, 48864, 24).intern(), new StringBuilder().append(m166(308, 48289, 47).intern()).append(e3).toString());
        } catch (InvocationTargetException e4) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144(null, m166(284, 48864, 24).intern(), new StringBuilder().append(m166(308, 48289, 47).intern()).append(e4).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m161(android.content.Context r15, long r16) {
        /*
        // Method dump skipped, instructions count: 581
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.c.m161(android.content.Context, long):java.lang.String");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m166(int i2, char c2, int i3) {
        char[] cArr = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = f228;
            int i6 = i5 + 85;
            f226 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[i4] = (char) ((int) ((((long) f225[i2 + i4]) | (((long) i4) % f227)) * ((long) c2)));
                i4 += 37;
            } else {
                cArr[i4] = (char) ((int) ((((long) f225[i2 + i4]) ^ (((long) i4) * f227)) ^ ((long) c2)));
                i4++;
            }
            int i7 = i5 + 109;
            f226 = i7 % 128;
            int i8 = i7 % 2;
        }
        return new String(cArr);
    }
}

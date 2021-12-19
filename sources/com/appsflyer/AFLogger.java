package com.appsflyer;

import com.a;
import com.appsflyer.internal.ai;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ι  reason: contains not printable characters */
    private static long f36 = System.currentTimeMillis();

    public static int com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static int com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f38;

        public final int getLevel() {
            return this.f38;
        }

        static {
            Covode.recordClassIndex(2652);
        }

        private LogLevel(int i2) {
            this.f38 = i2;
        }
    }

    public static void resetDeltaTime() {
        f36 = System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(2651);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m19() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afWarnLog(String str) {
        m21(str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m22(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    public static void afDebugLog(String str) {
        if (m22(LogLevel.DEBUG)) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d("AppsFlyer_5.4.1", m17(str, false));
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144(null, "D", m17(str, true));
    }

    public static void afRDLog(String str) {
        if (m22(LogLevel.VERBOSE)) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_v("AppsFlyer_5.4.1", m17(str, false));
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144(null, "V", m17(str, true));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m18(String str) {
        if (!m19()) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d("AppsFlyer_5.4.1", m17(str, false));
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144(null, "F", str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m21(String str) {
        if (m22(LogLevel.WARNING)) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w("AppsFlyer_5.4.1", m17(str, false));
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144(null, "W", m17(str, true));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m20(long j2) {
        long hours = TimeUnit.MILLISECONDS.toHours(j2);
        long millis = j2 - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return a.a(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3)});
    }

    public static void afErrorLog(String str, Throwable th) {
        m16(str, th, true);
    }

    public static void afInfoLog(String str, boolean z) {
        if (m22(LogLevel.INFO)) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", m17(str, false));
        }
        if (z) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144(null, "I", m17(str, true));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m17(String str, boolean z) {
        if (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return new StringBuilder("(").append(m20(System.currentTimeMillis() - f36)).append(") [").append(Thread.currentThread().getName()).append("] ").append(str).toString();
        }
        return str;
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m16(str, th, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m16(String str, Throwable th, boolean z) {
        String message;
        StackTraceElement[] stackTrace;
        String[] strArr;
        if (m22(LogLevel.ERROR) && z) {
            com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e("AppsFlyer_5.4.1", m17(str, false), th);
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai aiVar = ai.f184;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
            stackTrace = th.getStackTrace();
        } else {
            message = cause.getMessage();
            stackTrace = cause.getStackTrace();
        }
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            strArr = new String[(stackTrace.length + 1)];
            strArr[0] = message;
            for (int i2 = 1; i2 < stackTrace.length; i2++) {
                strArr[i2] = stackTrace[i2].toString();
            }
        }
        aiVar.m144("exception", simpleName, strArr);
    }
}

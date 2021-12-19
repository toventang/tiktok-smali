package com.bytedance.framwork.core.sdkmonitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static b f29545a;

    public interface b {
        static {
            Covode.recordClassIndex(17197);
        }

        String a();
    }

    static {
        Covode.recordClassIndex(17195);
    }

    public enum c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        static {
            Covode.recordClassIndex(17198);
        }

        private c(int i2) {
            this.nativeInt = i2;
        }
    }

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(17196);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(9329);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(9329);
                return byteArray;
            }
        }
    }

    public static c a(Context context) {
        int i2;
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isAvailable()) {
                return c.NONE;
            }
            int type = a2.getType();
            if (1 == type) {
                return c.WIFI;
            }
            if (type != 0) {
                return c.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
            if (Build.VERSION.SDK_INT >= 29) {
                if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                    com.ss.android.ugc.aweme.lancet.d.a.a().a();
                }
                i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                if (!com.ss.android.ugc.aweme.lancet.d.a.f107200c && i2 == -1) {
                    return c.MOBILE;
                }
            } else {
                i2 = telephonyManager.getNetworkType();
            }
            switch (i2) {
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                case 15:
                    return c.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    return c.MOBILE_4G;
            }
            return c.MOBILE;
        } catch (Throwable unused) {
            return c.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12623);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12623);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static byte[] a(byte[] bArr, Map<String, String> map) {
        MethodCollector.i(9331);
        if (bArr.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                map.put("Content-Encoding", "gzip");
            } catch (IOException e2) {
                MethodCollector.o(9331);
                throw e2;
            } catch (Throwable th) {
                gZIPOutputStream.close();
                MethodCollector.o(9331);
                throw th;
            }
        }
        MethodCollector.o(9331);
        return bArr;
    }

    public static com.bytedance.services.apm.api.c a(String str, byte[] bArr, a aVar, String str2, boolean z) {
        String str3 = str2;
        String str4 = str;
        byte[] bArr2 = bArr;
        MethodCollector.i(9334);
        String str5 = null;
        if (str4 == null) {
            MethodCollector.o(9334);
            return null;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        int length = bArr2.length;
        if (a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr2);
                gZIPOutputStream.close();
                bArr2 = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                MethodCollector.o(9334);
                return null;
            }
        } else if (a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr2);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr2 = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        if (z) {
            byte[] a2 = EncryptorUtil.a(bArr2, bArr2.length);
            if (a2 != null) {
                str4 = str4 + "&tt_data=a";
                str3 = "application/octet-stream;tt-data=a";
            } else {
                a2 = bArr2;
            }
            com.bytedance.services.apm.api.c a3 = a(str4, a2, str3, str5, "POST", true, true);
            MethodCollector.o(9334);
            return a3;
        }
        com.bytedance.services.apm.api.c a4 = a(str4, bArr2, str3, str5, "POST", true, false);
        MethodCollector.o(9334);
        return a4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC, Splitter:B:33:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5 A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.services.apm.api.c a(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.j.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.services.apm.api.c");
    }
}

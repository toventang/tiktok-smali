package com.facebook.e.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.facebook.internal.ac;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.m;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f47502a = a.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, NsdManager.RegistrationListener> f47503b = new HashMap<>();

    static {
        Covode.recordClassIndex(28818);
    }

    public static String a() {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device", Build.DEVICE);
                jSONObject.put("model", Build.MODEL);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    public static boolean b() {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            ae.a();
            q a2 = r.a(m.f48915a);
            int i2 = Build.VERSION.SDK_INT;
            if (a2 == null || !a2.f48644e.contains(ac.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    public static boolean a(String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            if (b()) {
                return d(str);
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    public static void c(String str) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (!com.facebook.internal.a.b.a.a(a.class)) {
                    try {
                        NsdManager.RegistrationListener registrationListener = f47503b.get(str);
                        if (registrationListener != null) {
                            ae.a();
                            try {
                                ((NsdManager) a(m.f48921g, "servicediscovery")).unregisterService(registrationListener);
                            } catch (IllegalArgumentException e2) {
                                ad.a(f47502a, (Exception) e2);
                            }
                            f47503b.remove(str);
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, a.class);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, a.class);
            }
        }
    }

    public static Bitmap b(String str) {
        Bitmap bitmap;
        int i2;
        MethodCollector.i(8842);
        if (com.facebook.internal.a.b.a.a(a.class)) {
            MethodCollector.o(8842);
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put((Object) EncodeHintType.MARGIN, (Object) 2);
            try {
                BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                int height = encode.getHeight();
                int width = encode.getWidth();
                int[] iArr = new int[(height * width)];
                for (int i3 = 0; i3 < height; i3++) {
                    int i4 = i3 * width;
                    for (int i5 = 0; i5 < width; i5++) {
                        int i6 = i4 + i5;
                        if (encode.get(i5, i3)) {
                            i2 = -16777216;
                        } else {
                            i2 = -1;
                        }
                        iArr[i6] = i2;
                    }
                }
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                try {
                    bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                } catch (WriterException unused) {
                }
            } catch (WriterException unused2) {
                bitmap = null;
            }
            MethodCollector.o(8842);
            return bitmap;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            MethodCollector.o(8842);
            return null;
        }
    }

    private static boolean d(final String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            if (f47503b.containsKey(str)) {
                return true;
            }
            final String a2 = com.a.a("%s_%s_%s", new Object[]{"fbsdk", com.a.a("%s-%s", new Object[]{"android", "9.0.0".replace('.', '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(a2);
            nsdServiceInfo.setPort(80);
            ae.a();
            AnonymousClass1 r1 = new NsdManager.RegistrationListener() {
                /* class com.facebook.e.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28819);
                }

                public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
                }

                public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
                }

                public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                    if (!a2.equals(nsdServiceInfo.getServiceName())) {
                        a.c(str);
                    }
                }

                public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
                    a.c(str);
                }
            };
            f47503b.put(str, r1);
            ((NsdManager) a(m.f48921g, "servicediscovery")).registerService(nsdServiceInfo, 1, r1);
            return true;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9080);
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
                    MethodCollector.o(9080);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

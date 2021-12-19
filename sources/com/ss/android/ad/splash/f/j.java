package com.ss.android.ad.splash.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.f.g;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.f;
import com.ss.android.ad.splash.core.e.l;
import com.ss.android.ad.splash.core.e.p;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.k;
import com.ss.android.ad.splash.core.v;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.d;
import com.ss.android.ad.splash.core.x;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f58970a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f58971b;

    public static boolean a(long j2, long j3) {
        return j3 > j2;
    }

    public static boolean a(v vVar) {
        int m2 = vVar.m();
        return m2 > 0 && vVar.o() >= m2;
    }

    public static String a(f fVar) {
        List<String> list;
        if (fVar == null || (list = fVar.f58477a) == null || list.isEmpty()) {
            return null;
        }
        String str = list.get(0);
        if (!l.a(str) || list.size() < 2) {
            return str;
        }
        String str2 = list.get(1);
        return (!l.a(str2) || list.size() < 3) ? str2 : list.get(2);
    }

    public static String a(p pVar) {
        if (pVar == null || pVar.f58524c == null || pVar.f58524c.isEmpty()) {
            return null;
        }
        return n.a(pVar.f58524c.get(0));
    }

    private static void a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static String a(boolean z) {
        com.ss.android.ad.splash.core.f b2 = h.b();
        b2.f58536a = false;
        HashMap<String, String> i2 = h.i();
        StringBuilder sb = new StringBuilder(5120);
        try {
            String r = v.a().r();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append((CharSequence) k());
            sb.append(b2.toString());
            if (i2 != null) {
                sb.append(a(i2));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            int p = v.a().p();
            a.a(0, " sending stop request, current refresh time is ".concat(String.valueOf(p)));
            sb.append("&refresh_num=");
            sb.append(p);
            if (h.X != -1) {
                sb.append("&is_cold_start=");
                sb.append(h.X);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public static boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return bVar.i() || bVar.h();
    }

    public static boolean a(f fVar, v vVar) {
        return fVar != null && fVar.a() && a(fVar.f58480d, vVar);
    }

    public static boolean a(p pVar, v vVar) {
        return pVar != null && pVar.a() && a(pVar.f58525d, vVar);
    }

    private static boolean a(String str, v vVar) {
        if (l.a(str)) {
            return false;
        }
        String[] strArr = {e(str), c(str)};
        int i2 = 0;
        do {
            String str2 = strArr[i2];
            if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                if (vVar.e(str)) {
                    return true;
                }
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(str, str2);
                k.a();
                k.a(str, str2);
            }
            i2++;
        } while (i2 < 2);
        vVar.d(str);
        return false;
    }

    public static List<b> a(JSONArray jSONArray, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            JSONObject jSONObject = null;
            if (z) {
                jSONObject = g();
            }
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j2, z);
                    if (z) {
                        if (jSONObject != null) {
                            int optInt = jSONObject.optInt(String.valueOf(bVar.f58441d), 0);
                            bVar.R = optInt;
                            a.a("show times updated, id:" + bVar.f58441d + ", current show time: " + optInt);
                        }
                    } else if (a(bVar)) {
                        com.ss.android.ad.splash.core.c.b.a();
                        com.ss.android.ad.splash.core.c.b.a(bVar, "topview_boarding");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public static List<b> a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static Map<String, b> a(List<b> list) {
        HashMap hashMap = new HashMap();
        if (f.a(list)) {
            return hashMap;
        }
        for (b bVar : list) {
            if (!TextUtils.isEmpty(bVar.E)) {
                hashMap.put(bVar.E, bVar);
            }
        }
        return hashMap;
    }

    public static List<b> a(List<b> list, List<b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            if (bVar.d() > instance.getTimeInMillis() || currentTimeMillis >= bVar.e()) {
                a.a(bVar.f58441d, "preload progress: first-show ad expired");
            } else {
                arrayList.add(bVar);
                a.a(bVar.f58441d, "preload progress: suitable first-show ad");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (f.a(list2)) {
            return arrayList;
        }
        for (b bVar2 : list2) {
            if (bVar2.u == 1) {
                arrayList2.add(bVar2);
                a.a(bVar2.f58441d, "preload progress: get one first-show ad");
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static <E extends l> List<b> a(Map<String, b> map, List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (!f.a(list) && map != null) {
            for (E e2 : list) {
                b bVar = map.get(e2.x());
                if (bVar != null) {
                    if (e2 instanceof com.ss.android.ad.splash.core.e.k) {
                        bVar.f58447j = ((com.ss.android.ad.splash.core.e.k) e2).f58497a;
                        bVar.C = true;
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public static List<l> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new l(optString));
                }
            }
        }
        return arrayList;
    }

    private static String a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (!l.a(entry.getKey()) && !l.a(entry.getValue())) {
                sb.append("&");
                sb.append(a.a("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    public static void a(final View view, final int i2, final int i3, final int i4, final int i5) {
        ((View) view.getParent()).post(new Runnable() {
            /* class com.ss.android.ad.splash.f.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36484);
            }

            public final void run() {
                View view = view;
                if (view != null && view.getParent() != null) {
                    Rect rect = new Rect();
                    view.setEnabled(true);
                    view.getHitRect(rect);
                    rect.top -= i2;
                    rect.bottom += i3;
                    rect.left -= i4;
                    rect.right += i5;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            }
        });
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(3659);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    a(byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.o(3659);
                    return byteArray;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                a(byteArrayOutputStream);
                MethodCollector.o(3659);
                return null;
            } catch (Throwable th) {
                a(byteArrayOutputStream);
                MethodCollector.o(3659);
                throw th;
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean a(Context context) {
        return g.a(context.getResources().getConfiguration().locale) == 1;
    }

    public static com.ss.android.ad.splash.core.video2.g a(BDASplashVideoView bDASplashVideoView) {
        if (h.a().o) {
            return new com.ss.android.ad.splash.core.video2.a(bDASplashVideoView);
        }
        return new d(bDASplashVideoView);
    }

    private static boolean a(File file) {
        MethodCollector.i(3602);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3602);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3602);
        return delete;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3566);
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
                    MethodCollector.o(3566);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(int[] iArr, long j2, long j3) {
        a.a(0, ", is skippable: ");
        boolean z = true;
        if (iArr != null && iArr.length >= 2) {
            long a2 = a(j2);
            long j4 = (((long) iArr[0]) * 1000) + a2;
            if (j3 > a2 + (((long) iArr[1]) * 1000) || j3 < j4) {
                z = false;
            }
            a.a(0, " whether first-show-timegap opportunity has been consumed : ".concat(String.valueOf(z)));
        }
        return z;
    }

    public static String a(p pVar, boolean z) {
        if (TextUtils.isEmpty(h.I) || !z) {
            return b(pVar);
        }
        return c(pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int r4, boolean r5) {
        /*
            r3 = 0
            r1 = 2
            r2 = 1
            if (r4 == 0) goto L_0x001a
            if (r4 == r2) goto L_0x0013
            if (r4 == r1) goto L_0x0013
            r0 = 3
            if (r4 == r0) goto L_0x001a
            r1 = 0
        L_0x000d:
            int r0 = com.ss.android.ad.splash.core.h.ap
            r1 = r1 & r0
            if (r1 <= 0) goto L_0x001f
            return r2
        L_0x0013:
            if (r5 == 0) goto L_0x0018
            r1 = 8
            goto L_0x000d
        L_0x0018:
            r1 = 4
            goto L_0x000d
        L_0x001a:
            if (r5 == 0) goto L_0x001d
            goto L_0x000d
        L_0x001d:
            r1 = 1
            goto L_0x000d
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.f.j.a(int, boolean):boolean");
    }

    private static byte[] a(byte[] bArr, String str) {
        try {
            int length = str.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr2[i2] = Integer.valueOf(str.substring(i3, i3 + 2), 16).byteValue();
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 12, bArr.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 0, 12));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(copyOfRange);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int a() {
        int i2 = i();
        if (i2 <= 0) {
            return j();
        }
        return i2;
    }

    private static int i() {
        return (int) o.a(h.r, (float) h.M);
    }

    public static JSONObject g() {
        try {
            String string = v.a().f58720b.getString("key_splash_show_times_map", "");
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int h() {
        int a2 = (int) o.a(h.r, (float) h.S);
        if (a2 > 0) {
            return a2;
        }
        return (a() / 2) - h.r.getResources().getDimensionPixelSize(R.dimen.sp);
    }

    public static String c() {
        com.ss.android.ad.splash.core.e.h hVar = k.a().f58658c;
        if (hVar == null) {
            return null;
        }
        List<b> list = hVar.f58486a;
        if (f.a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).D;
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                if (i2 != list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static String d() {
        StringBuilder sb = new StringBuilder(5120);
        com.ss.android.ad.splash.core.f b2 = h.b();
        b2.f58536a = true;
        try {
            String r = v.a().r();
            sb.append("/api/ad/v3/splash/creatives/");
            sb.append("?_unused=0");
            sb.append((CharSequence) k());
            sb.append(b2.toString());
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            if (h.X != -1) {
                sb.append("&is_cold_start=");
                sb.append(h.X);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(5120);
        com.ss.android.ad.splash.core.f b2 = h.b();
        b2.f58536a = true;
        try {
            String r = v.a().r();
            sb.append("/api/ad/v2/ack/splash/");
            sb.append("?_unused=0");
            sb.append((CharSequence) k());
            sb.append(b2.toString());
            if (!TextUtils.isEmpty(r)) {
                sb.append(r);
            }
            sb.append("&refresh_num=");
            sb.append(v.a().p());
            if (h.X != -1) {
                sb.append("&is_cold_start=");
                sb.append(h.X);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    private static int j() {
        int i2;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) a(h.r, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d2 = (double) h.r.getResources().getDisplayMetrics().density;
        if (d2 <= 1.1d) {
            i2 = 100;
        } else if (d2 <= 1.6d) {
            i2 = 960;
        } else {
            i2 = 1260;
        }
        return (((point.y - i.a(h.r)) * 200) / i2) + ((int) o.a(h.r, 25.0f));
    }

    public static String b() {
        com.ss.android.ad.splash.core.f b2 = h.b();
        b2.f58536a = true;
        HashMap<String, String> i2 = h.i();
        String b3 = b2.b();
        if (l.a(b3)) {
            a.a(0, "app_name is null, please check whether SplashAdSdk is initialized properly!", null);
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/").append(b3);
            if (h.Y) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append((CharSequence) k());
            sb.append(b2.toString());
            sb.append("&app_name=");
            sb.append(b3);
            if (i2 != null) {
                sb.append(a(i2));
            }
            sb.append("&refresh_num=");
            sb.append(v.a().p() + 1);
            if (h.X != -1) {
                sb.append("&is_cold_start=");
                sb.append(h.X);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public static long f() {
        if (!h.ak) {
            return System.currentTimeMillis();
        }
        long e2 = x.a().e();
        if (e2 != -1) {
            a.a("time check, remote time back:".concat(String.valueOf(e2)));
            return e2;
        }
        long c2 = v.a().c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < c2) {
            a.a("time check, device restarted, current time :" + elapsedRealtime + ", last boot time: " + c2);
            return -1;
        }
        long b2 = v.a().b();
        long j2 = elapsedRealtime - c2;
        long j3 = b2 + j2;
        a.a("time check, last remote time: " + b2 + ", time gap between launch: " + j2 + ", current time calculated: " + j3);
        return j3;
    }

    static {
        Covode.recordClassIndex(36483);
        HashMap hashMap = new HashMap();
        f58970a = hashMap;
        HashSet hashSet = new HashSet();
        f58971b = hashSet;
        hashMap.put("1128", "aweme");
        hashMap.put("1180", "trill");
        hashMap.put("1233", "musical");
        hashMap.put("13", "news_article");
        hashMap.put("35", "news_article_lite");
        hashMap.put("32", "video_article");
        hashMap.put("1106", "topbuzz");
        hashMap.put("1116", "topbuzz");
        hashMap.put("1131", "topbuzz");
        hashMap.put("1184", "topbuzz");
        hashMap.put("1104", "topbuzz");
        hashMap.put("1117", "topbuzz");
        hashMap.put("1132", "topbuzz");
        hashMap.put("1185", "topbuzz");
        hashMap.put("1239", "topbuzz");
        hashMap.put("1197", "topbuzz");
        hashMap.put("1193", "topbuzz");
        hashMap.put("1222", "topbuzz");
        hashMap.put("1211", "topbuzz");
        hashMap.put("1194", "topbuzz");
        hashMap.put("1124", "topbuzz");
        hashMap.put("1125", "topbuzz");
        hashMap.put("1245", "topbuzz");
        hashMap.put("1113", "topbuzz");
        hashMap.put("1342", "topbuzz");
        hashMap.put("1346", "topbuzz");
        hashMap.put("1145", "live_i18n");
        hashMap.put("1164", "flipagram");
        hashMap.put("7", "neihan");
        hashMap.put("10001", "faceu");
        hashMap.put("1207", "learning");
        hashMap.put("36", "automobile");
        hashMap.put("150121", "beauty_me");
        hashMap.put("1372", "beauty_me_oversea");
        hashMap.put("1319", "super");
        hashMap.put("1370", "f100");
        hashMap.put("1488", "f101");
        hashMap.put("1353", "hively");
        hashMap.put("1354", "hively");
        hashMap.put("1112", "live_stream");
        hashMap.put("1350", "live_stream_lite");
        hashMap.put("1398", "homed");
        hashMap.put("1967", "novelapp");
        hashMap.put("1840", "xianshijie");
        hashMap.put("3040", "novel_fm");
        hashSet.add("1180");
        hashSet.add("1233");
        hashSet.add("1106");
        hashSet.add("1116");
        hashSet.add("1131");
        hashSet.add("1184");
        hashSet.add("1104");
        hashSet.add("1117");
        hashSet.add("1132");
        hashSet.add("1185");
        hashSet.add("1239");
        hashSet.add("1197");
        hashSet.add("1193");
        hashSet.add("1222");
        hashSet.add("1211");
        hashSet.add("1194");
        hashSet.add("1124");
        hashSet.add("1125");
        hashSet.add("1245");
        hashSet.add("1113");
        hashSet.add("1342");
        hashSet.add("1346");
        hashSet.add("1372");
    }

    private static StringBuilder k() {
        StringBuilder sb = new StringBuilder(1024);
        TelephonyManager telephonyManager = (TelephonyManager) a(h.r, "phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!l.a(networkOperatorName)) {
                sb.append("&carrier=").append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!l.a(networkOperator)) {
                sb.append("&mcc_mnc=").append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = h.r.getResources().getDisplayMetrics();
        Context context = h.r;
        int b2 = i.f58955c.b(context);
        int a2 = i.a(h.r, false);
        sb.append("&ad_area=").append(displayMetrics.widthPixels).append("x").append(displayMetrics.heightPixels - i.a(context));
        sb.append("&sdk_version=").append(h.f58572a);
        sb.append("&os_api=").append(Build.VERSION.SDK_INT);
        sb.append("&device_platform=android");
        sb.append("&os_version=").append(Build.VERSION.RELEASE);
        if (h.a().r) {
            sb.append("&display_density=").append(a2).append("x").append(b2);
        } else {
            sb.append("&display_density=").append(displayMetrics.widthPixels).append("x").append(displayMetrics.heightPixels);
        }
        sb.append("&dpi=").append(o.b(h.r));
        sb.append("&device_brand=").append(Uri.encode(Build.BRAND));
        sb.append("&device_type=").append(Uri.encode(Build.MODEL));
        int a3 = a();
        if (a3 > 0) {
            sb.append("&bh=").append(a3);
        }
        sb.append("&display_dpi=").append(displayMetrics.densityDpi);
        sb.append("&density=").append(displayMetrics.density);
        String d2 = h.d(h.r);
        if (!l.a(d2)) {
            sb.append("&ac=").append(Uri.encode(d2));
        }
        return sb;
    }

    public static String b(f fVar) {
        if (fVar == null || !fVar.a()) {
            return null;
        }
        return c(fVar.f58480d);
    }

    private static String c(p pVar) {
        if (pVar == null || !pVar.a()) {
            return null;
        }
        return e(pVar.f58525d);
    }

    private static String e(String str) {
        if (l.a(str)) {
            return null;
        }
        String str2 = h.I;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return c(str2, str);
    }

    public static int a(String str) {
        if (l.a(str)) {
            return 0;
        }
        try {
            if (l.a(Uri.parse(str).getScheme())) {
                return 0;
            }
            if (p.a(str)) {
                return 2;
            }
            if (p.b(str)) {
                return 5;
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(p pVar) {
        if (pVar == null || !pVar.a()) {
            return null;
        }
        return c(pVar.f58525d);
    }

    private static String c(String str) {
        if (h.a().f58911c) {
            return d(str);
        }
        if (l.a(str)) {
            return null;
        }
        String e2 = h.e();
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        return c(e2, str);
    }

    public static long a(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        a(instance);
        return instance.getTimeInMillis();
    }

    public static JSONArray b(List<b> list) {
        JSONArray jSONArray = new JSONArray();
        if (f.a(list)) {
            return jSONArray;
        }
        try {
            for (b bVar : list) {
                if (bVar.F != null) {
                    jSONArray.put(bVar.F);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static long a(com.ss.android.ad.splash.c.a aVar) {
        if (aVar instanceof b) {
            return (((b) aVar).e() - System.currentTimeMillis()) / 1000;
        }
        return 0;
    }

    private static String d(String str) {
        String str2;
        String str3 = null;
        if (l.a(str)) {
            return null;
        }
        String e2 = h.e();
        String f2 = h.f();
        if (TextUtils.isEmpty(e2) && TextUtils.isEmpty(f2)) {
            return null;
        }
        if (e2 != null && e2.equals(f2)) {
            return c(e2, str);
        }
        if (!TextUtils.isEmpty(e2)) {
            str2 = c(e2, str);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(f2)) {
            str3 = c(f2, str);
        }
        if (!d.c(str2) && d.c(str3)) {
            return str3;
        }
        return str2;
    }

    public static boolean b(String str) {
        if (l.a(str)) {
            return false;
        }
        try {
            int a2 = a(str);
            if (a2 == 1) {
                Uri parse = Uri.parse(str);
                if ("sslocal".equalsIgnoreCase(parse.getScheme())) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                List<ResolveInfo> queryIntentActivities = h.r.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    return false;
                }
                return true;
            } else if (a2 == 2 || a2 == 5) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            com.ss.android.ad.splash.b.a.a().a(e2, "key_exception_open_url");
            return false;
        }
    }

    public static int a(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    private static String c(String str, String str2) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                a(file);
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            return str + b.a(str2);
        } catch (Exception unused) {
            a.a(0, " illegal cache path ");
            return null;
        }
    }

    public static Pair<Boolean, Integer> a(long j2, int[][] iArr) {
        if (iArr != null && iArr.length > 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            a(instance);
            long timeInMillis = j2 - instance.getTimeInMillis();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int[] iArr2 = iArr[i2];
                if (iArr2.length >= 2) {
                    long j3 = ((long) iArr2[1]) * 1000;
                    if (((long) iArr2[0]) * 1000 <= timeInMillis && timeInMillis <= j3) {
                        return new Pair<>(true, Integer.valueOf(i2));
                    }
                }
            }
        }
        return null;
    }

    public static byte[] b(String str, String str2) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e2;
        MethodCollector.i(3653);
        BufferedInputStream bufferedInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3653);
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            MethodCollector.o(3653);
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] a2 = a(a((InputStream) bufferedInputStream), str2);
                a((Closeable) bufferedInputStream);
                MethodCollector.o(3653);
                return a2;
            } catch (FileNotFoundException e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    a((Closeable) bufferedInputStream);
                    MethodCollector.o(3653);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    a((Closeable) bufferedInputStream2);
                    MethodCollector.o(3653);
                    throw th;
                }
            }
        } catch (FileNotFoundException e4) {
            e2 = e4;
            bufferedInputStream = null;
            e2.printStackTrace();
            a((Closeable) bufferedInputStream);
            MethodCollector.o(3653);
            return null;
        } catch (Throwable th3) {
            th = th3;
            a((Closeable) bufferedInputStream2);
            MethodCollector.o(3653);
            throw th;
        }
    }

    public static com.ss.android.ad.splash.core.e.h a(JSONArray jSONArray, JSONArray jSONArray2, long j2) {
        com.ss.android.ad.splash.core.e.h hVar = new com.ss.android.ad.splash.core.e.h();
        ArrayList<b> arrayList = new ArrayList();
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j2);
                    arrayList.add(bVar);
                }
            }
        }
        if (h.am != null) {
            h.am.a(arrayList);
        }
        List<b> a2 = a(jSONArray, true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (b bVar2 : a2) {
            if (!l.a(bVar2.E)) {
                arrayList2.add(bVar2);
            }
        }
        for (b bVar3 : arrayList) {
            if (a(bVar3)) {
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(bVar3, "topview_boarding");
            }
            if (!l.a(bVar3.E)) {
                arrayList3.add(bVar3);
            }
        }
        arrayList2.removeAll(arrayList3);
        arrayList2.addAll(arrayList3);
        Map<String, b> a3 = a(arrayList2);
        hVar.f58486a = arrayList2;
        hVar.f58488c = a3;
        hVar.f58489d = arrayList;
        return hVar;
    }

    public static FrameLayout.LayoutParams a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = f2 / f3;
        float f5 = (float) i4;
        float f6 = (float) i5;
        float f7 = f5 / f6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f7 > f4) {
            i7 = (int) ((f5 * f3) / f6);
            i6 = i3;
        } else {
            if (f7 < f4) {
                i6 = (int) ((f2 * f6) / f5);
                i7 = i2;
            }
            return layoutParams;
        }
        int i8 = (-Math.abs(i7 - i2)) / 2;
        int i9 = (-Math.abs(i6 - i3)) / 2;
        layoutParams.setMargins(i8, i9, i8, i9);
        return layoutParams;
    }
}

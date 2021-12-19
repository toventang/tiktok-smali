package com.facebook.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.g;
import com.facebook.GraphRequest;
import com.facebook.a.p;
import com.facebook.ab;
import com.facebook.j;
import com.facebook.m;
import com.facebook.r;
import com.facebook.s;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.feed.experiment.ag;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    private static int f48514a;

    /* renamed from: b  reason: collision with root package name */
    private static long f48515b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static long f48516c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f48517d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static String f48518e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f48519f = "";

    /* renamed from: g  reason: collision with root package name */
    private static String f48520g = "NoCarrier";

    public interface a {
        static {
            Covode.recordClassIndex(29269);
        }

        void a(j jVar);

        void a(JSONObject jSONObject);
    }

    public interface b<T, K> {
        static {
            Covode.recordClassIndex(29270);
        }

        K a(T t);
    }

    public static <T> boolean a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static String a(String str, String str2) {
        return a(str) ? str2 : str;
    }

    static String a(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString((b2 >> 0) & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static void a(Bundle bundle, String str, String str2) {
        if (!a(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            a(bundle, str, uri.toString());
        }
    }

    public static boolean a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static List<String> a(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static String a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        InputStreamReader inputStreamReader;
        Throwable th;
        MethodCollector.i(3759);
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
                a((Closeable) bufferedInputStream);
                a(inputStreamReader);
                MethodCollector.o(3759);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[2048];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String sb2 = sb.toString();
                        a((Closeable) bufferedInputStream);
                        a(inputStreamReader);
                        MethodCollector.o(3759);
                        return sb2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                a((Closeable) bufferedInputStream);
                a(inputStreamReader);
                MethodCollector.o(3759);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            inputStreamReader = null;
            a((Closeable) bufferedInputStream);
            a(inputStreamReader);
            MethodCollector.o(3759);
            throw th;
        }
    }

    private static void a(Context context, String str) {
        String cookie;
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie2 = instance.getCookie(str);
        if (cookie2 != null) {
            for (String str2 : cookie2.split(";")) {
                String[] split = str2.split("=");
                if (split.length > 0) {
                    instance.setCookie(str, split[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    if (f.a(g.a()) && ag.a() && (cookie = CookieManager.getInstance().getCookie(com.ss.android.ugc.aweme.feed.f.a.a())) != null && !TextUtils.equals(cookie, com.ss.android.ugc.aweme.feed.f.a.b())) {
                        com.ss.android.ugc.aweme.feed.f.a.a(com.ss.android.ugc.aweme.feed.f.a.a(), cookie);
                    }
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static <T> boolean a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    public static void a(File file) {
        File[] listFiles;
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
            b(file);
        }
    }

    public static <T> List<T> a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            T t = tArr[i2];
            if (t != null) {
                arrayList.add(t);
            }
            i2++;
        } while (i2 < 2);
        return arrayList;
    }

    public static String a(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void a(JSONObject jSONObject, b bVar, String str, boolean z) {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", ab.c());
        if (bVar != null) {
            if (bVar.f48562a != null) {
                jSONObject.put("attribution", bVar.f48562a);
            }
            if (bVar.a() != null) {
                jSONObject.put("advertiser_id", bVar.a());
                jSONObject.put("advertiser_tracking_enabled", !bVar.f48564c);
            }
            if (!bVar.f48564c) {
                String a2 = p.a();
                if (!a2.isEmpty()) {
                    jSONObject.put("ud", a2);
                }
            }
            if (bVar.f48563b != null) {
                jSONObject.put("installer_package", bVar.f48563b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[Catch:{ Exception -> 0x0090 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(org.json.JSONObject r6, android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ad.a(org.json.JSONObject, android.content.Context):void");
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        try {
            return a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static <T, K> List<K> a(List<T> list, b<T, K> bVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            K a2 = bVar.a(t);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static Date a(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object a2 = a(bundle, str);
        if (a2 instanceof Long) {
            parseLong = ((Long) a2).longValue();
        } else if (!(a2 instanceof String)) {
            return null;
        } else {
            try {
                parseLong = Long.parseLong((String) a2);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (parseLong * 1000));
    }

    public static void a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static Map<String, String> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static void a(final String str, final a aVar) {
        JSONObject a2 = aa.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        AnonymousClass1 r1 = new GraphRequest.b() {
            /* class com.facebook.internal.ad.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29267);
            }

            @Override // com.facebook.GraphRequest.b
            public final void a(r rVar) {
                if (rVar.f49019d != null) {
                    aVar.a(rVar.f49019d.n);
                    return;
                }
                aa.f48509a.put(str, rVar.f49017b);
                aVar.a(rVar.f49017b);
            }
        };
        GraphRequest f2 = f(str);
        f2.a((GraphRequest.b) r1);
        f2.a();
    }

    public static void a(Runnable runnable) {
        try {
            m.c().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, Exception exc) {
        if (m.f48919e && str != null) {
            exc.getClass().getSimpleName();
            exc.getMessage();
        }
    }

    public static Locale d() {
        Locale c2 = c();
        if (c2 != null) {
            return c2;
        }
        return Locale.getDefault();
    }

    private static boolean j() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    static {
        Covode.recordClassIndex(29266);
    }

    public static String a() {
        ae.a();
        Context context = m.f48921g;
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String b() {
        return new BigInteger(100, new Random()).toString(32);
    }

    private static void i() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f48518e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f48519f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    public static Locale c() {
        try {
            ae.a();
            return m.f48921g.getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject f() {
        if (com.facebook.internal.a.b.a.a(ad.class)) {
            return null;
        }
        try {
            ae.a();
            String string = d.a(m.f48921g, "com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ad.class);
            return null;
        }
    }

    private static int h() {
        int i2 = f48514a;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                /* class com.facebook.internal.ad.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29268);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f48514a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f48514a <= 0) {
            f48514a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f48514a;
    }

    private static void k() {
        try {
            if (j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f48517d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f48517d = a((double) f48517d);
        } catch (Exception unused) {
        }
    }

    private static void l() {
        try {
            if (j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f48516c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f48516c = a((double) f48516c);
        } catch (Exception unused) {
        }
    }

    public static boolean g() {
        if (com.facebook.internal.a.b.a.a(ad.class)) {
            return false;
        }
        try {
            JSONObject f2 = f();
            if (f2 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = f2.getJSONArray("data_processing_options");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (jSONArray.getString(i2).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ad.class);
            return false;
        }
    }

    public static boolean e() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            ae.a();
            intent.setData(Uri.parse(com.a.a("fb%s://applinks", new Object[]{m.f48915a})));
            ae.a();
            Context context = m.f48921g;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static long a(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static void d(String str) {
        if (m.f48919e) {
            a(str);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return b("SHA-256", str);
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static String c(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == f(context)) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    public static boolean d(Uri uri) {
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    public static String e(Context context) {
        try {
            ae.a();
            String str = m.f48916b;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static GraphRequest f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, s.GET, null);
    }

    private static void h(Context context) {
        if (f48520g.equals("NoCarrier")) {
            try {
                f48520g = ((TelephonyManager) b(context, "phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (Build.DEVICE == null || !Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }

    public static long e(Uri uri) {
        MethodCollector.i(250);
        Cursor cursor = null;
        try {
            ae.a();
            cursor = m.f48921g.getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j2 = cursor.getLong(columnIndex);
            cursor.close();
            MethodCollector.o(250);
            return j2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            MethodCollector.o(250);
            throw th;
        }
    }

    private static void g(Context context) {
        if (f48515b == -1 || System.currentTimeMillis() - f48515b >= 1800000) {
            f48515b = System.currentTimeMillis();
            i();
            h(context);
            l();
            k();
        }
    }

    public static Bundle c(String str) {
        Bundle bundle = new Bundle();
        if (!a(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    a("FacebookSDK", (Exception) e2);
                }
            }
        }
        return bundle;
    }

    public static Map<String, String> e(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static List<String> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static Set<String> c(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            hashSet.add(jSONArray.getString(i2));
        }
        return hashSet;
    }

    public static void b(Context context) {
        a(context, "facebook.com");
        a(context, ".facebook.com");
        a(context, "https://facebook.com");
        a(context, "https://.facebook.com");
    }

    public static boolean c(Uri uri) {
        if (uri == null || !"content".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    public static String a(Context context) {
        ae.a((Object) context, "context");
        m.a(context);
        ae.a();
        return m.f48915a;
    }

    public static boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    private static boolean b(File file) {
        MethodCollector.i(3799);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(3799);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3799);
        return delete;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.io.InputStream r7, java.io.OutputStream r8) {
        /*
            r6 = 3765(0xeb5, float:5.276E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r0 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r5.<init>(r7)     // Catch:{ all -> 0x002e }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0029 }
            r3 = 0
            r2 = 0
        L_0x0011:
            int r1 = r5.read(r4)     // Catch:{ all -> 0x0029 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r8.write(r4, r3, r1)     // Catch:{ all -> 0x0029 }
            int r2 = r2 + r1
            goto L_0x0011
        L_0x001d:
            r5.close()
            if (r7 == 0) goto L_0x0025
            r7.close()
        L_0x0025:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r2
        L_0x0029:
            r0 = move-exception
            r5.close()
            goto L_0x002f
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ad.a(java.io.InputStream, java.io.OutputStream):int");
    }

    public static String b(String str, String str2) {
        return a(str, str2.getBytes());
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(207);
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
                    MethodCollector.o(207);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f48523a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f48524b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f48525c;

        static {
            Covode.recordClassIndex(29271);
        }

        public c(List<String> list, List<String> list2, List<String> list3) {
            this.f48523a = list;
            this.f48524b = list2;
            this.f48525c = list3;
        }
    }

    public static Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object a2 = a(bundle, str3);
                if (a2 instanceof String) {
                    builder.appendQueryParameter(str3, (String) a2);
                }
            }
        }
        return builder.build();
    }

    public static Object a(Object obj, Method method, Object... objArr) {
        try {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_internal_Utility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_facebook_internal_Utility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt == null || (((opt instanceof String) && (opt = new JSONTokener((String) opt).nextValue()) == null) || (opt instanceof JSONObject) || (opt instanceof JSONArray))) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new j("Got an unexpected non-JSON object.");
    }
}

package com.ss.ttvideoengine.s;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import com.a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.JniUtils;
import com.ss.ttvideoengine.ap;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static String f153278a;

    /* renamed from: b  reason: collision with root package name */
    private static String f153279b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f153280c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.~#[]!\\()*%";

    /* renamed from: d  reason: collision with root package name */
    private static volatile long f153281d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f153282e;

    public static byte[] a(String str) {
        j.b("TTHelper", "base64DecodeToBytes ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (Throwable th) {
                j.e("TTHelper", "base64DecodeToBytes " + th.toString());
            }
        }
        return null;
    }

    public static final void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                b(file);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    b(file);
                    return;
                }
                for (File file2 : listFiles) {
                    a(file2);
                }
                b(file);
            }
        }
    }

    private static final String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        List<String> d2 = d(str, str2);
        if (d2 == null || d2.size() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : d2) {
            if (str4.startsWith(str2 + "=")) {
                sb.append(str2).append("=").append(str3);
            } else {
                sb.append(str4);
            }
        }
        return sb.toString();
    }

    public static Looper a() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return Looper.getMainLooper();
    }

    private static boolean b() {
        return "mounted".equals(c());
    }

    static {
        Covode.recordClassIndex(101785);
    }

    private static String c() {
        if (!TextUtils.isEmpty(f153282e) && System.currentTimeMillis() - f153281d < 5000) {
            return f153282e;
        }
        try {
            f153281d = System.currentTimeMillis();
            String externalStorageState = Environment.getExternalStorageState();
            f153282e = externalStorageState;
            return externalStorageState;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final long c(Context context) {
        if (context != null && b()) {
            return e(context);
        }
        return -1;
    }

    public static final String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static float b(Context context) {
        int i2;
        if (context == null) {
            return 0.0f;
        }
        int i3 = 0;
        try {
            AudioManager audioManager = (AudioManager) b(context, DataType.AUDIO);
            if (audioManager != null) {
                i2 = audioManager.getStreamVolume(3);
                if (i2 < 0) {
                    return (float) i3;
                }
            } else {
                i2 = 0;
            }
            i3 = i2;
        } catch (Exception unused) {
        }
        return (float) i3;
    }

    private static File d(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static long e(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return j(d(context).getParent());
    }

    private static long j(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static int a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new NumberFormatException("Can't format " + obj.getClass() + " to int");
    }

    public static final String b(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("_", "$").replace("/", "@").replace(".", "#");
    }

    public static final String d(String str) {
        if (TextUtils.isEmpty(str) || str.contains("http://127.0.0.1")) {
            return str;
        }
        return str.replaceAll("http:", "https:");
    }

    public static final String e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https")) {
            return str;
        }
        return str.replace("https", "http");
    }

    public static final String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        j.b("TTHelperEncode", "before encode:".concat(String.valueOf(str)));
        try {
            String queryComponentEncode = AVMDLDataLoader.queryComponentEncode(str);
            if (TextUtils.isEmpty(queryComponentEncode)) {
                j.b("TTHelperEncode", "call native encode fail,try java");
                queryComponentEncode = URLEncoder.encode(str, "UTF-8");
            }
            j.b("TTHelperEncode", "after encode:".concat(String.valueOf(queryComponentEncode)));
            return queryComponentEncode;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new c(jSONObject.optString("domain"), jSONObject.optInt("code"), jSONObject.optInt("innerCode"), jSONObject.optString("des"));
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final String c(File file) {
        MethodCollector.i(11423);
        if (!file.isFile()) {
            MethodCollector.o(11423);
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    String a2 = a(instance.digest());
                    MethodCollector.o(11423);
                    return a2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(11423);
            return null;
        }
    }

    public static final boolean f(String str) {
        if (str != null) {
            String str2 = "";
            if (!str.equals(str2)) {
                try {
                    str2 = new URL(str).getHost();
                } catch (Exception unused) {
                }
                if (Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
                    return true;
                }
                int indexOf = str.indexOf("[");
                int indexOf2 = str.indexOf("]");
                if (indexOf <= 0 || indexOf2 <= indexOf || str.substring(indexOf, indexOf2).indexOf(":") <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(f153279b)) {
            return str;
        }
        boolean contains = str.contains(f153279b);
        boolean f2 = f(str);
        if (str.startsWith("https")) {
            str = str.replace("https", "http");
        }
        if (f2 || str.indexOf("http") != 0 || contains) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(a.a(".%s", new Object[]{f153279b}));
            return str.replace(host, sb);
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String a(Context context) {
        String str = f153278a;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            String absolutePath = d(applicationContext).getAbsolutePath();
            f153278a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b(File file) {
        MethodCollector.i(11268);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11268);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11268);
        return delete;
    }

    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String a2 = a(context);
            if (!TextUtils.isEmpty(a2)) {
                str.replace(a2, "");
            }
        }
        return g(str);
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(11599);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(11599);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static List<String> d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("[?]");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        int indexOf = str4.indexOf(str2 + "=");
        if (indexOf == -1) {
            return null;
        }
        arrayList.add(str3);
        arrayList.add("?");
        arrayList.add(str4.substring(0, indexOf));
        int indexOf2 = str4.indexOf("&", indexOf);
        if (indexOf2 == -1) {
            arrayList.add(str4.substring(indexOf));
            return arrayList;
        }
        arrayList.add(str4.substring(indexOf, indexOf2));
        arrayList.add(str4.substring(indexOf2));
        return arrayList;
    }

    public static Class<?> a(int i2, String str) {
        if (i2 < 0 || TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        }
        ClassLoader a2 = ap.a(i2);
        if (a2 == null) {
            return Class.forName(str);
        }
        return Class.forName(str, true, a2);
    }

    public static final String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.indexOf(str2) != -1) {
            return str;
        }
        if (str.indexOf("?") == -1) {
            return str + "?" + str2;
        }
        return str + "&" + str2;
    }

    public static String c(String str, String str2) {
        List<String> d2 = d(str, str2);
        if (!(d2 == null || d2.size() == 0)) {
            for (String str3 : d2) {
                if (str3.startsWith(str2 + "=")) {
                    return str3.substring(str2.length() + 1);
                }
            }
        }
        return null;
    }

    public static String a(String str, long j2) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("T");
        }
        sb.append(Long.toString(j2));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        return sb.toString();
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str)) {
            return str;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (TextUtils.isEmpty(str2)) {
                return new String(decode, "utf-8");
            }
            return JniUtils.a(decode, Base64.decode(str2, 0));
        } catch (Throwable th) {
            j.b("TTHelper", th.toString());
            return "";
        }
    }
}

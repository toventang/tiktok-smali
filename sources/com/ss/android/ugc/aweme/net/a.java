package com.ss.android.ugc.aweme.net;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f112213a = b();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Integer> f112214b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Field> f112215c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static volatile String f112216d = null;

    private static int c() {
        try {
            if (Process.is64Bit()) {
                return 64;
            }
            return 32;
        } catch (Exception | NoSuchMethodError unused) {
            return 0;
        }
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    private static String b() {
        JSONObject d2 = d();
        String a2 = a(d2);
        if (a2 != null) {
            b.a("mira_infer_host_abi", d2, (JSONObject) null, (JSONObject) null);
            return a2;
        }
        String b2 = b(d2);
        b.a("mira_infer_host_abi", d2, (JSONObject) null, (JSONObject) null);
        return b2;
    }

    public static String a() {
        MethodCollector.i(5976);
        if (f112213a == null) {
            synchronized (a.class) {
                try {
                    if (f112213a == null) {
                        f112213a = b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5976);
                    throw th;
                }
            }
        }
        String str = f112213a;
        MethodCollector.o(5976);
        return str;
    }

    private static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("primaryCpuAbi", "0");
            jSONObject.put("processMode", "0");
            jSONObject.put("supportedABI0", "0");
            jSONObject.put("matchCpuAbi", "0");
            jSONObject.put("defaultABI0", "0");
            jSONObject.put("defaultABI", "0");
            jSONObject.put("autoError", "0");
            jSONObject.put("manualError", "0");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    static {
        Covode.recordClassIndex(72125);
        f112214b.put("armeabi", 32);
        f112214b.put("armeabi-v7a", 32);
        f112214b.put("arm64-v8a", 64);
        f112214b.put("x86", 32);
        f112214b.put("x86_64", 64);
        f112214b.put("mips", 32);
        f112214b.put("mips64", 64);
    }

    private static String a(JSONObject jSONObject) {
        Object obj;
        if (e()) {
            try {
                Object a2 = a(d.a().getApplicationInfo(), "target object must not be null");
                Field a3 = a(a2.getClass(), "primaryCpuAbi");
                boolean z = true;
                int i2 = 0;
                if (a3 != null) {
                    if (!a3.isAccessible()) {
                        a3.setAccessible(true);
                    }
                    obj = a3.get(a2);
                } else {
                    obj = null;
                }
                String str = (String) obj;
                a(jSONObject, "primaryCpuAbi", str);
                if (str != null) {
                    if (Build.VERSION.SDK_INT < 23) {
                        z = false;
                    }
                    if (z) {
                        i2 = c();
                    }
                    a(jSONObject, "processMode", String.valueOf(i2));
                    if (i2 == 0 || f112214b.get(str).intValue() == i2) {
                        return str;
                    }
                }
            } catch (Throwable unused) {
                a(jSONObject, "autoError", "1");
            }
        }
        return null;
    }

    private static String b(JSONObject jSONObject) {
        String str;
        MethodCollector.i(5996);
        try {
            str = d.a().getPackageManager().getPackageInfo(d.a().getPackageName(), 0).applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        try {
            ZipFile zipFile = new ZipFile(new File(str));
            HashSet hashSet = new HashSet(a(zipFile).keySet());
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            String[] strArr = e() ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
            if (hashSet.isEmpty()) {
                a(jSONObject, "supportedABI0", strArr[0]);
                String str2 = strArr[0];
                MethodCollector.o(5996);
                return str2;
            }
            for (String str3 : strArr) {
                if (hashSet.contains(str3)) {
                    a(jSONObject, "matchCpuAbi", str3);
                    MethodCollector.o(5996);
                    return str3;
                }
            }
            if (e()) {
                a(jSONObject, "defaultABI0", Build.SUPPORTED_ABIS[0]);
                String str4 = Build.SUPPORTED_ABIS[0];
                MethodCollector.o(5996);
                return str4;
            }
            a(jSONObject, "defaultABI", Build.CPU_ABI);
            String str5 = Build.CPU_ABI;
            MethodCollector.o(5996);
            return str5;
        } catch (Throwable unused3) {
            a(jSONObject, "manualError", "1");
        }
    }

    private static Map<String, List<ZipEntry>> a(ZipFile zipFile) {
        String[] split;
        HashMap hashMap = new HashMap();
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (!zipEntry.isDirectory() && compile.matcher(zipEntry.getName()).matches() && (split = zipEntry.getName().split(File.separator)) != null && split.length >= 2) {
                String str = split[split.length - 2];
                if (f112214b.containsKey(str)) {
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new LinkedList());
                    }
                    ((List) hashMap.get(str)).add(zipEntry);
                }
            }
        }
        zipFile.getName();
        return hashMap;
    }

    private static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    private static Field a(Class<?> cls, String str) {
        Field field;
        MethodCollector.i(6115);
        Class cls2 = (Class) a((Object) cls, "The class must not be null");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls2.toString()).append("#").append(str);
            String sb2 = sb.toString();
            synchronized (f112215c) {
                try {
                    field = f112215c.get(sb2);
                } finally {
                    MethodCollector.o(6115);
                }
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            while (cls2 != null) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    synchronized (f112215c) {
                        try {
                            f112215c.put(sb2, declaredField);
                        } finally {
                            MethodCollector.o(6115);
                        }
                    }
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            MethodCollector.o(6115);
            return null;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The field name must not be blank");
        MethodCollector.o(6115);
        throw illegalArgumentException;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}

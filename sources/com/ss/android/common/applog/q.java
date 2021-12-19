package com.ss.android.common.applog;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.b.a.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static a f59323a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.common.a f59324b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f59325c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static volatile b f59326d;

    /* renamed from: e  reason: collision with root package name */
    static g f59327e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f59328f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f59329g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile int f59330h;

    /* renamed from: i  reason: collision with root package name */
    private static Object f59331i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static volatile String f59332j = "app_log_encrypt_switch_count";

    public interface a {
        static {
            Covode.recordClassIndex(36634);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(36635);
        }

        HashMap<String, String> a();
    }

    public static void b(Map map, boolean z) {
        a(map, z);
    }

    static {
        Covode.recordClassIndex(36633);
    }

    public static boolean a(String str) {
        if (m.a(str) || str.equalsIgnoreCase("unknown") || str.equalsIgnoreCase("None")) {
            return true;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != '0') {
                return false;
            }
        }
        return true;
    }

    public static String a(String str, boolean z) {
        com.ss.android.common.a aVar = f59324b;
        if (m.a(str) || aVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        a(sb, z);
        return sb.toString();
    }

    public static void a(String str, String str2) {
        if (!m.a(str) && !m.a(str2)) {
            f59325c.put(str, str2);
        }
    }

    public static void a(StringBuilder sb, boolean z) {
        if (!(f59324b == null || sb == null)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            b(linkedHashMap, z);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb.append(l.a(arrayList, "UTF-8"));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01f7 */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5 A[Catch:{ Exception -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb A[Catch:{ all -> 0x023f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Map r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 607
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.q.a(java.util.Map, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4940);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(android.content.Context r9, byte[] r10) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.q.a(android.content.Context, byte[]):byte[]");
    }

    public static String a(String str, byte[] bArr, Context context, boolean z, String[] strArr) {
        if (m.a(str) || bArr == null || bArr.length <= 0) {
            return null;
        }
        byte[] a2 = a(context, bArr);
        if (a2 != null) {
            String str2 = str + "&tt_data=a";
            if (z) {
                str2 = str2 + "&config_retry=b";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
            if (strArr == null || strArr.length != 2) {
                return j.f26946a.a(str2, a2, hashMap);
            }
            return new String(c.a(c.a(j.f26946a.b(str2, a2, hashMap), strArr[0], strArr[1])));
        }
        throw new RuntimeException("encrypt failed");
    }
}

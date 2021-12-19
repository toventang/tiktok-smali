package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class bb {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f50681a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f50682b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f50683c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d  reason: collision with root package name */
    static final AtomicBoolean f50684d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private static final Uri f50685e = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f50686f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Boolean> f50687g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Integer> f50688h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Long> f50689i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, Float> f50690j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static Object f50691k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f50692l;

    /* renamed from: m  reason: collision with root package name */
    private static String[] f50693m = new String[0];

    static {
        Covode.recordClassIndex(31668);
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        MethodCollector.i(6898);
        Cursor query = contentResolver.query(f50685e, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            MethodCollector.o(6898);
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
                MethodCollector.o(6898);
            }
        }
        return treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r2 = r15.query(com.google.android.gms.internal.measurement.bb.f50681a, null, null, new java.lang.String[]{r16}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        if (r2 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6844);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r2.moveToFirst() != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        a(r6, r16, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r1 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        if (r1.equals(null) == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        a(r6, r16, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r2.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6844);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        r2.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6844);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bb.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    private static void a(Object obj, String str, String str2) {
        MethodCollector.i(6846);
        synchronized (bb.class) {
            try {
                if (obj == f50691k) {
                    f50686f.put(str, str2);
                }
            } finally {
                MethodCollector.o(6846);
            }
        }
    }
}

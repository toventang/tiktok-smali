package com.ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.b.d;
import com.ss.android.deviceregister.a.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.I18nLancet;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class o extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public int f59299a = 1;

    /* renamed from: b  reason: collision with root package name */
    public volatile JSONObject f59300b = null;

    /* renamed from: c  reason: collision with root package name */
    private final SimpleDateFormat f59301c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<l> f59302d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f59303e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONObject f59304f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f59305g;

    /* renamed from: h  reason: collision with root package name */
    private final List<AppLog.h> f59306h;

    /* renamed from: i  reason: collision with root package name */
    private long f59307i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f59308j = 0;

    /* renamed from: k  reason: collision with root package name */
    private p f59309k;

    /* renamed from: l  reason: collision with root package name */
    private volatile long f59310l;

    /* renamed from: m  reason: collision with root package name */
    private long f59311m = 0;
    private AtomicLong n = new AtomicLong();
    private volatile long o = 120000;
    private final ConcurrentHashMap<String, String> p;
    private final ConcurrentHashMap<String, String> q;
    private final e r;

    static {
        Covode.recordClassIndex(36631);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(JSONObject jSONObject) {
        MethodCollector.i(6935);
        try {
            String[] strArr = c.f59240a;
            for (String str : strArr) {
                this.f59304f.put(str, jSONObject.opt(str));
            }
            MethodCollector.o(6935);
        } catch (Exception unused) {
            MethodCollector.o(6935);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r1 == 200) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r7, long r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f59303e
            com.ss.android.common.applog.d r5 = com.ss.android.common.applog.d.a(r0)
            boolean r0 = b()
            if (r0 == 0) goto L_0x003c
            r4 = 0
            java.lang.String[] r0 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0039
            java.lang.String[] r0 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r0 = r0.length     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            r2 = 0
            r1 = 0
        L_0x001e:
            java.lang.String[] r0 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r0 = r0.length     // Catch:{ all -> 0x0039 }
            if (r2 >= r0) goto L_0x0032
            java.lang.String[] r0 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r1 = a(r6, r2, r0, r7)     // Catch:{ all -> 0x0039 }
            if (r1 == r3) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0032:
            r0 = -1
            if (r1 != r0) goto L_0x0036
            return
        L_0x0036:
            if (r1 != r3) goto L_0x0039
        L_0x0038:
            r4 = 1
        L_0x0039:
            r5.a(r8, r4, r7)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.a(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (0 == 0) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.ss.android.common.applog.i r18) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.a(com.ss.android.common.applog.i):boolean");
    }

    private void d() {
        d.a(this.f59303e).a();
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean c() {
        try {
            if (!m.a(this.f59304f.optString("device_id", ""))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e() {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r23.f59302d.isEmpty() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r7 = r23.f59302d.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r7 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        a(r7);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r0 = r23.n.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r0 >= 10000) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0 > 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r6 = r23.f59309k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r6 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r6.f59320i != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r2 = r6.f59312a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r4 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r0 <= 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r2 > 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        if (r7 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (e() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (com.ss.android.common.applog.AppLog.getLogRecoverySwitch() == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r9 <= 4) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        r23.f59307i = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        r3 = r23.f59302d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r1 = r23.f59302d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if ((r4 - r23.f59311m) <= r0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (b() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r23.f59311m = r4;
        a(r6, null, true, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r23.f59302d.isEmpty() == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r0 <= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9 = java.lang.System.currentTimeMillis();
        r4 = r23.f59311m;
        r9 = r9 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        if (r4 != 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r9 >= r0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r9 >= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        if (r0 == 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d2, code lost:
        r0 = r0 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        r23.f59302d.wait(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00da, code lost:
        r23.f59302d.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e9, code lost:
        r7 = r23.f59302d.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5905);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r23.f59305g.get() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0104, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5905);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0107, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.run():void");
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.n.set(j2);
    }

    private static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("header") != null) {
                return jSONObject.toString();
            }
            return str;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("terminate");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String optString = optJSONArray.getJSONObject(i2).optString("session_id", "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    private static List<Long> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("event_v3");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(Long.valueOf(optJSONArray.getJSONObject(i2).getLong("tea_event_index")));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("event");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList.add(Long.valueOf(optJSONArray2.getJSONObject(i3).getLong("tea_event_index")));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    private synchronized void a(l lVar) {
        d dVar;
        p b2;
        MethodCollector.i(6942);
        if (lVar == null) {
            MethodCollector.o(6942);
        } else if (lVar instanceof n) {
            n nVar = (n) lVar;
            a(nVar.f59295a, nVar.f59296b, nVar.f59297c, nVar.f59298d);
            a(nVar.f59296b);
            this.f59311m = System.currentTimeMillis();
            MethodCollector.o(6942);
        } else if (lVar instanceof k) {
            long j2 = ((k) lVar).f59293a;
            if (j2 <= 0 || (b2 = d.a(this.f59303e).b(j2)) == null) {
                MethodCollector.o(6942);
                return;
            }
            a(b2, (p) null, false, 0L);
            k kVar = new k();
            kVar.f59293a = b2.f59312a;
            synchronized (this.f59302d) {
                try {
                    this.f59302d.add(kVar);
                } finally {
                    MethodCollector.o(6942);
                }
            }
        } else {
            if ((lVar instanceof m) && (dVar = ((m) lVar).f59294a) != null) {
                JSONObject jSONObject = new JSONObject();
                com.ss.android.deviceregister.a.d.a(this.f59304f, jSONObject);
                Pair<Long, String> a2 = r.a(this.f59303e).a(dVar, jSONObject);
                if (a2 != null) {
                    long longValue = ((Long) a2.first).longValue();
                    String str = (String) a2.second;
                    if (longValue > 0) {
                        a(str, longValue);
                    }
                }
            }
            MethodCollector.o(6942);
        }
    }

    private void a(p pVar) {
        this.f59309k = pVar;
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(this.f59303e, a.f59402a, 0);
        this.f59310l = a2.getLong("latest_forground_session_time", 0);
        if (pVar != null && !pVar.f59320i) {
            this.f59310l = pVar.f59314c;
            a2.edit().putLong("latest_forground_session_time", this.f59310l).apply();
        }
    }

    private void a(p pVar, p pVar2, boolean z, long j2) {
        a(pVar, pVar2, z, j2, true);
    }

    private static int a(o oVar, int i2, String[] strArr, String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        try {
            String language = com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, com.bytedance.ies.ugc.appcontext.d.a()).getLanguage();
            if ("zh".equals(language)) {
                language = "zh-Hant";
            }
            I18nLancet.a(jSONObject2, "app_language", language);
            I18nLancet.a(jSONObject2, "region", SettingServiceImpl.v().n());
            I18nLancet.a(jSONObject2, "sys_region", SettingServiceImpl.v().l());
            I18nLancet.a(jSONObject2, "carrier_region", com.ss.android.ugc.aweme.language.d.h());
            I18nLancet.a(jSONObject2, "timezone_name", TimeZone.getDefault().getDisplayName());
            I18nLancet.a(jSONObject2, "timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        jSONObject.put("header", jSONObject2);
        return oVar.a(i2, strArr, jSONObject.toString(), true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:9|(4:15|16|(8:22|(1:30)(3:26|27|(1:29))|31|32|(2:34|(5:36|37|(3:41|(3:43|(2:45|80)(1:81)|46)|79)|47|(3:51|(3:53|(2:55|83)(1:84)|56)|82))(4:57|(1:59)|60|(1:62)))|63|(1:68)|(1:70))|71)|17|20|22|(1:24)|30|31|32|(0)|63|66|68|(1:71)(0)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0132 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(int r12, java.lang.String[] r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.a(int, java.lang.String[], java.lang.String, boolean):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        if (r6 == 200) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00da, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00db, code lost:
        if (r26 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (c() == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        r26.f59321j = true;
        r14.c(r26.f59312a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.common.applog.p r25, com.ss.android.common.applog.p r26, boolean r27, long r28, boolean r30) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.o.a(com.ss.android.common.applog.p, com.ss.android.common.applog.p, boolean, long, boolean):void");
    }

    o(Context context, JSONObject jSONObject, LinkedList<l> linkedList, AtomicBoolean atomicBoolean, List<AppLog.h> list, p pVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        super("LogReaper");
        this.f59303e = context;
        this.f59304f = jSONObject;
        this.f59302d = linkedList;
        this.f59305g = atomicBoolean;
        this.f59306h = list;
        a(pVar);
        this.p = concurrentHashMap;
        this.q = concurrentHashMap2;
        this.r = new e(context);
        for (String str : AppLog.APPLOG_URL()) {
            this.r.f59254b.a(str);
        }
    }
}

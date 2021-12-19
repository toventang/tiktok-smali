package com.bytedance.crash.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.c;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.runtime.b.a;
import com.bytedance.crash.runtime.g;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.v;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static int f27676a;

    static {
        Covode.recordClassIndex(16233);
    }

    public static String a(StackTraceElement[] stackTraceElementArr, int i2) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i2 < stackTraceElementArr.length) {
            ab.a(stackTraceElementArr[i2], sb);
            i2++;
        }
        return sb.toString();
    }

    public static void a(Map<String, String> map, d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                dVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, String str, boolean z) {
        a(th, str, z, "core_exception_monitor");
    }

    private static void a(Throwable th, String str, boolean z, String str2) {
        a(th, str, z, null, str2);
    }

    public static void a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            a((Object) null, th, (StackTraceElement[]) null, 0, str, z, map, Thread.currentThread(), "EnsureNotReachHere", str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr, int i2, String str, boolean z, Map<String, String> map, Thread thread, String str2, String str3) {
        a(obj, th, stackTraceElementArr, i2, str, z, map, thread.getName(), str2, str3);
    }

    private static void a(final Object obj, final Throwable th, final StackTraceElement[] stackTraceElementArr, final int i2, final String str, final boolean z, final Map<String, String> map, final String str2, final String str3, String str4) {
        final String str5 = str4;
        if (TextUtils.isEmpty(str5)) {
            str5 = "core_exception_monitor";
        }
        if (n.f27737a || f27676a < 100) {
            f27676a++;
            if (a.a(c.c(obj)) && !b.a(obj, str5)) {
                v.a("exception has been discard due to not sampled: ".concat(String.valueOf(str5)));
            } else if (!n.f27737a || g.a().d()) {
                com.bytedance.crash.runtime.n.b().a(new Runnable() {
                    /* class com.bytedance.crash.j.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ String f27677a = null;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f27678b = null;

                    static {
                        Covode.recordClassIndex(16234);
                    }

                    public final void run() {
                        d dVar;
                        String a2;
                        StackTraceElement[] stackTraceElementArr;
                        if (!n.f27737a) {
                            com.bytedance.crash.runtime.n.b().a(this, 500);
                            return;
                        }
                        try {
                            String str = this.f27677a;
                            if (str != null) {
                                String str2 = this.f27678b;
                                d a3 = d.a(new StackTraceElement("Native", "Native", "Native.java", -1), str, str, str2, true, "EnsureNotReachHere", str5);
                                a3.a("event_type", (Object) "native_exception");
                                a3.a("java_data", (Object) str2);
                                JSONArray jSONArray = new JSONArray();
                                HashSet hashSet = new HashSet();
                                for (String str3 : str.split("\n")) {
                                    String a4 = com.bytedance.crash.nativecrash.h.a(str3);
                                    if (a4 != null) {
                                        NativeTools.a();
                                        String str4 = NativeTools.f27972b.get(a4);
                                        if (TextUtils.isEmpty(str4)) {
                                            NativeTools.a();
                                            str4 = NativeTools.f(NativeTools.g(a4));
                                            NativeTools.f27972b.put(a4, str4);
                                        }
                                        if (!TextUtils.isEmpty(str4) && !hashSet.contains(a4)) {
                                            hashSet.add(a4);
                                            JSONObject jSONObject = new JSONObject();
                                            com.bytedance.crash.util.n.a(jSONObject, "lib_name", a4);
                                            com.bytedance.crash.util.n.a(jSONObject, "lib_uuid", str4);
                                            jSONArray.put(jSONObject);
                                        }
                                    }
                                }
                                a3.a("crash_lib_uuid", (Object) jSONArray);
                                dVar = a3;
                            } else {
                                Throwable th = th;
                                if (th != null || ((stackTraceElementArr = stackTraceElementArr) != null && stackTraceElementArr.length > i2 + 1)) {
                                    StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
                                    if (stackTraceElementArr2 == null) {
                                        stackTraceElementArr2 = th.getStackTrace();
                                    }
                                    int i2 = i2;
                                    StackTraceElement stackTraceElement = stackTraceElementArr2[i2];
                                    if (stackTraceElement != null) {
                                        Throwable th2 = th;
                                        if (th2 != null) {
                                            a2 = ab.a(th2);
                                        } else {
                                            a2 = h.a(stackTraceElementArr2, i2);
                                        }
                                        if (!TextUtils.isEmpty(a2)) {
                                            d a5 = d.a(stackTraceElement, a2, str, str2, z, str3, str5);
                                            dVar = a5;
                                            if (obj != null) {
                                                a5.a("exception_line_num", (Object) null);
                                                dVar = a5;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            h.a(map, dVar);
                            e.a().a(CrashType.ENSURE, dVar);
                            i.a(obj, dVar);
                            v.b("[reportException] " + str);
                        } catch (Throwable unused) {
                            m.f27730g.isDebugMode();
                        }
                    }
                });
            } else {
                m.f27730g.isDebugMode();
            }
        } else {
            v.a("exception has been discard due to exceed limit before Npth.init: ".concat(String.valueOf(str5)));
        }
    }
}

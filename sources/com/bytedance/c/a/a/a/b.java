package com.bytedance.c.a.a.a;

import android.text.TextUtils;
import com.bytedance.apm.q.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.a;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(15737);
    }

    public static void a(String str) {
        if (a.f44093a != null) {
            a.a(str);
        } else {
            b(str);
        }
    }

    private static void b(String str) {
        a(Thread.currentThread().getStackTrace(), str);
    }

    public static void a(Throwable th) {
        if (a.f44093a != null) {
            a.a(th);
        } else {
            b(th);
        }
    }

    private static void b(Throwable th) {
        if (c(th)) {
            a(Thread.currentThread().getStackTrace(), th, null, true, null);
        }
    }

    private static boolean c(Throwable th) {
        c.a();
        if (!c.b() || !d.a(th)) {
            return true;
        }
        return false;
    }

    public static void a(Throwable th, String str) {
        if (a.f44093a != null) {
            a.a(th, str);
        } else {
            b(th, str);
        }
    }

    private static void b(Throwable th, String str) {
        if (c(th)) {
            a(Thread.currentThread().getStackTrace(), th, str, true, null);
        }
    }

    private static void a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(StackTraceElement[] stackTraceElementArr, String str) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 4) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[3];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        String a2 = r.a(stackTraceElementArr);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put("method", methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", a2);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, 1024));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        a((Map<String, String>) null, jSONObject);
                        c.a().a("core_exception_monitor", jSONObject.toString(), str, true);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Throwable th, String str, Map<String, String> map) {
        if (a.f44093a != null) {
            if (a.f44093a != null) {
                a.f44093a.ensureNotReachHere(th, str, map);
            }
        } else if (c(th)) {
            a(Thread.currentThread().getStackTrace(), th, str, false, map);
        }
    }

    private static void a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[3];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String a2 = r.a(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", a2);
                jSONObject.put("exception_type", 0);
                if (z) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, 1024));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                a(map, jSONObject);
                c.a().a("core_exception_monitor", jSONObject.toString(), str, true);
            } catch (Throwable unused) {
            }
        }
    }
}

package com.bytedance.crash.b;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.apm.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.f;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27499a;

    /* renamed from: b  reason: collision with root package name */
    static int f27500b;

    /* renamed from: c  reason: collision with root package name */
    static List<f> f27501c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile long f27502d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f27503e = 100;

    /* renamed from: f  reason: collision with root package name */
    public static long f27504f;

    /* renamed from: g  reason: collision with root package name */
    public static long f27505g;

    /* renamed from: h  reason: collision with root package name */
    public static long f27506h;

    /* renamed from: i  reason: collision with root package name */
    public static int f27507i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f27508j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile String f27509k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile boolean f27510l;

    /* renamed from: m  reason: collision with root package name */
    public static int f27511m = -1;
    public static volatile long n;
    public static long o = -1;
    public static long p = -1;
    private static int q = -1;
    private static MessageQueue r;
    private static Field s;
    private static Field t;

    static {
        Covode.recordClassIndex(16159);
    }

    public static long d() {
        if (f27511m < 0) {
            return 0;
        }
        try {
            return NativeTools.a().c(f27511m);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<f> f2 = f();
            if (f2 == null) {
                return jSONArray;
            }
            for (f fVar : f2) {
                if (fVar != null) {
                    jSONArray.put(fVar.a());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
    }

    public static JSONObject e() {
        f g2 = g();
        JSONObject a2 = g2.a();
        try {
            a2.put("message", g2.f27573g);
            a2.put("currentMessageCost", g2.f27570d);
            a2.put("currentMessageCpu", g2.f27571e);
            a2.put("currentTick", f27502d);
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
        return a2;
    }

    private static f g() {
        if (g.f24990a != null) {
            try {
                return g.f24990a.b();
            } catch (Throwable unused) {
            }
        }
        f fVar = new f();
        fVar.f27573g = f27509k;
        long j2 = f27502d - p;
        if (j2 <= 0) {
            j2 = 1;
        }
        fVar.f27570d = j2 * f27503e;
        fVar.f27571e = n - f27505g;
        return fVar;
    }

    public static MessageQueue c() {
        if (r == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                r = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                r = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    r = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return r;
    }

    private static List<f> f() {
        if (g.f24990a != null) {
            try {
                return g.f24990a.a();
            } catch (Throwable unused) {
            }
        }
        if (f27501c == null) {
            return null;
        }
        f27510l = true;
        ArrayList arrayList = new ArrayList();
        if (f27501c.size() == f27500b) {
            for (int i2 = q; i2 < f27501c.size(); i2++) {
                arrayList.add(f27501c.get(i2));
            }
            for (int i3 = 0; i3 < q; i3++) {
                arrayList.add(f27501c.get(i3));
            }
        } else {
            arrayList.addAll(f27501c);
        }
        f27510l = false;
        return arrayList;
    }

    public static f a() {
        int size = f27501c.size();
        int i2 = f27500b;
        if (size == i2) {
            int i3 = (q + 1) % i2;
            q = i3;
            return f27501c.get(i3);
        }
        f fVar = new f();
        f27501c.add(fVar);
        q++;
        return fVar;
    }

    private static Message a(Message message) {
        Field field = t;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                t = declaredField;
                declaredField.setAccessible(true);
                return (Message) t.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    static Message a(MessageQueue messageQueue) {
        Field field = s;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                s = declaredField;
                declaredField.setAccessible(true);
                return (Message) s.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static JSONArray a(long j2) {
        MethodCollector.i(10286);
        MessageQueue c2 = c();
        JSONArray jSONArray = new JSONArray();
        if (c2 == null) {
            MethodCollector.o(10286);
            return jSONArray;
        }
        try {
            synchronized (c2) {
                try {
                    Message a2 = a(c2);
                    if (a2 == null) {
                        return jSONArray;
                    }
                    int i2 = 0;
                    int i3 = 0;
                    while (a2 != null && i2 < 300) {
                        i2++;
                        i3++;
                        JSONObject a3 = a(a2, j2);
                        try {
                            a3.put("id", i3);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(a3);
                        if (a2.getWhen() - j2 > 0 && i2 > 100) {
                            break;
                        }
                        a2 = a(a2);
                    }
                    MethodCollector.o(10286);
                    return jSONArray;
                } finally {
                    MethodCollector.o(10286);
                }
            }
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            MethodCollector.o(10286);
            return jSONArray;
        }
    }

    private static JSONObject a(Message message, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j2);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(f fVar, long j2, long j3, long j4, int i2, int i3, String str) {
        fVar.f27571e = j2;
        fVar.f27569c = j4;
        fVar.f27570d = j3;
        fVar.f27572f = false;
        fVar.f27567a = i3;
        if (str != null) {
            fVar.f27573g = str;
        }
        fVar.f27568b = i2;
    }
}

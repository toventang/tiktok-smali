package ms.bd.o;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class o1 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static volatile o1 f159532a = null;

    /* renamed from: b  reason: collision with root package name */
    private SensorManager f159533b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f159534c;

    /* renamed from: d  reason: collision with root package name */
    private int f159535d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float[] f159536e = new float[3];

    /* renamed from: f  reason: collision with root package name */
    private List<JSONArray> f159537f = new ArrayList();

    static {
        MethodCollector.i(8812);
        Covode.recordClassIndex(105939);
        new DecimalFormat((String) h.a(16777217, 0, 0, "489194", new byte[]{117, 116, 26}));
        MethodCollector.o(8812);
    }

    public static o1 a(Context context) {
        MethodCollector.i(8115);
        if (f159532a == null) {
            synchronized (o1.class) {
                try {
                    if (f159532a == null) {
                        f159532a = new o1(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8115);
                    throw th;
                }
            }
        }
        o1 o1Var = f159532a;
        MethodCollector.o(8115);
        return o1Var;
    }

    private synchronized void c() {
        MethodCollector.i(8119);
        try {
            SensorManager sensorManager = this.f159533b;
            if (sensorManager != null) {
                if (this.f159534c == 0) {
                    if (!this.f159533b.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                        MethodCollector.o(8119);
                        return;
                    }
                }
                this.f159534c++;
                MethodCollector.o(8119);
                return;
            }
        } catch (Exception unused) {
        }
        MethodCollector.o(8119);
    }

    private synchronized void d() {
        MethodCollector.i(8183);
        try {
            SensorManager sensorManager = this.f159533b;
            if (sensorManager != null) {
                int i2 = this.f159534c - 1;
                this.f159534c = i2;
                if (i2 == 0) {
                    sensorManager.unregisterListener(this);
                    MethodCollector.o(8183);
                    return;
                }
            }
        } catch (Exception unused) {
            h.a(16777217, 0, 0, "3b5c90", new byte[]{49, 115, 69, 40, 19});
        }
        MethodCollector.o(8183);
    }

    public final synchronized void a() {
        MethodCollector.i(8806);
        JSONArray e2 = e();
        if (e2 == null) {
            MethodCollector.o(8806);
            return;
        }
        this.f159537f.add(e2);
        try {
            int size = this.f159537f.size();
            if (size > 100) {
                ArrayList arrayList = new ArrayList(this.f159537f.subList(size - 50, size));
                this.f159537f.clear();
                this.f159537f = arrayList;
                MethodCollector.o(8806);
                return;
            }
        } catch (Throwable unused) {
        }
        MethodCollector.o(8806);
    }

    public final synchronized String b() {
        MethodCollector.i(8810);
        StringBuilder sb = new StringBuilder();
        int size = this.f159537f.size();
        if (size <= 0) {
            MethodCollector.o(8810);
            return null;
        }
        try {
            List<JSONArray> list = this.f159537f;
            int i2 = size - 50;
            if (i2 <= 0) {
                i2 = 0;
            }
            List<JSONArray> subList = list.subList(i2, size);
            if (subList.size() > 0) {
                for (JSONArray jSONArray : subList) {
                    if (jSONArray != null) {
                        sb.append(jSONArray.get(0).toString());
                        sb.append((String) h.a(16777217, 0, 0, "7c2f6e", new byte[]{106}));
                        sb.append(jSONArray.get(1).toString());
                        sb.append((String) h.a(16777217, 0, 0, "74c262", new byte[]{106}));
                        sb.append(jSONArray.get(2).toString());
                        sb.append((String) h.a(16777217, 0, 0, "f31e93", new byte[]{107}));
                    }
                }
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
        } catch (Throwable unused) {
        }
        String sb2 = sb.toString();
        MethodCollector.o(8810);
        return sb2;
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f159536e = sensorEvent.values;
        this.f159535d = 1;
    }

    private JSONArray e() {
        char c2;
        BigDecimal bigDecimal;
        JSONArray jSONArray;
        MethodCollector.i(8800);
        try {
            if (c0.a() != null) {
                c2 = 1;
            } else {
                c2 = 0;
            }
        } catch (Throwable unused) {
            c2 = 65535;
        }
        if (c2 != 1) {
            MethodCollector.o(8800);
            return null;
        }
        c();
        try {
            synchronized (this) {
                int i2 = 0;
                while (this.f159535d == 0 && i2 < 10) {
                    try {
                        i2++;
                        wait(1000);
                    } catch (Throwable th) {
                        MethodCollector.o(8800);
                        throw th;
                    }
                }
            }
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal((double) this.f159536e[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal((double) this.f159536e[1]).setScale(2, 4));
            bigDecimal = new BigDecimal((double) this.f159536e[2]);
        } catch (Exception unused2) {
            h.a(16777217, 0, 0, "17a5e1", new byte[]{51, 38, 17, 126, 93});
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal((double) this.f159536e[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal((double) this.f159536e[1]).setScale(2, 4));
            bigDecimal = new BigDecimal((double) this.f159536e[2]);
        } catch (Throwable th2) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(new BigDecimal((double) this.f159536e[0]).setScale(2, 4));
            jSONArray2.put(new BigDecimal((double) this.f159536e[1]).setScale(2, 4));
            jSONArray2.put(new BigDecimal((double) this.f159536e[2]).setScale(2, 4));
            d();
            this.f159535d = 0;
            MethodCollector.o(8800);
            throw th2;
        }
        jSONArray.put(bigDecimal.setScale(2, 4));
        d();
        this.f159535d = 0;
        MethodCollector.o(8800);
        return jSONArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        if (r1 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o1(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            r2 = 7946(0x1f0a, float:1.1135E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            r0 = 0
            r9.f159533b = r0
            r0 = 0
            r9.f159535d = r0
            r0 = 3
            float[] r0 = new float[r0]
            r9.f159536e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f159537f = r0
            android.content.Context r1 = r10.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x0044
        L_0x0022:
            if (r1 == 0) goto L_0x0040
        L_0x0024:
            r0 = 6
            byte[] r8 = new byte[r0]
            r8 = {x004a: FILL_ARRAY_DATA  , data: [103, 50, 24, 3, 84, 97} // fill-array
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "e5eddd"
            java.lang.Object r0 = ms.bd.o.h.a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = a(r1, r0)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r9.f159533b = r0
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            goto L_0x0024
        L_0x0047:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x0022
            fill-array 0x004a: FILL_ARRAY_DATA  , data: [103, 50, 24, 3, 84, 97]
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.o1.<init>(android.content.Context):void");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8004);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8004);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}

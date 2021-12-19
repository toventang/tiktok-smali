package com.bytedance.apm.battery.d;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.apm.battery.a;
import com.bytedance.apm.battery.c.a;
import com.bytedance.apm.battery.c.b;
import com.bytedance.apm.battery.d.a.a;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends c<a> implements com.bytedance.apm.battery.b.d {

    /* renamed from: e  reason: collision with root package name */
    private int[] f24532e;

    /* renamed from: f  reason: collision with root package name */
    private int f24533f;

    /* renamed from: g  reason: collision with root package name */
    private List<Long> f24534g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private int f24535h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f24536i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final List<Long> f24537j = new ArrayList();

    static {
        Covode.recordClassIndex(14448);
    }

    @Override // com.bytedance.apm.battery.b.d
    public final String a() {
        return "android.app.IAlarmManager";
    }

    public d() {
        super("alarm");
    }

    @Override // com.bytedance.apm.battery.d.g, com.bytedance.apm.battery.d.c
    public final void b() {
        super.b();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f24536i) {
            this.f24534g.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.battery.d.g, com.bytedance.apm.battery.d.c
    public final void c() {
        super.c();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f24536i) {
            this.f24534g.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.battery.d.g
    public final void a(b bVar, com.bytedance.apm.e.a aVar) {
        if (this.f24528a.equals(aVar.f24907d)) {
            if (!aVar.f24905b) {
                bVar.f24496k += aVar.f24910g;
                return;
            }
            bVar.f24491f += aVar.f24910g;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.c
    public final void a(long j2, long j3) {
        int i2 = 0;
        this.f24533f = 0;
        this.f24532e = new int[2];
        this.f24537j.add(Long.valueOf(j2));
        synchronized (this.f24536i) {
            this.f24537j.addAll(this.f24534g);
            this.f24534g.clear();
        }
        this.f24537j.add(Long.valueOf(j3));
        this.f24535h = 1;
        while (this.f24535h < this.f24537j.size()) {
            super.a(this.f24537j.get(this.f24535h - 1).longValue(), this.f24537j.get(this.f24535h).longValue());
            this.f24535h++;
        }
        int[] iArr = this.f24532e;
        if (iArr[0] + iArr[1] != 0) {
            int size = this.f24537j.size();
            long currentTimeMillis = System.currentTimeMillis();
            if ((!this.f24530c || size % 2 != 0) && (this.f24530c || size % 2 != 1)) {
                a.C0525a.f24485a.a(new com.bytedance.apm.e.a(true, currentTimeMillis, this.f24528a, (long) iArr[0]));
                a.C0525a.f24485a.a(new com.bytedance.apm.e.a(false, currentTimeMillis, this.f24528a, (long) iArr[1]));
            } else {
                a.C0525a.f24485a.a(new com.bytedance.apm.e.a(false, currentTimeMillis, this.f24528a, (long) iArr[0]));
                a.C0525a.f24485a.a(new com.bytedance.apm.e.a(true, currentTimeMillis, this.f24528a, (long) iArr[1]));
            }
        }
        this.f24537j.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        int[] iArr2 = this.f24532e;
        double d2 = (double) iArr2[0];
        double d3 = (double) iArr2[1];
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 + d3;
        double d5 = (double) (currentTimeMillis2 - this.f24529b);
        Double.isNaN(d5);
        double d6 = (d4 / d5) * 60000.0d * 10.0d;
        double d7 = (double) this.f24533f;
        double d8 = (double) (currentTimeMillis2 - this.f24529b);
        Double.isNaN(d7);
        Double.isNaN(d8);
        double d9 = (d7 / d8) * 60000.0d * 10.0d;
        if (d6 >= ((double) com.bytedance.apm.battery.a.a.f24439d)) {
            i2 = 49;
        }
        if (d9 >= ((double) com.bytedance.apm.battery.a.a.f24440e)) {
            i2 |= 50;
        }
        if (i2 != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i2).put("wake_up_count", d6).put("normal_count", d9);
                if (this.f24531d != null && this.f24531d.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (com.bytedance.apm.battery.d.a.a aVar : this.f24531d.values()) {
                        jSONArray.put(aVar.a());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                com.bytedance.apm.k.b.a(jSONObject, "battery_trace");
                com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.apm.battery.b.d
    public final void a(Method method, Object[] objArr) {
        long j2;
        String str;
        long j3;
        try {
            String name = method.getName();
            int i2 = -1;
            if ("set".equals(name)) {
                com.bytedance.apm.battery.d.a.a aVar = new com.bytedance.apm.battery.d.a.a();
                boolean z = false;
                int i3 = 0;
                int i4 = -1;
                for (Object obj : objArr) {
                    if ((obj instanceof Integer) && !z) {
                        aVar.f24514a = ((Integer) obj).intValue();
                        z = true;
                    } else if (obj instanceof Long) {
                        if (i3 == 0) {
                            aVar.f24517d = ((Long) obj).longValue();
                            if (aVar.f24514a == 1 || aVar.f24514a == 0) {
                                j3 = aVar.f24517d;
                            } else {
                                j3 = (aVar.f24517d + System.currentTimeMillis()) - SystemClock.elapsedRealtime();
                            }
                            aVar.f24517d = j3;
                        } else if (i3 == 2) {
                            aVar.f24515b = ((Long) obj).longValue();
                        }
                        i3++;
                    } else if (obj instanceof PendingIntent) {
                        PendingIntent pendingIntent = (PendingIntent) obj;
                        if (Build.VERSION.SDK_INT > 23 || pendingIntent == null) {
                            str = "";
                        } else {
                            str = ((Intent) Reflect.on(pendingIntent).call("getIntent").get()).toString();
                        }
                        aVar.f24516c = str;
                        i4 = pendingIntent.hashCode();
                    }
                }
                if (i4 != -1) {
                    if (aVar.f24515b == 0) {
                        j2 = aVar.f24517d;
                    } else {
                        j2 = -1;
                    }
                    aVar.f24518e = j2;
                    if (a.C0523a.f24435a.f24431b) {
                        aVar.f24519f = Thread.currentThread().getName();
                        aVar.f24520g = Thread.currentThread().getStackTrace();
                    }
                    this.f24531d.put(Integer.valueOf(i4), aVar);
                }
            } else if ("remove".equals(name)) {
                if (objArr[0] != null && (objArr[0] instanceof PendingIntent)) {
                    i2 = objArr[0].hashCode();
                }
                com.bytedance.apm.battery.d.a.a aVar2 = (com.bytedance.apm.battery.d.a.a) this.f24531d.get(Integer.valueOf(i2));
                if (aVar2 != null && aVar2.f24515b > 0) {
                    aVar2.f24518e = System.currentTimeMillis();
                    this.f24531d.put(Integer.valueOf(i2), aVar2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.battery.d.a.b, long, long] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.c
    public final /* bridge */ /* synthetic */ void a(com.bytedance.apm.battery.d.a.a aVar, long j2, long j3) {
        int i2;
        com.bytedance.apm.battery.d.a.a aVar2 = aVar;
        if (aVar2.f24515b > 0) {
            long j4 = aVar2.f24517d;
            if (j4 < j2) {
                j4 = (aVar2.f24515b + j2) - ((j2 - aVar2.f24517d) % aVar2.f24515b);
            }
            long j5 = aVar2.f24518e;
            if (j5 <= j3 && aVar2.f24518e > 0) {
                j3 = j5;
            }
            long j6 = j3 - j4;
            if (j6 > 0) {
                i2 = ((int) (j6 / aVar2.f24515b)) + 1;
            } else {
                return;
            }
        } else if (j2 <= aVar2.f24517d && aVar2.f24517d <= j3) {
            i2 = 1;
        } else {
            return;
        }
        if (aVar2.f24514a == 2 || aVar2.f24514a == 0) {
            int[] iArr = this.f24532e;
            int i3 = this.f24535h % 2;
            iArr[i3] = iArr[i3] + i2;
            return;
        }
        this.f24533f += i2;
    }
}

package com.bytedance.apm.battery;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.apm.battery.b.b;
import com.bytedance.apm.battery.c.a;
import com.bytedance.apm.battery.d.d;
import com.bytedance.apm.battery.d.e;
import com.bytedance.apm.battery.d.f;
import com.bytedance.apm.battery.d.g;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.slardar.config.IConfigManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class a extends com.bytedance.apm.k.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, g> f24430a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24431b;

    /* renamed from: c  reason: collision with root package name */
    private long f24432c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24433d;

    /* renamed from: e  reason: collision with root package name */
    private long f24434e;

    static {
        Covode.recordClassIndex(14419);
    }

    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.apm.k.a
    public final long c() {
        return this.f24434e * 60000;
    }

    /* renamed from: com.bytedance.apm.battery.a$a  reason: collision with other inner class name */
    public static final class C0523a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24435a = new a((byte) 0);

        static {
            Covode.recordClassIndex(14420);
        }
    }

    @Override // com.bytedance.apm.k.a, com.bytedance.services.slardar.config.a
    public final void d() {
        super.d();
        a.C0525a.f24485a.a();
    }

    private a() {
        this.f24430a = new ConcurrentHashMap();
        this.f24432c = -1;
        this.p = "battery";
    }

    private void f() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24432c != -1) {
            a.C0525a.f24485a.f24478b = ActivityLifeObserver.getInstance().getTopActivityClassName();
            a.C0525a.f24485a.a(new com.bytedance.apm.e.a(this.f24433d, currentTimeMillis, "ground_record", currentTimeMillis - this.f24432c));
        }
        this.f24432c = currentTimeMillis;
    }

    @Override // com.bytedance.apm.k.a
    public final void e() {
        if (c.e()) {
            String[] strArr = new String[1];
            String str = "onTimer record, current is background? : " + ActivityLifeObserver.getInstance().isForeground();
        }
        f();
        for (g gVar : this.f24430a.values()) {
            gVar.m_();
        }
    }

    @Override // com.bytedance.apm.k.a
    public final void a() {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 29) {
            this.f24433d = ActivityLifeObserver.getInstance().isForeground();
            this.f24432c = System.currentTimeMillis();
            d dVar = new d();
            f fVar = new f();
            try {
                b bVar = new b();
                bVar.a("alarm", dVar);
                bVar.a("power", fVar);
                if (bVar.f24468a.size() != 0) {
                    Class<?> cls = Class.forName("android.os.ServiceManager");
                    char c2 = 0;
                    Method declaredMethod = cls.getDeclaredMethod("getService", String.class);
                    Field declaredField = cls.getDeclaredField("sCache");
                    declaredField.setAccessible(true);
                    Object obj = null;
                    Map map = (Map) declaredField.get(null);
                    for (Map.Entry<String, com.bytedance.apm.battery.b.d> entry : bVar.f24468a.entrySet()) {
                        String key = entry.getKey();
                        Object[] objArr = new Object[1];
                        objArr[c2] = key;
                        IBinder iBinder = (IBinder) declaredMethod.invoke(obj, objArr);
                        ClassLoader classLoader = cls.getClassLoader();
                        Class[] clsArr = new Class[1];
                        clsArr[c2] = IBinder.class;
                        com.bytedance.apm.battery.b.c cVar = new com.bytedance.apm.battery.b.c(iBinder, entry.getValue());
                        IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(classLoader, clsArr, cVar);
                        cVar.f24471b = iBinder2;
                        map.put(key, iBinder2);
                        obj = null;
                        c2 = 0;
                    }
                }
                e eVar = new e();
                this.f24430a.put("alarm", dVar);
                this.f24430a.put("cpu_active_time", eVar);
                this.f24430a.put("power", fVar);
                b.a.f25210a.a(this);
                if (c.b() && this.n) {
                    a.C0525a.f24485a.a();
                }
            } catch (Exception e2) {
                if (c.e()) {
                    String[] strArr = new String[1];
                    String str = "hook failed: " + e2.getMessage();
                }
                ActivityLifeObserver.getInstance().unregister(this);
                ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).unregisterConfigListener(this);
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void a(Activity activity) {
        super.a(activity);
        if (c.e()) {
            new String[]{"onChangeToBack, record data"};
        }
        f();
        for (g gVar : this.f24430a.values()) {
            gVar.b();
        }
        this.f24433d = false;
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void b(Activity activity) {
        super.b(activity);
        if (c.e()) {
            new String[]{"onChangeToFront, record data"};
        }
        f();
        for (g gVar : this.f24430a.values()) {
            gVar.c();
        }
        this.f24433d = true;
    }

    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        this.f24434e = jSONObject.optLong("battery_record_interval", 10);
        boolean z = false;
        int optInt = jSONObject.optInt("enable_upload", 0);
        if (c.e()) {
            String[] strArr = new String[1];
            String str = "mRecordInterval:" + this.f24434e + ",mBatteryCollectEnabled" + optInt;
        }
        if (optInt <= 0 || this.f24434e <= 0) {
            this.f24430a.clear();
            ActivityLifeObserver.getInstance().unregister(this);
            b.a.f25210a.b(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.f24431b = z;
        if (z) {
            com.bytedance.apm.battery.a.a.f24436a = jSONObject.optLong("max_single_wake_lock_hold_time_second", 120) * 1000;
            com.bytedance.apm.battery.a.a.f24437b = (long) jSONObject.optInt("max_total_wake_lock_acquire_count", 5);
            com.bytedance.apm.battery.a.a.f24438c = jSONObject.optLong("max_total_wake_lock_hold_time_second", 240) * 1000;
            com.bytedance.apm.battery.a.a.f24439d = jSONObject.optInt("max_wake_up_alarm_invoke_count", 5);
            com.bytedance.apm.battery.a.a.f24440e = jSONObject.optInt("max_normal_alarm_invoke_count", 10);
            com.bytedance.apm.battery.a.a.f24441f = jSONObject.optLong("max_single_loc_request_time_second", 120) * 1000;
            com.bytedance.apm.battery.a.a.f24442g = jSONObject.optInt("max_total_loc_request_count", 5);
            com.bytedance.apm.battery.a.a.f24443h = jSONObject.optLong("max_total_loc_request_time_second", 240) * 1000;
        }
    }
}

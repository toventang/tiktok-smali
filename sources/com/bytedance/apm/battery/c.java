package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.k.a;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private static int f24475a = 10;

    /* renamed from: b  reason: collision with root package name */
    private boolean f24476b;

    @Override // com.bytedance.apm.k.a
    public final long c() {
        return 300000;
    }

    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return this.f24476b;
    }

    public c() {
        this.p = "battery";
    }

    static {
        Covode.recordClassIndex(14431);
    }

    @Override // com.bytedance.apm.k.a
    public final void e() {
        Intent a2;
        int intExtra;
        super.e();
        if (this.f24476b && !this.o && (a2 = com.bytedance.apm.battery.e.a.a(com.bytedance.apm.c.f24685a, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && (intExtra = a2.getIntExtra("status", -1)) != 2 && intExtra != 5) {
            float c2 = com.ss.b.c.c(com.bytedance.apm.c.f24685a);
            if (c2 >= ((float) f24475a)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timing_current", (double) c2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                    a(new f("battery", "", jSONObject, jSONObject2, null, (byte) 0));
                } catch (JSONException unused) {
                }
            }
        }
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void a(Activity activity) {
        super.a(activity);
        b.a.f25210a.b(this);
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void b(Activity activity) {
        super.b(activity);
        if (this.f24476b) {
            b.a.f25210a.a(this);
        }
    }

    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21 || jSONObject.optInt("energy_enable", 0) != 1) {
            z = false;
        }
        this.f24476b = z;
    }
}

package com.bytedance.b.c.a;

import android.content.Context;
import com.bytedance.apm.q.l;
import com.bytedance.b.c.a.a;
import com.bytedance.b.i.a.a.a;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26017a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26018b = true;

    /* renamed from: c  reason: collision with root package name */
    private a.EnumC0556a f26019c;

    /* renamed from: d  reason: collision with root package name */
    private c.a f26020d;

    /* renamed from: e  reason: collision with root package name */
    private String f26021e;

    /* renamed from: f  reason: collision with root package name */
    private double f26022f = -1.0d;

    /* renamed from: g  reason: collision with root package name */
    private double f26023g = -1.0d;

    /* renamed from: h  reason: collision with root package name */
    private double f26024h = -1.0d;

    /* renamed from: i  reason: collision with root package name */
    private double f26025i = -1.0d;

    /* renamed from: j  reason: collision with root package name */
    private List<l<String, Double>> f26026j;

    static {
        Covode.recordClassIndex(15157);
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final String d() {
        return "cpu";
    }

    /* renamed from: com.bytedance.b.c.a.e$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26027a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 15158(0x3b36, float:2.1241E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.b.c.a.a$a[] r0 = com.bytedance.b.c.a.a.EnumC0556a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.b.c.a.e.AnonymousClass1.f26027a = r2
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.MIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.b.c.a.e.AnonymousClass1.f26027a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.BACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.b.c.a.e.AnonymousClass1.f26027a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.FRONT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.c.a.e.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", com.bytedance.apm.c.a());
            jSONObject.put("is_main_process", com.bytedance.apm.c.b());
            jSONObject.put("scene", this.f26021e);
            int i2 = AnonymousClass1.f26027a[this.f26019c.ordinal()];
            if (i2 == 1) {
                jSONObject.put("data_type", "mix");
            } else if (i2 == 2) {
                jSONObject.put("data_type", "back");
            } else if (i2 == 3) {
                jSONObject.put("data_type", "front");
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_auto_sample", this.f26017a);
            if (this.f26020d != null) {
                Context context = com.bytedance.apm.c.f24685a;
                if (j.f107225d == l.a.UNKNOWN || !j.b() || j.c()) {
                    j.f107225d = com.bytedance.common.utility.l.c(context);
                }
                jSONObject.put("network_type", j.f107225d);
                jSONObject.put("battery_level", this.f26020d.f46233c);
                jSONObject.put("cpu_hardware", this.f26020d.f46231a);
                jSONObject.put("is_charging", this.f26020d.f46232b);
                jSONObject.put("power_save_mode", this.f26020d.f46235e);
                jSONObject.put("thermal_status", this.f26020d.f46234d);
                jSONObject.put("battery_thermal", (double) this.f26020d.f46236f);
                jSONObject.put("is_normal_sample_state", this.f26018b);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            double d2 = this.f26022f;
            if (d2 > -1.0d && this.f26023g > -1.0d) {
                jSONObject.put("app_usage_rate", d2);
                jSONObject.put("app_max_usage_rate", this.f26023g);
            }
            double d3 = this.f26024h;
            if (d3 > -1.0d && this.f26025i > -1.0d) {
                jSONObject.put("app_stat_speed", d3);
                jSONObject.put("app_max_stat_speed", this.f26025i);
            }
            List<com.bytedance.apm.q.l<String, Double>> list = this.f26026j;
            if (list != null && !list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (com.bytedance.apm.q.l<String, Double> lVar : this.f26026j) {
                    if (!(lVar == null || lVar.f25254a == null || lVar.f25254a.isEmpty() || lVar.f25255b == null || lVar.f25255b.doubleValue() < 0.0d)) {
                        jSONObject2.put(lVar.f25254a, lVar.f25255b);
                    }
                }
                jSONObject.put("thread_cpu_usage", jSONObject2);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    public e(a.EnumC0556a aVar, String str, List<com.bytedance.apm.q.l<String, Double>> list, c.a aVar2) {
        this.f26026j = new ArrayList(list);
        this.f26019c = aVar;
        this.f26021e = str;
        this.f26020d = aVar2;
    }

    public e(a.EnumC0556a aVar, String str, double d2, double d3, double d4, double d5, c.a aVar2) {
        this.f26019c = aVar;
        this.f26021e = str;
        this.f26022f = d2;
        this.f26023g = d3;
        this.f26024h = d4;
        this.f26025i = d5;
        this.f26020d = aVar2;
    }
}

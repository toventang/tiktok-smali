package com.ss.android.ad.splash.core.video2;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.v;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.f.m;
import java.util.HashMap;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private int f58863a;

    static {
        Covode.recordClassIndex(36442);
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void b() {
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void b(int i2) {
    }

    public void b(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public void c(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void d(int i2) {
    }

    public void d(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public void e(int i2) {
    }

    /* access modifiers changed from: protected */
    public void e(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void a() {
        f();
        g();
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public final void j() {
        d();
        e();
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void c(int i2) {
        d(i2);
        c();
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void a(int i2) {
        e(i2);
        h();
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public void a(int i2, int i3) {
        e(i2, i3);
        i();
    }

    @Override // com.ss.android.ad.splash.core.video2.b
    public final void f(int i2, int i3) {
        float f2 = ((float) i2) / ((float) i3);
        if (f2 >= 0.0f) {
            if (f2 >= 0.75f) {
                int i4 = this.f58863a;
                if ((i4 & 8) == 0) {
                    this.f58863a = i4 | 8;
                    d(i2, i3);
                }
            }
            if (f2 >= 0.5f) {
                int i5 = this.f58863a;
                if ((i5 & 4) == 0) {
                    this.f58863a = i5 | 4;
                    c(i2, i3);
                }
            }
            if (f2 >= 0.25f) {
                int i6 = this.f58863a;
                if ((i6 & 2) == 0) {
                    this.f58863a = i6 | 2;
                    b(i2, i3);
                }
            }
        }
    }

    protected static void a(b bVar, HashMap<String, Object> hashMap) {
        String str;
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("show_expected", Integer.valueOf(bVar.f58440c));
        if (bVar.C) {
            str = "real_time";
        } else {
            str = "not_real_time";
        }
        hashMap2.put("show_type", str);
        int i2 = 1;
        hashMap2.put("play_order", 1);
        if (h.X != -1) {
            if (h.X != 1) {
                i2 = 2;
            }
            hashMap2.put("awemelaunch", Integer.valueOf(i2));
        }
        hashMap2.put("ad_sequence", Integer.valueOf(v.a().p()));
        hashMap3.put("is_ad_event", "1");
        if (!l.a(bVar.f58447j)) {
            hashMap3.put("log_extra", bVar.f58447j);
        }
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f58439b));
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(bVar, 0, "play", hashMap3, hashMap2);
    }

    protected static void a(int i2, b bVar, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("play_order", 1);
        hashMap3.put("duration", Long.toString((long) i2));
        hashMap3.put("percent", Integer.toString(100));
        hashMap3.put("is_ad_event", "1");
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f58439b));
        if (!l.a(bVar.f58447j)) {
            hashMap3.put("log_extra", bVar.f58447j);
        }
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(bVar, 0, "play_over", hashMap3, hashMap2);
    }

    protected static void a(b bVar, int i2, int i3, int i4, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap;
        HashMap hashMap3 = new HashMap();
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        long j2 = (long) i2;
        hashMap3.put("duration", Long.toString(j2));
        hashMap3.put("percent", Integer.valueOf(m.a(j2, (long) i3)));
        hashMap3.put("is_ad_event", "1");
        hashMap3.put("ad_fetch_time", Long.valueOf(bVar.f58439b));
        hashMap3.put("break_reason", Integer.valueOf(i4));
        if (!l.a(bVar.f58447j)) {
            hashMap3.put("log_extra", bVar.f58447j);
        }
        hashMap2.put("break_reason", Integer.valueOf(i4));
        hashMap2.put("play_order", 1);
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(bVar, 0, "play_break", hashMap3, hashMap2);
    }
}

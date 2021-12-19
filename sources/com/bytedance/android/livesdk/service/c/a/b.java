package com.bytedance.android.livesdk.service.c.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private a f21305a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21306b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f21307c;

    /* renamed from: d  reason: collision with root package name */
    private int f21308d;

    /* renamed from: e  reason: collision with root package name */
    private long f21309e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21310f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f21311g;

    public interface a {
        static {
            Covode.recordClassIndex(12567);
        }

        void a(String str, int i2);
    }

    static {
        Covode.recordClassIndex(12566);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.c.a.b$b  reason: collision with other inner class name */
    public static class C0455b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21312a = new b((byte) 0);

        static {
            Covode.recordClassIndex(12568);
        }
    }

    private b() {
        this.f21307c = new Handler(Looper.getMainLooper());
        this.f21308d = 0;
        this.f21309e = 0;
        this.f21310f = false;
        this.f21311g = new c(this);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f21305a != null && GiftManager.inst().findGiftById(this.f21309e) != null) {
            if (this.f21306b) {
                this.f21305a.a("convenient_gift", this.f21308d);
            } else {
                this.f21305a.a("normal_gift", this.f21308d);
            }
            this.f21310f = false;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(long j2, boolean z, a aVar) {
        if (this.f21310f) {
            if (j2 != this.f21309e) {
                this.f21307c.removeCallbacks(this.f21311g);
                a();
            } else {
                this.f21308d++;
                this.f21307c.removeCallbacks(this.f21311g);
                this.f21307c.postDelayed(this.f21311g, 3000);
                return;
            }
        }
        this.f21305a = aVar;
        this.f21308d = 1;
        this.f21310f = true;
        this.f21307c.postDelayed(this.f21311g, 3000);
        if (j2 != this.f21309e) {
            this.f21309e = j2;
        }
        this.f21306b = z;
    }
}

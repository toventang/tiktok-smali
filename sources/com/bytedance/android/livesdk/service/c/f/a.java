package com.bytedance.android.livesdk.service.c.f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0466a f21400a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21401b;

    /* renamed from: c  reason: collision with root package name */
    public String f21402c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f21403d;

    /* renamed from: e  reason: collision with root package name */
    public int f21404e;

    /* renamed from: f  reason: collision with root package name */
    public long f21405f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21406g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f21407h;

    /* renamed from: com.bytedance.android.livesdk.service.c.f.a$a  reason: collision with other inner class name */
    public interface AbstractC0466a {
        static {
            Covode.recordClassIndex(12603);
        }

        void a(String str, int i2, String str2);
    }

    static {
        Covode.recordClassIndex(12602);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static a f21408a = new a((byte) 0);

        static {
            Covode.recordClassIndex(12604);
        }
    }

    public final void a() {
        AbstractC0466a aVar = this.f21400a;
        if (aVar != null) {
            if (this.f21401b) {
                aVar.a("convenient_gift", this.f21404e, this.f21402c);
            } else {
                aVar.a("normal_gift", this.f21404e, this.f21402c);
            }
            this.f21406g = false;
        }
    }

    private a() {
        this.f21402c = "";
        this.f21403d = new Handler(Looper.getMainLooper());
        this.f21404e = 0;
        this.f21405f = 0;
        this.f21406g = false;
        this.f21407h = new b(this);
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}

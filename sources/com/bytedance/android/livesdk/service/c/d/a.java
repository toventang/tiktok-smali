package com.bytedance.android.livesdk.service.c.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0465a f21391a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f21392b;

    /* renamed from: c  reason: collision with root package name */
    public int f21393c;

    /* renamed from: d  reason: collision with root package name */
    public long f21394d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21395e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f21396f;

    /* renamed from: com.bytedance.android.livesdk.service.c.d.a$a  reason: collision with other inner class name */
    public interface AbstractC0465a {
        static {
            Covode.recordClassIndex(12598);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(12597);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21397a = new a((byte) 0);

        static {
            Covode.recordClassIndex(12599);
        }
    }

    public final void a() {
        AbstractC0465a aVar = this.f21391a;
        if (aVar != null) {
            aVar.a(this.f21393c);
            this.f21395e = false;
        }
    }

    private a() {
        this.f21392b = new Handler(Looper.getMainLooper());
        this.f21393c = 0;
        this.f21394d = 0;
        this.f21395e = false;
        this.f21396f = new b(this);
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}

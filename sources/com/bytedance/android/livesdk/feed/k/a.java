package com.bytedance.android.livesdk.feed.k;

import android.os.Build;
import android.view.Choreographer;
import com.bytedance.android.livesdk.feed.t;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17578a = Logger.debug();

    /* renamed from: b  reason: collision with root package name */
    long f17579b;

    /* renamed from: c  reason: collision with root package name */
    long f17580c;

    /* renamed from: d  reason: collision with root package name */
    long f17581d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17582e;

    /* renamed from: f  reason: collision with root package name */
    public int f17583f;

    /* renamed from: g  reason: collision with root package name */
    public Choreographer.FrameCallback f17584g;

    /* renamed from: com.bytedance.android.livesdk.feed.k.a$a  reason: collision with other inner class name */
    public static class C0366a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17586a = new a((byte) 0);

        static {
            Covode.recordClassIndex(9733);
        }
    }

    static {
        Covode.recordClassIndex(9731);
    }

    private a() {
        this.f17584g = new Choreographer.FrameCallback() {
            /* class com.bytedance.android.livesdk.feed.k.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9732);
            }

            public final void doFrame(long j2) {
                if (a.this.f17582e) {
                    if (a.this.f17580c <= 0) {
                        a.this.f17580c = j2;
                    } else {
                        a.this.f17581d++;
                    }
                    a.this.f17579b = j2;
                    try {
                        Choreographer.getInstance().postFrameCallback(this);
                        if (a.f17578a) {
                            a.this.a(true);
                        }
                    } catch (Throwable unused) {
                        a.this.f17582e = false;
                    }
                }
            }
        };
    }

    public final void a() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            Choreographer.getInstance().removeFrameCallback(this.f17584g);
            if (this.f17582e) {
                a(false);
            }
        } catch (Throwable unused) {
        }
        this.f17582e = false;
        this.f17580c = 0;
        this.f17579b = 0;
        this.f17581d = 0;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 30;
        }
        long j2 = this.f17581d;
        if (j2 >= ((long) i2)) {
            long j3 = this.f17579b;
            long j4 = this.f17580c;
            if (j3 > j4) {
                float f2 = (((float) j2) * 1.0E9f) / ((float) (j3 - j4));
                if (!z) {
                    t.a(f2);
                    this.f17583f++;
                }
                if (f17578a) {
                    com.bytedance.android.live.core.c.a.a(3, "FPSMonitor", "report: realTime = " + z + ", frameCount = " + this.f17581d + ", fps = " + f2);
                }
            }
        }
    }
}

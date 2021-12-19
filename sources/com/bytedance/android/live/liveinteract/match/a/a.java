package com.bytedance.android.live.liveinteract.match.a;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public static final C0195a f10661a = new C0195a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f10662b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f10663c;

    /* renamed from: d  reason: collision with root package name */
    private final PointF f10664d;

    static {
        Covode.recordClassIndex(5690);
    }

    private static double a(double d2, double d3, double d4) {
        double d5 = 1.0d - d2;
        double d6 = d2 * d2;
        double d7 = d5 * d5;
        return (d7 * d5 * 0.0d) + (d7 * 3.0d * d2 * d3) + (d5 * 3.0d * d6 * d4) + (d6 * d2 * 1.0d);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.a.a$a  reason: collision with other inner class name */
    public static final class C0195a {
        static {
            Covode.recordClassIndex(5691);
        }

        private C0195a() {
        }

        public /* synthetic */ C0195a(byte b2) {
            this();
        }
    }

    public a() {
        PointF pointF = new PointF();
        this.f10663c = pointF;
        PointF pointF2 = new PointF();
        this.f10664d = pointF2;
        pointF.x = 0.65f;
        pointF.y = 0.0f;
        pointF2.x = 0.35f;
        pointF2.y = 1.0f;
    }

    public final float getInterpolation(float f2) {
        int i2 = this.f10662b;
        float f3 = f2;
        while (true) {
            if (i2 >= 4096) {
                break;
            }
            f3 = (((float) i2) * 1.0f) / 4096.0f;
            if (a((double) f3, (double) this.f10663c.x, (double) this.f10664d.x) >= ((double) f2)) {
                this.f10662b = i2;
                break;
            }
            i2++;
        }
        double a2 = a((double) f3, (double) this.f10663c.y, (double) this.f10664d.y);
        if (a2 > 0.999d) {
            a2 = 1.0d;
            this.f10662b = 0;
        }
        return (float) a2;
    }
}

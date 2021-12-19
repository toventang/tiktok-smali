package com.ss.android.ugc.aweme.g;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public static final C2408a f98932a = new C2408a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final float f98933b;

    static {
        Covode.recordClassIndex(62903);
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a$a  reason: collision with other inner class name */
    public static final class C2408a {
        static {
            Covode.recordClassIndex(62904);
        }

        private C2408a() {
        }

        public /* synthetic */ C2408a(byte b2) {
            this();
        }
    }

    public a() {
        this((byte) 0);
    }

    private a(byte b2) {
        this.f98933b = 2.3f;
    }

    public final float getInterpolation(float f2) {
        if (f2 == 1.0f) {
            return 1.0f;
        }
        double pow = Math.pow(2.0d, (double) (-10.0f * f2));
        float f3 = this.f98933b;
        double d2 = (double) (f2 - (f3 / 4.0f));
        Double.isNaN(d2);
        double d3 = (double) f3;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin((d2 * 6.283185307179586d) / d3)) + 1.0d);
    }
}

package com.ss.android.ugc.aweme.trending.b;

import android.animation.TimeInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;

public final class b implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141062a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final float f141063b = ((float) n.a(12.0d));

    static {
        Covode.recordClassIndex(92085);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92086);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final float getInterpolation(float f2) {
        float f3;
        if (f2 < 0.1f) {
            f3 = this.f141063b * f2;
        } else if (f2 <= 0.9f) {
            return this.f141063b;
        } else {
            f3 = this.f141063b * (1.0f - f2);
        }
        return f3 / 0.1f;
    }
}

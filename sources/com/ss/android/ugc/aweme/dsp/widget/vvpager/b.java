package com.ss.android.ugc.aweme.dsp.widget.vvpager;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    a f84096a;

    /* renamed from: b  reason: collision with root package name */
    public int f84097b = 600;

    /* renamed from: c  reason: collision with root package name */
    public boolean f84098c;

    static {
        Covode.recordClassIndex(52427);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.widget.vvpager.b$b  reason: collision with other inner class name */
    public static final class animation.InterpolatorC2006b implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        private final a f84102a = new a();

        static {
            Covode.recordClassIndex(52429);
        }

        public final float getInterpolation(float f2) {
            return this.f84102a.getInterpolation(f2);
        }
    }

    public static final class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public boolean f84099a;

        /* renamed from: b  reason: collision with root package name */
        public final Interpolator f84100b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f84101c;

        static {
            Covode.recordClassIndex(52428);
        }

        public final float getInterpolation(float f2) {
            if (this.f84099a) {
                return this.f84101c.getInterpolation(f2);
            }
            return this.f84100b.getInterpolation(f2);
        }

        public a(Interpolator interpolator, Interpolator interpolator2) {
            l.d(interpolator, "");
            l.d(interpolator2, "");
            this.f84100b = interpolator;
            this.f84101c = interpolator2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar) {
        super(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
        this.f84096a = aVar;
    }

    public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6;
        if (this.f84098c) {
            i7 = this.f84097b;
        }
        super.startScroll(i2, i3, i4, i5, i7);
    }
}

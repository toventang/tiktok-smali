package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import h.j.h;

public class c extends View {

    /* renamed from: a  reason: collision with root package name */
    private h.j.c<Double> f65923a;

    /* renamed from: b  reason: collision with root package name */
    private h.j.c<Double> f65924b;

    /* renamed from: c  reason: collision with root package name */
    private d f65925c;

    static {
        Covode.recordClassIndex(40561);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final h.j.c<Double> getCoreAreaXRange() {
        return this.f65923a;
    }

    /* access modifiers changed from: protected */
    public final h.j.c<Double> getCoreAreaYRange() {
        return this.f65924b;
    }

    public final d getInteractiveListener() {
        return this.f65925c;
    }

    public final void setInteractiveListener(d dVar) {
        this.f65925c = dVar;
    }

    /* access modifiers changed from: protected */
    public final void setCoreAreaXRange(h.j.c<Double> cVar) {
        l.d(cVar, "");
        this.f65923a = cVar;
    }

    /* access modifiers changed from: protected */
    public final void setCoreAreaYRange(h.j.c<Double> cVar) {
        l.d(cVar, "");
        this.f65924b = cVar;
    }

    private /* synthetic */ c(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        h.j.c<Double> a2;
        l.d(context, "");
        MethodCollector.i(3438);
        int a3 = n.a(context);
        int b2 = n.b(context);
        if (gb.a(context)) {
            double d2 = (double) a3;
            Double.isNaN(d2);
            Double.isNaN(d2);
            a2 = h.a(0.22d * d2, d2 * 1.0d);
        } else {
            double d3 = (double) a3;
            Double.isNaN(d3);
            Double.isNaN(d3);
            a2 = h.a(0.0d * d3, d3 * 0.78d);
        }
        this.f65923a = a2;
        double d4 = (double) b2;
        Double.isNaN(d4);
        Double.isNaN(d4);
        this.f65924b = h.a(0.12d * d4, d4 * 0.59d);
        MethodCollector.o(3438);
    }

    protected static boolean a(float f2, float f3, float f4, float f5) {
        if (Math.abs(f4 - f2) >= ((float) com.ss.android.ugc.aweme.base.utils.n.a(10.0d)) || Math.abs(f5 - f3) >= ((float) com.ss.android.ugc.aweme.base.utils.n.a(10.0d))) {
            return false;
        }
        return true;
    }
}

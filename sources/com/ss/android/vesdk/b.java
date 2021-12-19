package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.util.LinkedList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<Double> f151046a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    double f151047b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    double f151048c = -1.0d;

    /* renamed from: d  reason: collision with root package name */
    double f151049d = -1.0d;

    /* renamed from: e  reason: collision with root package name */
    long f151050e = 0;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f151051f = true;

    static {
        Covode.recordClassIndex(99338);
    }

    public final double a() {
        if (this.f151046a.size() <= 0) {
            return -1.0d;
        }
        if (this.f151048c < 0.0d || this.f151049d < 0.0d) {
            d();
        }
        return this.f151049d;
    }

    public final double b() {
        if (this.f151046a.size() <= 0) {
            return -1.0d;
        }
        if (this.f151048c < 0.0d || this.f151049d < 0.0d) {
            d();
        }
        return this.f151048c;
    }

    public final double c() {
        if (this.f151046a.size() <= 0) {
            return -1.0d;
        }
        return a(a() / b());
    }

    private void d() {
        this.f151051f = false;
        LinkedList linkedList = new LinkedList(this.f151046a);
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            d3 += ((Double) linkedList.get(i2)).doubleValue();
        }
        double size = (double) linkedList.size();
        Double.isNaN(size);
        this.f151048c = a(d3 / size);
        for (int i3 = 0; i3 < linkedList.size(); i3++) {
            d2 += Math.pow(((Double) linkedList.get(i3)).doubleValue() - this.f151048c, 2.0d);
        }
        double size2 = (double) linkedList.size();
        Double.isNaN(size2);
        this.f151049d = a(Math.sqrt(d2 / size2));
        this.f151051f = true;
    }

    private static double a(double d2) {
        return new BigDecimal(d2).setScale(4, 5).doubleValue();
    }
}

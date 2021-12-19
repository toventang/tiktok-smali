package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.LinkedList;
import java.util.Queue;

/* access modifiers changed from: package-private */
public class f<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f48079a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48080b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f48081c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f48082d;

    /* renamed from: e  reason: collision with root package name */
    public int f48083e;

    static {
        Covode.recordClassIndex(29051);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f48081c.size();
    }

    public V b() {
        return (V) this.f48081c.poll();
    }

    public final void c() {
        boolean z;
        if (this.f48083e > 0) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        this.f48083e--;
    }

    /* access modifiers changed from: package-private */
    public void a(V v) {
        this.f48081c.add(v);
    }

    public f(int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.b(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        i.b(z3);
        i.b(i4 < 0 ? false : z4);
        this.f48079a = i2;
        this.f48080b = i3;
        this.f48081c = new LinkedList();
        this.f48083e = i4;
        this.f48082d = z;
    }
}

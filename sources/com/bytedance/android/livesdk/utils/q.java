package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class q<E> {

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f22351a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22352b;

    static {
        Covode.recordClassIndex(13197);
    }

    public final boolean e() {
        return this.f22351a.isEmpty();
    }

    public final int d() {
        List<E> list = this.f22351a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void a() {
        List<E> list = this.f22351a;
        if (list != null && list.size() > 0) {
            this.f22351a.remove(0);
        }
    }

    public final E b() {
        List<E> list = this.f22351a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<E> list2 = this.f22351a;
        return list2.get(list2.size() - 1);
    }

    public final E c() {
        List<E> list = this.f22351a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f22351a.get(0);
    }

    public final void a(E e2) {
        List<E> list = this.f22351a;
        if (list != null) {
            list.add(e2);
            while (this.f22351a.size() > this.f22352b) {
                this.f22351a.remove(0);
            }
        }
    }

    public q(Integer num, List<E> list) {
        int i2;
        if (num.intValue() > 0) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.f22352b = i2;
        this.f22351a = list;
    }
}

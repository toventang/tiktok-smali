package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<Boolean> f39728a = new ArrayList();

    static {
        Covode.recordClassIndex(24475);
    }

    public final void a() {
        if (this.f39728a.size() != 0) {
            this.f39728a.clear();
        }
    }

    private final void b(int i2) {
        this.f39728a.add(i2, false);
    }

    private final void a(int i2) {
        if (i2 < this.f39728a.size()) {
            this.f39728a.set(i2, true);
        } else {
            this.f39728a.add(i2, true);
        }
    }

    public final void a(int i2, boolean z) {
        if (i2 >= 0 && i2 <= this.f39728a.size()) {
            if (z) {
                a(i2);
            } else {
                b(i2);
            }
        }
    }
}

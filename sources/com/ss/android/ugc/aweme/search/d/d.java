package com.ss.android.ugc.aweme.search.d;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f120995a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private final int f120996b;

    /* renamed from: c  reason: collision with root package name */
    private final b f120997c;

    static {
        Covode.recordClassIndex(78821);
    }

    public final void a(int i2) {
        if (b(this.f120995a, i2)) {
            this.f120997c.l();
        }
    }

    public d(int i2, b bVar) {
        this.f120996b = i2;
        this.f120997c = bVar;
    }

    private boolean b(int i2, int i3) {
        int i4 = this.f120996b;
        if (i4 > 0 && (i3 - i2) - 1 <= i4) {
            return true;
        }
        return false;
    }

    public final void a(int i2, int i3) {
        if (i2 > this.f120995a) {
            this.f120995a = i2;
            if (b(i2, i3)) {
                this.f120997c.l();
            }
        }
    }
}

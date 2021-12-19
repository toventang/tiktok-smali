package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.d.b;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f59535a;

    /* renamed from: b  reason: collision with root package name */
    public final int f59536b;

    /* renamed from: c  reason: collision with root package name */
    public int f59537c;

    static {
        Covode.recordClassIndex(36763);
    }

    public final boolean a() {
        if (this.f59537c >= this.f59536b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        b bVar = new b(16);
        bVar.a('[');
        bVar.a(Integer.toString(this.f59535a));
        bVar.a('>');
        bVar.a(Integer.toString(this.f59537c));
        bVar.a('>');
        bVar.a(Integer.toString(this.f59536b));
        bVar.a(']');
        return bVar.toString();
    }

    public g(int i2) {
        if (i2 >= 0) {
            this.f59535a = 0;
            this.f59536b = i2;
            this.f59537c = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }

    public final void a(int i2) {
        if (i2 < this.f59535a) {
            throw new IndexOutOfBoundsException();
        } else if (i2 <= this.f59536b) {
            this.f59537c = i2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}

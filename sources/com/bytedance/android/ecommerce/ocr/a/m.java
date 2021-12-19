package com.bytedance.android.ecommerce.ocr.a;

import com.bytedance.covode.number.Covode;

public class m implements Comparable<m> {

    /* renamed from: a  reason: collision with root package name */
    public final int f7229a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7230b;

    static {
        Covode.recordClassIndex(3473);
    }

    public int hashCode() {
        return (this.f7229a * 31) + this.f7230b;
    }

    public final m a() {
        return new m(this.f7230b, this.f7229a);
    }

    public String toString() {
        return this.f7229a + "x" + this.f7230b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(m mVar) {
        m mVar2 = mVar;
        int i2 = this.f7230b * this.f7229a;
        int i3 = mVar2.f7230b * mVar2.f7229a;
        if (i3 < i2) {
            return 1;
        }
        if (i3 > i2) {
            return -1;
        }
        return 0;
    }

    public final m a(m mVar) {
        if (this.f7229a * mVar.f7230b >= mVar.f7229a * this.f7230b) {
            int i2 = mVar.f7229a;
            return new m(i2, (this.f7230b * i2) / this.f7229a);
        }
        int i3 = this.f7229a;
        int i4 = mVar.f7230b;
        return new m((i3 * i4) / this.f7230b, i4);
    }

    public final m b(m mVar) {
        if (this.f7229a * mVar.f7230b <= mVar.f7229a * this.f7230b) {
            int i2 = mVar.f7229a;
            return new m(i2, (this.f7230b * i2) / this.f7229a);
        }
        int i3 = this.f7229a;
        int i4 = mVar.f7230b;
        return new m((i3 * i4) / this.f7230b, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f7229a == mVar.f7229a && this.f7230b == mVar.f7230b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public m(int i2, int i3) {
        this.f7229a = i2;
        this.f7230b = i3;
    }
}

package com.bytedance.android.livesdk.model.utils.a;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public char[] f19773a;

    /* renamed from: b  reason: collision with root package name */
    public int f19774b;

    static {
        Covode.recordClassIndex(11719);
    }

    public final String toString() {
        return new String(this.f19773a, 0, this.f19774b);
    }

    public b(int i2) {
        if (i2 >= 0) {
            this.f19773a = new char[i2];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void a(int i2) {
        char[] cArr = new char[Math.max(this.f19773a.length << 1, i2)];
        System.arraycopy(this.f19773a, 0, cArr, 0, this.f19774b);
        this.f19773a = cArr;
    }

    public final void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i2 = this.f19774b + length;
        if (i2 > this.f19773a.length) {
            a(i2);
        }
        str.getChars(0, length, this.f19773a, this.f19774b);
        this.f19774b = i2;
    }
}

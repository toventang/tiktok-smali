package com.ss.android.http.a.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.c.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public char[] f59540a;

    /* renamed from: b  reason: collision with root package name */
    public int f59541b;

    static {
        Covode.recordClassIndex(36768);
    }

    public final String toString() {
        return new String(this.f59540a, 0, this.f59541b);
    }

    public b(int i2) {
        if (i2 >= 0) {
            this.f59540a = new char[i2];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void a(char c2) {
        int i2 = this.f59541b + 1;
        if (i2 > this.f59540a.length) {
            a(i2);
        }
        this.f59540a[this.f59541b] = c2;
        this.f59541b = i2;
    }

    public final void a(int i2) {
        char[] cArr = new char[Math.max(this.f59540a.length << 1, i2)];
        System.arraycopy(this.f59540a, 0, cArr, 0, this.f59541b);
        this.f59540a = cArr;
    }

    public final void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i2 = this.f59541b + length;
        if (i2 > this.f59540a.length) {
            a(i2);
        }
        str.getChars(0, length, this.f59540a, this.f59541b);
        this.f59541b = i2;
    }

    public final String a(int i2, int i3) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i3 > this.f59541b) {
            throw new IndexOutOfBoundsException();
        } else if (i2 <= i3) {
            return new String(this.f59540a, i2, i3 - i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final String b(int i2, int i3) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i3 > this.f59541b) {
            throw new IndexOutOfBoundsException();
        } else if (i2 <= i3) {
            while (i2 < i3 && a.a(this.f59540a[i2])) {
                i2++;
            }
            while (i3 > i2 && a.a(this.f59540a[i3 - 1])) {
                i3--;
            }
            return new String(this.f59540a, i2, i3 - i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}

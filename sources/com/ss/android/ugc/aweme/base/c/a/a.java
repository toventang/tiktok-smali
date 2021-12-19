package com.ss.android.ugc.aweme.base.c.a;

import com.bytedance.covode.number.Covode;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f68040a;

    /* renamed from: b  reason: collision with root package name */
    public final T[] f68041b;

    static {
        Covode.recordClassIndex(41910);
    }

    public final T a() {
        if (b()) {
            return this.f68041b[0];
        }
        return null;
    }

    public final boolean b() {
        T[] tArr = this.f68041b;
        if (tArr == null || tArr.length == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("action = [").append(this.f68040a).append("], args = ");
        if (this.f68041b != null) {
            sb.append("[");
            int i2 = 0;
            while (true) {
                T[] tArr = this.f68041b;
                if (i2 >= tArr.length) {
                    break;
                }
                sb.append((Object) tArr[i2]);
                if (i2 != this.f68041b.length - 1) {
                    sb.append(",");
                }
                i2++;
            }
            sb.append("]");
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    public a(String str, T... tArr) {
        this.f68040a = str;
        this.f68041b = tArr;
    }
}

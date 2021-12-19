package com.ss.android.ugc.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.h.g;
import java.util.Arrays;
import java.util.Queue;

public final class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private double f148500a = -1.0d;

    static {
        Covode.recordClassIndex(97890);
    }

    @Override // com.ss.android.ugc.h.g.a
    public final double b(Queue<i> queue, i[] iVarArr) {
        return a(queue, iVarArr);
    }

    @Override // com.ss.android.ugc.h.g.a
    public final double a(Queue<i> queue, i[] iVarArr) {
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(iVarArr);
        int i2 = 0;
        Arrays.sort(iVarArr, 0, queue.size());
        int size = queue.size();
        double d2 = 0.0d;
        for (int i3 = 0; i3 < size; i3++) {
            d2 += iVarArr[i3].f148520c;
        }
        double d3 = d2 / 2.0d;
        while (true) {
            if (i2 >= size) {
                break;
            }
            d3 -= iVarArr[i2].f148520c;
            if (d3 <= 0.0d) {
                double d4 = iVarArr[i2].f148519b;
                if (d4 >= 0.0d) {
                    this.f148500a = d4;
                    return d4;
                }
            } else {
                i2++;
            }
        }
        throw new IllegalArgumentException();
    }
}

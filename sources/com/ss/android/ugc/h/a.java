package com.ss.android.ugc.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.h.g;
import java.util.Queue;

public final class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private double f148499a = -1.0d;

    static {
        Covode.recordClassIndex(97889);
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
        long j2 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < queue.size(); i3++) {
            double d2 = (double) i2;
            double d3 = iVarArr[i3].f148520c;
            Double.isNaN(d2);
            i2 = (int) (d2 + d3);
            j2 += iVarArr[i3].f148521d;
        }
        double d4 = (double) i2;
        Double.isNaN(d4);
        double d5 = (double) j2;
        Double.isNaN(d5);
        double d6 = (d4 * 8.0d) / (d5 / 1000.0d);
        if (d6 >= 0.0d) {
            this.f148499a = d6;
            return d6;
        }
        throw new IllegalArgumentException();
    }
}

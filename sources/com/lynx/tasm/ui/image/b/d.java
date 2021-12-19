package com.lynx.tasm.ui.image.b;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(35437);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f56965a;

        /* renamed from: b  reason: collision with root package name */
        public final c f56966b;

        static {
            Covode.recordClassIndex(35438);
        }

        private a(c cVar, c cVar2) {
            this.f56965a = cVar;
            this.f56966b = cVar2;
        }

        /* synthetic */ a(c cVar, c cVar2, byte b2) {
            this(cVar, cVar2);
        }
    }

    public static a a(int i2, int i3, List<c> list) {
        c cVar = null;
        if (list.isEmpty()) {
            return new a(null, null, (byte) 0);
        }
        if (list.size() == 1) {
            return new a(list.get(0), null, (byte) 0);
        }
        if (i2 <= 0 || i3 <= 0) {
            return new a(null, null, (byte) 0);
        }
        h e2 = k.a().e();
        double d2 = (double) (i2 * i3);
        double d3 = 1.0d;
        Double.isNaN(d2);
        double d4 = d2 * 1.0d;
        double d5 = Double.MAX_VALUE;
        c cVar2 = null;
        double d6 = Double.MAX_VALUE;
        for (c cVar3 : list) {
            double abs = Math.abs(d3 - (cVar3.f56962b / d4));
            if (abs < d5) {
                d5 = abs;
                cVar2 = cVar3;
            }
            if (abs < d6 && (e2.b(cVar3.a()) || e2.c(cVar3.a()))) {
                d6 = abs;
                cVar = cVar3;
            }
            d3 = 1.0d;
        }
        if (!(cVar == null || cVar2 == null || !cVar.f56961a.equals(cVar2.f56961a))) {
            cVar = null;
        }
        return new a(cVar2, cVar, (byte) 0);
    }
}

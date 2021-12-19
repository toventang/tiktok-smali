package com.bytedance.lottie.c.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f40551a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f40552b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f40553c;

    static {
        Covode.recordClassIndex(24903);
    }

    public l() {
        this.f40551a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f40551a.size() + "closed=" + this.f40553c + '}';
    }

    public l(PointF pointF, boolean z, List<a> list) {
        ArrayList arrayList = new ArrayList();
        this.f40551a = arrayList;
        this.f40552b = pointF;
        this.f40553c = z;
        arrayList.addAll(list);
    }
}

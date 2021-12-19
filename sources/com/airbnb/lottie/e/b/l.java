package com.airbnb.lottie.e.b;

import android.graphics.PointF;
import com.airbnb.lottie.e.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f5427a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f5428b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5429c;

    static {
        Covode.recordClassIndex(2272);
    }

    public l() {
        this.f5427a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f5427a.size() + "closed=" + this.f5429c + '}';
    }

    public l(PointF pointF, boolean z, List<a> list) {
        ArrayList arrayList = new ArrayList();
        this.f5427a = arrayList;
        this.f5428b = pointF;
        this.f5429c = z;
        arrayList.addAll(list);
    }
}

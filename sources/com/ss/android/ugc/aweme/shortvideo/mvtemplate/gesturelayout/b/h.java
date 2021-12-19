package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

public final class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f129284a;

    /* renamed from: b  reason: collision with root package name */
    private final float f129285b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f129286c;

    /* renamed from: d  reason: collision with root package name */
    private final PointF f129287d;

    /* renamed from: e  reason: collision with root package name */
    private float f129288e;

    /* renamed from: f  reason: collision with root package name */
    private final Property<T, PointF> f129289f;

    static {
        Covode.recordClassIndex(84858);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f129288e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
        /*
            r2 = this;
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = r3.getName()
        L_0x0008:
            r2.<init>(r1, r0)
            r2.f129289f = r3
            r0 = 2
            float[] r0 = new float[r0]
            r2.f129286c = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.f129287d = r0
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r0 = 0
            r1.<init>(r4, r0)
            r2.f129284a = r1
            float r0 = r1.getLength()
            r2.f129285b = r0
            return
        L_0x0028:
            r0 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.h.<init>(android.util.Property, android.graphics.Path):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f2) {
        float floatValue = f2.floatValue();
        this.f129288e = floatValue;
        this.f129284a.getPosTan(this.f129285b * floatValue, this.f129286c, null);
        this.f129287d.x = this.f129286c[0];
        this.f129287d.y = this.f129286c[1];
        Property<T, PointF> property = this.f129289f;
        if (property != null) {
            property.set(obj, this.f129287d);
        }
    }
}

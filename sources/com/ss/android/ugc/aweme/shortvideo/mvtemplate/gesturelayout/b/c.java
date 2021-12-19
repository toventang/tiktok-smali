package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.d;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<d, float[]> f129275a = new Property<d, float[]>(float[].class, "nonTranslations") {
        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(84851);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(d dVar, float[] fArr) {
            d dVar2 = dVar;
            float[] fArr2 = fArr;
            l.d(fArr2, "");
            System.arraycopy(fArr2, 0, dVar2.f129340a, 0, fArr2.length);
            dVar2.a();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final Property<d, PointF> f129276b = new Property<d, PointF>(PointF.class, "translations") {
        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(84852);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(d dVar, PointF pointF) {
            d dVar2 = dVar;
            PointF pointF2 = pointF;
            l.d(pointF2, "");
            dVar2.f129341b = pointF2.x;
            dVar2.f129342c = pointF2.y;
            dVar2.a();
        }
    };

    static {
        Covode.recordClassIndex(84850);
    }
}

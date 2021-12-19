package androidx.k;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f3308a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f3309b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3310c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f3311d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f3312e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f3313f;

    static {
        Covode.recordClassIndex(1209);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f3313f);
    }

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3308a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f3309b = pathMeasure;
        this.f3310c = pathMeasure.getLength();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f2) {
        Float f3 = f2;
        this.f3313f = f3.floatValue();
        this.f3309b.getPosTan(this.f3310c * f3.floatValue(), this.f3311d, null);
        this.f3312e.x = this.f3311d[0];
        this.f3312e.y = this.f3311d[1];
        this.f3308a.set(obj, this.f3312e);
    }
}

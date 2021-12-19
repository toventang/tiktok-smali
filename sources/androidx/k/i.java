package androidx.k;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

final class i implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    private Rect f3314a;

    static {
        Covode.recordClassIndex(1210);
    }

    i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Rect evaluate(float f2, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i2 = rect3.left + ((int) (((float) (rect4.left - rect3.left)) * f2));
        int i3 = rect3.top + ((int) (((float) (rect4.top - rect3.top)) * f2));
        int i4 = rect3.right + ((int) (((float) (rect4.right - rect3.right)) * f2));
        int i5 = rect3.bottom + ((int) (((float) (rect4.bottom - rect3.bottom)) * f2));
        Rect rect5 = this.f3314a;
        if (rect5 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        rect5.set(i2, i3, i4, i5);
        return this.f3314a;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class o extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final m f1657a;

    static {
        Covode.recordClassIndex(505);
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.f1657a.f1653a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }

    private o(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a94);
        m mVar = new m(this);
        this.f1657a = mVar;
        mVar.a(attributeSet, R.attr.a94);
    }
}

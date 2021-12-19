package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class Space extends View {
    static {
        Covode.recordClassIndex(1271);
    }

    public void draw(Canvas canvas) {
    }

    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i2 : size;
        }
        return Math.min(i2, size);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i2), a(getSuggestedMinimumHeight(), i3));
    }

    private Space(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }
}

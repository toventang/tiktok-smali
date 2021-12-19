package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class p extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final q f1658a;

    static {
        Covode.recordClassIndex(506);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        q qVar = this.f1658a;
        if (qVar.f1660c != null) {
            qVar.f1660c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f1658a;
        Drawable drawable = qVar.f1660c;
        if (drawable != null && drawable.isStateful() && drawable.setState(qVar.f1659b.getDrawableState())) {
            qVar.f1659b.invalidateDrawable(drawable);
        }
    }

    public p(Context context) {
        this(context, null);
    }

    public synchronized void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        q qVar = this.f1658a;
        if (qVar.f1660c != null) {
            int max = qVar.f1659b.getMax();
            int i3 = 1;
            if (max > 1) {
                int intrinsicWidth = qVar.f1660c.getIntrinsicWidth();
                int intrinsicHeight = qVar.f1660c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i2 = intrinsicWidth / 2;
                } else {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i3 = intrinsicHeight / 2;
                }
                qVar.f1660c.setBounds(-i2, -i3, i2, i3);
                float width = ((float) ((qVar.f1659b.getWidth() - qVar.f1659b.getPaddingLeft()) - qVar.f1659b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) qVar.f1659b.getPaddingLeft(), (float) (qVar.f1659b.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    qVar.f1660c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ab6);
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        q qVar = new q(this);
        this.f1658a = qVar;
        qVar.a(attributeSet, i2);
    }
}

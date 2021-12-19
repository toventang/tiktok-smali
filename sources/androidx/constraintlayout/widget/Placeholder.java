package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class Placeholder extends View {

    /* renamed from: a  reason: collision with root package name */
    int f2058a = -1;

    /* renamed from: b  reason: collision with root package name */
    View f2059b;

    /* renamed from: c  reason: collision with root package name */
    int f2060c = 4;

    static {
        Covode.recordClassIndex(620);
    }

    public View getContent() {
        return this.f2059b;
    }

    public int getEmptyVisibility() {
        return this.f2060c;
    }

    public void setEmptyVisibility(int i2) {
        this.f2060c = i2;
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f2058a != i2) {
            View view = this.f2059b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f2059b.getLayoutParams()).aa = false;
                this.f2059b = null;
            }
            this.f2058a = i2;
            if (i2 != -1 && (findViewById = ((View) getParent()).findViewById(i2)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f2060c);
        this.f2058a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.pj, R.attr.sl});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2058a = obtainStyledAttributes.getResourceId(index, this.f2058a);
                } else if (index == 1) {
                    this.f2060c = obtainStyledAttributes.getInt(index, this.f2060c);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }
}

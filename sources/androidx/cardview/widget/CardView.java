package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class CardView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1845e = {16842801};

    /* renamed from: f  reason: collision with root package name */
    private static final e f1846f;

    /* renamed from: a  reason: collision with root package name */
    int f1847a;

    /* renamed from: b  reason: collision with root package name */
    int f1848b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1849c;

    /* renamed from: d  reason: collision with root package name */
    final Rect f1850d;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1851g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1852h;

    /* renamed from: i  reason: collision with root package name */
    private final d f1853i;

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public boolean getPreventCornerOverlap() {
        return this.f1852h;
    }

    public boolean getUseCompatPadding() {
        return this.f1851g;
    }

    public int getContentPaddingBottom() {
        return this.f1849c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1849c.left;
    }

    public int getContentPaddingRight() {
        return this.f1849c.right;
    }

    public int getContentPaddingTop() {
        return this.f1849c.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return f1846f.h(this.f1853i);
    }

    public float getCardElevation() {
        return f1846f.e(this.f1853i);
    }

    public float getMaxCardElevation() {
        return f1846f.a(this.f1853i);
    }

    public float getRadius() {
        return f1846f.d(this.f1853i);
    }

    static {
        Covode.recordClassIndex(565);
        if (Build.VERSION.SDK_INT >= 21) {
            f1846f = new b();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            f1846f = new a();
        }
        f1846f.a();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1846f.a(this.f1853i, colorStateList);
    }

    public void setCardElevation(float f2) {
        f1846f.c(this.f1853i, f2);
    }

    public void setMaxCardElevation(float f2) {
        f1846f.b(this.f1853i, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f1848b = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.f1847a = i2;
        super.setMinimumWidth(i2);
    }

    public void setRadius(float f2) {
        f1846f.a(this.f1853i, f2);
    }

    public void setCardBackgroundColor(int i2) {
        f1846f.a(this.f1853i, ColorStateList.valueOf(i2));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1852h) {
            this.f1852h = z;
            f1846f.g(this.f1853i);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1851g != z) {
            this.f1851g = z;
            f1846f.f(this.f1853i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mm);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        e eVar = f1846f;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.b(this.f1853i)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.c(this.f1853i)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1849c = rect;
        this.f1850d = new Rect();
        AnonymousClass1 r7 = new d() {
            /* class androidx.cardview.widget.CardView.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private Drawable f1855b;

            static {
                Covode.recordClassIndex(566);
            }

            @Override // androidx.cardview.widget.d
            public final Drawable c() {
                return this.f1855b;
            }

            @Override // androidx.cardview.widget.d
            public final View d() {
                return CardView.this;
            }

            @Override // androidx.cardview.widget.d
            public final boolean b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.d
            public final boolean a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.d
            public final void a(Drawable drawable) {
                this.f1855b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.d
            public final void a(int i2, int i3) {
                if (i2 > CardView.this.f1847a) {
                    CardView.super.setMinimumWidth(i2);
                }
                if (i3 > CardView.this.f1848b) {
                    CardView.super.setMinimumHeight(i3);
                }
            }

            @Override // androidx.cardview.widget.d
            public final void a(int i2, int i3, int i4, int i5) {
                CardView.this.f1850d.set(i2, i3, i4, i5);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i2 + cardView.f1849c.left, i3 + CardView.this.f1849c.top, i4 + CardView.this.f1849c.right, i5 + CardView.this.f1849c.bottom);
            }
        };
        this.f1853i = r7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.mg, R.attr.mh, R.attr.mi, R.attr.mj, R.attr.mk, R.attr.ml, R.attr.pr, R.attr.ps, R.attr.pt, R.attr.pu, R.attr.pv}, i2, R.style.f7);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1845e);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.et);
            } else {
                color = getResources().getColor(R.color.es);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1851g = obtainStyledAttributes.getBoolean(7, false);
        this.f1852h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1847a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1848b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f1846f.a(r7, context, valueOf, dimension, dimension2, dimension3);
    }
}

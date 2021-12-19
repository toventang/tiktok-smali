package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Drawable f1278a;

    /* renamed from: b  reason: collision with root package name */
    Drawable f1279b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f1280c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1281d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1282e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1283f;

    /* renamed from: g  reason: collision with root package name */
    private View f1284g;

    /* renamed from: h  reason: collision with root package name */
    private View f1285h;

    /* renamed from: i  reason: collision with root package name */
    private View f1286i;

    /* renamed from: j  reason: collision with root package name */
    private int f1287j;

    static {
        Covode.recordClassIndex(367);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.f1284g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1278a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1279b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1280c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1285h = findViewById(R.id.bx);
        this.f1286i = findViewById(R.id.c7);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1278a;
        if (drawable != null && drawable.isStateful()) {
            this.f1278a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1279b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1279b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1280c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1280c.setState(getDrawableState());
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1283f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setTransitioning(boolean z) {
        int i2;
        this.f1283f = z;
        if (z) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    private static boolean a(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    private static int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(af afVar) {
        View view = this.f1284g;
        if (view != null) {
            removeView(view);
        }
        this.f1284g = afVar;
        if (afVar != null) {
            addView(afVar);
            ViewGroup.LayoutParams layoutParams = afVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            afVar.setAllowCollapse(false);
        }
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1278a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1279b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1280c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1278a && !this.f1281d) {
            return true;
        }
        if (drawable == this.f1279b && this.f1282e) {
            return true;
        }
        if ((drawable != this.f1280c || !this.f1281d) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1278a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1278a);
        }
        this.f1278a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1285h;
            if (view != null) {
                this.f1278a.setBounds(view.getLeft(), this.f1285h.getTop(), this.f1285h.getRight(), this.f1285h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1281d ? !(this.f1278a == null && this.f1279b == null) : this.f1280c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1280c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1280c);
        }
        this.f1280c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1281d && (drawable2 = this.f1280c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1281d ? this.f1278a == null && this.f1279b == null : this.f1280c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1279b;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1279b);
        }
        this.f1279b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1282e && (drawable2 = this.f1279b) != null) {
                drawable2.setBounds(this.f1284g.getLeft(), this.f1284g.getTop(), this.f1284g.getRight(), this.f1284g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1281d ? !(this.f1278a == null && this.f1279b == null) : this.f1280c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f1285h == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i6 = this.f1287j) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1285h != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f1284g;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!a(this.f1285h)) {
                    i4 = b(this.f1285h);
                } else if (!a(this.f1286i)) {
                    i4 = b(this.f1286i);
                } else {
                    i4 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i5 = View.MeasureSpec.getSize(i3);
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + b(this.f1284g), i5));
            }
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v.a(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jc, R.attr.jf, R.attr.jg, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.qt, R.attr.rg, R.attr.ri, R.attr.sh, R.attr.vb, R.attr.vi, R.attr.vs, R.attr.vt, R.attr.vw, R.attr.wo, R.attr.y3, R.attr.a3r, R.attr.a69, R.attr.a7l, R.attr.a7x, R.attr.a7y, R.attr.afx, R.attr.ag0, R.attr.aiy, R.attr.aja});
        boolean z = false;
        this.f1278a = obtainStyledAttributes.getDrawable(0);
        this.f1279b = obtainStyledAttributes.getDrawable(2);
        this.f1287j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.e8j) {
            this.f1281d = true;
            this.f1280c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1281d ? this.f1278a == null && this.f1279b == null : this.f1280c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r6 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }
}

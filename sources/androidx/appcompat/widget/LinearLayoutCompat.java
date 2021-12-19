package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.h.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f1393a;

    /* renamed from: b  reason: collision with root package name */
    private int f1394b;

    /* renamed from: c  reason: collision with root package name */
    private int f1395c;

    /* renamed from: d  reason: collision with root package name */
    private int f1396d;

    /* renamed from: e  reason: collision with root package name */
    private int f1397e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1398f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1399g;

    /* renamed from: h  reason: collision with root package name */
    private float f1400h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f1401i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1402j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1403k;

    /* renamed from: l  reason: collision with root package name */
    private int f1404l;

    /* renamed from: m  reason: collision with root package name */
    private int f1405m;
    private int n;
    private int o;

    static {
        Covode.recordClassIndex(409);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1393a;
    }

    public Drawable getDividerDrawable() {
        return this.f1403k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.f1404l;
    }

    public int getGravity() {
        return this.f1396d;
    }

    public int getOrientation() {
        return this.f1395c;
    }

    public int getShowDividers() {
        return this.n;
    }

    public float getWeightSum() {
        return this.f1400h;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1395c;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        int i2;
        if (this.f1393a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1393a;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f1394b;
                if (this.f1395c == 1 && (i2 = this.f1396d & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1397e) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1397e;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1393a == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void setBaselineAligned(boolean z) {
        this.f1398f = z;
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1399g = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public void setWeightSum(float f2) {
        this.f1400h = Math.max(0.0f, f2);
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: g  reason: collision with root package name */
        public float f1406g;

        /* renamed from: h  reason: collision with root package name */
        public int f1407h = -1;

        static {
            Covode.recordClassIndex(410);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997, 16843137});
            this.f1406g = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f1407h = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void setOrientation(int i2) {
        if (this.f1395c != i2) {
            this.f1395c = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.n) {
            requestLayout();
        }
        this.n = i2;
    }

    public void setGravity(int i2) {
        if (this.f1396d != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1396d = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1396d;
        if ((8388615 & i4) != i3) {
            this.f1396d = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1396d;
        if ((i4 & 112) != i3) {
            this.f1396d = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1393a = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1403k) {
            this.f1403k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1404l = drawable.getIntrinsicWidth();
                this.f1405m = drawable.getIntrinsicHeight();
            } else {
                this.f1404l = 0;
                this.f1405m = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (i2 == 0) {
            if ((this.n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 == getChildCount()) {
            if ((this.n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int left;
        int bottom;
        if (this.f1403k != null) {
            int i5 = 0;
            if (this.f1395c == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i5))) {
                        a(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f1405m);
                    }
                    i5++;
                }
                if (a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f1405m;
                    } else {
                        bottom = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = ar.a(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (a2) {
                        left = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        left = (childAt3.getLeft() - aVar.leftMargin) - this.f1404l;
                    }
                    b(canvas, left);
                }
                i5++;
            }
            if (a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a2) {
                        i2 = childAt4.getLeft() - aVar2.leftMargin;
                        i3 = this.f1404l;
                        i4 = i2 - i3;
                    } else {
                        i4 = childAt4.getRight() + aVar2.rightMargin;
                    }
                } else if (a2) {
                    i4 = getPaddingLeft();
                } else {
                    i2 = getWidth() - getPaddingRight();
                    i3 = this.f1404l;
                    i4 = i2 - i3;
                }
                b(canvas, i4);
            }
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i5 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    aVar.height = i5;
                }
            }
        }
    }

    private void b(Canvas canvas, int i2) {
        this.f1403k.setBounds(i2, getPaddingTop() + this.o, this.f1404l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.f1403k.draw(canvas);
    }

    private void a(Canvas canvas, int i2) {
        this.f1403k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.f1405m + i2);
        this.f1403k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0214, code lost:
        if (r5 < 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0243, code lost:
        if (r8.width == -1) goto L_0x0245;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fc, code lost:
        if (r15 < 0) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        if (r8[3] != -1) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 1200
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.b(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1398f = true;
        this.f1393a = -1;
        this.f1396d = 8388659;
        al a2 = al.a(context, attributeSet, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, R.attr.ri, R.attr.rr, R.attr.a5e, R.attr.ac1}, i2, 0);
        int a3 = a2.a(1, -1);
        if (a3 >= 0) {
            setOrientation(a3);
        }
        int a4 = a2.a(0, -1);
        if (a4 >= 0) {
            setGravity(a4);
        }
        boolean a5 = a2.a(2, true);
        if (!a5) {
            setBaselineAligned(a5);
        }
        this.f1400h = a2.a(4, -1.0f);
        this.f1393a = a2.a(3, -1);
        this.f1399g = a2.a(7, false);
        setDividerDrawable(a2.a(5));
        this.n = a2.a(8, 0);
        this.o = a2.e(6, 0);
        a2.f1549a.recycle();
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    private static void b(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        if (this.f1395c == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i15 = i4 - i2;
            int paddingRight = i15 - getPaddingRight();
            int paddingRight2 = (i15 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i16 = this.f1396d;
            int i17 = i16 & 112;
            int i18 = 8388615 & i16;
            if (i17 == 16) {
                paddingTop = getPaddingTop() + (((i5 - i3) - this.f1397e) / 2);
            } else if (i17 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i5) - i3) - this.f1397e;
            }
            int i19 = 0;
            while (i19 < virtualChildCount) {
                View childAt = getChildAt(i19);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i20 = aVar.f1407h;
                    if (i20 < 0) {
                        i20 = i18;
                    }
                    int a2 = e.a(i20, v.e(this)) & 7;
                    if (a2 == 1) {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + aVar.leftMargin;
                        i12 = aVar.rightMargin;
                        i13 = i11 - i12;
                    } else if (a2 != 5) {
                        i13 = aVar.leftMargin + paddingLeft2;
                    } else {
                        i11 = paddingRight - measuredWidth;
                        i12 = aVar.rightMargin;
                        i13 = i11 - i12;
                    }
                    if (a(i19)) {
                        paddingTop += this.f1405m;
                    }
                    int i21 = paddingTop + aVar.topMargin;
                    b(childAt, i13, i21 + 0, measuredWidth, measuredHeight);
                    paddingTop = i21 + measuredHeight + aVar.bottomMargin + 0;
                    i19 += 0;
                }
                i19++;
                i14 = 8;
            }
            return;
        }
        boolean a3 = ar.a(this);
        int paddingTop2 = getPaddingTop();
        int i22 = i5 - i3;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i23 = this.f1396d;
        int i24 = i23 & 112;
        boolean z2 = this.f1398f;
        int[] iArr = this.f1401i;
        int[] iArr2 = this.f1402j;
        int a4 = e.a(8388615 & i23, v.e(this));
        if (a4 == 1) {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.f1397e) / 2);
        } else if (a4 != 5) {
            paddingLeft = getPaddingLeft();
        } else {
            paddingLeft = ((getPaddingLeft() + i4) - i2) - this.f1397e;
        }
        if (a3) {
            i6 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i25 = 0;
        while (i25 < virtualChildCount2) {
            int i26 = i6 + (i7 * i25);
            View childAt2 = getChildAt(i26);
            if (childAt2 == null) {
                paddingLeft += 0;
                i8 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (!z2 || aVar2.height == -1) {
                        i9 = -1;
                    } else {
                        i9 = childAt2.getBaseline();
                    }
                    int i27 = aVar2.f1407h;
                    if (i27 < 0) {
                        i27 = i24;
                    }
                    int i28 = i27 & 112;
                    if (i28 == 16) {
                        i10 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + aVar2.topMargin) - aVar2.bottomMargin;
                    } else if (i28 == 48) {
                        i10 = aVar2.topMargin + paddingTop2;
                        if (i9 != -1) {
                            i10 += iArr[1] - i9;
                        }
                    } else if (i28 != 80) {
                        i10 = paddingTop2;
                    } else {
                        i10 = (paddingBottom - measuredHeight2) - aVar2.bottomMargin;
                        if (i9 != -1) {
                            i10 -= iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                        }
                    }
                    if (a(i26)) {
                        paddingLeft += this.f1404l;
                    }
                    int i29 = paddingLeft + aVar2.leftMargin;
                    b(childAt2, i29 + 0, i10, measuredWidth2, measuredHeight2);
                    paddingLeft = i29 + measuredWidth2 + aVar2.rightMargin + 0;
                    i25 += 0;
                }
                i8 = 1;
            }
            i25 += i8;
        }
    }
}

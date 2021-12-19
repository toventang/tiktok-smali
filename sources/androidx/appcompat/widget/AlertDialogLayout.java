package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.h.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    static {
        Covode.recordClassIndex(396);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            i4 = i3;
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.eo0) {
                        view = childAt;
                    } else if (id == R.id.a0v) {
                        view2 = childAt;
                    } else if ((id == R.id.ado || id == R.id.ahs) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                int mode2 = View.MeasureSpec.getMode(i2);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i2, 0);
                    paddingTop += view.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i5 = 0;
                }
                if (view2 != null) {
                    view2.measure(i2, 0);
                    View view4 = view2;
                    while (true) {
                        i7 = v.i(view4);
                        if (i7 > 0) {
                            break;
                        }
                        if (!(view4 instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) view4;
                        if (viewGroup.getChildCount() != 1) {
                            break;
                        }
                        view4 = viewGroup.getChildAt(0);
                    }
                    i7 = 0;
                    i6 = view2.getMeasuredHeight() - i7;
                    paddingTop += i7;
                    i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i2, makeMeasureSpec);
                    i8 = view3.getMeasuredHeight();
                    paddingTop += i8;
                    i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
                } else {
                    i8 = 0;
                }
                int i10 = size - paddingTop;
                if (view2 != null) {
                    int i11 = paddingTop - i7;
                    int min = Math.min(i10, i6);
                    if (min > 0) {
                        i10 -= min;
                        i7 += min;
                    }
                    view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                    paddingTop = i11 + view2.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
                }
                if (view3 != null && i10 > 0) {
                    view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i8 + i10, mode));
                    paddingTop = (paddingTop - i8) + view3.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i12 + getPaddingLeft() + getPaddingRight(), i2, i5), View.resolveSizeAndState(paddingTop, i4, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i15 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                i4 = i4;
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i4, 0);
                                aVar.height = i15;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i2, i4);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        if (i11 == 16) {
            paddingTop = getPaddingTop() + (((i5 - i3) - measuredHeight) / 2);
        } else if (i11 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i5) - i3) - measuredHeight;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i6 = 0;
        } else {
            i6 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                int i14 = aVar.f1407h;
                if (i14 < 0) {
                    i14 = i12;
                }
                int a2 = e.a(i14, v.e(this)) & 7;
                if (a2 == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i8 = aVar.rightMargin;
                    i9 = i7 - i8;
                } else if (a2 != 5) {
                    i9 = aVar.leftMargin + paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i8 = aVar.rightMargin;
                    i9 = i7 - i8;
                }
                if (a(i13)) {
                    paddingTop += i6;
                }
                int i15 = paddingTop + aVar.topMargin;
                childAt.layout(i9, i15, measuredWidth + i9, i15 + measuredHeight2);
                paddingTop = i15 + measuredHeight2 + aVar.bottomMargin;
            }
        }
    }
}

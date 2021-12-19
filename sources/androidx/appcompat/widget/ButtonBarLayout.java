package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1380a;

    /* renamed from: b  reason: collision with root package name */
    private int f1381b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f1382c;

    static {
        Covode.recordClassIndex(403);
    }

    private boolean a() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public int getMinimumHeight() {
        return Math.max(this.f1382c, super.getMinimumHeight());
    }

    private int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.f1380a != z) {
            this.f1380a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        int i2;
        int i3;
        setOrientation(z ? 1 : 0);
        if (z) {
            i2 = 5;
        } else {
            i2 = 80;
        }
        setGravity(i2);
        View findViewById = findViewById(R.id.e7u);
        if (findViewById != null) {
            if (z) {
                i3 = 8;
            } else {
                i3 = 4;
            }
            findViewById.setVisibility(i3);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ic});
        this.f1380a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}

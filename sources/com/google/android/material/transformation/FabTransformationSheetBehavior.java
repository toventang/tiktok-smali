package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.h;
import com.google.android.material.a.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private Map<View, Integer> f52694c;

    static {
        Covode.recordClassIndex(32629);
    }

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.a a(Context context, boolean z) {
        int i2;
        if (z) {
            i2 = R.animator.f159873j;
        } else {
            i2 = R.animator.f159872i;
        }
        FabTransformationBehavior.a aVar = new FabTransformationBehavior.a();
        aVar.f52687a = h.a(context, i2);
        aVar.f52688b = new j();
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    public final boolean a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            int i2 = Build.VERSION.SDK_INT;
            if (z) {
                this.f52694c = new HashMap(childCount);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.e) || !(((CoordinatorLayout.e) childAt.getLayoutParams()).f2100a instanceof FabTransformationScrimBehavior)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f52694c;
                        if (map != null && map.containsKey(childAt)) {
                            v.a(childAt, this.f52694c.get(childAt).intValue());
                        }
                    } else {
                        int i4 = Build.VERSION.SDK_INT;
                        this.f52694c.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        v.a(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f52694c = null;
            }
        }
        return super.a(view, view2, z, z2);
    }
}

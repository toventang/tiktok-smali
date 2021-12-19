package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.d.b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.b<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f52665a;

    static {
        Covode.recordClassIndex(32617);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean a(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior() {
    }

    private boolean a(boolean z) {
        if (z) {
            int i2 = this.f52665a;
            if (i2 == 0 || i2 == 2) {
                return true;
            }
            return false;
        } else if (this.f52665a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2;
        b bVar = (b) view2;
        if (!a(bVar.a())) {
            return false;
        }
        if (bVar.a()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f52665a = i2;
        return a((View) bVar, view, bVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, final View view, int i2) {
        final int i3;
        if (!v.v(view)) {
            List<View> b2 = coordinatorLayout.b(view);
            int size = b2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                View view2 = b2.get(i4);
                if (a(coordinatorLayout, view, view2)) {
                    final b bVar = (b) view2;
                    if (bVar != null && a(bVar.a())) {
                        if (bVar.a()) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        this.f52665a = i3;
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            /* class com.google.android.material.transformation.ExpandableBehavior.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(32618);
                            }

                            public final boolean onPreDraw() {
                                view.getViewTreeObserver().removeOnPreDrawListener(this);
                                if (ExpandableBehavior.this.f52665a == i3) {
                                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                                    b bVar = bVar;
                                    expandableBehavior.a((View) bVar, view, bVar.a(), false);
                                }
                                return false;
                            }
                        });
                    }
                } else {
                    i4++;
                }
            }
        }
        return false;
    }
}

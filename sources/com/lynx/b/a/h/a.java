package com.lynx.b.a.h;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import com.lynx.b.a.a.h;

public final class a {
    static {
        Covode.recordClassIndex(34612);
    }

    public static void a(View view, h hVar, final com.lynx.b.a.g.a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                hVar.a().a();
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).a(new AppBarLayout.c() {
                            /* class com.lynx.b.a.h.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(34613);
                            }

                            @Override // com.google.android.material.appbar.AppBarLayout.a
                            public final void a(AppBarLayout appBarLayout, int i2) {
                                boolean z;
                                com.lynx.b.a.g.a aVar = aVar;
                                boolean z2 = true;
                                if (i2 >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (appBarLayout.getTotalScrollRange() + i2 > 0) {
                                    z2 = false;
                                }
                                aVar.a(z, z2);
                            }
                        });
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}

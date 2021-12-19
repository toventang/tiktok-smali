package com.ss.android.ugc.aweme.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import h.f.b.l;

public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114822a = new a((byte) 0);
    private Integer q;

    static {
        Covode.recordClassIndex(73865);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73866);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        l.d(coordinatorLayout, "");
        l.d(v, "");
        l.d(view, "");
        l.d(iArr, "");
        if (Integer.valueOf(view.getId()) == this.q) {
            super.a(coordinatorLayout, v, view, i2, i3, iArr);
        }
    }
}

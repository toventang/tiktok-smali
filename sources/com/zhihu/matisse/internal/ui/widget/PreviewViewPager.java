package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import g.a.a.a.b.a;

public class PreviewViewPager extends ViewPager {
    static {
        Covode.recordClassIndex(103920);
    }

    public PreviewViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
        if (!(view instanceof a)) {
            return super.canScroll(view, z, i2, i3, i4);
        }
        if (((a) view).a(i2) || super.canScroll(view, z, i2, i3, i4)) {
            return true;
        }
        return false;
    }
}

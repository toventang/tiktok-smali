package com.bytedance.scene.d;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;

public final class d implements View.OnApplyWindowInsetsListener {
    static {
        Covode.recordClassIndex(26261);
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).dispatchApplyWindowInsets(windowInsets2);
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}

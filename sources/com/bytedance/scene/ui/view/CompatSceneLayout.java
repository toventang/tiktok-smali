package com.bytedance.scene.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class CompatSceneLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(26384);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        StatusBarView statusBarView = (StatusBarView) findViewById(R.id.dsu);
        if (statusBarView != null) {
            if (statusBarView.getParent() == this) {
                windowInsets = statusBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                throw new IllegalStateException("StatusBarView parent must be " + getClass().getSimpleName());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        NavigationBarView navigationBarView = (NavigationBarView) findViewById(R.id.dsr);
        if (navigationBarView != null) {
            if (navigationBarView.getParent() == this) {
                windowInsets = navigationBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                throw new IllegalStateException("NavigationBarView parent must be " + getClass().getSimpleName());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == statusBarView || childAt == navigationBarView)) {
                windowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (windowInsets.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsets;
    }

    public CompatSceneLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1844);
        MethodCollector.o(1844);
    }
}

package com.bytedance.android.live.uikit.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {
    static {
        Covode.recordClassIndex(7158);
    }

    private static int a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static View b(Activity activity, int i2) {
        MethodCollector.i(10676);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a(activity)));
        view.setBackgroundColor(i2);
        MethodCollector.o(10676);
        return view;
    }

    public static void a(Activity activity, int i2) {
        MethodCollector.i(10674);
        int i3 = Build.VERSION.SDK_INT;
        activity.getWindow().addFlags(67108864);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(b(activity, i2));
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
        MethodCollector.o(10674);
    }
}

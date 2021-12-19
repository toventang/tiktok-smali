package com.bytedance.ies.uikit.b;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public final class b extends FrameLayout {
    static {
        Covode.recordClassIndex(21180);
    }

    private static void a() {
        if (com.bytedance.ies.uikit.e.b.f35473b != null) {
            new HashMap();
        }
    }

    private static boolean b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void requestLayout() {
        if (!b()) {
            a();
        }
        super.requestLayout();
    }

    public b(Context context) {
        super(context);
        MethodCollector.i(14213);
        MethodCollector.o(14213);
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (!b()) {
            a();
        }
        return super.invalidateChildInParent(iArr, rect);
    }
}

package com.lynx.tasm.behavior.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface a {

    /* renamed from: com.lynx.tasm.behavior.ui.a$a  reason: collision with other inner class name */
    public interface AbstractC1260a {
        static {
            Covode.recordClassIndex(35048);
        }

        void bindDrawChildHook(a aVar);
    }

    static {
        Covode.recordClassIndex(35047);
    }

    void afterDispatchDraw(Canvas canvas);

    void afterDrawChild(Canvas canvas, View view, long j2);

    void beforeDispatchDraw(Canvas canvas);

    Rect beforeDrawChild(Canvas canvas, View view, long j2);

    int getChildDrawingOrder(int i2, int i3);

    boolean hasOverlappingRendering();
}

package com.lynx.tasm.behavior.ui.canvas;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

public class LynxHeliumCanvasView extends TextureView {
    private WeakReference<LynxHeliumCanvas> canvasUI;
    private boolean mConsumeAllEvents;

    static {
        Covode.recordClassIndex(35085);
    }

    public LynxHeliumCanvas getCanvasUI() {
        WeakReference<LynxHeliumCanvas> weakReference = this.canvasUI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LynxHelium.getInstance().onLynxCanvasAttatch(getCanvasUI());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LynxHelium.getInstance().onLynxCanvasDetach(getCanvasUI());
    }

    public void setConsumeAllEvents(boolean z) {
        this.mConsumeAllEvents = z;
    }

    public void setCanvasUI(LynxHeliumCanvas lynxHeliumCanvas) {
        this.canvasUI = new WeakReference<>(lynxHeliumCanvas);
    }

    public LynxHeliumCanvasView(Context context) {
        super(context);
        MethodCollector.i(6487);
        MethodCollector.o(6487);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(this.mConsumeAllEvents);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            LLog.a(5, "LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setBackgroundDrawable(null);
    }

    public void setForeground(Drawable drawable) {
        if (drawable != null) {
            LLog.a(5, "LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setForeground(null);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6488);
        MethodCollector.o(6488);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(6489);
        MethodCollector.o(6489);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        MethodCollector.i(6491);
        MethodCollector.o(6491);
    }
}

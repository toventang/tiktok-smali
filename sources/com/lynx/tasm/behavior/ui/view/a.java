package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.ui.a;

public class a extends ViewGroup implements a.AbstractC1260a {

    /* renamed from: a  reason: collision with root package name */
    private String f56441a;

    /* renamed from: b  reason: collision with root package name */
    private com.lynx.tasm.behavior.ui.a f56442b;

    static {
        Covode.recordClassIndex(35211);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public String getImpressionId() {
        return this.f56441a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean hasOverlappingRendering() {
        com.lynx.tasm.behavior.ui.a aVar = this.f56442b;
        if (aVar != null) {
            return aVar.hasOverlappingRendering();
        }
        return super.hasOverlappingRendering();
    }

    @Override // com.lynx.tasm.behavior.ui.a.AbstractC1260a
    public void bindDrawChildHook(com.lynx.tasm.behavior.ui.a aVar) {
        this.f56442b = aVar;
    }

    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setImpressionId(String str) {
        this.f56441a = str;
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(14330);
        MethodCollector.o(14330);
    }

    public void dispatchDraw(Canvas canvas) {
        com.lynx.tasm.behavior.ui.a aVar = this.f56442b;
        if (aVar != null) {
            aVar.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        com.lynx.tasm.behavior.ui.a aVar2 = this.f56442b;
        if (aVar2 != null) {
            aVar2.afterDispatchDraw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        com.lynx.tasm.behavior.ui.a aVar = this.f56442b;
        if (aVar != null) {
            return aVar.getChildDrawingOrder(i2, i3);
        }
        return super.getChildDrawingOrder(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean drawChild;
        Rect beforeDrawChild;
        com.lynx.tasm.behavior.ui.a aVar = this.f56442b;
        if (aVar == null || (beforeDrawChild = aVar.beforeDrawChild(canvas, view, j2)) == null) {
            drawChild = super.drawChild(canvas, view, j2);
        } else {
            canvas.save();
            canvas.clipRect(beforeDrawChild);
            drawChild = super.drawChild(canvas, view, j2);
            canvas.restore();
        }
        com.lynx.tasm.behavior.ui.a aVar2 = this.f56442b;
        if (aVar2 != null) {
            aVar2.afterDrawChild(canvas, view, j2);
        }
        return drawChild;
    }
}

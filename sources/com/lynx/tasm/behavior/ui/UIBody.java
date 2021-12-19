package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.a;

public class UIBody extends UIGroup<a> {

    /* renamed from: a  reason: collision with root package name */
    public a f56067a;

    /* renamed from: b  reason: collision with root package name */
    public b f56068b;

    static {
        Covode.recordClassIndex(35032);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isStackingContextNode() {
        return true;
    }

    public static class a extends FrameLayout implements a.AbstractC1260a {
        public b mAccessibilityNodeProvider;
        private a mDrawChildHook;
        private boolean mHasMeaningfulLayout;
        private boolean mHasMeaningfulPaint;
        private long mMeaningfulPaintTiming;

        static {
            Covode.recordClassIndex(35036);
        }

        /* access modifiers changed from: package-private */
        public void notifyMeaningfulLayout() {
            this.mHasMeaningfulLayout = true;
        }

        public long getMeaningfulPaintTiming() {
            return this.mMeaningfulPaintTiming;
        }

        /* access modifiers changed from: package-private */
        public void clearMeaningfulFlag() {
            this.mHasMeaningfulLayout = false;
            this.mHasMeaningfulPaint = false;
            this.mMeaningfulPaintTiming = 0;
        }

        @Override // com.lynx.tasm.behavior.ui.a.AbstractC1260a
        public void bindDrawChildHook(a aVar) {
            this.mDrawChildHook = aVar;
        }

        public void setChildrenDrawingOrderEnabled(boolean z) {
            super.setChildrenDrawingOrderEnabled(z);
        }

        public a(Context context) {
            super(context);
            MethodCollector.i(14364);
            MethodCollector.o(14364);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            TraceEvent.a(1, "DispatchDraw");
            a aVar = this.mDrawChildHook;
            if (aVar != null) {
                aVar.beforeDispatchDraw(canvas);
            }
            super.dispatchDraw(canvas);
            a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.afterDispatchDraw(canvas);
            }
            TraceEvent.b(1, "DispatchDraw");
            if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
                TraceEvent.a("FirstMeaningfulPaint", "#0CCE6A");
                this.mMeaningfulPaintTiming = System.currentTimeMillis();
                this.mHasMeaningfulPaint = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
            r3 = r8.getAction();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
            if (r3 == 7) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
            if (r3 == 9) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
            if (r3 == 10) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            r5.f56132e = null;
            r5.a(r4, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            r8.setAction(9);
            r5.a(r4, r8);
            r5.f56132e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
            if (r5.f56132e != null) goto L_0x00b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
            r5.a(r4, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
            r8.setAction(9);
            r5.a(r4, r8);
            r5.f56132e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            if (r4 >= 0) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchHoverEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIBody.a.dispatchHoverEvent(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: protected */
        public int getChildDrawingOrder(int i2, int i3) {
            a aVar = this.mDrawChildHook;
            if (aVar != null) {
                return aVar.getChildDrawingOrder(i2, i3);
            }
            return super.getChildDrawingOrder(i2, i3);
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 2048) {
                accessibilityEvent.setSource(this);
            }
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.i(14382);
            MethodCollector.o(14382);
        }

        /* access modifiers changed from: protected */
        public boolean drawChild(Canvas canvas, View view, long j2) {
            boolean drawChild;
            Rect beforeDrawChild;
            a aVar = this.mDrawChildHook;
            if (aVar == null || (beforeDrawChild = aVar.beforeDrawChild(canvas, view, j2)) == null) {
                drawChild = super.drawChild(canvas, view, j2);
            } else {
                canvas.save();
                canvas.clipRect(beforeDrawChild);
                drawChild = super.drawChild(canvas, view, j2);
                canvas.restore();
            }
            a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.afterDrawChild(canvas, view, j2);
            }
            return drawChild;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public View getRealParentView() {
        return this.f56067a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f56067a.notifyMeaningfulLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeAll() {
        super.removeAll();
        this.f56067a.clearMeaningfulFlag();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void initialize() {
        super.initialize();
        a aVar = this.f56067a;
        if (aVar != null) {
            if (this.f56068b == null) {
                this.f56068b = new b(this);
            }
            aVar.setAccessibilityDelegate(new View.AccessibilityDelegate() {
                /* class com.lynx.tasm.behavior.ui.UIBody.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35035);
                }

                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    return UIBody.this.f56068b;
                }
            });
            aVar.mAccessibilityNodeProvider = this.f56068b;
            this.mAccessibilityElementStatus = 1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* bridge */ /* synthetic */ View createView(Context context) {
        return this.f56067a;
    }

    public UIBody(j jVar, a aVar) {
        super(jVar);
        this.f56067a = aVar;
        initialize();
    }
}

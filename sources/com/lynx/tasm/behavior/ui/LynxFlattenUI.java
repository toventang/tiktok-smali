package com.lynx.tasm.behavior.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.f.a.a;
import com.lynx.tasm.f.a.d;
import com.lynx.tasm.f.a.e;
import com.lynx.tasm.f.a.f;
import com.lynx.tasm.f.a.g;

public class LynxFlattenUI extends LynxBaseUI {

    /* renamed from: a  reason: collision with root package name */
    public float f56064a;

    /* renamed from: b  reason: collision with root package name */
    private a f56065b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56066c;

    static {
        Covode.recordClassIndex(35026);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -1267206133) {
                if (hashCode == 1052666732 && nextKey.equals("transform")) {
                    setTransform(readableMap.getArray(nextKey));
                }
            } else if (nextKey.equals("opacity")) {
                setAlpha(readableMap.isNull(nextKey) ? 1.0f : (float) readableMap.getDouble(nextKey, 1.0d));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationZ() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isFlatten() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void invalidate() {
        this.f56066c = false;
        if (this.mContext.r) {
            if (this.mDrawParent != null) {
                this.mDrawParent.invalidate();
            }
        } else if (this.mParent != null) {
            this.mParent.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.measure();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void requestLayout() {
        this.f56066c = false;
        if (this.mContext.r) {
            if (this.mDrawParent != null) {
                this.mDrawParent.requestLayout();
            }
        } else if (this.mParent != null) {
            this.mParent.requestLayout();
        }
    }

    public LynxFlattenUI(j jVar) {
        this(jVar, (byte) 0);
    }

    @m(a = "opacity", d = 1.0f)
    public void setAlpha(float f2) {
        this.f56064a = f2;
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        invalidate();
    }

    public void c(Canvas canvas) {
        BackgroundDrawable backgroundDrawable = this.mLynxBackground.f56412e;
        if (backgroundDrawable != null) {
            backgroundDrawable.setBounds(0, 0, getWidth(), getHeight());
            backgroundDrawable.draw(canvas);
            if (this.mContext.q) {
                for (LynxBaseUI lynxBaseUI : this.mChildren) {
                    if (lynxBaseUI instanceof LynxFlattenUI) {
                        ((LynxFlattenUI) lynxBaseUI).a(canvas);
                    }
                }
            }
        } else if (this.mContext.q) {
            for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
                if (lynxBaseUI2 instanceof LynxFlattenUI) {
                    ((LynxFlattenUI) lynxBaseUI2).a(canvas);
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        String str = this.mTagName + ".flatten.draw";
        TraceEvent.a(0, str);
        if (this.f56064a <= 0.0f) {
            TraceEvent.b(0, str);
            return;
        }
        int left = getLeft();
        int top = getTop();
        int i2 = 0;
        if (this.f56064a >= 1.0f) {
            if ((left | top) == 0) {
                if (this.mTransformRaw != null) {
                    int save = canvas.save();
                    a(canvas, false);
                    i2 = save;
                }
                c(canvas);
                if (this.mTransformRaw != null) {
                    canvas.restoreToCount(i2);
                }
            } else {
                int save2 = canvas.save();
                a(canvas, true);
                if (getOverflow() != 0) {
                    Rect boundRectForOverflow = getBoundRectForOverflow();
                    if (boundRectForOverflow != null) {
                        canvas.clipRect(boundRectForOverflow);
                    }
                } else {
                    canvas.clipRect(new Rect(0, 0, getWidth(), getHeight()));
                }
                c(canvas);
                canvas.restoreToCount(save2);
            }
        } else if ((left | top) == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (int) (this.f56064a * 255.0f), 31);
            a(canvas, false);
            c(canvas);
            canvas.restore();
        } else {
            a(canvas, true);
            canvas.saveLayerAlpha(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (int) (this.f56064a * 255.0f), 31);
            c(canvas);
            canvas.restore();
            canvas.translate((float) (-left), (float) (-top));
        }
        TraceEvent.b(0, str);
    }

    /* access modifiers changed from: package-private */
    public final void a(Canvas canvas) {
        boolean z = this.f56066c;
        this.f56066c = true;
        if (this.f56065b == null || !canvas.isHardwareAccelerated()) {
            b(canvas);
            return;
        }
        if (!z || !this.f56065b.b()) {
            a aVar = this.f56065b;
            int left = getLeft() + getWidth();
            int top = getTop() + getHeight();
            int overflow = getOverflow();
            if (!(overflow != 3 && (overflow & 1) == 0 && (overflow & 2) == 0)) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mParent;
                if (lynxBaseUI instanceof UIGroup) {
                    UIGroup uIGroup = (UIGroup) lynxBaseUI;
                    left = Math.max(left, uIGroup.getWidth());
                    top = Math.max(top, uIGroup.getHeight());
                    for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        LynxBaseUI childAt = uIGroup.getChildAt(childCount);
                        left = Math.max(left, childAt.getLeft() + childAt.getWidth() + childAt.mMarginRight + uIGroup.mPaddingRight);
                        top = Math.max(top, childAt.getTop() + childAt.getHeight() + childAt.mMarginBottom + uIGroup.mPaddingBottom);
                    }
                }
            }
            aVar.a(left, top);
            Canvas b2 = aVar.b(left, top);
            try {
                b(b2);
            } finally {
                aVar.b(b2);
            }
        }
        if (this.f56065b.b()) {
            this.f56065b.a(canvas);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i2, String str) {
        super.setSign(i2, str);
        if (!this.mContext.s) {
            return;
        }
        if (str.equals("view") || str.equals("component")) {
            this.mOverflow = 3;
        }
    }

    private LynxFlattenUI(j jVar, byte b2) {
        super(jVar, null);
        a dVar;
        this.f56064a = 1.0f;
        if (a.f56603a) {
            if (Build.VERSION.SDK_INT >= 29) {
                dVar = new g();
            } else if (Build.VERSION.SDK_INT >= 23) {
                dVar = new f();
            } else if (Build.VERSION.SDK_INT >= 21) {
                dVar = new e();
            } else {
                int i2 = Build.VERSION.SDK_INT;
                dVar = new d();
            }
            dVar.a();
            this.f56065b = dVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Canvas r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxFlattenUI.a(android.graphics.Canvas, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, android.graphics.Rect r9) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxFlattenUI.a(int, int, android.graphics.Rect):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setTransformData(float f2, float f3, int[] iArr, float[] fArr) {
        super.setTransformData(f2, f3, iArr, fArr);
        invalidate();
    }
}

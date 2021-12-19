package com.lynx.tasm.behavior.ui.text;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.q;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.a.e;
import com.lynx.tasm.behavior.ui.a.g;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.m;

public class FlattenUIText extends LynxFlattenUI {

    /* renamed from: b  reason: collision with root package name */
    private Layout f56352b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56353c;

    /* renamed from: d  reason: collision with root package name */
    private com.lynx.tasm.behavior.ui.a.a f56354d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable.Callback f56355e = new a(this, (byte) 0);

    static {
        Covode.recordClassIndex(35172);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 94842723 && nextKey.equals(b.f37372a)) {
                setColor(readableMap.getDynamic(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        invalidate();
    }

    public final CharSequence a() {
        Layout layout = this.f56352b;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return a();
    }

    class a implements Drawable.Callback {
        static {
            Covode.recordClassIndex(35175);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            if (m.a()) {
                FlattenUIText.this.invalidate();
            }
        }

        /* synthetic */ a(FlattenUIText flattenUIText, byte b2) {
            this();
        }
    }

    public FlattenUIText(j jVar) {
        super(jVar);
        this.mAccessibilityElementStatus = 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public final void c(Canvas canvas) {
        super.c(canvas);
        if (this.f56352b != null) {
            int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
            int i3 = this.mPaddingRight + this.mBorderRightWidth;
            int i4 = this.mPaddingTop + this.mBorderTopWidth;
            int i5 = this.mPaddingBottom + this.mBorderBottomWidth;
            canvas.save();
            if (getOverflow() != 0) {
                Rect boundRectForOverflow = getBoundRectForOverflow();
                if (boundRectForOverflow != null) {
                    canvas.clipRect(boundRectForOverflow);
                }
            } else {
                canvas.clipRect(i2, i4, getWidth() - i3, getHeight() - i5);
            }
            canvas.translate((float) i2, (float) i4);
            com.lynx.tasm.behavior.ui.a.a aVar = this.f56354d;
            if (aVar != null) {
                aVar.setBounds(new Rect(0, 0, this.f56352b.getWidth(), this.f56352b.getHeight()));
                this.f56352b.getPaint().setShader(this.f56354d.f56100a);
            } else {
                this.f56352b.getPaint().setShader(null);
            }
            this.f56352b.draw(canvas);
            canvas.restore();
        }
    }

    @com.lynx.tasm.behavior.m(a = b.f37372a)
    public void setColor(com.lynx.react.bridge.a aVar) {
        if (aVar.h() == ReadableType.Array) {
            ReadableArray f2 = aVar.f();
            if (f2 == null || f2.size() < 2) {
                this.f56354d = null;
            } else {
                int i2 = f2.getInt(0);
                ReadableArray array = f2.getArray(1);
                if (array == null) {
                    this.f56354d = null;
                } else if (i2 == 2) {
                    this.f56354d = new e(array);
                } else if (i2 == 3) {
                    this.f56354d = new g(array);
                }
            }
        } else {
            this.f56354d = null;
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f56353c && (a() instanceof Spanned)) {
                Spanned spanned = (Spanned) a();
                a[] aVarArr = (a[]) spanned.getSpans(0, spanned.length(), a.class);
                for (a aVar : aVarArr) {
                    aVar.b();
                    aVar.a((Drawable.Callback) null);
                }
            }
            this.f56352b = qVar.f56043b;
            boolean z = qVar.f56042a;
            this.f56353c = z;
            if (z && (a() instanceof Spanned)) {
                a.a((Spanned) a(), this.f56355e);
            }
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.behavior.a.a hitTest(float f2, float f3) {
        Spanned spanned;
        Layout layout = this.f56352b;
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            spanned = null;
        } else {
            spanned = (Spanned) layout.getText();
        }
        return b.a(f2, f3, this, layout, spanned);
    }
}

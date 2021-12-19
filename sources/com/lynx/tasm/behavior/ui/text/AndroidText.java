package com.lynx.tasm.behavior.ui.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.text.q;
import com.lynx.tasm.behavior.ui.a.a;
import com.lynx.tasm.behavior.ui.a.e;
import com.lynx.tasm.behavior.ui.a.g;
import com.lynx.tasm.utils.m;

public class AndroidText extends View {
    private a mGradient;
    protected boolean mHasImage;
    private int mOverflow = 0;
    private Picture mOverflowPicture = new Picture();
    private boolean mOverflowPictureDirty = true;
    private Rect mTextBounds = new Rect();
    protected Layout mTextLayout;

    static {
        Covode.recordClassIndex(35171);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public Layout getTextLayout() {
        return this.mTextLayout;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchDetachImageSpan();
    }

    public CharSequence getText() {
        Layout layout = this.mTextLayout;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            a.a((Spanned) getText(), this);
        }
    }

    private void dispatchDetachImageSpan() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            a[] aVarArr = (a[]) spanned.getSpans(0, spanned.length(), a.class);
            for (a aVar : aVarArr) {
                aVar.b();
                aVar.a((Drawable.Callback) null);
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a aVar : (a[]) spanned.getSpans(0, spanned.length(), a.class)) {
                aVar.e();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a aVar : (a[]) spanned.getSpans(0, spanned.length(), a.class)) {
                aVar.c();
            }
        }
    }

    private void drawOverflowPicture() {
        if (this.mOverflowPictureDirty && this.mTextLayout != null) {
            if (this.mOverflowPicture == null) {
                this.mOverflowPicture = new Picture();
            }
            Canvas beginRecording = this.mOverflowPicture.beginRecording(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
            beginRecording.save();
            int i2 = Build.VERSION.SDK_INT;
            if (getClipBounds() != null) {
                beginRecording.clipRect(getClipBounds());
            }
            a aVar = this.mGradient;
            if (aVar != null) {
                aVar.setBounds(this.mTextBounds);
                this.mTextLayout.getPaint().setShader(this.mGradient.f56100a);
            }
            this.mTextLayout.draw(beginRecording);
            beginRecording.restore();
            this.mOverflowPicture.endRecording();
            this.mOverflowPictureDirty = false;
        }
    }

    /* access modifiers changed from: protected */
    public Layout generateTextLayout(q qVar) {
        return qVar.f56043b;
    }

    public void setOverflow(int i2) {
        this.mOverflow = i2;
    }

    public void setTextGradient(String str) {
        LLog.a(6, "text-gradient", "setTextGradient(String) is deprecated, call this function has no effect");
    }

    public AndroidText(Context context) {
        super(context);
        MethodCollector.i(11533);
        setFocusable(true);
        MethodCollector.o(11533);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (m.a()) {
            if (this.mHasImage && (getText() instanceof Spanned)) {
                Spanned spanned = (Spanned) getText();
                for (a aVar : (a[]) spanned.getSpans(0, spanned.length(), a.class)) {
                    if (aVar.a() == drawable) {
                        invalidate();
                        this.mOverflowPictureDirty = true;
                    }
                }
            }
            super.invalidateDrawable(drawable);
        }
    }

    public void setTextGradient(ReadableArray readableArray) {
        if (readableArray == null) {
            this.mGradient = null;
        } else if (readableArray.size() < 2) {
            LLog.a(6, "text-gradient", "native parser error, gradient array is less than 2 element");
        } else {
            int i2 = readableArray.getInt(0);
            ReadableArray array = readableArray.getArray(1);
            if (array == null) {
                LLog.a(6, "text-gradient", "gradient arguments is null");
            } else if (i2 == 2) {
                this.mGradient = new e(array);
            } else if (i2 == 3) {
                this.mGradient = new g(array);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a aVar : (a[]) spanned.getSpans(0, spanned.length(), a.class)) {
                if (aVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mTextLayout != null) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            if (this.mOverflow != 0) {
                drawOverflowPicture();
                canvas.drawPicture(this.mOverflowPicture);
            } else {
                a aVar = this.mGradient;
                if (aVar != null) {
                    aVar.setBounds(this.mTextBounds);
                    this.mTextLayout.getPaint().setShader(this.mGradient.f56100a);
                } else {
                    this.mTextLayout.getPaint().setShader(null);
                }
                this.mTextLayout.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void setTextBundle(q qVar) {
        dispatchDetachImageSpan();
        this.mTextLayout = generateTextLayout(qVar);
        this.mTextBounds = new Rect(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        boolean z = qVar.f56042a;
        this.mHasImage = z;
        if (z && (getText() instanceof Spanned)) {
            a.a((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    public void setTextLayout(Layout layout, boolean z) {
        dispatchDetachImageSpan();
        this.mTextLayout = layout;
        this.mTextBounds = new Rect(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        this.mHasImage = z;
        if (z && (getText() instanceof Spanned)) {
            a.a((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }
}

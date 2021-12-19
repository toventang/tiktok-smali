package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tools.beauty.h.c;

public class SwitchButton extends CompoundButton {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f139234c = {16842912, 16842910, 16842919};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f139235d = {-16842912, 16842910, 16842919};
    private RectF A;
    private RectF B;
    private RectF C;
    private RectF D;
    private Paint E = new Paint(1);
    private boolean F;
    private boolean G;
    private ValueAnimator H;
    private float I;
    private RectF J;
    private float K;
    private float L;
    private float M;
    private int N = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private int O = (ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout());
    private Paint P;
    private CharSequence Q;
    private CharSequence R;
    private TextPaint S;
    private Layout T;
    private Layout U;
    private float V;
    private float W;

    /* renamed from: a  reason: collision with root package name */
    public boolean f139236a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private a ag;
    private CompoundButton.OnCheckedChangeListener ah;

    /* renamed from: b  reason: collision with root package name */
    public boolean f139237b;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f139238e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f139239f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f139240g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f139241h;

    /* renamed from: i  reason: collision with root package name */
    private float f139242i;

    /* renamed from: j  reason: collision with root package name */
    private float f139243j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f139244k;

    /* renamed from: l  reason: collision with root package name */
    private float f139245l;

    /* renamed from: m  reason: collision with root package name */
    private long f139246m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private Drawable x;
    private Drawable y;
    private RectF z;

    public float getThumbHeight() {
        return (float) this.p;
    }

    public float getThumbWidth() {
        return (float) this.o;
    }

    private float getProgress() {
        return this.I;
    }

    public long getAnimationDuration() {
        return this.f139246m;
    }

    public ColorStateList getBackColor() {
        return this.f139240g;
    }

    public Drawable getBackDrawable() {
        return this.f139239f;
    }

    public float getBackRadius() {
        return this.f139243j;
    }

    public CharSequence getTextOff() {
        return this.R;
    }

    public CharSequence getTextOn() {
        return this.Q;
    }

    public ColorStateList getThumbColor() {
        return this.f139241h;
    }

    public Drawable getThumbDrawable() {
        return this.f139238e;
    }

    public RectF getThumbMargin() {
        return this.f139244k;
    }

    public float getThumbRadius() {
        return this.f139242i;
    }

    public float getThumbRangeRatio() {
        return this.f139245l;
    }

    public int getTintColor() {
        return this.n;
    }

    final class a implements Runnable {
        static {
            Covode.recordClassIndex(91043);
        }

        public final void run() {
            SwitchButton.this.setPressed(false);
        }

        private a() {
        }

        /* synthetic */ a(SwitchButton switchButton, byte b2) {
            this();
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(91042);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        CharSequence f139247a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f139248b;

        static {
            Covode.recordClassIndex(91041);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f139247a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f139248b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f139247a, parcel, i2);
            TextUtils.writeToParcel(this.f139248b, parcel, i2);
        }
    }

    private boolean getStatusBasedOnPos() {
        if (getProgress() > 0.5f) {
            return true;
        }
        return false;
    }

    public PointF getBackSizeF() {
        return new PointF(this.A.width(), this.A.height());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f139247a = this.Q;
        savedState.f139248b = this.R;
        return savedState;
    }

    static {
        Covode.recordClassIndex(91040);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int[] iArr;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.F || (colorStateList2 = this.f139241h) == null) {
            setDrawableState(this.f139238e);
        } else {
            this.s = colorStateList2.getColorForState(getDrawableState(), this.s);
        }
        if (isChecked()) {
            iArr = f139235d;
        } else {
            iArr = f139234c;
        }
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.v = textColors.getColorForState(f139234c, defaultColor);
            this.w = textColors.getColorForState(f139235d, defaultColor);
        }
        if (this.G || (colorStateList = this.f139240g) == null) {
            Drawable drawable = this.f139239f;
            if (!(drawable instanceof StateListDrawable) || !this.f139236a) {
                this.y = null;
            } else {
                drawable.setState(iArr);
                this.y = this.f139239f.getCurrent().mutate();
            }
            setDrawableState(this.f139239f);
            Drawable drawable2 = this.f139239f;
            if (drawable2 != null) {
                this.x = drawable2.getCurrent().mutate();
                return;
            }
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), this.t);
        this.t = colorForState;
        this.u = this.f139240g.getColorForState(iArr, colorForState);
    }

    private void a() {
        int i2;
        float paddingTop;
        float paddingLeft;
        int i3 = this.o;
        if (i3 != 0 && (i2 = this.p) != 0 && this.q != 0 && this.r != 0) {
            if (this.f139242i == -1.0f) {
                this.f139242i = ((float) Math.min(i3, i2)) / 2.0f;
            }
            if (this.f139243j == -1.0f) {
                this.f139243j = ((float) Math.min(this.q, this.r)) / 2.0f;
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int ceil = (int) Math.ceil((double) ((((float) this.q) - Math.min(0.0f, this.f139244k.left)) - Math.min(0.0f, this.f139244k.right)));
            int ceil2 = (int) Math.ceil((double) ((((float) this.r) - Math.min(0.0f, this.f139244k.top)) - Math.min(0.0f, this.f139244k.bottom)));
            if (measuredHeight <= ceil2) {
                paddingTop = ((float) getPaddingTop()) + Math.max(0.0f, this.f139244k.top);
            } else {
                paddingTop = (((float) ((measuredHeight - ceil2) + 1)) / 2.0f) + ((float) getPaddingTop()) + Math.max(0.0f, this.f139244k.top);
            }
            if (measuredWidth <= this.q) {
                paddingLeft = ((float) getPaddingLeft()) + Math.max(0.0f, this.f139244k.left);
            } else {
                paddingLeft = (((float) ((measuredWidth - ceil) + 1)) / 2.0f) + ((float) getPaddingLeft()) + Math.max(0.0f, this.f139244k.left);
            }
            this.z.set(paddingLeft, paddingTop, ((float) this.o) + paddingLeft, ((float) this.p) + paddingTop);
            float f2 = this.z.left - this.f139244k.left;
            this.A.set(f2, this.z.top - this.f139244k.top, ((float) this.q) + f2, (this.z.top - this.f139244k.top) + ((float) this.r));
            this.B.set(this.z.left, 0.0f, (this.A.right - this.f139244k.right) - this.z.width(), 0.0f);
            this.f139243j = Math.min(Math.min(this.A.width(), this.A.height()) / 2.0f, this.f139243j);
            Drawable drawable = this.f139239f;
            if (drawable != null) {
                drawable.setBounds((int) this.A.left, (int) this.A.top, (int) Math.ceil((double) this.A.right), (int) Math.ceil((double) this.A.bottom));
            }
            if (this.T != null) {
                float width = (this.A.left + (((((this.A.width() + ((float) this.aa)) - ((float) this.o)) - this.f139244k.right) - ((float) this.T.getWidth())) / 2.0f)) - ((float) this.ac);
                float height = this.A.top + ((this.A.height() - ((float) this.T.getHeight())) / 2.0f);
                this.C.set(width, height, ((float) this.T.getWidth()) + width, ((float) this.T.getHeight()) + height);
            }
            if (this.U != null) {
                float width2 = ((this.A.right - (((((this.A.width() + ((float) this.aa)) - ((float) this.o)) - this.f139244k.left) - ((float) this.U.getWidth())) / 2.0f)) - ((float) this.U.getWidth())) + ((float) this.ac);
                float height2 = this.A.top + ((this.A.height() - ((float) this.U.getHeight())) / 2.0f);
                this.D.set(width2, height2, ((float) this.U.getWidth()) + width2, ((float) this.U.getHeight()) + height2);
            }
            this.ae = true;
        }
    }

    public void setAnimationDuration(long j2) {
        this.f139246m = j2;
    }

    public void setFadeBack(boolean z2) {
        this.f139236a = z2;
    }

    public void setDrawDebugRect(boolean z2) {
        this.f139237b = z2;
        invalidate();
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.ah = onCheckedChangeListener;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f139240g = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i2) {
        setBackColor(b.b(getContext(), i2));
    }

    public void setBackDrawableRes(int i2) {
        setBackDrawable(b.a(getContext(), i2));
    }

    public void setBackRadius(float f2) {
        this.f139243j = f2;
        if (!this.G) {
            invalidate();
        }
    }

    public void setTextAdjust(int i2) {
        this.ac = i2;
        this.ae = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i2) {
        this.ab = i2;
        this.ae = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i2) {
        this.aa = i2;
        this.ae = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f139241h = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i2) {
        setThumbColor(b.b(getContext(), i2));
    }

    public void setThumbDrawableRes(int i2) {
        setThumbDrawable(b.a(getContext(), i2));
    }

    public void setThumbRadius(float f2) {
        this.f139242i = f2;
        if (!this.F) {
            invalidate();
        }
    }

    public void setThumbRangeRatio(float f2) {
        this.f139245l = f2;
        this.ae = false;
        requestLayout();
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z2;
        this.f139239f = drawable;
        if (drawable != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.G = z2;
        refreshDrawableState();
        this.ae = false;
        requestLayout();
        invalidate();
    }

    public void setChecked(boolean z2) {
        if (isChecked() != z2) {
            a(z2);
        }
        if (this.ad) {
            setCheckedImmediatelyNoEvent(z2);
        } else {
            super.setChecked(z2);
        }
    }

    public void setCheckedImmediately(boolean z2) {
        float f2;
        super.setChecked(z2);
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H.cancel();
        }
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        setProgress(f2);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z2) {
        if (this.ah == null) {
            setCheckedImmediately(z2);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z2);
        super.setOnCheckedChangeListener(this.ah);
    }

    public void setCheckedNoEvent(boolean z2) {
        if (this.ah == null) {
            setChecked(z2);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z2);
        super.setOnCheckedChangeListener(this.ah);
    }

    /* access modifiers changed from: package-private */
    public void setProgress(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.I = f2;
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z2;
        this.f139238e = drawable;
        if (drawable != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.F = z2;
        refreshDrawableState();
        this.ae = false;
        requestLayout();
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            a(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setTintColor(int i2) {
        this.n = i2;
        this.f139241h = c.a(i2);
        this.f139240g = c.b(this.n);
        this.G = false;
        this.F = false;
        refreshDrawableState();
        invalidate();
    }

    private Layout a(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT <= 23) {
            return null;
        }
        int length = charSequence.length();
        TextPaint textPaint = this.S;
        return StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint))).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(1.1f, 0.0f).setIncludePad(false).build();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        CharSequence charSequence = savedState.f139247a;
        CharSequence charSequence2 = savedState.f139248b;
        this.Q = charSequence;
        this.R = charSequence2;
        this.T = null;
        this.U = null;
        this.ae = false;
        requestLayout();
        invalidate();
        this.ad = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.ad = false;
    }

    private void a(boolean z2) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.H.cancel();
            }
            this.H.setDuration(this.f139246m);
            if (z2) {
                this.H.setFloatValues(this.I, 1.0f);
            } else {
                this.H.setFloatValues(this.I, 0.0f);
            }
            this.H.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r1 != 3) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        Layout layout;
        RectF rectF;
        RectF rectF2;
        float f2;
        int i4;
        Drawable drawable;
        Drawable drawable2;
        MethodCollector.i(12189);
        super.onDraw(canvas);
        if (!this.ae) {
            a();
        }
        if (!this.ae) {
            MethodCollector.o(12189);
            return;
        }
        if (this.G) {
            if (!this.f139236a || this.x == null || this.y == null) {
                this.f139239f.setAlpha(255);
                this.f139239f.draw(canvas);
            } else {
                if (isChecked()) {
                    drawable = this.x;
                } else {
                    drawable = this.y;
                }
                if (isChecked()) {
                    drawable2 = this.y;
                } else {
                    drawable2 = this.x;
                }
                int progress = (int) (getProgress() * 255.0f);
                drawable.setAlpha(progress);
                drawable.draw(canvas);
                drawable2.setAlpha(255 - progress);
                drawable2.draw(canvas);
            }
        } else if (this.f139236a) {
            if (isChecked()) {
                i2 = this.t;
            } else {
                i2 = this.u;
            }
            if (isChecked()) {
                i3 = this.u;
            } else {
                i3 = this.t;
            }
            int progress2 = (int) (getProgress() * 255.0f);
            this.E.setARGB((Color.alpha(i2) * progress2) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
            RectF rectF3 = this.A;
            float f3 = this.f139243j;
            canvas.drawRoundRect(rectF3, f3, f3, this.E);
            int alpha = Color.alpha(i3);
            this.E.setARGB((alpha * (255 - progress2)) / 255, Color.red(i3), Color.green(i3), Color.blue(i3));
            RectF rectF4 = this.A;
            float f4 = this.f139243j;
            canvas.drawRoundRect(rectF4, f4, f4, this.E);
            this.E.setAlpha(255);
        } else {
            this.E.setColor(this.t);
            RectF rectF5 = this.A;
            float f5 = this.f139243j;
            canvas.drawRoundRect(rectF5, f5, f5, this.E);
        }
        if (((double) getProgress()) > 0.5d) {
            layout = this.T;
        } else {
            layout = this.U;
        }
        if (((double) getProgress()) > 0.5d) {
            rectF = this.C;
        } else {
            rectF = this.D;
        }
        if (!(layout == null || rectF == null)) {
            if (((double) getProgress()) < 0.25d) {
                f2 = 1.0f - (getProgress() * 4.0f);
            } else {
                f2 = 0.0f;
            }
            if (((double) getProgress()) >= 0.75d) {
                f2 = (getProgress() * 4.0f) - 3.0f;
            }
            int i5 = (int) (f2 * 255.0f);
            if (((double) getProgress()) > 0.5d) {
                i4 = this.v;
            } else {
                i4 = this.w;
            }
            layout.getPaint().setARGB((Color.alpha(i4) * i5) / 255, Color.red(i4), Color.green(i4), Color.blue(i4));
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            layout.draw(canvas);
            canvas.restore();
        }
        this.J.set(this.z);
        this.J.offset(this.I * this.B.width(), 0.0f);
        if (this.F) {
            this.f139238e.setBounds((int) this.J.left, (int) this.J.top, (int) Math.ceil((double) this.J.right), (int) Math.ceil((double) this.J.bottom));
            this.f139238e.draw(canvas);
        } else {
            this.E.setColor(this.s);
            RectF rectF6 = this.J;
            float f6 = this.f139242i;
            canvas.drawRoundRect(rectF6, f6, f6, this.E);
        }
        if (this.f139237b) {
            this.P.setColor(Color.parseColor("#AA0000"));
            canvas.drawRect(this.A, this.P);
            this.P.setColor(Color.parseColor("#0000FF"));
            canvas.drawRect(this.J, this.P);
            this.P.setColor(Color.parseColor("#000000"));
            canvas.drawLine(this.B.left, this.z.top, this.B.right, this.z.top, this.P);
            this.P.setColor(Color.parseColor("#00CC00"));
            if (((double) getProgress()) > 0.5d) {
                rectF2 = this.C;
            } else {
                rectF2 = this.D;
            }
            canvas.drawRect(rectF2, this.P);
        }
        MethodCollector.o(12189);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchButton(android.content.Context r26, android.util.AttributeSet r27) {
        /*
        // Method dump skipped, instructions count: 716
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.T == null && !TextUtils.isEmpty(this.Q)) {
            this.T = a(this.Q);
        }
        if (this.U == null && !TextUtils.isEmpty(this.R)) {
            this.U = a(this.R);
        }
        Layout layout = this.T;
        if (layout != null) {
            f2 = (float) layout.getWidth();
        } else {
            f2 = 0.0f;
        }
        Layout layout2 = this.U;
        if (layout2 != null) {
            f3 = (float) layout2.getWidth();
        } else {
            f3 = 0.0f;
        }
        if (f2 == 0.0f && f3 == 0.0f) {
            this.V = 0.0f;
        } else {
            this.V = Math.max(f2, f3);
        }
        Layout layout3 = this.T;
        if (layout3 != null) {
            f4 = (float) layout3.getHeight();
        } else {
            f4 = 0.0f;
        }
        Layout layout4 = this.U;
        if (layout4 != null) {
            f5 = (float) layout4.getHeight();
        } else {
            f5 = 0.0f;
        }
        if (f4 == 0.0f && f5 == 0.0f) {
            this.W = 0.0f;
        } else {
            this.W = Math.max(f4, f5);
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (this.o == 0 && this.F) {
            this.o = this.f139238e.getIntrinsicWidth();
        }
        int ceil = (int) Math.ceil((double) this.V);
        if (this.f139245l == 0.0f) {
            this.f139245l = 1.8f;
        }
        if (mode == 1073741824) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = this.o;
            if (i4 != 0) {
                int ceil2 = (int) Math.ceil((double) (((float) i4) * this.f139245l));
                int ceil3 = (this.ab + ceil) - ((ceil2 - this.o) + ((int) Math.ceil((double) Math.max(this.f139244k.left, this.f139244k.right))));
                float f6 = (float) ceil2;
                int ceil4 = (int) Math.ceil((double) (this.f139244k.left + f6 + this.f139244k.right + ((float) Math.max(ceil3, 0))));
                this.q = ceil4;
                if (ceil4 < 0) {
                    this.o = 0;
                }
                if (f6 + Math.max(this.f139244k.left, 0.0f) + Math.max(this.f139244k.right, 0.0f) + ((float) Math.max(ceil3, 0)) > ((float) paddingLeft)) {
                    this.o = 0;
                }
            }
            int ceil5 = (int) Math.ceil((double) ((((float) ((size - getPaddingLeft()) - getPaddingRight())) - Math.max(this.f139244k.left, 0.0f)) - Math.max(this.f139244k.right, 0.0f)));
            if (ceil5 < 0) {
                this.o = 0;
                this.q = 0;
            } else {
                float f7 = (float) ceil5;
                this.o = (int) Math.ceil((double) (f7 / this.f139245l));
                int ceil6 = (int) Math.ceil((double) (f7 + this.f139244k.left + this.f139244k.right));
                this.q = ceil6;
                if (ceil6 < 0) {
                    this.o = 0;
                    this.q = 0;
                } else {
                    int ceil7 = (ceil + this.ab) - ((ceil5 - this.o) + ((int) Math.ceil((double) Math.max(this.f139244k.left, this.f139244k.right))));
                    if (ceil7 > 0) {
                        this.o -= ceil7;
                    }
                    if (this.o < 0) {
                        this.o = 0;
                        this.q = 0;
                    }
                }
            }
        } else {
            if (this.o == 0) {
                this.o = (int) Math.ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
            }
            if (this.f139245l == 0.0f) {
                this.f139245l = 1.8f;
            }
            int ceil8 = (int) Math.ceil((double) (((float) this.o) * this.f139245l));
            int ceil9 = (int) Math.ceil((double) (((float) (ceil + this.ab)) - ((((float) (ceil8 - this.o)) + Math.max(this.f139244k.left, this.f139244k.right)) + ((float) this.aa))));
            float f8 = (float) ceil8;
            int ceil10 = (int) Math.ceil((double) (this.f139244k.left + f8 + this.f139244k.right + ((float) Math.max(0, ceil9))));
            this.q = ceil10;
            if (ceil10 < 0) {
                this.o = 0;
                this.q = 0;
            } else {
                int ceil11 = (int) Math.ceil((double) (f8 + Math.max(0.0f, this.f139244k.left) + Math.max(0.0f, this.f139244k.right) + ((float) Math.max(0, ceil9))));
                size = Math.max(ceil11, getPaddingLeft() + ceil11 + getPaddingRight());
            }
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.p == 0 && this.F) {
            this.p = this.f139238e.getIntrinsicHeight();
        }
        if (mode2 == 1073741824) {
            int i5 = this.p;
            if (i5 != 0) {
                int ceil12 = (int) Math.ceil((double) (((float) i5) + this.f139244k.top + this.f139244k.bottom));
                this.r = ceil12;
                int ceil13 = (int) Math.ceil((double) Math.max((float) ceil12, this.W));
                this.r = ceil13;
                if ((((float) ((ceil13 + getPaddingTop()) + getPaddingBottom())) - Math.min(0.0f, this.f139244k.top)) - Math.min(0.0f, this.f139244k.bottom) > ((float) size2)) {
                    this.p = 0;
                }
            }
            int ceil14 = (int) Math.ceil((double) (((float) ((size2 - getPaddingTop()) - getPaddingBottom())) + Math.min(0.0f, this.f139244k.top) + Math.min(0.0f, this.f139244k.bottom)));
            this.r = ceil14;
            if (ceil14 < 0) {
                this.r = 0;
                this.p = 0;
            } else {
                int ceil15 = (int) Math.ceil((double) ((((float) ceil14) - this.f139244k.top) - this.f139244k.bottom));
                this.p = ceil15;
                if (ceil15 < 0) {
                    this.r = 0;
                    this.p = 0;
                }
            }
        } else {
            if (this.p == 0) {
                this.p = (int) Math.ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
            }
            int ceil16 = (int) Math.ceil((double) (((float) this.p) + this.f139244k.top + this.f139244k.bottom));
            this.r = ceil16;
            if (ceil16 < 0) {
                this.r = 0;
                this.p = 0;
            } else {
                int ceil17 = (int) Math.ceil((double) (this.W - ((float) ceil16)));
                if (ceil17 > 0) {
                    this.r += ceil17;
                    this.p += ceil17;
                }
                int max = Math.max(this.p, this.r);
                size2 = Math.max(Math.max(max, getPaddingTop() + max + getPaddingBottom()), getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    private void a(float f2, float f3, float f4, float f5) {
        this.f139244k.set(f2, f3, f4, f5);
        this.ae = false;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            a();
        }
    }
}

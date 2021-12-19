package com.bytedance.android.live.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.core.graphics.drawable.a;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.android.live.design.c;
import com.bytedance.android.live.design.widget.b.b;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveButton extends ShapeControllableConstraintLayout {
    private Drawable A;
    private boolean B;
    private boolean C;
    private int D;
    private b E;
    private int F;

    /* renamed from: g  reason: collision with root package name */
    public LiveTextView f9560g;

    /* renamed from: h  reason: collision with root package name */
    public ValueAnimator f9561h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9562i;

    /* renamed from: j  reason: collision with root package name */
    public View f9563j;

    /* renamed from: k  reason: collision with root package name */
    public int f9564k;

    /* renamed from: l  reason: collision with root package name */
    public int f9565l;

    /* renamed from: m  reason: collision with root package name */
    private int f9566m;
    private int n;
    private int o;
    private int p;
    private CharSequence q;
    private Drawable r;
    private Drawable s;
    private ColorStateList t;
    private TextView.BufferType u;
    private int v;
    private TextPaint w;
    private Paint x;
    private int y;
    private boolean z;

    static {
        Covode.recordClassIndex(4850);
    }

    public CharSequence getText() {
        return this.q;
    }

    private void d() {
        Drawable drawable = this.s;
        if (drawable != null) {
            a.a(drawable, this.C);
            this.s.invalidateSelf();
        }
    }

    private int getIconExtra() {
        if (this.s == null) {
            return 0;
        }
        return this.f9566m + this.v;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9561h.cancel();
    }

    public final void b() {
        if (this.f9562i) {
            this.f9563j.setVisibility(this.f9564k);
            this.f9560g.setVisibility(this.f9565l);
            this.f9562i = false;
            this.f9561h.cancel();
            invalidate();
        }
    }

    @Override // com.bytedance.android.live.design.widget.tintable.c
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            this.A.invalidateSelf();
        }
        invalidate();
    }

    private void c() {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9560g.getLayoutParams();
        if (this.s == null) {
            i2 = 0;
        } else {
            i2 = this.f9566m + this.v;
        }
        int maxWidth = ((((getMaxWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - i2;
        this.D = maxWidth;
        this.f9560g.setMaxWidth(maxWidth);
    }

    private void e() {
        int i2;
        this.f9560g.setText(this.q, this.u);
        if (TextUtils.isEmpty(this.q)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (this.f9562i) {
            if (i2 == 8) {
                this.f9560g.setVisibility(8);
            }
            this.f9565l = i2;
        } else {
            this.f9560g.setVisibility(i2);
        }
        requestLayout();
    }

    public LiveButton(Context context) {
        this(context, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        c();
    }

    public void setText(CharSequence charSequence) {
        this.q = charSequence;
        e();
    }

    @Override // com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableConstraintLayout
    public void draw(Canvas canvas) {
        boolean a2 = this.E.a(canvas);
        super.draw(canvas);
        b.a(canvas, a2);
    }

    public void setIcon(int i2) {
        setIcon(androidx.appcompat.a.a.a.b(getContext(), i2));
    }

    public void setIconAutoMirrored(boolean z2) {
        if (this.C != z2) {
            this.C = z2;
            d();
        }
    }

    public void setIconSize(int i2) {
        if (i2 != this.f9566m) {
            this.f9566m = i2;
            ViewGroup.LayoutParams layoutParams = this.f9563j.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.f9563j.setLayoutParams(layoutParams);
            c();
            requestLayout();
        }
    }

    public void setText(int i2) {
        this.q = getContext().getResources().getText(i2);
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f9562i && this.A != null) {
            v.g(this);
            canvas.save();
            canvas.translate(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
            canvas.rotate(((Float) this.f9561h.getAnimatedValue()).floatValue());
            this.A.draw(canvas);
            canvas.restore();
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            int i2 = 0;
            if (drawable != null) {
                if (!drawable.isStateful()) {
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{-16842910}, drawable);
                    stateListDrawable.addState(StateSet.WILD_CARD, drawable);
                    this.s = stateListDrawable;
                } else {
                    this.s = drawable;
                }
                d();
                v.a(this.f9563j, this.s);
            } else {
                this.s = null;
                v.a(this.f9563j, (Drawable) null);
                i2 = 8;
            }
            if (this.f9562i) {
                if (i2 == 8) {
                    this.f9563j.setVisibility(8);
                }
                this.f9564k = i2;
            } else {
                this.f9563j.setVisibility(i2);
            }
            c();
            requestLayout();
        }
    }

    public final void b(int i2) {
        if (this.F != i2) {
            this.F = i2;
            d(i2);
            c(i2);
            this.E.a(i2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i2, new int[]{16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, R.attr.is, R.attr.it, R.attr.iv, R.attr.vw, R.attr.vx, R.attr.w3, R.attr.w6, R.attr.a3k});
            a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    private void a(TypedArray typedArray) {
        setMaxWidth(Integer.MAX_VALUE);
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index == 4) {
                Drawable drawable = typedArray.getDrawable(4);
                if (drawable != null) {
                    v.a(this, drawable);
                }
            } else if (index == 5) {
                setPadding(typedArray.getDimensionPixelSize(index, 0), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                c();
            } else if (index == 6) {
                setPadding(getPaddingLeft(), getPaddingTop(), typedArray.getDimensionPixelSize(index, 0), getPaddingBottom());
                c();
            } else if (index == 1) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    h.a(this.f9560g, resourceId);
                }
            } else if (index == 10) {
                setText(typedArray.getText(index));
            } else if (index == 3) {
                ColorStateList a2 = c.a(getContext(), typedArray, index);
                if (a2 != null) {
                    this.f9560g.setTextColor(a2);
                }
            } else if (index == 0) {
                setEnabled(typedArray.getBoolean(index, isEnabled()));
            } else if (index == 14) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    setIcon(androidx.appcompat.a.a.a.b(getContext(), resourceId2));
                } else {
                    setIcon((Drawable) null);
                }
            } else if (index == 17) {
                ColorStateList a3 = c.a(getContext(), typedArray, index);
                this.t = a3;
                if (a3 != null) {
                    v.a(this.f9563j, a3);
                    Drawable drawable2 = this.A;
                    if (drawable2 != null) {
                        a.a(drawable2, this.t);
                    }
                }
            } else if (index == 16) {
                setIconSize(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 9) {
                setMinHeight(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 8) {
                setMinWidth(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 7) {
                setMaxWidth(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
            } else if (index == 12) {
                this.n = typedArray.getDimensionPixelSize(12, 0);
            } else if (index == 11) {
                this.o = typedArray.getDimensionPixelSize(11, 0);
            } else if (index == 13) {
                this.p = typedArray.getDimensionPixelSize(13, 0);
            } else if (index == 18) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(18, 0);
                this.y = dimensionPixelSize;
                this.A.setBounds((-dimensionPixelSize) / 2, (-dimensionPixelSize) / 2, dimensionPixelSize / 2, dimensionPixelSize / 2);
            } else if (index == 15) {
                setIconAutoMirrored(typedArray.getBoolean(15, true));
            }
        }
    }

    public LiveButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StaticLayout a(CharSequence charSequence, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b(charSequence, i2);
        }
        return c(charSequence, i2);
    }

    private static boolean a(Layout layout, CharSequence charSequence) {
        if (layout.getLineCount() == 1 && layout.getLineEnd(layout.getLineCount() - 1) == charSequence.length()) {
            return true;
        }
        return false;
    }

    private StaticLayout c(CharSequence charSequence, int i2) {
        return new StaticLayout(charSequence, this.w, i2, Layout.Alignment.ALIGN_NORMAL, this.f9560g.getLineSpacingMultiplier(), this.f9560g.getLineSpacingExtra(), this.f9560g.getIncludeFontPadding());
    }

    private StaticLayout b(CharSequence charSequence, int i2) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.w, i2).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.f9560g.getLineSpacingExtra(), this.f9560g.getLineSpacingMultiplier()).setIncludePad(this.f9560g.getIncludeFontPadding()).setBreakStrategy(this.f9560g.getBreakStrategy()).setHyphenationFrequency(this.f9560g.getHyphenationFrequency()).setMaxLines(this.f9560g.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        if (r1 != 1) goto L_0x00c3;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 558
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.LiveButton.onMeasure(int, int):void");
    }

    private LiveButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.u = TextView.BufferType.NORMAL;
        this.C = true;
        this.D = Integer.MAX_VALUE;
        this.v = context.getResources().getDimensionPixelSize(R.dimen.u_);
        inflate(context, R.layout.bbe, this);
        this.f9563j = findViewById(R.id.es1);
        this.f9560g = (LiveTextView) findViewById(R.id.et7);
        Drawable b3 = androidx.appcompat.a.a.a.b(getContext(), R.drawable.c1c);
        if (b3 != null) {
            Drawable e2 = a.e(b3);
            this.A = e2;
            e2.mutate();
            this.A.setState(getDrawableState());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f9561h = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f9561h.setDuration(1000L);
        this.f9561h.setInterpolator(new LinearInterpolator());
        this.f9561h.addUpdateListener(new b(this));
        b bVar = new b(this);
        this.E = bVar;
        bVar.a(attributeSet, 0, 0);
        if (attributeSet != null) {
            this.F = attributeSet.getAttributeResourceValue(null, "style", 0);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, R.attr.is, R.attr.it, R.attr.iv, R.attr.vw, R.attr.vx, R.attr.w3, R.attr.w6, R.attr.a3k}, 0, 0);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
